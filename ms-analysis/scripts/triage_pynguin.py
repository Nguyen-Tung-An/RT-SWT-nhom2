"""Phan loai CHE DO LOI cua Pynguin tren tung module — vi sao baseline ra 0.0%.

Bai bao ghi "Pynguin failed completely on this dataset (median coverage 0.0%)" nhung
KHONG noi duoc vi sao, vi harness cu chi in 400 ky tu cuoi roi ap 0. Sau khi (3/3) bat
harness ghi log day du, chay lai module dau tien lo ra: Pynguin KHONG he tim kiem —
no chet ngay (rc=2, stdout rong) khi worker process dung dill de pickle trang thai
module, gap kieu C-extension khong pickle duoc:

    _pickle.PicklingError: Can't pickle <class '_json.Scanner'>

=> Gia thuyet cu ("budget 90s qua nho cho module lon") BI BAC BO: budget 306s van chet
   trong vai giay. Tuong quan LOC chi la he qua — module flask lon keo theo nhieu import
   C-extension hon.

Script nay chay Pynguin voi budget NHO cho tat ca module: crash bo ra ngay lap tuc, con
module chay duoc thi chi ton it giay. Muc dich la PHAN LOAI, khong phai do coverage.

Chay:  PYNGUIN_DANGER_AWARE=1 python ms-analysis/scripts/triage_pynguin.py
       PYNGUIN_DANGER_AWARE=1 python ms-analysis/scripts/triage_pynguin.py --budget 20
"""
from __future__ import annotations

import argparse
import csv
import glob
import os
import re
import shutil
import subprocess
import sys
import tempfile

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
PY = sys.executable
GT = os.path.join(REPO, "data", "full_ground_truth.csv")
OUT = os.path.join(REPO, "ms-analysis", "results", "pynguin_triage.csv")
LOG_DIR = os.path.join(REPO, "pynguin-report", "triage-logs")

# nhan chan doan -> regex tim trong stderr, xet theo thu tu
PATTERNS = [
    ("pickle-c-extension", r"PicklingError.*Can't pickle <class '([\w.]+)'"),
    ("worker-died",        r"EOFError: Ran out of input"),
    ("tracing-aborted",    r"TracingAbortedException"),
    ("import-error",       r"(ModuleNotFoundError|ImportError): (.+)"),
    ("recursion",          r"RecursionError"),
    ("memory",             r"MemoryError"),
]


def project_and_module(rel_file: str) -> tuple[str, str]:
    """'data/raw/flask/src/flask/helpers.py' -> (…/flask/src, 'flask.helpers')"""
    f = rel_file.replace("\\", "/")
    i = f.index("/src/") + len("/src/")
    return os.path.join(REPO, f[:i].rstrip("/")), f[i:].replace(".py", "").replace("/", ".")


def classify(stderr: str, rc: int, produced: bool) -> tuple[str, str]:
    if produced:
        return "ok", ""
    for label, rx in PATTERNS:
        m = re.search(rx, stderr)
        if m:
            return label, (m.group(1) if m.groups() else "")[:60]
    if rc == 0:
        return "no-test-empty-suite", ""
    return f"unknown-rc{rc}", "\n".join(
        l for l in stderr.splitlines() if l.strip())[-120:].replace("\n", " | ")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--budget", type=int, default=15,
                    help="giay/module — chi de PHAN LOAI, crash lo ra tuc thi")
    a = ap.parse_args()

    if os.environ.get("PYNGUIN_DANGER_AWARE") != "1":
        print("LOI: can PYNGUIN_DANGER_AWARE=1")
        return 1

    rows = [r for r in csv.DictReader(open(GT, encoding="utf-8-sig"))
            if r["language"] == "python"]
    by_file: dict[str, int] = {}
    for r in rows:
        by_file[r["file"]] = by_file.get(r["file"], 0) + 1

    os.makedirs(LOG_DIR, exist_ok=True)
    work = tempfile.mkdtemp(prefix="pyn_triage_")
    results = []

    for i, (rel, nfunc) in enumerate(sorted(by_file.items()), 1):
        proj, mod = project_and_module(rel)
        src = os.path.join(REPO, rel.replace("\\", "/"))
        loc = sum(1 for _ in open(src, encoding="utf-8", errors="replace"))
        out_dir = os.path.join(work, mod.replace(".", "_"))
        os.makedirs(out_dir, exist_ok=True)

        env = os.environ.copy()
        env["PYNGUIN_DANGER_AWARE"] = "1"
        cmd = [PY, "-m", "pynguin", "--project-path", proj, "--output-path", out_dir,
               "--module-name", mod, "--maximum-search-time", str(a.budget)]
        try:
            r = subprocess.run(cmd, cwd=REPO, capture_output=True, text=True,
                               encoding="utf-8", errors="replace",
                               timeout=a.budget + 120, env=env)
            rc, err = r.returncode, (r.stdout or "") + (r.stderr or "")
        except subprocess.TimeoutExpired:
            rc, err = -1, "TIMEOUT"

        produced = bool(glob.glob(os.path.join(out_dir, "test_*.py")))
        label, detail = ("timeout", "") if rc == -1 else classify(err, rc, produced)

        with open(os.path.join(LOG_DIR, mod.replace(".", "_") + ".log"), "w",
                  encoding="utf-8") as fh:
            fh.write(f"cmd: {' '.join(cmd)}\nrc={rc}\nlabel={label}\n\n{err}\n")

        print(f"[{i:2d}/{len(by_file)}] {mod:32s} {loc:5d} LOC  {nfunc:2d} ham  "
              f"rc={rc:3d}  {label}{(' — ' + detail) if detail else ''}")
        results.append({"module": mod, "loc": loc, "n_functions": nfunc,
                        "returncode": rc, "produced_suite": int(produced),
                        "failure_mode": label, "detail": detail})

    shutil.rmtree(work, ignore_errors=True)
    with open(OUT, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=list(results[0].keys()))
        w.writeheader()
        w.writerows(results)

    print(f"\n-> {OUT}")
    tally: dict[str, list[int]] = {}
    for r in results:
        tally.setdefault(r["failure_mode"], []).append(r["n_functions"])
    print(f"\n{'CHE DO LOI':24s} {'module':>7s} {'ham':>5s}")
    for k, v in sorted(tally.items(), key=lambda kv: -sum(kv[1])):
        print(f"{k:24s} {len(v):7d} {sum(v):5d}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
