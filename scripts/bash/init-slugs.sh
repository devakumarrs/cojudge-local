#!/bin/bash
# ==============================================================================
# init-slugs.sh
# ------------------------------------------------------------------------------
# Initializes and verifies the local Java environment across CoJudge problem
# folders under `problems/` in two strict phases:
#
#   Usage:
#     ./scripts/bash/init-slugs.sh [--force-main | -f] [<slug>...]
#
#   Options:
#     --force-main, -f
#       Deletes and regenerates `Main.java` even if it already exists.
#       Solved `<ClassName>.java` files remain strictly read-only.
#     <slug>...
#       Only process these problem folders (default: all of `problems/`),
#       e.g. `./scripts/bash/init-slugs.sh -f subsets two-sum`.
#
#   Target Class File Resolution:
#     - Reads `classProblem.userClassName` from `metadata.json` (e.g., `Codec`,
#       `WordDictionary`, `LRUCache`) and defaults to `Solution` if not found.
#
#   PHASE 1 — Solved Problems First (Read-Only <ClassName>.java):
#     1. Detects already-solved problems via `list-solved-problems.sh`.
#     2. Calls `py/generate-main.py <dir> --solved` to generate a 2-example
#        `Main.java` runner without modifying `<ClassName>.java`.
#     3. Verifies compilation via `compile-problem.sh <dir> --clean` and
#        asserts (by checksum) that `<ClassName>.java` remains untouched.
#
#   PHASE 2 — Unsolved & Example Problems:
#     1. Scans all remaining problem folders in `problems/`.
#     2. Initializes missing `<ClassName>.java` files for unsolved problems via
#        `cojudge init <slug> --lang java --output <ClassName>.java`
#        (the `cojudge` alias is read from your shell profile).
#     3. Calls `py/generate-main.py <dir>` to patch empty starter methods and
#        build the 2-example `Main.java` runner, then verifies Java 21
#        compilation via `compile-problem.sh <dir> --clean`.
# ==============================================================================

# Exit immediately if any command fails
set -e

# Enable alias expansion for this non-interactive shell script
shopt -s expand_aliases

# Record start time for total duration tracking
START_TIME=$(date +%s)

# ANSI color codes for structured terminal output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
BOLD='\033[1m'
NC='\033[0m' # Reset color

USAGE="$0 [--force-main | -f] [<slug>...]"

# 0. Parse CLI arguments
FORCE_MAIN=false
SELECTED_SLUGS=""

for arg in "$@"; do
    case "$arg" in
        --force-main|-f)
            FORCE_MAIN=true
            ;;
        -h|--help)
            echo -e "${BOLD}Usage:${NC} $USAGE"
            echo -e "  --force-main, -f   Delete and regenerate Main.java"
            echo -e "  <slug>...          Only process these problems (default: all)"
            exit 0
            ;;
        -*)
            echo -e "${RED}✖ Error: Unknown argument '$arg'${NC}"
            echo -e "Usage: $USAGE"
            exit 1
            ;;
        *)
            SELECTED_SLUGS="$SELECTED_SLUGS${arg%/}"$'\n'
            ;;
    esac
done

# Helper: Extract `classProblem.userClassName` from metadata.json, defaulting to "Solution"
get_target_java_file() {
    local dir="$1"
    local class_name=""
    if [ -f "$dir/metadata.json" ]; then
        class_name=$(grep -o '"userClassName"[[:space:]]*:[[:space:]]*"[^"]*"' "$dir/metadata.json" 2>/dev/null | head -n 1 | sed -E 's/.*"([^"]+)"$/\1/' || true)
    fi
    class_name="${class_name:-Solution}"
    echo "${class_name}.java"
}

# Helper: Generate Main.java for a problem dir (extra args go to generate-main.py)
# and verify it compiles with Java 21, leaving no .class files behind
generate_and_verify_main() {
    local dir="$1"
    shift
    python3 "$MAIN_GEN_SCRIPT" "$dir" "$@" && bash "$COMPILE_SCRIPT" "$dir" --clean
}

