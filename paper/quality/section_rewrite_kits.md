# Bộ khung tự viết lại 7 section (cho Lộc + người phụ trách từng phần)

Cùng cách dùng với `abstract_rewrite_kit.md` — làm đúng thứ tự, KHÔNG bỏ bước:

1. Đọc kỹ phần ý bắt buộc của section cho đến khi hiểu. **Đóng file .tex lại.**
2. Viết từng đoạn bằng tiếng Anh **theo trí nhớ, bằng lời của mình**. Câu ngắn, chắc,
   đúng số liệu là đạt — không cần bóng bẩy.
3. Viết xong mới mở bản cũ đối chiếu: CHỈ kiểm tra số liệu, không copy câu chữ.
4. Đưa Claude đối chiếu số liệu + ngữ pháp + LaTeX (không viết hộ).
5. Scan detector trên **VĂN THUẦN** (txt đã bỏ markup — dùng `detector_input/`,
   KHÔNG dán file .tex có `\section`, `\textbf`...), ghi vào `ai_check_log.md`.

Thuật ngữ GIỮ NGUYÊN ở mọi section (né là sai chuyên môn): branch coverage,
mutation score, cyclomatic complexity (CC), one-shot, LLM, unit-test generation,
EvoSuite, Randoop, Pynguin, gpt-4o-mini, INVALID, effective subset, one-sample /
paired Wilcoxon, Spearman ρ, rank-biserial r, median, HARKing, green-on-original.

Số liệu có đánh dấu ⏳ = đang được vòng verify đối chiếu lại với CSV — kiểm tra
kết quả verify trước khi chốt.

---

## 01 — Introduction (`01_intro.tex`) — CẬP NHẬT 17/07 theo bản đã sửa 2 vòng

**Vai trò:** bối cảnh → 2 gap → thiết kế → 3 RQ (+căn cứ ngưỡng) → 4 đóng góp →
roadmap. GIỮ NGUYÊN cấu trúc này — đây là khung chuẩn IEEE mà rubric chấm; chỉ
thay đổi CÁCH DIỄN ĐẠT từng đoạn, không phá khung.

**Ý bắt buộc (đúng thứ tự — bám bản tex hiện tại, đã đủ nội dung):**
1. **Hook nghịch lý:** trên giấy tờ, sinh test bằng LLM gần như đã xong — GPT-4o
   đạt 98.65% line coverage trên TestEval; các panel GPT-4-class đạt tương tự trên
   HumanEval-Java. NHƯNG đó là bài LeetCode ngắn, tự chứa.
2. **Vì sao số đó không suy ra được dự án thật (2 lý do):** (a) test trên benchmark
   chưa bao giờ phải resolve import graph / class hierarchy / method overload
   thật; (b) line coverage cao tự nó không chứng minh test bắt được lỗi.
3. **Quan sát của chính nhóm (định lượng):** lấy 120 hàm từ 10 project thật
   (Apache Commons, Gson, Joda-Time, Flask, Requests) → **92/120 (76.7%)** suite
   gpt-4o-mini sinh ra không hề chạm vào hàm cần test.
4. **Gap 1 (GAP-T)** + nối thẳng thiết kế: không ai đo *ở đâu* test LLM hỏng khi
   CC tăng (số báo gộp, CC không kiểm soát) → vì thế nhóm cố định CC làm biến
   kiểm soát, chỉ lấy band trung bình 5–10, và test tương quan CC↔chất lượng
   trực tiếp (RQ3).
5. **Gap 2 (GAP-M):** coverage + mutation hiếm khi đo cùng nhau trên 1 mẫu kiểm
   soát; bằng chứng của chính nhóm: **JA-008** (jsoup) 60% coverage nhưng 0%
   mutation.
6. **Thiết kế kể theo bài học thật:** proposal ghi Defects4J + CodeXGLUE → phát
   hiện CodeXGLUE không phải corpus hàm chạy được → tự mine 120 hàm (60/60),
   pinned commit, CC 5–10 đo bằng Lizard. Pilot: 10/12 phép đo Python INVALID vì
   hàm xé khỏi module không resolve được tên → quyết định đo TRONG project gốc.
   Hệ quả phương pháp luận: điểm số không còn bị kéo xuống bởi artefact tách hàm
   — chỉ còn bởi chất lượng test. So với 3 baseline: EvoSuite + Randoop (Java,
   60s/class) và Pynguin (Python, 90s/module); non-parametric, α=0.05.
