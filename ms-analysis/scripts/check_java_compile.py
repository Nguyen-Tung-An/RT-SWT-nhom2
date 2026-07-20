"""Do TY LE BIEN DICH THAT cua test Java — thu ma bai bao chua tung do.

Van de (xem measure_java_from_reports.py:117): 'compiled: 1' la hang so gan cung cho moi
dong duoc ghi ra. Dong duoc ghi khi khoang dong cua ham co du lieu bc/ms trong jacoco.xml.
Nhung JaCoCo liet ke MOI lop trong du an — ke ca lop chua he duoc nap (mi>0, ci=0, nen
bc = 0/(mb+0) = 0.0) — nen dong VAN duoc ghi va compiled=1.
=> Mot ham co test KHONG bien dich duoc van nhan compiled=1, mien la lop goc co mat trong
   bao cao. 'Java 85% compiled' do 'file nguon co trong bao cao', khong phai ty le bien
   dich thanh cong.

Script nay do truc tiep: dat tung file test vao dung package roi goi javac that, ghi lai
ma tra ve va loai loi dau tien. Dung javac thay vi mvn cho tung ham vi nhanh hon nhieu
lan (classpath lay 1 lan/repo bang mvn dependency:build-classpath).

Chay:  python ms-analysis/scripts/check_java_compile.py --repo commons-cli
       python ms-analysis/scripts/check_java_compile.py            # tat ca repo
"""
from __future__ import annotations

import argparse
import collections
import csv
import os
import re
import shutil
import subprocess
import sys
import tempfile

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
GT = os.path.join(REPO, "data", "full_ground_truth.csv")
GEN = os.path.join(REPO, "generated_tests", "gpt4o", "java")
OUT = os.path.join(REPO, "ms-analysis", "results", "java_compile_check.csv")

ERR_PATTERNS = [
    (r"reference to (\w+) is ambiguous", "overload-nhap-nhang"),
    (r"cannot find symbol\s*\n\s*symbol:\s*class (\w+)", "khong-thay-lop"),
    (r"cannot find symbol\s*\n\s*symbol:\s*method (\w+)", "khong-thay-method"),
    (r"cannot find symbol\s*\n\s*symbol:\s*variable (\w+)", "khong-thay-bien"),
    (r"package ([\w.]+) does not exist", "thieu-package"),
    (r"incompatible types: ([^\n]{0,50})", "sai-kieu"),
    (r"constructor (\w+) in class [\w.]+ cannot be applied", "sai-constructor"),
    (r"(\w+) has private access", "truy-cap-private"),
    (r"is not abstract and does not override", "thieu-override"),
    (r"method ([\w]+) in class [\w.]+ cannot be applied", "sai-tham-so"),
    (r"error: (.{0,60})", "khac"),
]


def classify(out: str) -> tuple[str, str]:
    for rx, tag in ERR_PATTERNS:
        m = re.search(rx, out)
        if m:
            return tag, (m.group(1) if m.groups() else "")[:50]
    return "khong-ro", ""


def repo_dir(source_repo: str) -> str:
    return os.path.join(REPO, "data", "raw", source_repo.split("/")[-1])


