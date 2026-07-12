# Research Proposal: LLM for Unit Test Case Generation

**Group:** Group 2
**Members:**
- Ân (PL — Project Lead)
- Thu Kim (DG — Data & Ground Truth)
- Hải (LR — LLM Runner)
- Phúc (MS — Metrics & Stats)
- Lộc (RW — Report Writer)

**Topic code:** SE1944
**Submission date:** 2026-06-18
**Status:** Pending approval

---

## 1. Overview

This proposal evaluates the native, zero-shot capability of GPT-4o to generate unit tests for Java and Python functions of **medium cyclomatic complexity (CC 5–10)**, benchmarked against automated test-generation tools using **branch coverage** and **mutation score** with statistical testing. The goal is to identify the complexity "breaking point" at which a zero-shot LLM stops being effective.

---

## 2. Research Problem Statement

### 2.1 Context & Importance
Applying large language models (LLMs) to automated software testing is attracting strong interest due to the potential to reduce the manual effort of writing test code. However, the ability to generate logically sound test cases that achieve high coverage on complex source code has not been comprehensively evaluated. This problem is critical for QA and AI engineers: without clearly delineating the capability boundary of LLMs, developers will spend significant time correcting compilation errors or ambiguous logic errors (hallucinations) produced by the model.

### 2.2 State of the Art
Recent studies have heavily applied advanced models such as GPT-4o to test-case generation. Wang et al. (2025) [1] showed that GPT-4o reaches 98.65% line coverage on the TestEval set, but acknowledged that the model still struggles to route complex branch execution logic. Kumar et al. (2025) [3] used GPT-4o and achieved 99.05% branch coverage on HumanEval-Java, but warned that zero-shot prompting frequently produces tests that fail to compile. Similarly, Sapozhnikov et al. (2024) [2] reported that more than 50% of LLM-generated tests are malformed (do not compile). In addition, Haratian et al. (2026) [6] recorded a compilation-error rate of up to 63% on real-world code changes, and Jain & Le Goues (2025) [4] reported that the average mutation score of GPT-4o-generated tests was only a modest 33.8% on the TestGenEval benchmark.

### 2.3 GAP
**GAP statement (GAP-T):** Although GPT-4o shows good test-generation ability on simple function sets, most current studies do not control or quantify function complexity (Cyclomatic Complexity — CC). There is a shortage of controlled zero-shot empirical evaluations that pinpoint the specific "breaking boundary" (at CC 5–10) where LLM performance begins to degrade sharply, leading to high compilation-error rates and the inability to generate semantically correct tests.
**GAP type:** GAP-T (Technical Constraint)
**Evidence:** 41 papers in the evidence table directly or indirectly support this research gap, notably independent studies on the complexity limit.

### 2.4 Motivation
If this research gap is left unaddressed, DevOps and QA engineers will struggle to integrate LLMs into real CI/CD pipelines. Empirical data is needed to decide precisely when to use an LLM for automatic test generation (e.g., functions with CC < 5) and when traditional tools (Randoop/EvoSuite) are mandatory, in order to avoid wasting API cost and manual test-code repair effort.

---

## 3. Related Work

### 3.1 Overview
| Paper | Tool/LLM | Dataset (size) | Metric | Best result | Main limitation |
|---|---|---|---|---|---|
| Wang et al. (2025) [1] | GPT-4o | TestEval (210 Python) | Branch/Line Cov | 98.65% Line Cov | Struggles to comprehend complex execution logic |
| Sapozhnikov et al. (2024) [2] | ChatGPT | N/A (Java) | Compilation rate | N/A | >50% non-compiling tests |
| Kumar et al. (2025) [3] | GPT-4o, Gemini | HumanEval-Java (164) | Branch, Line, Mutation | 99.05% Branch Cov | Compilation errors with zero-shot prompting |
| Jain & Le Goues (2025) [4] | GPT-4o | TestGenEval (1,210) | pass@1, Line Cov, MS | pass@1 = 84.3%, MS = 33.8% | Dependent on LLM stochasticity |
| Konstantinou et al. (2026) [5] | GPT-4o-mini | 6 Java projects | Branch Cov, MS | Branch Cov = 35.33% | High non-compiling test rate |
| Haratian et al. (2026) [6] | GPT-4o | 353 PRs (Java) | F2P, Compilation rate | Compilation error = 63% | Ineffective for complex code |
| Lira et al. (2025) [7] | GPT-4o, Gemini | HumanEval (164 Python) | Branch Cov, Hit rate | Hit rate = 90.69% | Does not trace failure causes |
| Gu et al. (2025) [8] | ChatGPT-4.0 | Defects4J (8192) | Pass rate, Line Cov | Pass rate = 78.55% | Cannot fix deep syntax errors |
| Liu et al. (2025) [9] | GPT-4o | 183 Python modules | Statement/Branch Cov | Statement Cov = 83.0% | Incomplete semantic summaries |
| Broide et al. (2026) [10] | GPT-4o, Claude 3 | Defects4J | LCCT, BCCT, MSCT | +10% MSCT improvement | Sensitive to code complexity |

