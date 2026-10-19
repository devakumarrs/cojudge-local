#!/bin/bash
# ==============================================================================
# compile-problem.sh
# ------------------------------------------------------------------------------
# Compiles every `.java` file in a single `problems/<slug>/` directory
# (`Main.java`, `Solution.java` / `<userClassName>.java`, and `Marker.java`,
# whose `isCorrect` checker `Main.java` uses to judge results) with Java 21
# and debug symbols (`-g`).
#
# Used by:
#   - `.vscode/prepare-problem.sh` before a debug session (keeps `.class` files;
#     the `clean-problem` postDebugTask deletes them).
#   - `init-slugs.sh` to verify a generated `Main.java` (`--clean`).
#
# Usage:
#   ./scripts/bash/compile-problem.sh <problem_dir> [--clean]
#
# Options:
#   --clean   Remove all generated `.class` files afterwards (even on failure).
# ==============================================================================

set -e
shopt -s nullglob

PROBLEM_DIR="$1"
CLEAN=false

case "$2" in
    "") ;;
    --clean) CLEAN=true ;;
    *) echo "✖ Error: Unknown argument '$2'" >&2; PROBLEM_DIR="" ;;
esac

if [[ -z "$PROBLEM_DIR" || ! -d "$PROBLEM_DIR" || $# -gt 2 ]]; then
    echo "Usage: $0 <problem_dir> [--clean]" >&2
    exit 1
fi

cd "$PROBLEM_DIR"

JAVA_FILES=(*.java)

if [[ ${#JAVA_FILES[@]} -eq 0 ]]; then
    echo "✖ Error: No .java files to compile in $PROBLEM_DIR" >&2
    exit 1
fi

if [[ "$CLEAN" == true ]]; then
    trap 'rm -f -- *.class' EXIT
fi

javac -g --release 21 "${JAVA_FILES[@]}"
