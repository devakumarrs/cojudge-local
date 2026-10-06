#!/bin/bash
set -e

# Problem Commit: Automatically adds and commits a single unstaged problem file.

# 1. Throw if any files are currently staged
STAGED_COUNT=$(git diff --cached --name-only | wc -l | tr -d ' ')
if [[ "$STAGED_COUNT" -gt 0 ]]; then
    echo "Error: Found $STAGED_COUNT staged file(s). Please unstage or commit them first."
    exit 1
fi

# Get all unstaged files (both modified tracked files and untracked new files)
UNSTAGED_FILES=$(git ls-files --modified --others --exclude-standard)

# 2. Throw if no unstaged files exist
if [[ -z "$UNSTAGED_FILES" ]]; then
    echo "Error: No unstaged files found."
    exit 1
fi

UNSTAGED_COUNT=$(echo "$UNSTAGED_FILES" | wc -l | tr -d ' ')

# 3. Throw if there is more than 1 unstaged file
if [[ "$UNSTAGED_COUNT" -gt 1 ]]; then
    echo "Error: Expected exactly 1 unstaged file, but found $UNSTAGED_COUNT."
    exit 1
fi

FILE="$UNSTAGED_FILES"

# 4. Throw if it is not from the 'problems/' directory
if [[ "$FILE" != problems/* ]]; then
    echo "Error: The unstaged file is not in the 'problems/' directory (Found: $FILE)."
    exit 1
fi

# 5. Fetch the problem name from the file path
PROBLEM_NAME=$(echo "$FILE" | cut -d'/' -f2)

# 6. Add and commit as shown
git add "$FILE"
git commit -m "$PROBLEM_NAME"

echo "✅ Committed '$FILE' with message: '$PROBLEM_NAME'"
