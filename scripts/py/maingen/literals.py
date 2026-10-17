"""Converting JSON test values from metadata.json into Java literal expressions."""

import json

from .errors import GenerationError
from .java_source import clean_java_type, default_return_value

NODE_BUILDERS = {
    # java_type: (builder function, element type, array type)
    "TreeNode": ("buildTree", "Integer", "Integer[]"),
    "ListNode": ("buildList", "int", "int[]"),
}

# Boxed generic element type -> type used for its literal
BOXED_TO_LITERAL_TYPE = {
    "Integer": "int",
    "Long": "long",
    "Double": "double",
    "Boolean": "boolean",
    "Character": "char",
}


def escape_java_string(val):
    """Escape a Python value into a Java string literal (or 'null' if None)."""
    if val is None:
        return "null"
    s = (
        str(val)
        .replace("\\", "\\\\")
        .replace('"', '\\"')
        .replace("\r", "")
        .replace("\n", "\\n")
        .replace("\t", "\\t")
    )
    return f'"{s}"'


def parse_raw_value(raw_val, java_type, param_name):
    """Normalize stringified JSON test values (e.g., '[2,7,11,15]') into Python objects."""
    if not isinstance(raw_val, str) or java_type in ("String", "char"):
        return raw_val

    val_str = raw_val.strip()
    if val_str == "null":
        return None
    if (val_str.startswith("[") and val_str.endswith("]")) or (
        val_str.startswith("{") and val_str.endswith("}")
    ):
        try:
            return json.loads(val_str)
        except Exception as e:
            raise GenerationError(f"Failed to parse JSON test value for '{param_name}': {raw_val} ({e})")
    if java_type in ("int", "long", "double", "boolean", "Integer"):
        try:
            return json.loads(val_str.lower() if java_type == "boolean" else val_str)
        except Exception as e:
            raise GenerationError(f"Failed to parse primitive test value for '{param_name}': {raw_val} ({e})")
    return raw_val


def _scalar_literal(val, java_type):
    """Return the Java literal for a scalar `val`, or None if `java_type` is not scalar."""
    if java_type in ("int", "Integer"):
        return str(int(val))
    if java_type in ("long", "Long"):
        return f"{int(val)}L"
    if java_type in ("double", "Double"):
        return str(float(val))
    if java_type in ("boolean", "Boolean"):
        if isinstance(val, str):
            return "true" if val.lower() == "true" else "false"
        return "true" if bool(val) else "false"
    if java_type in ("char", "Character"):
        s = str(val)
        ch = s[0] if s else " "
        escaped_ch = ch.replace("\\", "\\\\").replace("'", "\\'")
        return f"'{escaped_ch}'"
    if java_type == "String":
        escaped = str(val).replace("\\", "\\\\").replace('"', '\\"').replace("\n", "\\n")
        return f'"{escaped}"'
    return None


def to_java_literal(val, java_type, param_name):
    """Convert a Python test value into valid Java initialization syntax."""
    java_type = clean_java_type(java_type)
    val = parse_raw_value(val, java_type, param_name)

    if val is None:
        if (
            java_type in ("Integer", "TreeNode", "ListNode", "GraphNode")
            or java_type.endswith("[]")
            or java_type.startswith("List<")
        ):
            return "null"
        return default_return_value(java_type)

    if java_type in NODE_BUILDERS:
        if not isinstance(val, list):
            return "null"
        builder, elem_type, array_type = NODE_BUILDERS[java_type]
        elems = ", ".join(to_java_literal(x, elem_type, param_name) for x in val)
        return f"{builder}(new {array_type}{{{elems}}})"

    if java_type == "GraphNode":
        if not isinstance(val, list):
            return "null"
        return f"buildGraph({to_java_literal(val, 'int[][]', param_name)})"

    try:
        scalar = _scalar_literal(val, java_type)
    except (ValueError, TypeError) as e:
        raise GenerationError(
            f"Cannot convert '{val}' to Java type '{java_type}' for parameter '{param_name}' ({e})."
        )
    if scalar is not None:
        return scalar

    # 1D, 2D, and N-D Arrays -> recursive `new T[]{...}` syntax
    if java_type.endswith("[]"):
        if not isinstance(val, list):
            return f"new {java_type}{{}}"
        inner_type = java_type[:-2]
        elems = ", ".join(to_java_literal(x, inner_type, param_name) for x in val)
        return f"new {java_type}{{{elems}}}"

    # List<T> and nested List<List<T>>
    if java_type.startswith("List<") and java_type.endswith(">"):
        if not isinstance(val, list):
            return "new ArrayList<>()"
        inner_type = clean_java_type(java_type[5:-1])
        inner_type = BOXED_TO_LITERAL_TYPE.get(inner_type, inner_type)
        elems = ", ".join(to_java_literal(x, inner_type, param_name) for x in val)
        return f"new ArrayList<>(Arrays.asList({elems}))"

    return "null"


def format_actual_expr(var_name, ret_type):
    """Return a Java String expression representing the value of `var_name`."""
    ret_type = ret_type.strip()
    if ret_type == "TreeNode":
        return f"treeToString({var_name})"
    if ret_type == "ListNode":
        return f"listToString({var_name})"
    if ret_type == "GraphNode":
        return f"graphToString({var_name})"
    if ret_type.endswith("[][]"):
        return f"Arrays.deepToString({var_name})"
    if ret_type.endswith("[]"):
        return f"Arrays.toString({var_name})"
    return f"String.valueOf({var_name})"
