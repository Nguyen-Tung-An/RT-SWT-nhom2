"""Prompt v2 — sua GOC RE cua that bai hang loat (audit sau bao ve 2026-07).

Ba loi da xac minh bang source that:

 1. MINER BUG (Java): ground truth gan SAI class cho 18/58 ham (31%). Miner lay class
    nested khai bao gan nhat ma khong pop stack khi block dong:
        JA-002  CSV "Builder::getOptionValues"        -> that la CommandLine.getOptionValues
        JA-005  CSV "Split::cbrt"                     -> that la AccurateMath.cbrt
        JA-020  CSV "OptionComparator::appendOption"  -> that la HelpFormatter.appendOption

 2. PROMPT MAU THUAN (Java): run_experiment.py dong 176-177 noi class la `CommandLine`
    (suy tu ten FILE, dung) nhung bao goi `Builder::getOptionValues` (nhan sai, va `::`
    con la toan tu method-reference cua Java). Model bo tien to -> goi nham overload.

 3. THIEU CONTAINER (Python): func_name tran, khong co class. 26/28 ham INVALID la METHOD
    bi xe khoi class -> model doan `from flask.app import raise_routing_exception`
    -> ImportError. Ham module-level that su chi hong 6%.

Fix: prompt lay tu full_ground_truth_v2.csv (enrich_ground_truth.py) va neu MOT muc tieu
duy nhat, khong nhap nhang: qualname day du + chu ky phan biet overload + cach dung toi.

Dung:
    python ms-analysis/scripts/prompt_v2.py --demo            # in truoc/sau cho 2 ca goc re
    python ms-analysis/scripts/prompt_v2.py --dump out_dir/   # xuat 120 prompt ra file
"""
from __future__ import annotations

import argparse
import csv
import os
import sys

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
GT_V2 = os.path.join(REPO, "data", "full_ground_truth_v2.csv")


def load_source(rec: dict) -> str:
    """Doc than ham tu file da mine (bang ma LLM duoc xem)."""
    p = os.path.join(REPO, "data",
                     "java_functions" if rec["language"] == "java" else "python_functions",
                     rec["func_id"] + (".java" if rec["language"] == "java" else ".py"))
    return open(p, encoding="utf-8", errors="replace").read() if os.path.exists(p) else ""


# --------------------------------------------------------------- target spec
def target_spec(rec: dict) -> str:
    """Khoi mo ta muc tieu — thay cho dong `call {func_name}` nhap nhang cua v1."""
    name = rec["func_name"].split("::")[-1]
    q = rec["qualname"] or name
    sig = f"{name}({rec['param_types']})" if rec["param_types"] else f"{name}()"

    if rec["language"] == "java":
        lines = [
            f"Fully-qualified target : {q}",
            f"Declaring class        : {rec['class_path']}",
            f"Package                : {rec['module_or_package']}",
            f"Exact signature        : {sig}",
            f"Modifier               : {rec['visibility']}, {rec['receiver_kind']}",
        ]
        if "," in rec["param_types"] or rec["param_types"]:
            lines.append("IMPORTANT: this class may declare several overloads with the same "
                         "name. You must call the one matching the exact signature above.")
        if rec.get("enrich_note") == "nested-class":
            lines.append(f"IMPORTANT: the target is a NESTED class. Call it as "
                         f"{rec['class_path']}.{name}(...), not via the outer class.")
    else:
        lines = [
            f"Fully-qualified target : {q}",
            f"Module                 : {rec['module_or_package']}",
            f"Exact signature        : {sig}",
        ]
        if rec["is_method"] == "yes":
            lines += [
                f"Declaring class        : {rec['class_path']}",
                f"Receiver               : {rec['receiver_kind']}",
                "IMPORTANT: this is a METHOD of the class above, NOT a module-level "
                "function. Importing it directly (from <module> import <name>) will raise "
                "ImportError. Construct the class first, then call the method on it.",
            ]
        else:
            lines.append("This is a module-level function; import it directly.")
    lines.append(f"How to reach it        : {rec['import_hint']}")
    return "\n".join(lines)


def build_prompt(rec: dict) -> str:
    lang = rec["language"]
    src = load_source(rec)
    name = rec["func_name"].split("::")[-1]
    fw = "JUnit 5" if lang == "java" else "pytest"
    fence = "java" if lang == "java" else "python"

    return (
        "You are an expert software tester.\n"
        f"Generate {fw} tests that maximise branch coverage AND mutation score for exactly "
        "one target method.\n"
        "Output only executable code, no explanation.\n\n"
        "### Target ###\n"
        f"{target_spec(rec)}\n\n"
        "### Rules ###\n"
        "1. Test the real method in the real project. Do NOT re-implement, copy, mock or "
        "stub the target itself.\n"
        "2. Every test must ultimately invoke the exact target above.\n"
        "3. Assert on the RETURNED VALUE or observable state, not merely that the call does "
        "not throw. Tests that only assert not-null will not detect faults.\n"
        "4. Cover the branches inside the target, including boundary and error paths.\n\n"
        "### Source of the target ###\n"
        f"```{fence}\n{src}\n```\n\n"
        f"Now write the {fw} test class for `{name}`.\n"
    )


# --------------------------------------------------------------- v1 (de doi chieu)
def build_prompt_v1_tail(rec: dict) -> str:
    """Tai hien 2 dong quan trong cua prompt cu, de thay ro cho nhap nhang."""
    f = rec["file"].replace("\\", "/")
    cls = f.split("/")[-1].replace(".java", "")
    pkg = "/".join(f.split("/")[:-1]).split("java/")[-1].replace("/", ".")
    if rec["language"] == "java":
        return (f"The function below belongs to public class `{pkg}.{cls}`.\n"
                f"Generate JUnit 5 tests in package `{pkg}` that call `{rec['func_name']}`.")
    return f"Generate pytest tests for `{rec['func_name']}`."


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--demo", action="store_true", help="in truoc/sau cho JA-002 + PY-001")
    ap.add_argument("--dump", metavar="DIR", help="xuat toan bo 120 prompt ra thu muc")
    a = ap.parse_args()

    if not os.path.exists(GT_V2):
        print("Thieu full_ground_truth_v2.csv — chay enrich_ground_truth.py truoc.")
        return 1
    rows = {r["func_id"]: r for r in csv.DictReader(open(GT_V2, encoding="utf-8"))}

    if a.demo:
        for fid in ("JA-002", "PY-001"):
            r = rows[fid]
            print("=" * 78)
            print(f"{fid}  ({r['language']})   func_name trong CSV = {r['func_name']!r}")
            print("-" * 78)
            print("[v1 — cho gay loi]")
            print("  " + build_prompt_v1_tail(r).replace("\n", "\n  "))
            print()
            print("[v2 — da sua]")
            print("  " + target_spec(r).replace("\n", "\n  "))
            print()
        return 0

    if a.dump:
        os.makedirs(a.dump, exist_ok=True)
        for fid, r in rows.items():
            ext = ".java.txt" if r["language"] == "java" else ".py.txt"
            open(os.path.join(a.dump, fid + ext), "w", encoding="utf-8").write(build_prompt(r))
        print(f"da xuat {len(rows)} prompt vao {a.dump}")
        return 0

    ap.print_help()
    return 0


if __name__ == "__main__":
    sys.exit(main())
