"""Assembling the final `Main.java` source."""

import re

from . import snippets
from .errors import GenerationError
from .examples import resolve_example_meta, select_test_cases
from .java_source import (
    JAVA_UTIL_IMPORT,
    JAVA_UTIL_PATTERN,
    default_return_value,
    extract_all_methods,
    extract_signature,
    find_checker_params,
    find_constructor_params,
    same_type,
    strip_comments,
)
from .literals import escape_java_string, format_actual_expr, to_java_literal
from .metadata import DEFAULT_CLASS_NAME, starter_java, target_class_name

INDENT = " " * 12  # statement indentation inside each `// --- Example N ---` block

# Method pairs whose output round-trips back to the input (e.g., Codec problems)
ROUND_TRIP_PAIRS = (("encode", "decode"), ("serialize", "deserialize"))


def build_main_java(metadata, sol_code, marker_code):
    """Build the complete source code for Main.java using up to 2 test cases."""
    starter = starter_java(metadata)
    source = sol_code if sol_code.strip() else starter
    uncommented_sol = strip_comments(sol_code)
    combined_sources = f"{source} {starter} {marker_code}"
    checker_params = find_checker_params(marker_code)

    target_class = target_class_name(metadata)
    if target_class != DEFAULT_CLASS_NAME or "class Solution" not in uncommented_sol:
        body, sig_types = _design_class_examples(metadata, source, uncommented_sol, target_class, checker_params)
    else:
        body, sig_types = _solution_examples(metadata, source, checker_params)

    node_types = _needed_node_types(sig_types, combined_sources, uncommented_sol)
    return _assemble(body, node_types, uncommented_sol)


def _needed_node_types(sig_types, combined_sources, uncommented_sol):
    """Return the TreeNode/ListNode/GraphNode types whose helpers Main.java must include."""
    all_types = f"{sig_types} {combined_sources}"
    return [
        t
        for t in snippets.NODE_TYPES
        if t in sig_types or (t in all_types and f"class {t}" not in uncommented_sol)
    ]


def _assemble(body_lines, node_types, uncommented_sol):
    lines = [
        "public class Main {",
        "    public static void main(String[] _cliArgs) {",
        *body_lines,
        "",
        "        printTestSummary();",
        "    }",
        snippets.test_runner_helpers(),
        *(snippets.node_helpers(t) for t in node_types),
        "}",
        *(snippets.node_class(t) for t in node_types if f"class {t}" not in uncommented_sol),
    ]
    source = "\n".join(lines) + "\n"
    if JAVA_UTIL_PATTERN.search(source):
        source = f"{JAVA_UTIL_IMPORT}\n\n" + source
    return source


def _verify_call(example_num, correct_expr, actual_expr, expected, input_str, explanation):
    return (
        f"{INDENT}verifyExample({example_num}, {correct_expr}, {actual_expr}, "
        f"{escape_java_string(expected)}, {escape_java_string(input_str)}, "
        f"{escape_java_string(explanation)});"
    )


def _usable_checker(checker_params, input_count, output_type):
    """
    Return `Marker.isCorrect`'s input params if it can judge a call with `input_count`
    arguments returning `output_type`; otherwise None (fall back to text comparison).
    """
    if not checker_params or output_type == "void" or len(checker_params) != input_count + 1:
        return None
    if not same_type(checker_params[-1][0], output_type):
        return None
    return checker_params[:-1]


def _checker_call(checker_inputs, params, test_case, lookup, result_var):
    """
    Return the Java expression running `Marker.isCorrect` on `result_var`.
    Inputs are rebuilt from fresh literals (typed per the checker's signature) because
    the solution may have mutated the originals.
    """
    test_keys = list(test_case.keys())
    args = []
    for idx, ((checker_type, _), (_, p_name)) in enumerate(zip(checker_inputs, params)):
        raw_val = lookup(idx, p_name, test_case, test_keys)
        args.append(to_java_literal(raw_val, checker_type, p_name))
    args.append(result_var)
    return f"runChecker(() -> new Marker().isCorrect({', '.join(args)}))"


def _example_blocks(metadata, render_example):
    """
    Wrap each selected test case in a `// --- Example N ---` block.
    `render_example(example_num, test_case, input_str, expected, explanation)`
    returns the statements inside the block.
    """
    lines = []
    for example_num, test_case in enumerate(select_test_cases(metadata), start=1):
        input_str, expected, explanation = resolve_example_meta(
            test_case, example_num - 1, metadata.get("examples", [])
        )
        if example_num > 1:
            lines.append("")
        lines.append(f"        // --- Example {example_num} ---")
        lines.append("        {")
        lines.extend(render_example(example_num, test_case, input_str, expected, explanation))
        lines.append("        }")
    return lines


def _declare_args(params, test_case, lookup):
    """Declare one local variable per parameter; returns (lines, arg_names)."""
    lines = []
    test_keys = list(test_case.keys())
    for idx, (p_type, p_name) in enumerate(params):
        raw_val = lookup(idx, p_name, test_case, test_keys)
        lines.append(f"{INDENT}{p_type} {p_name} = {to_java_literal(raw_val, p_type, p_name)};")
    return lines, [p_name for _, p_name in params]


