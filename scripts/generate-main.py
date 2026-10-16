#!/usr/bin/env python3
"""
generate-main.py
----------------
Generates a standalone, compilable `Main.java` test runner for a single CoJudge
problem directory and verifies compilation using `javac -g --release 21`.

Target File Resolution:
  - Reads `classProblem.userClassName` from `metadata.json` (e.g., `Codec`,
    `WordDictionary`, `LRUCache`) and defaults to `Solution` if not present.
  - Uses `<userClassName>.java` as the target problem file on disk (falling back
    to `Solution.java` if an older file name exists).

Execution Modes:
  1. Default / Unsolved Mode (`generate-main.py <problem_dir>`):
     - Patches `<userClassName>.java` on disk if needed (adds `import java.util.*;`,
       strips invalid `public` modifiers from classes not matching the filename,
       and injects dummy return statements into empty starter methods).
     - Generates `Main.java` with up to 2 test cases (`Example 1` & `Example 2`),
       complete with expected vs. actual assertions and ANSI-colored output.
     - Compiles `Main.java` and `<userClassName>.java` with `--release 21` and
       removes all generated `.class` files.

  2. Solved Mode (`generate-main.py <problem_dir> --solved`):
     - Treats `<userClassName>.java` as strictly READ-ONLY (never modifies it).
     - Generates `Main.java` with up to 2 test cases (`Example 1` & `Example 2`),
       complete with expected vs. actual assertions and ANSI-colored output.
     - Verifies that the untouched `<userClassName>.java` and generated
       `Main.java` compile cleanly together under `--release 21`.
"""

import json
import os
import re
import subprocess
import sys

RED = "\033[0;31m"
BOLD = "\033[1m"
NC = "\033[0m"


def fail(slug, reason, main_java_path=None):
    """Delete any partially generated Main.java, print an error, and exit(1)."""
    if main_java_path and os.path.exists(main_java_path):
        os.remove(main_java_path)
    print(f"\n{RED}✖ Error in '{BOLD}{slug}{NC}{RED}':\n{reason}{NC}", file=sys.stderr)
    sys.exit(1)


def strip_comments(code):
    """Remove block (/* ... */) and line (// ...) comments from Java source code."""
    cleaned = re.sub(r"/\*.*?\*/", "", code, flags=re.DOTALL)
    cleaned = re.sub(r"//.*", "", cleaned)
    return cleaned


def clean_java_type(type_str):
    """Strip redundant java.util. and java.lang. prefixes since java.util.* is imported."""
    return re.sub(r"\bjava\.(?:util|lang)\.", "", type_str).strip()


def default_return_value(ret_type):
    """Return a valid Java default literal for a given return type."""
    ret_type = clean_java_type(ret_type)
    if ret_type == "void":
        return ""
    if ret_type in ("int", "long", "short", "byte"):
        return "0"
    if ret_type in ("double", "float"):
        return "0.0"
    if ret_type == "boolean":
        return "false"
    if ret_type == "char":
        return "' '"
    return "null"


def escape_java_string(val):
    """Escape a Python string into a Java string literal (or 'null' if None)."""
    if val is None:
        return "null"
    s = str(val)
    s = (
        s.replace("\\", "\\\\")
        .replace('"', '\\"')
        .replace("\r", "")
        .replace("\n", "\\n")
        .replace("\t", "\\t")
    )
    return f'"{s}"'


def get_target_class_name(metadata):
    """Return `classProblem.userClassName` from metadata.json, defaulting to 'Solution'."""
    class_problem = metadata.get("classProblem", {})
    if isinstance(class_problem, dict):
        user_class = class_problem.get("userClassName")
        if user_class and isinstance(user_class, str) and user_class.strip():
            return user_class.strip()
    return "Solution"


