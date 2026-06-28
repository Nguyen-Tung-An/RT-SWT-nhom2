import os
import csv
import time
from datetime import datetime
from openai import OpenAI

# ================= CẤU HÌNH =================
API_KEY = os.getenv("OPENAI_API_KEY")
MODEL = "gpt-4o-mini-2024-07-18" 
TEST_SOURCE = "gpt4o"
MAX_TOKENS = 2048
TOP_P = 1.0
TEMPERATURE = 0.0

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
CSV_PATH = os.path.join(BASE_DIR, "data", "pilot_sample.csv")
OUT_DIR = os.path.join(BASE_DIR, "generated_tests", TEST_SOURCE)
LOG_PATH = os.path.join(BASE_DIR, "results", "generation_log.csv")
API_LOG_TXT = os.path.join(BASE_DIR, "results", "pilot_api_log.txt")
PILOT_OUTPUT_CSV = os.path.join(BASE_DIR, "results", "pilot_llm_output.csv")
# ============================================

def clean_code_block(text, language):
    text = text.strip()
    if text.startswith(f"```{language}"):
        text = text[len(f"```{language}"):]
    elif text.startswith("```"):
        text = text[3:]
    if text.endswith("```"):
        text = text[:-3]
    return text.strip()

def extract_context(file_path, lang):
    """Trích xuất package/module và class name từ đường dẫn"""
    file_path = file_path.replace("\\", "/")
    if lang == "java":
        if "src/main/java/" in file_path:
            pkg_path = file_path.split("src/main/java/")[1]
        else:
            pkg_path = file_path.split("/")[-1]
            return "", pkg_path.replace(".java", "")
        
        class_name = pkg_path.split("/")[-1].replace(".java", "")
        package_name = pkg_path.replace("/" + class_name + ".java", "").replace("/", ".")
        return package_name, class_name
    elif lang == "python":
        if "src/" in file_path:
            mod_path = file_path.split("src/")[1]
        else:
            mod_path = file_path.split("/")[-1]
        
        module_name = mod_path.replace("/", ".").replace(".py", "")
        return module_name, ""
    return "", ""

