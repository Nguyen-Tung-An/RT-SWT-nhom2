# Khoi phuc metrics_java_gpt.csv tu console log Kaggle — dung khi version bi kill (qua 12h/loi)
# lam mat /kaggle/working nhung tab Logs van con. Moi ham do xong deu in 1 dong "[CSV] ..."
# Dung: copy toan bo log (tab Logs cua version) luu thanh log.txt roi chay:
#   python rebuild_tu_log.py log.txt  ->  ra metrics_java_gpt.csv (dat vao 03_PHAN-TICH/results/)
import sys
inp = sys.argv[1] if len(sys.argv) > 1 else "log.txt"
out = sys.argv[2] if len(sys.argv) > 2 else "metrics_java_gpt.csv"
HDR = "function_id,language,cc,branch_coverage,mutation_score,compiled,note"
seen = {}
for l in open(inp, encoding="utf-8", errors="ignore"):
    l = l.strip()
    if not l.startswith("[CSV] "): continue
    l = l[len("[CSV] "):]
    if l == HDR: continue
    fid = l.split(",", 1)[0]
    seen[fid] = l   # trung fid (resume) thi lay dong sau cung
open(out, "w", encoding="utf-8", newline="").write(HDR + "\n" + "\n".join(seen[k] for k in sorted(seen)) + "\n")
print("Ghi", out, "voi", len(seen), "dong (tu", inp + ")")