def resolve_solution_path(dir_path, metadata):
    """
    Resolve the problem's Java file path on disk.
    Checks `<userClassName>.java` first, then falls back to `Solution.java`.
    Returns (full_path, filename, base_class_name).
    """
    target_class = get_target_class_name(metadata)
    primary_file = f"{target_class}.java"
    primary_path = os.path.join(dir_path, primary_file)
    if os.path.exists(primary_path):
        return primary_path, primary_file, target_class

    fallback_path = os.path.join(dir_path, "Solution.java")
    if os.path.exists(fallback_path):
        return fallback_path, "Solution.java", "Solution"

    return primary_path, primary_file, target_class


def read_solution_readonly(sol_path):
    """
    Read the problem's Java file from disk without modifying it.
    Used when `--solved` is passed so solved implementations remain untouched.
    """
    if not os.path.exists(sol_path):
        return ""
    with open(sol_path, "r", encoding="utf-8") as f:
        return f.read()


def ensure_solution_compiles(sol_path, expected_class_name):
    """
    Ensure an unsolved problem Java file on disk can be compiled by `javac`:
      1. Prepends `import java.util.*;` if missing.
      2. Strips `public` from top-level classes not matching `expected_class_name`.
      3. Adds a dummy return statement to empty non-void starter methods.
    """
    if not os.path.exists(sol_path):
        return ""

    with open(sol_path, "r", encoding="utf-8") as f:
        code = f.read()

    modified = False
    if "import java.util.*;" not in code:
        code = "import java.util.*;\n\n" + code
        modified = True

    # Strip 'public' from top-level class declarations that do not match the file's class name
    pub_class_pattern = re.compile(rf"\bpublic\s+class\s+(?!{re.escape(expected_class_name)}\b)(\w+)")
    if pub_class_pattern.search(code):
        code = pub_class_pattern.sub(r"class \1", code)
        modified = True

    # Add dummy return statements to empty non-void methods
    pattern = re.compile(
        r"(public\s+([\w<>\[\],\s\?\.]+?)\s+(\w+)\s*\([^)]*\)\s*\{)(\s*)(\})",
        re.MULTILINE,
    )

    def replacer(match):
        nonlocal modified
        header, ret_type, method_name, ws, closing = match.groups()
        ret_type_clean = clean_java_type(ret_type)
        if ret_type_clean in ("void", "class") or method_name == expected_class_name:
            return match.group(0)
        dummy = default_return_value(ret_type_clean)
        modified = True
        return f"{header}\n        return {dummy};\n    {closing}"

    new_code = pattern.sub(replacer, code)
    if modified:
        with open(sol_path, "w", encoding="utf-8") as f:
            f.write(new_code)

    return new_code


def parse_raw_value(raw_val, java_type, slug, param_name):
    """Normalize stringified JSON test values (e.g., '[2,7,11,15]') into Python objects."""
    if isinstance(raw_val, str) and java_type not in ("String", "char"):
        val_str = raw_val.strip()
        if val_str == "null":
            return None
        if (val_str.startswith("[") and val_str.endswith("]")) or (
            val_str.startswith("{") and val_str.endswith("}")
        ):
            try:
                return json.loads(val_str)
            except Exception as e:
                fail(slug, f"Failed to parse JSON test value for '{param_name}': {raw_val} ({e})")
        if java_type in ("int", "long", "double", "boolean", "Integer"):
            try:
                return json.loads(val_str.lower() if java_type == "boolean" else val_str)
            except Exception as e:
                fail(slug, f"Failed to parse primitive test value for '{param_name}': {raw_val} ({e})")
    return raw_val


