# cojudge-local

My [CoJudge](https://github.com/cojudge/cojudge) content folder under git,
with a small Java + VS Code workflow on top:

- **`init-slugs.sh`** creates a starter `Solution.java` and a `Main.java`
  test runner for every problem.
- **F5** debugs the open problem against its examples, judged by the
  problem's own checker (`Marker.isCorrect`).
- **ctrl+shift+c** commits one problem at a time, so git history doubles as
  a record of what's solved (`<slug>`) and reworked (`improve: <slug>`).

[CoJudge](https://github.com/cojudge/cojudge) is an offline, LeetCode-style judge (web UI + `cojudge` CLI, ~1000
problems). It seeds its problems into a content folder and refreshes files
you haven't edited when it updates. This repo *is* that folder; CoJudge
itself is unchanged.

> **Problem content is not included.** Statements, tests, checkers and
> metadata belong to CoJudge and the original authors. They are git-ignored
> and seeded locally by CoJudge. The MIT license covers only this repo's code.

| Path | Owner |
|---|---|
| `problems/<slug>/Solution.java` (or `<ClassName>.java`) | You |
| `problems/<slug>/Main.java` | Generated test runner, don't edit |
| `problems/<slug>/` everything else, `courses/` | CoJudge, don't edit |
| `scripts/`, `.vscode/` | This repo |

## Setup

1. Install the [CoJudge CLI](https://github.com/cojudge/cojudge#quickstart)
   (Docker only for `run` / `submit`), a JDK 21+, Python 3, and VS Code with
   the recommended Java extensions.
2. Point CoJudge at your clone in `~/.zshrc`, then open a new terminal:
   ```bash
   export COJUDGE_CONTENT_DIR="/path/to/clone"   # e.g. "$HOME/code/cojudge-local"
   ```
3. Seed CoJudge's files into the clone (F5 needs them):
   ```bash
   cojudge sync
   ./scripts/bash/init-slugs.sh
   ```
4. Set `java.jdt.ls.java.home` in `.vscode/settings.base.json` to your JDK.
5. Add the commit shortcut to your **user** keybindings (they can't be set
   per repo). In VS Code, run **Preferences: Open Keyboard Shortcuts (JSON)**
   from the Command Palette and add this entry inside the `[...]`
   ([docs](https://code.visualstudio.com/docs/configure/keybindings)):
   ```json
   { "key": "ctrl+shift+c", "command": "workbench.action.tasks.runTask", "args": "commit-problem" }
   ```

## Daily loop

1. Open `problems/<slug>/Solution.java` and solve it.
2. **F5** runs the examples under the debugger.
3. Run the full tests (Docker must be running), from the terminal:
   ```bash
   cojudge submit <slug> problems/<slug>/Solution.java
   ```
   or in the web UI: `cojudge` starts the server and opens
   http://localhost:5375, where you paste your code and submit.
4. **ctrl+shift+c** commits that problem.

The editor is deliberately bare (no autocomplete, hovers or squiggles).
Change that in `.vscode/settings.base.json`, never in the generated
`settings.json`.

## When CoJudge updates

```bash
cojudge update && cojudge sync
./scripts/bash/init-slugs.sh -f          # regenerate runners
git add problems courses && git commit -m "Cojudge automatic updates"
```

## Careful

- **Resetting a problem in CoJudge deletes your solution** (Manage Problems
  → reset, or `cojudge sync --reset`). Commit first; `git restore
  problems/<slug>` recovers it.
- `commit-problem.sh` only accepts changes inside a single problem folder.

More detail: [`scripts/README.md`](scripts/README.md).
