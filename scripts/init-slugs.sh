#!/bin/bash
# ==============================================================================
# init-slugs.sh
# ------------------------------------------------------------------------------
# Initializes and verifies the local Java environment across all CoJudge problem
# folders under `problems/` in two strict phases:
#
#   Usage:
#     ./scripts/init-slugs.sh [--reset-main | --force-main | -r | -f]
#
#   Options:
#     --reset-main, --force-main, -r, -f
#       Deletes and regenerates `Main.java` across all problem directories
#       even if `Main.java` already exists. Solved `<ClassName>.java` files
#       remain strictly read-only.
#
#   Target Class File Resolution:
#     - Reads `classProblem.userClassName` from `metadata.json` (e.g., `Codec`,
#       `WordDictionary`, `LRUCache`) and defaults to `Solution` if not found.
#
#   PHASE 1 — Solved Problems First (Read-Only <ClassName>.java):
#     1. Detects already-solved problems via `list-solved-problems.sh`.
#     2. Calls `generate-main.py <dir> --solved` to generate a 2-example
#        `Main.java` runner without modifying `<ClassName>.java`.
#     3. Verifies compilation (`javac -g --release 21 Main.java <ClassName>.java`)
#        and asserts via `git diff` that `<ClassName>.java` remains untouched.
#
#   PHASE 2 — Unsolved & Example Problems:
#     1. Scans all remaining problem folders in `problems/`.
#     2. Initializes missing `<ClassName>.java` files for unsolved problems via
#        `cojudge init <slug> --lang java --output <ClassName>.java`.
#     3. Calls `generate-main.py <dir>` to patch empty starter methods, build
#        the 2-example `Main.java` runner, and verify Java 21 compilation.
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

# 0. Parse CLI arguments
RESET_MAIN=false

for arg in "$@"; do
    case "$arg" in
        --reset-main|--force-main|-r|-f)
            RESET_MAIN=true
            ;;
        -h|--help)
            echo -e "${BOLD}Usage:${NC} $0 [--reset-main | --force-main | -r | -f]"
            echo -e "  --reset-main, --force-main, -r, -f   Delete and regenerate Main.java for all problems"
            exit 0
            ;;
        *)
            echo -e "${RED}✖ Error: Unknown argument '$arg'${NC}"
            echo -e "Usage: $0 [--reset-main | --force-main | -r | -f]"
            exit 1
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

# 1. Locate and load the `cojudge` CLI alias from the user's shell profile
ALIAS_CMD=$(grep -h "alias cojudge=" ~/.zshrc ~/.bashrc ~/.bash_profile ~/.profile 2>/dev/null | head -n 1)

if [ -z "$ALIAS_CMD" ]; then
    echo -e "${RED}✖ Error: Could not find 'cojudge' alias in your shell configuration files.${NC}"
    exit 1
fi

eval "$ALIAS_CMD"

# 2. Resolve script and helper paths
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

SOLVED_SCRIPT="$SCRIPT_DIR/list-solved-problems.sh"
if [ ! -f "$SOLVED_SCRIPT" ]; then
    echo -e "${RED}✖ Error: list-solved-problems.sh not found at $SOLVED_SCRIPT${NC}"
    exit 1
fi

MAIN_GEN_SCRIPT="$SCRIPT_DIR/generate-main.py"
if [ ! -f "$MAIN_GEN_SCRIPT" ]; then
    echo -e "${RED}✖ Error: generate-main.py not found at $MAIN_GEN_SCRIPT${NC}"
    exit 1
fi

echo -e "${CYAN}Fetching list of solved problems from Git history...${NC}"
SOLVED_SLUGS=$(bash "$SOLVED_SCRIPT")

PROBLEMS_DIR="$(cd "$SCRIPT_DIR/../problems" && pwd)"
if [ ! -d "$PROBLEMS_DIR" ]; then
    echo -e "${RED}✖ Error: 'problems' directory not found at $PROBLEMS_DIR${NC}"
    exit 1
fi