def to_java_literal(val, java_type, slug, param_name):
    """Convert a Python test value into valid Java initialization syntax."""
    java_type = clean_java_type(java_type)
    val = parse_raw_value(val, java_type, slug, param_name)

    if val is None:
        if (
            java_type in ("Integer", "TreeNode", "ListNode", "GraphNode")
            or java_type.endswith("[]")
            or java_type.startswith("List<")
        ):
            return "null"
        return default_return_value(java_type)

    if java_type == "TreeNode":
        if not isinstance(val, list):
            return "null"
        elems = ", ".join(to_java_literal(x, "Integer", slug, param_name) for x in val)
        return f"buildTree(new Integer[]{{{elems}}})"

    if java_type == "ListNode":
        if not isinstance(val, list):
            return "null"
        elems = ", ".join(to_java_literal(x, "int", slug, param_name) for x in val)
        return f"buildList(new int[]{{{elems}}})"

    if java_type == "GraphNode":
        if not isinstance(val, list):
            return "null"
        adj_2d = to_java_literal(val, "int[][]", slug, param_name)
        return f"buildGraph({adj_2d})"

    try:
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
    except (ValueError, TypeError) as e:
        fail(slug, f"Cannot convert '{val}' to Java type '{java_type}' for parameter '{param_name}' ({e}).")

    # 1D, 2D, and N-D Arrays -> recursive `new T[]{...}` syntax
    if java_type.endswith("[]"):
        inner_type = java_type[:-2]
        if not isinstance(val, list):
            return f"new {java_type}{{}}"
        elems = ", ".join(to_java_literal(x, inner_type, slug, param_name) for x in val)
        return f"new {java_type}{{{elems}}}"

    # List<T> and nested List<List<T>>
    if java_type.startswith("List<") and java_type.endswith(">"):
        inner_type = clean_java_type(java_type[5:-1])
        type_map = {
            "Integer": "int",
            "Long": "long",
            "Double": "double",
            "Boolean": "boolean",
            "Character": "char",
            "String": "String",
            "TreeNode": "TreeNode",
            "ListNode": "ListNode",
            "GraphNode": "GraphNode",
        }
        if not isinstance(val, list):
            return "new ArrayList<>()"
        if inner_type.startswith("List<"):
            elems = ", ".join(to_java_literal(x, inner_type, slug, param_name) for x in val)
            return f"new ArrayList<>(Arrays.asList({elems}))"
        mapped = type_map.get(inner_type, inner_type)
        elems = ", ".join(to_java_literal(x, mapped, slug, param_name) for x in val)
        return f"new ArrayList<>(Arrays.asList({elems}))"

    return "null"


def split_params(params_str, slug):
    """Split a Java parameter declaration string while respecting nested generics."""
    params = []
    current = []
    depth = 0
    for ch in params_str:
        if ch == "<":
            depth += 1
        elif ch == ">":
            depth -= 1
        elif ch == "," and depth == 0:
            param = "".join(current).strip()
            if param:
                params.append(param)
            current = []
            continue
        current.append(ch)
    last = "".join(current).strip()
    if last:
        params.append(last)

    parsed = []
    for p in params:
        parts = p.rsplit(None, 1)
        if len(parts) != 2:
            fail(slug, f"Could not parse parameter declaration: '{p}'")
        parsed.append((clean_java_type(parts[0]), parts[1].strip()))
    return parsed


def extract_all_methods(java_code, class_name, slug):
    """Extract all public non-constructor methods as a list of (ret_type, method_name, params)."""
    cleaned = strip_comments(java_code)
    pattern = r"public\s+([\w<>\[\],\s\?\.]+?)\s+(\w+)\s*\(([^)]*)\)"
    methods = []
    for match in re.finditer(pattern, cleaned):
        ret_type = clean_java_type(match.group(1))
        method_name = match.group(2).strip()
        params_raw = match.group(3).strip()
        if method_name == class_name or ret_type == "class":
            continue
        methods.append((ret_type, method_name, split_params(params_raw, slug)))
    return methods


def extract_signature(java_code, target_func_name, slug):
    """Extract (return_type, method_name, [(param_type, param_name), ...]) from Solution.java."""
    candidates = extract_all_methods(java_code, "Solution", slug)
    for sig in candidates:
        if target_func_name and sig[1] == target_func_name:
            return sig
    return candidates[0] if candidates else None


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


