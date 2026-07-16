# Open items — việc cần chốt trước khi nộp (cập nhật 2026-07-17, sau audit toàn bài)

## ⚠️ MỚI từ audit 17/07 (chi tiết đầy đủ: `audit_2026-07-17.md` cùng thư mục)

### Kim (DG) — citation
- [ ] **kumar2025empirical**: metadata bib đáng ngờ ("Kumar, A. and others", DOI không
      tra được trên web); claim 99.05% khớp bảng evidence merged #14 của team nhưng cần
      **xuất trình PDF gốc** — 3 section đang tựa vào cite này (intro/related/discussion).
- [ ] **jain2025testgeneval = TestForge**: audit xác minh (arXiv 2503.14713) đây là paper
      TestForge — pipeline AGENTIC của Jain & Le Goues; 84.3%/33.8% là số của TestForge,
      KHÔNG phải GPT-4o thuần trên TestGenEval. Bài + bib đã sửa theo (title bib đã đổi);
      Kim đọc lại xác nhận. GPT-4o thuần trên benchmark gốc ≈ 35.2% cov / 18.8% mut
      (arXiv 2410.00752) — nếu muốn dùng số thuần thì thêm entry bib mới cho benchmark.
- [ ] **silva2025comparative** và **wang2026testdecision** hiện KHÔNG còn được cite
      (best-of-N và Pynguin-pairing không truy được về 2 paper này theo evidence table).
      Tìm chỗ cite đúng (CODAMOSA #15? so sánh model panel ở §2.1/2.2?) hoặc bỏ khỏi bib.
- [ ] Commit **team-synthesis/** (gap-final.md + evidence-table-merged.md N=40, hiện nằm
      ngoài repo ở `F:\Ky_5\SWT301_Materials\sytheniss\`) vào repo — SLR/ trong repo là bản
      RBL-2 cá nhân có taxonomy GAP KHÁC bản team (grader đọc chéo sẽ thấy lệch; bài đang
      theo đúng bản team: GAP-T = primary, complexity-stratified).

### Phúc (MS) — artefact còn thiếu
- [ ] Commit **log chạy Pynguin gốc** — chi tiết "dill pickling error / _json / tracer
      abort" trong §4/§5 hiện không có artefact nào chống lưng (pynguin-report/ chỉ có
      config + statistics).
- [ ] Commit **raw per-test log RQ4/RQ5** (233/267/682 test) — hiện chỉ truy được từ
      final_metrics_export.xlsx.

### Cả nhóm — danh sách "đứng sau lời kể" (attest)
- [ ] 21 đoạn kể trải nghiệm cá nhân trong các section viết tay (audit liệt kê đủ file+dòng
      trong `audit_2026-07-17.md`) — sự kiện nền đều có data chống lưng, nhưng phần "trải
      nghiệm" (lần đầu gặp, đã kiểm tra pipeline, bất ngờ về margin...) thì người viết
      phải xác nhận là chuyện thật và sẵn sàng trả lời khi GV hỏi.

### Đã sửa ngay trong đợt audit (17/07)
- TestForge reframe (§2.2+§2.5) + title bib; "+36.84 pp" → "difference in medians" (median
  của các hiệu từng cặp thật ra là +25.0); AccurateMath/Gson trả về đúng cụm non-compile
  (§5.4); "effective subset" → "measurable subset" cho mutation (abstract/kết luận/§5.1);
  EvoSuite JDK 11+8 hỗn hợp (§6 + tool-versions.md); ρ<−0.5 pre-registered đã được báo cáo
  (§4 RQ3); p=0.074/0.063 tách bạch trong kết luận; per class/per module thống nhất;
  Konstantinou 33.82% ghi rõ là số gộp 3 model; range ngưỡng "33–40%" → "roughly 34%";
  \textsc{invalid} + British spelling đồng bộ.

Ghi chú nội bộ được chuyển từ comment trong `.tex` ra đây (theo feedback review:
không để ghi chú nội bộ trong source nộp/chia sẻ).

## Cần người phụ trách xác nhận

### 1. Kim (DG) — Related Work
- [ ] **Citation YATE/HITS:** bản nháp cũ ghi *"Konstantinou et al.
      [konstantinou2025yate]'s HITS incorporates generation history atop the call
      graph"* — nhưng title của `konstantinou2025yate` là *"YATE: The role of test
      repair in LLM-based unit test generation"* (họ **repair**, không phải
      retrieval/call-graph). RW đã chuyển cite này sang câu repair-loop trong
      §2.4. Nếu ý ban đầu là hệ thống **HITS** (paper khác, không có trong bib)
      thì cần thêm entry BibTeX riêng và trả cite về chỗ cũ.
- [ ] **Con số "GAP-T/M/D được 34, 13, 4 paper ủng hộ"** đã bị BỎ khỏi §2.6
      (Positioning): không có artefact nào trong repo chống lưng — `SLR/` chỉ có
      evidence table N=9 paper. Nếu bảng evidence merged của team (RBL-3) có con
      số đúng, thêm lại **kèm nguồn**; nếu không, giữ như hiện tại (mô tả định
      tính).
- [ ] Đọc lại toàn bộ §2 sau lượt sửa theo feedback 17/07 (phân tích riêng, phê
      bình literature, định nghĩa 3 GAP đầu section).

### 2. Phúc (MS) — Method §3.3 + Threats
- [ ] **Mô tả mutation Python đã viết lại theo artefact thật** (17/07): GPT arm =
      `mutmut` 2.4.4 (`kaggle_mutation_py.py`, pragma no-mutate ngoài khoảng dòng,
      chỉ chạy test node PASS, điểm = (killed+timeout)/tổng mutant); Pynguin arm =
      AST engine tự viết (`measure_pynguin.py`: swap +/−, ×/÷, >/≥, </≤, ==/≠,
      and/or, đảo bool const, +1 numeric const; ≤20 mutant/hàm; timeout 90s;
      fail/timeout = killed; không mutant trong range = missing). Câu cũ "applied
      identically to both" đã bỏ vì sai. **Xác nhận đúng thực tế chạy** — đặc biệt:
      có harness nào khác từng sinh số chính thức không?
- [ ] Threat mới trong §6 (Construct): RQ2-B Python so sánh **chéo instrument**
      (mutmut vs AST engine) — đọc lại câu diễn giải "direction does not hinge on
      instrument choice" xem có đồng ý không.

### 3. Hải (LR) / Phúc — tool-versions
- [ ] Version **Randoop** chưa xác nhận (tool-versions.md) — kiểm tra file .jar đã
      dùng khi chạy baseline.

## Quyết định nhỏ còn treo

- [x] ~~**"~\$1" chi phí** trong §5.3~~ — CHỐT 17/07: đổi thành "cost well under a
      dollar in API charges (the pre-registered budget estimated \$1; amendment
      v1.1, §8.2)" — trung thực với log API (~\$0.05 thực chi), giữ pointer
      amendment.
- [ ] **RQ4/RQ5 per-test counts** (233 / 267 / 682 test): chỉ truy được từ
      `final_metrics_export.xlsx`, chưa có raw per-test log trong repo — cân nhắc
      commit log gốc để tái lập được.

## Trước khi nộp / chia sẻ source

- [ ] **Xoá toàn bộ comment `%` nội bộ** (NGUOI VIET, ghi chú RW...) khỏi các file
      `.tex` — feedback review đã chỉ ra người đọc source vẫn thấy ghi chú nội bộ.
      Lệnh gợi ý (chạy trong `paper/`, sau khi backup):
      `python -c "import re,glob;[open(f,'w',encoding='utf-8').write(re.sub(r'(?m)^%.*\n','',open(f,encoding='utf-8').read())) for f in glob.glob('sections/*.tex')]"`
      (chỉ xoá dòng bắt đầu bằng `%`; giữ `\%` trong văn bản.)
- [ ] Scan AI-check trên **văn thuần** trong `paper/quality/detector_input/`
      (không dán file `.tex`), ghi kết quả vào `ai_check_log.md`.
- [ ] Writing history trong Google Doc: phần văn nộp phải được **gõ trực tiếp
      nhiều phiên** bởi người phụ trách — không paste nguyên khối.

## Đã chốt trong đợt verify 17/07 (để đối chiếu khi GV hỏi)

- JA-008 (jsoup) mới là ca 60% coverage / 0% mutation (JA-020 là số pilot cũ,
  metrics_full.csv ghi JA-020 = 0/0).
- 3 ô baseline thiếu mutation = JA-017 (jfreechart) + JA-048/JA-058 (jsoup),
  nguyên nhân PIT không sinh mutant trong khoảng dòng — KHÔNG phải "Minion crash".
- 6/9 ca Java non-compile là hàm AccurateMath (JA-005/015/025/035/045/055,
  JA-045 là ca private duy nhất) + 3 Gson.
- 48/60 hàm Python từ flask; 4/6 lỗi pipeline exit code 0; Randoop là random
  testing (không phải search-based) — đã sửa 5 chỗ ghi nhầm.
- Amendment v1.1: soạn 28/06, chốt 02/07 — cả hai trước full run.
