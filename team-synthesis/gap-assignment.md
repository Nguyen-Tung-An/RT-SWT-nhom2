# GAP Assignment — LLM-based Unit Test Generation

**Phase:** RBL-1B (one GAP analysed per member)
**Group:** Group 2 — Topic SE1944
**Evidence base:** `evidence-table-merged.md` (N = 40 papers)

> **Note:** This file was missing from `team-synthesis/` and is reconstructed here from the GAP taxonomy used in `gap-final.md` and `proposal.md`. Please confirm the per-member assignment with the team — the GAP definitions are final, the owner column is a proposed mapping.

---

## Candidate GAPs (from the merged evidence table)

| GAP ID | Type | Statement | Supporting papers |
|---|---|---|---|
| **GAP-T** | Technology | No controlled, complexity-stratified (CC 5–10) evaluation of zero-shot LLM test generation; the performance "breaking point" is unknown. | 34 |
| **GAP-M** | Metric | Branch coverage and mutation score are rarely reported *together* with statistical significance, and never under controlled CC across both languages. | 13 |
| **GAP-D** | Dataset | No cross-language (Java + Python) dataset controlled for cyclomatic complexity. | 4 |

---

## Per-member assignment

| Member | Role | Assigned GAP | Deliverable (`[member]/SLR/gap-analysis.md`) |
|---|---|---|---|
| Ân | PL | GAP-T (primary) | Deep analysis of the CC-controlled evaluation gap + feasibility |
| Phúc | MS | GAP-M | Deep analysis of the coverage + mutation + statistics gap |
| Thu Kim | DG | GAP-D | Deep analysis of the cross-language controlled-dataset gap |
| Hải | LR | GAP-T (support) | Pipeline/tooling feasibility for the controlled experiment |
| Lộc | RW | — | Cross-checks all three analyses; ensures no overlapping GAP |

**Rule (RBL-1B):** every analysed GAP must be distinct — no two members may claim the same GAP. Cross-checking is done at the end of Week 5 before the GAP is finalised in `gap-final.md`.

---

## Selected GAP for the proposal

- **Primary GAP:** **GAP-T** — drives RQ1 (coverage threshold) and RQ3 (complexity–quality correlation).
- **Secondary GAPs:** **GAP-M** (drives RQ2: coverage + mutation with statistical testing) and **GAP-D** (drives the cross-language Java/Python design).
