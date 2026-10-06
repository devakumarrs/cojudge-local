# CoJudge content

This folder is yours. CoJudge reads problems and courses from here first.

- `problems/<slug>/` — statement.md, metadata.json, official-tests.json, Marker.java, solution.md (optional), images
- `courses/<course-id>/courseinfo.json` — category order + problem lists

You can view, edit, add or delete anything here — changes take effect
immediately (no restart needed, just refresh the browser or re-run the CLI).

After you add a problem, verify it with the CoJudge CLI (Docker required):

```bash
cojudge run <slug> Solution.py
cojudge submit <slug> Solution.py
```

Missing files are seeded from the bundled CoJudge content on startup and
pristine (unedited) copies are auto-updated when a new CoJudge version
ships fixes — your edits are never overwritten. If a problem shows as
"Modified" but you never edited it, reset it with `cojudge sync --reset
<slug>` (or delete its folder to re-seed). Set COJUDGE_CONTENT_DIR
to use a different folder.