### 3.2 Pattern Analysis
- **High performance on simple structures:** LLMs reach very high coverage on simple problems (low CC) such as HumanEval or TestEval, where GPT-4o exceeds 95% coverage [1][3].
- **Severe degradation on real systems:** Compilation- and test-failure rates rise sharply when applied to projects with more complex structure, with 50%–63% non-compiling errors reported [2][6].
- **Lack of complexity-stratified studies:** No study isolates the Cyclomatic Complexity variable to find the specific performance breaking point of zero-shot generation across both Java and Python [4][10].

### 3.3 GAP Mapping
| GAP | Description | Evidence (supporting papers) | Status |
|---|---|---|---|
| **GAP-T** (Technology) | Missing evaluation of zero-shot degradation along the CC boundary (5–10) | 34 | Confirmed |
| **GAP-M** (Metric) | No unified branch-coverage + mutation-score benchmarking with statistical significance under controlled CC | 13 | Confirmed |
| **GAP-D** (Dataset) | Missing cross-language Java/Python comparison under controlled CC | 4 | Confirmed-Deferred |

---

## 4. Research Questions

> **RQ1:** For Java/Python functions of medium complexity (CC 5–10, measured by Lizard), does automatic test-case generation with `gpt-4o` (zero-shot) on a sample of N ≥ 50 per language achieve a median Branch Coverage ≥ 80%, and at which CC threshold does performance begin to degrade?
- **Claim type:** Absolute threshold
- **H0:** The median Branch Coverage of GPT-4o-generated tests is below 80% on functions with CC 5–10 (M_cov < 80%).
- **H1:** The median Branch Coverage of GPT-4o-generated tests reaches at least 80% on functions with CC 5–10 (M_cov ≥ 80%).
- **Metric:** Branch Coverage (%) measured by JaCoCo (Java) and Coverage.py (Python).
- **Statistical test:** One-sample Wilcoxon signed-rank test (α = 0.05) against the hypothesised value of 80%.

> **RQ2:** Does the mutation score of `gpt-4o`-generated tests reach a median ≥ 60%, and is there a statistically significant difference compared with tests generated by traditional automated baselines (Randoop/Pynguin) on the same set of functions?
- **Claim type:** Comparative
- **H0:** The Mutation Score of GPT-4o is not statistically significantly higher than the baselines, or the median Mutation Score of GPT-4o is below 60%.
- **H1:** The Mutation Score of GPT-4o is statistically significantly higher than the baselines (p < 0.05), and the median Mutation Score reaches at least 60%.
- **Metric:** Mutation Score (%) measured by PIT (Java) and pytest-mutagen (Python).
- **Statistical test:** Paired Wilcoxon signed-rank test (α = 0.05) — the two methods are evaluated on the same set of source functions (paired samples).

> **RQ3:** Is there a negative correlation between Cyclomatic Complexity (CC) and the quality of GPT-4o-generated test cases (branch coverage and Mutation Score) across both Java and Python?
- **Claim type:** Correlation
- **H0:** There is no negative correlation between CC and the quality of GPT-4o-generated tests (Spearman ρ ≥ 0).
- **H1:** There is a statistically significant negative correlation between CC and the quality of GPT-4o-generated tests (Spearman ρ < 0, p < 0.05).
- **Metric:** Spearman rank correlation coefficient (ρ).
- **Statistical test:** Spearman's rank correlation (α = 0.05) — suitable for ordinal CC data and non-normally distributed quality metrics.

---

## 5. Experiment Protocol

