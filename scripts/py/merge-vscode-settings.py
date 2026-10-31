#!/usr/bin/env python3
"""
merge-vscode-settings.py
------------------------
Prints the contents for `.vscode/settings.json`: the tracked base settings
(`.vscode/settings.base.json`, if present) with `java.project.sourcePaths`
scoped to the active problem directory. Top-level string values starting
with `$HOME` or `~` are expanded, since VS Code doesn't expand them.

Usage:
  merge-vscode-settings.py <base_settings_json> <relative_problem_dir>
"""

import json
import os
import sys


def main():
    if len(sys.argv) != 3:
        print(f"Usage: {sys.argv[0]} <base_settings_json> <relative_problem_dir>", file=sys.stderr)
        return 1

    base_path, source_dir = sys.argv[1], sys.argv[2]
    settings = {}
    if os.path.exists(base_path):
        try:
            with open(base_path, encoding="utf-8") as f:
                settings = json.load(f)
        except json.JSONDecodeError as e:
            print(
                f"✖ {base_path} is not valid JSON (comments and trailing commas are not allowed): {e}",
                file=sys.stderr,
            )
            return 1
        if not isinstance(settings, dict):
            print(f"✖ {base_path} must contain a JSON object", file=sys.stderr)
            return 1
    # VS Code doesn't expand $HOME or ~ in settings, so expand them here.
    for key, value in settings.items():
        if isinstance(value, str) and value.startswith(("$HOME", "${HOME}", "~")):
            settings[key] = os.path.expanduser(os.path.expandvars(value))
    settings["java.project.sourcePaths"] = [source_dir]
    print(json.dumps(settings, indent=4, ensure_ascii=False))
    return 0


if __name__ == "__main__":
    sys.exit(main())
