# Quy chuẩn chọn dữ liệu

Bộ tiêu chí bắt buộc khi mine hàm cho thí nghiệm sinh test. Dự án gốc **không có tài liệu
này**, và đó là gốc của phần lớn vấn đề đo lường đã phát hiện.

---

## Ranh giới phải giữ

| | |
|---|---|
| ✅ **Lọc chính đáng** | Loại mục tiêu mà **không công cụ nào** kiểm thử được qua API công khai. Đây là sửa **lỗi chọn mẫu** — dataset đo đúng thứ nó tuyên bố đo |
| ❌ **Cherry-picking** | Loại hàm vì **model làm kém trên đó**. Bơm kết quả |

**Phép thử phân biệt:** tiêu chí có biết được **trước khi chạy thí nghiệm** không, và có
biện minh bằng **tính kiểm thử được** không? Nếu phải nhìn kết quả sinh test mới quyết
định loại — đó là cherry-picking.

---

## A. Tiêu chí RBL — giữ nguyên tuyệt đối

Đây là điều kiện đã đăng ký, **không được đổi** (chống HARKing):

| Tiêu chí | Giá trị |
|---|---|
| Độ phức tạp | **CC 5–10** |
| Công cụ đo CC | **Lizard 1.23.0** |
| Ngôn ngữ | Java + Python, cân bằng |
| Nguồn | Repo OSS **pin commit**, có URL + license + hash |

---

## B. Tiêu chí tính kiểm thử được — bắt buộc thêm

Mỗi tiêu chí kèm **bằng chứng** từ dataset gốc cho thấy vì sao cần.

### F1 — Hàm phải có thân thật (`nloc ≥ 3`)

Loại stub, abstract, interface declaration. Không có thân thì không có nhánh để phủ.

### F2 — Chỉ mục tiêu **public / exported**

- **Java:** chỉ `public`. Loại `private`, `protected`, package-private
- **Python:** loại tên bắt đầu `_` (private theo quy ước)

> **Bằng chứng:** dataset gốc có **17/60 mục tiêu Java là `private`** → **0/17 biên dịch
> được**. Thêm `protected` 0/4, package-private 1/4. Tổng **21/60 (35%) không public**, và
> **22/41 (54%)** ca lỗi javac là rào cản truy cập.
>
> Hàm `private` **không kiểm thử được từ ngoài** bởi GPT, EvoSuite, hay con người viết tay.
> Reflection vượt được nhưng làm chỉ số biên dịch mất ý nghĩa (`getDeclaredMethod("tênBịa")`
> vẫn compile `rc=0`). Đưa chúng vào dataset là **sai từ khâu chọn mẫu**.

### F3 — Tên hàm **không nhập nhằng** trong phạm vi

- **Java:** tên method chỉ xuất hiện **một lần** trong lớp (không overload)
- **Python:** tên hàm chỉ xuất hiện **một lần** trong module

> **Bằng chứng:** `CommandLine.getOptionValues` có 2 overload → test không biên dịch được
> (`reference to getOptionValues is ambiguous`). Cùng lỗi ở `getParsedOptionValues`.
> Prompt không thể mô tả rõ mục tiêu khi chính dataset không phân biệt được.

### F4 — Lớp chủ phải **xác định đúng** (parse có pop stack)

Dùng stack **có pop theo độ sâu ngoặc** khi xác định lớp bao ngoài. Không lấy "lớp lồng
nhau gần nhất".

> **Bằng chứng:** miner gốc gán **18/60** hàm Java sai lớp — `Builder::getOptionValues`
> thật ra là `CommandLine.getOptionValues`; `NonOptionAction::handleLongOptionWithEqual`
> thật ra là `DefaultParser...`. Đối chiếu tỷ lệ biên dịch:
>
> | | Biên dịch OK | Tỷ lệ |
> |---|---:|---:|
> | Lớp **SAI** | 1/18 | **5.6%** |
> | Lớp **ĐÚNG** | 16/42 | **38.1%** |
>
> Chênh gần **7 lần**. Đây là mắt xích nhân quả mạnh nhất tìm được.

