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

Zero/one-shot evaluation of **GPT-4o-mini** generating unit tests for **Java & Python functions at medium cyclomatic complexity (CC 5–10)**, benchmarked against automated baselines (EvoSuite/Randoop for Java, Pynguin/Hypothesis for Python) using **branch coverage** and **mutation score** with statistical testing. Goal: locate the CC "breaking point" where the LLM stops being effective.

- **RQ1** — Branch coverage ≥ 80%? (One-sample Wilcoxon)
- **RQ2** — Mutation score ≥ 60% and higher than baselines? (Paired Wilcoxon)
- **RQ3** — Negative CC ↔ quality correlation? (Spearman ρ)

> **Amendments (finalized by the team 2026-07-02, to be confirmed with GV before the full run):**
> - **v1.1 — Model:** `gpt-4o-2024-08-06` → **`gpt-4o-mini-2024-07-18`** (API-access constraint; RQ / metric / threshold / test unchanged). See `ms-analysis/proposal-amendment-v1.1.md`.
> - **v1.2 — Dataset:** Defects4J + CodeXGLUE (N=100) → **team-mined set of 120 functions (60 Java + 60 Python) from 10 pinned OSS repos** (8 Defects4J subject programs + requests/flask, CC 5–10; provenance in `data/raw/README.md`). See `ms-analysis/proposal-amendment-v1.2.md`.

## Progress

- [x] **RBL-1** — Paper search + merge + GAP assignment (Weeks 3–4)
- [x] **RBL-2** — Deep GAP analysis (Week 5)
- [x] **RBL-3** — Proposal + experiment design (Weeks 5–6) — *amendment v1.1 pending GV*
- [ ] **RBL-4** — Experiment (Weeks 7–8) — *Pilot done; full run + metrics + figures pending*
- [ ] **RBL-5** — Report & presentation (Weeks 9–10)

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
