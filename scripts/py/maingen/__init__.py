"""
maingen
-------
Generates a standalone `Main.java` test runner for a single CoJudge problem
directory. Compilation is intentionally NOT done here; callers verify the
result with `scripts/bash/compile-problem.sh`.

Modules:
  cli          Command-line entry point (argument parsing, file I/O, errors).
  metadata     Reading `metadata.json` and resolving the problem's Java file.
  java_source  Regex-based Java source inspection and starter-file patching.
  literals     Converting JSON test values into Java literal expressions.
  examples     Selecting test cases and pairing them with their examples.
  snippets     Loading the Java helper templates from `templates/`.
  builder      Assembling the final `Main.java` source.
"""
