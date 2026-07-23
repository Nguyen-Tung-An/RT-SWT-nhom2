"""v3-fair — one-shot GIU NGUYEN prompt v1, CHI THEM khoi dac ta muc tieu.

VI SAO CAN BAN NAY. prompt_v3.py duoc viet lai tu dau nen no khac v1 o HAI chieu:
    v1  : co ### Example Input/Output ###  -> ONE-SHOT (1 exemplar)
    v3  : KHONG co exemplar                -> thuc chat la ZERO-SHOT + metadata
Nen chenh lech v1 vs v3 (16 -> 27) KHONG quy duoc cho "dac ta muc tieu", vi dong thoi da
bo mat exemplar. Hai bien doi cung luc.

v3-fair sua dieu do: giu NGUYEN VEN cau truc v1 (exemplar + ### Actual Task ###) va chi
CHEN THEM mot khoi ### Target ### truoc phan Actual Task.
    => ca hai deu ONE-SHOT thuc su
    => chi MOT bien khac nhau: co dac ta muc tieu hay khong
    => chenh lech quy duoc thang cho bien do (co nhan qua)

Khoi Target lay tu prompt_v3.target_spec() — qualname day du, chu ky chinh xac,
constructor DA KIEM CHUNG CHAY THAT, import hint, canh bao overload/abstract.

Chay:  python scripts/run_experiment_v3fair.py --lang python
       FUNC_DIR=clean_functions DATASET_CSV=data/clean_v3.csv TEST_SOURCE=clean_v3fair \\
           python scripts/run_experiment_v3fair.py
"""
from __future__ import annotations

import argparse
import csv
import os
import re
import sys
import time
from datetime import datetime

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
sys.path.insert(0, os.path.join(BASE_DIR, "ms-analysis", "scripts"))
sys.path.insert(0, os.path.join(BASE_DIR, "scripts"))

import prompt_v3  # noqa: E402  — chi dung target_spec(), khong dung build_prompt()

MODEL = "gpt-4o-mini-2024-07-18"
MAX_TOKENS = 2048
TOP_P = 1.0
TEMPERATURE = 0.0

TEST_SOURCE = os.environ.get("TEST_SOURCE", "gpt4o_v3fair")
CSV_PATH = os.environ.get("DATASET_CSV", os.path.join(BASE_DIR, "data", "clean_v3.csv"))
OUT_DIR = os.path.join(BASE_DIR, "generated_tests", TEST_SOURCE)
LOG_PATH = os.path.join(BASE_DIR, "results", f"generation_log_{TEST_SOURCE}.csv")

FIELDS = ["function_id", "language", "test_source", "model", "test_path", "gen_status",
          "in_tokens", "out_tokens", "cost_usd", "timestamp"]


def java_context(file_path: str) -> tuple[str, str]:
    f = file_path.replace("\\", "/")
    if "src/main/java/" in f:
        p = f.split("src/main/java/")[1]
        cls = p.split("/")[-1].replace(".java", "")
        return p.replace("/" + cls + ".java", "").replace("/", "."), cls
    return "", os.path.basename(f).replace(".java", "")


def build(rec: dict) -> str:
    """Prompt v1 NGUYEN VEN + chen khoi ### Target ### ngay truoc ### Actual Task ###."""
    src = prompt_v3.load_source(rec)
    target_block = "### Target ###\n" + prompt_v3.target_spec(rec) + "\n\n"

    if rec["language"] == "java":
        pkg, cls = java_context(rec["file"])
        fn = rec["func_name"].split("::")[-1]
        return (
            "You are an expert software tester.\n"
            "Generate JUnit 5 tests to achieve maximum branch coverage and mutation score.\n"
            "Do not output any explanations, only the executable Java code.\n\n"
            "### Example Input ###\n"
            "Class: org.example.MathUtils\n"
            "Method: add\n"
            "```java\n"
            "public static int add(int a, int b) { return a + b; }\n"
            "```\n\n"
            "### Example Output ###\n"
            "```java\n"
            "package org.example;\n"
            "import org.junit.jupiter.api.Test;\n"
            "import static org.junit.jupiter.api.Assertions.*;\n\n"
            "public class MathUtilsTest {\n"
            "    @Test\n"
            "    void testAdd_BothNegative() {\n"
            "        assertEquals(0, MathUtils.add(-1, -1));\n"
            "    }\n"
            "    @Test\n"
            "    void testAdd_Normal() {\n"
            "        assertEquals(5, MathUtils.add(2, 3));\n"
            "    }\n"
            "}\n"
            "```\n\n"
            + target_block +
            "### Actual Task ###\n"
            f"The function below belongs to public class `{pkg}.{cls}`.\n"
            f"Generate JUnit 5 tests in package `{pkg}` that call `{fn}`.\n"
            f"Include the correct `package {pkg};` at the top of the file.\n\n"
            f"```java\n{src}\n```"
        )

    mod = rec.get("module_or_package", "")
    fn = rec["func_name"].split("::")[-1]
    return (
        "You are an expert software tester.\n"
        "Generate pytest tests to achieve maximum branch coverage and mutation score.\n"
        "Do not output any explanations, only the executable Python code.\n\n"
        "### Example Input ###\n"
        "Module: mymath.utils\n"
        "Function: add\n"
        "```python\n"
        "def add(a, b):\n"
        "    return a + b\n"
        "```\n\n"
        "### Example Output ###\n"
        "```python\n"
        "from mymath.utils import add\n\n"
        "def test_add_both_negative():\n"
        "    assert add(-1, -1) == -2\n\n"
        "def test_add_normal():\n"
        "    assert add(2, 3) == 5\n"
        "```\n\n"
        + target_block +
        "### Actual Task ###\n"
        f"The function below belongs to the installed module `{mod}`.\n"
        f"Generate pytest tests for `{fn}`.\n"
        "Do NOT re-implement or copy the function into the test file — test the imported "
        "original.\n"
        "The module and its dependencies are installed and importable.\n\n"
        f"```python\n{src}\n```"
    )


