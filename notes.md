# notes.md — Technical Decisions & Error Log

Project: RT-SWT-nhom2 — LLM for Unit Test Case Generation (SWT301, Group 2)
This file records every technical decision and error during RBL-4, per RBL-0/RBL-4 requirements.

---

## Technical decisions

### 2026-06-28 — Model change (Amendment v1.1)
- **Decision:** Change the LLM from `gpt-4o-2024-08-06` to **`gpt-4o-mini-2024-07-18`**.
- **Reason:** The team only has API access to `gpt-4o-mini` (no `gpt-4o` quota) — an objective technical/access constraint under proposal §8.6 (not HARKing).
- **Academic basis:** `gpt-4o-mini` is itself evaluated in Paper [5] (Konstantinou et al., 2026), so it stays within the literature base.
- **Unchanged (anti-HARKing):** the 3 RQs, metrics (Branch Coverage, Mutation Score), thresholds (80% / 60% / ρ < −0.5), statistical tests (One-sample Wilcoxon, Paired Wilcoxon, Spearman, α = 0.05), dataset, baselines, INVALID scoring.
- **Cost impact:** price ~$0.15 / $0.60 per 1M (in/out) → total estimate ~$1.00 (was ~$15).
- **Status:** ✅ **Chốt ngày 2026-07-02** — model chính thức: `gpt-4o-mini-2024-07-18`. Trình GV xác nhận cùng amendment v1.2 trước full run. See `ms-analysis/proposal-amendment-v1.1.md`.

### 2026-07-02 — Dataset (Amendment v1.2)
- **Decision:** Chốt dataset = **bộ hàm nhóm tự mine từ 10 repo OSS pinned commit** (8 Java Defects4J subject programs + requests/flask), **N = 120** (60 Java + 60 Python), CC 5–10 — thay cho "Defects4J + CodeXGLUE, N=100" trong proposal §5.2.
- **Reason:** CodeXGLUE không phải bộ hàm chạy được cho test generation; các paper SLR không thống nhất dataset; mining trực tiếp tại commit pin đảm bảo tái lặp. Open item này đã ghi công khai trong proposal §5.2 note từ trước (không HARKing).
- **Provenance:** `data/raw/README.md` (URL, license, commit pin, ngày tải 2026-06-27).
- **Status:** ✅ Chốt trong nhóm 2026-07-02 — trình GV xác nhận cùng amendment v1.1 trước full run. See `ms-analysis/proposal-amendment-v1.2.md`.

### ✅ 2026-07-03 — Chốt: ONE-SHOT prompting (đóng OPEN item)
- Nhóm xác nhận dùng **one-shot (1 exemplar)** — khớp amendment v1.1 và khớp config pilot đã chạy (`run_experiment.py` dùng one-shot prompt từ đầu).
- Lịch sử vấn đề: `team-synthesis/proposal.md` §5.3 ghi zero-shot, amendment v1.1 ghi one-shot → nay thống nhất **one-shot**.
- Việc còn lại: khi PL trình GV amendment v1.1 + v1.2, nêu rõ điểm lệch này (proposal gốc ghi zero-shot) để GV xác nhận cùng lúc — sau đó cập nhật proposal/hypotheses/design-rationale cho khớp chữ "one-shot".

### INVALID handling (from proposal §5.1)
- Tests that fail to compile or hit a serious runtime error are scored **0%** for both branch coverage and mutation score and marked INVALID. Empty API responses are never auto-filled.

---

## Experiment log

### 2026-06-28 22:05–22:08 — Pilot run (LLM generation)
- Model: `gpt-4o-mini-2024-07-18`, `temperature=0.0`.
- Sample: **24 functions** — 12 Java (`JA-002 … JA-060`) + 12 Python (`PY-001 … PY-047`).
- Output: `generated_tests/gpt4o/{java,python}/`, `results/pilot_llm_output.csv`.
- API log: `results/pilot_api_log.txt` (timestamp, model, per-call cost). Total ≈ **$0.0069**.
- Status: ✅ pipeline runs end-to-end; no rate-limit/empty-response errors observed.

### Baselines
- Randoop (Java): ✅ generated — `generated_tests/randoop/java/RegressionTest*.java`.
- EvoSuite (Java): ✅ **verify chạy được** (2026-07-02, smoke test 1 class trên JDK 11) — chưa chạy đủ 12 hàm pilot. Xem error log bên dưới về JDK compat + timeout.
- Pynguin + Hypothesis (Python): ⏳ not yet generated (Pynguin cần Python 3.10, máy đang 3.14).

