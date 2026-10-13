#!/bin/bash
set -e

# Define ANSI color codes
RED='\033[0;31m'
GREEN='\033[0;32m'
CYAN='\033[0;36m'
YELLOW='\033[1;33m'
BOLD='\033[1m'
NC='\033[0m' # No Color

# Problem Commit: Automatically adds and commits a single unstaged problem file.

# 1. Throw if any files are currently staged
STAGED_COUNT=$(git diff --cached --name-only | wc -l | tr -d ' ')
if [[ "$STAGED_COUNT" -gt 0 ]]; then
    echo -e "${RED}✖ Error: Found ${BOLD}$STAGED_COUNT${NC}${RED} staged file(s). Please unstage or commit them first.${NC}"
    exit 1
fi

# Get all unstaged files (both modified tracked files and untracked new files)
UNSTAGED_FILES=$(git ls-files --modified --others --exclude-standard)

# 2. Throw if no unstaged files exist
if [[ -z "$UNSTAGED_FILES" ]]; then
    echo -e "${RED}✖ Error: No unstaged files found.${NC}"
    exit 1
fi

UNSTAGED_COUNT=$(echo "$UNSTAGED_FILES" | wc -l | tr -d ' ')

# 3. Throw if there is more than 1 unstaged file
if [[ "$UNSTAGED_COUNT" -gt 1 ]]; then
    echo -e "${RED}✖ Error: Expected exactly ${BOLD}1${NC}${RED} unstaged file, but found ${BOLD}$UNSTAGED_COUNT${NC}${RED}.${NC}"
    exit 1
fi

FILE="$UNSTAGED_FILES"

# 4. Throw if it is not from the 'problems/' directory
if [[ "$FILE" != problems/* ]]; then
    echo -e "${RED}✖ Error: The unstaged file is not in the 'problems/' directory.${NC}"
    echo -e "${RED}  Found: ${CYAN}$FILE${NC}"
    exit 1
fi

# 5. Fetch the problem name from the file path
PROBLEM_NAME=$(echo "$FILE" | cut -d'/' -f2)

# 6. Determine if this problem has been committed before (Improvement Check)
COMMIT_MSG="$PROBLEM_NAME"

# Loop through all previous commits that touched this specific problem folder
for commit_hash in $(git log --format="%H" -- "problems/$PROBLEM_NAME" 2>/dev/null || true); do
    # Get all files modified in this previous commit
    FILES_IN_COMMIT=$(git diff-tree --no-commit-id --name-only -r "$commit_hash" | grep -v '^$')
    
    # Count how many unique directories were modified in that commit
    DIR_COUNT=$(echo "$FILES_IN_COMMIT" | cut -d'/' -f1,2 | sort -u | wc -l | tr -d ' ')
    
    # If we find at least one previous commit where ONLY this problem folder was modified
    if [[ "$DIR_COUNT" -eq 1 ]]; then
        COMMIT_MSG="improve: $PROBLEM_NAME"
        break
    fi
done

# 7. Add and commit as shown
git add "$FILE"
git commit -m "$COMMIT_MSG" > /dev/null

# 8. Print pretty success message
echo -e "\n${GREEN}✅ Successfully committed!${NC}"
echo -e " ↳ ${BOLD}File    :${NC} ${CYAN}$FILE${NC}"

# Highlight 'improve' messages in yellow for a cool visual indicator
if [[ "$COMMIT_MSG" == improve:* ]]; then
    echo -e " ↳ ${BOLD}Message :${NC} ${YELLOW}$COMMIT_MSG${NC}\n"
else
    echo -e " ↳ ${BOLD}Message :${NC} $COMMIT_MSG\n"
fi