7. RQ1/RQ2/RQ3 — GIỮ NGUYÊN VĂN khối RQ trong tex (đã chuẩn, không cần đổi).
8. **Căn cứ ngưỡng (chống "tùy ý"):** 80% = mốc adequacy hay được trích dẫn
   trong industry; 60% cố ý đặt TRÊN dải 33–40% mà literature (§II) báo cáo cho
   test LLM; cả hai chốt trong proposal đã duyệt TRƯỚC khi có data.
9. 4 đóng góp: (a) benchmark 120 hàm có provenance; (b) pipeline đo per-function
   trong project gốc + green-on-original bắt buộc; (c) so sánh GPT-4o-mini vs
   baseline search-based/random trên mẫu đồng nhất CC; (d) danh mục bẫy đo lường
   kèm 2 ví dụ thật: EvoSuite exit code 0 mà không sinh test nào, JaCoCo báo 0%
   vì instrumenting class loader.
10. Roadmap 1 câu: §II–§VII.

**Checklist số liệu:** 98.65% (TestEval) · 92/120 = 76.7% · 120 = 60+60 · CC 5–10
· Lizard · 10/12 pilot INVALID · 60s/90s budget · α=0.05 · JA-008 60%/0% ·
ngưỡng 80/60 chốt trước data · dải literature 33–40% mutation.

**Cấm copy các cụm (cộng dồn qua 3 lần flag):** "spend a large share of their
engineering time", "routinely proposed as a way to cut that cost", "The early
evidence looks promising", "Two gaps follow from this", "That is precisely the
gap", "looks, on paper, close to solved", "Two measurement gaps in the current
literature hide this", "Our design decisions followed from practical lessons",
"Concretely, we contribute", "The methodological consequence matters".
→ Bài học từ 3 vòng flag: cụm nào do MÁY viết lại rồi cũng bị flag tiếp. Đừng
   tìm cụm thay thế "an toàn" — hãy diễn đạt ý bằng câu CỦA MÌNH, chấp nhận
   câu ngắn, thô, không đều nhau.

---

## 02 — Related Work (`02_related.tex`)

**Vai trò:** 6 tiểu mục A–F, kết ở gap. Mọi claim mượn từ paper khác PHẢI có
`\cite{}` — key theo bib 25-entry của Kim (đã là bản chuẩn trong repo).

**Ý bắt buộc:**
- **A — Benchmark tuyển chọn:** GPT-4-class đạt rất cao trên benchmark cô lập:
  98.65% line / 97.16% branch trên TestEval `\cite{wang2025testeval}`; 99.05%
  branch HumanEval-Java `\cite{kumar2025empirical}`; Gemini 1.5-Pro 90.69% pass
  trên HumanEval `\cite{lira2025evaluating}`. Đặc điểm chung: hàm ngắn, tự chứa,
  không context thật, không kiểm soát CC → nửa đầu GAP-T.
- **B — Suy giảm trên code thật:** GPT-4o chỉ compile 37% (63% lỗi) trên 353 PR
  Java thật, fail-to-pass 13% vs EvoSuite 36% `\cite{haratian2026praware}`; >50%
  test ChatGPT malformed `\cite{sapozhnikov2024empirical}`; 47.9–55.9% lỗi compile
  trên 9 project `\cite{zhang2024testbench}`; pipeline gpt-4o-mini thuần: mutation
  33.82% `\cite{konstantinou2026evaluating}`; Python: 84.3% pass@1 nhưng mutation
  33.8% `\cite{jain2025testgeneval}`. Số của nhóm còn cao hơn (91.7% Java
  INVALID-or-no-touch; 46.7% Python INVALID) vì 2 lựa chọn chủ đích: đo trong
  project thật + model nhẹ hơn → lower bound.
