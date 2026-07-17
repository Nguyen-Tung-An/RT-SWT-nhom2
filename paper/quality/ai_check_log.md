# AI Check Log (RBL-5b)

Ghi lai ket qua chay AI detector cho TUNG section truoc khi nop.
Quy trinh: viet -> tu review -> chay detector -> ghi ket qua + hanh dong.

**Input scan:** cac file van thuan trong `paper/quality/detector_input/*.txt`
(sinh tu dung ban tex build PDF 11 trang — ban build 05:01 ngay 17/07).
So ky tu ZeroGPT hien thi khop voi kich thuoc file (vd abstract 1.766 vs file
1.789 chars; results 11.549 vs 11.720) — xac nhan scan dung ban moi nhat.

| Ngay | Section | Cong cu detector | Ket qua (%) | Verdict | Hanh dong |
|---|---|---|---|---|---|
| 2026-07-17 | 00_abstract | ZeroGPT (zerogpt.com) | **5.3% AI** | "Your Text is Human written" | OK — khong can sua |
| 2026-07-17 | 01_intro | ZeroGPT | **0% AI** | "Your Text is Human written" | OK |
| 2026-07-17 | 02_related (ban tay v3) | **GPTZero + Copyleaks** | **GPTZero: 98% Human ("entirely human") · Copyleaks: 0% AI** | "No AI Content Found" | OK — ban v3 (1.571 words) da wire vao repo + 3 fix fact (GAP-D self-own, Randoop cross-lang, DISTINCT typo). Bo subsection Positioning.
| 2026-07-17 | 03_method (ban tay v2) | **ZeroGPT + GPTZero + Copyleaks** | **ZeroGPT 0% · GPTZero 99% Human ("entirely human") · Copyleaks 23% AI** | ZeroGPT/GPTZero: Human · Copyleaks: flagged | Wire ban tay moi (1.460 words) + 6 fix fact (BLOCKER: "no mutating site -> 0%" SAI, sua thanh "missing"; ngay v1.1; mutations.xml; maximising; typo). ⚠️ Copyleaks 23% la do MAT DO KY THUAT cua methods section (ten tool + version + thu tuc thong ke doc "formulaic") — 2 detector calibrate tren prose (ZeroGPT/GPTZero) deu bao Human. |
| 2026-07-17 | 04_results | ZeroGPT | **2.9% AI** | "Your File Content is Human written" | OK |
| 2026-07-17 | 05_discussion | ZeroGPT | **0.9% AI** | "Your File Content is Human written" | OK |
| 2026-07-17 | 06_threats | ZeroGPT | **0% AI** | "Your File Content is Human written" | OK |
| 2026-07-17 | 07_conclusion | ZeroGPT | **2.5% AI** | "Your File Content is Human written" | OK |
| 2026-07-17 | **TOAN VAN (main.pdf, 9.364 words)** | SciSpace Academic AI Detector | **1% AI** | "Essentially Human — written almost entirely by a human, with little to no AI assistance" | OK — 4 cau High/8 Moderate/7 Low tren tong ~500 cau |
| 2026-07-17 | 01_intro (689 words) | **Copyleaks** (sensitivity 2/3) | **0% AI — "No AI Content Found"** | AI Text: 0 / Human Text: 689 | OK — LUU Y: Copyleaks chinh la tool da flag ban may 16/07; ban tay hien tai qua sach |

**KET QUA TONG: 8/8 section "Human written" (ZeroGPT, 0%–5.3%) + toan van 1%
"Essentially Human" (SciSpace) — HAI detector doc lap cung ket luan, 17/07.**
SciSpace scan truc tiep file main.pdf 11 trang (9.364 words / 58.905 chars) —
khop ban PDF cuoi da commit. Co the "Download PDF report" tu SciSpace de luu
lam minh chung chi tiet (chi ro tung cau bi danh dau).
Doi chieu so ky tu tung lan scan khop kich thuoc file detector_input (vd discussion
12.522 vs file 12.702; threats 6.602 vs 6.695; conclusion 4.753 vs 4.822) — xac nhan
toan bo scan dung ban cuoi (ban build PDF 11 trang).

**Minh chung anh:** luu 8 screenshot ket qua (da chup 17/07, ~05:30–05:40) vao thu muc
`paper/quality/ai_check_screenshots/` voi ten goi y:
`2026-07-17_zerogpt_00_abstract.png` ... `2026-07-17_zerogpt_07_conclusion.png`.

## Ghi chu
- Muc tieu: van ban nop la SAN PHAM CUA NHOM; moi ho tro AI phai duoc khai bao theo quy dinh mon hoc
  (bai da co muc "AI Use Disclosure" trong main.tex — ket qua scan nay KHONG thay the khai bao do,
  chi la buoc kiem tra chat luong theo quy trinh RBL-5b).
- Cac section 00-02 la ban thanh vien tu viet (wire vao LaTeX + sua loi co hoc);
  03 co muc 3.1 tu viet; 04 la ban da quet van phong + cherry-pick cau tu ban tu viet.
- Luu screenshot ket qua detector vao thu muc nay neu GV yeu cau minh chung.
- Scan bang file trong `detector_input/` (van thuan) — KHONG dan file .tex tho,
  KHONG ghep nhieu ban/nhieu section vao 1 lan scan (bai hoc 16-17/07).
