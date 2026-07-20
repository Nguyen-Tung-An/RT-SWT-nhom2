"""Khoang dong trong ground truth co tro dung method khong? Neu sai thi loc JaCoCo ra 0."""
import collections
import csv
import os
import re

REPO = r"F:/Ky_5/SWT301_Materials/RT-SWT-nhom2"
rows = list(csv.DictReader(open(os.path.join(REPO, "ms-analysis/results/metrics_merged_8lib.csv"),
                                encoding="utf-8-sig")))
m = {x["function_id"]: x for x in rows
     if x["method"] == "gpt-4o-mini" and x["language"] == "java"}
gt = {x["func_id"]: x for x in csv.DictReader(
    open(os.path.join(REPO, "data/full_ground_truth.csv"), encoding="utf-8-sig"))
    if x["language"] == "java"}

zero = [f for f, x in m.items() if x["compiled"] == "1"
        and (x["branch_coverage"] or "0") in ("0", "0.0")]
nz = [f for f, x in m.items() if x["compiled"] == "1" and float(x["branch_coverage"] or 0) > 0]


def check(fid):
    r = gt.get(fid)
    if not r:
        return None
    f = r["file"].replace("\\", "/")
    i = f.find("raw/")
    p = os.path.join(REPO, "data", "raw", f[i + 4:]) if i >= 0 else os.path.join(REPO, f)
    if not os.path.exists(p):
        return ("src-missing", "")
    src = open(p, encoding="utf-8", errors="replace").read().splitlines()
    lo, hi = int(r["start_line"]), int(r["end_line"])
    meth = r["func_name"].split("::")[-1]
    if lo < 1 or hi > len(src):
        return ("range-ngoai-file", f"{lo}-{hi} / {len(src)} dong")
    body = "\n".join(src[lo - 1:hi])
    ok = bool(re.search(r"\b" + re.escape(meth) + r"\s*\(", body))
    return ("KHOP" if ok else "LECH", f"dong {lo}-{hi}")


for name, ids in (("coverage=0", zero), ("coverage>0", nz)):
    res = [x for x in (check(f) for f in ids) if x]
    print(f"{name} (n={len(res)}): {dict(collections.Counter(x[0] for x in res))}")

print("\nCac ca LECH (khoang dong KHONG chua khai bao method):")
n = 0
for f in zero:
    s = check(f)
    if s and s[0] == "LECH":
        n += 1
        print(f"   {f}  {gt[f]['func_name']:46s} {s[1]}")
        if n >= 10:
            break
print(f"   ... tong {sum(1 for f in zero if (check(f) or ('',))[0] == 'LECH')} ca LECH")
