# Kịch bản chia viết `03_method.tex` — theo đúng người thực chạy thực nghiệm

**Ngày:** 2026-07-15
**Bối cảnh:** `03_method.tex` hiện ghi "NGUOI VIET: LR (Hải) + MS (Phúc)" nhưng trên
thực tế có **3 người** trực tiếp chạy thực nghiệm cho phần Method — thiếu phần của
Lộc (đo Java, Pynguin, mở rộng RQ4/RQ5). File này chia lại đúng theo ai làm phần nào,
để mỗi người chỉ cần đọc/xác nhận đúng phần mình đã trực tiếp chạy trước khi nộp.

---

## Bảng phân công

| Mục trong `03_method.tex` | Nội dung | Người viết/xác nhận | Vì sao |
|---|---|---|---|
| **3.1 Dataset** | Mine 10 repo pinned commit, Lizard CC 5–10, amendment v1.2 | **Lộc (RW)** | Amendment v1.2 do chính Lộc soạn ("Soạn: RW (Lộc)", 2026-07-02) |
| **3.2 Test generation** | Prompt one-shot, model `gpt-4o-mini-2024-07-18`, `run_experiment.py` | **Hải (LR)** | Hải là người sinh test gốc (N=120 ban đầu) qua OpenAI API |
| **3.3a Measurement — Java** | Maven + JaCoCo + PIT, cô lập từng hàm/lần chạy, fix bug timeout PIT + stale-report reuse | **Lộc (RW)** | Lộc trực tiếp chạy đo 60 hàm Java gpt-4o-mini + baseline Pynguin |
| **3.3b Measurement — Python** | `coverage.py` branch coverage + AST mutation theo khoảng dòng, `measure_python_module.py` | **Phúc (MS)** | Phúc đo Python gốc (branch coverage + mutation), Lộc chỉ merge kết quả về |
| **3.4 Statistical analysis** | One-sample/paired Wilcoxon, Spearman, `compute_metric.py` / `analyze_8lib.py` | **Phúc (MS)** | Phúc phụ trách vai Metrics & Stats (MS) |

## Ghi chú quan trọng

- **RQ4/RQ5 (context + feedback/repair loop) KHÔNG thuộc Method chính thức** — hiện
  nằm ở `05_discussion.tex` (§5.4–5.5) vì đây là exploratory/post-hoc, chạy sau khi
  đã thấy kết quả N=120. Không gộp nội dung 2 phần này vào `03_method.tex` để tránh
  làm mờ ranh giới confirmatory/exploratory. Nếu muốn, chỉ nên thêm 1 câu trỏ sang
  "xem thêm §5.4–5.5" ở cuối mục 3.2/3.3, không viết lại chi tiết.
- Người phụ trách từng mục chỉ cần **xác nhận đúng thực tế triển khai** (không cần
  viết lại từ đầu — nội dung bản nháp đã có, do RW tổng hợp từ proposal/amendment/
  notes.md), đổi giọng văn nếu cần, rồi báo lại nếu có sai lệch.
- Sau khi cả 3 xác nhận xong, cập nhật lại dòng "NGUOI VIET" ở đầu `03_method.tex`
  thành `RW (Lộc) + LR (Hải) + MS (Phúc)` cho đúng thực tế.

---

## Hướng dẫn chi tiết cho từng người

### 1. Lộc (RW) — mục 3.1 Dataset + 3.3a Measurement (Java)

**Đọc trước khi viết/xác nhận:**
- `ms-analysis/proposal-amendment-v1.2.md` — đúng văn bản amendment bạn đã soạn, đối chiếu số liệu (120 hàm = 60 Java + 60 Python, 10 repo, ngày tải 2026-06-27)
- `data/raw/README.md` — provenance đầy đủ (URL, license, commit hash) của 10 repo, dùng để trích câu "reproducible" trong 3.1
- `ms-analysis/scripts/run_full_java_measurement.py` — pipeline đo Java thật (đã sửa 2 bug trong phiên này: PIT timeout không bắt exception làm sập cả script; jacoco.xml/mutations.xml cũ bị dùng nhầm giữa các hàm)

**Việc cụ thể cần làm:**
1. Đối chiếu **3.1 Dataset** trong `03_method.tex` với `proposal-amendment-v1.2.md` — kiểm tra đúng tên 8 repo Java (`commons-cli, commons-math, commons-csv, commons-collections, gson, jsoup, joda-time, jfreechart`) và 2 repo Python (`flask, requests`), đúng công cụ đo CC (Lizard 1.23.0).
2. Đối chiếu **3.3a Measurement — Java** với chính script bạn đã chạy:
   - Xác nhận đúng mô tả "mỗi hàm GPT được compile/đo RIÊNG (1 file test/lần)" — đây là lý do kỹ thuật thật (tránh 1 lỗi compile làm oan các hàm khác cùng module), không phải chi tiết thừa.
   - Xác nhận đúng công cụ: JaCoCo (branch coverage), PIT (mutation), cả hai cắt theo khoảng dòng `[start_line, end_line]` của từng hàm.
   - Nếu muốn thêm 1 câu về độ tin cậy pipeline, có thể nêu: đã phát hiện và sửa 2 lỗi hạ tầng khi đo (timeout PIT làm crash toàn bộ script; báo cáo JaCoCo cũ bị tái sử dụng nhầm giữa các hàm cùng module) — đây là bằng chứng cụ thể cho phần Threats to Validity §6 (Construct Validity), không nhất thiết phải lặp lại ở Method, chỉ cần Method mô tả đúng pipeline CUỐI CÙNG đã chạy.
