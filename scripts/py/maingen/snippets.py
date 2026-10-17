"""Loading the Java helper templates from `templates/`."""

from functools import cache
from pathlib import Path

TEMPLATES_DIR = Path(__file__).parent / "templates"

# Data-structure classes that Main.java can supply (with helpers) when a problem uses them
NODE_TYPES = ("TreeNode", "ListNode", "GraphNode")


@cache
def load(name):
    """Return `templates/<name>.java.txt` prefixed with a blank line, ready to join into Main.java."""
    text = (TEMPLATES_DIR / f"{name}.java.txt").read_text(encoding="utf-8")
    return "\n" + text.rstrip("\n")


def test_runner_helpers():
    return load("TestRunnerHelpers")


def node_helpers(node_type):
    """Static builder/printer methods for `node_type` (placed inside `class Main`)."""
    return load(f"{node_type}Helpers")


def node_class(node_type):
    """Top-level class definition for `node_type` (placed after `class Main`)."""
    return load(node_type)
