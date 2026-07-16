# Kịch bản bảo vệ báo cáo — chi tiết theo TỪNG NGƯỜI, từng quy trình

**Ngày soạn:** 2026-07-17 (số liệu khớp bản paper sau audit cùng ngày — `paper/quality/audit_2026-07-17.md`)
**Cách dùng:** mỗi người đọc kỹ phần CỦA MÌNH + mục 0 + mục 6. GV hỏi phần của ai,
người đó trả lời; PL (Ân) điều phối. File này bổ sung cho `bao-ve-bao-cao-truoc-GV.md`
(file cũ tập trung "vì sao kết quả thấp"; file này tập trung "ai làm gì, làm thế nào").

---

## 0. Tóm tắt 30 giây — AI CŨNG PHẢI THUỘC

> "Nhóm đo năng lực **one-shot nguyên bản** của `gpt-4o-mini` sinh unit test cho
> **120 hàm thật** (60 Java, 60 Python, CC 5–10, mine từ 10 repo pinned commit),
> **đo ngay trong project gốc**, so với EvoSuite/Randoop/Pynguin cùng budget,
> bằng branch coverage + mutation score, thống kê phi tham số đăng ký trước.
> Kết quả: median toàn mẫu **0%/0%**; chỉ **28/120 (23.3%)** suite chạm đúng hàm;
> thua cả 2 baseline Java với **r = −1.00**. Phát hiện giá trị nhất: test LLM hỏng
> theo **2 kiểu khác nhau ở 2 ngôn ngữ** (Python chết lúc import, Java gọi nhầm hàm
> âm thầm) — điều CHỈ nhìn thấy khi đo trong project thật. Kết quả 'âm' này trả lời
> đúng câu hỏi khoa học đã đăng ký, không phải thất bại."

**5 con số phải nhớ:** 92/120 (76.7%) không chạm target · effective 8.3% Java vs
38.3% Python · median coverage effective 75.0% (<80%) · mutation 36.84%/0% (<60%) ·
r = −1.00 với cả EvoSuite lẫn Randoop.

---

## 1. NHIỆM VỤ TỪNG NGƯỜI — chi tiết việc đã làm + Q&A riêng

### 1.1 Ân — PL (Project Lead) + Abstract/Discussion

**Đã làm gì (kể được từng việc):**
1. Điều phối timeline RBL-1→5; chủ trì các buổi chốt quyết định nhóm (phương án B
   đo-trong-module-thật 05/07; one-shot 03/07; dataset 02/07).
2. Trình GV **2 amendment TRƯỚC full run**: v1.1 (đổi model `gpt-4o` →
   `gpt-4o-mini-2024-07-18`, lý do: account API không có quyền gpt-4o — ràng buộc
   khách quan; soạn 28/06, nhóm chốt 02/07) và v1.2 (đổi dataset Defects4J+CodeXGLUE
   → tự mine 120 hàm; chốt 02/07). File: `ms-analysis/proposal-amendment-v1.1.md`, `v1.2.md`.
3. Chịu trách nhiệm Abstract + đồng sở hữu Discussion.

**GV có thể hỏi Ân:**
- *"Quy trình nhóm chống HARKing thế nào?"* → RQ/ngưỡng/test đăng ký trong proposal
  trước khi có data; MỌI thay đổi đều thành amendment có ngày, ký TRƯỚC khi data
  tương ứng sinh ra; RQ4/RQ5 khai báo rõ là exploratory post-hoc, ghi file kết quả
  riêng, không đụng N=120 gốc; dừng sau đúng 2 can thiệp theo cam kết trước.
- *"Ngưỡng 80/60 ở đâu ra?"* → 80% là mốc adequacy hay được trích dẫn trong industry;
  60% đặt CỐ Ý trên dải ~34% mutation mà literature báo cáo cho test LLM
  (33.82% Konstantinou, 33.8% TestForge); cả hai chốt trong proposal trước data.
  Còn ngưỡng RQ3 đăng ký là **ρ < −0.5** — kết quả ρ = +0.13..+0.18 fail ngay từ DẤU.
- *"Nhóm dùng AI thế nào trong bài?"* → trả lời trung thực theo mục **AI Use
  Disclosure** trong chính bài báo: bản nháp kỹ thuật/tổng hợp có hỗ trợ AI, các phần
  chính do thành viên tự viết lại, mọi số liệu đối chiếu với artefact thật, quy trình
  AI-check ghi trong `paper/quality/ai_check_log.md`. KHÔNG chối, KHÔNG vòng vo.

