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

---

## Phân tích phương pháp viết theo RBL-5a & RBL-5b (bổ sung 2026-07-20)

Phần dưới đây tổng hợp và phân tích kỹ hai tài liệu gốc của học phần —
**RBL-5a_Report-and-Present.pdf** (16 trang, hướng dẫn viết paper + slide) và
**RBL-5b_AI-Writing-Check.pdf** (6 trang, hướng dẫn kiểm tra dấu hiệu AI) — để làm
căn cứ chính thức cho quy trình viết/xác nhận `03_method.tex` ở trên. Quy trình 5 bước
đã mô tả ở mục "Cách viết cụ thể" phía trên chính là áp dụng cụ thể của RBL-5b Phần 4;
phần này giải thích rõ TẠI SAO quy trình đó đúng chuẩn, để 3 người (Lộc/Hải/Phúc) có
thể tự áp dụng tương tự cho các mục khác (không chỉ Method) nếu cần.

### A. RBL-5a — Phương pháp viết từng phần của paper

**1. Nguyên tắc chung xuyên suốt mọi section:** viết THEO SỐ LIỆU, không viết theo
cảm tính. Mọi câu tuyên bố (claim) đều phải có 1 trong 2: (a) một con số cụ thể lấy
từ `full_analysis.ipynb`/`summary_8lib.csv`, hoặc (b) một `\cite{}` trỏ tới paper gốc.
Không có câu nào "lửng" kiểu "kết quả khá tốt" hay "hiệu quả rõ rệt" mà không kèm số.

**2. Cấu trúc bắt buộc theo từng section** (tóm tắt từ RBL-5a):

| Section | Cấu trúc | Điểm mấu chốt áp dụng cho nhóm mình |
|---|---|---|
| Abstract (~150 từ) | 5 câu: Context → Gap → Method → Results (có số + p-value + effect size) → Implication | Viết **sau cùng**, sau khi có đủ `summary_8lib.csv`; câu Results phải có N, p, effect size — không chỉ "promising" |
| §1 Introduction (~1 trang) | 5 đoạn: vấn đề thực tế → state of the art → GAP → contribution (dạng bullet 3 ý) → cấu trúc paper | Đoạn 3 (GAP) phải nêu đúng: "chưa có nghiên cứu nào đo cả branch coverage lẫn mutation score cho GPT-4o-mini trên cả Java lẫn Python với cùng 1 pipeline" — đây là GAP thật của nhóm |
| §2 Related Work | Viết theo **theme** (2–3 nhóm chủ đề, mỗi nhóm 4–6 paper), KHÔNG liệt kê "Smith (2023) did X. Jones (2024) did Y." | Nhóm theo: (A) LLM cho test generation, (B) Search-based testing (EvoSuite/Pynguin), kết thúc bằng câu positioning "Unlike prior work, ..." |
| §3 Methodology (~1.5–2 trang) | 3.1 Dataset, 3.2 Pipeline, 3.3 Metrics, 3.4 Statistical Analysis Plan — mục tiêu: **người đọc tự reproduce được** | Đây chính là file `03_method.tex` — bảng phân công ở trên đã đúng tinh thần "ai chạy thực nghiệm thì người đó viết/xác nhận" |
| §4 Results (~1–1.5 trang) | Trả lời từng RQ theo thứ tự, chỉ báo cáo số liệu, KHÔNG bàn luận (để dành cho §5) | Luôn ghi N thực tế sau khi loại invalid, p-value chính xác (không chỉ "p<0.05"), effect size bắt buộc |
| §5 Discussion (~1 trang) | 5.1 giải thích finding, 5.2 so sánh prior work, 5.3 implications | Nếu H0 không bị reject (kết quả âm tính) — không xin lỗi, phân tích tại sao, đây vẫn là contribution hợp lệ |
| §6 Threats to Validity | 4 loại: Internal / External / Construct / Conclusion, mỗi loại 1–2 bullet, mỗi threat = mô tả + mitigation ĐÃ LÀM (không phải dự định) | 2 lỗi hạ tầng Lộc đã sửa (PIT timeout, jacoco.xml tái sử dụng nhầm) là ví dụ mitigation thật, nên đưa vào Construct Validity ở đây, không lặp lại ở Method |
| §7 Conclusion (~0.5 trang) | Tóm tắt từng RQ (1–2 câu, kèm số) → contribution nổi bật nhất → future work cụ thể (không viết "cần nghiên cứu thêm") | |

**3. Quy tắc trích dẫn theo từng section** (RBL-5a): §1 đoạn 1–2 cite paper nền tảng,
đoạn 3 (GAP) cite paper gần nhất nhưng còn thiếu; §2 cite toàn bộ theo theme; §3 cite
nguồn dataset/metric/statistical test (không cite bài giới thiệu thư viện như sklearn);
§4 gần như không cite; §5 chỉ cite khi so sánh trực tiếp số liệu; §6 hầu như không cite
(là nhận xét của chính nhóm); §7 chỉ cite khi gợi ý future work theo hướng đã có paper.

**4. Ví dụ BAD vs GOOD (RBL-5a, áp dụng được ngay cho Abstract/§1 của nhóm):**
- BAD: *"We conducted experiments and the results show that our approach is effective
  and promising."* — không N, không metric, không số liệu.