def resolve_example_meta(test_case, example_idx, examples):
    """
    Resolve (input_str, expected_output, explanation) for `test_case`.
    1. Checks `examples[example_idx]` first.
    2. Searches all `examples` if `testCases` and `examples` are ordered differently.
    3. Falls back to `examples[example_idx]` or synthesizes `input_str` from `test_case`.
    """
    fallback_input = ", ".join(f"{k} = {v}" for k, v in test_case.items()) if test_case else ""
    if not isinstance(examples, list) or not examples:
        return fallback_input, None, None

    def _norm(s):
        return re.sub(r"[\s\"']+", "", str(s))

    def _matches(ex):
        if not isinstance(ex, dict) or not test_case:
            return False
        ex_in = _norm(ex.get("input", ""))
        if not ex_in:
            return False
        return all(_norm(v) in ex_in for v in test_case.values() if v is not None)

    chosen = None
    if example_idx < len(examples) and _matches(examples[example_idx]):
        chosen = examples[example_idx]
    else:
        for ex in examples:
            if _matches(ex):
                chosen = ex
                break
        if chosen is None and example_idx < len(examples) and isinstance(examples[example_idx], dict):
            chosen = examples[example_idx]

    if not chosen:
        return fallback_input, None, None

    input_str = chosen.get("input") or fallback_input
    expected_out = chosen.get("output")
    if expected_out is not None:
        expected_out = str(expected_out).strip()
    explanation = chosen.get("explanation")
    if explanation is not None:
        explanation = str(explanation).strip() or None

    return input_str, expected_out, explanation


TEST_RUNNER_HELPERS = """
    // --- Unit Test & Colored Output Helpers ---
    private static int _totalTests = 0;
    private static int _passedTests = 0;

    private static final String RESET  = "\\033[0m";
    private static final String BOLD   = "\\033[1m";
    private static final String DIM    = "\\033[2m";
    private static final String RED    = "\\033[0;31m";
    private static final String GREEN  = "\\033[0;32m";
    private static final String YELLOW = "\\033[1;33m";
    private static final String CYAN   = "\\033[0;36m";

    private static String normalizeOutput(String s) {
        if (s == null) return "null";
        String t = s.trim();
        if (t.length() >= 2 && ((t.startsWith("\\"") && t.endsWith("\\"")) || (t.startsWith("'") && t.endsWith("'")))) {
            t = t.substring(1, t.length() - 1);
        }
        if (t.startsWith("[") && t.endsWith("]")) {
            return t.replaceAll("[\\\\s\\"]+", "");
        }
        return t;
    }

    private static boolean isMatch(String actual, String expected) {
        if (actual == null || expected == null) return actual == expected;
        if (actual.trim().equals(expected.trim())) return true;
        String normActual = normalizeOutput(actual);
        String normExpected = normalizeOutput(expected);
        if (normActual.equals(normExpected)) return true;
        if (normActual.equalsIgnoreCase(normExpected)
                && (normActual.equalsIgnoreCase("true") || normActual.equalsIgnoreCase("false"))) {
            return true;
        }
        try {
            double dActual = Double.parseDouble(normActual);
            double dExpected = Double.parseDouble(normExpected);
            return Math.abs(dActual - dExpected) <= 1e-5;
        } catch (NumberFormatException ignored) {
        }
        return false;
    }

    private static void verifyExample(int exampleNum, String actual, String expected, String input, String explanation) {
        if (exampleNum > 1) System.out.println();
        if (expected == null) {
            System.out.println(BOLD + CYAN + "ℹ Example " + exampleNum + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input  : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual : " + RESET + CYAN + actual + RESET);
            return;
        }

        _totalTests++;
        boolean passed = isMatch(actual, expected);
        if (passed) {
            _passedTests++;
            System.out.println(BOLD + GREEN + "✔ Example " + exampleNum + " PASSED" + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input    : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual   : " + RESET + GREEN + actual + RESET);
            System.out.println("  " + DIM + "Expected : " + RESET + expected);
        } else {
            System.out.println(BOLD + RED + "✘ Example " + exampleNum + " FAILED" + RESET);
            if (input != null && !input.isEmpty()) {
                System.out.println("  " + DIM + "Input       : " + RESET + input);
            }
            System.out.println("  " + BOLD + "Actual      : " + RESET + RED + actual + RESET);
            System.out.println("  " + BOLD + "Expected    : " + RESET + GREEN + expected + RESET);
            if (explanation != null && !explanation.isEmpty()) {
                System.out.println("  " + YELLOW + "💡 Explanation : " + RESET + explanation);
            }
        }
    }

    private static void printTestSummary() {
        if (_totalTests == 0) return;
        System.out.println("\\n" + DIM + "────────────────────────────────────────" + RESET);
        if (_passedTests == _totalTests) {
            System.out.println(BOLD + GREEN + "✔ All " + _passedTests + "/" + _totalTests + " example test(s) passed!" + RESET);
        } else {
            System.out.println(BOLD + RED + "✘ " + _passedTests + "/" + _totalTests + " example test(s) passed." + RESET);
        }
    }"""

