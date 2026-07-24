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
    # \ref -> ten phan that (xem build_label_map). Placeholder cu "(xem phan lien quan)"
    # lam ban .txt khong doc duoc va khien nguoi doc tuong la mat citation.
    (r"\\ref\{([^}]*)\}", lambda m: LABELS.get(m.group(1), m.group(1))),
    # Trich dan -> so [1], [2]... theo thu tu xuat hien (xem build_cite_map).
    (r"\\cite\{([^}]*)\}", lambda m: cite_str(m.group(1))),
    # KHONG giu markup: ban .txt la de NOP/dan vao Word, khong phai Markdown.
    (r"\\texttt\{([^}]*)\}", r"\1"),
    (r"\\textbf\{([^}]*)\}", r"\1"),
    (r"\\emph\{([^}]*)\}", r"\1"),
    (r"\\textit\{([^}]*)\}", r"\1"),
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
    (r"\\_", "_"),                    # top\_p -> top_p
    (r"\\ ", " "),                    # "et al.\ found" -> "et al. found"
    (r"~\s*\[", " ["),                # "baseline~ [11]" -> "baseline [11]"
    (r"~", " "),                      # non-breaking space con lai
    (r"\$([^$]*)\$", r"\1"),                           # toan hoc don gian
    (r"\\le\b", "<="), (r"\\ge\b", ">="), (r"\\ne\b", "!="),
    (r"\\alpha", "alpha"), (r"\\times", "x"), (r"\\div", "/"),
    (r"\\wedge", "AND"), (r"\\vee", "OR"), (r"\\neq", "!="),
    (r"\\[a-zA-Z]+\*?(\[[^]]*\])?(\{[^}]*\})?", ""),   # lenh con lai
    (r"\{|\}", ""),
    (r"[ \t]+", " "),
    (r"\n{3,}", "\n\n"),
]


LABELS: dict[str, str] = {}
CITES: dict[str, int] = {}          # khoa bibtex -> so thu tu xuat hien


def cite_str(keys: str) -> str:
    """\\cite{a,b} -> ' [1, 2]'. Danh so theo thu tu XUAT HIEN trong bai."""
    nums = []
    for k in (x.strip() for x in keys.split(",")):
        if k and k not in CITES:
            CITES[k] = len(CITES) + 1
        if k:
            nums.append(CITES[k])
    return " [" + ", ".join(str(n) for n in nums) + "]"


def build_cite_map() -> None:
    """Quet cac section theo dung thu tu vao bai de danh so trich dan on dinh."""
    CITES.clear()
    for f in sorted(x for x in os.listdir(SECT) if x.endswith(".tex")):
        raw = open(os.path.join(SECT, f), encoding="utf-8", errors="replace").read()
        raw = re.sub(r"(?<!\\)%.*?$", "", raw, flags=re.MULTILINE)
        for m in re.finditer(r"\\cite\{([^}]*)\}", raw):
            for k in (x.strip() for x in m.group(1).split(",")):
                if k and k not in CITES:
                    CITES[k] = len(CITES) + 1


ACCENTS = {'"': "aeiouAEIOU" + "y", "'": "aeiouAEIOUyc", "`": "aeiouAEIOU",
           "^": "aeiouAEIOU", "~": "anoANO", "c": "cC", "v": "scSC", "=": "aeiouAEIOU"}
_ACC_MAP = {('"', "a"): "ä", ('"', "o"): "ö", ('"', "u"): "ü", ('"', "e"): "ë",
            ("'", "e"): "é", ("'", "a"): "á", ("'", "o"): "ó", ("'", "i"): "í",
            ("'", "u"): "ú", ("'", "c"): "ć", ("`", "e"): "è", ("`", "a"): "à",
            ("^", "e"): "ê", ("^", "a"): "â", ("^", "o"): "ô", ("~", "n"): "ñ",
            ("~", "a"): "ã", ("~", "o"): "õ", ("c", "c"): "ç", ("v", "s"): "š"}


