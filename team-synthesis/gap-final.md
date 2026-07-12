# GAP Final — LLM-based Unit Test Generation

**Status:** Final (team decision) — supersedes the per-member `gap-statement.md`.
**Evidence table:** N = 41 papers. Citation numbers (`[n]`) refer to the SLR `evidence_table.md` numbering; the de-duplicated team copy is `evidence-table-merged.md` (N = 40 after removing 1 duplicate).

---

## Final Decision (the chosen GAP)

| Role | GAP | Drives |
|---|---|---|
| **Primary GAP** | **GAP-T (Technology)** — no controlled, complexity-stratified (CC 5–10) evaluation of zero-shot LLM test generation | **RQ1** (coverage threshold) and **RQ3** (complexity–quality correlation) |
| Secondary GAP | **GAP-M (Metric)** — branch coverage + mutation score rarely reported together with statistical significance | **RQ2** (coverage + mutation with statistical testing) |
| Secondary GAP | **GAP-D (Dataset)** — no cross-language (Java + Python) dataset controlled for CC | The cross-language Java/Python experiment design |

---

## Evidence Overview

| Attribute | Value |
|---|---|
| Total INCLUDED papers | 41 |
| Papers using Java | 24 |
| Papers using Python | 14 |
| Papers using both | 4 |
| Papers with feedback loop / self-repair | 12 |
| Papers measuring mutation score | 13 |
| LLMs used | GPT-4, GPT-4o, GPT-4o-mini, GPT-3.5-turbo, Codex, Gemini, Claude, DeepSeek, Llama, StarCoder, Qwen, CodeLlama |
| Reported metrics | branch coverage, mutation score, line coverage, pass rate, compilation rate, cyclomatic complexity |

---

## Identified Gaps

### GAP-T (Technology): Lack of Controlled Complexity-Based Evaluation
While many studies evaluate GPT-4 on general benchmarks, none systematically isolate cyclomatic complexity (CC 5–10) as an independent variable to measure performance degradation. Existing work focuses on broad coverage metrics rather than the specific threshold where LLM reasoning fails for medium-complexity logic.

**Closest paper:** Paper [39] (TESTEVAL) and Paper [11] (Automated Test Suite Enhancement) evaluate coverage but do not control for CC as a primary variable. Paper [15] (EvoGPT) notes sensitivity to complexity but lacks a systematic CC-based analysis.

**Evidence:** Paper [39] (TESTEVAL) benchmarks GPT-4o on Python but treats complexity as an aggregate property rather than a controlled variable. Paper [15] (EvoGPT) acknowledges that LLM-based tests are sensitive to code complexity but does not define the CC 5–10 threshold. No study systematically maps GPT-4 performance against specific CC intervals to identify the point of degradation.

---

### GAP-M (Metric): Absence of Unified Coverage and Mutation Benchmarking
Most studies report either branch coverage or mutation score, but rarely both **together with statistical significance**, and **never under controlled cyclomatic complexity across both languages**. Statistical significance (Mann-Whitney U) is frequently omitted in favor of raw percentage improvements.

**Papers with mutation score:** 31, 37, 2, 40, 42, 46, 54, 56, 70, 76, 79, 89, 94

**Papers missing mutation score:** 39, 41, 7, 53, 57, 80, 83, 84, 99

**Evidence:** Paper [46] (AI-Powered Unit Test Generation) reports both metrics but without CC control or statistical significance testing. Paper [76] (LLMs as Test Generators) provides mutation scores but uses custom implementations rather than standard tools like PIT. No study combines branch coverage ≥80% and mutation score ≥60% targets with statistical significance testing **under controlled cyclomatic complexity across both Java and Python**.

---

### GAP-D (Dataset): Lack of Cross-Language Controlled Datasets
Existing datasets are typically language-specific (Java-heavy or Python-heavy), preventing a direct comparison of GPT-4's reasoning capabilities across different syntax and execution environments. There is no dataset that controls for cyclomatic complexity across both Java and Python simultaneously.

**Java-only papers:** 2, 38, 41, 40, 48, 49, 8, 42, 44, 46, 56, 59, 15, 28, 70, 71, 75, 76, 79, 80, 83, 84, 86, 105

**Python-only papers:** 31, 37, 39, 7, 10, 53, 54, 57, 11, 62, 66, 89, 94, 99

**Papers using both:** 83, 87, 92, 95

**Evidence:** Paper [83] (Evaluating LLM-Based Test Generation) uses CodeNet for both languages but focuses on software evolution rather than CC-controlled unit testing. Paper [92] (Fixturize) uses both languages but focuses on fixture generation. No study provides a dataset of functions with CC 5–10 across both languages to compare GPT-4's effectiveness.

---

## Synthesized GAP Statement

This study addresses the gap left by Paper [39] and Paper [46] by providing the first systematic, cross-language evaluation of GPT-4 that controls for cyclomatic complexity (CC 5–10) while using both branch coverage and mutation score as rigorous, statistically validated performance indicators against automated baselines (EvoSuite/Randoop for Java, Pynguin/Hypothesis for Python).

---

## Specific Failure & Solution Direction (Focused on addressing GAP-T)

**1. What exactly is the failure (with supporting evidence):**
- **The failure:** LLM-generated tests frequently encounter errors (failing to compile, missing complex logical branches). Specifically, the compilation error rate reaches up to **48–63%** [44, 86], the actual fault-detection rate (mutation score) is only about **33.8%** [54, 79], and real-world coverage is low [38] (ULT).
- **The gap (GAP-T):** Prior studies evaluate very "generically" across entire projects but **fail to pinpoint the root cause**: at what level of code complexity does the LLM start to "struggle" and fail? There is a complete absence of isolating the complexity variable (Cyclomatic Complexity - CC) for precise measurement.

**2. Improvement/Solution approach (simple, fundamental, not over-complicated):**
Instead of proposing highly complex multi-loop test-generation AI systems (repair loop, multi-agent) that have high failure rates in practice yet fail to fundamentally resolve the LLM's weakness in logical reasoning, this study addresses the root of GAP-T by:
- **Approach:** Using the Zero-shot method (the simplest and most stable) to assess the native capability of GPT-4o, while **strictly isolating and stratifying code by each complexity level (CC 5-10)**.
- **Baseline comparison:** Directly contrasting with traditional automated tools (EvoSuite/Randoop for Java, Pynguin/Hypothesis for Python) to reveal the true limits of the LLM.
- **What does it solve?** The contribution is not to create yet another error-prone complex tool, but to **measure and precisely identify the "breaking point" (CC threshold)** at which the LLM completely loses effectiveness. This is a knowledge-based conclusion with high contribution value.

**3. Who benefits from the research results?**
- **Developers & QA Engineers:** Provides practical guidance: when to use the LLM for fast test generation (for simple functions, CC < 5), and when to write tests manually or use traditional tools (for high-CC functions) to avoid wasting time fixing the low-quality code generated by the LLM.
- **Researchers / AI Engineers:** Precisely identifies the LLM's "blind spot" (complex logic, CC 5-10) so they can focus their model-improvement efforts, rather than evaluating generically as before.
- **Project Managers / Tech Leads:** Provides a clear data basis on effectiveness to decide whether to integrate automated LLM test generation into the project's CI/CD pipeline, based on the complexity of the source code.