def _positional_value(idx, p_name, test_case, test_keys):
    """Look up a test value by parameter name, falling back to the same position."""
    if p_name in test_case:
        return test_case[p_name]
    return test_case[test_keys[idx]] if idx < len(test_keys) else None


def _solution_value(idx, p_name, test_case, test_keys):
    """Like `_positional_value`, but maps graph `node`/`root` params to `adjList`."""
    if p_name not in test_case and p_name in ("node", "root") and "adjList" in test_case:
        return test_case["adjList"]
    return _positional_value(idx, p_name, test_case, test_keys)


def _local_name(name, taken):
    """Return `name`, prefixed with `_` if it would clash with a parameter name."""
    return f"_{name}" if name in taken else name


# --- Standard `class Solution` problems ---------------------------------------


def _solution_examples(metadata, source, checker_params):
    sig = extract_signature(source, metadata.get("functionName", ""))
    if not sig:
        sig = extract_signature(starter_java(metadata), metadata.get("functionName", ""))
    if not sig:
        raise GenerationError("Could not find a public method signature inside 'class Solution'.")

    ret_type, method_name, params = sig
    param_names = {p_name for _, p_name in params}
    sol_var = _local_name("sol", param_names)
    res_var = _local_name("result", param_names)
    correct_var = _local_name("correct", param_names)
    checker_inputs = _usable_checker(checker_params, len(params), ret_type)

    def render(example_num, test_case, input_str, expected, explanation):
        lines = [f"{INDENT}Solution {sol_var} = new Solution();"]
        arg_lines, arg_names = _declare_args(params, test_case, _solution_value)
        lines.extend(arg_lines)
        if params:
            lines.append("")

        call = f"{sol_var}.{method_name}({', '.join(arg_names)})"
        if ret_type == "void":
            lines.append(f"{INDENT}{call};")
            if params:
                # In-place problems: report the (mutated) first argument
                first_type, first_name = params[0]
                actual = format_actual_expr(first_name, first_type)
                lines.append(_verify_call(example_num, "null", actual, expected, input_str, explanation))
            return lines

        lines.append(f"{INDENT}{ret_type} {res_var} = {call};")
        correct_expr = "null"
        if checker_inputs:
            checker = _checker_call(checker_inputs, params, test_case, _solution_value, res_var)
            lines.append(f"{INDENT}boolean {correct_var} = {checker};")
            correct_expr = correct_var
        actual = format_actual_expr(res_var, ret_type)
        lines.append(_verify_call(example_num, correct_expr, actual, expected, input_str, explanation))
        return lines

    sig_types = ret_type + " " + " ".join(p_type for p_type, _ in params)
    return _example_blocks(metadata, render), sig_types


# --- Design / custom class problems (e.g., Codec, LRUCache) -------------------


def _design_class_examples(metadata, source, uncommented_sol, class_name, checker_params):
    if class_name == DEFAULT_CLASS_NAME:
        class_match = re.search(r"class\s+(\w+)", uncommented_sol)
        class_name = class_match.group(1) if class_match else DEFAULT_CLASS_NAME

    ctor_args = [default_return_value(p_type) for p_type, _ in find_constructor_params(uncommented_sol, class_name)]

    methods = extract_all_methods(source, class_name) or extract_all_methods(starter_java(metadata), class_name)
    method_map = {m[1]: m for m in methods}
    round_trip = next(
        ((method_map[a], method_map[b]) for a, b in ROUND_TRIP_PAIRS if a in method_map and b in method_map),
        None,
    )

    def render(example_num, test_case, input_str, expected, explanation):
        lines = [f"{INDENT}{class_name} obj = new {class_name}({', '.join(ctor_args)});"]
        if not round_trip:
            # No automatic checks for general design problems; just show the input
            lines.append(_verify_call(example_num, "null", "String.valueOf(obj)", None, input_str, explanation))
            return lines

        (enc_ret, enc_name, enc_params), (dec_ret, dec_name, _) = round_trip
        arg_lines, arg_names = _declare_args(enc_params, test_case, _positional_value)
        lines.extend(arg_lines)
        lines.append(f"{INDENT}{enc_ret} _encoded = obj.{enc_name}({', '.join(arg_names)});")
        lines.append(f"{INDENT}{dec_ret} _result = obj.{dec_name}(_encoded);")

        correct_expr = "null"
        checker_inputs = _usable_checker(checker_params, len(enc_params), dec_ret)
        if checker_inputs:
            checker = _checker_call(checker_inputs, enc_params, test_case, _positional_value, "_result")
            lines.append(f"{INDENT}boolean _correct = {checker};")
            correct_expr = "_correct"
        actual = format_actual_expr("_result", dec_ret)
        lines.append(_verify_call(example_num, correct_expr, actual, expected, input_str, explanation))
        return lines

    sig_types = " ".join(ret_t + " " + " ".join(pt for pt, _ in mp) for ret_t, _, mp in methods)
    return _example_blocks(metadata, render), sig_types
