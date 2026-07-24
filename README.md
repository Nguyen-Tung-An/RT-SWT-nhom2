# LLM for Unit Test Case Generation

**Topic:** SE1944 (`RT-SWT-nhom2`)
**Course:** SWT301 — Research-Based Learning, FPT University
**Group:** Group 2 — Summer 2026
**Supervisor (GV):** L.T.Q.Chi

## Members & roles

| Role | Member | Responsibility |
|---|---|---|
| PL — Project Lead | Ân | Coordinate timeline, submit to GV, resolve blockers |
| DG — Data & Ground Truth | Thu Kim | Dataset, CC measurement (Lizard), ground-truth labels, automated baselines |
| LR — LLM Runner | Hải | API setup, test-generation scripts, cost logging |
| MS — Metrics & Stats | Phúc | Coverage/mutation measurement, statistical tests, effect size |
| RW — Report Writer | Lộc | Intro/Conclusion/Threats, figures, formatting |

## Research summary

One-shot evaluation of **GPT-4o-mini** generating unit tests for **Java & Python functions at medium cyclomatic complexity (CC 5–10)**, benchmarked against automated baselines (EvoSuite/Randoop for Java, Pynguin for Python) using **branch coverage** and **mutation score** with statistical testing. The original goal was to locate the CC "breaking point" at which the LLM stops being effective.

**Research questions and hypotheses** (thresholds fixed in the approved proposal, before any data were collected):

- **RQ1 — Coverage threshold.** Asked in a single one-shot prompt to test one function of medium complexity (5 ≤ CC ≤ 10) drawn from a real open-source project, does GPT-4o-mini produce a suite whose **median branch coverage over that function's own lines** reaches the 80% industry target?
  *H1: median branch coverage ≥ 80%.* — One-sample Wilcoxon vs. 80.
- **RQ2-A — Mutation threshold.** Does the same suite detect injected faults at a **median mutation score of at least 60%** (set deliberately above the ~34% reported for LLM-generated suites in prior work)?
  *H2-A: median mutation score ≥ 60%.* — One-sample Wilcoxon vs. 60.
- **RQ2-B — Comparison with baselines.** Matched function by function, does it score **above** EvoSuite and Randoop (Java) and Pynguin (Python), run on the same targets under a fixed budget?
  *H2-B: GPT-4o-mini > each baseline.* — Paired Wilcoxon, matched by `function_id`.
- **RQ3 — Complexity vs. quality.** Within the narrow 5–10 band alone, does complexity correlate **negatively** with the coverage achieved — does quality degrade measurably as CC rises inside one band?
  *H3: Spearman ρ < 0.* — Spearman correlation.

> **Outcome:** all four hypotheses were rejected or unsupported. Coverage and mutation fell short of both thresholds; the model lost to the Java baselines but beat Pynguin on Python; and the CC correlation was slightly **positive** and not significant, so no "breaking point" was found inside the band.

> **Amendments (finalized by the team 2026-07-02, to be confirmed with GV before the full run):**
> - **v1.1 — Model:** `gpt-4o-2024-08-06` → **`gpt-4o-mini-2024-07-18`** (API-access constraint; RQ / metric / threshold / test unchanged). See `ms-analysis/proposal-amendment-v1.1.md`.
> - **v1.2 — Dataset:** Defects4J + CodeXGLUE (N=100) → **team-mined set of 120 functions (60 Java + 60 Python) from 10 pinned OSS repos** (8 Defects4J subject programs + requests/flask, CC 5–10; provenance in `data/raw/README.md`). See `ms-analysis/proposal-amendment-v1.2.md`.

## Progress

- [x] **RBL-1** — Paper search + merge + GAP assignment (Weeks 3–4)
- [x] **RBL-2** — Deep GAP analysis (Week 5)
- [x] **RBL-3** — Proposal + experiment design (Weeks 5–6) — *amendments v1.1, v1.2*
- [x] **RBL-4** — Experiment (Weeks 7–8) — full run, metrics, figures
- [x] **RBL-5** — Report & presentation (Weeks 9–10) — *paper 1 defended*
- [x] **Post-defense study** — second paper on a rebuilt, testability-filtered dataset (below)

## Second paper (post-defense)

