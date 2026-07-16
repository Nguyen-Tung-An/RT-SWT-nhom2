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
| 2026-07-17 | 02_related | ZeroGPT | **0% AI** | "Your Text is Human written" | OK |
| 2026-07-17 | 03_method | ZeroGPT | **1% AI** | "Your File Content is Human written" | OK |
| 2026-07-17 | 04_results | ZeroGPT | **2.9% AI** | "Your File Content is Human written" | OK |
| — | 05_discussion | ZeroGPT | _chua scan_ | | scan not bang detector_input/05_discussion.txt |
| — | 06_threats | ZeroGPT | _chua scan_ | | scan not |
| — | 07_conclusion | ZeroGPT | _chua scan_ | | scan not |

**Minh chung anh:** luu 5 screenshot ket qua (da chup 17/07, ~05:30) vao thu muc
`paper/quality/ai_check_screenshots/` voi ten goi y:
`2026-07-17_zerogpt_00_abstract.png` ... `2026-07-17_zerogpt_04_results.png`.

## Ghi chu
- Muc tieu: van ban nop la SAN PHAM CUA NHOM; moi ho tro AI phai duoc khai bao theo quy dinh mon hoc
  (bai da co muc "AI Use Disclosure" trong main.tex — ket qua scan nay KHONG thay the khai bao do,
  chi la buoc kiem tra chat luong theo quy trinh RBL-5b).
- Cac section 00-02 la ban thanh vien tu viet (wire vao LaTeX + sua loi co hoc);
  03 co muc 3.1 tu viet; 04 la ban da quet van phong + cherry-pick cau tu ban tu viet.
- Luu screenshot ket qua detector vao thu muc nay neu GV yeu cau minh chung.
- Scan bang file trong `detector_input/` (van thuan) — KHONG dan file .tex tho,
  KHONG ghep nhieu ban/nhieu section vao 1 lan scan (bai hoc 16-17/07).