---

## Open items / TODO (to close RBL-4)

1. ✅ ~~Amendment v1.1 (gpt-4o-mini)~~ — chốt 2026-07-02; còn bước trình GV xác nhận (gộp với v1.2).
2. ⏳ **Compute metrics on the pilot output** (JaCoCo/PIT + Coverage.py/pytest-mutagen) → fill `ms-analysis/results/` (currently empty) → confirm the pilot pipeline against the proposal's success criteria.
3. ⏳ **Run baselines** EvoSuite / Pynguin / Hypothesis on the same functions.
4. ⏳ **Full experiment** (120 hàm: 60 Java + 60 Python, theo amendment v1.2) → `results/full_llm_output.csv`, `results/full_api_log.txt`.
5. ⏳ **Full analysis** → `results/summary.csv` (metric, p-value, effect size, N) + `figures/fig1_distribution.png`, `figures/fig2_comparison.png` (≥ 300 DPI).
6. ✅ ~~zero-shot vs one-shot~~ — chốt **one-shot** 2026-07-03; còn bước nêu với GV cùng đợt amendment.
7. ✅ ~~Dataset under review~~ — chốt 2026-07-02: dùng bộ mined từ 10 repo pinned (amendment v1.2); còn bước trình GV xác nhận (gộp với v1.1).

---

## Error log
*(append problems + resolutions here as they occur during the full run)*

### 2026-07-02 — Đo pilot Python (12 hàm): 10/12 INVALID + 2 hàm số ảo — 3 root cause ⚠️
- **Kết quả thô** (`ms-analysis/results/metrics.csv`, method=gpt4o-mini): 10/12 `compiled=0`; PY-041 & PY-047 `compiled=1` nhưng `bc=0.0, ms=100.0` — **số ảo, không dùng được**.
- **Root cause 1 — DATA:** nhiều file trong `data/python_functions/` là *method xé từ class* (ví dụ PY-001: còn nguyên thụt dòng, `self`, relative import `.debughelpers`) → ghi vào `solution.py` là SyntaxError ngay → INVALID hàng loạt, bất kể chất lượng test của LLM.
- **Root cause 2 — PROMPT:** LLM không test hàm gốc mà **tự chép lại hàm vào class Mock rồi test bản chép** (test_PY-001 tạo `MockApp` chứa nguyên văn logic) → kể cả chạy được, coverage trên hàm gốc = 0. Kết quả không đo được RQ1/RQ2.
- **Root cause 3 — DATA:** file hàm mined không kèm import phụ thuộc (PY-041 `get_root_path` dùng `sys`/`os` nhưng file không có `import sys, os`) → mọi test chết NameError trên **cả bản gốc** → mutant nào cũng "bị giết" → ms=100% giả.
- **Root cause 4 — HARNESS:** `from solution import *` không import tên bắt đầu bằng `_` (PY-047 `_find_package_path` → `NameError` trên mọi test) — harness cần import tường minh `from solution import <func_name>`.
- **Lỗ hổng harness — MS:** `measure_python.py` không kiểm tra test **pass trên bản gốc** trước khi đo mutation (chuẩn mutation testing bắt buộc green-on-original) → sinh ra ms=100% giả ở trên.
- **📄 Log nguyên văn lỗi từng hàm (12/12):** `ms-analysis/results/pilot_python_error_log.md` — sinh bằng `ms-analysis/scripts/diagnose_pilot_errors.py` (chạy lại được bất kỳ lúc nào).
- **Đề xuất (nhóm chốt trước khi đo lại pilot, KHÔNG chạy full run khi chưa xử lý):**
  1. *DG (Kim):* chuẩn hoá file hàm thành self-contained — dedent method, thêm import cần thiết; hoặc thay hàm không thể standalone bằng hàm top-level cùng band CC.
  2. *LR (Hải):* sửa prompt — cấm re-implement, bắt buộc test import và gọi đúng hàm được cung cấp (exemplar one-shot minh hoạ `from solution import <func>`).
  3. *MS (Phúc):* thêm green-check vào `measure_python.py` — test fail trên bản gốc ⇒ INVALID, không đo mutation; các fix này là điều kiện tiên quyết của số liệu hợp lệ.
  4. Java (`data/java_functions/` cũng là method xé lẻ) nhiều khả năng dính cùng vấn đề — kiểm tra `measure_java` trước khi tin kết quả.