### 1.2 Kim — DG (Data & Ground truth) + Related Work citations

**Đã làm gì:**
1. **Mine dataset:** 120 hàm (60 Java từ 8 repo trùng subject programs của Defects4J:
   commons-cli/math/csv/collections, gson, jsoup, joda-time, jfreechart; 60 Python từ
   flask/requests), CC 5–10 đo bằng **Lizard 1.23.0**, mỗi repo pin commit — provenance
   (URL, licence, commit hash, ngày tải 27/06) trong `data/raw/README.md`.
2. **Sửa data v1 → v2:** pilot lộ data v1 có file lệch metadata (JA-002 chứa hàm
   `concat` lạ thay vì `getOptionValues`), Python còn nguyên `self`/relative import →
   v2 dedent, thêm import, khớp CSV 60/60 (commit `2ccffc7`).
3. **Citations:** nâng `references.bib` 9 → 25 entry có DOI/arXiv, wire 24 citation
   vào Related Work (commit `f147db4`).

**GV có thể hỏi Kim:**
- *"Vì sao bỏ CodeXGLUE?"* → nó là benchmark code-intelligence (summarisation/
  translation), KHÔNG phải corpus hàm chạy được cho coverage/mutation tool; không
  paper nào trong review từng ghép nó với phép đo kiểu này → amendment v1.2.
- *"Vì sao flask chiếm 48/60 hàm Python?"* → hệ quả cấu trúc 2 project khi lọc theo
  band CC 5–10; KHÔNG resample sau khi đã bắt đầu đo (tránh chọn mẫu theo kết quả) —
  khai báo thành threat External Validity §VI.
- *"Band CC 5–10 ai chọn, căn cứ gì?"* → chốt từ proposal TRƯỚC khi sinh test;
  dưới 5 là code 1–2 nhánh tầm thường, trên 10 là vùng literature chưa có số liệu
  complexity-controlled nào cho GPT-4-family → 5–10 chính là vùng chưa ai đo (GAP-T).
- ⚠️ **Việc Kim cần làm TRƯỚC buổi hỏi:** xem `paper/quality/open_items.md` mục Kim —
  chuẩn bị PDF paper `kumar2025empirical` (99.05%); nắm việc 84.3/33.8 là của
  **TestForge (pipeline agentic)** chứ không phải GPT-4o thuần — bài đã ghi đúng.

### 1.3 Hải — LR (LLM Runner) + Method §3.2

**Đã làm gì:**
1. Setup API + `scripts/run_experiment.py`; **sinh toàn bộ N=120 suite**, mỗi hàm đúng
   1 call: `gpt-4o-mini-2024-07-18` (snapshot ghim — rerun trúng đúng trọng số),
   `temperature=0`, `top_p=1`, `max_tokens=2048`.
2. **One-shot prompt:** 1 exemplar mẫu (`### Example Input/Output ###`) đặt trước hàm
   mục tiêu; có retry + `time.sleep(2)` khi lỗi API.
3. Log chi phí: pilot 24 call ≈ $0.0069; toàn bộ thực chi **dưới $1 rất xa (~$0.05)**
   so với budget đăng ký ~$1 (amendment v1.1 §8.2). Log: `results/generation_log.csv`.

**GV có thể hỏi Hải:**
- *"Vì sao one-shot mà không zero-shot/few-shot?"* → proposal gốc ghi zero-shot,
  nhóm chốt one-shot 03/07 (khớp config pilot đã chạy + amendment v1.1) và nêu điểm
  lệch này với GV cùng đợt amendment — 1 exemplar cho model thấy FORMAT test mong
  muốn, vẫn giữ tính "nguyên bản" (không retrieval, không repair).
- *"Vì sao temperature 0?"* → tái lập được: cùng prompt cùng snapshot → cùng output;
  không có bước ngẫu nhiên nào trong pipeline đo.
- *"Prompt trông thế nào?"* → mở `scripts/run_experiment.py` chỉ trực tiếp; RQ4 thêm
  API skeleton (javalang/ast) — đó là arm khác, file riêng.

### 1.4 Phúc — MS (Metrics & Stats) + Method §3.3b/§3.4 + Results

