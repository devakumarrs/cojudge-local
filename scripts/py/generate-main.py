#!/usr/bin/env python3
"""
generate-main.py
----------------
Generates a standalone `Main.java` test runner (up to 2 examples, with
ANSI-colored output) for a single CoJudge problem. Results are judged by the
problem's own `Marker.isCorrect` checker (so e.g. "any order" answers pass),
falling back to comparing against the example's expected output as text.
`import java.util.*;` is only emitted when Main.java actually uses java.util.
The implementation lives in the `maingen` package next to this file.

Target File Resolution:
  - Reads `classProblem.userClassName` from `metadata.json` (e.g., `Codec`,
    `WordDictionary`, `LRUCache`) and defaults to `Solution` if not present.
  - Uses `<userClassName>.java` on disk, falling back to `Solution.java`.

Usage:
  generate-main.py <problem_dir>
      Unsolved mode: patches `<userClassName>.java` on disk if needed (adds
      `import java.util.*;`, strips invalid `public` class modifiers, and
      injects dummy returns into empty starter methods).

  generate-main.py <problem_dir> --solved
      Solved mode: treats `<userClassName>.java` as strictly READ-ONLY.

Compilation is not done here; verify the result with
`scripts/bash/compile-problem.sh <problem_dir> --clean`.
"""

import sys

from maingen.cli import main

if __name__ == "__main__":
    sys.exit(main())
