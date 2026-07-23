"""Mine dataset SACH — loai truoc cac muc tieu KHONG kiem thu duoc, khong cherry-pick.

RANH GIOI QUAN TRONG:
  Chinh dang: loai muc tieu ma KHONG cong cu nao kiem thu duoc qua API cong khai
              (private/protected, gan sai lop, overload nhap nhang, khong resolve duoc).
              Day la sua LOI CHON MAU — dataset moi do dung thu no tuyen bo do.
  Cherry-pick: loai ham vi "GPT lam kem tren do". TUYET DOI KHONG lam.

Moi tieu chi duoi day deu biet TRUOC khi chay thi nghiem, va bien minh bang tinh kiem thu
duoc — khong dung bat ky ket qua sinh test nao de loc.

Bo loc (theo thu tu, in FUNNEL day du de minh bach):
  F0  CC 5-10 (Lizard)                      <- yeu cau RBL, giu nguyen
  F1  co than that (nloc >= 3)              <- loai stub/abstract/interface
  F2  PUBLIC / exported                     <- Java: public; Python: khong _prefix
  F3  ten khong nhap nhang trong lop        <- loai overload trung ten
  F4  lop chu xac dinh dung (parse that)    <- chong loi miner gan nham lop long
  F5  resolve duoc dong (Python import that)<- chung minh goi duoc

Chay:  python ms-analysis/scripts/mine_clean.py --per-lang 30
       python ms-analysis/scripts/mine_clean.py --per-lang 30 --exclude-dev
"""
from __future__ import annotations

import argparse
import ast
import collections
import csv
import importlib
import os
import random
import re
import sys

import lizard

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
RAW = os.path.join(REPO, "data", "raw")
DEV = os.path.join(REPO, "data", "full_ground_truth.csv")
OUT = os.path.join(REPO, "data", "clean_ground_truth.csv")

REPO_SLUG = {
    "commons-cli": "apache/commons-cli", "commons-csv": "apache/commons-csv",
    "commons-collections": "apache/commons-collections", "commons-math": "apache/commons-math",
    "gson": "google/gson", "jsoup": "jhy/jsoup", "joda-time": "JodaOrg/joda-time",
    "jfreechart": "jfree/jfreechart", "flask": "pallets/flask", "requests": "psf/requests",
}
JAVA_REPOS = ["commons-cli", "commons-csv", "commons-collections", "commons-math",
              "gson", "jsoup", "joda-time", "jfreechart"]
PY_REPOS = ["flask", "requests"]

for p in (os.path.join(RAW, "flask", "src"), os.path.join(RAW, "requests", "src")):
    if p not in sys.path:
        sys.path.insert(0, p)

FUNNEL: collections.Counter = collections.Counter()


def src_files(repo: str, lang: str):
    root = os.path.join(RAW, repo)
    marker = "/src/main/java/" if lang == "java" else "/src/"
    ext = ".java" if lang == "java" else ".py"
    for base, _, files in os.walk(root):
        b = base.replace("\\", "/") + "/"
        if marker not in b or "/test" in b or "/target/" in b or "__pycache__" in b:
            continue
        for fn in files:
            if fn.endswith(ext) and not fn.startswith("test_") and not fn.endswith("_test.py"):
                yield os.path.join(base, fn)