After the defense we audited the measurement pipeline and found that a large part of the
reported failure rate belonged to the **benchmark**, not the model: of 1,848 functions in the
CC 5–10 band, only **26%** are simultaneously public and unambiguously named, so roughly three
quarters cannot be reached by any external test. We rebuilt the dataset under five testability
criteria fixed in advance, re-measured everything at four nested tiers, and ran all three
baselines through the same harness.

| | Paper 1 | Paper 2 |
|---|---|---|
| Dataset | 120 functions, complexity-only sampling | 120 functions, complexity **+ testability** (F1–F5) |
| Primary metric | branch coverage, mutation score | **mutation score on the target's own lines** (T4) |
| Format | IEEE (`IEEEtran`) | **Springer LNCS** (`llncs`) |
| Location | [`paper/`](paper/) | [`paper2/`](paper2/) |

**Headline results of paper 2.** Supplying the model with the target's fully qualified name,
signature, declaring class and a verified constructor call raises the share of Python suites
that *reach* the target from 29/60 to 42/60 (p = 0.003) but not the share that *detects a
fault* (16/60 → 22/60, p = 0.33) — it improves arrival, not discrimination. The ordering also
reverses by language: the model beats Pynguin on Python (2/60) yet trails EvoSuite (23/59) and
Randoop (19/59) on Java. Six ways a measurement can fail silently are catalogued, four of them
introduced by us while repairing the other two.

Key documents:

| Need | File |
|---|---|
| Final numbers (generated from CSV) | [`ms-analysis/RESULTS-clean.md`](ms-analysis/RESULTS-clean.md) |
| Pre-registration (committed before baselines ran) | [`ms-analysis/PREREGISTRATION-clean.md`](ms-analysis/PREREGISTRATION-clean.md) |
| Data-selection standards (F1–F5) | [`ms-analysis/DATA-STANDARDS.md`](ms-analysis/DATA-STANDARDS.md) |
| Catalogue of measurement defects | [`ms-analysis/MEASUREMENT-PITFALLS.md`](ms-analysis/MEASUREMENT-PITFALLS.md) |
| How everything was measured, with tool versions | [`paper2/MEASUREMENT-JOURNAL.md`](paper2/MEASUREMENT-JOURNAL.md) |
| Work log / AI-use disclosure | [`paper2/WORK-LOG.md`](paper2/WORK-LOG.md) |

## Repository layout

```
RT-SWT-nhom2/
├── SLR/                     # Systematic literature review (RBL-1/2)
│   ├── papers/              # Included papers (danh sách trong README; PDF đã gỡ — bản quyền)
│   ├── 01_all_records.csv / 02_after_screening_v1.csv / 03_final_included.csv
│   ├── evidence_table.md / gap_statement.md / gap-analysis.md
│   ├── ie-criteria.md / prisma_flow.md / search-log.md
│   └── experiment/          # RQ, hypotheses, design-rationale
├── team-synthesis/          # RBL-3 deliverables
│   ├── evidence-table-merged.md / gap-assignment.md / gap-final.md / proposal.md
├── data/                    # raw/, pilot_sample.csv, *_ground_truth.csv
├── scripts/                 # run_experiment.py, run_baselines.py, test_api.py
├── generated_tests/         # gpt4o*/{java,python}, evosuite/java (randoop đã gỡ — xem randoop/README.md)
├── results/                 # pilot_llm_output.csv, pilot_api_log.txt, generation_log.csv
├── ms-analysis/             # metric measurement (JaCoCo/PIT, Coverage.py/pytest-mutagen) + notebooks
├── notes.md                 # technical decisions + error log
└── README.md
```

## How to run (experiment)

1. **API key:** `export OPENAI_API_KEY=...` (do **not** commit the key).
2. **Gate E3 — API test:** `python scripts/test_api.py`
3. **Generate tests:** `python scripts/run_experiment.py` (LLM) and `python scripts/run_baselines.py` (Randoop/EvoSuite/Pynguin/Hypothesis).
4. **Measure metrics:** see `ms-analysis/README.md` (JaCoCo + PIT for Java, Coverage.py + pytest-mutagen for Python).
5. **Analyze:** `ms-analysis/notebooks/pilot_analysis.ipynb` → `full_analysis.ipynb` → `results/summary.csv`.

> Commit after every batch — never wait until the end. Never commit API keys, `.env`, `__pycache__/`.
