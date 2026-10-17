#!/bin/bash
# ==============================================================================
# prepare-problem.sh
# ------------------------------------------------------------------------------
# Invoked automatically by VSCode's preLaunchTask before starting a debug session.
#
# Responsibilities:
#   1. Regenerates `.vscode/settings.json` from the tracked `settings.base.json`
#      (via `scripts/py/merge-vscode-settings.py`) and dynamically scopes the
#      VSCode Java Language Server (`java.project.sourcePaths`) to the active
#      problem directory (`problems/<slug>`) so classes like `Solution`, `Main`,
#      `Codec`, `TreeNode`, and `ListNode` never collide.
#      Edit `settings.base.json` (plain JSON, no comments), never `settings.json`,
#      which is regenerated here and gitignored.
#   2. Avoids redundant disk writes to `.vscode/settings.json` if the active
#      problem folder hasn't changed, preventing unnecessary language server reloads.
#   3. Compiles the problem via `scripts/bash/compile-problem.sh` (Java 21,
#      debug symbols, including `Marker.java` for its `isCorrect` checker).
#
# Usage:
#   ./.vscode/prepare-problem.sh <relative_problem_dir>
# ==============================================================================

set -e

RELATIVE_DIR="$1"
VSCODE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
SCRIPTS_DIR="$(cd "$VSCODE_DIR/../scripts" && pwd)"
SETTINGS_FILE="$VSCODE_DIR/settings.json"
BASE_SETTINGS_FILE="$VSCODE_DIR/settings.base.json"

# 0. Debugging only makes sense for a file directly inside `problems/<slug>/`
if [[ ! "$RELATIVE_DIR" =~ ^problems/[^/]+$ ]]; then
    echo "✖ Open a file inside problems/<slug>/ (e.g. Solution.java) before debugging." >&2
    echo "  Active file's folder: ${RELATIVE_DIR:-<none>}" >&2
    exit 1
fi

# 1. Update .vscode/settings.json (base settings + active problem source path)
EXPECTED=$(python3 "$SCRIPTS_DIR/py/merge-vscode-settings.py" "$BASE_SETTINGS_FILE" "$RELATIVE_DIR")
CURRENT=$(cat "$SETTINGS_FILE" 2>/dev/null || true)
if [[ "$CURRENT" != "$EXPECTED" ]]; then
    printf '%s\n' "$EXPECTED" > "$SETTINGS_FILE"
fi

# 2. Compile Main.java, Marker.java, and the problem class (e.g., Solution.java or
#    Codec.java) in the current directory (the task runs with cwd = the active file's folder)
bash "$SCRIPTS_DIR/bash/compile-problem.sh" .
