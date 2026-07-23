"""Backup toan bo noi dung paper ra .txt — chay sau moi lan sua LaTeX.

Sinh 2 file trong paper2/backup/:
  paper_full.txt      — gop toan bo section, da bo lenh LaTeX, de doc/dan vao Word
  paper_sections.txt  — nhu tren nhung tach ro tung file nguon, de doi chieu

Vi sao can: bai nop theo template Springer (Word). Ban .txt cho phep dan noi dung sang
Word ma khong phai go lai, va la ban luu phong khi moi truong LaTeX hong.

Chay:  python paper2/backup_txt.py
"""
from __future__ import annotations

import os
import re
from datetime import datetime

HERE = os.path.dirname(os.path.abspath(__file__))
SECT = os.path.join(HERE, "sections")
OUT = os.path.join(HERE, "backup")

# lenh LaTeX -> van xuoi
SUBS = [
    (r"(?<!\\)%.*?$", ""),                          # comment (bo qua \% da escape)
    (r"\\section\*?\{([^}]*)\}", r"\n\n=== \1 ===\n"),
    (r"\\subsection\*?\{([^}]*)\}", r"\n-- \1 --\n"),
    (r"\\paragraph\{([^}]*)\}", r"\n[\1]\n"),
    (r"\\label\{[^}]*\}", ""),
    (r"\\ref\{[^}]*\}", "(xem phan lien quan)"),
    (r"\\cite\{([^}]*)\}", r"[\1]"),
    (r"\\texttt\{([^}]*)\}", r"`\1`"),
    (r"\\textbf\{([^}]*)\}", r"**\1**"),
    (r"\\emph\{([^}]*)\}", r"*\1*"),
    (r"\\textit\{([^}]*)\}", r"*\1*"),
    (r"\\begin\{description\}|\\end\{description\}", ""),
    (r"\\begin\{itemize\}|\\end\{itemize\}", ""),
    (r"\\begin\{enumerate\}|\\end\{enumerate\}", ""),
    (r"\\item\[([^]]*)\]", r"\n  * \1:"),
    (r"\\item", "\n  * "),
    (r"\\begin\{table\}\[?[a-z]*\]?|\\end\{table\}", ""),
    (r"\\begin\{tabular\}\{[^}]*\}|\\end\{tabular\}", ""),
    (r"\\caption\{([^}]*)\}", r"\nBang: \1"),
    (r"\\centering|\\toprule|\\midrule|\\bottomrule", ""),
    (r"\\\\", ""),
    (r"&", "\t"),
    (r"---", "—"),
    (r"``|''", '"'),
    (r"\\,", " "),
    (r"\\%", "%"),
    (r"\\&", "&"),
    (r"\$([^$]*)\$", r"\1"),                           # toan hoc don gian
    (r"\\le\b", "<="), (r"\\ge\b", ">="), (r"\\ne\b", "!="),
    (r"\\alpha", "alpha"), (r"\\times", "x"), (r"\\div", "/"),
    (r"\\wedge", "AND"), (r"\\vee", "OR"), (r"\\neq", "!="),
    (r"\\[a-zA-Z]+\*?(\[[^]]*\])?(\{[^}]*\})?", ""),   # lenh con lai
    (r"\{|\}", ""),
    (r"[ \t]+", " "),
    (r"\n{3,}", "\n\n"),
]


def to_text(tex: str) -> str:
    t = tex
    for pat, rep in SUBS:
        t = re.sub(pat, rep, t, flags=re.MULTILINE | re.DOTALL if "%" not in pat else re.MULTILINE)
    return "\n".join(l.rstrip() for l in t.splitlines()).strip()


def main() -> int:
    os.makedirs(OUT, exist_ok=True)
    files = sorted(f for f in os.listdir(SECT) if f.endswith(".tex"))
    stamp = datetime.now().strftime("%Y-%m-%d %H:%M")

    full = [f"Backup noi dung paper — {stamp}\n"
            f"Nguon: paper2/sections/*.tex (Springer LNCS)\n" + "=" * 66 + "\n"]
    made = []

    for f in files:
        raw = open(os.path.join(SECT, f), encoding="utf-8", errors="replace").read()
        stem = f[:-4]                       # bo duoi .tex
        if "TODO" in raw and len(raw) < 120:
            made.append((stem, None, 0))
            continue
        body = to_text(raw)
        full.append(body + "\n")
        # MOI PHAN MOT FILE RIENG — de dan tung section vao Word, va de chay AI detector
        # theo section (RBL-5b yeu cau chay theo section, khong dan ca bai).
        p = os.path.join(OUT, stem + ".txt")
        open(p, "w", encoding="utf-8", newline="\n").write(body + "\n")
        made.append((stem, p, len(body.split())))

    p_all = os.path.join(OUT, "_paper_full.txt")
    open(p_all, "w", encoding="utf-8", newline="\n").write("\n".join(full))

    print(f"Backup {stamp}  ->  paper2/backup/\n")
    for stem, p, n in made:
        if p is None:
            print(f"  {stem + '.txt':24s} — chua viet, bo qua")
        else:
            print(f"  {stem + '.txt':24s} {n:5d} tu")
    tot = len(open(p_all, encoding="utf-8").read().split())
    print(f"  {'_paper_full.txt':24s} {tot:5d} tu   (ban gop)")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