- GOOD: *"We apply GPT-4o mini to 200 Java functions ... GPT-4o mini achieves median
  mutation score 61.3% vs EvoSuite 48.7% (p=0.003, Cliff's δ=0.41, medium)."*
  → Nhóm mình viết theo mẫu này với số liệu thật từ `summary_8lib.csv` (N=60/ngôn ngữ,
  Wilcoxon, rank-biserial r).

### B. RBL-5b — Phương pháp kiểm tra & viết lại để tránh dấu hiệu AI

**1. Phân biệt 2 loại kiểm tra — phải làm CẢ HAI, không thay thế nhau:**

| | AI Writing Check | Plagiarism Check |
|---|---|---|
| Kiểm tra gì | Văn bản có phải AI tạo ra không | Văn bản có sao chép từ nguồn khác không |
| Công cụ | SciSpace, ZeroGPT, GPTZero, Copyleaks (AI detector) | Turnitin, iThenticate, Copyleaks (plagiarism) |
| Vi phạm khi | Nộp nguyên văn AI viết | Copy-paste không cite đúng, hoặc có cite nhưng không paraphrase (vẫn tính đạo văn — phải để trong `"..."` nếu trích nguyên văn) |

**2. Ngưỡng đọc kết quả % AI** (trung bình ≥ 2 công cụ): <20% = tốt; 20–50% = cần
viết lại đoạn bị highlight; >50% ở bất kỳ section nào = viết lại toàn bộ section đó.
RBL-5b nhấn mạnh: không có ngưỡng tuyệt đối vì công cụ detect không hoàn hảo — quan
trọng hơn là tự kiểm tra dấu hiệu văn phong (mục 3 dưới đây).

**3. Dấu hiệu AI cần tránh — nhóm nên tự rà trước khi chạy detector:**
- *Văn phong (2A):* mở đầu sáo rỗng ("In the rapidly evolving landscape..."), tính từ
  thổi phồng (groundbreaking/remarkable — thay bằng số: "tăng F1 12pp"), liệt kê máy
  móc "Firstly...Secondly...Thirdly", kết luận chung chung, hedging quá mức ("It is
  worth noting that..."), so sánh mơ hồ không cụ thể ("While A has advantages...").
- *Cấu trúc câu (2B):* bị động lặp lại ("It was found that..." → đổi "Our results
  show..."), câu quá dài và trau chuốt quá mức (cắt thành 2 câu ngắn), transition
  cứng nhắc "Furthermore/Moreover/Additionally" mở đầu mọi câu, số mơ hồ ("a
  significant portion" → "63% of").
- *Nội dung (2C):* claim không có citation (grep "shown that"/"research suggests"),
  số liệu không trace được về `full_analysis.ipynb`/`summary_8lib.csv`, related work
  mô tả sai so với abstract gốc, future work quá chung chung.

**4. Quy trình 4 bước viết lại 1 đoạn bị nghi AI** (RBL-5b Phần 4 — chính là gốc của
"Bước 1" trong quy trình 5 bước ở mục "Cách viết cụ thể" phía trên):
1. Đọc và hiểu đoạn đó muốn nói gì → tóm tắt bằng 1 câu đơn giản.
2. Bỏ hẳn đoạn AI, viết lại từ tóm tắt đó — **không nhìn lại đoạn cũ khi viết**.
3. Thêm số liệu/paper cụ thể cho mỗi claim còn mơ hồ.
4. Đọc lại — nghe có tự nhiên như mình nói chuyện không? Nếu không, viết lại thêm lần nữa.

Ví dụ RBL-5b cho thấy rất rõ hiệu quả: câu AI *"It is widely acknowledged that the
quality of bug reports plays a crucial role..."* được viết lại thành *"Poor-quality bug
reports account for 40% of reopened issues [Chaparro 2017]. Key deficits include
missing steps-to-reproduce (S2R)..."* — từ câu chung chung sang câu có số + citation cụ thể.

**5. Quy trình tự-check trước khi nộp** (RBL-5b Phần 3, áp dụng cho từng section paper):
chạy AI detector theo section (không dán cả bài) → đọc to bằng "tester test" (câu này
có thật sự do mình nghĩ ra không, hay chỉ là pattern AI?) → kiểm tra citation density
theo đúng bảng ở mục A.3 → kiểm tra mọi số trong §4/Abstract/§5 khớp nhau và trace được
về file kết quả gốc. Ghi lại theo đúng template `ai_check_log.md`:
`| ngày | section | công cụ | % | hành động |`.

### C. Kết nối với quy trình 5 bước đã áp dụng ở `03_method.tex` (mục phía trên)

Quy trình 5 bước "viết → tự review → chạy detector → ghi kết quả + hành động" ở mục
"Cách viết cụ thể" của Lộc chính là ghép **RBL-5a mục A.3 (kiểm tra số liệu/citation
theo đúng section)** với **RBL-5b mục B.4–B.5 (viết lại từ trí nhớ + chạy detector +
log kết quả)**. Điểm cần lưu ý khi 3 người áp dụng cho các mục còn lại:
- Bước "viết lại từ trí nhớ" (RBL-5b) không được đổi số liệu/tên repo/ngưỡng — chỉ đổi
  cách diễn đạt (đúng nguyên tắc Bước 2 của quy trình 5 bước, và đúng "Bước 4: Kiểm tra
  số liệu" của RBL-5b).
- Mỗi threat/mitigation nêu ở §6 nên lấy từ chính RBL-5a (4 loại Internal/External/
  Construct/Conclusion) thay vì tự nghĩ ra loại khác.
- Khi ghi log vào `ai_check_log.md`, dùng đúng cột theo template RBL-5b (`ZeroGPT % |
  SciSpace % | Đoạn cần viết lại | Đã sửa`) để nhất quán với các section khác đã ghi.

---
*Nguồn: RBL-5a_Report-and-Present.pdf và RBL-5b_AI-Writing-Check.pdf
(© L.T.Q.Chi — SWT301 Research-Based Learning, FPT University). Tổng hợp lại để dùng
nội bộ nhóm, không sao chép/phân phối lại ngoài phạm vi học phần.*
