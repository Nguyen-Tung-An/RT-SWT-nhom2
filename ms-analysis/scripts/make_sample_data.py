"""
make_sample_data.py - DATA GIẢ để test pipeline MS (KHÔNG phải data thật).
Sinh: functions.sample.csv, ground_truth.sample.csv, llm_output.sample.csv,
      metrics.sample.csv  (đúng schema DATA_CONTRACT.md).
"""
from __future__ import annotations
import argparse, os
import numpy as np, pandas as pd

PYSRC = ("def f{k}(x):\n"
         "    if x > {a}:\n"
         "        return x - {a}\n"
         "    elif x < -{a}:\n"
         "        return x + {a}\n"
         "    return 0")
# test sinh ra (đúng logic -> pass, phủ cả 3 nhánh)
PYTEST = ("def test_pos(): assert f{k}({a}+5) == 5\n"
          "def test_neg(): assert f{k}(-{a}-3) == -3\n"
          "def test_zero(): assert f{k}(0) == 0")
JVSRC = ("public static int f{k}(int x) {{\n"
         "    if (x > {a}) return x - {a};\n"
         "    else if (x < -{a}) return x + {a};\n"
         "    return 0;\n}}")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--output-dir", default="data")
    ap.add_argument("--n-per-lang", type=int, default=8)
    ap.add_argument("--seed", type=int, default=42)
    a = ap.parse_args()
    np.random.seed(a.seed); os.makedirs(a.output_dir, exist_ok=True)

    funcs, gts, outs, metrics = [], [], [], []
    for lang, src in (("python", PYSRC), ("java", JVSRC)):
        for k in range(a.n_per_lang):
            fid = f"{lang[:2]}_{k:03d}"; cc = int(np.random.randint(5, 11))
            code = src.format(k=k, a=cc)
            funcs.append({"function_id": fid, "language": lang, "code": code, "cc": cc,
                          "source_file": f"sample/{lang}/m{k}", "function_name": f"f{k}"})
            gts.append({"function_id": fid, "reference_code": code, "iaa_checked": 0, "notes": ""})
            if lang == "python":
                outs.append({"function_id": fid, "language": "python", "cc": cc,
                             "strategy": "one_shot", "model": "gpt-4o-mini-2024-07-18",
                             "system_fingerprint": "fp_sample", "status": "OK", "n_chars": 120,
                             "cost_usd": 0.0001, "generated_test": PYTEST.format(k=k, a=cc)})
            # metrics gia: GPT giam theo CC; baseline thap hon coverage, cao hon mutation
            bc = float(np.clip(95 - (cc - 5) * 5 + np.random.normal(0, 5), 0, 100))
            ms = float(np.clip(75 - (cc - 5) * 6 + np.random.normal(0, 7), 0, 100))
            comp = int(np.random.random() > 0.1)
            metrics.append({"function_id": fid, "language": lang, "cc": cc, "method": "gpt4o-mini",
                            "branch_coverage": round(bc, 2), "mutation_score": round(ms, 2), "compiled": comp})
            bl = "evosuite" if lang == "java" else "pynguin"
            metrics.append({"function_id": fid, "language": lang, "cc": cc, "method": bl,
                            "branch_coverage": round(float(np.clip(bc - 8 + np.random.normal(0, 4), 0, 100)), 2),
                            "mutation_score": round(float(np.clip(ms - 5 + np.random.normal(0, 5), 0, 100)), 2),
                            "compiled": 1})

    pd.DataFrame(funcs).to_csv(f"{a.output_dir}/functions.sample.csv", index=False)
    pd.DataFrame(gts).to_csv(f"{a.output_dir}/ground_truth.sample.csv", index=False)
    pd.DataFrame(outs).to_csv(f"{a.output_dir}/llm_output.sample.csv", index=False)
    pd.DataFrame(metrics).to_csv(f"{a.output_dir}/metrics.sample.csv", index=False)
    print(f"wrote functions({len(funcs)}), ground_truth, llm_output({len(outs)}), metrics({len(metrics)}) -> {a.output_dir}/")


if __name__ == "__main__":
    main()