**Đã làm gì:**
1. **Đo Python:** editable install flask/requests ở pinned commit; `coverage.py 7.15.1`
   branch coverage cắt theo khoảng dòng hàm; **green-check bắt buộc** (suite fail trên
   code gốc → INVALID, không đo mutation — chặn "mutation 100% giả" từng gặp ở pilot).
2. **Mutation Python — 2 instrument, phải nói rõ:** suite GPT đo bằng **mutmut 2.4.4**
   (scope bằng `# pragma: no mutate` ngoài khoảng dòng; chỉ chạy test node PASS; điểm
   = (killed+timeout)/tổng mutant) — chạy trên Kaggle (`kaggle_mutation_py.py`).
   Suite Pynguin đo bằng **AST engine tự viết** (`measure_pynguin.py`: swap +/−, ×/÷,
   >/≥, </≤, ==/≠, and/or; đảo bool; +1 hằng số; ≤20 mutant/hàm; timeout 90s/mutant;
   fail-hoặc-timeout = killed). → RQ2-B Python là so sánh **chéo instrument** — đã khai
   báo thành threat Construct §VI; hướng kết quả không đổi vì Pynguin coverage 0.0%.
3. **Thống kê** (`analyze_8lib.py` → `summary_8lib.csv`): RQ1 one-sample Wilcoxon vs 80;
   RQ2A one-sample vs 60; RQ2B paired Wilcoxon khớp `function_id`, effect size
   rank-biserial r; RQ3 Spearman ρ; α=0.05; báo 2 mức **all** (INVALID/no-touch = 0
   theo rule đăng ký) và **effective** — không bao giờ báo effective một mình.
4. Figures fig1/fig2 (300 DPI), phân tích 8-lib.

**GV có thể hỏi Phúc:**
- *"Vì sao Python dùng 2 công cụ mutation khác nhau?"* → lịch sử đo: số GPT chính thức
  chạy trên Kaggle bằng mutmut; baseline Pynguin đo bằng harness AST tự viết. Cả hai
  cùng green-gate + cùng scope theo khoảng dòng, khác operator set → nhóm KHAI BÁO
  thẳng là threat thay vì giấu; kết luận RQ2-B không đổi vì Pynguin 0.0% coverage.
- *"+36.84 pp là gì?"* → là **hiệu của hai median** (GPT 36.84 − Pynguin 0.0), không
  phải median của các hiệu từng cặp (con số đó là +25.0) — bài ghi đúng "difference
  in medians". p=0.010, r=+0.85 không đổi.
- *"3 ô mutation baseline thiếu?"* → JA-017 (jfreechart) + JA-048/JA-058 (jsoup):
  PIT **không sinh được mutant nào trong khoảng dòng** ở cả 2 tool → N/A hợp lệ, báo
  missing thay vì impute 0 (impute mới là sai). Coverage 3 hàm này vẫn có (đo trước
  PIT). KHÔNG phải "PIT Minion crash" — chuyện crash là sự cố khác đã điều tra riêng
  (commit `5b192b7` nhánh locTX-1002), không ảnh hưởng RQ.
- ⚠️ **Việc Phúc cần làm trước:** commit log chạy Pynguin gốc (chi tiết dill/_json)
  + raw per-test log RQ4/RQ5 (233/267/682) — xem `open_items.md`.

### 1.5 Lộc — RW (Report Writer) + đo Java + Pynguin baseline + RQ4/RQ5

**Đã làm gì:**
1. **Đo Java 60 hàm GPT** (`run_full_java_measurement.py`): Maven 3.9.16 build tại
   pinned commit; JaCoCo 0.8.12 (branch coverage) + PIT 1.17.2 (mutation); gán kết quả
   per-function bằng giao khoảng dòng `[start_line, end_line]`; **mỗi hàm compile/đo
   RIÊNG 1 file/lần** — tránh 1 lỗi compile làm oan hàm khác cùng module.
2. **Tự phát hiện & sửa 2 bug hạ tầng khi scale:** (a) PIT timeout không bắt exception
   → sập cả run đo; (b) `jacoco.xml`/`mutations.xml` cũ bị đọc nhầm cho hàm kế tiếp
   cùng module → suýt gán coverage hàm này cho hàm khác; fix: dọn report giữa các run.
