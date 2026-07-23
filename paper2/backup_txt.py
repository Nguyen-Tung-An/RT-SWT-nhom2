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
    (r"%.*?$", ""),                                    # comment
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

    full, per = [], []
    header = (f"Backup noi dung paper — {stamp}\n"
              f"Nguon: paper2/sections/*.tex (Springer LNCS)\n"
              + "=" * 66 + "\n")
    full.append(header)
    per.append(header)

    for f in files:
        raw = open(os.path.join(SECT, f), encoding="utf-8", errors="replace").read()
        if "TODO" in raw and len(raw) < 120:
            per.append(f"\n\n########## {f} — CHUA VIET ##########\n")
            continue
        body = to_text(raw)
        full.append(body + "\n")
        per.append(f"\n\n########## {f} ##########\n{body}\n")

    p1 = os.path.join(OUT, "paper_full.txt")
    p2 = os.path.join(OUT, "paper_sections.txt")
    open(p1, "w", encoding="utf-8", newline="\n").write("\n".join(full))
    open(p2, "w", encoding="utf-8", newline="\n").write("\n".join(per))

    for p in (p1, p2):
        n = len(open(p, encoding="utf-8").read().split())
        print(f"  {os.path.relpath(p, os.path.dirname(HERE))}  ({n} tu)")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