- **C — Baseline không-LLM:** EvoSuite (genetic search) `\cite{fraser2011evosuite}`,
  Randoop (feedback-directed random) `\cite{pacheco2007randoop}`, Pynguin
  (DYNAMOSA) `\cite{lukasczyk2022pynguin}`; không phụ thuộc prompt → lỗi compile
  của LLM không áp vào chúng; budget theo thời gian sinh, không theo số call.
- **D — Vá gap one-shot:** 3 họ kỹ thuật: feedback/repair loop
  (`\cite{zeng2026logic}`, `\cite{xue2025distinct}`, `\cite{gu2025template}`);
  retrieval/context (call-graph `\cite{liu2025typeaware}`, HITS
  `\cite{konstantinou2025yate}`); best-of-N `\cite{silva2025comparative}`.
  Cả 3 đều bước ra ngoài single-call/single-sample — cố tình KHÔNG dùng ở đây vì
  RQ1–RQ3 đo năng lực one-shot nguyên bản.
- **E — Coverage vs mutation:** cảnh báo lặp lại trong literature
  (`\cite{dakhela2023}`, `\cite{antal2025leveraging}`); ca rõ nhất 84.3% pass@1 đi
  cùng 33.8% mutation `\cite{jain2025testgeneval}` — nhóm tái hiện trực tiếp
  (JA-020). Ít paper gộp cả 2 metric vào 1 test thống kê trên mẫu kiểm soát CC →
  GAP-M.
- **F — Định vị:** literature nhất quán: tốt trên curated, hỏng trên real code,
  cộng đồng phản ứng bằng kiến trúc (loop/retrieval/sampling) thay vì ĐO có kiểm
  soát dọc trục CC. Chưa nghiên cứu nào trong evidence table cô lập CC làm biến
  kiểm soát trên mẫu Java+Python khớp nhau với cả 2 metric chung 1 test thống kê
  (GAP-T/GAP-M/GAP-D — ⚠️ verify 17/07: con số "34, 13, 4 paper ủng hộ" KHÔNG có
  artefact nào trong SLR/ chống lưng — evidence table chỉ có N=9 paper. Nhóm phải
  chốt: hoặc lấy số đúng từ bảng evidence merged, hoặc BỎ 3 con số này).
  RQ1–RQ3 đóng đúng gap đó.

**Cấm copy:** "score well, and a large share of recent work reports exactly
that", "the numbers there look considerably worse", "Our own figures sit above
even these", "plays the same role on the Python side", "What unites all three
families".

---

## 03 — Methodology (`03_method.tex`)

**Vai trò:** đủ chi tiết để tái lập. 4 tiểu mục: Dataset / Generation /
Measurement / Statistics. Người xác nhận: 3.1+3.3a Lộc, 3.2 Hải, 3.3b+3.4 Phúc
(xem `kich-ban-viet-method.md`).

**Ý bắt buộc:**
- **A — Dataset:** kế hoạch gốc Defects4J + CodeXGLUE; phát hiện CodeXGLUE là
  benchmark code-intelligence (summarisation/translation), không phải corpus hàm
  chạy được cho coverage/mutation → amendment v1.2, duyệt 2026-07-02 TRƯỚC full
  run; mine trực tiếp 10 repo pinned: commons-cli, commons-math, commons-csv,
  commons-collections, gson, jsoup, joda-time, jfreechart + flask, requests;
  provenance (URL, licence, commit, ngày tải) ghi riêng; 120 hàm (60/60), CC 5–10
  đo bằng Lizard; lệch nội bộ Python (flask nhiều hơn requests — ✅ 48/60, đã
  verify với full_ground_truth.csv) khai báo ở §VI thay vì resample sau khi đã
  bắt đầu đo.
- **B — Generation:** `gpt-4o-mini-2024-07-18` snapshot cố định, temperature=0,
  top_p=1, max_tokens=2048; one-shot = 1 exemplar trước hàm mục tiêu; proposal
  gốc ghi gpt-4o nhưng account không có quyền — ràng buộc khách quan, KHÔNG phải
  quyết định sau khi thấy số → amendment v1.1 (2026-06-28, trước full run);
  không amendment nào đổi RQ/metric/threshold/test. Baseline: EvoSuite + Randoop
  60s/class (pilot lộ lệch 60s-vs-10s, đã cân trước full run); Pynguin DYNAMOSA
  90s/module; Hypothesis có trong proposal sớm nhưng không dùng trong kết quả.
