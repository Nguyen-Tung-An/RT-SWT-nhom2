# Work Log — Second Study (Clean Dataset)

A chronological record of the post-defense work: what was measured, what was found, what was
fixed, and what was written. Every number here traces to `ms-analysis/RESULTS-clean.md`
(generated from CSV, never hand-typed) or to the commit noted beside it.

This document doubles as an AI-use disclosure: the measurement scripts, the re-measurement,
the error catalogue, and the drafting were carried out with AI assistance under the authors'
direction. The authors' own-words rewrite of each section lives in `paper2/humanized/` and is
the basis for the submitted `paper2/sections/*.tex`.

---

## At a glance

| Phase | Dates | What happened |
|---|---|---|
| 0 | before 07-20 | First study defended; dataset locked by amendment v1.2 |
| 1 | 07-20 | Root-caused the mass failures; repaired tiers T1–T2 |
| 2 | 07-21 | Built true mutation-on-target measurement (T4); catalogued measurement defects |
| 3 | 07-23 | Built a clean dataset under fixed criteria; pre-registered the second study |
| 4 | 07-23 | Ran all baselines (EvoSuite, Randoop, Pynguin); found the 6th measurement defect |
| 5 | 07-23 → 07-24 | Wrote Paper 2 (Springer LNCS); verified every number against source data |
| 6 | 07-24 | Rewrote all sections in the authors' voice; produced a full-English readable paper |

---

## Phase 0 — Starting point

The first study evaluated GPT-4o-mini unit-test generation on 120 medium-complexity
functions. Its dataset was locked by amendment v1.2 and had already been defended. That
dataset and its published numbers are **left unchanged** throughout the work below; the
second study stands beside it rather than replacing it (this is what keeps the re-analysis
from being result-shopping).

---

## Phase 1 — Why so many suites failed (07-20)

The first study reported high "validity" rates, but the underlying measurement turned out to
be counting the wrong thing. Work this day:

- **Traced the root cause of the mass failures.** The binding constraint was not naming the
  target — it was **constructing the receiver object** the test needs. Fixing the target
  name alone did not help; the model still could not build the object to test.
- **Repaired the lower tiers.** Added per-test green-checking (keep the passing tests, drop
  the failing ones) to both the Java and Python harnesses, and verified all 120 targets are
  actually resolvable at run time (119 direct, 1 closure, 0 failures).
- **Separated Pynguin's generation phase from its measurement phase**, so a tool crash is no
  longer silently scored as 0.
- **Ran a full A/B of prompt v1 vs v2.** v2 (target-specified) was clearly better, but the
  original all-or-nothing "valid" criterion hid the improvement.
- **Caught a self-inflicted bug:** an early "v3" prompt contradicted itself (declaring class
  vs constructor module). Fixed it, and later found v3 was accidentally *zero-shot* — it had
  dropped the worked example — which confounded two variables at once.

---

## Phase 2 — Measuring what actually matters (07-21)

Compilation and green-test rates can be satisfied without testing anything. This phase built
a tier that cannot be gamed and audited the whole pipeline.

- **Built true mutation-on-target measurement (T4):** mutate a copy of the source tree,
  restricted to the target's line range, and count a mutant as killed only when a test that
  was green on the original now fails. A suite that constructs nothing kills nothing.
- **Re-measured Java compilation honestly:** the true rate was **28.3 %**, not the 85 %
  the first study reported — a gap of 34 functions, caused by a miner bug that mis-attributed
  the declaring class. The dominant obstacle was **access barriers (54 %)**.
- **Proved `private` methods are reachable** via reflection (ran it live), which is exactly
  why a compilation-based rate is meaningless for reflective suites.
- **First results at T4:** Python 13 → 23/60; Java v1 6/60 → v4 10/60.
- **Wrote three summary documents:** the four-tier measurement design, the causal chain, and
  the first catalogue of measurement defects.
- **Caught another self-inflicted bug:** a JUnit classpath/version ordering issue that made
  the launcher discover 0 tests while exiting successfully.

The recurring pattern, stated once: *a metric stops measuring what it claims, and returns a
plausible number instead of erroring.*

---

## Phase 3 — A clean dataset, pre-registered (07-23)

To separate "the generator failed" from "the target was never testable", the benchmark was
rebuilt under five testability criteria fixed in advance.

- **`mine_clean.py`** mines candidates under F1–F5 (non-trivial body, public/exported,
  unambiguous name, verified declaring class, dynamically resolvable) with a transparent
  funnel: **1,848 → 753 → 474**; final pool Java 406, Python 64.
- **`DATA-STANDARDS.md`** documents the legitimate-filter vs cherry-picking boundary and the
  evidence for each criterion.
- **`PREREGISTRATION-clean.md`** was committed **before any baseline ran** (commit `e701597`):
  research questions, hypotheses (including H-B, which predicts the enriched prompt is *not*
  better), locked baseline configs, and the two-branch Pynguin design.
- **`run_experiment_v3fair.py`** keeps the v1 prompt exactly and inserts only the target
  block, so v1 vs v2 differs in exactly one variable (fixing the earlier zero-shot confound).

---

## Phase 4 — Baselines and the sixth defect (07-23)

All three established generators were measured with the same four-tier harness, under the
pre-registered configs.

- **EvoSuite, Randoop, Pynguin** measured; results attributed to individual functions by
  line range, exactly as for the LLM suites.
