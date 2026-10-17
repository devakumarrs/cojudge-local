"""Command-line entry point: `generate-main.py <problem_dir> [--solved]`."""

import argparse
import os
import sys

from .builder import build_main_java
from .errors import GenerationError
from .java_source import patch_starter_source
from .metadata import load_metadata, read_text, resolve_solution_path, starter_java

RED = "\033[0;31m"
BOLD = "\033[1m"
NC = "\033[0m"


def generate(dir_path, solved):
    """
    Return the Main.java source for `dir_path`.
    Unless `solved`, the problem's Java file is first patched on disk so it compiles.
    """
    metadata = load_metadata(dir_path)
    sol_path, sol_filename, expected_class_name = resolve_solution_path(dir_path, metadata)
    sol_code = read_text(sol_path)

    if solved:
        # Solved implementations are strictly read-only
        if not sol_code:
            raise GenerationError(f"Solved problem is missing '{sol_filename}' on disk.")
    elif sol_code:
        patched = patch_starter_source(sol_code, expected_class_name)
        if patched != sol_code:
            with open(sol_path, "w", encoding="utf-8") as f:
                f.write(patched)
        sol_code = patched
    else:
        sol_code = starter_java(metadata)

    marker_code = read_text(os.path.join(dir_path, "Marker.java"))
    return build_main_java(metadata, sol_code, marker_code)


def main(argv=None):
    parser = argparse.ArgumentParser(
        prog="generate-main.py",
        description="Generate a Main.java test runner for a single CoJudge problem directory.",
    )
    parser.add_argument("problem_dir", help="path to problems/<slug>")
    parser.add_argument(
        "--solved",
        action="store_true",
        help="treat the problem's Java file as read-only (never patch it)",
    )
    args = parser.parse_args(argv)

    dir_path = os.path.abspath(args.problem_dir)
    slug = os.path.basename(dir_path)

    try:
        content = generate(dir_path, args.solved)
    except GenerationError as e:
        print(f"\n{RED}✖ Error in '{BOLD}{slug}{NC}{RED}':\n{e}{NC}", file=sys.stderr)
        return 1

    with open(os.path.join(dir_path, "Main.java"), "w", encoding="utf-8") as f:
        f.write(content)
    return 0
