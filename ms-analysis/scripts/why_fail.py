"""Tai sao test bi INVALID? Phan loai LOI THAT cua tung file test, v1 vs v2.

Khong doan. Chay tung file, bat exception thuc te, gom theo loai.
"""
import collections
import csv
import os
import re
import shutil
import subprocess
import sys
import tempfile

REPO = r"F:/Ky_5/SWT301_Materials/RT-SWT-nhom2"
PY = sys.executable

GT = {r["func_id"]: r for r in csv.DictReader(
    open(os.path.join(REPO, "data", "full_ground_truth_v2.csv"), encoding="utf-8-sig"))}


def classify(out: str) -> tuple[str, str]:
    """-> (nhan, chi tiet) — nhan phan biet NGUYEN NHAN, khong phai trieu chung."""
    pats = [
        # khong dinh danh duoc muc tieu -> import sai
        (r"ImportError: cannot import name '([^']+)' from '([^']+)'",
         "1-import-sai-ten", lambda m: f"{m.group(1)} khong co trong {m.group(2)}"),
        (r"ModuleNotFoundError: No module named '([^']+)'",
         "2-thieu-module", lambda m: m.group(1)),
        # dinh danh dung nhung dung sai API
        (r"AttributeError: (?:can't set attribute|property) '?([^'\n]*)'?",
         "3-gan-thuoc-tinh-chi-doc", lambda m: m.group(1).strip()),
        (r"AttributeError: '([^']+)' object has no attribute '([^']+)'",
         "4-thuoc-tinh-khong-ton-tai", lambda m: f"{m.group(1)}.{m.group(2)}"),
        (r"TypeError: ([^\n]{0,70})", "5-sai-chu-ky-goi", lambda m: m.group(1)),
        # dung API dung nhung thieu ngu canh runtime
        (r"RuntimeError: (Working outside of [^\n]{0,40})",
         "6-thieu-ngu-canh-flask", lambda m: m.group(1)),
        (r"RuntimeError: ([^\n]{0,70})", "7-runtime-khac", lambda m: m.group(1)),
        (r"(?:E\s+)?AssertionError", "8-assert-sai", lambda m: "ky vong sai"),
        (r"fixture '([^']+)' not found", "9-thieu-fixture", lambda m: m.group(1)),
        (r"SyntaxError: ([^\n]{0,60})", "0-syntax", lambda m: m.group(1)),
    ]
    for rx, tag, fmt in pats:
        m = re.search(rx, out)
        if m:
            return tag, fmt(m)[:70]
    return "z-khac", "\n".join(l for l in out.splitlines() if l.strip())[-90:].replace("\n", " ")


def run_one(path: str) -> tuple[str, str, int, int]:
    with tempfile.TemporaryDirectory() as wd:
        tf = os.path.join(wd, os.path.basename(path))
        shutil.copy(path, tf)
        try:
            r = subprocess.run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider", tf],
                               cwd=wd, capture_output=True, text=True, encoding="utf-8",
                               errors="replace", timeout=120)
        except subprocess.TimeoutExpired:
            return "y-treo", "timeout 120s", 0, 0
        out = (r.stdout or "") + (r.stderr or "")
        if r.returncode == 0:
            m = re.search(r"(\d+) passed", out)
            return "OK-xanh", f"{m.group(1) if m else '?'} test pass", int(m.group(1)) if m else 0, 0
        npass = int(m.group(1)) if (m := re.search(r"(\d+) passed", out)) else 0
        nfail = int(m.group(1)) if (m := re.search(r"(\d+) failed", out)) else 0
        tag, detail = classify(out)
        return tag, detail, npass, nfail


def sweep(label: str, d: str, pattern):
    if not os.path.isdir(d):
        print(f"  (khong co {d})")
        return {}
    tally = collections.Counter()
    rows = []
    files = sorted(f for f in os.listdir(d) if f.endswith(".py"))
    for i, f in enumerate(files, 1):
        fid = pattern(f)
        tag, detail, np_, nf = run_one(os.path.join(d, f))
        tally[tag] += 1
        rows.append((fid, tag, detail, np_, nf))
        print(f"  [{i:2d}/{len(files)}] {fid:8s} {tag:26s} {detail[:56]}")
    print(f"\n  === {label} ===")
    for k, v in sorted(tally.items()):
        print(f"    {v:3d}  {k}")
    return rows


if __name__ == "__main__":
    which = sys.argv[1] if len(sys.argv) > 1 else "v2"
    dirs = {"v1": "gpt4o", "v2": "gpt4o_v2", "v3": "gpt4o_v3"}
    d = os.path.join(REPO, "generated_tests", dirs[which], "python")
    if which == "v1":
        rows = sweep("V1 (bai bao)", d, lambda f: f.replace("test_", "").replace(".py", ""))
    else:
        rows = sweep(f"{which.upper()}", d,
                     lambda f: f.replace("test_", "").replace(".py", "").upper().replace("_", "-"))
    with open(os.path.join(REPO, "ms-analysis", "results", f"why_fail_{which}.csv"),
              "w", encoding="utf-8", newline="") as fh:
        w = csv.writer(fh)
        w.writerow(["func_id", "cause", "detail", "n_pass", "n_fail"])
        w.writerows(rows)