- **C — Measurement:** không đo hàm cô lập — test chạy trong project thật ở pinned
  commit (pilot §VI cho thấy phần lớn hàm chỉ resolve được tên trong module thật).
  Java: Maven + JaCoCo + PIT, gán kết quả per-function bằng giao khoảng dòng
  [start_line, end_line]; test GPT compile/đo RIÊNG từng hàm (1 file/lần) để 1
  lỗi compile không làm oan hàm khác. Python: editable install của flask/requests
  pinned; coverage.py (branch); mutation = operator AST nhẹ (swap toán tử
  binary/comparison/boolean, đổi hằng bool/số) CHỈ trong khoảng dòng hàm; cùng
  operator cho cả GPT lẫn Pynguin. INVALID = không compile/import/chạy → cả 2
  metric 0% (proposal §5.1). Green-on-original bắt buộc trước mutation; phân biệt
  INVALID với compiled-nhưng-không-chạm-target (cả 2 đều 0% nhưng lý do khác,
  §IV báo tách).
- **D — Statistics:** toàn bộ α=0.05, non-parametric (điểm bị chặn [0,100], không
  giả định phân phối chuẩn). RQ1: one-sample Wilcoxon vs 80. RQ2: one-sample vs
  60 + paired Wilcoxon vs từng baseline khớp function_id, effect size =
  matched-pairs rank-biserial r. RQ3: Spearman ρ CC↔metric. Báo song song 2 mức:
  **all** (N=60/ngôn ngữ, INVALID/no-touch = 0 theo rule đăng ký trước) và
  **effective** (compile + chạm target) — vì chỉ báo effective sẽ làm năng lực
  thô trông đẹp hơn thật.

**Cấm copy (cộng dồn qua các lần flag):** "The initial plan was to construct the
dataset from", "it became apparent that", "documented as amendment", "full
provenance", "One imbalance is noteworthy", "an objective constraint, not a post
hoc decision", "Neither amendment altered", "This budget was harmonised", "It is
important to distinguish between", "a deliberate choice, since we cannot assume",
"bounded between 0 and 100", "answers the threshold question / the comparative
question", "reported side by side", "make raw capability look better than it is",
"We chose not to measure functions in isolation".
→ Như bài học ở kit Intro: cụm máy thay cụm rồi cũng bị flag tiếp — tự diễn đạt.
**Lưu ý khi scan lại:** dùng bản MỚI trong `detector_input/03_method.txt` —
feedback 17/07 đợt 2 phân tích nhầm bản cũ (11 cụm được trích đã không còn
trong source từ lượt sửa trước).

---

## 04 — Results (`04_results.tex`)

**Vai trò:** trả lời từng RQ bằng số + bảng + hình; không diễn giải sâu (để §V).
Giữ nguyên Table I, Fig. 1, Fig. 2 (môi trường LaTeX không phải viết lại).

**Ý bắt buộc:**
1. **Setup nhắc lại 1 câu** + rule: fail compile/execute → 0% + INVALID; mọi số
   báo 2 mức all/effective song song, effective là con số có điều kiện.
2. **A — Test validity (phát hiện chính):** Python: 32/60 (53.3%) chạy được ≥1
   test, 28/60 (46.7%) INVALID; trong 32 valid chỉ 23 chạm target, 9 chạy mà
   không chạm (mock/tự cài lại). 28 INVALID = 23 ImportError (lỗi LLM — import
   symbol không tồn tại; một phần nhỏ là artefact dataset/platform:
   proxy_bypass_registry chỉ Windows, merge_environment_settings là method) + 5
   TypeError/AttributeError (nhạy môi trường). Java bề ngoài đẹp hơn: 51/60 (85%)
   compile, 9/60 (15%) INVALID — nhưng chỉ 5 chạm target, 46 compile-chạy-không-
   chạm; pattern trội: **wrong-target invocation** — call hợp lệ, resolve vào
   method THẬT nhưng sai (JA-002: `CommandLine.getOptionValues` thay vì
   `CommandLine.Builder.getOptionValues`; có ca dính method thừa kế cùng tên).
   Compiler Java chấp nhận im lặng → "compiled" nhưng đo được zero. Tổng:
   effective Java 5/60 (8.3%) vs Python 23/60 (38.3%). 9 ca non-compile: **6**
   AccurateMath (overload dày đặc — ✅ verify 17/07: JA-005/015/025/035/045/055,
   trong đó JA-045 là ca private duy nhất) + 3 Gson adapter generic → lỗi bám
   API surface, không phải visibility.