TREE_HELPERS = """
    private static TreeNode buildTree(Integer[] vals) {
        if (vals == null || vals.length == 0 || vals[0] == null) return null;
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < vals.length) {
            TreeNode curr = queue.poll();
            if (i < vals.length && vals[i] != null) {
                curr.left = new TreeNode(vals[i]);
                queue.offer(curr.left);
            }
            i++;
            if (i < vals.length && vals[i] != null) {
                curr.right = new TreeNode(vals[i]);
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    private static String treeToString(TreeNode root) {
        if (root == null) return "[]";
        List<String> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                res.add("null");
            } else {
                res.add(String.valueOf(curr.val));
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        while (!res.isEmpty() && res.get(res.size() - 1).equals("null")) {
            res.remove(res.size() - 1);
        }
        return "[" + String.join(", ", res) + "]";
    }"""

TREE_CLASS = """
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}"""

LIST_HELPERS = """
    private static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private static String listToString(ListNode head) {
        List<String> res = new ArrayList<>();
        ListNode curr = head;
        int steps = 0;
        while (curr != null && steps < 10000) {
            res.add(String.valueOf(curr.val));
            curr = curr.next;
            steps++;
        }
        if (curr != null) res.add("...");
        return "[" + String.join(", ", res) + "]";
    }"""

LIST_CLASS = """
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}"""

GRAPH_HELPERS = """
    private static GraphNode buildGraph(int[][] adjList) {
        if (adjList == null || adjList.length == 0) return null;
        Map<Integer, GraphNode> map = new HashMap<>();
        for (int i = 1; i <= adjList.length; i++) {
            map.put(i, new GraphNode(i));
        }
        for (int i = 0; i < adjList.length; i++) {
            GraphNode curr = map.get(i + 1);
            if (adjList[i] != null) {
                for (int neighborVal : adjList[i]) {
                    curr.neighbors.add(map.get(neighborVal));
                }
            }
        }
        return map.get(1);
    }

    private static String graphToString(GraphNode node) {
        if (node == null) return "[]";
        Map<Integer, GraphNode> visited = new TreeMap<>();
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(node);
        visited.put(node.val, node);
        while (!queue.isEmpty()) {
            GraphNode curr = queue.poll();
            for (GraphNode neighbor : curr.neighbors) {
                if (!visited.containsKey(neighbor.val)) {
                    visited.put(neighbor.val, neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= visited.size(); i++) {
            GraphNode n = visited.get(i);
            List<String> neighbors = new ArrayList<>();
            if (n != null) {
                for (GraphNode nb : n.neighbors) {
                    neighbors.add(String.valueOf(nb.val));
                }
            }
            result.add("[" + String.join(",", neighbors) + "]");
        }
        return "[" + String.join(",", result) + "]";
    }"""

GRAPH_CLASS = """
class GraphNode {
    public int val;
    public List<GraphNode> neighbors;
    public GraphNode() {
        val = 0;
        neighbors = new ArrayList<GraphNode>();
    }
    public GraphNode(int _val) {
        val = _val;
        neighbors = new ArrayList<GraphNode>();
    }
    public GraphNode(int _val, List<GraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}"""


