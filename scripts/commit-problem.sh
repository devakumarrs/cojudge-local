#!/bin/bash
set -e

# Define ANSI color codes
RED='\033[0;31m'
GREEN='\033[0;32m'
CYAN='\033[0;36m'
YELLOW='\033[1;33m'
BOLD='\033[1m'
NC='\033[0m' # No Color

# Problem Commit: Automatically adds and commits 1 or 2 unstaged files from a single problem folder.

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

# 3. Throw if there are more than 2 unstaged files (min 1, max 2)
if [[ "$UNSTAGED_COUNT" -lt 1 || "$UNSTAGED_COUNT" -gt 2 ]]; then
    echo -e "${RED}✖ Error: Expected ${BOLD}1 or 2${NC}${RED} unstaged file(s), but found ${BOLD}$UNSTAGED_COUNT${NC}${RED}:${NC}"
    echo "$UNSTAGED_FILES" | sed "s/^/  - /"
    exit 1
fi

# 4. Verify all unstaged files are directly inside a 'problems/<slug>/' directory
while IFS= read -r file; do
    if [[ ! "$file" =~ ^problems/[^/]+/[^/]+$ ]]; then
        echo -e "${RED}✖ Error: File is not directly inside a 'problems/<slug>/' directory.${NC}"
        echo -e "${RED}  Found: ${CYAN}$file${NC}"
        exit 1
    fi
done <<< "$UNSTAGED_FILES"

# 5. Ensure all modified files belong to the exact same problem subfolder
UNIQUE_PROBLEM_DIRS=$(echo "$UNSTAGED_FILES" | cut -d'/' -f1,2 | sort -u)
PROBLEM_DIR_COUNT=$(echo "$UNIQUE_PROBLEM_DIRS" | wc -l | tr -d ' ')

if [[ "$PROBLEM_DIR_COUNT" -ne 1 ]]; then
    echo -e "${RED}✖ Error: Unstaged files belong to ${BOLD}$PROBLEM_DIR_COUNT${NC}${RED} different problem folders. Expected only 1:${NC}"
    echo "$UNIQUE_PROBLEM_DIRS" | sed "s/^/  - /"
    exit 1
fi

PROBLEM_NAME=$(echo "$UNIQUE_PROBLEM_DIRS" | cut -d'/' -f2)

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

# 7. Stage all unstaged files in this problem folder and commit
while IFS= read -r file; do
    git add "$file"
done <<< "$UNSTAGED_FILES"

git commit -m "$COMMIT_MSG" > /dev/null

# 8. Print pretty success message
echo -e "\n${GREEN}✅ Successfully committed!${NC}"
if [[ "$UNSTAGED_COUNT" -eq 1 ]]; then
    echo -e " ↳ ${BOLD}File    :${NC} ${CYAN}$UNSTAGED_FILES${NC}"
else
    echo -e " ↳ ${BOLD}Files   :${NC}"
    while IFS= read -r file; do
        echo -e "   • ${CYAN}$file${NC}"
    done <<< "$UNSTAGED_FILES"
fi

# Highlight 'improve' messages in yellow for a cool visual indicator
if [[ "$COMMIT_MSG" == improve:* ]]; then
    echo -e " ↳ ${BOLD}Message :${NC} ${YELLOW}$COMMIT_MSG${NC}\n"
else
    echo -e " ↳ ${BOLD}Message :${NC} $COMMIT_MSG\n"
fi