3. **Chạy baseline Pynguin:** Python 3.14 làm instrumentation sinh suite rỗng
   (TracingAbortedException) → truy đến master–worker subprocess → tạo venv
   **Python 3.10** riêng chỉ cho Pynguin (DYNAMOSA, 90s/module); áp dụng đồng loạt
   TRƯỚC khi đo → infrastructure fix, không phải amendment.
4. **RQ4:** thêm public-API skeleton thật (javalang/ast) vào prompt — effective Java
   5/60→11/60 (8.3%→18.3%), 7 tăng/1 giảm/52 giữ, p=0.074 r=0.611; mutation đứng im
   (n=48, median 0%). Python: 7/60 vs 32/60 là artefact của rule cả-file-phải-pass;
   đếm per-test thì 267@33.3% vs 233@32.2% — gần như nhau.
5. **RQ5:** 1 vòng repair duy nhất (cam kết trước): Java 11/60→15/60 (25.0%), 4 tăng/
   0 giảm, p=0.063 r=1.00, leo đơn điệu 8.3→18.3→25.0; mutation vẫn 0% (n=45).
   Python regression thật: 106/682 = 15.5% — model phản ứng với failure bằng cách
   VIẾT THÊM test chứ không sửa assertion hỏng.
6. **Report:** soạn amendment v1.2; viết + tổng hợp 8 section; audit đối chiếu toàn bộ
   số liệu với CSV (`paper/quality/audit_2026-07-17.md`).

**GV có thể hỏi Lộc:**
- *"Sao biết pipeline đo Java đáng tin?"* → kể đúng 2 bug tự tìm ra ở trên + nguyên
  tắc rút ra: 4/6 lỗi pipeline exit code 0 — "chạy xanh" ≠ "có số liệu", mọi bước phải
  verify bằng file kết quả tồn tại thật (JaCoCo separateClassLoader 0% giả, EvoSuite
  exit-0 không sinh test... đều bắt bằng cách này).
- *"RQ4/RQ5 có phải HARKing không?"* → Không: khai báo post-hoc rõ ràng (ý tưởng nảy
  SAU khi thấy N=120), kết quả ghi thư mục/file riêng, N=120 gốc không bị đè, chạy
  đúng 1 lần theo cam kết trước, báo cả kết quả xấu (Python repair tệ đi), dừng ở 2
  can thiệp — không thử đến khi ra số đẹp.
- *"Vì sao repair không dùng compiler error làm feedback?"* → log Maven/JVM quá nhiễu
  để làm tín hiệu sạch → Java dùng kết quả 0%-coverage + skeleton; Python dùng đúng
  pytest output (sạch hơn). Ghi trong docstring `run_experiment_rq5_repair.py`.

---

## 2. QUY TRÌNH THỰC NGHIỆM ĐẦU-CUỐI (kể theo trình tự, kèm người phụ trách)

| # | Bước | Ai | Chi tiết 1 câu + bằng chứng |
|---|---|---|---|
| 1 | SLR & GAP | Cả nhóm | 3 GAP; **GAP-T primary** (chưa ai đo complexity-stratified GPT-4-family, chưa ai phủ cả Java+Python) — `sytheniss/gap-final.md` |
| 2 | Đăng ký thiết kế | Ân + nhóm | RQ1–3, ngưỡng 80/60/ρ<−0.5, Wilcoxon/Spearman, α=0.05, INVALID=0% — chốt TRƯỚC data (proposal §5.1, §6) |
| 3 | Amendments | Ân trình | v1.1 model (28/06→02/07), v1.2 dataset (02/07) — đều trước full run |
| 4 | Mine dataset | Kim | 120 hàm, 10 repo pinned, Lizard CC 5–10, provenance đầy đủ; v1 lỗi → v2 |
| 5 | Pilot 24 hàm | Cả nhóm | Nhiệm vụ pilot là LỘ LỖI: 10/12 Python INVALID (hàm xé khỏi module), data v1 lệch, budget EvoSuite 60s vs Randoop 10s, Randoop ghi đè file — TẤT CẢ sửa trước full run (`notes.md` error log) |
| 6 | Quyết định đo trong project thật | Nhóm chốt 05/07 | Hệ quả pilot: điểm số không còn bị artefact tách hàm kéo xuống — chỉ còn do chất lượng test |
| 7 | Generation N=120 | Hải | one-shot, temp 0, 1 call/hàm, <$1 |
| 8 | Baselines | Kim/Hải/Lộc | EvoSuite+Randoop 60s/class (đã cân bằng); Pynguin 90s/module venv 3.10 |
| 9 | Measurement | Lộc (Java) + Phúc (Python) | Per-function line-range; green-on-original; INVALID rule; 2 bug hạ tầng tự bắt |
| 10 | Thống kê | Phúc | `summary_8lib.csv`; 2 mức all/effective |
| 11 | RQ4→RQ5 | Lộc | Exploratory, khai báo post-hoc, run-once |
| 12 | Report + audit | Lộc + owners | 8 section; audit 62 finding, sửa 3 blocker — `audit_2026-07-17.md` |

