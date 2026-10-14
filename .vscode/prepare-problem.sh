#!/bin/bash
set -e

RELATIVE_DIR="$1"
VSCODE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
SETTINGS_FILE="$VSCODE_DIR/settings.json"

# 1. Update .vscode/settings.json if we are inside a problem directory
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

# 2. Compile Java files in the active problem directory with debug symbols
javac -g --release 21 *.java