### 5.1 Pipeline overview
1. **Data Collection & Filtering:** Extract Java functions from Defects4J and Python functions from CodeXGLUE. Use the Lizard tool to measure CC and filter 50 Java + 50 Python functions satisfying `5 ≤ CC ≤ 10`.
2. **Baseline Preparation:** Run automated test-generation tools — Randoop and EvoSuite for Java; Pynguin and Hypothesis for Python — on the same 100 selected functions.
3. **LLM Test Generation:** Write a script calling the OpenAI API (`gpt-4o-2024-08-06`) using zero-shot prompting with `temperature=0.0` to generate test cases for the 100 filtered functions.
4. **Execution & Metric Collection:** Compile and execute the test cases. Test cases that fail to compile or hit serious runtime errors receive a default score of 0% for both coverage and mutation score. Measure Branch Coverage with JaCoCo/Coverage.py and Mutation Score with PIT/pytest-mutagen.
5. **Statistical Analysis:** Run the One-sample Wilcoxon test (RQ1), Paired Wilcoxon test (RQ2), and Spearman correlation (RQ3) using `scipy.stats` to test the hypotheses.

### 5.2 Dataset
- **Dataset name:** Defects4J (for Java) and CodeXGLUE (for Python).
- **Source (URL):** `https://github.com/rjust/defects4j`, `https://github.com/microsoft/CodeXGLUE`.
- **Size (N):** 50 Java functions + 50 Python functions (total N = 100).
- **Preprocessing:** Separate each individual function and measure Cyclomatic Complexity with Lizard. Keep only functions with complexity in the range [5, 10].
- **Reason for choice:** Ensures diversity of real-world source code and supports cross-language comparison under the same strictly controlled CC condition.

> **Note (open item):** The dataset source is under review — the team flagged that the cited papers do not all use this dataset. Any change to the dataset requires a proposal amendment approved by the instructor before the Week-8 full run.

### 5.3 LLM/Tool Configuration
- **Model:** `gpt-4o-2024-08-06` (fixed snapshot to ensure reproducibility).
- **Hyperparameters:** `temperature=0.0`, `top_p=1.0`, `max_tokens=2048`.
- **Prompting strategy:** Zero-shot.
- **Prompt template:**
```text
You are an expert software tester. Given the following {language} function, generate a comprehensive suite of unit tests using JUnit (for Java) or pytest (for Python) to achieve maximum branch coverage and mutation score. Do not output anything other than the executable code.
Code:
{code}
```
- **Configuration rationale:** Setting `temperature=0.0` removes randomness and ensures high reproducibility. The simple zero-shot method accurately reflects the model's core capability as code complexity increases.

### 5.4 Measurement
- **Metric 1:** Branch Coverage | **Tool:** JaCoCo (Java), Coverage.py (Python) | **Ground-truth source:** Source code
- **Metric 2:** Mutation Score | **Tool:** PIT (Java), pytest-mutagen (Python) | **Ground-truth source:** Source code

### 5.5 Baseline
Automated baselines only:
- **Java:** Randoop (random testing) and EvoSuite (search-based / SBST, default configuration), test-generation time limit `time-limit=60s`.
- **Python:** Pynguin and Hypothesis.
- *Design note:* The team decided not to use human-written tests as a baseline, because setting up a complete build environment for large projects containing these 100 functions at scale is not feasible within the research scope, and it is hard to guarantee equivalence across the two languages.

### 5.6 Statistical Analysis Plan
- **RQ1 (Coverage):** Use a **One-sample Wilcoxon signed-rank test** to compare the GPT-4o Branch Coverage distribution against the hypothesised 80% threshold.
- **RQ2 (Mutation Score comparison):** Use a **Paired Wilcoxon signed-rank test** to compare GPT-4o against the automated baselines on the same set of functions. A paired test is chosen because observations are not independent — they are paired by individual source function.
- **RQ3 (Complexity correlation):** Use the **Spearman rank correlation coefficient** to evaluate the monotonic relationship between CC (ordinal, 5–10) and the test-quality metrics.
- **Effect Size:** Use **matched-pairs rank-biserial correlation** (r) for the paired Wilcoxon test to quantify the magnitude of LLM superiority over the baselines.

---

## 6. Evaluation Plan

### 6.1 Evaluation criteria
| RQ | Metric | Threshold | Statistical test | H0 rejected when... | Meaning of a negative result |
|---|---|---|---|---|---|
| **RQ1** | Branch Cov | ≥ 80% | One-sample Wilcoxon | Median ≥ 80% and p < 0.05 | Confirms GPT-4o's capability breaking boundary lies within CC 5–10 |
| **RQ2** | Mut Score | ≥ 60% | Paired Wilcoxon | Median_GPT > Median_Base and p < 0.05 | Shows LLM-generated code runs through statements but lacks quality assertions compared with traditional tools |
| **RQ3** | Correlation | ρ < −0.5 | Spearman | ρ < −0.5 and p < 0.05 | Confirms structural complexity is a direct barrier degrading LLM generation performance |

