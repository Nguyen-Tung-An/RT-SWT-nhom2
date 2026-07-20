"""Trich chu ky __init__ cua LOP CHU + sinh doan dung doi tuong DA KIEM CHUNG CHAY DUOC.

Vi sao can (bang chung tu why_fail_v2.csv):
  Prompt v2 sua duoc khau DINH DANH muc tieu (import-sai 22->3) nhung 11/26 ca con chet
  ngay o __init__ va 4 ca nua chet vi thieu request context:
      App.__init__() missing 1 required positional argument: 'import_name'
      Config.__init__() missing 1 required positional argument: 'root_path'
      RuntimeError: There is no request in this context.
  Prompt noi model biet CAI GI can goi, nhung khong noi LAM SAO dung duoc doi tuong.

Nguyen tac (bai hoc cua chinh du an): suy ra dung cu phap KHONG co nghia la chay duoc.
Moi doan dung doi tuong o day deu duoc THUC THI that; chi doan nao chay duoc moi ghi vao.
Doan nao khong dung duoc thi ghi ro la khong dung duoc, khong bia.

Chay:  python ms-analysis/scripts/enrich_constructors.py
       python ms-analysis/scripts/enrich_constructors.py --verbose
"""
from __future__ import annotations

import argparse
import csv
import importlib
import inspect
import os
import sys

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
GT_V2 = os.path.join(REPO, "data", "full_ground_truth_v2.csv")
OUT = os.path.join(REPO, "data", "full_ground_truth_v3.csv")

for p in (os.path.join(REPO, "data", "raw", "flask", "src"),
          os.path.join(REPO, "data", "raw", "requests", "src")):
    if p not in sys.path:
        sys.path.insert(0, p)

NEW_COLS = ["ctor_signature", "ctor_snippet", "ctor_verified", "needs_context", "ctor_note",
            "ctor_class", "ctor_module"]

# Gia tri mau theo TEN tham so — thu tu quan trong, khop tu cu the den chung chung.
# Chi la UNG VIEN; moi ung vien deu phai qua buoc thuc thi that o duoi.
SAMPLES = [
    (("import_name", "package_name"), '"test_app"'),
    (("root_path",), 'str(__import__("tempfile").gettempdir())'),
    (("app",), '__import__("flask").Flask("test_app")'),
    (("name",), '"test"'),
    (("url_prefix", "subdomain", "url_defaults"), "None"),
    (("blueprint",), '__import__("flask").Blueprint("bp", "test_app")'),
    (("defaults",), "{}"),
    (("environ",), '{"REQUEST_METHOD": "GET", "PATH_INFO": "/", "SERVER_NAME": "localhost",'
                   ' "SERVER_PORT": "80", "wsgi.url_scheme": "http"}'),
    (("first_registration",), "False"),
    (("url", "path"), '"/"'),
    (("application", "wsgi_app"), '__import__("flask").Flask("test_app")'),
    (("code", "description"), "None"),
]

# Lop nao doi hoi ngu canh runtime -> them idiom, KHONG chi them constructor
CONTEXT_HINT = {
    "flask": ("Some methods need an active application/request context. Wrap the call:\n"
              "    with app.test_request_context('/'):\n"
              "        <call the target here>"),
    "requests": "",
}


def sample_for(param: inspect.Parameter) -> str | None:
    for names, val in SAMPLES:
        if param.name in names:
            return val
    ann = param.annotation
    if ann is not inspect.Parameter.empty:
        s = str(ann)
        for needle, val in (("str", '"test"'), ("int", "1"), ("bool", "False"),
                            ("dict", "{}"), ("list", "[]")):
            if needle in s:
                return val
    return None


def build_snippet(cls) -> tuple[str, str]:
    """-> (signature, doan dung ung vien). Chua kiem chung."""
    try:
        sig = inspect.signature(cls.__init__)
    except (TypeError, ValueError):
        return "", ""
    params = [p for n, p in sig.parameters.items() if n not in ("self", "cls")]
    required = [p for p in params
                if p.default is inspect.Parameter.empty
                and p.kind not in (inspect.Parameter.VAR_POSITIONAL, inspect.Parameter.VAR_KEYWORD)]
    args = []
    for p in required:
        v = sample_for(p)
        if v is None:
            return str(sig), ""          # khong doan noi -> khong bia
        args.append(f"{p.name}={v}")
    return str(sig), f"{cls.__name__}({', '.join(args)})"