### F5 — **Resolve được động** (Python)

Import module thật → đi theo `qualname` → xác nhận `callable`. Suy ra đúng cú pháp
**không đảm bảo** chạy được.

> **Bằng chứng:** `full_ground_truth.csv` gốc **không có cột class**, nên prompt chỉ nói
> *"Generate pytest tests for `raise_routing_exception`"* trong khi thật ra là
> `Flask.raise_routing_exception` → model đoán `from flask.app import ...` → ImportError.
> **22/60** ca Python hỏng vì lỗi này.

---

## C. Bắt buộc báo cáo FUNNEL

Mọi bước loại phải in ra số lượng. Không được loại âm thầm.

Kết quả chạy trên 10 repo pinned (`mine_clean.py --exclude-dev`):

| Bước | Còn lại |
|---|---:|
| F0 CC 5–10 | **1848** |
| F1 có thân thật | 1848 |
| F3 không nhập nhằng | 753 |
| F2 public | 474 |
| F4 lớp chủ xác định | 474 |
| F5 resolve động (Python) | 64 |
| **Pool cuối** | Java **385** · Python **30** |

**Đọc funnel này:** từ 1848 hàm CC 5–10, chỉ **474 (26%)** vừa public vừa không nhập nhằng.
Tức **3/4 hàm ở dải CC này không phải mục tiêu kiểm thử hợp lệ** — dataset gốc lấy bừa nên
dính đầy.

---

## D. Tuyệt đối KHÔNG lọc theo

- ❌ Kết quả sinh test (model pass/fail)
- ❌ Coverage hay mutation score đo được
- ❌ "Hàm này trông dễ test"
- ❌ Loại bỏ sau khi thấy số xấu

Nếu cần loại thêm sau khi đã chạy → **phải báo cáo cả hai tập** (trước và sau lọc), và nói
rõ lọc sau khi thấy kết quả.

---

## E. Ràng buộc thực tế đã gặp

**Python cạn nguồn.** Sau F5, pool Python chỉ còn **30 hàm** — vừa đủ. Nguyên nhân: flask
chỉ có 50 hàm CC 5–10 và **48 đã nằm trong 120 hàm gốc**. Nên tập mới nghiêng nặng về
requests (29/30).

Hệ quả phải khai báo: tập Python mới **không cân bằng repo**. Nếu cần cân bằng, phải thêm
repo Python mới (werkzeug, click, httpx) — nhưng khi đó phải pin commit và ghi provenance
như 10 repo cũ.

**Java dư dả.** Pool 385 hàm, chọn 30 cân bằng đều 8 repo (mỗi repo 3–4 hàm).

---

## F. Checklist trước khi chốt dataset

- [ ] CC đo bằng Lizard, dải 5–10, không đổi ngưỡng
- [ ] Repo pin commit, có URL + license + hash trong `data/raw/README.md`
- [ ] **Chỉ public/exported**
- [ ] **Không overload / trùng tên** trong phạm vi
- [ ] Lớp chủ parse bằng stack **có pop**, đối chiếu source thật
- [ ] Python: **verify động** — import + getattr + callable
- [ ] Java: đối chiếu class + method + arity trong source
- [ ] In **funnel đầy đủ**, mỗi bước loại bao nhiêu
- [ ] Không dùng bất kỳ kết quả sinh test nào để lọc
- [ ] Nếu là held-out: **0 trùng** với tập DEV (kiểm bằng file+tên+dòng)

---

## Công cụ

| Script | Việc |
|---|---|
| `mine_clean.py` | Mine theo toàn bộ F0–F5, in funnel |
| `enrich_ground_truth.py` | Thêm class_path, qualname, signature, import_hint |
| `enrich_constructors.py` | Thêm constructor **đã kiểm chứng chạy thật** |
| `verify_targets.py` | Kiểm chứng động 100% mục tiêu resolve được |

Đầu ra: `data/clean_ground_truth.csv` — 30 Java + 30 Python, **100% public**, đã lọc
nhập nhằng, lớp chủ xác định đúng.
