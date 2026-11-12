# Token discipline

How this repo keeps Claude Code sessions cheap: the measured numbers behind the rules, the
rules themselves, and how to check them. The rules live in `CLAUDE.md`; this file holds the
why. Contract: `~/code/token-discipline-proposal/CONTRACT.md` (v1.5).

## The one number that matters

Context is re-sent on every turn, so cost ≈ context size × turns. Measured 2026-11-12 from
all local transcripts (`tokstats.py cojudge-local`):

| Sessions | Turns | Avg ctx | Peak ctx | Input tokens | In sessions ≥100 turns | Stubbed results | Index : search | Re-reads after edit |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | 166 | 74k | 148k | 12.5M | 100% | 5 Bash + 1 Read | 0 : 0 | 0 |

One session carried everything, and six tool results were swapped for search stubs (a wasted
turn each). The repo is 34 MB of problem content: ~3,100 `.java`, ~2,070 `.json`, ~2,070
`.md`, 8 PNGs. Of 1,031 `official-tests.json` files, 63 are over 4 KiB and the largest is
360 KiB; a whole read of one is pure burn.

## Current setup

| Layer | Where | What |
| --- | --- | --- |
| Global hooks | `~/.claude/hooks/*.mjs` via `~/.claude/settings.json` | `fit-reads` trims Reads to 4 KiB, `deny-big-cat` refuses unpiped `cat` over 4 KiB, `reread-reminder` nudges once after an Edit-after-Read, `context-cap` Stop bands at 80k/100k/120k |
| Compaction cap | `~/.claude/settings.json` env (global) | `CLAUDE_CODE_AUTO_COMPACT_WINDOW=200000` + `CLAUDE_AUTOCOMPACT_PCT_OVERRIDE=70` → fires near 127k. Rebalanced 2026-11-13: the 100000/60% setting fired at 48k, 8–80 times per DeepSeek session |
| context-mode | user scope (`enabledPlugins` in `~/.claude/settings.json`) | 4 KiB tool-result cap; `ctx_execute` with `file` for big data; no `ctx_index` unless a `ctx_search` follows |
| Junk-read deny list | `.claude/settings.json` (tracked) | `backups/**`, `**/official-tests.json`, `**/Marker.java`, `.cojudge-seed.json`, `.vscode/settings.json`, `*.png`/`*.jpg`, `*.class`, `__pycache__`, `*.pyc`, `*.log`, `.DS_Store` |
| Bash allow list | `.claude/settings.json` (tracked) | `scripts/py/generate-main.py`, `scripts/py/merge-vscode-settings.py`, `scripts/bash/{compile-problem,list-solved-problems,init-slugs}.sh`, `javac`, `java` |

No doc guard here: the only tracked prose is `README.md`, `CLAUDE.md` and `scripts/README.md`,
all under 4 KiB, so `fit-reads` already covers them.

## Decisions

- **Official tests are denied, not trimmed.** They are seeded content Claude never needs to
  read; the compile/ship scripts consume them. If a failing case must be inspected, use
  `ctx_execute` with `file` set and print only the case index and the expected value.
- **`backups/progress.json` is denied.** It is a state dump that changes every run.
- **Problem statements stay readable.** `statement.md`/`solution.md` are the actual work;
  `fit-reads` caps them at 4 KiB, which fits almost all of them.
- **One problem per session.** Solve, run `scripts/bash/compile-problem.sh`, commit, `/clear`.
  The single measured session ran 166 turns and peaked at 148k; that is the pattern to break.

## Verification

- `bash ~/code/token-discipline-proposal/scripts/check-hooks.sh --installed` → four `PASS` lines.
- `python3 ~/code/token-discipline-proposal/scripts/tokstats.py --since YYYY-MM-DD cojudge-local` → sessions, turns, average and peak context, stubbed results, index vs search calls, re-reads. Compare with the table above before changing any rule.
- `python3 -c 'import json;json.load(open(".claude/settings.json"))'` after editing rules.
- Every deny or allow entry traces back to a path or command seen in a transcript (`scripts/permstats.py` derives candidates).
