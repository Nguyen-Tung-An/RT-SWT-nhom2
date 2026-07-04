"""
Tach metric Java theo TUNG HAM tu bao cao JaCoCo + PIT chay tren repo that.

Y tuong: RQ do theo ham (CC 5-10), nhung JaCoCo/PIT bao cao theo class/line.
Vi ta do tren DUNG repo o DUNG commit pin, so dong (start_line..end_line) trong
CSV khop voi source file that -> cat so lieu theo khoang dong cua tung ham:

  - Branch coverage ham = tong cb / (cb + mb) tren cac <line> thuoc khoang dong
    (jacoco.xml: mb=missed branches, cb=covered branches).
  - Mutation score ham  = mutant KILLED|TIMED_OUT / tong mutant trong khoang dong
    (mutations.xml cua PIT).

Usage (mac dinh: pilot + commons-cli + method=evosuite):
  python ms-analysis/scripts/measure_java_from_reports.py \
      --csv data/pilot_sample.csv --repo commons-cli --method evosuite \
      --out ms-analysis/results/metrics.csv
"""
import argparse
import csv
import os
import sys
import xml.etree.ElementTree as ET

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))


def load_jacoco_lines(jacoco_xml):
    """{(package_path, sourcefile): {line_no: (mb, cb)}}"""
    out = {}
    root = ET.parse(jacoco_xml).getroot()
    for pkg in root.findall("package"):
        pname = pkg.get("name")  # vd org/apache/commons/cli
        for sf in pkg.findall("sourcefile"):
            lines = {}
            for ln in sf.findall("line"):
                lines[int(ln.get("nr"))] = (int(ln.get("mb", 0)), int(ln.get("cb", 0)))
            out[(pname, sf.get("name"))] = lines
    return out


def load_pit_mutations(mutations_xml):
    """{(sourcefile, line_no): [status, ...]}"""
    out = {}
    root = ET.parse(mutations_xml).getroot()
    for m in root.findall("mutation"):
        key = (m.findtext("sourceFile"), int(m.findtext("lineNumber")))
        out.setdefault(key, []).append(
            (m.get("status") or "").upper() if m.get("status") else (m.findtext("status") or "").upper())
    return out


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--csv", default=os.path.join("data", "pilot_sample.csv"))
    ap.add_argument("--repo", default="commons-cli")
    ap.add_argument("--method", default="evosuite")
    ap.add_argument("--jacoco", default=None, help="mac dinh: data/raw/<repo>/target/site/jacoco/jacoco.xml")
    ap.add_argument("--pit", default=None, help="mac dinh: data/raw/<repo>/target/pit-reports/mutations.xml")
    ap.add_argument("--out", default=os.path.join("ms-analysis", "results", "metrics.csv"))
    ap.add_argument("--skip-missing", action="store_true",
                    help="bo qua ham khong co du lieu trong bao cao nay (dung cho repo da module)")
    args = ap.parse_args()

    raw = os.path.join(REPO_ROOT, "data", "raw", args.repo)
    jacoco_xml = args.jacoco or os.path.join(raw, "target", "site", "jacoco", "jacoco.xml")
    pit_xml = args.pit or os.path.join(raw, "target", "pit-reports", "mutations.xml")

    cov = load_jacoco_lines(jacoco_xml) if os.path.exists(jacoco_xml) else None
    muts = None
    if os.path.exists(pit_xml):
        try:
            muts = load_pit_mutations(pit_xml)
        except ET.ParseError:
            print(f"WARNING: {pit_xml} chua hoan chinh (PIT dang chay?) -> bo qua mutation")
    if cov is None:
        print(f"ERROR: khong thay {jacoco_xml}")
        return 1
    if muts is None:
        print(f"WARNING: khong thay {pit_xml} -> mutation_score de trong")

    rows = []
    with open(os.path.join(REPO_ROOT, args.csv), encoding="utf-8-sig") as f:
        for r in csv.DictReader(f):
            if r["language"] != "java" or args.repo not in r["source_repo"]:
                continue
            fid, s, e = r["func_id"], int(r["start_line"]), int(r["end_line"])
            src_name = os.path.basename(r["file"].replace("\\", "/"))
            # package path tu file column (phan sau src/main/java/)
            fpath = r["file"].replace("\\", "/")
            pkg = os.path.dirname(fpath.split("src/main/java/")[1]) if "src/main/java/" in fpath else ""

            # branch coverage theo khoang dong
            lines = cov.get((pkg, src_name), {})
            mb = sum(v[0] for k, v in lines.items() if s <= k <= e)
            cb = sum(v[1] for k, v in lines.items() if s <= k <= e)
            bc = round(cb / (mb + cb) * 100, 2) if (mb + cb) > 0 else ""

            # mutation score theo khoang dong
            ms = ""
            if muts is not None:
                st = [x for (sf, ln), sts in muts.items() if sf == src_name and s <= ln <= e for x in sts]
                if st:
                    killed = sum(1 for x in st if x in ("KILLED", "TIMED_OUT"))
                    ms = round(killed / len(st) * 100, 2)

            if args.skip_missing and bc == "" and ms == "":
                continue
            rows.append({"function_id": fid, "language": "java", "cc": r["cc"],
                         "method": args.method, "branch_coverage": bc,
                         "mutation_score": ms, "compiled": 1})
            print(f"{fid}: bc={bc} ({cb}/{mb + cb} br, dong {s}-{e}) ms={ms}")

    out = os.path.join(REPO_ROOT, args.out)
    os.makedirs(os.path.dirname(out), exist_ok=True)
    exists = os.path.exists(out)
    old = []
    if exists:
        with open(out, encoding="utf-8-sig") as f:
            old = [r for r in csv.DictReader(f)
                   if not (r["method"] == args.method and any(r["function_id"] == n["function_id"] for n in rows))]
    fields = ["function_id", "language", "cc", "method", "branch_coverage", "mutation_score", "compiled"]
    with open(out, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fields)
        w.writeheader()
        for r in old + rows:
            w.writerow({k: r.get(k, "") for k in fields})
    print(f"\nSaved {len(rows)} java rows (method={args.method}) -> {args.out}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