3. **B — RQ1:** all median 0% (cả 2 ngôn ngữ; chỉ 23/60 Python chạm nhánh nào
   đó); effective: Py 75.0% (n=23; 11/23 ≥80%, 6 ca 100%; p=0.67, r=−0.10), Java
   50.0% (n=5; p=0.91, r=−0.60), pooled 75.0% (n=28; p=0.84, r=−0.22) → mọi tổ
   hợp đều fail to reject H0, dưới ngưỡng 80%.
4. **C — RQ2:** (A) vs 60%: Py all 0%, measured n=17 median 36.84% (4/17 ≥60%;
   p=0.99, r=−0.66); Java all 0%, measured n=54 median 0% (p=1.00, r=−1.00);
   pooled n=71 median 0% (p=1.00, r=−0.97) → không đạt, Java yếu hơn Python.
   (B) vs baseline: thua EvoSuite (n=54, p<0.001, r=−1.00) và Randoop (n=54,
   p=0.003 ✅ verified, r=−1.00) — effect size tối đa, baseline thắng MỌI cặp có
   khác biệt; "thắng" Pynguin (n=13, +36.84pp, p=0.010, r=+0.85) nhưng chỉ vì
   Pynguin tự sụp (timeout, lỗi dill pickling với module import _json, tracer
   abort → 0.0% median coverage) → H0 bị bác 2 lần theo 2 hướng ngược nhau.
5. **D — RQ3:** effective Py ρ=+0.18 (p=0.41, n=23); Java ρ=+0.13 (p=0.83, n=5);
   pooled ρ=+0.16 (p=0.40, n=28) → không có tương quan; cái chi phối là kết cục
   nhị phân compile/chạm-target, không phải suy giảm dần theo CC.
6. **E — Tóm tắt:** không ngưỡng nào đạt ở ngôn ngữ nào; phát hiện chính là test
   validity hỏng theo 2 kiểu khác nhau: Python chết lúc compile (ImportError),
   Java compile được nhưng đo được zero.

**Cấm copy (cộng dồn):** "tells a different story on the surface", "That lower
Java invalidity rate is misleading, though", "the dominant pattern: wrong-target
invocation", "H0 is therefore rejected twice, in opposite directions", "This
result is validated by", "These results show that", "In practical terms", "The
main finding concerns", "should be read as", "follow a parallel trend",
"Presenting results in this way".
**Lưu ý khuôn RQ:** GPTZero flag khuôn "median → subset → p/effect → kết luận"
lặp đều 3 lần. Khi tự viết, đổi nhịp giữa 3 RQ (RQ1 kể tuần tự, RQ2 đi thẳng
vào con số, RQ3 mở bằng kết luận rồi mới đưa số...) — số liệu giữ nguyên.

---

## 05 — Discussion (`05_discussion.tex`)

**Vai trò:** vì sao kết quả như vậy, ý nghĩa gì; RQ4/RQ5 exploratory nằm ở đây
(KHÔNG trộn vào Method/Results chính thức — ranh giới confirmatory/exploratory).

**Ý bắt buộc:**
- **A — Coverage ≠ chất lượng:** **JA-008** (jsoup) 60% coverage / 0% mutation
  (✅ verify 17/07 — KHÔNG phải JA-020, đó là số pilot cũ); ở mức tổng:
  effective coverage (75%/50%) nghe ổn nhưng mutation (36.84%/0%) tệ → chỉ nhìn 1
  metric sẽ kết luận sai; báo cặp metric + 2 mức all/effective là thứ giữ kết
  luận khỏi lệch.
