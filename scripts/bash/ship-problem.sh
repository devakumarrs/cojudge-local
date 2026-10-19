#!/bin/bash
# ==============================================================================
# ship-problem.sh
# ------------------------------------------------------------------------------
# Safely stages and commits all changed files (staged, unstaged, or untracked,
# such as `Solution.java`, `Main.java`, or your own notes) belonging to a single
# `problems/<slug>/` directory.
#
# Validation Rules:
#   - Accepts already-staged (`git add`), unstaged modified, deleted, and
#     untracked files. Any number of files is fine.
#   - Every file must be inside `problems/<slug>/` (subfolders allowed).
#   - All files must belong to the exact same `problems/<slug>` folder, so the
#     commit marks exactly one problem as solved / improved.
#
# Commit Message Rules:
#   - First single-folder commit for `<slug>` : "<slug>"
#   - Subsequent single-folder commits        : "improve: <slug>"
#   ("Already solved" is decided by `list-solved-problems.sh`.)
#
# After committing, pushes to `origin main`. If the push fails, the commit
# stays local and the script exits with an error.
#
# Usage:
#   ./scripts/bash/ship-problem.sh
#   (or press ctrl+shift+c in VS Code, which runs the `ship-problem` task)
# ==============================================================================

set -e

# ANSI color codes
RED='\033[0;31m'
GREEN='\033[0;32m'
CYAN='\033[0;36m'
YELLOW='\033[1;33m'
BOLD='\033[1m'
NC='\033[0m'

# 1. Collect all pending files (staged + unstaged modified + untracked), deduplicated.
#    `--no-renames` lists both sides of a staged move, so a file moved in from
#    another problem folder can't slip past the single-folder check.
PENDING_FILES=$(
    {
        git diff --cached --name-only --no-renames
        git ls-files --modified --others --exclude-standard
    } | grep -v '^$' | sort -u || true
)

# 2. Abort if there are no pending changes anywhere in the working tree or index
if [[ -z "$PENDING_FILES" ]]; then
    echo -e "${RED}✖ Error: No staged or unstaged changes found to commit.${NC}"
    exit 1
fi

FILE_COUNT=$(echo "$PENDING_FILES" | wc -l | tr -d ' ')

# 3. Verify all pending files sit inside a `problems/<slug>/` directory
while IFS= read -r file; do
    if [[ ! "$file" =~ ^problems/[^/]+/.+$ ]]; then
        echo -e "${RED}✖ Error: File is not inside a 'problems/<slug>/' directory.${NC}"
        echo -e "${RED}  Found: ${CYAN}$file${NC}"
        exit 1
    fi
done <<< "$PENDING_FILES"

# 4. Verify all pending files belong to the exact same problem directory
UNIQUE_PROBLEM_DIRS=$(echo "$PENDING_FILES" | cut -d'/' -f1,2 | sort -u)
PROBLEM_DIR_COUNT=$(echo "$UNIQUE_PROBLEM_DIRS" | wc -l | tr -d ' ')

if [[ "$PROBLEM_DIR_COUNT" -ne 1 ]]; then
    echo -e "${RED}✖ Error: Changed files belong to ${BOLD}$PROBLEM_DIR_COUNT${NC}${RED} different problem folders. Expected only 1:${NC}"
    echo "$UNIQUE_PROBLEM_DIRS" | sed "s/^/  - /"
    exit 1
fi

PROBLEM_NAME=$(echo "$UNIQUE_PROBLEM_DIRS" | cut -d'/' -f2)

# 5. Check Git history to see if this problem was already solved in a prior single-folder commit
SOLVED_SCRIPT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)/list-solved-problems.sh"
COMMIT_MSG="$PROBLEM_NAME"

if bash "$SOLVED_SCRIPT" | grep -qxF -- "$PROBLEM_NAME"; then
    COMMIT_MSG="improve: $PROBLEM_NAME"
fi

# 6. Stage everything pending in the problem folder (modified, new, and deleted files,
#    including ones staged earlier and changed again since) and commit. Every pending
#    file was verified above to be inside this folder.
git add -A -- "problems/$PROBLEM_NAME"

git commit -m "$COMMIT_MSG" > /dev/null

# 7. Print confirmation summary
echo -e "\n${GREEN}✅ Successfully committed!${NC}"
if [[ "$FILE_COUNT" -eq 1 ]]; then
    echo -e " ↳ ${BOLD}File    : ${NC}${CYAN}$PENDING_FILES${NC}"
else
    echo -e " ↳ ${BOLD}Files   :${NC}"
    while IFS= read -r file; do
        echo -e "   • ${CYAN}$file${NC}"
    done <<< "$PENDING_FILES"
fi

if [[ "$COMMIT_MSG" == improve:* ]]; then
    echo -e " ↳ ${BOLD}Message : ${NC}${YELLOW}$COMMIT_MSG${NC}\n"
else
    echo -e " ↳ ${BOLD}Message : ${NC}$COMMIT_MSG\n"
fi

# 8. Push to origin/main. Only reached when every step above succeeded.
if ! git push origin main; then
    echo -e "\n${RED}✖ Error: The commit was created locally, but pushing to origin/main failed.${NC}"
    echo -e "${RED}  Fix the problem above, then run ${CYAN}git push origin main${RED}.${NC}"
    exit 1
fi

echo -e "\n${GREEN}✅ Pushed to origin/main.${NC}\n"