"""Sinh lai 120 test bang PROMPT V2 — nhanh B cua thi nghiem A/B sau bao ve.

Bien duoc thao tac DUY NHAT la prompt. Model, temperature, top_p, max_tokens, cach boc
tach code block deu giu Y HET run_experiment.py. Neu doi them bat cu thu gi khac thi
chenh lech v1-v2 khong con quy duoc cho prompt nua.

  v1: full_ground_truth.csv   + prompt cu  -> generated_tests/gpt4o/
  v2: full_ground_truth_v2.csv + prompt_v2 -> generated_tests/gpt4o_v2/

Vi sao doi prompt (bang chung tu audit sau bao ve):
  - 59/120 muc tieu bi mo ta sai hoac thieu. Python thieu HAN cot class -> prompt chi noi
    "Generate pytest tests for `raise_routing_exception`" trong khi that ra la
    Flask.raise_routing_exception -> model doan `from flask.app import ...` -> ImportError.
    Ty le hong: 63% voi method vs 6% voi ham module-level.
  - Java: 18/58 bi gan nham class long nhau (Builder::getOptionValues that ra la
    CommandLine.getOptionValues), va khong co chu ky de phan biet 4 overload.
  prompt_v2 phat ra ten day du + chu ky chinh xac + import_hint + canh bao overload.

Chay:
  python scripts/run_experiment_v2.py --limit 3      # thu 3 ca truoc
  python scripts/run_experiment_v2.py                # full 120
Da sinh roi thi bo qua (resume duoc), tru khi --force.
"""
from __future__ import annotations

import argparse
import csv
import os
import sys
import time
from datetime import datetime

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
sys.path.insert(0, os.path.join(BASE_DIR, "ms-analysis", "scripts"))
sys.path.insert(0, os.path.join(BASE_DIR, "scripts"))

import prompt_v3 as prompt_v2  # noqa: E402

# `openai` va clean_code_block nap TRE (trong main): --dry-run phai chay duoc o moi tren
# may khong cai openai, va tranh keo dependency nang vao luc chi dem prompt.

# ---- CAU HINH: phai trung khop v1, KHONG duoc chinh ----
API_KEY = os.getenv("OPENAI_API_KEY")
MODEL = "gpt-4o-mini-2024-07-18"
MAX_TOKENS = 2048
TOP_P = 1.0
TEMPERATURE = 0.0
# --------------------------------------------------------

TEST_SOURCE = "gpt4o_v3"
CSV_PATH = os.path.join(BASE_DIR, "data", "full_ground_truth_v3.csv")
OUT_DIR = os.path.join(BASE_DIR, "generated_tests", TEST_SOURCE)
LOG_PATH = os.path.join(BASE_DIR, "results", "generation_log_v3.csv")
COST_LOG = os.path.join(BASE_DIR, "results", "api_log_v3.txt")

FIELDS = ["function_id", "language", "test_source", "model", "system_fingerprint",
          "test_path", "gen_status", "prompt_chars", "in_tokens", "out_tokens",
          "cost_usd", "timestamp"]