### 6.2 Interpretation of combined outcomes
- **Double positive (all H0 rejected):** The LLM generates tests very well (coverage and mutation score exceed expected thresholds) and maintains superiority over traditional tools even as CC rises. Conclusion: zero-shot LLMs can fully replace traditional tools in the CC 5–10 range.
- **Mixed (high coverage but low Mutation Score):** The LLM reaches branch coverage ≥ 80% but mutation score fails the threshold or is worse than the baseline. Conclusion: the LLM tends to generate superficial tests (passing through branches for coverage but lacking valuable fault-detecting `assert` statements).
- **Double negative (no H0 rejected):** The LLM's test quality degrades severely below the set thresholds. Conclusion: the zero-shot method is entirely ineffective for CC 5–10 functions; the experiment identifies the practical application boundary and motivates lightweight automatic-repair loops rather than overly complex multi-agent architectures.

### 6.3 Sub-group analysis
Split the sample into two groups: Java (strongly typed) and Python (dynamically typed). Compare whether GPT-4o's CC-driven performance degradation occurs faster or more severely in the statically typed environment than in the dynamically typed one.

---

## 7. Threats to Validity

### 7.1 Internal Validity
- **Threat:** Silent updates from OpenAI's API could change the model's output behaviour between experiment runs.
- **Mitigation:** Use the fixed API version `gpt-4o-2024-08-06` and record the detailed system fingerprint of each response in the experiment log.

### 7.2 External Validity
- **Threat:** Functions extracted from Defects4J and CodeXGLUE may be academic/algorithmic in nature and may not fully represent real-world enterprise business logic.
- **Mitigation:** The team records this limitation and will clearly discuss the generalisability scope of the results in the final report.

### 7.3 Construct Validity
- **Threat:** High branch coverage may create a false sense of safety if test cases lack `assert` statements that verify logical correctness.
- **Mitigation:** Mandatory use of Mutation Score (PIT and pytest-mutagen) as the second key metric to verify the real fault-detection ability of the test suite.

### 7.4 Conclusion Validity
- **Threat:** A sample size of N = 100 (50 functions per language) may not guarantee statistical power if the data is highly skewed or contains many outliers.
- **Mitigation:** The team uses entirely non-parametric tests (Wilcoxon, Spearman), which are robust to non-normal distributions and not heavily affected by outliers.

---

## 8. Timeline & Resources

### 8.0 Role assignment
| Role | Member | Experiment responsibility |
|---|---|---|
| **PL** | Ân | Manage progress, oversee methodological consistency, approve the report |
| **DG** | Thu Kim | Collect and clean data, measure CC with Lizard, set up automated baselines |
| **LR** | Hải | Manage the API account, build the model-calling script, collect generated tests |
| **MS** | Phúc | Implement coverage/mutation measurement tools, run statistical computations |
| **RW** | Lộc | Write content, produce data-visualisation figures, finalise document formatting |

### 8.1 Resource Inventory
| Resource | Status | Owner | Note |
|---|---|---|---|
| Dataset (Defects4J, CodeXGLUE) | ✅ | DG | Downloaded; directory structure verified |
| OpenAI API Key | ✅ | LR | Usage tier verified and stable |
| Compute environment | ✅ | LR | Local workstation for batch test-generation scripts |
| Quality-measurement tools | ⚠️ | MS | PIT and pytest-mutagen integration being finalised |

### 8.2 Estimated cost
| Item | Quantity | Unit price | Total |
|---|---|---|---|
| OpenAI API (`gpt-4o-2024-08-06`) | ~1,000,000 tokens | $2.5 / 1M input, $10.0 / 1M output | ~$15.00 |
| Experiment hardware | 24 operating hours | N/A | $0.00 |
| **Total** | | | **~$15.00** |

### 8.3 Detailed timeline (Weeks 5–10)
| Week | Main activity | Assignment | Concrete deliverable |
|---|---|---|---|
| **Week 5** | Finalise the research proposal, standardise the dataset | DG, RW, PL | Complete proposal draft |
| **Week 5** | Set up API calls and run a single test | LR | `test_api.py` runs successfully |
| **Week 6** | Submit the official proposal to the instructor | PL | `proposal.md` v1.0 |
| **Week 7** | Run a small-scale pilot (10% of the dataset) | DG, LR, MS | Pilot data file `results/pilot_output.csv` |
| **Week 7** | Preliminary review of pilot results and technical adjustments | Whole team | Technical-meeting minutes and config updates if needed |
| **Week 8** | Run the full experiment on all 100 functions | LR, MS | Raw result file `results/full_llm_output.csv` |
| **Weeks 9–10** | Statistical analysis, figures, and scientific writing | MS, RW, PL | Complete report and presentation slides |

