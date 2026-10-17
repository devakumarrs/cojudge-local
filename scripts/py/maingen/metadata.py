"""Reading `metadata.json` and resolving the problem's Java file on disk."""

import json
import os

from .errors import GenerationError

DEFAULT_CLASS_NAME = "Solution"


def load_metadata(dir_path):
    """Load and parse `<dir_path>/metadata.json`."""
    metadata_path = os.path.join(dir_path, "metadata.json")
    if not os.path.exists(metadata_path):
        raise GenerationError(f"metadata.json not found at {metadata_path}")
    try:
        with open(metadata_path, "r", encoding="utf-8") as f:
            return json.load(f)
    except Exception as e:
        raise GenerationError(f"Failed to parse metadata.json ({e})")


def starter_java(metadata):
    """Return the Java starter code from metadata.json (or an empty string)."""
    return metadata.get("starterCode", {}).get("java", "")


def target_class_name(metadata):
    """Return `classProblem.userClassName` from metadata.json, defaulting to 'Solution'."""
    class_problem = metadata.get("classProblem", {})
    if isinstance(class_problem, dict):
        user_class = class_problem.get("userClassName")
        if user_class and isinstance(user_class, str) and user_class.strip():
            return user_class.strip()
    return DEFAULT_CLASS_NAME


def resolve_solution_path(dir_path, metadata):
    """
    Resolve the problem's Java file path on disk.
    Checks `<userClassName>.java` first, then falls back to `Solution.java`.
    Returns (full_path, filename, base_class_name).
    """
    target_class = target_class_name(metadata)
    primary_file = f"{target_class}.java"
    primary_path = os.path.join(dir_path, primary_file)
    if os.path.exists(primary_path):
        return primary_path, primary_file, target_class

    fallback_file = f"{DEFAULT_CLASS_NAME}.java"
    fallback_path = os.path.join(dir_path, fallback_file)
    if os.path.exists(fallback_path):
        return fallback_path, fallback_file, DEFAULT_CLASS_NAME

    return primary_path, primary_file, target_class


def read_text(path):
    """Return the file's contents, or an empty string if it does not exist."""
    if not os.path.exists(path):
        return ""
    with open(path, "r", encoding="utf-8") as f:
        return f.read()