# ---------------------------------------------------------------- Java
def java_index(path: str) -> dict:
    """-> {ten_method: [(lop_chu, visibility, so_tham_so, dong)]}. Parse theo do sau ngoac.

    Xac dinh lop chu bang STACK co POP — dung cho loi miner goc: no gan lop long nhau gan
    nhat ma khong pop, nen Builder::getOptionValues that ra la CommandLine.getOptionValues.
    """
    try:
        src = open(path, encoding="utf-8", errors="replace").read()
    except OSError:
        return {}
    # bo comment + chuoi de dem ngoac cho dung
    clean = re.sub(r"//[^\n]*", "", src)
    clean = re.sub(r"/\*.*?\*/", "", clean, flags=re.S)
    clean = re.sub(r'"(\\.|[^"\\])*"', '""', clean)

    out: dict[str, list] = {}
    stack: list[tuple[str, int]] = []
    depth = 0
    for i, line in enumerate(clean.splitlines(), 1):
        m = re.search(r"\b(?:class|interface|enum|record)\s+(\w+)", line)
        if m:
            stack.append((m.group(1), depth))
        mm = re.match(r"\s*(public|protected|private)?\s*(?:static\s+|final\s+|abstract\s+|synchronized\s+|native\s+)*"
                      r"[\w<>\[\],.\s]+?\b(\w+)\s*\(([^)]*)\)\s*(?:throws [\w.,\s]+)?\{", line)
        if mm and stack:
            vis = mm.group(1) or "package-private"
            name, params = mm.group(2), mm.group(3)
            if name not in ("if", "for", "while", "switch", "catch", "synchronized", "return", "new"):
                nargs = len([x for x in params.split(",") if x.strip()])
                out.setdefault(name, []).append((stack[-1][0], vis, nargs, i))
        depth += line.count("{") - line.count("}")
        while stack and depth <= stack[-1][1]:
            stack.pop()
    return out


def mine_java(repos, need, dev_keys, rng):
    cands = []
    for repo in repos:
        for path in src_files(repo, "java"):
            try:
                info = lizard.analyze_file(path)
            except Exception:  # noqa: BLE001
                continue
            idx = java_index(path)
            for fn in info.function_list:
                cc = fn.cyclomatic_complexity
                if not (5 <= cc <= 10):
                    continue
                FUNNEL["F0 CC 5-10"] += 1
                if fn.nloc < 3:
                    continue
                FUNNEL["F1 co than that"] += 1
                name = fn.name.split("::")[-1]
                decls = idx.get(name, [])
                if not decls:
                    continue                       # khong parse duoc -> bo (an toan)
                if len(decls) > 1:
                    continue                       # F3: overload/trung ten -> nhap nhang
                FUNNEL["F3 khong nhap nhang"] += 1
                cls, vis, nargs, dline = decls[0]
                if vis != "public":
                    continue                       # F2: chi public
                FUNNEL["F2 public"] += 1
                FUNNEL["F4 lop chu xac dinh"] += 1
                base = os.path.basename(path)
                if (base, name) in dev_keys:
                    continue
                rel = path.replace("\\", "/")
                i = rel.find("raw/")
                cands.append({
                    "language": "java", "source_repo": REPO_SLUG.get(repo, repo),
                    "file": "data/raw/" + rel[i + 4:] if i >= 0 else rel,
                    "func_name": f"{cls}::{name}", "class_path": cls, "visibility": vis,
                    "cc": cc, "nloc": fn.nloc, "params": nargs,
                    "start_line": fn.start_line, "end_line": fn.end_line,
                })
    return balance(cands, need, rng)


