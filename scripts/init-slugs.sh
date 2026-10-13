#!/bin/bash

# Exit immediately if any command fails
set -e

# Enable alias expansion for this non-interactive script
shopt -s expand_aliases

# Define ANSI color codes for pretty output
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
BOLD='\033[1m'
NC='\033[0m' # No Color

# Search for the alias in common shell configuration files
ALIAS_CMD=$(grep -h "alias cojudge=" ~/.zshrc ~/.bashrc ~/.bash_profile ~/.profile 2>/dev/null | head -n 1)

# Check if the alias was actually found
if [ -z "$ALIAS_CMD" ]; then
    echo -e "${YELLOW}Error: Could not find 'cojudge' alias in your shell configuration files.${NC}"
    exit 1
fi

# Evaluate the extracted alias
eval "$ALIAS_CMD"

# Get the directory where this script resides
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# Verify the list-solved-problems.sh script exists in the same directory
SOLVED_SCRIPT="$SCRIPT_DIR/list-solved-problems.sh"
if [ ! -f "$SOLVED_SCRIPT" ]; then
    echo -e "${YELLOW}Error: list-solved-problems.sh not found at $SOLVED_SCRIPT${NC}"
    exit 1
fi

echo -e "${CYAN}Fetching list of already solved problems...${NC}"
# Execute the script and store the output (list of solved slugs)
SOLVED_SLUGS=$(bash "$SOLVED_SCRIPT")

# Find the problems directory relative to this script
PROBLEMS_DIR="$(cd "$SCRIPT_DIR/../problems" && pwd)"

if [ ! -d "$PROBLEMS_DIR" ]; then
    echo -e "${YELLOW}Error: 'problems' directory not found at $PROBLEMS_DIR${NC}"
    exit 1
fi

echo -e "${CYAN}Scanning $PROBLEMS_DIR...${NC}\n"

# Initialize Counters
COUNT_TOTAL=0
COUNT_EXAMPLE_SKIPPED=0
COUNT_SOLVED_SKIPPED=0
COUNT_EXISTING_SKIPPED=0
COUNT_NEWLY_INITED=0

for dir in "$PROBLEMS_DIR"/*/; do
    [ -d "$dir" ] || continue
    
    slug=$(basename "$dir")
    ((COUNT_TOTAL++))
    
    # Skip the example problem
    if [ "$slug" = "reverse-linked-list" ]; then
        echo -e " ${YELLOW}⊘ Skipped (Example)    :${NC} $slug"
        ((COUNT_EXAMPLE_SKIPPED++))
        continue
    fi
    
    # Check if the current slug is in our list of solved slugs
    if echo "$SOLVED_SLUGS" | grep -qw "$slug"; then
        echo -e " ${CYAN}✓ Skipped (Solved)     :${NC} $slug"
        ((COUNT_SOLVED_SKIPPED++))
        continue
    fi
    
    # Check if Solution.java already exists in the directory
    if [ -f "$dir/Solution.java" ]; then
        echo -e " ${BLUE}✦ Skipped (Initialized) :${NC} $slug"
        ((COUNT_EXISTING_SKIPPED++))
        continue
    fi
    
    echo -e " ${GREEN}▶ Initializing          :${NC} $slug"
    
    # Run the expanded cojudge alias in a subshell
    (
        cd "$dir" || exit 1
        cojudge init "$slug" --lang java --output Solution.java > /dev/null 2>&1
    ) || {
        echo -e "\n${YELLOW}Error: Failed to initialize '$slug'. Halting script.${NC}"
        exit 1
    }
    ((COUNT_NEWLY_INITED++))
done

# Print Summary
echo -e "\n${BOLD}====================================================${NC}"
echo -e "${BOLD}               INITIALIZATION SUMMARY               ${NC}"
echo -e "${BOLD}====================================================${NC}"
echo -e " Total Problems Found              : ${BOLD}${COUNT_TOTAL}${NC}"
echo -e " --------------------------------------------------"
echo -e " ${CYAN}Solved & Skipped                  : ${COUNT_SOLVED_SKIPPED}${NC}"
echo -e " ${BLUE}Unsolved but already Initialized  : ${COUNT_EXISTING_SKIPPED}${NC}"
echo -e " ${YELLOW}Example Problems Skipped          : ${COUNT_EXAMPLE_SKIPPED}${NC}"
echo -e " ${GREEN}Newly Initialized                 : ${COUNT_NEWLY_INITED}${NC}"
echo -e "${BOLD}====================================================${NC}\n"