- **B — "Breaking point" ở đâu?** RQ3 không thấy suy giảm dần trong CC 5–10 →
  phải xét lại chính cách đặt câu hỏi: trong band này kết cục nhị phân
  (compile được không, gọi đúng target không) quyết định gần như độc lập với CC.
  Muốn tìm breaking point thật phải lấy mẫu CC <5 và >10 (future work).
- **C — Chi phí không phải nút thắt, độ tin cậy mới là:** sinh 120 suite ≈ $1,
  vài phút; EvoSuite/Randoop 60s/hàm → hàng chục phút chỉ riêng sinh. LLM rẻ và
  nhanh nhưng thua r=−1.00 → dành thời gian tiết kiệm được cho vài vòng
  compile-retry là hướng hợp lý.
- **D — INVALID rate là finding, không phải bug:** không lọc hàm private (17/60
  Java) sau khi thấy kết quả — làm thế là chọn mẫu theo chính outcome đang đo
  (vi phạm protocol đăng ký trước). Trả giá xứng đáng: visibility hoá ra KHÔNG
  phải nguyên nhân chính (chỉ 1/9 non-compile và 14/46 no-touch là private);
  nguyên nhân trội là wrong-target quanh API dày (AccurateMath, Gson). Khớp
  literature: 63% compile error `\cite{haratian2026praware}`, >50% malformed
  `\cite{sapozhnikov2024empirical}`, thiếu repair loop
  `\cite{kumar2025empirical}` → kết quả của nhóm là lower bound, lý giải vì sao
  cộng đồng chuyển sang feedback/retrieval.
- **E — Vì sao "thắng" Pynguin:** minh hoạ rủi ro chung khi so baseline — thắng
  có thể do baseline hỏng tool chứ không phải treatment mạnh; vẫn báo vì là
  baseline đăng ký trước, giấu đi mới là validity threat; không được đọc thành
  "gpt-4o-mini viết test Python tốt".
- **F — RQ4 (exploratory, post-hoc):** thêm skeleton API thật (javalang/ast) vào
  prompt, cùng 120 hàm/model/exemplar; khai báo rõ là post-hoc (nghĩ ra SAU khi
  thấy N=120) — gộp vào confirmatory là HARKing; kết quả ghi file riêng, N=120
  gốc không bị đè. Java: compile giữ 51/60 cả 2 arm, effective ×2: 5/60→11/60
  (8.3%→18.3%); paired 7 tăng/1 giảm/52 giữ; one-sided Wilcoxon sát mép nhưng
  chưa qua α=0.05; mutation không nhúc nhích (n=48 pairs, cả 2 median 0%) →
  context sửa được lỗi cấu trúc (gọi đúng method) nhưng không sửa được lỗ hổng
  suy luận hành vi (mutation đo cái đó). Python: theo rule cả-file-phải-pass
  trông tệ đi (7/60 vs 32/60) nhưng là artefact đo lường — đếm per-test-case thì
  tương đương (267 test @33.3% vs 233 @32.2%); context làm model viết NHIỀU test
  hơn/file → xác suất 1 test hỏng cả file tăng cơ học; ca
  flask.logging.has_level_handler: hiểu sai logger hierarchy giống hệt ở cả 2
  arm. Implication: context rẻ, có tác dụng thật với wrong-target Java, trung
  tính với Python khi đo công bằng; không đổi kết luận RQ1–RQ3.
- **G — RQ5 (exploratory):** 1 vòng repair duy nhất, cam kết TRƯỚC khi chạy
  (anti-HARKing: không lặp đến khi ra số đẹp); input = kết quả 0%-coverage +
  skeleton (Java — log Maven quá nhiễu) / output pytest thật (Python); suite đã
  effective giữ nguyên. Java: 11/60→15/60 (25.0%); 4 tăng/0 giảm; p=0.063,
  r=1.00 (mọi cặp không hoà đều nghiêng về repair); leo đơn điệu
  8.3%→18.3%→25.0%; mutation vẫn 0% (n=45). Python: regression thật — per-test
  15.5% (106/682) < 33.3% (RQ4) < 32.2% (gốc); test phình 682 từ 267 → model
  phản ứng với failure bằng cách VIẾT THÊM test thay vì sửa assertion hỏng;
  không đuổi thêm chẩn đoán (đúng cam kết chạy-1-lần-báo-thật). Verdict: 2 vòng
  can thiệp rẻ không đóng được gap tới 80%/60%; can thiệp literature gợi ý không
  phải thuốc tiên, có ca làm tệ hơn; dừng ở đây, không thử kỹ thuật thứ 3.