def out_path(rec: dict) -> tuple[str, str]:
    fid = rec["func_id"]
    if rec["language"] == "java":
        cls = rec["class_path"].split(".")[-1] or fid
        rel = os.path.join("java", f"{cls}_{fid.replace('-', '_')}Test.java")
    else:
        rel = os.path.join("python", f"test_{fid.replace('-', '_').lower()}.py")
    return os.path.join(OUT_DIR, rel), os.path.join("generated_tests", TEST_SOURCE, rel)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--limit", type=int, default=0, help="chi chay N ca dau (thu truoc)")
    ap.add_argument("--lang", default="", help="loc python | java")
    ap.add_argument("--force", action="store_true", help="sinh lai ca nhung ca da co")
    ap.add_argument("--dry-run", action="store_true", help="chi dem prompt + uoc tinh gia")
    a = ap.parse_args()

    if not API_KEY and not a.dry_run:
        print("LOI: chua co OPENAI_API_KEY.")
        return 1
    if not os.path.exists(CSV_PATH):
        print(f"LOI: khong thay {CSV_PATH} — chay enrich_ground_truth.py truoc.")
        return 1

    rows = list(csv.DictReader(open(CSV_PATH, encoding="utf-8-sig")))
    if a.lang:
        rows = [r for r in rows if r["language"] == a.lang]
    if a.limit:
        rows = rows[:a.limit]

    os.makedirs(os.path.join(OUT_DIR, "java"), exist_ok=True)
    os.makedirs(os.path.join(OUT_DIR, "python"), exist_ok=True)
    os.makedirs(os.path.join(BASE_DIR, "results"), exist_ok=True)

    done = set()
    if os.path.exists(LOG_PATH) and not a.force:
        for r in csv.DictReader(open(LOG_PATH, encoding="utf-8")):
            if r.get("gen_status") == "ok":
                done.add(r["function_id"])

    if a.dry_run:
        tot = sum(len(prompt_v2.build_prompt(r)) for r in rows)
        # ~4 ky tu / token; output uoc ~600 token/ca theo log v1
        est = (tot / 4 * 0.150 + len(rows) * 600 * 0.600) / 1e6
        print(f"{len(rows)} prompt, {tot:,} ky tu, uoc tinh ~${est:.2f}")
        return 0

    from openai import OpenAI
    from run_experiment import clean_code_block  # dung Y HET bo boc code cua v1

    client = OpenAI(api_key=API_KEY)
    new = os.path.exists(LOG_PATH)
    log = open(LOG_PATH, "a" if new else "w", encoding="utf-8", newline="")
    w = csv.DictWriter(log, fieldnames=FIELDS)
    if not new:
        w.writeheader()

    ok = err = 0
    for i, rec in enumerate(rows, 1):
        fid = rec["func_id"]
        if fid in done:
            print(f"[{i}/{len(rows)}] {fid} da co, bo qua.")
            continue

        prompt = prompt_v2.build_prompt(rec)
        abs_p, rel_p = out_path(rec)
        print(f"[{i}/{len(rows)}] {fid} ({rec['language']}, {rec['receiver_kind']}) ...")

        try:
            resp = client.chat.completions.create(
                model=MODEL, temperature=TEMPERATURE, top_p=TOP_P,
                max_tokens=MAX_TOKENS, messages=[{"role": "user", "content": prompt}])
            code = clean_code_block(resp.choices[0].message.content, rec["language"])
            it, ot = resp.usage.prompt_tokens, resp.usage.completion_tokens
            cost = (it * 0.150 + ot * 0.600) / 1e6

            with open(abs_p, "w", encoding="utf-8") as f:
                f.write(code)
            with open(COST_LOG, "a", encoding="utf-8") as f:
                f.write(f"[{datetime.now().isoformat()}] {fid} model={resp.model} "
                        f"in={it} out={ot} cost=${cost:.6f}\n")

            w.writerow({"function_id": fid, "language": rec["language"],
                        "test_source": TEST_SOURCE, "model": MODEL,
                        "system_fingerprint": resp.system_fingerprint or "",
                        "test_path": rel_p, "gen_status": "ok",
                        "prompt_chars": len(prompt), "in_tokens": it, "out_tokens": ot,
                        "cost_usd": f"{cost:.6f}",
                        "timestamp": datetime.now().isoformat()})
            log.flush()
            ok += 1
            print(f"  -> {rel_p}  (${cost:.4f})")
        except Exception as e:
            err += 1
            print(f"  -> LOI API {fid}: {e}")
            w.writerow({"function_id": fid, "language": rec["language"],
                        "test_source": TEST_SOURCE, "model": MODEL,
                        "system_fingerprint": "", "test_path": "",
                        "gen_status": "api_error", "prompt_chars": len(prompt),
                        "in_tokens": "", "out_tokens": "", "cost_usd": "",
                        "timestamp": datetime.now().isoformat()})
            log.flush()
            time.sleep(2)

    log.close()
    print(f"\nXONG: ok={ok} loi={err}. Test v2 nam o {OUT_DIR}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