# Helper: True if `$1` is exactly one of the newline-separated slugs in `$2`
slug_in_list() {
    grep -qxF -- "$1" <<< "$2"
}

# Helper: True if `$1` should be processed (no slugs given, or it was given)
is_selected() {
    [ -z "$SELECTED_SLUGS" ] || slug_in_list "$1" "$SELECTED_SLUGS"
}

# Helper: Print a checksum of a file (used to prove solved files stay untouched)
file_checksum() {
    cksum < "$1"
}

# 1. Load the `cojudge` CLI alias from the user's shell profile. It is only
#    needed to create missing problem files, so a missing alias is only an
#    error if that actually happens. (Aliases must be defined before the loops
#    below are parsed, so this cannot be deferred until first use.)
COJUDGE_AVAILABLE=false
if command -v cojudge > /dev/null 2>&1; then
    COJUDGE_AVAILABLE=true
else
    ALIAS_CMD=$(grep -h "alias cojudge=" ~/.zshrc ~/.bashrc ~/.bash_profile ~/.profile 2>/dev/null | head -n 1 || true)
    if [ -n "$ALIAS_CMD" ]; then
        eval "$ALIAS_CMD"
        COJUDGE_AVAILABLE=true
    fi
fi

# 2. Resolve script and helper paths
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PY_DIR="$(cd "$SCRIPT_DIR/../py" && pwd)"

SOLVED_SCRIPT="$SCRIPT_DIR/list-solved-problems.sh"
COMPILE_SCRIPT="$SCRIPT_DIR/compile-problem.sh"
MAIN_GEN_SCRIPT="$PY_DIR/generate-main.py"

for required in "$SOLVED_SCRIPT" "$COMPILE_SCRIPT" "$MAIN_GEN_SCRIPT"; do
    if [ ! -f "$required" ]; then
        echo -e "${RED}✖ Error: $(basename "$required") not found at $required${NC}"
        exit 1
    fi
done

PROBLEMS_DIR="$(cd "$SCRIPT_DIR/../../problems" && pwd)"
if [ ! -d "$PROBLEMS_DIR" ]; then
    echo -e "${RED}✖ Error: 'problems' directory not found at $PROBLEMS_DIR${NC}"
    exit 1
fi

# Validate explicitly requested slugs before doing any work
while IFS= read -r slug; do
    [ -z "$slug" ] && continue
    if [ ! -d "$PROBLEMS_DIR/$slug" ]; then
        echo -e "${RED}✖ Error: No problem folder named '$slug' in $PROBLEMS_DIR${NC}"
        exit 1
    fi
done <<< "$SELECTED_SLUGS"

echo -e "${CYAN}Fetching list of solved problems from Git history...${NC}"
SOLVED_SLUGS=$(bash "$SOLVED_SCRIPT")

echo -e "${CYAN}Initializing and verifying Java problem folders in $PROBLEMS_DIR...${NC}"
if [ -n "$SELECTED_SLUGS" ]; then
    echo -e "${CYAN}Only processing: $(echo $SELECTED_SLUGS)${NC}"
fi
if [ "$FORCE_MAIN" = true ]; then
    echo -e "${YELLOW}⚡ Force Main mode enabled: Main.java files will be deleted and regenerated.${NC}"
fi

# 3. Initialize summary counters
COUNT_TOTAL=0
COUNT_EXAMPLE_SKIPPED=0
COUNT_SOLVED_SKIPPED=0
COUNT_UNSOLVED_EXISTING=0
COUNT_NEWLY_INITED=0
COUNT_MAIN_EXISTING=0
COUNT_MAIN_GENERATED=0

# ==============================================================================
# PHASE 1: Solved Problems First (Strictly Read-Only Problem File)
# ==============================================================================
echo -e "\n${BOLD}========================================================${NC}"
echo -e "${BOLD} PHASE 1: Verifying Solved Problems (Read-Only Solution)${NC}"
echo -e "${BOLD}========================================================${NC}\n"