**Cấm copy:** "is not a methodological nicety here", "That restraint paid off
unexpectedly", "a useful illustration of a general risk", "fits a picture where
context fixes a structural knowledge gap".

---

## 06 — Threats to Validity (`06_threats.tex`)

**Vai trò:** trung thực, cụ thể, mỗi threat kèm cách giảm nhẹ. 4 mục chuẩn.

**Ý bắt buộc:**
- **A — Construct:** 3 lần suýt ra số sai, đều bắt được nhờ đối chiếu artefact
  thật: (1) mutation 100% giả trên suite đã fail sẵn → bắt buộc green-on-original,
  fail là INVALID; (2) EvoSuite exit code 0 kể cả khi không sinh test nào — 12
  hàm từng bị log "thành công" trong khi 0 file tồn tại → check file thật thay vì
  exit code; (3) JaCoCo báo 0% cho test EvoSuite vì separateClassLoader đổi
  class identity → tắt khi đo. Nhắc lại: coverage một mình là proxy không tin
  được (ca 60%/0%).
- **B — Internal:** pilot lộ lỗi tích hợp: data v1 Java lệch metadata (LLM nhìn
  source sai hàm) → bỏ toàn bộ test pilot, sinh lại sau khi sửa data; Python
  10/12 pilot INVALID vì hàm bị xé khỏi module → chuyển sang đo trong module
  thật pinned commit; baseline: lệch budget EvoSuite 60s vs Randoop 10s + file
  Randoop bị ghi đè giữa các run → cân budget + tên file per-function trước full
  run; loạt mismatch tool–môi trường: EvoSuite 1.2.0 cần JDK 8, multi-release
  jar chứa bytecode Java 21 làm ASM cũ chết, 1 project đặt jacoco.skip=true
  trong pom. Điểm nhấn: ⏳ 4/6 lỗi pipeline kết thúc exit code 0 — lỗi im lặng,
  không verify artefact là không thấy.
- **C — External:** kết quả chỉ đại diện `gpt-4o-mini-2024-07-18`, không suy
  rộng cho model lớn hơn (amendment v1.1); dataset 2 hệ sinh thái (thư viện Java
  kiểu Apache + web-lib Python), lệch nội bộ Python (⏳ 48/60 từ flask); hàm cần
  context nặng (GUI/network) under-represented; coverage baseline dao động mạnh
  theo repo (gần tuyệt đối trên numeric-utility, thấp trên parser/formatter) →
  ngưỡng 80% phải đọc theo per-repo variation.
- **D — Conclusion:** N=120, non-parametric + effect size đi kèm mọi p-value;
  ngưỡng chốt trong proposal TRƯỚC khi có data; mọi thay đổi protocol đều có
  amendment ký trước khi data tương ứng sinh ra → chống HARKing. Khuyết: 3/60 ô
  mutation baseline không có số — ✅ ĐÃ CHỐT (verify 17/07 bằng metrics_full.csv):
  **JA-017 (jfreechart) + JA-048/JA-058 (jsoup)**, nguyên nhân PIT không sinh
  được mutant nào trong khoảng dòng hàm ở cả 2 tool → N/A hợp lệ, báo missing
  thay vì impute 0 (KHÔNG phải "Minion crash JA-005/035/007" như bản nháp cũ —
  JA-005 thực tế có ms=86.59); coverage 3 hàm này không ảnh hưởng (đo trước
  PIT); trùng hợp 3 hàm cũng nằm trong nhóm INVALID/non-effective của LLM nhưng
  vì lý do độc lập (wrong-target). Pynguin: Python 3.14 làm instrumentation sinh
  suite rỗng → tái hiện có log, truy về master–worker subprocess → venv Python
  3.10 riêng chỉ cho Pynguin; là infrastructure fix áp dụng ĐỒNG LOẠT trước khi
  đo, không phải amendment protocol → không có rủi ro HARKing; sau fix Pynguin
  vẫn 0.0% → finding thật (yếu) về độ khó real-world của Pynguin.