def out_path(rec: dict) -> tuple[str, str]:
    fid = rec["func_id"]
    rel = (os.path.join("java", fid + "_Test.java") if rec["language"] == "java"
           else os.path.join("python", f"test_{fid}.py"))
    return os.path.join(OUT_DIR, rel), os.path.join("generated_tests", TEST_SOURCE, rel)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--lang", default="")
    ap.add_argument("--limit", type=int, default=0)
    ap.add_argument("--dry-run", action="store_true")
    a = ap.parse_args()

    rows = list(csv.DictReader(open(CSV_PATH, encoding="utf-8-sig")))
    if a.lang:
        rows = [r for r in rows if r["language"] == a.lang]
    if a.limit:
        rows = rows[:a.limit]

    if a.dry_run:
        tot = sum(len(build(r)) for r in rows)
        print(f"{len(rows)} prompt, {tot:,} ky tu, uoc ~${(tot/4*0.150 + len(rows)*600*0.600)/1e6:.2f}")
        print("\n--- MAU (kiem tra co exemplar + Target khong) ---")
        p = build(rows[0])
        for blk in ("### Example Input ###", "### Example Output ###",
                    "### Target ###", "### Actual Task ###"):
            print(f"  {blk:26s} {'CO' if blk in p else 'THIEU'}")
        return 0

    from openai import OpenAI
    from run_experiment import clean_code_block
    cli = OpenAI(api_key=os.environ["OPENAI_API_KEY"])

    os.makedirs(os.path.join(OUT_DIR, "java"), exist_ok=True)
    os.makedirs(os.path.join(OUT_DIR, "python"), exist_ok=True)
    os.makedirs(os.path.join(BASE_DIR, "results"), exist_ok=True)

    done = set()
    if os.path.exists(LOG_PATH):
        for r in csv.DictReader(open(LOG_PATH, encoding="utf-8")):
            if r.get("gen_status") == "ok":
                done.add(r["function_id"])

    new = os.path.exists(LOG_PATH)
    log = open(LOG_PATH, "a" if new else "w", encoding="utf-8", newline="")
    w = csv.DictWriter(log, fieldnames=FIELDS)
    if not new:
        w.writeheader()

    ok = err = 0
    cost = 0.0
    for i, rec in enumerate(rows, 1):
        fid = rec["func_id"]
        if fid in done:
            print(f"[{i}/{len(rows)}] {fid} da co, bo qua.")
            continue
        abs_p, rel_p = out_path(rec)
        try:
            resp = cli.chat.completions.create(
                model=MODEL, temperature=TEMPERATURE, top_p=TOP_P,
                max_tokens=MAX_TOKENS,
                messages=[{"role": "user", "content": build(rec)}])
            code = clean_code_block(resp.choices[0].message.content, rec["language"])
            open(abs_p, "w", encoding="utf-8").write(code)
            it, ot = resp.usage.prompt_tokens, resp.usage.completion_tokens
            c = (it * 0.150 + ot * 0.600) / 1e6
            cost += c
            ok += 1
            w.writerow({"function_id": fid, "language": rec["language"],
                        "test_source": TEST_SOURCE, "model": MODEL, "test_path": rel_p,
                        "gen_status": "ok", "in_tokens": it, "out_tokens": ot,
                        "cost_usd": f"{c:.6f}", "timestamp": datetime.now().isoformat()})
            log.flush()
            print(f"[{i}/{len(rows)}] {fid} -> {rel_p}  (${c:.4f})")
        except Exception as e:  # noqa: BLE001
            err += 1
            print(f"[{i}/{len(rows)}] {fid} LOI: {e}")
            w.writerow({"function_id": fid, "language": rec["language"],
                        "test_source": TEST_SOURCE, "model": MODEL, "test_path": "",
                        "gen_status": "api_error", "in_tokens": "", "out_tokens": "",
                        "cost_usd": "", "timestamp": datetime.now().isoformat()})
            log.flush()
            time.sleep(2)

    log.close()
    print(f"\nXONG: ok={ok} loi={err}  chi phi ${cost:.4f}  -> {OUT_DIR}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
