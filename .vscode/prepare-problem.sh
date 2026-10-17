#!/bin/bash
# ==============================================================================
# prepare-problem.sh
# ------------------------------------------------------------------------------
# Invoked automatically by VSCode's preLaunchTask before starting a debug session.
#
# Responsibilities:
#   1. Regenerates `.vscode/settings.json` from the tracked `settings.base.json`
#      and dynamically scopes the VSCode Java Language Server
#      (`java.project.sourcePaths`) to the active problem directory
#      (`problems/<slug>`) so classes like `Solution`, `Main`, `Codec`,
#      `TreeNode`, and `ListNode` never collide.
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
BASE_SETTINGS_FILE="$VSCODE_DIR/settings.base.json"

# 1. Update .vscode/settings.json (base settings + active problem source path)
#    if the active file is inside a problem directory
if [[ "$RELATIVE_DIR" == problems/* ]]; then
    EXPECTED=$(python3 - "$BASE_SETTINGS_FILE" "$RELATIVE_DIR" <<'PY'
import json, os, sys

base_path, source_dir = sys.argv[1], sys.argv[2]
settings = {}
if os.path.exists(base_path):
    with open(base_path, encoding="utf-8") as f:
        settings = json.load(f)
settings["java.project.sourcePaths"] = [source_dir]
print(json.dumps(settings, indent=4, ensure_ascii=False))
PY
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