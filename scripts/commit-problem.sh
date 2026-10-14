#!/bin/bash
# ==============================================================================
# commit-problem.sh
# ------------------------------------------------------------------------------
# Safely stages and commits 1 or 2 changed files (staged, unstaged, or untracked,
# such as `Solution.java` and `Main.java`) belonging to a single
# `problems/<slug>/` directory.
#
# Validation Rules:
#   - Accepts already-staged (`git add`), unstaged modified, and untracked files.
#   - Total unique pending files across the repository must be 1 or 2.
#   - Every file must sit directly inside `problems/<slug>/<filename>`.
#   - All files must belong to the exact same `problems/<slug>` folder.
#
# Commit Message Rules:
#   - First single-folder commit for `<slug>` : "<slug>"
#   - Subsequent single-folder commits        : "improve: <slug>"
# ==============================================================================

set -e

# ANSI color codes
RED='\033[0;31m'
GREEN='\033[0;32m'
CYAN='\033[0;36m'
YELLOW='\033[1;33m'
BOLD='\033[1m'
NC='\033[0m'

# 1. Collect all pending files (staged + unstaged modified + untracked), deduplicated
PENDING_FILES=$(
    {
        git diff --cached --name-only
        git ls-files --modified --others --exclude-standard
    } | grep -v '^$' | sort -u || true
)

# 2. Abort if there are no pending changes anywhere in the working tree or index
if [[ -z "$PENDING_FILES" ]]; then
    echo -e "${RED}✖ Error: No staged or unstaged changes found to commit.${NC}"
    exit 1
fi

FILE_COUNT=$(echo "$PENDING_FILES" | wc -l | tr -d ' ')

# 3. Require between 1 and 2 pending files (e.g., Solution.java and optional Main.java)
if [[ "$FILE_COUNT" -lt 1 || "$FILE_COUNT" -gt 2 ]]; then
    echo -e "${RED}✖ Error: Expected ${BOLD}1 or 2${NC}${RED} changed file(s), but found${BOLD}$FILE_COUNT${NC}${RED}:${NC}"
    echo "$PENDING_FILES" | sed "s/^/  - /"
    exit 1
fi

# 4. Verify all pending files sit directly inside `problems/<slug>/`
while IFS= read -r file; do
    if [[ ! "$file" =~ ^problems/[^/]+/[^/]+$ ]]; then
        echo -e "${RED}✖ Error: File is not directly inside a 'problems/<slug>/' directory.${NC}"
        echo -e "${RED}  Found:${CYAN}$file${NC}"
        exit 1
    fi
done <<< "$PENDING_FILES"

# 5. Verify all pending files belong to the exact same problem directory
UNIQUE_PROBLEM_DIRS=$(echo "$PENDING_FILES" | cut -d'/' -f1,2 | sort -u)
PROBLEM_DIR_COUNT=$(echo "$UNIQUE_PROBLEM_DIRS" | wc -l | tr -d ' ')

if [[ "$PROBLEM_DIR_COUNT" -ne 1 ]]; then
    echo -e "${RED}✖ Error: Changed files belong to ${BOLD}$PROBLEM_DIR_COUNT${NC}${RED} different problem folders. Expected only 1:${NC}"
    echo "$UNIQUE_PROBLEM_DIRS" | sed "s/^/  - /"
    exit 1
fi

PROBLEM_NAME=$(echo "$UNIQUE_PROBLEM_DIRS" | cut -d'/' -f2)

# 6. Check Git history to see if this problem was already solved in a prior single-folder commit
COMMIT_MSG="$PROBLEM_NAME"

for commit_hash in $(git log --format="%H" -- "problems/$PROBLEM_NAME" 2>/dev/null || true); do
    FILES_IN_COMMIT=$(git diff-tree --no-commit-id --name-only -r "$commit_hash" | grep -v '^$')
    DIR_COUNT=$(echo "$FILES_IN_COMMIT" | cut -d'/' -f1,2 | sort -u | wc -l | tr -d ' ')
    
    if [[ "$DIR_COUNT" -eq 1 ]]; then
        COMMIT_MSG="improve: $PROBLEM_NAME"
        break
    fi
done

# 7. Ensure all pending files are staged (in case any were unstaged or partially modified after staging) and commit
while IFS= read -r file; do
    git add "$file"
done <<< "$PENDING_FILES"

git commit -m "$COMMIT_MSG" > /dev/null

# 8. Print confirmation summary
echo -e "\n${GREEN}✅ Successfully committed!${NC}"
if [[ "$FILE_COUNT" -eq 1 ]]; then
    echo -e " ↳ ${BOLD}File    :${NC}${CYAN}$PENDING_FILES${NC}"
else
    echo -e " ↳ ${BOLD}Files   :${NC}"
    while IFS= read -r file; do
        echo -e "   • ${CYAN}$file${NC}"
    done <<< "$PENDING_FILES"
fi

if [[ "$COMMIT_MSG" == improve:* ]]; then
    echo -e " ↳ ${BOLD}Message :${NC}${YELLOW}$COMMIT_MSG${NC}\n"
else
    echo -e " ↳ ${BOLD}Message :${NC}$COMMIT_MSG\n"
fi