while IFS= read -r slug; do
    [ -z "$slug" ] && continue
    is_selected "$slug" || continue
    dir="$PROBLEMS_DIR/$slug"
    [ -d "$dir" ] || continue

    COUNT_TOTAL=$((COUNT_TOTAL + 1))
    COUNT_SOLVED_SKIPPED=$((COUNT_SOLVED_SKIPPED + 1))

    SOL_FILE=$(get_target_java_file "$dir")
    # Fallback to Solution.java if a solved custom class problem was saved as Solution.java
    if [ ! -f "$dir/$SOL_FILE" ] && [ -f "$dir/Solution.java" ]; then
        SOL_FILE="Solution.java"
    fi

    echo -e " ${CYAN}✓ $SOL_FILE (Solved)   : ${NC}$slug"

    if [ "$FORCE_MAIN" = false ] && [ -f "$dir/Main.java" ]; then
        echo -e "   ${BLUE}↳ Main.java   (Exists)   : ${NC}$slug/Main.java"
        COUNT_MAIN_EXISTING=$((COUNT_MAIN_EXISTING + 1))
    else
        # Checksum (not `git diff`) so uncommitted improvements to a solved file are fine
        SOL_CHECKSUM_BEFORE=$(file_checksum "$dir/$SOL_FILE")

        rm -f "$dir/Main.java"
        if ! generate_and_verify_main "$dir" --solved; then
            rm -f "$dir/Main.java"
            echo -e "\n${RED}✖ Halting init-slugs.sh in Phase 1: Solved problem '$slug' failed Main.java compilation.${NC}"
            exit 1
        fi

        # Verify the solved Java file was not modified on disk
        if [ "$(file_checksum "$dir/$SOL_FILE")" != "$SOL_CHECKSUM_BEFORE" ]; then
            echo -e "\n${RED}✖ Error: Solved '$SOL_FILE' in '$slug' was unexpectedly modified! Halting.${NC}"
            exit 1
        fi

        echo -e "   ${GREEN}↳ Main.java   (Compiled) : ${NC}$slug/Main.java (Java 21 ✓, $SOL_FILE untouched)"
        COUNT_MAIN_GENERATED=$((COUNT_MAIN_GENERATED + 1))
    fi
done <<< "$SOLVED_SLUGS"

echo -e "\n${GREEN}✔ Phase 1 Complete: All ${COUNT_SOLVED_SKIPPED} solved problem(s) compiled cleanly!${NC}"

# ==============================================================================
# PHASE 2: Unsolved & Example Problem Directories
# ==============================================================================
echo -e "\n${BOLD}========================================================${NC}"
echo -e "${BOLD} PHASE 2: Initializing & Verifying Unsolved Problems${NC}"
echo -e "${BOLD}========================================================${NC}\n"