---

## 3. VÌ SAO KẾT QUẢ NHƯ VẬY — mạch giải thích đầy đủ

**Tầng 1 — lỗi cấu trúc (sửa được một phần bằng context):** one-shot chỉ thấy 1 hàm
trích rời → Python: import symbol không tồn tại (23/28 INVALID là ImportError — nhầm
instance method thành hàm module-level); Java: gọi trúng method THẬT nhưng SAI
(46/60 compile mà không chạm target — vd JA-002 gọi `CommandLine.getOptionValues`
thay vì `CommandLine.Builder.getOptionValues`; compiler chấp nhận âm thầm).
**Bằng chứng có đối chứng:** RQ4 thêm skeleton → effective Java ×2 (8.3→18.3%), RQ5
thêm repair → 25.0%.

**Tầng 2 — lỗi suy luận hành vi (KHÔNG sửa được bằng prompt):** mutation đứng im 0%
qua cả 3 giai đoạn dù effective tăng — model gọi đúng hàm hơn nhưng vẫn không
assert đúng hành vi (vd `flask.logging.has_level_handler`: hiểu sai logger hierarchy
GIỐNG HỆT ở cả 2 arm). Đây là ranh giới API-navigation failure vs test-design failure.

**Vì sao số nhóm "tệ" hơn literature:** (1) tiêu chí strict hơn — suite chỉ được tính
effective nếu compile VÀ chạm ít nhất 1 dòng của đúng hàm target, trong project thật;
(2) model nhẹ hơn (gpt-4o-mini) — chủ đích, để có lower bound; (3) benchmark curated
mà literature dùng là bài tự chứa — 84.3% "đẹp" của TestGenEval là số của **TestForge
pipeline agentic**, không phải one-shot thuần.

**Vì sao đây là kết quả tốt:** RQ trả lời trọn vẹn ("KHÔNG đạt, và đây là cơ chế");
2 failure mode mới chỉ thấy được nhờ thiết kế đo trong project thật; GAP-T được lấp
bằng phép đo có kiểm soát đầu tiên trên band CC 5–10 cho cả 2 ngôn ngữ.

---

## 4. GV HỎI → SHOW FILE GÌ (bảng tra nhanh, đã cập nhật sau audit)

| GV hỏi | Show | Ai |
|---|---|---|
| Số liệu gốc từng hàm | `ms-analysis/results/metrics_full.csv` (240 dòng) | Phúc/Lộc |
| Thống kê cuối | `ms-analysis/results/summary_8lib.csv` + `final_metrics_export.xlsx` | Phúc |
| Ví dụ wrong-target | `data/java_functions/JA-002.java` vs `generated_tests/gpt4o/java/JA-002_Test.java` | Lộc |
| Ví dụ coverage≠quality | JA-008 (jsoup): baseline 60% coverage / 0% mutation trong `metrics_full.csv` | Phúc |
| Provenance dataset | `data/raw/README.md` + `data/full_ground_truth.csv` | Kim |
| Amendment + ngày | `ms-analysis/proposal-amendment-v1.1.md`, `v1.2.md` | Ân |
| Error log quá trình | `notes.md` (error log RBL-4, từng ngày) | Lộc |
| Versions mọi tool | `tool-versions.md` | Lộc |
| Đối chiếu số trong bài | `paper/quality/audit_2026-07-17.md` (audit 4-trục) | Lộc |
| Quy trình AI-check | `paper/quality/ai_check_log.md` + mục AI Use Disclosure trong PDF | Ân |

---

## 5. CÂU HỎI XOÁY — TRẢ LỜI MẪU (bổ sung ngoài file bao-ve cũ)

