"""Mine tap TEST held-out — cung tieu chi tap goc, KHONG trung 120 ham DEV.

Tieu chi giu nguyen (de so sanh duoc):
  - CC 5-10 do bang Lizard
  - Java + Python, tu 10 repo da pin commit
  - Ham co than that su (khong phai abstract/interface stub)

Chong overfitting: moi ham chon ra phai KHAC 120 ham DEV theo khoa (file, ten, dong).
Ghi ra data/heldout_ground_truth.csv, dung schema y het full_ground_truth.csv.

Chay:  python ms-analysis/scripts/mine_heldout.py --per-lang 30
       python ms-analysis/scripts/mine_heldout.py --per-lang 30 --seed-repos flask,requests,commons-cli
"""
from __future__ import annotations

import argparse
import csv
import os
import random
import sys

import lizard

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
DEV = os.path.join(REPO, "data", "full_ground_truth.csv")
OUT = os.path.join(REPO, "data", "heldout_ground_truth.csv")
RAW = os.path.join(REPO, "data", "raw")

# map ten repo -> source_repo string (khop tap goc)
REPO_SLUG = {
    "commons-cli": "apache/commons-cli", "commons-csv": "apache/commons-csv",
    "commons-collections": "apache/commons-collections", "commons-math": "apache/commons-math",
    "gson": "google/gson", "jsoup": "jhy/jsoup", "joda-time": "JodaOrg/joda-time",
    "jfreechart": "jfree/jfreechart", "flask": "pallets/flask", "requests": "psf/requests",
}
JAVA_REPOS = ["commons-cli", "commons-csv", "commons-collections", "commons-math",
              "gson", "jsoup", "joda-time", "jfreechart"]
PY_REPOS = ["flask", "requests"]


def dev_keys() -> set[tuple]:
    """Khoa nhan dang 120 ham DEV: (basename file, ten ham, start_line)."""
    keys = set()
    for r in csv.DictReader(open(DEV, encoding="utf-8-sig")):
        f = os.path.basename(r["file"].replace("\\", "/"))
        name = r["func_name"].split("::")[-1].split(".")[-1]
        keys.add((f, name, r["start_line"]))
        keys.add((f, name))  # them khoa long hon de chac chan khong trung
    return keys


def iter_source(repo: str, lang: str):
    root = os.path.join(RAW, repo)
    src_marker = "/src/main/java/" if lang == "java" else "/src/"
    ext = ".java" if lang == "java" else ".py"
    for base, _, files in os.walk(root):
        b = base.replace("\\", "/")
        if src_marker not in b + "/":
            continue
        if "/test" in b or "/target/" in b or "__pycache__" in b:
            continue
        for fn in files:
            if fn.endswith(ext) and not fn.endswith("_test.py") and not fn.startswith("test_"):
                yield os.path.join(base, fn)


def mine(repos: list[str], lang: str, need: int, dev: set, rng: random.Random) -> list[dict]:
    cands = []
    for repo in repos:
        for path in iter_source(repo, lang):
            try:
                info = lizard.analyze_file(path)
            except Exception:  # noqa: BLE001
                continue
            for fn in info.function_list:
                cc = fn.cyclomatic_complexity
                if not (5 <= cc <= 10):
                    continue
                name = fn.name.split("::")[-1].split(".")[-1]
                base = os.path.basename(path)
                if (base, name, str(fn.start_line)) in dev or (base, name) in dev:
                    continue
                rel = path.replace("\\", "/")
                i = rel.find("raw/")
                relpath = "data/raw/" + rel[i + 4:] if i >= 0 else rel
                cands.append({
                    "language": lang, "source_repo": REPO_SLUG.get(repo, repo),
                    "file": relpath, "func_name": fn.name, "cc": cc,
                    "nloc": fn.nloc, "params": len(fn.parameters),
                    "start_line": fn.start_line, "end_line": fn.end_line,
                })
    # bo trung trong chinh candidate (cung file+ten+dong)
    seen, uniq = set(), []
    for c in cands:
        k = (c["file"], c["func_name"], c["start_line"])
        if k in seen:
            continue
        seen.add(k)
        uniq.append(c)
    rng.shuffle(uniq)
    # phan bo deu qua cac repo cho da dang
    by_repo: dict[str, list] = {}
    for c in uniq:
        by_repo.setdefault(c["source_repo"], []).append(c)
    picked, i = [], 0
    order = list(by_repo)
    while len(picked) < need and any(by_repo.values()):
        r = order[i % len(order)]
        if by_repo[r]:
            picked.append(by_repo[r].pop())
        i += 1
    return picked[:need]


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--per-lang", type=int, default=30)
    ap.add_argument("--seed", type=int, default=20260721)  # co dinh de tai lap
    ap.add_argument("--seed-repos", default="")
    a = ap.parse_args()

    rng = random.Random(a.seed)
    dev = dev_keys()
    jrepos = a.seed_repos.split(",") if a.seed_repos else JAVA_REPOS
    prepos = PY_REPOS
    if a.seed_repos:
        jrepos = [r for r in a.seed_repos.split(",") if r in JAVA_REPOS]
        prepos = [r for r in a.seed_repos.split(",") if r in PY_REPOS] or PY_REPOS

    jv = mine(jrepos, "java", a.per_lang, dev, rng)
    py = mine(prepos, "python", a.per_lang, dev, rng)
    rows = []
    for i, c in enumerate(jv, 1):
        c["func_id"] = f"HJ-{i:03d}"
        c["raw_source_path"] = ""
        rows.append(c)
    for i, c in enumerate(py, 1):
        c["func_id"] = f"HP-{i:03d}"
        c["raw_source_path"] = ""
        rows.append(c)

    cols = ["func_id", "language", "source_repo", "file", "func_name", "cc", "nloc",
            "params", "start_line", "end_line", "raw_source_path"]
    with open(OUT, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=cols)
        w.writeheader()
        for r in rows:
            w.writerow({k: r.get(k, "") for k in cols})

    import collections
    print(f"-> {OUT}")
    print(f"Java {len(jv)}  Python {len(py)}  (yeu cau {a.per_lang}/ngon ngu)")
    print("Java theo repo :", dict(collections.Counter(c["source_repo"] for c in jv)))
    print("Python theo repo:", dict(collections.Counter(c["source_repo"] for c in py)))
    print("CC phan bo:", dict(collections.Counter(c["cc"] for c in rows)))
    # kiem chung khong trung DEV
    dupe = sum(1 for c in rows
               if (os.path.basename(c["file"]), c["func_name"].split("::")[-1].split(".")[-1],
                   str(c["start_line"])) in dev)
    print(f"Trung DEV: {dupe} (phai = 0)")
    return 0 if dupe == 0 else 1


if __name__ == "__main__":
    sys.exit(main())