echo -e "${CYAN}Initializing and verifying Java problem folders in $PROBLEMS_DIR...${NC}"
if [ "$RESET_MAIN" = true ]; then
    echo -e "${YELLOW}⚡ Force/Reset Main mode enabled: All Main.java files will be deleted and regenerated.${NC}"
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
    dir="$PROBLEMS_DIR/$slug"
    [ -d "$dir" ] || continue

    ((COUNT_TOTAL++))
    ((COUNT_SOLVED_SKIPPED++))

    SOL_FILE=$(get_target_java_file "$dir")
    # Fallback to Solution.java if a solved custom class problem was saved as Solution.java
    if [ ! -f "$dir/$SOL_FILE" ] && [ -f "$dir/Solution.java" ]; then
        SOL_FILE="Solution.java"
    fi

    echo -e " ${CYAN}✓$SOL_FILE (Solved)   :${NC}$slug"

    if [ "$RESET_MAIN" = false ] && [ -f "$dir/Main.java" ]; then
        echo -e "   ${BLUE}↳ Main.java   (Exists)   :${NC}$slug/Main.java"
        ((COUNT_MAIN_EXISTING++))
    else
        rm -f "$dir/Main.java"
        if ! python3 "$MAIN_GEN_SCRIPT" "$dir" --solved; then
            rm -f "$dir/Main.java"
            echo -e "\n${RED}✖ Halting init-slugs.sh in Phase 1: Solved problem '$slug' failed Main.java compilation.${NC}"
            exit 1
        fi

        # Verify the solved Java file was not modified on disk
        if ! git diff --quiet -- "$dir/$SOL_FILE"; then
            echo -e "\n${RED}✖ Error: Solved '$SOL_FILE' in '$slug' was unexpectedly modified! Halting.${NC}"
            exit 1
        fi

        echo -e "   ${GREEN}↳ Main.java   (Compiled) :${NC} $slug/Main.java (Java 21 ✓,$SOL_FILE untouched)"
        ((COUNT_MAIN_GENERATED++))
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
    
    slug=$(basename "$dir")

    # Skip solved problems that were already verified in Phase 1
    if echo "$SOLVED_SLUGS" | grep -qw "$slug"; then
        continue
    fi

    ((COUNT_TOTAL++))
    SOL_FILE=$(get_target_java_file "$dir")

    # Clean up stale Solution.java if an earlier run created Solution.java for a custom classProblem
    if [ "$SOL_FILE" != "Solution.java" ] && [ -f "$dir/Solution.java" ] && [ ! -f "$dir/$SOL_FILE" ]; then
        rm -f "$dir/Solution.java"
    fi
    
    # --- Part A: <ClassName>.java Status & Initialization ---
    if [ "$slug" = "reverse-linked-list" ]; then
        echo -e " ${YELLOW}⊘$SOL_FILE (Example)  :${NC}$slug"
        ((COUNT_EXAMPLE_SKIPPED++))
    elif [ -f "$dir/$SOL_FILE" ]; then
        echo -e " ${BLUE}✦$SOL_FILE (Unsolved) :${NC}$slug"
        ((COUNT_UNSOLVED_EXISTING++))
    else
        echo -e " ${GREEN}▶$SOL_FILE (Created)  :${NC}$slug"
        if ! (cd "$dir" && cojudge init "$slug" --lang java --output "$SOL_FILE" > /dev/null 2>&1); then
            echo -e "\n${RED}✖ Error: Failed to initialize $SOL_FILE for '$slug'. Halting script.${NC}"
            exit 1
        fi
        ((COUNT_NEWLY_INITED++))
    fi

    # --- Part B: Main.java Generation & Java 21 Compilation Check ---
    if [ "$RESET_MAIN" = false ] && [ -f "$dir/Main.java" ]; then
        echo -e "   ${BLUE}↳ Main.java   (Exists)   :${NC}$slug/Main.java"
        ((COUNT_MAIN_EXISTING++))
    else
        rm -f "$dir/Main.java"
        if ! python3 "$MAIN_GEN_SCRIPT" "$dir"; then
            rm -f "$dir/Main.java"
            echo -e "\n${RED}✖ Halting init-slugs.sh in Phase 2 due to compilation/generation error in '$slug'.${NC}"
            exit 1
        fi
        echo -e "   ${GREEN}↳ Main.java   (Compiled) :${NC}$slug/Main.java (Java 21 ✓)"
        ((COUNT_MAIN_GENERATED++))
    fi
done

# Calculate total duration
END_TIME=$(date +%s)
DURATION=$((END_TIME - START_TIME))
MINUTES=$((DURATION / 60))
SECONDS_REMAINDER=$((DURATION % 60))

if [ "$MINUTES" -gt 0 ]; then
    TIME_STR="${MINUTES}m${SECONDS_REMAINDER}s"
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
echo -e " ${BOLD}Total Time Taken                   :${GREEN}${TIME_STR}${NC}"
echo -e "${BOLD}========================================================${NC}\n"