### 8.4 Contingency Plan
- **If the API rate limit is hit:** Set up a `sleep` mechanism and split the run into smaller batches executed off-peak.
- **If a measurement tool is incompatible:** If JaCoCo or PIT cannot read the LLM-generated code structure, record it as a compile/execution failure (coverage scored 0%) and switch to manual qualitative analysis of that failure sample to find the cause.
- **If a member falls behind:** The Project Lead issues a warning after 48 hours of delay and reassigns non-dependent tasks to keep the Week-8 shared experiment run on schedule.

### 8.5 Per-member checkpoints (Weeks 5–10)
| Role | Week 5 | Week 6 | Week 7 | Week 8 | Weeks 9–10 |
|---|---|---|---|---|---|
| **PL** | Review proposal | Submit proposal | Chair pilot meeting | Verify data | Finalise slides & report |
| **DG** | Clean dataset | Prepare resources | Prepare pilot data | Collect full data | Support data analysis |
| **LR** | Write API script | Check budget | Run pilot | Run full experiment | Package source code |
| **MS** | Write measurement script | Configure tools | Measure pilot data | Measure full data | Run tests, p-values |
| **RW** | Write §7 | Format proposal | Support pilot logging | Produce figures | Finalise the report |

### 8.6 Amendment Process (when a technical problem is found in Week 7)
- **Principle:** Never change the research questions (RQ), the main metrics, or lower the evaluation thresholds after obtaining results (avoiding HARKing — hypothesising after results are known).
- **Applicability:** Only when there is an objective technical error (e.g., a measurement tool does not support some Python-specific syntax, forcing the effective sample size down to N = 45).
- **Procedure:** Write an amendment file `proposal-amendment-v1.1.md` explaining the technical cause, attach pilot results as evidence, update the affected experiment description, and send it to the instructor for approval before the official Week-8 run.

---

## 9. References

* **[1] Wang et al. (2025):** Wang, J., et al. "TestEval: A Benchmark for Evaluating Large Language Models on Unit Test Generation." *Proceedings of NAACL*, 2025. Repository: https://github.com/LLM4SoftwareTesting/TestEval
* **[2] Sapozhnikov et al. (2024):** Sapozhnikov, G., et al. "An Empirical Study on the Structural Coverage and Compilation Rate of ChatGPT-Generated Unit Tests." *ICSE Companion*, 2024. https://doi.org/10.1145/3634737.3637701
* **[3] Kumar et al. (2025):** Kumar, A., et al. "Empirical Evaluation of Advanced LLMs on Automated Unit Test Generation for Java Applications." *IEEE Access*, vol. 13, 2025, pp. 1245–1260. https://doi.org/10.1109/ACCESS.2025.3637221
* **[4] Jain & Le Goues (2025):** Jain, R., and Le Goues, C. "TestGenEval: A Realistic Benchmark and Dataset for Evaluating LLM-Based Software Test Generation." *arXiv:2503.14713*, 2025. https://arxiv.org/abs/2503.14713
* **[5] Konstantinou et al. (2026):** Konstantinou, D., et al. "Evaluating Plain-LLM Test Generation Across Diverse Java Projects: A Multi-Model Analysis." *arXiv:2601.09695*, 2026. https://arxiv.org/abs/2601.09695v1
* **[6] Haratian et al. (2026):** Haratian, M., et al. "PR-Aware Test Case Generation: An Empirical Comparison of Search-Based and LLM-Based Approaches." *arXiv:2605.25285*, 2026. https://arxiv.org/abs/2605.25285v1
* **[7] Lira et al. (2025):** Lira, F., et al. "Assessing Gemini and ChatGPT on Python Unit Test Generation: Coverage and Cost Analysis." *SBQS*, 2025.
* **[8] Gu et al. (2025):** Gu, X., et al. "An Automated Template-Based Repair Method for Non-Compiling LLM-Generated Software Tests." *ACM TOSEM*, vol. 34, no. 2, 2025. https://doi.org/10.1145/3803418
* **[9] Liu et al. (2025):** Liu, Y., et al. "Leveraging Call Graphs and LLMs for Dynamic Python Module-Level Test Case Generation." *ACM Conference on Computer Science and Software Engineering*, 2025. https://doi.org/10.1145/3715778
* **[10] Broide et al. (2026):** Broide, E., et al. "Correctness-Aware Evaluation Metrics for Large Language Model-Based Automated Unit Test Generation." *arXiv:2505.12424*, 2026. https://arxiv.org/abs/2505.12424v3
