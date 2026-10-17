"""Regex-based Java source inspection and starter-file patching."""

import re

from .errors import GenerationError

# `public <ret_type> <name>(<params>)`
METHOD_PATTERN = re.compile(r"public\s+([\w<>\[\],\s\?\.]+?)\s+(\w+)\s*\(([^)]*)\)")

# `public boolean isCorrect(<inputs...>, <output>)` — the judge's checker in Marker.java
CHECKER_PATTERN = re.compile(r"public\s+(?:static\s+)?boolean\s+isCorrect\s*\(([^)]*)\)")

# java.util types that, if referenced in code, require `import java.util.*;`
JAVA_UTIL_TYPES = (
    "AbstractMap", "ArrayDeque", "ArrayList", "Arrays", "BitSet", "Collection", "Collections",
    "Comparator", "Deque", "HashMap", "HashSet", "Iterator", "LinkedHashMap", "LinkedHashSet",
    "LinkedList", "List", "ListIterator", "Map", "NavigableMap", "NavigableSet", "Objects",
    "Optional", "PriorityQueue", "Queue", "Random", "Scanner", "Set", "SortedMap", "SortedSet",
    "Stack", "StringJoiner", "TreeMap", "TreeSet", "Vector",
)
JAVA_UTIL_PATTERN = re.compile(r"\b(?:" + "|".join(JAVA_UTIL_TYPES) + r")\b")
JAVA_UTIL_IMPORT = "import java.util.*;"

# `public <ret_type> <name>(<params>) {   }` (an empty starter method body)
EMPTY_METHOD_PATTERN = re.compile(
    r"(public\s+([\w<>\[\],\s\?\.]+?)\s+(\w+)\s*\([^)]*\)\s*\{)(\s*)(\})",
    re.MULTILINE,
)


def strip_comments(code):
    """Remove block (/* ... */) and line (// ...) comments from Java source code."""
    cleaned = re.sub(r"/\*.*?\*/", "", code, flags=re.DOTALL)
    cleaned = re.sub(r"//.*", "", cleaned)
    return cleaned


def uses_java_util(code):
    """True if `code` (ignoring comments) references a java.util type."""
    return bool(JAVA_UTIL_PATTERN.search(strip_comments(code)))


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


def split_params(params_str):
    """
    Split a Java parameter declaration string while respecting nested generics.
    Returns [(param_type, param_name), ...].
    """
    params = []
    current = []
    depth = 0
    for ch in params_str:
        if ch == "<":
            depth += 1
        elif ch == ">":
            depth -= 1
        elif ch == "," and depth == 0:
            params.append("".join(current).strip())
            current = []
            continue
        current.append(ch)
    params.append("".join(current).strip())

    parsed = []
    for p in filter(None, params):
        parts = p.rsplit(None, 1)
        if len(parts) != 2:
            raise GenerationError(f"Could not parse parameter declaration: '{p}'")
        parsed.append((clean_java_type(parts[0]), parts[1].strip()))
    return parsed


def extract_all_methods(java_code, class_name):
    """Extract all public non-constructor methods as a list of (ret_type, method_name, params)."""
    methods = []
    for match in METHOD_PATTERN.finditer(strip_comments(java_code)):
        ret_type = clean_java_type(match.group(1))
        method_name = match.group(2).strip()
        if method_name == class_name or ret_type == "class":
            continue
        methods.append((ret_type, method_name, split_params(match.group(3).strip())))
    return methods


def extract_signature(java_code, target_func_name):
    """
    Return the `Solution` method named `target_func_name` as
    (return_type, method_name, [(param_type, param_name), ...]),
    falling back to the first public method found.
    """
    candidates = extract_all_methods(java_code, "Solution")
    for sig in candidates:
        if target_func_name and sig[1] == target_func_name:
            return sig
    return candidates[0] if candidates else None


def same_type(a, b):
    """Compare two Java type strings, ignoring whitespace and java.util/java.lang prefixes."""
    return re.sub(r"\s+", "", clean_java_type(a)) == re.sub(r"\s+", "", clean_java_type(b))


def find_checker_params(marker_code):
    """Return `Marker.isCorrect`'s [(param_type, param_name), ...], or None if absent."""
    match = CHECKER_PATTERN.search(strip_comments(marker_code))
    return split_params(match.group(1).strip()) if match else None


def find_constructor_params(java_code, class_name):
    """Return the constructor's [(param_type, param_name), ...], or [] if none/no-arg."""
    match = re.search(rf"(?:public\s+)?\b{re.escape(class_name)}\s*\(([^)]*)\)\s*\{{", java_code)
    if match and match.group(1).strip():
        return split_params(match.group(1).strip())
    return []


def patch_starter_source(code, expected_class_name):
    """
    Make an unsolved starter file compilable by `javac`:
      1. Prepends `import java.util.*;` only if the starter itself needs it
         (e.g., a `List<...>` signature); imports for code written inside
         methods are left to the developer.
      2. Strips `public` from top-level classes not matching `expected_class_name`.
      3. Adds a dummy return statement to empty non-void starter methods.
    Returns the (possibly unchanged) source.
    """
    if JAVA_UTIL_IMPORT not in code and uses_java_util(code):
        code = f"{JAVA_UTIL_IMPORT}\n\n" + code

    pub_class_pattern = re.compile(rf"\bpublic\s+class\s+(?!{re.escape(expected_class_name)}\b)(\w+)")
    code = pub_class_pattern.sub(r"class \1", code)

    def add_dummy_return(match):
        header, ret_type, method_name, _ws, closing = match.groups()
        ret_type = clean_java_type(ret_type)
        if ret_type in ("void", "class") or method_name == expected_class_name:
            return match.group(0)
        return f"{header}\n        return {default_return_value(ret_type)};\n    {closing}"

    return EMPTY_METHOD_PATTERN.sub(add_dummy_return, code)