def build_main_java(metadata, sol_code, marker_code, slug):
    """Build the complete source code for Main.java using up to 2 test cases."""
    starter_java = sol_code if sol_code.strip() else metadata.get("starterCode", {}).get("java", "")
    uncommented_sol = strip_comments(sol_code)
    func_name = metadata.get("functionName", "")
    raw_test_cases = metadata.get("testCases", [])
    raw_examples = metadata.get("examples", [])

    # Select up to the first 2 valid test cases
    selected_tests = (
        [tc for tc in raw_test_cases if isinstance(tc, dict)][:2]
        if isinstance(raw_test_cases, list)
        else []
    )
    if not selected_tests:
        selected_tests = [{}]

    combined_sources = starter_java + " " + metadata.get("starterCode", {}).get("java", "") + " " + marker_code

    target_class = get_target_class_name(metadata)

    # 1. Design / Custom Class problems (where userClassName != 'Solution' or no 'class Solution')
    if target_class != "Solution" or "class Solution" not in uncommented_sol:
        class_name = target_class
        if class_name == "Solution":
            class_match = re.search(r"class\s+(\w+)", uncommented_sol)
            class_name = class_match.group(1) if class_match else "Solution"

        ctor_match = re.search(rf"(?:public\s+)?\b{re.escape(class_name)}\s*\(([^)]*)\)\s*\{{", uncommented_sol)
        ctor_args = []
        if ctor_match and ctor_match.group(1).strip():
            for p_type, _ in split_params(ctor_match.group(1).strip(), slug):
                ctor_args.append(default_return_value(p_type))

        methods = extract_all_methods(starter_java, class_name, slug)
        if not methods:
            methods = extract_all_methods(metadata.get("starterCode", {}).get("java", ""), class_name, slug)
        method_map = {m_name: (ret_type, m_name, m_params) for ret_type, m_name, m_params in methods}

        # Check if this is a round-trip Codec class (encode/decode or serialize/deserialize)
        round_trip_pair = None
        if "encode" in method_map and "decode" in method_map:
            round_trip_pair = (method_map["encode"], method_map["decode"])
        elif "serialize" in method_map and "deserialize" in method_map:
            round_trip_pair = (method_map["serialize"], method_map["deserialize"])

        sig_types_str = " ".join(
            ret_t + " " + " ".join(pt for pt, _ in mp) for ret_t, _, mp in methods
        )
        all_types_str = sig_types_str + " " + combined_sources

        needs_tree = ("TreeNode" in sig_types_str) or (
            ("TreeNode" in all_types_str) and ("class TreeNode" not in uncommented_sol)
        )
        needs_list = ("ListNode" in sig_types_str) or (
            ("ListNode" in all_types_str) and ("class ListNode" not in uncommented_sol)
        )
        needs_graph = ("GraphNode" in sig_types_str) or (
            ("GraphNode" in all_types_str) and ("class GraphNode" not in uncommented_sol)
        )

        lines = [
            "import java.util.*;",
            "",
            "public class Main {",
            "    public static void main(String[] _cliArgs) {",
        ]

        for example_num, test_case in enumerate(selected_tests, start=1):
            input_str, expected_out, explanation = resolve_example_meta(
                test_case, example_num - 1, raw_examples
            )
            if example_num > 1:
                lines.append("")
            lines.append(f"        // --- Example {example_num} ---")
            lines.append("        {")
            lines.append(f"            {class_name} obj = new {class_name}({', '.join(ctor_args)});")

            if round_trip_pair:
                (enc_ret, enc_name, enc_params), (dec_ret, dec_name, dec_params) = round_trip_pair
                arg_names = []
                test_keys = list(test_case.keys())
                for idx, (p_type, p_name) in enumerate(enc_params):
                    raw_val = test_case.get(p_name, test_case[test_keys[idx]] if idx < len(test_keys) else None)
                    literal = to_java_literal(raw_val, p_type, slug, p_name)
                    lines.append(f"            {p_type} {p_name} = {literal};")
                    arg_names.append(p_name)

                args_joined = ", ".join(arg_names)
                lines.append(f"            {enc_ret} _encoded = obj.{enc_name}({args_joined});")
                lines.append(f"            {dec_ret} _result = obj.{dec_name}(_encoded);")
                actual_expr = format_actual_expr("_result", dec_ret)
                lines.append(
                    f"            verifyExample({example_num}, {actual_expr}, "
                    f"{escape_java_string(expected_out)}, {escape_java_string(input_str)}, "
                    f"{escape_java_string(explanation)});"
                )
            else:
                lines.append(
                    f"            verifyExample({example_num}, String.valueOf(obj), "
                    f"null, {escape_java_string(input_str)}, {escape_java_string(explanation)});"
                )

            lines.append("        }")

        lines.append("")
        lines.append("        printTestSummary();")
        lines.append("    }")
        lines.append(TEST_RUNNER_HELPERS)
        if needs_tree:
            lines.append(TREE_HELPERS)
        if needs_list:
            lines.append(LIST_HELPERS)
        if needs_graph:
            lines.append(GRAPH_HELPERS)
        lines.append("}")
        if needs_tree and "class TreeNode" not in uncommented_sol:
            lines.append(TREE_CLASS)
        if needs_list and "class ListNode" not in uncommented_sol:
            lines.append(LIST_CLASS)
        if needs_graph and "class GraphNode" not in uncommented_sol:
            lines.append(GRAPH_CLASS)
        return "\n".join(lines) + "\n"

    # 2. Standard Solution class problems
    sig = extract_signature(starter_java, func_name, slug)
    if not sig:
        sig = extract_signature(metadata.get("starterCode", {}).get("java", ""), func_name, slug)
    if not sig:
        fail(slug, "Could not find a public method signature inside 'class Solution'.")

    ret_type, method_name, params = sig
    param_names_set = {p_name for _, p_name in params}
    sol_var = "_sol" if "sol" in param_names_set else "sol"
    res_var = "_result" if "result" in param_names_set else "result"

    sig_types_str = ret_type + " " + " ".join(p_type for p_type, _ in params)
    all_types_str = sig_types_str + " " + combined_sources

    needs_tree = ("TreeNode" in sig_types_str) or (
        ("TreeNode" in all_types_str) and ("class TreeNode" not in uncommented_sol)
    )
    needs_list = ("ListNode" in sig_types_str) or (
        ("ListNode" in all_types_str) and ("class ListNode" not in uncommented_sol)
    )
    needs_graph = ("GraphNode" in sig_types_str) or (
        ("GraphNode" in all_types_str) and ("class GraphNode" not in uncommented_sol)
    )

    lines = [
        "import java.util.*;",
        "",
        "public class Main {",
        "    public static void main(String[] _cliArgs) {",
    ]

    for example_num, test_case in enumerate(selected_tests, start=1):
        input_str, expected_out, explanation = resolve_example_meta(
            test_case, example_num - 1, raw_examples
        )
        if example_num > 1:
            lines.append("")
        lines.append(f"        // --- Example {example_num} ---")
        lines.append("        {")
        lines.append(f"            Solution {sol_var} = new Solution();")

        arg_names = []
        test_keys = list(test_case.keys())
        for idx, (p_type, p_name) in enumerate(params):
            if p_name in test_case:
                raw_val = test_case[p_name]
            elif p_name in ("node", "root") and "adjList" in test_case:
                raw_val = test_case["adjList"]
            elif idx < len(test_keys):
                raw_val = test_case[test_keys[idx]]
            else:
                raw_val = None

            literal = to_java_literal(raw_val, p_type, slug, p_name)
            lines.append(f"            {p_type} {p_name} = {literal};")
            arg_names.append(p_name)

        if params:
            lines.append("")

        args_joined = ", ".join(arg_names)
        if ret_type == "void":
            lines.append(f"            {sol_var}.{method_name}({args_joined});")
            if params:
                first_type, first_name = params[0]
                actual_expr = format_actual_expr(first_name, first_type)
                lines.append(
                    f"            verifyExample({example_num}, {actual_expr}, "
                    f"{escape_java_string(expected_out)}, {escape_java_string(input_str)}, "
                    f"{escape_java_string(explanation)});"
                )
        else:
            lines.append(f"            {ret_type} {res_var} = {sol_var}.{method_name}({args_joined});")
            actual_expr = format_actual_expr(res_var, ret_type)
            lines.append(
                f"            verifyExample({example_num}, {actual_expr}, "
                f"{escape_java_string(expected_out)}, {escape_java_string(input_str)}, "
                f"{escape_java_string(explanation)});"
            )

        lines.append("        }")

    lines.append("")
    lines.append("        printTestSummary();")
    lines.append("    }")
    lines.append(TEST_RUNNER_HELPERS)

    if needs_tree:
        lines.append(TREE_HELPERS)
    if needs_list:
        lines.append(LIST_HELPERS)
    if needs_graph:
        lines.append(GRAPH_HELPERS)

    lines.append("}")

    if needs_tree and "class TreeNode" not in uncommented_sol:
        lines.append(TREE_CLASS)
    if needs_list and "class ListNode" not in uncommented_sol:
        lines.append(LIST_CLASS)
    if needs_graph and "class GraphNode" not in uncommented_sol:
        lines.append(GRAPH_CLASS)

    return "\n".join(lines) + "\n"