for dir in "$PROBLEMS_DIR"/*/; do
    [ -d "$dir" ] || continue
    dir="${dir%/}"
    slug=$(basename "$dir")
    is_selected "$slug" || continue

    # Skip solved problems that were already verified in Phase 1
    if slug_in_list "$slug" "$SOLVED_SLUGS"; then
        continue
    fi

    COUNT_TOTAL=$((COUNT_TOTAL + 1))
    SOL_FILE=$(get_target_java_file "$dir")

    # Clean up stale Solution.java if an earlier run created Solution.java for a custom classProblem
    if [ "$SOL_FILE" != "Solution.java" ] && [ -f "$dir/Solution.java" ] && [ ! -f "$dir/$SOL_FILE" ]; then
        rm -f "$dir/Solution.java"
    fi

    # --- Part A: <ClassName>.java Status & Initialization ---
    if [ "$slug" = "reverse-linked-list" ]; then
        echo -e " ${YELLOW}⊘ $SOL_FILE (Example)  : ${NC}$slug"
        COUNT_EXAMPLE_SKIPPED=$((COUNT_EXAMPLE_SKIPPED + 1))
    elif [ -f "$dir/$SOL_FILE" ]; then
        echo -e " ${BLUE}✦ $SOL_FILE (Unsolved) : ${NC}$slug"
        COUNT_UNSOLVED_EXISTING=$((COUNT_UNSOLVED_EXISTING + 1))
    else
        echo -e " ${GREEN}▶ $SOL_FILE (Created)  : ${NC}$slug"
        if [ "$COJUDGE_AVAILABLE" != true ]; then
            echo -e "\n${RED}✖ Error: '$SOL_FILE' is missing for '$slug' and no 'cojudge' command or alias was found to create it.${NC}"
            exit 1
        fi
        if ! (cd "$dir" && cojudge init "$slug" --lang java --output "$SOL_FILE" > /dev/null 2>&1); then
            echo -e "\n${RED}✖ Error: Failed to initialize $SOL_FILE for '$slug'. Halting script.${NC}"
            exit 1
        fi
        COUNT_NEWLY_INITED=$((COUNT_NEWLY_INITED + 1))
    fi

    # --- Part B: Main.java Generation & Java 21 Compilation Check ---
    if [ "$FORCE_MAIN" = false ] && [ -f "$dir/Main.java" ]; then
        echo -e "   ${BLUE}↳ Main.java   (Exists)   : ${NC}$slug/Main.java"
        COUNT_MAIN_EXISTING=$((COUNT_MAIN_EXISTING + 1))
    else
        rm -f "$dir/Main.java"
        if ! generate_and_verify_main "$dir"; then
            rm -f "$dir/Main.java"
            echo -e "\n${RED}✖ Halting init-slugs.sh in Phase 2 due to compilation/generation error in '$slug'.${NC}"
            exit 1
        fi
        echo -e "   ${GREEN}↳ Main.java   (Compiled) : ${NC}$slug/Main.java (Java 21 ✓)"
        COUNT_MAIN_GENERATED=$((COUNT_MAIN_GENERATED + 1))
    fi
done

# Calculate total duration
END_TIME=$(date +%s)
DURATION=$((END_TIME - START_TIME))
MINUTES=$((DURATION / 60))
SECONDS_REMAINDER=$((DURATION % 60))

if [ "$MINUTES" -gt 0 ]; then
    TIME_STR="${MINUTES}m ${SECONDS_REMAINDER}s"
else
    TIME_STR="${SECONDS_REMAINDER}s"
fi

# 4. Print Unified Summary Table
echo -e "\n${BOLD}========================================================${NC}"
echo -e "${BOLD}                 INITIALIZATION SUMMARY${NC}"
echo -e "${BOLD}========================================================${NC}"
echo -e " Total Problem Folders Scanned      : ${BOLD}${COUNT_TOTAL}${NC}"
echo -e " ------------------------------------------------------"
echo -e " ${CYAN}Problem File  (Solved / Untouched) : ${COUNT_SOLVED_SKIPPED}${NC}"
echo -e " ${BLUE}Problem File  (Unsolved / Existing): ${COUNT_UNSOLVED_EXISTING}${NC}"
echo -e " ${GREEN}Problem File  (Newly Created)      : ${COUNT_NEWLY_INITED}${NC}"
echo -e " ${YELLOW}Problem File  (Example Skipped)    : ${COUNT_EXAMPLE_SKIPPED}${NC}"
echo -e " ------------------------------------------------------"
echo -e " ${BLUE}Main.java     (Already Exists)     : ${COUNT_MAIN_EXISTING}${NC}"
echo -e " ${GREEN}Main.java     (Generated & Built)  : ${COUNT_MAIN_GENERATED}${NC}"
echo -e " ------------------------------------------------------"
echo -e " ${BOLD}Total Time Taken                   : ${GREEN}${TIME_STR}${NC}"
echo -e "${BOLD}========================================================${NC}\n"
