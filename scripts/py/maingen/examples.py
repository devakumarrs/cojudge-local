"""Selecting test cases and pairing them with their human-readable examples."""

import re

MAX_EXAMPLES = 2


def select_test_cases(metadata):
    """Return up to `MAX_EXAMPLES` test-case dicts (or a single empty one if none exist)."""
    raw_test_cases = metadata.get("testCases", [])
    selected = []
    if isinstance(raw_test_cases, list):
        selected = [tc for tc in raw_test_cases if isinstance(tc, dict)][:MAX_EXAMPLES]
    return selected or [{}]


def _normalize(s):
    return re.sub(r"[\s\"']+", "", str(s))


def _example_matches(example, test_case):
    if not isinstance(example, dict) or not test_case:
        return False
    example_input = _normalize(example.get("input", ""))
    if not example_input:
        return False
    return all(_normalize(v) in example_input for v in test_case.values() if v is not None)


def resolve_example_meta(test_case, example_idx, examples):
    """
    Resolve (input_str, expected_output, explanation) for `test_case`.
    1. Checks `examples[example_idx]` first.
    2. Searches all `examples` if `testCases` and `examples` are ordered differently.
    3. Otherwise synthesizes `input_str` from `test_case`, with no expected output or
       explanation (an unmatched example describes a different case).
    """
    fallback_input = ", ".join(f"{k} = {v}" for k, v in test_case.items()) if test_case else ""
    if not isinstance(examples, list) or not examples:
        return fallback_input, None, None

    indexed = examples[example_idx] if example_idx < len(examples) else None
    if _example_matches(indexed, test_case):
        chosen = indexed
    else:
        chosen = next((ex for ex in examples if _example_matches(ex, test_case)), None)

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
