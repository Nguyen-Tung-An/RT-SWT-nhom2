# data/raw/ — Raw Dataset Source (immutable)

Provenance for the dataset in `../full_ground_truth.csv`, `../pilot_sample.csv`,
`../pilot_ground_truth.csv`. **Do not edit** the raw source — treat as read-only input.
The cloned source repositories themselves live in `data-research/raw/` (Java) and the
repo-root `raw/` (Python); this file records where they came from, their license, the
CSV column layout, and the download date.

- **Download / pin date:** 2026-06-27
- **CC measuring tool:** `lizard` 1.23.0
- **Complexity band:** Cyclomatic Complexity 5–10 (medium)
- **N = 120** functions (60 Java + 60 Python)

## Sources & licenses

### Java — 8 Defects4J subject programs (pinned commits)

| Repo | URL | License | Commit (pinned) |
|---|---|---|---|
| `commons-math` | https://github.com/apache/commons-math | Apache-2.0 | `af1d9529e3638d60bc60b1effe4dfb588a44ca96` |
| `commons-cli` | https://github.com/apache/commons-cli | Apache-2.0 | `6ed9cde56ad8b2357f75d01052fd47685645e004` |
| `commons-csv` | https://github.com/apache/commons-csv | Apache-2.0 | `b346046e10a5833e5f6143fd0162155bb51ccc87` |
| `commons-collections` | https://github.com/apache/commons-collections | Apache-2.0 | `0cf09633b39e81c0e0a3c8d69bff2f7005169e14` |
| `gson` | https://github.com/google/gson | Apache-2.0 | `c9f3fd55854a743b66f857ace3c7b268ea3e2ef7` |
| `jsoup` | https://github.com/jhy/jsoup | MIT | `d8c49e5ec72a08ca1ac4e08740e70dc0f47ad911` |
| `joda-time` | https://github.com/JodaOrg/joda-time | Apache-2.0 | `d6ba4f03c242c12feac308ac25b841a8c9457674` |
| `jfreechart` | https://github.com/jfree/jfreechart | LGPL-2.1 | `98d9c90b6e0a1e553a506497daaf64a5704a4413` |

### Python (pinned commits)

| Repo | URL | License | Commit (pinned) |
|---|---|---|---|
| `requests` | https://github.com/psf/requests | Apache-2.0 | `d64b9ad4bf1c14e21e0df3f0f4320fec81180e91` |
| `flask` | https://github.com/pallets/flask | BSD-3-Clause | `36e4a824f340fdee7ed50937ba8e7f6bc7d17f81` |

> `.git/` folders were removed after cloning. To reproduce exactly:
> `git clone <URL>` then `git checkout <commit>`.

## Column layout — `full_ground_truth.csv` / `pilot_sample.csv`

| Column | Meaning |
|---|---|
| `func_id` | Unique id (`JA-001` Java, `PY-001` Python) |
| `language` | `java` or `python` |
| `source_repo` | Origin repo slug (e.g. `apache/commons-cli`) |
| `file` | Path of the source file the function was mined from |
| `func_name` | Function / method name |
| `cc` | Cyclomatic complexity (5–10) |
| `nloc` | Lines of code (Lizard NLOC) |
| `params` | Parameter count |
| `start_line`, `end_line` | Span of the function in the source file |
| `raw_source_path` | Path to the extracted single-function file (LLM input) |

## Extra columns — `pilot_ground_truth.csv`

Above columns **plus** empty annotation columns to be filled by hand (≥2 annotators → IAA):
`annotator_dg`, `annotator_rw`, `final_label`, `notes`.

See `data-research/README.md` for the full mining pipeline and `data-research/notes.md`
for the sampling log.