- **Ý nghĩa:** pilot làm đúng nhiệm vụ — lộ lỗi tích hợp trước full run. Số trong `metrics.csv` hiện tại chỉ là bằng chứng lỗi, **không phải** kết quả RQ.

### 2026-07-03 — Data v2 từ DG (functions.rar): P1/P2 sạch 60/60, còn rủi ro runtime ⚠️
- **Java:** 60/60 file thay nội dung — phát hiện bản cũ trong repo **lệch CSV** (vd JA-002 chứa hàm `concat` lạ thay vì `getOptionValues`). Bản v2 đã khớp.
- **Python:** 60/60 pass P1 (parse) + P2 (import) — Kim đã dedent + thêm `from __future__ import annotations`.
- **Còn lại:** ~40/60 hàm tham chiếu tên không định nghĩa trong thân hàm (`click`, `current_app`, `RequestRedirect`...) → NameError khi test chạm nhánh đó; 12 hàm chỉ vướng `self` (mock được). Chi tiết + 2 hướng xử lý (A: vá data / B: đo trong module thật): `ms-analysis/results/data_v2_check.md` — **nhóm cần chốt trước khi LR sinh test mới**.
- **Chẩn đoán lại pilot với data v2 + test CŨ:** 0×P1 (trước là 9) · 8×P3 (test cũ import flask/click) · 4×P4 (test fail trên bản gốc) → chốt chặn đã chuyển từ DATA sang TEST GENERATION (chờ LR chạy lại prompt mới).
- Data v2 đã commit vào `data/{java,python}_functions/` (`2ccffc7`). Nhắc DG: lần sau **push lên git** thay vì gửi rar — repo là nguồn chuẩn.

### 2026-07-04 — GATE ĐO JAVA: PASS ✅ — pipeline JaCoCo chạy end-to-end, có số thật đầu tiên
- **Cách đo:** chèn test EvoSuite (12 hàm pilot → 4 class) vào `src/test/java` của commons-cli (commit pin, build local) → `mvn test jacoco:report`. 343 test xanh 100%.
- **Branch coverage (class-level, test EvoSuite):** PatternOptionBuilder **100%** (44/44) · CommandLine **97.06%** (66/68) · HelpFormatter **77.94%** (106/136) · DefaultParser **63.73%** (130/204).
- **Playbook cho MS khi nhân rộng (5 bẫy đã dẫm):**
  1. `evosuite-standalone-runtime-1.2.0` KHÔNG có trên Maven Central → tải GitHub releases, `mvn install:install-file -DgeneratePom=true` (không có generatePom sẽ dính pom parent hỏng).
  2. Project JUnit5 cần thêm dep test: `junit:junit:4.13.2` + `junit-vintage-engine` (test EvoSuite là JUnit4).
  3. Compile test cần `-Dmaven.compiler.release=11` — EvoSuite sinh code dùng API Java 11 (`Writer.nullWriter()`...), trong khi commons-* target Java 8.
  4. KHÔNG tự chèn jacoco prepare-agent — commons-parent đã tích hợp sẵn JaCoCo, 2 agent cùng lúc = LinkageError crash; chỉ cần gọi `jacoco:report`.
  5. Sửa `separateClassLoader = true → false` trong `*_ESTest.java` — không sửa thì test vẫn xanh nhưng JaCoCo báo **0%** (classloader riêng của EvoSuite làm lệch hash class — lại một kiểu "số giả" nữa).
- **HOÀN TẤT GATE (2026-07-04):** `measure_java_from_reports.py` tách số theo TỪNG HÀM qua khoảng dòng (jacoco.xml line-level + PIT mutations.xml). PIT chạy OK: 497 mutant, killed 300 (60% toàn cục).
- **Baseline EvoSuite pilot Java — 12/12 hàm** (lưu `ms-analysis/results/metrics.csv`, method=evosuite): branch coverage median **83.3%** (min 50, max 100) · mutation score median **71.4%** (min 0, max 100). Đây là mốc so găng RQ2 cho gpt-4o-mini. Điểm đáng chú ý: JA-020 ms=0% và JA-050 ms=12.5% — coverage cao không đồng nghĩa mutation cao, đúng lý do proposal chọn cặp metric này.