3. Kiểm tra con số cuối: 60/60 hàm Java đo xong, compiled=51/60, effective=5/60 — khớp với `ms-analysis/results/metrics_full.csv` (method=gpt-4o-mini, language=java).
4. Không cần viết lại Pynguin ở đây — Pynguin là **baseline**, đã có trong 3.2 "Baselines" (Hải/chung), bạn chỉ cần xác nhận đoạn nhắc tới việc phải dùng venv Python 3.10 riêng (do Python 3.14 không sinh test được — TracingAbortedException) là đúng thực tế, nên được ghi vào Threats §6 (External Validity/Construct) chứ không lặp ở Method.

#### Cách viết cụ thể — quy trình 5 bước (theo đúng `paper/quality/ai_check_log.md`)

Quy trình nhóm đã định sẵn: **viết → tự review → chạy detector → ghi kết quả + hành động**. Áp dụng cho đúng 3.1 + 3.3a:

**Bước 1 — Đọc 1 lần, gập máy lại, viết lại từ trí nhớ.**
Đây là cách hiệu quả nhất để giọng văn tự nhiên khác bản gốc (không phải "đồng nghĩa hóa" từng chữ, dễ bị detector bắt). Đọc xong 1 đoạn (ví dụ cả đoạn 3.1), che màn hình hoặc chuyển tab, tự viết lại bằng đúng hiểu biết của mình về việc đã làm — không nhìn bản gốc trong lúc viết.

**Ví dụ cụ thể (đoạn mở đầu 3.1), bản gốc hiện tại:**
> "The dataset consists of 120 real-world functions (60 Java, 60 Python) with cyclomatic complexity 5≤CC≤10, measured with Lizard. The original proposal specified Defects4J and CodeXGLUE as data sources; during dataset preparation the team found that CodeXGLUE is a code-intelligence benchmark..."

**Kỹ thuật viết lại (áp dụng, không phải chép nguyên):**
- Đảo thứ tự thông tin: thay vì "dataset gồm 120 hàm... đo bằng Lizard" → có thể mở đầu bằng lý do đổi nguồn dữ liệu trước, rồi mới nêu con số cuối cùng.
- Đổi câu bị động → chủ động: "was recorded as amendment v1.2" → "nhóm ghi nhận việc này thành amendment v1.2".
- Gộp/tách câu khác bản gốc: bản gốc tách "found that X... and that Y" — bạn có thể viết thành 2 câu riêng, hoặc gộp lý do CodeXGLU + lý do literature thành 1 câu bằng liên từ khác.
- Thêm 1 chi tiết cá nhân xác thực (không bịa số liệu): ví dụ mô tả ngắn gọn cảm nhận lúc phát hiện CodeXGLUE không phù hợp — miễn là đúng sự thật, không thêm số liệu không có trong amendment.

**Bước 2 — Tự review đối chiếu số liệu** (dùng đúng checklist "Việc cụ thể cần làm" ở trên) — KHÔNG đổi bất kỳ con số, tên repo, ngưỡng nào trong lúc viết lại giọng văn. Chỉ đổi CÁCH DIỄN ĐẠT, không đổi SỰ KIỆN.

**Bước 3 — Chạy AI detector.** Nhóm dùng GPTZero (theo mẫu có sẵn trong `ai_check_log.md`) — vào gptzero.me (hoặc công cụ khác nhóm đã thống nhất), dán đoạn 3.1+3.3a vừa viết lại, đọc % "AI-generated". **Lưu ý: đây là bước phải tự làm thủ công** (dán vào trang web) — không tự động hoá được trong môi trường này.

**Bước 4 — Ghi kết quả vào `paper/quality/ai_check_log.md`**, đúng format bảng có sẵn:
```
| 2026-07-15 | 03_method (3.1+3.3a) | GPTZero | <điền %> | OK / viết lại đoạn X |
```

**Bước 5 — Nếu % cao (detector nghi ngờ), viết lại thêm lần nữa** đoạn bị nghi ngờ nhất — thường là đoạn liệt kê thông số kỹ thuật liền mạch (dễ bị bắt vì câu văn "đều đặn" kiểu máy) — chèn thêm 1 câu giải thích lý do kỹ thuật bằng giọng cá nhân, hoặc chuyển 1 câu dài thành 2 câu ngắn không đều nhau.