def deaccent(s: str) -> str:
    r"""LaTeX accent -> ky tu Unicode: Sch\"afer -> Schäfer, Ren\'e -> René.

    Can lam TRUOC khi xoa dau ngoac nhon, vi dang hay gap la {\"a} va \"{a}.
    """
    def one(m):
        acc, ch = m.group(1), m.group(2)
        return _ACC_MAP.get((acc, ch.lower()), ch) if ch.islower() else \
            _ACC_MAP.get((acc, ch.lower()), ch).upper()
    s = re.sub(r'\\([\'"`^~=cv])\{?(\w)\}?', one, s)
    return s.replace(r"\ss", "ß").replace(r"\ae", "æ").replace(r"\o", "ø")


def bib_titles() -> dict[str, str]:
    """Doc refs.bib -> {khoa: 'Tac gia: Tieu de (nam)'} de in muc References cuoi bai."""
    p = os.path.join(HERE, "refs.bib")
    if not os.path.exists(p):
        return {}
    src = open(p, encoding="utf-8", errors="replace").read()
    out = {}
    for m in re.finditer(r"@\w+\{([^,]+),(.*?)\n\}", src, re.S):
        key, body = m.group(1).strip(), m.group(2)

        def fld(name):
            g = re.search(rf"{name}\s*=\s*\{{(.*?)\}}\s*,?\s*\n", body, re.S)
            if not g:
                return ""
            s = " ".join(g.group(1).split())
            s = deaccent(s)                       # \"a -> a, \'e -> e ... truoc khi bo {}
            return re.sub(r"[{}]|\\[a-zA-Z]+", "", s).strip()

        au, ti, yr = fld("author"), fld("title"), fld("year")
        au = au.split(" and ")[0] + (" et al." if " and " in au else "")
        out[key] = f"{au}: {ti}" + (f" ({yr})" if yr else "")
    return out


def abstract_text() -> str:
    """Lay abstract + keywords tu main.tex, chuyen ve van xuoi."""
    p = os.path.join(HERE, "main.tex")
    if not os.path.exists(p):
        return ""
    src = open(p, encoding="utf-8", errors="replace").read()
    m = re.search(r"\\begin\{abstract\}(.*?)\\end\{abstract\}", src, re.S)
    if not m:
        return ""
    body = m.group(1)
    kw = ""
    k = re.search(r"\\keywords\{(.*?)\}", body, re.S)
    if k:
        kw = re.sub(r"\s*\\and\s*", ", ", " ".join(k.group(1).split()))
        body = body[:k.start()]
    txt = to_text(body)
    return "=== Abstract ===\n\n" + txt + (f"\n\nKeywords: {kw}" if kw else "")


def build_label_map() -> None:
    """Quet moi \\label va lay tieu de cua \\section/\\subsection/\\caption dung truoc no.

    Nho vay ban .txt in ra 'Section: Measurement: Four Tiers' thay vi mot placeholder mu.
    """
    LABELS.clear()
    tbl = 0
    for f in sorted(x for x in os.listdir(SECT) if x.endswith(".tex")):
        raw = open(os.path.join(SECT, f), encoding="utf-8", errors="replace").read()
        for m in re.finditer(r"\\(section|subsection|caption)\*?\{((?:[^{}]|\{[^}]*\})*)\}"
                             r"|\\label\{([^}]*)\}", raw):
            if m.group(3) is None:
                title = re.sub(r"\\[a-zA-Z]+\*?|\{|\}", "", m.group(2)).strip()
                kind = m.group(1)
                continue
            lab = m.group(3)
            if lab.startswith("tab:"):
                tbl += 1
                LABELS[lab] = str(tbl)
            elif kind == "section":
                LABELS[lab] = f"Section: {title}"
            else:
                LABELS[lab] = f"Section: {title}"


def to_text(tex: str) -> str:
    t = tex
    for pat, rep in SUBS:
        t = re.sub(pat, rep, t, flags=re.MULTILINE | re.DOTALL if "%" not in pat else re.MULTILINE)
    return "\n".join(l.rstrip() for l in t.splitlines()).strip()