### 2026-07-03 — Test Java pilot của LLM cũng phải sinh lại (hậu quả data v1 sai) ⚠️
- **`generated_tests/gpt4o/java/JA-002_Test.java` test hàm `CommandLine.concat(boolean[]...)` — hàm KHÔNG tồn tại** trong CommandLine thật: pilot generation chạy trên data v1 (nội dung lệch CSV) nên LLM được xem source sai. → 12 test Java pilot hiện tại vô giá trị để đo, **LR phải sinh lại sau khi có data v2** (gộp cùng đợt sinh lại Python).
- Lỗi phụ: file lưu tên `JA-XXX_Test.java` nhưng class bên trong là `<ClassName>Test` → javac không compile được file rời (Java bắt tên file = tên public class). Sinh lại cần sửa cách đặt tên file trong `run_experiment.py`.
- `ms-analysis/measure_java` thiết kế theo quy ước class `Example` (hàm static bọc trong Example.java) — **không khớp** test thật (test theo package/class thật). Cùng bản chất với quyết định A/B phía Python: khuyến nghị **đo trong ngữ cảnh repo thật** (chèn test vào `src/test/java` của repo pin + JaCoCo/PIT scope theo class đích) — MS xem `data_v2_check.md`.
- **Đo được ngay không cần chờ LR:** test Randoop (+ EvoSuite đang sinh) xuất phát từ class THẬT → dùng làm gate kiểm chứng pipeline đo Java trước.

### 2026-07-03 — EvoSuite "thành công GIẢ" (exit 0 nhưng không sinh test) + fix hạ tầng Java ⚠️
- **Phát hiện:** EvoSuite **exit code 0 kể cả khi thất bại hoàn toàn** — script cũ chỉ check returncode nên log ghi "ok" giả. Root cause tầng 2: master chạy JDK 11 (qua `EVOSUITE_JAVA`) nhưng **client bị spawn bằng java từ `JAVA_HOME`** (vẫn JDK 17) → client chết ngầm.
- **Fix (`2f2b216`):** run_baselines tự set `JAVA_HOME` theo `EVOSUITE_JAVA` cho process con + status "ok" chỉ khi **file `<Class>_ESTest.java` tồn tại thật**, không tin exit code. 12 dòng log "ok" giả đã được revert trước khi commit (log sạch).
- **Hạ tầng:** đã build đủ **8/8 repo Java** ở commit pin trên máy RW (7 repo mới: math/csv/collections/gson/jsoup/joda-time/jfreechart). `java_classpath()` mới gộp mọi `*/target/classes` trong repo — cần vì gson mine hàm từ 2 module (`gson/` + `extras/`).
- **Lưu ý cho full run:** classpath mới chỉ gồm class nội bộ repo, chưa gồm dependency ngoài (jar trong `.m2`) — nếu EvoSuite/Randoop báo NoClassDefFound với joda-time/jfreechart thì bổ sung `mvn dependency:build-classpath`.

### 2026-07-02 — EvoSuite: fail trên JDK 17, chạy OK trên JDK 11; timeout 30s kill oan mọi run
- **JDK 17:** master chết `InaccessibleObjectException` ("module java.base does not opens java.util") — module system Java 17 chặn reflection của xstream. `--add-opens` lẫn `JAVA_TOOL_OPTIONS` đều không cứu được vì EvoSuite spawn process con theo cách riêng.
- **JDK 11** (Temurin 11.0.31 portable, giải nén vào `F:\Java`, không cần cài): ✅ chạy OK — sinh `generated_tests/evosuite/java/.../CommandLine_ESTest.java` (smoke test `search_budget=20`, tổng ~50s/class).
- **Bug trong fix `43c2f03`:** timeout 30s **ngắn hơn thời gian chạy tối thiểu** (budget mặc định 60s + JVM overhead ≈ 90–120s) → mọi run hợp lệ sẽ bị kill và ghi "failed" — hiện tượng giống hệt "treo máy" nhưng thực ra là chạy chưa xong. Đã sửa trong `run_baselines.py`: `-Dsearch_budget=60` tường minh, timeout 180s, thêm env var `EVOSUITE_JAVA` để trỏ JDK 11.
- **Setup mỗi máy (jar bị gitignore):** tải `evosuite-1.2.0.jar` từ GitHub releases về repo root; classpath cần `data/raw/commons-cli/target/classes` — clone commons-cli ở commit pin (xem `data/raw/README.md`) rồi `mvn compile`; chạy: `set EVOSUITE_JAVA=<path>\jdk-11\bin\java.exe && python scripts/run_baselines.py`.
