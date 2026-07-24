"""Sinh hinh cho bai thu hai — doc thang tu CSV, KHONG go tay con so nao.

Xuat ra paper2/figures/*.tex, moi file mot khoi tikzpicture de \\input vao section.
Dung pgfplots (co san trong ban LaTeX nay) thay vi matplotlib: vector, sac net khi in,
va khong phai cai them goi Python.

Hai hinh, moi hinh mot phat hien chinh cua bai:
  fig_rqb.tex  — T3 tang co y nghia nhung T4 thi khong (dac ta muc tieu cai thien viec
                 DEN DUOC, khong cai thien viec PHAN BIET DUOC)
  fig_rqc.tex  — thu tu dao chieu giua hai ngon ngu: model thang Pynguin o Python nhung
                 thua EvoSuite/Randoop o Java

Chay:  python ms-analysis/scripts/make_figures_clean.py
"""
from __future__ import annotations

import csv
import os

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
R = os.path.join(REPO, "ms-analysis", "results")
OUT = os.path.join(REPO, "paper2", "figures")

EXCLUDE = {"CJ-048"}          # miner tu gan nham protected->public


def count_pos(name: str, col: str = "mutation_score") -> tuple[int, int]:
    """-> (so ham co gia tri > 0, tong so ham). Bo CJ-048 nhu moi phan tich khac."""
    p = os.path.join(R, name + ".csv")
    if not os.path.exists(p):
        raise SystemExit(f"thieu {p}")
    pos = tot = 0
    for r in csv.DictReader(open(p, encoding="utf-8-sig")):
        if r["func_id"] in EXCLUDE:
            continue
        tot += 1
        v = (r.get(col) or "").strip()
        try:
            if float(v) > 0:
                pos += 1
        except ValueError:
            pass
    return pos, tot


def bar_chart(rows: list[tuple[str, int]], n: int, ylabel: str,
              note: str = "", height: str = "4.6cm") -> str:
    """rows = [(nhan, gia tri)]. Ve cot doc, in gia tri tren dinh."""
    labels = ",".join(lb for lb, _ in rows)
    coords = " ".join(f"({lb},{v})" for lb, v in rows)
    return f"""\\begin{{tikzpicture}}
\\begin{{axis}}[
  ybar, width=\\linewidth, height={height},
  ymin=0, ymax={n},
  ylabel={{{ylabel}}},
  symbolic x coords={{{labels}}},
  xtick=data, x tick label style={{font=\\footnotesize, align=center}},
  ytick distance=10, tick label style={{font=\\footnotesize}},
  ylabel style={{font=\\footnotesize}},
  nodes near coords, nodes near coords style={{font=\\footnotesize}},
  bar width=15pt, enlarge x limits=0.15,
  axis lines*=left, ymajorgrids, grid style={{dashed,gray!30}},
]
\\addplot[fill=gray!55, draw=black!70] coordinates {{{coords}}};
\\end{{axis}}
\\end{{tikzpicture}}{note}"""


def main() -> int:
    os.makedirs(OUT, exist_ok=True)

    # ---------- Hinh 1: RQ-B — T3 tang, T4 khong ----------
    t3_v1, n_py = count_pos("mutation_on_target_clean_v1", "branch_coverage")
    t3_v2, _ = count_pos("mutation_on_target_clean_v3fair", "branch_coverage")
    t4_v1, _ = count_pos("mutation_on_target_clean_v1")
    t4_v2, _ = count_pos("mutation_on_target_clean_v3fair")

    fig1 = f"""% SINH TU DONG boi ms-analysis/scripts/make_figures_clean.py — dung sua tay.
\\begin{{tikzpicture}}
\\begin{{axis}}[
  ybar, width=\\linewidth, height=5cm,
  ymin=0, ymax={n_py},
  ylabel={{Python functions (of {n_py})}},
  symbolic x coords={{T3 reaches target,T4 detects fault}},
  xtick=data, x tick label style={{font=\\footnotesize}},
  ytick distance=10, tick label style={{font=\\footnotesize}},
  ylabel style={{font=\\footnotesize}},
  nodes near coords, nodes near coords style={{font=\\footnotesize}},
  bar width=17pt, enlarge x limits=0.45,
  legend style={{font=\\footnotesize, at={{(0.5,-0.22)}}, anchor=north, legend columns=2,
                 draw=none}},
  axis lines*=left, ymajorgrids, grid style={{dashed,gray!30}},
]
\\addplot[fill=gray!30, draw=black!70] coordinates
  {{(T3 reaches target,{t3_v1}) (T4 detects fault,{t4_v1})}};
\\addplot[fill=gray!70, draw=black!70] coordinates
  {{(T3 reaches target,{t3_v2}) (T4 detects fault,{t4_v2})}};
\\legend{{V1 baseline, V2 target-specified}}
\\end{{axis}}
\\end{{tikzpicture}}
"""
    open(os.path.join(OUT, "fig_rqb.tex"), "w", encoding="utf-8", newline="\n").write(fig1)

    # ---------- Hinh 2: RQ-C — dao chieu giua hai ngon ngu ----------
    py_gpt, n_py2 = count_pos("mutation_on_target_clean_v3fair")
    py_pyn, _ = count_pos("baseline_T4_pynguin_default")
    j_gpt, n_j = count_pos("mutation_java_clean_v3fair")
    j_evo, _ = count_pos("baseline_T4_evosuite")
    j_ran, _ = count_pos("baseline_T4_randoop")

    fig2 = f"""% SINH TU DONG boi ms-analysis/scripts/make_figures_clean.py — dung sua tay.
\\begin{{tikzpicture}}
\\begin{{axis}}[
  ybar, width=\\linewidth, height=5cm,
  ymin=0, ymax={max(n_py2, n_j)},
  ylabel={{Functions with mutation score $>0$}},
  symbolic x coords={{GPT (Py),Pynguin (Py),GPT (Java),EvoSuite (Java),Randoop (Java)}},
  xtick=data, x tick label style={{font=\\scriptsize, rotate=20, anchor=east}},
  ytick distance=10, tick label style={{font=\\footnotesize}},
  ylabel style={{font=\\footnotesize}},
  nodes near coords, nodes near coords style={{font=\\footnotesize}},
  bar width=15pt, enlarge x limits=0.12,
  axis lines*=left, ymajorgrids, grid style={{dashed,gray!30}},
]
\\addplot[fill=gray!70, draw=black!70] coordinates
  {{(GPT (Py),{py_gpt}) (Pynguin (Py),{py_pyn})}};
\\addplot[fill=gray!30, draw=black!70] coordinates
  {{(GPT (Java),{j_gpt}) (EvoSuite (Java),{j_evo}) (Randoop (Java),{j_ran})}};
\\end{{axis}}
\\end{{tikzpicture}}
"""
    open(os.path.join(OUT, "fig_rqc.tex"), "w", encoding="utf-8", newline="\n").write(fig2)

    print(f"-> {OUT}")
    print(f"  fig_rqb.tex  T3 {t3_v1}->{t3_v2}, T4 {t4_v1}->{t4_v2}  (n={n_py})")
    print(f"  fig_rqc.tex  Py GPT {py_gpt} vs Pynguin {py_pyn} (n={n_py2}); "
          f"Java GPT {j_gpt} vs EvoSuite {j_evo}, Randoop {j_ran} (n={n_j})")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