def main():
    if not API_KEY:
        print("LỖI: Chưa thiết lập biến môi trường OPENAI_API_KEY.")
        return

    client = OpenAI(api_key=API_KEY)
    
    os.makedirs(os.path.join(OUT_DIR, "java"), exist_ok=True)
    os.makedirs(os.path.join(OUT_DIR, "python"), exist_ok=True)
    os.makedirs(os.path.join(BASE_DIR, "results"), exist_ok=True)

    with open(CSV_PATH, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        rows = list(reader)

    print(f"Đã nạp {len(rows)} hàm từ pilot dataset.")

    # Chuẩn bị file log
    log_fieldnames = ["function_id", "language", "test_source", "model", "system_fingerprint", "test_path", "gen_status", "timestamp"]
    log_exists = os.path.exists(LOG_PATH)
    
    processed_ids = set()
    if log_exists:
        with open(LOG_PATH, "r", encoding="utf-8") as outf:
            try:
                reader_out = csv.DictReader(outf)
                for r in reader_out:
                    if r["test_source"] == TEST_SOURCE:
                        processed_ids.add(r["function_id"])
            except:
                pass

    log_file = open(LOG_PATH, "a" if log_exists else "w", encoding="utf-8", newline="")
    log_writer = csv.DictWriter(log_file, fieldnames=log_fieldnames)
    if not log_exists:
        log_writer.writeheader()

    # Chuẩn bị file csv tổng hợp
    pilot_out_exists = os.path.exists(PILOT_OUTPUT_CSV)
    pilot_out_file = open(PILOT_OUTPUT_CSV, "a" if pilot_out_exists else "w", encoding="utf-8", newline="")
    pilot_out_writer = csv.writer(pilot_out_file)
    if not pilot_out_exists:
        pilot_out_writer.writerow(["func_id", "language", "raw_source_path", "generated_test_code"])

    for i, row in enumerate(rows):
        func_id = row.get("function_id", row.get("func_id"))
        lang = row["language"]
        
        if func_id in processed_ids:
            print(f"[{i+1}/{len(rows)}] {func_id} đã log, BỎ QUA.")
            continue
            
        file_col = row["file"]
        func_name = row["func_name"]
        
        package_name, class_name = extract_context(file_col, lang)

        raw_path = row["raw_source_path"]
        
        # FIX PATH TO MATCH REAL SYSTEM SINCE REPO IS DIFFERENT
        if raw_path.startswith("data-research/"):
            raw_path_sys = raw_path[14:]
        else:
            raw_path_sys = raw_path
            
        source_path = os.path.join("d:\\SONHAI\\SU26\\SWT301\\research\\research", raw_path_sys)
        if not os.path.exists(source_path):
            print(f"Warning: source file not found {source_path}")
            continue
            
        with open(source_path, "r", encoding="utf-8") as sf:
            source_code = sf.read()

        out_ext = ".java" if lang == "java" else ".py"
        test_file_name = f"{func_id}_Test{out_ext}" if lang == "java" else f"test_{func_id}.py"
        out_file_path = os.path.join(OUT_DIR, lang, test_file_name)
        rel_test_path = f"generated_tests/{TEST_SOURCE}/{lang}/{test_file_name}"

        # AMENDED TO ONE-SHOT PROMPT
        if lang == "java":
            prompt = (
                f"You are an expert software tester.\n"
                f"Generate JUnit 5 tests to achieve maximum branch coverage and mutation score.\n"
                f"Do not output any explanations, only the executable Java code.\n\n"
                f"### Example Input ###\n"
                f"Class: org.example.MathUtils\n"
                f"Function: add\n"
                f"Code:\n"
                f"```java\n"
                f"package org.example;\n"
                f"public class MathUtils {{\n"
                f"    public static int add(int a, int b) {{\n"
                f"        if (a < 0 && b < 0) return 0;\n"
                f"        return a + b;\n"
                f"    }}\n"
                f"}}\n"
                f"```\n\n"
                f"### Example Output ###\n"
                f"```java\n"
                f"package org.example;\n"
                f"import org.junit.jupiter.api.Test;\n"
                f"import static org.junit.jupiter.api.Assertions.*;\n\n"
                f"public class MathUtilsTest {{\n"
                f"    @Test\n"
                f"    void testAdd_BothNegative() {{\n"
                f"        assertEquals(0, MathUtils.add(-1, -1));\n"
                f"    }}\n"
                f"    @Test\n"
                f"    void testAdd_Normal() {{\n"
                f"        assertEquals(5, MathUtils.add(2, 3));\n"
                f"    }}\n"
                f"}}\n"
                f"```\n\n"
                f"### Actual Task ###\n"
                f"The function below belongs to public class `{package_name}.{class_name}`.\n"
                f"Generate JUnit 5 tests in package `{package_name}` that call `{func_name}`.\n"
                f"Include the correct `package {package_name};` at the top of the file.\n\n"
                f"```java\n{source_code}\n```"
            )
        else:
            prompt = (
                f"You are an expert software tester.\n"
                f"Generate pytest tests to achieve maximum branch coverage and mutation score.\n"
                f"Do not output any explanations, only the executable Python code.\n\n"
                f"### Example Input ###\n"
                f"Module: mymath.utils\n"
                f"Function: add\n"
                f"Code:\n"
                f"```python\n"
                f"def add(a, b):\n"
                f"    if a < 0 and b < 0:\n"
                f"        return 0\n"
                f"    return a + b\n"
                f"```\n\n"
                f"### Example Output ###\n"
                f"```python\n"
                f"import pytest\n"
                f"from mymath.utils import add\n\n"
                f"def test_add_both_negative():\n"
                f"    assert add(-1, -1) == 0\n\n"
                f"def test_add_normal():\n"
                f"    assert add(2, 3) == 5\n"
                f"```\n\n"
                f"### Actual Task ###\n"
                f"The function below belongs to module `{package_name}`.\n"
                f"Generate pytest tests that test `{func_name}`.\n"
                f"Include the correct import statement: `from {package_name} import ...`.\n\n"
                f"```python\n{source_code}\n```"
            )

        print(f"[{i+1}/{len(rows)}] Đang gọi API Pilot cho {func_id} ({lang})...")
        
        try:
            response = client.chat.completions.create(
                model=MODEL,
                temperature=TEMPERATURE,
                top_p=TOP_P,
                max_tokens=MAX_TOKENS,
                messages=[{"role": "user", "content": prompt}]
            )
            
            output_code = response.choices[0].message.content
            output_code_clean = clean_code_block(output_code, lang)
            fingerprint = response.system_fingerprint or ""
            
            # Ghi log API txt (Tính cost: gpt-4o-mini = $0.150/1M input, $0.600/1M output)
            in_tokens = response.usage.prompt_tokens
            out_tokens = response.usage.completion_tokens
            cost = (in_tokens * 0.150 + out_tokens * 0.600) / 1000000
            with open(API_LOG_TXT, "a", encoding="utf-8") as f_txt:
                f_txt.write(f"[{datetime.now().isoformat()}] func_id={func_id}, model={response.model}, cost=${cost:.6f}\n")

            # Ghi file test lẻ
            with open(out_file_path, "w", encoding="utf-8") as outf:
                outf.write(output_code_clean)
                
            # Ghi file csv tổng (pilot_llm_output.csv)
            pilot_out_writer.writerow([func_id, lang, raw_path, output_code])
            pilot_out_file.flush()

            log_writer.writerow({
                "function_id": func_id,
                "language": lang,
                "test_source": TEST_SOURCE,
                "model": MODEL,
                "system_fingerprint": fingerprint,
                "test_path": rel_test_path,
                "gen_status": "ok",
                "timestamp": datetime.now().isoformat()
            })
            log_file.flush()
            print(f"  -> Lưu test tại: {rel_test_path}")
            
        except Exception as e:
            print(f"  -> LỖI API tại {func_id}: {e}")
            log_writer.writerow({
                "function_id": func_id,
                "language": lang,
                "test_source": TEST_SOURCE,
                "model": MODEL,
                "system_fingerprint": "",
                "test_path": "",
                "gen_status": "api_error",
                "timestamp": datetime.now().isoformat()
            })
            log_file.flush()
            time.sleep(2)

    log_file.close()
    pilot_out_file.close()
    print("ĐÃ HOÀN THÀNH TẠO TEST CASE PILOT VÀ LƯU LOG ĐẦY ĐỦ!")

if __name__ == "__main__":
    main()
