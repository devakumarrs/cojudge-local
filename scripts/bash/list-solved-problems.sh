#!/bin/bash
# ==============================================================================
# list-solved-problems.sh
# ------------------------------------------------------------------------------
# Outputs a deduplicated list of solved problem slugs (most recently solved
# first) by scanning Git history for commits that touched exactly one
# `problems/<slug>` directory. Bulk commits touching multiple directories
# (e.g., backups or import cleanups) are automatically ignored.
#
# Reads the whole history in a single `git log` pass, so it stays fast as the
# number of commits grows.
#
# Usage:
#   ./scripts/bash/list-solved-problems.sh
# ==============================================================================

set -e -o pipefail

# Each commit is printed as a `@@COMMIT@@` marker line followed by its changed
# file paths. `--no-renames` lists a moved file under both its old and new
# directories, so a move between two problems is never mistaken for a solve.
git log --format='tformat:@@COMMIT@@' --name-only --no-renames | awk '
    function flush_commit() {
        if (dir_count == 1 && only_dir ~ /^problems\//) {
            split(only_dir, parts, "/")
            if (!(parts[2] in seen)) {
                seen[parts[2]] = 1
                print parts[2]
            }
        }
        split("", commit_dirs)
        dir_count = 0
        only_dir = ""
    }

    $0 == "@@COMMIT@@" { flush_commit(); next }
    $0 == ""           { next }

    {
        # Top-level directory pair, e.g. `problems/<slug>` (or the file name itself)
        n = split($0, parts, "/")
        dir = (n >= 2) ? parts[1] "/" parts[2] : parts[1]
        if (!(dir in commit_dirs)) {
            commit_dirs[dir] = 1
            dir_count++
            only_dir = dir
        }
    }

    END { flush_commit() }
'
