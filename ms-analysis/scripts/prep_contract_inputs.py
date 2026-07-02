"""
Build DATA_CONTRACT-shaped CSVs from the real experiment artifacts, so the
measurement harness (measure_python.py / measure_java) can consume them.

Input  (repo layout):
  data/<sample>.csv                      func_id,language,...,cc,func_name,...
  data/java_functions/<ID>.java          single-function source (DG, from main)
  data/python_functions/<ID>.py
  generated_tests/gpt4o/java/<ID>_Test.java
  generated_tests/gpt4o/python/test_<ID>.py

Output (DATA_CONTRACT.md schema):
  ms-analysis/data/<prefix>_functions.csv   function_id,language,code,cc,source_file,function_name
  ms-analysis/data/<prefix>_llm_output.csv  function_id,language,cc,status,generated_test

Usage:
  python ms-analysis/scripts/prep_contract_inputs.py                       # pilot (default)
  python ms-analysis/scripts/prep_contract_inputs.py \
      --sample data/full_ground_truth.csv --prefix full                    # full run
"""
import argparse
import os
import sys

import pandas as pd

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))


def src_path(func_id: str, language: str) -> str:
    folder = "java_functions" if language == "java" else "python_functions"
    ext = ".java" if language == "java" else ".py"
    return os.path.join(REPO, "data", folder, func_id + ext)


def test_path(func_id: str, language: str) -> str:
    if language == "java":
        return os.path.join(REPO, "generated_tests", "gpt4o", "java", f"{func_id}_Test.java")
    return os.path.join(REPO, "generated_tests", "gpt4o", "python", f"test_{func_id}.py")


def read(path: str) -> str | None:
    if not os.path.exists(path):
        return None
    with open(path, encoding="utf-8") as f:
        return f.read()


def main() -> int:
    ap = argparse.ArgumentParser(description="Ghep source + generated test thanh CSV theo DATA_CONTRACT")
    ap.add_argument("--sample", default=os.path.join("data", "pilot_sample.csv"),
                    help="CSV danh sach ham (mac dinh: pilot)")
    ap.add_argument("--prefix", default="pilot", help="tien to file output")
    args = ap.parse_args()

    sample = pd.read_csv(os.path.join(REPO, args.sample))
    out_dir = os.path.join(REPO, "ms-analysis", "data")
    os.makedirs(out_dir, exist_ok=True)

    funcs, tests, missing_src, missing_test = [], [], [], []
    for _, r in sample.iterrows():
        fid, lang = str(r["func_id"]), str(r["language"]).lower()
        code = read(src_path(fid, lang))
        if code is None:
            missing_src.append(fid)
            continue
        funcs.append({"function_id": fid, "language": lang, "code": code,
                      "cc": r["cc"], "source_file": r.get("file", ""),
                      "function_name": str(r.get("func_name", "")).split("::")[-1]})
        test = read(test_path(fid, lang))
        if test is None:
            missing_test.append(fid)
            continue
        tests.append({"function_id": fid, "language": lang, "cc": r["cc"],
                      "status": "OK", "generated_test": test})

    f_out = os.path.join(out_dir, f"{args.prefix}_functions.csv")
    t_out = os.path.join(out_dir, f"{args.prefix}_llm_output.csv")
    pd.DataFrame(funcs).to_csv(f_out, index=False)
    pd.DataFrame(tests).to_csv(t_out, index=False)

    print(f"functions : {len(funcs):3d} -> {os.path.relpath(f_out, REPO)}")
    print(f"llm tests : {len(tests):3d} -> {os.path.relpath(t_out, REPO)}")
    if missing_src:
        print(f"WARNING thieu source ({len(missing_src)}): {', '.join(missing_src)}")
    if missing_test:
        print(f"WARNING thieu generated test ({len(missing_test)}): {', '.join(missing_test)}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
