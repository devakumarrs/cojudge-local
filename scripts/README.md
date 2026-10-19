# Scripts

How the three workflows in the [root README](../README.md) work.

## F5: debug a problem

| Step | File |
|---|---|
| Scope the Java language server to the open problem, so ~1000 `Solution` classes don't clash | `.vscode/prepare-problem.sh` → `py/merge-vscode-settings.py` writes `.vscode/settings.json` |
| Compile the folder with debug info | `bash/compile-problem.sh` |
| Run the folder's `Main` | `.vscode/launch.json` |

`Main.java` runs up to 2 examples from `metadata.json` and prints PASS/FAIL,
judged by `Marker.isCorrect` like CoJudge does. Codec-style design problems
are checked on the round trip; other design problems only print their input.

When stepping through, step **over** `runChecker(...)`: `Marker.java`
contains the reference solution.

## ctrl+shift+c: commit and push a problem

`bash/ship-problem.sh` commits every pending change, provided all of it is
inside one `problems/<slug>/` folder, and refuses otherwise. After committing
it pushes to `origin main`; if the push fails, the commit stays local and the
script exits with an error, so run `git push origin main` yourself once it's fixed.

A problem counts as **solved** once some commit touched only its folder
(`bash/list-solved-problems.sh` lists them). The first such commit is named
`<slug>`, later ones `improve: <slug>`. This is separate from CoJudge's own
progress tracking.

## init-slugs.sh: set up problems

```bash
./scripts/bash/init-slugs.sh                  # fill in missing files
./scripts/bash/init-slugs.sh -f [<slug>...]   # also regenerate Main.java (all: ~6 min)
```

For each problem it:

- creates a missing solution file with `cojudge init` and patches it just
  enough to compile (dummy `return`s). Solved problems' files are never
  touched.
- generates `Main.java` with `py/generate-main.py` (package `py/maingen/`),
  then compiles both to prove they build.

Imports you need inside your methods are yours to add.

## Troubleshooting

| Symptom | Fix |
|---|---|
| F5: *"Open a file inside problems/&lt;slug&gt;/"* | Focus the problem's `Solution.java`, then F5. |
| F5: *"settings.base.json is not valid JSON"* | Remove comments / trailing commas. |
| F5: `javac` errors | Your code doesn't compile; see the task terminal. |
| ctrl+shift+c refuses | Changes outside one problem folder are pending; commit those by hand. |
| ctrl+shift+c: *"pushing to origin/main failed"* | The commit is saved locally. Fix the push error (network, auth, remote ahead), then `git push origin main`. |
| `init-slugs.sh`: *"no 'cojudge' command or alias"* | Install CoJudge or add its alias to your shell profile. |
| `Main.java` breaks after a CoJudge update | `./scripts/bash/init-slugs.sh -f <slug>` |
