#!/bin/bash
set -e

# Loop through all commit hashes (most recent first)
git log --format="%H" | while read -r commit_hash; do
    # Get the list of files modified in this commit (filtering out empty lines)
    files=$(git diff-tree --no-commit-id --name-only -r "$commit_hash" | grep -v '^$')
    
    # Skip empty commits
    if [[ -z "$files" ]]; then
        continue
    fi
    
    # Extract the first two path components (e.g., 'problems/two-sum') and get unique entries
    unique_dirs=$(echo "$files" | cut -d'/' -f1,2 | sort -u)
    
    # Count how many unique top-level/slug directories were modified in this commit
    dir_count=$(echo "$unique_dirs" | wc -l | tr -d ' ')
    
    # If exactly 1 unique directory path was modified and it falls under 'problems/'
    if [[ "$dir_count" -eq 1 ]] && [[ "$unique_dirs" == problems/* ]]; then
        # Extract and print just the slug
        echo "$unique_dirs" | cut -d'/' -f2
    fi
# Filter duplicates while preserving the chronological order (most recent first)
done | awk '!seen[$0]++'