**Cấm copy:** "came close to producing misleading numbers", "rendering them
silent errors that would have remained undetected", "thereby stressing the key
role of pipeline integrity", "This counts as an infrastructure fix, not a
protocol amendment".

---

## 07 — Conclusion (`07_conclusion.tex`)

**Vai trò:** trả lời gọn từng RQ → 2 bài học lớn → future work. KHÔNG số liệu
mới, chỉ nhắc số đã có.

**Ý bắt buộc:**
1. Nhắc thiết kế 1 câu: GPT-4o-mini, 120 hàm thật Java/Python CC 5–10, đo trong
   project gốc, so EvoSuite/Randoop cùng budget 60s.
2. **RQ1:** không đạt 80% ở mọi mức: all median 0%; effective (n=28) 75.0%
   (p=0.84, r=−0.22). Bối cảnh: EvoSuite cũng chỉ 55.0% median, Randoop 21.1%
   trên cùng 60 hàm Java → ngưỡng 80% khó với MỌI tool trên mẫu này.
3. **RQ2:** mutation yếu hơn nữa: effective median 36.84% Py / 0% Java (<60%);
   thua EvoSuite (p<0.001, r=−1.00) và Randoop (p=0.003 ⏳, r=−1.00) — baseline
   thắng mọi cặp có khác biệt; "thắng" Pynguin (p=0.010, r=+0.85) chỉ vì Pynguin
   0.0% (tooling failure).
4. **RQ3:** không có tương quan CC↔chất lượng trong band (Py ρ=+0.18 p=0.41;
   Java ρ=+0.13 p=0.83; pooled ρ=+0.16 p=0.40); kết cục nhị phân
   compile/đúng-target chi phối; breaking point thật cần dải CC rộng hơn.
5. **Bài học 1:** đánh giá test LLM trên hàm xé khỏi context là đánh giá THẤP độ
   khó của code thật — hàm trong project trưởng thành phụ thuộc module xung
   quanh; đo chỉ có nghĩa khi giữ context.
6. **Bài học 2:** pipeline đo lường tự nó là threat hạng nhất — đa số lỗi gặp
   phải im lặng (exit code 0); không verify artefact từng bước thì số "trông
   chắc" mà sai.
7. **RQ4/RQ5 (1 câu):** 2 can thiệp rẻ (context, 1 vòng repair) cải thiện
   effective-rate Java 8.3%→18.3%→25.0% nhưng chưa đạt ý nghĩa thống kê, mutation
   đứng im 0%; Python không lợi, repair còn làm tệ đi; dừng đúng cam kết
   anti-HARKing.
8. **Future work (5 hướng):** (1) mở rộng mẫu Java xem trend RQ4/RQ5 có đạt
   significance; (2) repair nhiều vòng với stopping criteria theo kích thước
   suite (kiểm tra regression Python); (3) model lớn hơn (GPT-4o/Claude-class);
   (4) mở dải CC (>10, <5) tìm breaking point; (5) tích hợp vào CI để đánh giá
   liên tục — tất cả cần pre-registered.

**Cấm copy:** "We set out to evaluate", "the maximum possible effect size,
meaning the baseline wins every single function", "Two lessons generalise beyond
the numeric answers themselves", "These avenues are all best addressed by
future, rigorously pre-registered studies".

---

## Sau khi viết xong TỪNG section

1. Nhờ Claude đối chiếu: số liệu (so CSV), ngữ pháp, thuật ngữ, LaTeX.
2. Export văn thuần (không markup) → scan detector → ghi `ai_check_log.md`.
3. Đoạn nào vẫn bị flag: tự viết lại thêm 1 lần CHÍNH đoạn đó (thường là đoạn
   liệt kê thông số đều đặn kiểu máy) — tách câu dài thành câu ngắn không đều,
   thêm 1 nhận xét cá nhân có thật, KHÔNG synonym-swap từng chữ.