def build_classpath(rd: str) -> str | None:
    """Lay classpath 1 lan/repo. Uu tien cache de chay lai cho nhanh."""
    cache = os.path.join(rd, "target", "_cp.txt")
    if os.path.exists(cache) and os.path.getsize(cache) > 0:
        return open(cache, encoding="utf-8").read().strip()
    try:
        r = subprocess.run(["mvn", "-q", "-o", "dependency:build-classpath",
                            f"-Dmdep.outputFile={cache}", "-DincludeScope=test"],
                           cwd=rd, capture_output=True, text=True, encoding="utf-8",
                           errors="replace", timeout=600, shell=True)
    except subprocess.TimeoutExpired:
        return None
    if os.path.exists(cache) and os.path.getsize(cache) > 0:
        return open(cache, encoding="utf-8").read().strip()
    # thu lai co mang (khong -o)
    try:
        subprocess.run(["mvn", "-q", "dependency:build-classpath",
                        f"-Dmdep.outputFile={cache}", "-DincludeScope=test"],
                       cwd=rd, capture_output=True, text=True, encoding="utf-8",
                       errors="replace", timeout=900, shell=True)
    except subprocess.TimeoutExpired:
        return None
    return open(cache, encoding="utf-8").read().strip() if os.path.exists(cache) else None


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--repo", default="", help="loc theo ten repo, vd commons-cli")
    a = ap.parse_args()

    rows = [r for r in csv.DictReader(open(GT, encoding="utf-8-sig"))
            if r["language"] == "java"]
    if a.repo:
        rows = [r for r in rows if a.repo in r["source_repo"]]

    by_repo: dict[str, list[dict]] = {}
    for r in rows:
        by_repo.setdefault(r["source_repo"], []).append(r)

    results = []
    for src_repo, rs in sorted(by_repo.items()):
        rd = repo_dir(src_repo)
        classes = os.path.join(rd, "target", "classes")
        if not os.path.isdir(classes):
            print(f"!! {src_repo}: chua build (khong co target/classes) — bo qua {len(rs)} ham")
            for r in rs:
                results.append({"func_id": r["func_id"], "repo": src_repo, "compiles": "",
                                "error_type": "chua-build", "detail": ""})
            continue
        cp = build_classpath(rd)
        if not cp:
            print(f"!! {src_repo}: khong lay duoc classpath — bo qua")
            for r in rs:
                results.append({"func_id": r["func_id"], "repo": src_repo, "compiles": "",
                                "error_type": "khong-co-classpath", "detail": ""})
            continue
        full_cp = classes + os.pathsep + cp
        print(f"\n=== {src_repo} ({len(rs)} ham) ===")

        for r in rs:
            fid = r["func_id"]
            src = os.path.join(GEN, fid + "_Test.java")
            if not os.path.exists(src):
                results.append({"func_id": fid, "repo": src_repo, "compiles": "0",
                                "error_type": "khong-co-file-test", "detail": ""})
                continue
            code = open(src, encoding="utf-8", errors="replace").read().lstrip("﻿")
            pm = re.search(r"^\s*package\s+([\w.]+)\s*;", code, re.M)
            pkg = pm.group(1) if pm else ""
            cm = re.search(r"\bclass\s+(\w+)", code)
            orig = cm.group(1) if cm else fid.replace("-", "_") + "_Test"
            uniq = f"{orig}_{fid.replace('-', '_')}"
            code = re.sub(rf"\bclass\s+{re.escape(orig)}\b", f"class {uniq}", code, count=1)

            with tempfile.TemporaryDirectory() as wd:
                d = os.path.join(wd, *pkg.split(".")) if pkg else wd
                os.makedirs(d, exist_ok=True)
                p = os.path.join(d, uniq + ".java")
                open(p, "w", encoding="utf-8", newline="\n").write(code)
                try:
                    rr = subprocess.run(["javac", "-nowarn", "-cp", full_cp,
                                         "-d", os.path.join(wd, "out"), p],
                                        capture_output=True, text=True, encoding="utf-8",
                                        errors="replace", timeout=180)
                    ok = rr.returncode == 0
                    et, dt = ("", "") if ok else classify(rr.stdout + rr.stderr)
                except subprocess.TimeoutExpired:
                    ok, et, dt = False, "timeout", ""
            print(f"  {fid}  {'OK  ' if ok else 'FAIL'} {et}{(' ' + dt) if dt else ''}")
            results.append({"func_id": fid, "repo": src_repo, "compiles": int(ok),
                            "error_type": et, "detail": dt})

    with open(OUT, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=["func_id", "repo", "compiles", "error_type", "detail"])
        w.writeheader()
        w.writerows(results)

    done = [r for r in results if r["compiles"] != ""]
    ok = sum(1 for r in done if str(r["compiles"]) == "1")
    print(f"\n=== KET QUA ===")
    print(f"do duoc {len(done)}/{len(results)} ham   BIEN DICH DUOC: {ok}/{len(done)}"
          + (f" ({100 * ok / len(done):.1f}%)" if done else ""))
    print("\nLoai loi:")
    for k, v in collections.Counter(r["error_type"] for r in done
                                    if str(r["compiles"]) != "1").most_common():
        print(f"   {v:3d}  {k}")
    print(f"\n-> {OUT}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
