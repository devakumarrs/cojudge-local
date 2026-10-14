#!/bin/bash
# ==============================================================================
# list-solved-problems.sh
# ------------------------------------------------------------------------------
# Outputs a deduplicated list of solved problem slugs (most recently solved
# first) by scanning Git history for commits that touched exactly one
# `problems/<slug>` directory. Bulk initialization commits touching multiple
# directories are automatically ignored.
# ==============================================================================

set -e

git log --format="%H" | while read -r commit_hash; do
    files=$(git diff-tree --no-commit-id --name-only -r "$commit_hash" | grep -v '^$')
    
    if [[ -z "$files" ]]; then
        continue
    fi
    
    unique_dirs=$(echo "$files" | cut -d'/' -f1,2 | sort -u)
    dir_count=$(echo "$unique_dirs" | wc -l | tr -d ' ')
    
    if [[ "$dir_count" -eq 1 ]] && [[ "$unique_dirs" == problems/* ]]; then
        echo "$unique_dirs" | cut -d'/' -f2
    fi
done | awk '!seen[$0]++'