**Q: "Em nói 92/120 không chạm target — tính thế nào?"**
A: Java 9 INVALID + 46 compile-nhưng-không-chạm = 55; Python 28 INVALID + 9 không chạm
= 37; 55+37 = 92 (76.7%). Phần bù là 28 effective (23.3%). Đếm lại được từ
`metrics_full.csv` + `metrics_project.csv`.

**Q: "EvoSuite/Randoop cũng không đạt 80% — vậy ngưỡng có vô lý không?"**
A: Đúng, EvoSuite median 55.0%, Randoop 21.1% trên cùng 60 hàm — bài GHI RÕ điều này
trong Conclusion: mốc 80% khó với MỌI tool trên mẫu CC 5–10 này. Ngưỡng vẫn có giá
trị vì nó được đăng ký trước làm mốc adequacy; kết luận chính nằm ở SO SÁNH CẶP
(r = −1.00) chứ không chỉ ở ngưỡng tuyệt đối.

**Q: "Randoop là search-based à?"**
A: KHÔNG — Randoop là **feedback-directed random testing**; EvoSuite mới là
search-based (genetic). Bài dùng "automated baselines" khi gộp cả hai.

**Q: "JDK nào chạy EvoSuite?"**
A: Hỗn hợp có ghi rõ trong bài: JDK 11 cho 39 hàm, JDK 8 cho 21 hàm (csv/gson/joda —
JDK 11 chết runtime với các class đó); JDK 17 fail hoàn toàn. Compile đo bằng
release 11 nuốt cả hai.

**Q: "Kết quả Python RQ4 tệ đi (7/60 vs 32/60) — sao nói context vô hại?"**
A: Đó là artefact của rule cả-file-phải-pass: context làm model viết NHIỀU test hơn
mỗi file → chỉ cần 1 test hỏng là cả file bị loại. Đếm per-test-case: 267@33.3% vs
233@32.2% — gần như nhau. Bài khai báo luôn threat second-order này.

**Q: "Nếu chạy lại có ra đúng số này không?"**
A: Pipeline đo không có bước ngẫu nhiên (pinned commit + snapshot model + temp 0);
riêng generation của EvoSuite/Randoop/Pynguin là stochastic theo bản chất search —
nhưng suite ĐÃ SINH được lưu trong repo, đo lại từ suite là tái lập được.

---

## 6. BẪY — NHỮNG ĐIỀU **KHÔNG NÓI** (số cũ đã bị sửa, nói ra là tự mâu thuẫn)

1. ❌ "PIT Minion crash làm mất 3 ô mutation" → ✅ đúng: PIT **không sinh mutant trong
   khoảng dòng** của JA-017/JA-048/JA-058 (jfreechart + 2 jsoup) — N/A hợp lệ.
2. ❌ "median difference +36.84 pp" → ✅ "**difference in medians** +36.84" (median các
   hiệu từng cặp là +25.0).
3. ❌ "GPT-4o đạt 84.3% pass@1 trên TestGenEval" → ✅ đó là **TestForge (agentic)** của
   Jain & Le Goues; one-shot thuần thấp hơn nhiều.
4. ❌ "Randoop search-based" → ✅ random, feedback-directed.
5. ❌ "chi phí ~$1" như con số thực → ✅ "$1 là budget đăng ký; thực chi dưới $1 rất xa".
6. ❌ "33–40% literature" → ✅ "khoảng 34%" (mốc 40% không có nguồn được cite trong bài).
7. ❌ "EvoSuite bắt buộc JDK 8" hoặc "bắt buộc JDK 11" → ✅ hỗn hợp 39/21 như mục 5.
8. ❌ Nhận các đoạn kể trải nghiệm ("lần đầu gặp...", "bọn em kiểm tra pipeline...")
   nếu bản thân không trực tiếp làm → người LÀM THẬT việc đó trả lời (danh sách 21
   đoạn attest + ai đứng sau: `paper/quality/audit_2026-07-17.md`).

**Nếu GV hỏi đúng chỗ chưa chốt** (kumar PDF, log Pynguin, per-test log): trả lời
thẳng "artefact đó nhóm đang bổ sung vào repo, có trong danh sách open items" —
`paper/quality/open_items.md` là bằng chứng nhóm TỰ tìm ra trước khi bị hỏi.
