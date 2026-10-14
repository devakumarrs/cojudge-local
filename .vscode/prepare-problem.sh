#!/bin/bash
# ==============================================================================
# prepare-problem.sh
# ------------------------------------------------------------------------------
# Invoked automatically by VSCode's preLaunchTask before starting a debug session.
#
# Responsibilities:
#   1. Dynamically scopes the VSCode Java Language Server (`java.project.sourcePaths`)
#      to the active problem directory (`problems/<slug>`) so classes like
#      `Solution`, `Main`, `Codec`, `TreeNode`, and `ListNode` never collide.
#   2. Avoids redundant disk writes to `.vscode/settings.json` if the active
#      problem folder hasn't changed, preventing unnecessary language server reloads.
#   3. Compiles `Main.java` and the problem class (`Solution.java` or
#      `<userClassName>.java`) with Java 21 and debug symbols (`-g`) while
#      intentionally skipping `Marker.java`.
#
# Usage:
#   ./.vscode/prepare-problem.sh <relative_problem_dir>
# ==============================================================================

set -e

RELATIVE_DIR="$1"
VSCODE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
SETTINGS_FILE="$VSCODE_DIR/settings.json"

# 1. Update .vscode/settings.json if the active file is inside a problem directory
if [[ "$RELATIVE_DIR" == problems/* ]]; then
    EXPECTED=$(cat <<EOF
{
    "java.project.sourcePaths": [
        "$RELATIVE_DIR"
    ]
}
EOF
)
    CURRENT=$(cat "$SETTINGS_FILE" 2>/dev/null || true)
    if [[ "$CURRENT" != "$EXPECTED" ]]; then
        printf '%s\n' "$EXPECTED" > "$SETTINGS_FILE"
    fi
fi

# 2. Compile Main.java and the problem class (e.g., Solution.java or Codec.java), skipping Marker.java
JAVA_FILES=()
for file in *.java; do
    [[ "$file" == "Marker.java" ]] && continue
    JAVA_FILES+=("$file")
done

javac -g --release 21 "${JAVA_FILES[@]}"