def compile_in_folder(dir_path, sol_filename, slug, main_java_path, content):
    """Compile Main.java and <userClassName>.java with Java 21 (skipping Marker.java) and remove .class files."""
    java_files = ["Main.java"]
    if os.path.exists(os.path.join(dir_path, sol_filename)):
        java_files.append(sol_filename)

    res = subprocess.run(
        ["javac", "-g", "--release", "21"] + java_files,
        cwd=dir_path,
        capture_output=True,
        text=True,
    )
    for f in os.listdir(dir_path):
        if f.endswith(".class"):
            os.remove(os.path.join(dir_path, f))

    if res.returncode != 0:
        fail(
            slug,
            f"javac --release 21 failed:\n{res.stderr.strip()}\n\nGenerated Main.java:\n{content}",
            main_java_path,
        )


def main():
    if len(sys.argv) < 2:
        print(f"{RED}Usage: generate-main.py <single_problem_dir> [--solved]{NC}", file=sys.stderr)
        sys.exit(1)

    dir_path = os.path.abspath(sys.argv[1])
    is_solved = "--solved" in sys.argv[2:]
    slug = os.path.basename(dir_path)

    metadata_path = os.path.join(dir_path, "metadata.json")
    if not os.path.exists(metadata_path):
        fail(slug, f"metadata.json not found at {metadata_path}")

    try:
        with open(metadata_path, "r", encoding="utf-8") as f:
            metadata = json.load(f)
    except Exception as e:
        fail(slug, f"Failed to parse metadata.json ({e})")

    sol_path, sol_filename, expected_class_name = resolve_solution_path(dir_path, metadata)

    # In --solved mode, never modify the problem's Java file on disk
    if is_solved:
        sol_code = read_solution_readonly(sol_path)
        if not sol_code:
            fail(slug, f"Solved problem is missing '{sol_filename}' on disk.")
    else:
        sol_code = ensure_solution_compiles(sol_path, expected_class_name)
        if not sol_code:
            sol_code = metadata.get("starterCode", {}).get("java", "")

    marker_path = os.path.join(dir_path, "Marker.java")
    marker_code = ""
    if os.path.exists(marker_path):
        with open(marker_path, "r", encoding="utf-8") as f:
            marker_code = f.read()

    content = build_main_java(metadata, sol_code, marker_code, slug)
    main_java_path = os.path.join(dir_path, "Main.java")

    with open(main_java_path, "w", encoding="utf-8") as f:
        f.write(content)

    compile_in_folder(dir_path, sol_filename, slug, main_java_path, content)


if __name__ == "__main__":
    main()