def front_matter() -> str:
    """Tieu de, tac gia, Abstract va Keywords — nam trong main.tex, KHONG nam trong sections/.

    Thieu ham nay thi ban .txt dan sang Word bi mat hoan toan phan Abstract.
    """
    p = os.path.join(HERE, "main.tex")
    if not os.path.exists(p):
        return ""
    raw = open(p, encoding="utf-8", errors="replace").read()
    out = []
    m = re.search(r"\\title\{(.*?)\}\s*\n", raw, re.DOTALL)
    if m:
        out.append("=== " + to_text(m.group(1)).replace("\n", " ").strip() + " ===\n")
    m = re.search(r"\\author\{((?:[^{}]|\{[^}]*\})*)\}", raw, re.DOTALL)
    if m:
        # \and phai doi thanh dau phay TRUOC to_text(), vi to_text xoa moi lenh \...
        au = to_text(re.sub(r"\\and\b", ",", m.group(1))).replace("\n", " ")
        au = re.sub(r"\s+([,;])", r"\1", re.sub(r"\s+", " ", au))
        out.append(au.strip(" ,") + "\n")
    m = re.search(r"\\institute\{((?:[^{}]|\{[^}]*\})*)\}", raw, re.DOTALL)
    if m:
        out.append(re.sub(r"\s+", " ", to_text(m.group(1))).strip() + "\n")
    m = re.search(r"\\begin\{abstract\}(.*?)\\keywords\{(.*?)\}", raw, re.DOTALL)
    if m:
        body = to_text(m.group(1)).strip()
        if body:
            out.append("\n-- Abstract --\n" + body)
        kw = to_text(re.sub(r"\\and\b", ";", m.group(2))).replace("\n", " ")
        kw = re.sub(r"\s+([,;])", r"\1", re.sub(r"\s+", " ", kw))
        out.append("\nKeywords: " + kw.strip(" ;"))
    return "\n".join(out).strip()


def main() -> int:
    os.makedirs(OUT, exist_ok=True)
    build_label_map()
    build_cite_map()
    files = sorted(f for f in os.listdir(SECT) if f.endswith(".tex"))

<<<<<<< HEAD
    # Ban gop KHONG co dong tieu de/dau thoi gian: day la ban NOP, khong phai log backup.
    abstract = abstract_text()
    full = [abstract] if abstract else []
=======
    full = [f"Backup noi dung paper — {stamp}\n"
            f"Nguon: paper2/main.tex (tieu de + abstract) + paper2/sections/*.tex "
            f"(Springer LNCS)\n" + "=" * 66 + "\n"]
>>>>>>> ec0122b449844440b9d98c5bc6799c417f137e56
    made = []

    fm = front_matter()
    if fm:
        full.append(fm + "\n")
        p_fm = os.path.join(OUT, "00_abstract.txt")
        open(p_fm, "w", encoding="utf-8", newline="\n").write(fm + "\n")
        made.append(("00_abstract", p_fm, len(fm.split())))

    for f in files:
        raw = open(os.path.join(SECT, f), encoding="utf-8", errors="replace").read()
        stem = f[:-4]                       # bo duoi .tex
        if "TODO" in raw and len(raw) < 120:
            made.append((stem, None, 0))
            continue
        body = to_text(raw)
        full.append(body)
        # MOI PHAN MOT FILE RIENG — de dan tung section vao Word, va de chay AI detector
        # theo section (RBL-5b yeu cau chay theo section, khong dan ca bai).
        p = os.path.join(OUT, stem + ".txt")
        open(p, "w", encoding="utf-8", newline="\n").write(body + "\n")
        made.append((stem, p, len(body.split())))

    # Muc References cuoi ban gop, danh so khop voi [n] trong than bai.
    titles = bib_titles()
    if CITES:
        refs = ["=== References ==="]
        for key, n in sorted(CITES.items(), key=lambda x: x[1]):
            refs.append(f"{n}. {titles.get(key, key)}")
        full.append("\n".join(refs))

    p_all = os.path.join(OUT, "_paper_full.txt")
    open(p_all, "w", encoding="utf-8", newline="\n").write("\n\n".join(full) + "\n")

    stamp = datetime.now().strftime("%Y-%m-%d %H:%M")
    print(f"Xuat ban .txt sach  {stamp}  ->  paper2/backup/\n")
    for stem, p, n in made:
        if p is None:
            print(f"  {stem + '.txt':24s} — chua viet, bo qua")
        else:
            print(f"  {stem + '.txt':24s} {n:5d} tu")
    tot = len(open(p_all, encoding="utf-8").read().split())
    print(f"  {'_paper_full.txt':24s} {tot:5d} tu   (ban gop: abstract + cac phan + refs)")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