- **Sixth measurement defect — the most consequential.** The Java runner and tests were
  compiled with the default JDK (class file version 61) but run under JDK 11 (reads up to
  55). The `UnsupportedClassVersionError` was thrown inside a child process, so the harness
  saw only a missing result line and recorded "no tests ran" for **every** target. EvoSuite
  scored a false **0/60**, which a paired test turned into **p = 0.005, rank-biserial −1.000**
  — a statistically significant claim in the wrong direction. After the fix: EvoSuite **24/60**.
- **Retracted a wrong diagnosis of my own:** I had claimed Randoop's 18/60 was also affected
  by the JDK mismatch. It was not — Randoop uses one JDK throughout. Its number stood.
- **Green-gate asymmetry found and corrected.** Python filtered green tests per-test (per the
  pre-registered T2); Java rejected the whole function if any test failed. The two languages
  measured different things under one name. Corrected to match the registered definition, and
  — because the fix favours the model — the pre-correction numbers were committed **first**
  (`ca5485f`), both gates are reported side by side, and no conclusion is stated unless it
  holds under both (pre-registration amendment 4bis, `6240a35`).
- **`report_clean.py`** generates the consolidated results table straight from CSV — no
  hand-typed numbers.

Final baseline picture (T4): Python — GPT v1 16/60, v2 22/60, Pynguin 2/60 (both configs);
Java — EvoSuite 23–24/59, Randoop 18–19/59, GPT 10–16/59.

---

## Phase 5 — Writing and verifying Paper 2 (07-23 → 07-24)

- Wrote all seven sections plus the Abstract in Springer LNCS format, resting every claim on
  T4.
- **Key finding, stated as it is:** the target specification raises *reach* (Python T3
  29/60 → 42/60, p = 0.003) but not *fault detection* (T4 16/60 → 22/60, p = 0.33). It
  improves arrival, not discrimination — a split a coverage-only study would have missed.
- **Second finding:** the model beats Pynguin decisively on Python but trails EvoSuite and
  Randoop on Java; neither family wins outright.
- **Adversarial verification.** Multiple workflow passes (dozens of agents) checked every
  quantitative claim in every section against the source CSVs. They caught real errors —
  "seven defects" that should read "six", a `39/36` compile-fail count that should be
  `38/35` after excluding the mis-sampled target, a mutation cap wrongly stated as uniform
  (it is 20 for Java, 30 for Python), and a "1 function differs" that should be "4". All were
  corrected.
- **Reviewed the authors' own-words rewrites.** Each humanization pass tended to reintroduce
  factual errors — reversed comparison directions, an invented exception name, dropped
  self-admissions. Every pass was checked against the data and corrected while keeping the
  authors' wording; the reviewed versions are in `paper2/humanized/`.

---

## Phase 6 — Author voice, full English (07-24)

- **Reconciled a parallel edit from a teammate** (the Abstract) via a clean three-way merge;
  took the more precise Abstract and kept the enhanced `.txt` exporter.
- **Moved the authors' humanized prose into the LaTeX sources.** All seven sections now carry
  the authors' voice, with citations, cross-references, tables, and math re-attached; the
  PDF builds clean (19 pages, 0 undefined references or citations).
- **Made the plain-text export full-English** (`Table:` instead of the earlier Vietnamese
  label), so `paper2/backup/*.txt` reads as an English paper end to end.
- **Added the class code** (Group 2 — SE1944) and supervisor to the author block, matching
  the original paper.

---

## The six measurement defects (the paper's most transferable output)

Each returned a plausible number after the measurement had stopped working; none raised an
error. Four of the six were introduced while repairing the other two.

1. A compilation flag inferred from a coverage report — counted classes that were never loaded.
2. "At least one test executed" — counted files where every test failed.
3. Reflection — turned names into strings the compiler never checks.
4. A JUnit version mismatch — the launcher found 0 tests and exited successfully.
5. A JDK version mismatch — the child process crashed and the harness read it as "no tests".
6. A green-test gate implemented differently in the two languages under one name.

---

## Methodological safeguards

- **Pre-registration before measurement** — RQs, hypotheses, and configs committed before any
  baseline ran; H-B was written to predict *against* the enriched prompt.
- **The prior dataset is untouched** — the second study is reported beside the first, not in
  place of it.
- **Both gates, both configs, side by side** — where a repair moved results in the authors'
  favour, both settings are reported and no conclusion depends on which a reader prefers.
- **Numbers are generated, not typed** — `report_clean.py` produces every table from CSV.
- **Every claim adversarially verified** against the source data before submission.

---

## Where to find things

| Need | File |
|---|---|
| Final numbers | `ms-analysis/RESULTS-clean.md` (run `scripts/report_clean.py`) |
| Pre-registration | `ms-analysis/PREREGISTRATION-clean.md` |
| Data-selection standards | `ms-analysis/DATA-STANDARDS.md` |
| Measurement-defect catalogue | `ms-analysis/MEASUREMENT-PITFALLS.md` |
| Why v2 helps Python not Java | `ms-analysis/ANALYSIS-why-v2-helps-python-not-java.md` |
| The paper | `paper2/main.tex` + `paper2/sections/*.tex` |
| Authors' own-words rewrites | `paper2/humanized/*_FINAL.txt` |
| Plain-text paper (English) | `paper2/backup/*.txt` (run `python paper2/backup_txt.py`) |
