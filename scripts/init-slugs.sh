#!/bin/bash

# Exit immediately if any command fails
set -e

# Enable alias expansion for this non-interactive script
shopt -s expand_aliases

# Search for the alias in common shell configuration files
ALIAS_CMD=$(grep -h "alias cojudge=" ~/.zshrc ~/.bashrc ~/.bash_profile ~/.profile 2>/dev/null | head -n 1)

# Check if the alias was actually found
if [ -z "$ALIAS_CMD" ]; then
    echo "Error: Could not find 'cojudge' alias in your shell configuration files."
    exit 1
fi

# Evaluate the extracted alias
eval "$ALIAS_CMD"

# Find the problems directory relative to this script
PROBLEMS_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/../problems" && pwd)"

if [ ! -d "$PROBLEMS_DIR" ]; then
    echo "Error: 'problems' directory not found at $PROBLEMS_DIR"
    exit 1
fi

echo "Scanning $PROBLEMS_DIR..."

for dir in "$PROBLEMS_DIR"/*/; do
    [ -d "$dir" ] || continue
    
    slug=$(basename "$dir")
    
    # Skip the example problem
    if [ "$slug" = "reverse-linked-list" ]; then
        echo "Skipping example: $slug"
        continue
    fi
    
    echo "Initializing: $slug"
    
    # Run the expanded cojudge alias in a subshell
    (
        cd "$dir" || exit 1
        cojudge init "$slug" --lang java --output Solution.java
    ) || {
        echo "Error: Failed to initialize '$slug'. Halting script."
        exit 1
    }
done

echo "All problems initialized successfully."