def verify(mod_name: str, cls_name: str, snippet: str) -> tuple[bool, str]:
    """THUC THI that doan dung doi tuong. Day la khac biet giua 'suy ra' va 'chay duoc'."""
    if not snippet:
        return False, "khong sinh duoc ung vien"
    try:
        mod = importlib.import_module(mod_name)
        cls = getattr(mod, cls_name, None)
        if cls is None:
            return False, f"khong thay {cls_name} trong {mod_name}"
        ns = {cls_name: cls, "__builtins__": __builtins__}
        obj = eval(snippet, ns)  # noqa: S307 — chay code cua chinh du an, cung rui ro nhu Pynguin
        return True, type(obj).__name__
    except Exception as e:  # noqa: BLE001
        return False, f"{type(e).__name__}: {str(e)[:70]}"


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--verbose", action="store_true")
    a = ap.parse_args()

    rows = list(csv.DictReader(open(GT_V2, encoding="utf-8-sig")))
    ok = fail = skip = 0

    for r in rows:
        for c in NEW_COLS:
            r.setdefault(c, "")
        if r["language"] != "python" or r["is_method"] != "yes":
            r["ctor_note"] = "khong phai method"
            skip += 1
            continue

        mod_name = r["module_or_package"]
        cls_name = (r["class_path"] or "").split(".")[-1]
        if not cls_name:
            r["ctor_note"] = "thieu class_path"
            fail += 1
            continue

        try:
            mod = importlib.import_module(mod_name)
            cls = getattr(mod, cls_name)
        except Exception as e:  # noqa: BLE001
            r["ctor_note"] = f"import loi: {type(e).__name__}"
            fail += 1
            continue

        sig, snippet = build_snippet(cls)
        good, detail = verify(mod_name, cls_name, snippet)

        # Lop TRUU TUONG khong dung truc tiep duoc (flask.sansio.app.App la vi du that:
        # thieu thuoc tinh ma lop con dinh nghia). Tim lop con CU THE roi thu lai —
        # dung cach mot nguoi viet test se lam.
        if not good:
            for sub in getattr(cls, "__subclasses__", lambda: [])():
                s2, snip2 = build_snippet(sub)
                if not snip2:
                    continue
                sub_mod = sub.__module__
                g2, d2 = verify(sub_mod, sub.__name__, snip2)
                if g2:
                    sig, snippet, good = s2, snip2, True
                    detail = f"dung lop con cu the {sub_mod}.{sub.__name__} ({d2})"
                    # GHI LAI lop/module CU THE. Thieu hai truong nay o ban truoc khien
                    # prompt tu mau thuan: khoi Target noi 'Declaring class: App' va
                    # 'from flask.sansio.app import App' nhung dong receiver lai la
                    # 'Flask(...)' khong giai thich -> model theo tin hieu da so va dung
                    # App (lop truu tuong) -> AttributeError: App.default_config.
                    # Dung loai loi 'dac ta muc tieu tu mau thuan' ma du an nay dang di sua.
                    r["ctor_class"], r["ctor_module"] = sub.__name__, sub_mod
                    break
        r.setdefault("ctor_class", "")
        r.setdefault("ctor_module", "")
        if good and not r["ctor_class"]:
            r["ctor_class"], r["ctor_module"] = cls_name, mod_name
        r["ctor_signature"] = sig
        r["ctor_snippet"] = snippet if good else ""
        r["ctor_verified"] = "yes" if good else "no"
        r["ctor_note"] = detail
        r["needs_context"] = "yes" if mod_name.split(".")[0] == "flask" else "no"

        ok += good
        fail += (not good)
        if a.verbose or not good:
            mark = "OK " if good else "FAIL"
            print(f"  {mark} {r['func_id']:7s} {cls_name:24s} {snippet[:46]:46s} {detail[:40]}")

    with open(OUT, "w", encoding="utf-8", newline="") as fh:
        w = csv.DictWriter(fh, fieldnames=list(rows[0].keys()))
        w.writeheader()
        w.writerows(rows)

    print(f"\n-> {OUT}")
    print(f"dung duoc & DA CHAY THAT: {ok}   khong dung duoc: {fail}   bo qua: {skip}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