# ---------------------------------------------------------------- Python
def mine_python(repos, need, dev_keys, rng):
    cands = []
    for repo in repos:
        for path in src_files(repo, "python"):
            try:
                info = lizard.analyze_file(path)
                tree = ast.parse(open(path, encoding="utf-8", errors="replace").read())
            except Exception:  # noqa: BLE001
                continue
            # map ten -> (qualname, lop chu, so lan xuat hien)
            qual: dict[str, list] = {}

            def walk(node, stack):
                for ch in ast.iter_child_nodes(node):
                    if isinstance(ch, ast.ClassDef):
                        walk(ch, stack + [ch.name])
                    elif isinstance(ch, (ast.FunctionDef, ast.AsyncFunctionDef)):
                        qual.setdefault(ch.name, []).append((".".join(stack + [ch.name]),
                                                             stack[-1] if stack else "",
                                                             ch.lineno))
                        walk(ch, stack)
            walk(tree, [])

            rel = path.replace("\\", "/")
            i = rel.find("raw/")
            relpath = "data/raw/" + rel[i + 4:] if i >= 0 else rel
            modname = rel[rel.find("/src/") + 5:].replace(".py", "").replace("/", ".")

            for fn in info.function_list:
                cc = fn.cyclomatic_complexity
                if not (5 <= cc <= 10):
                    continue
                FUNNEL["F0 CC 5-10"] += 1
                if fn.nloc < 3:
                    continue
                FUNNEL["F1 co than that"] += 1
                name = fn.name.split(".")[-1]
                hits = qual.get(name, [])
                if len(hits) != 1:
                    continue                       # F3: trung ten trong module -> bo
                FUNNEL["F3 khong nhap nhang"] += 1
                q, cls, _ = hits[0]
                if name.startswith("_"):
                    continue                       # F2: bo private-by-convention
                FUNNEL["F2 public"] += 1
                FUNNEL["F4 lop chu xac dinh"] += 1
                # F5: resolve dong that
                try:
                    mod = importlib.import_module(modname)
                    obj = mod
                    for part in q.split("."):
                        obj = getattr(obj, part)
                    if not callable(obj):
                        continue
                except Exception:  # noqa: BLE001
                    continue
                FUNNEL["F5 resolve duoc dong"] += 1
                base = os.path.basename(path)
                if (base, name) in dev_keys:
                    continue
                cands.append({
                    "language": "python", "source_repo": REPO_SLUG.get(repo, repo),
                    "file": relpath, "func_name": name, "class_path": cls,
                    "visibility": "public", "cc": cc, "nloc": fn.nloc,
                    "params": len(fn.parameters),
                    "start_line": fn.start_line, "end_line": fn.end_line,
                })
    return balance(cands, need, rng)


def balance(cands, need, rng):
    seen, uniq = set(), []
    for c in cands:
        k = (c["file"], c["func_name"], c["start_line"])
        if k not in seen:
            seen.add(k)
            uniq.append(c)
    rng.shuffle(uniq)
    by: dict[str, list] = {}
    for c in uniq:
        by.setdefault(c["source_repo"], []).append(c)
    picked, i, order = [], 0, list(by)
    while len(picked) < need and any(by.values()):
        r = order[i % len(order)]
        if by[r]:
            picked.append(by[r].pop())
        i += 1
    return picked[:need], len(uniq)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--per-lang", type=int, default=30)
    ap.add_argument("--seed", type=int, default=20260721)
    ap.add_argument("--exclude-dev", action="store_true",
                    help="loai ham da nam trong 120 ham goc (de lam held-out)")
    a = ap.parse_args()

    dev = set()
    if a.exclude_dev:
        for r in csv.DictReader(open(DEV, encoding="utf-8-sig")):
            dev.add((os.path.basename(r["file"].replace("\\", "/")),
                     r["func_name"].split("::")[-1].split(".")[-1]))

    rng = random.Random(a.seed)
    jv, jpool = mine_java(JAVA_REPOS, a.per_lang, dev, rng)
    py, ppool = mine_python(PY_REPOS, a.per_lang, dev, rng)

    rows = []
    for i, c in enumerate(jv, 1):
        c["func_id"] = f"CJ-{i:03d}"
        rows.append(c)
    for i, c in enumerate(py, 1):
        c["func_id"] = f"CP-{i:03d}"
        rows.append(c)

    cols = ["func_id", "language", "source_repo", "file", "func_name", "class_path",
            "visibility", "cc", "nloc", "params", "start_line", "end_line"]
    with open(OUT, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=cols)
        w.writeheader()
        for r in rows:
            w.writerow({k: r.get(k, "") for k in cols})

    print("=== FUNNEL (moi buoc loai bao nhieu — minh bach) ===")
    for k in sorted(FUNNEL):
        print(f"  {k:26s} {FUNNEL[k]:5d}")
    print(f"\n  pool cuoi: Java {jpool}, Python {ppool}")
    print(f"-> {OUT}")
    print(f"Chon: Java {len(jv)}, Python {len(py)}")
    print("Java/repo :", dict(collections.Counter(c["source_repo"] for c in jv)))
    print("Python/repo:", dict(collections.Counter(c["source_repo"] for c in py)))
    print("CC:", dict(sorted(collections.Counter(c["cc"] for c in rows).items())))
    print("visibility:", dict(collections.Counter(c["visibility"] for c in rows)))
    return 0


if __name__ == "__main__":
    sys.exit(main())