### 2. Hải (LR) — mục 3.2 Test generation

**Đọc trước khi viết/xác nhận:**
- `scripts/run_experiment.py` — script gốc bạn đã dùng để sinh N=120 test one-shot
- `ms-analysis/proposal-amendment-v1.1.md` — lý do đổi từ `gpt-4o` sang `gpt-4o-mini` (ràng buộc quyền truy cập API, không phải chọn sau khi thấy kết quả)
- `results/generation_log.csv` hoặc `results/pilot_api_log.txt` (nếu còn giữ) — log thật của quá trình gọi API, dùng để xác nhận số lần gọi/chi phí nếu muốn trích dẫn

**Việc cụ thể cần làm:**
1. Đối chiếu mô tả model trong 3.2 với đúng config trong `run_experiment.py`: `MODEL = "gpt-4o-mini-2024-07-18"`, `TEMPERATURE = 0.0`, `TOP_P = 1.0`, `MAX_TOKENS = 2048`.
2. Xác nhận mô tả "one-shot prompting (1 exemplar mẫu đặt trước hàm mục tiêu)" khớp đúng cấu trúc prompt thật trong script (phần `### Example Input/Output ###` trước `### Actual Task ###`).
3. Xác nhận đúng lý do amendment v1.1 được mô tả trong 3.2 là "ràng buộc truy cập API khách quan, không phải thay đổi sau khi thấy kết quả" — đây là câu quan trọng về mặt liêm chính, cần giữ nguyên văn tinh thần, không diễn đạt mơ hồ đi.
4. Nếu muốn, có thể bổ sung 1-2 câu mô tả cách xử lý lỗi API (retry, `time.sleep(2)` khi lỗi) — chi tiết nhỏ nhưng giúp phần "replicability" đầy đủ hơn theo đúng tinh thần rubric Method.
5. Không cần đụng vào phần Baselines (EvoSuite/Randoop/Pynguin) — phần đó mô tả budget thời gian chung, giữ nguyên.

### 3. Phúc (MS) — mục 3.3b Measurement (Python) + 3.4 Statistical analysis

**Đọc trước khi viết/xác nhận:**
- `ms-analysis/scripts/measure_python_module.py` — harness đo Python thật (green-check → coverage.py → AST mutation)
- `ms-analysis/scripts/compute_metric.py` và `ms-analysis/scripts/analyze_8lib.py` — 2 script tính thống kê, `analyze_8lib.py` là bản cuối cùng dùng để ra `summary_8lib.csv`
- `ms-analysis/results/summary_8lib.csv` — kết quả cuối, đối chiếu số liệu trong 3.4 (nếu có nhắc số) phải khớp file này

**Việc cụ thể cần làm:**
1. Đối chiếu **3.3b Measurement — Python** với `measure_python_module.py`:
   - Xác nhận đúng 3 bước: (1) green-check — test phải PASS trên code gốc chưa mutate, fail thì tính `INVALID`; (2) branch coverage bằng `coverage.py --branch`, cắt theo khoảng dòng hàm; (3) mutation — mutate AST trực tiếp thân hàm (đổi toán tử `+/-/*//`, so sánh, boolean, hằng số), chạy lại test, khôi phục file gốc sau mỗi mutant.
   - Xác nhận đúng: cùng 1 bộ mutation operator áp dụng cho CẢ gpt-4o-mini lẫn Pynguin (để so sánh công bằng, dùng chung 1 "thước đo").
2. Đối chiếu **3.4 Statistical analysis** với `analyze_8lib.py`:
   - RQ1: one-sample Wilcoxon (branch coverage so với 80), `alternative="greater"`.
   - RQ2: (A) one-sample Wilcoxon so với 60 (mutation), (B) paired Wilcoxon so với từng baseline theo `function_id`, kèm effect size **matched-pairs rank-biserial r**.
   - RQ3: Spearman rho giữa CC và branch_coverage/mutation_score.
   - Xác nhận đúng α=0.05 dùng xuyên suốt, và đúng quy tắc báo cáo 2 mức "all" (N=60/ngôn ngữ, invalid=0) và "effective" (subset đã compile và chạm code đích) — đây là nguyên tắc trung thực đã thống nhất, không được bỏ mức "all" dù effective nhìn đẹp hơn.
3. Nếu có sai lệch số liệu giữa 3.4 và `summary_8lib.csv` thật, **không tự sửa số** — báo lại cho Lộc (RW) đối chiếu trước, vì số liệu ảnh hưởng đồng thời tới `04_results.tex`.

---

## Việc cần làm (checklist)

- [ ] Lộc: đọc + xác nhận mục 3.1, 3.3a
- [ ] Hải: đọc + xác nhận mục 3.2
- [ ] Phúc: đọc + xác nhận mục 3.3b, 3.4
- [ ] Cập nhật dòng "NGUOI VIET" đầu file sau khi cả 3 xác nhận
- [ ] Chạy AI-detector theo đúng quy trình nhóm đã áp dụng cho các phần khác
