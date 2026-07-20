"""Vong sua loi v3 (round 3): dua BANG CHUNG DO DUOC, khong de model tu doan.

Vi sao can vong nay — bang chung tu 12 file con chet sau v3+repair(2 vong):
  Vong repair cu da dua LOI THAT cho model, nhung loi that chi noi "cai gi HONG",
  KHONG noi "cai dung nam o DAU". Vi du:
    - ImportError: cannot import name 'RequestRedirect' from 'werkzeug.exceptions'
      -> model biet no sai, nhung khong biet ten do nam o werkzeug.routing.
    - TypeError: Can't instantiate abstract class Parameter
      -> model khong biet lop cu the nao thay the duoc (click.Option).
    - TypeError: 'ScriptInfo' object is not iterable
      -> model khong biet flask.cli.run_command KHONG phai ham thuong ma la
         doi tuong click.Command (goi truc tiep = chay CLI).
  Module nay TRA LOI dung nhung cau do bang cach NOI SOI moi truong that
  (importlib + inspect + quet cay nguon), roi nhet ket qua vao prompt.

Moi dong bang chung deu do do duoc, khong suy dien.
"""
from __future__ import annotations

import ast
import importlib
import inspect
import os
import pkgutil
import re

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
SRC_ROOTS = [
    os.path.join(REPO, "data", "raw", "flask", "src"),
    os.path.join(REPO, "data", "raw", "requests", "src"),
]
# Cac goi duoc phep quet khi truy tim mot ten symbol.
SEARCH_PKGS = ["flask", "requests", "werkzeug", "click", "jinja2", "urllib3", "itsdangerous"]


# ------------------------------------------------------------------ tim symbol
def _iter_modules(pkg_name: str):
    """Sinh ten module con cua mot goi. Bo qua module import loi."""
    try:
        pkg = importlib.import_module(pkg_name)
    except Exception:
        return
    yield pkg_name
    for _, name, _ in pkgutil.walk_packages(getattr(pkg, "__path__", []), pkg_name + "."):
        # `__main__` cua flask/werkzeug CHAY CLI ngay khi import -> phai bo qua.
        # (Da gap that: quet goi flask lam bung ra usage text cua `flask` CLI.)
        if name.rsplit(".", 1)[-1].startswith("__main__"):
            continue
        yield name


def locate_symbol(name: str, hint_pkgs: list[str] | None = None) -> list[str]:
    """Tra ve danh sach module THAT SU export `name` (da kiem chung bang getattr).

    Xep hang: module DINH NGHIA ra doi tuong (obj.__module__) len dau, roi moi den
    cac module chi RE-EXPORT no. Neu chi xep theo do dai ten thi `RequestRedirect`
    se ra `flask.app` (noi re-export) thay vi `werkzeug.routing` (noi dinh nghia) —
    dung ky thuat nhung khien test phu thuoc vao chi tiet noi bo cua flask.
    """
    found = []
    for pkg in (hint_pkgs or SEARCH_PKGS):
        for mod_name in _iter_modules(pkg):
            try:
                mod = importlib.import_module(mod_name)
            except Exception:
                continue
            if not hasattr(mod, name):
                continue
            obj = getattr(mod, name)
            # 0 = day la noi dinh nghia; 1 = chi re-export
            home = getattr(obj, "__module__", None)
            rank = 0 if home and (home == mod_name or home.startswith(mod_name + ".")) else 1
            found.append((rank, mod_name.count("."), len(mod_name), mod_name))
    found.sort()
    seen, out = set(), []
    for _, _, _, m in found:
        if m not in seen:
            seen.add(m)
            out.append(m)
    return out


def alias_origin(name: str) -> list[str]:
    """Tim cac cho `name` chi la BI DANH cuc bo: `from X import Y as name`.

    Day la bay da bat duoc that: requests/models.py co dong
        from .exceptions import SSLError as RequestsSSLError
    khien model tuong `RequestsSSLError` la ten cong khai cua requests.exceptions.
    """
    hits = []
    for root in SRC_ROOTS:
        for dirpath, _, files in os.walk(root):
            for fn in files:
                if not fn.endswith(".py"):
                    continue
                p = os.path.join(dirpath, fn)
                try:
                    tree = ast.parse(open(p, encoding="utf-8", errors="replace").read())
                except Exception:
                    continue
                for node in ast.walk(tree):
                    if isinstance(node, ast.ImportFrom):
                        for a in node.names:
                            if a.asname == name:
                                rel = os.path.relpath(p, root).replace(os.sep, "/")
                                # giu nguyen dau cham cua import tuong doi
                                src_mod = "." * (node.level or 0) + (node.module or "")
                                # module tuyet doi de goi y import dung
                                abs_mod = (os.path.dirname(rel).replace("/", ".") + "."
                                           + (node.module or "")) if node.level else (node.module or "")
                                hits.append(
                                    f"{rel}: `from {src_mod} import {a.name} as {name}`\n"
                                    f"      -> ten CONG KHAI dung la `{a.name}`, "
                                    f"import bang `from {abs_mod} import {a.name}`")
    return hits


# ------------------------------------------------------------------ noi soi API
def describe(dotted: str) -> str:
    """Mo ta doi tuong that: kieu, chu ky, truu tuong hay khong, lop con cu the."""
    mod_name, _, attr = dotted.rpartition(".")
    try:
        obj = getattr(importlib.import_module(mod_name), attr)
    except Exception as e:
        return f"{dotted}: KHONG truy cap duoc ({type(e).__name__}: {e})"

    out = [f"{dotted}", f"  runtime type : {type(obj).__module__}.{type(obj).__name__}"]

    if inspect.isclass(obj):
        abstract = sorted(getattr(obj, "__abstractmethods__", []) or [])
        if abstract:
            out.append(f"  ABSTRACT — khong khoi tao truc tiep duoc. Abstract methods: {abstract}")
            subs = [c for c in obj.__subclasses__() if not getattr(c, "__abstractmethods__", None)]
            if subs:
                out.append("  Lop con CU THE dung duoc: "
                           + ", ".join(f"{c.__module__}.{c.__name__}" for c in subs[:8]))
        try:
            out.append(f"  __init__{inspect.signature(obj.__init__)}")
        except Exception:
            pass
    else:
        # doi tuong khong phai class: vd click.Command — goi truc tiep se chay CLI
        try:
            out.append(f"  signature    : {attr}{inspect.signature(obj)}")
        except Exception:
            pass
        cb = getattr(obj, "callback", None)
        if cb is not None and callable(cb):
            try:
                out.append(f"  .callback    : ham Python that ben trong, chu ky "
                           f"{cb.__name__}{inspect.signature(cb)}")
            except Exception:
                pass
            out.append("  CANH BAO: day KHONG phai ham Python thuong. Goi truc tiep "
                       "obj(...) se kich hoat toan bo CLI (click.BaseCommand.main), "
                       "coi doi so dau la danh sach tham so dong lenh. Muon goi than ham "
                       "thi dung obj.callback(...), muon chay nhu CLI thi dung "
                       "click.testing.CliRunner().invoke(obj, [...]).")
    return "\n".join(out)


# ------------------------------------------------------------------ tong hop
_RX_IMPORT = re.compile(r"cannot import name '([^']+)' from '([^']+)'")
_RX_ABSTRACT = re.compile(r"Can't instantiate abstract class (\w+)")
_RX_KWARG = re.compile(r"(\w+)\.__init__\(\) got an unexpected keyword argument '([^']+)'")
_RX_NOATTR = re.compile(r"'([\w.]+)' object has no attribute '([^']+)'")


def build(err: str, rec: dict) -> str:
    """Tao khoi bang chung tu thong bao loi THAT + ban ghi ground truth."""
    ev: list[str] = []

    for sym, wrong_mod in set(_RX_IMPORT.findall(err)):
        where = locate_symbol(sym)
        alias = alias_origin(sym)
        ev.append(f"### Ten `{sym}` KHONG co trong `{wrong_mod}`. Da quet moi truong that:")
        if alias:
            # Bi danh cuc bo: `where` se tro toi chinh file nguon dinh nghia bi danh do,
            # import theo huong ay se dinh vao chi tiet noi bo. Phai uu tien ten cong khai.
            ev.append("  Day la BI DANH CUC BO trong file nguon, KHONG phai ten cong khai. "
                      "Model da doc than ham va tuong nham day la ten import duoc:")
            ev += [f"    {h}" for h in alias[:4]]
            ev.append("  => KHONG import bi danh. Dung ten cong khai o dong tren.")
        elif where:
            ev.append("  Module THAT SU export ten nay (noi dinh nghia truoc): "
                      + ", ".join(where[:6]))
            ev.append(f"  => dung: `from {where[0]} import {sym}`")
        else:
            ev.append(f"  KHONG module nao trong {SEARCH_PKGS} export ten `{sym}`.")

    for cls in set(_RX_ABSTRACT.findall(err)):
        for pkg in SEARCH_PKGS:
            hits = locate_symbol(cls, [pkg])
            if hits:
                ev.append("### " + describe(f"{hits[0]}.{cls}"))
                break

    for cls, kw in set(_RX_KWARG.findall(err)):
        for pkg in SEARCH_PKGS:
            hits = locate_symbol(cls, [pkg])
            if hits:
                ev.append(f"### `{cls}` KHONG nhan tham so tu khoa '{kw}'. Chu ky that:")
                ev.append("  " + describe(f"{hits[0]}.{cls}"))
                break

    # Luon mo ta chinh doi tuong dich — bat truong hop 'ham' thuc ra la click.Command.
    qual = (rec.get("qualname") or "").strip()
    mod = (rec.get("module_or_package") or "").strip()
    fname = (rec.get("func_name") or "").split("::")[-1].strip()
    if mod and fname and rec.get("is_method") != "yes":
        d = describe(f"{mod}.{fname}")
        if "KHONG truy cap duoc" not in d:
            ev.append("### Doi tuong dich trong moi truong that:\n" + d)

    # Vi du THAT tu bo test cua chinh du an — bat cac quy uoc ma chu ky ham
    # khong the hien (context can thiet, cach invoke, fixture phai dung).
    ex = real_examples(fname)
    if ex:
        ev.append("### Cach chinh bo test cua du an goi API nay (code that, dang chay duoc):\n"
                  + "\n\n".join(f"```python\n{e}\n```" for e in ex))

    if not ev:
        return ""
    return ("\n### Bang chung do duoc tu moi truong that (KHONG phai suy doan) ###\n"
            + "\n".join(ev) + "\n")


if __name__ == "__main__":
    import sys
    print(build(sys.stdin.read(), {"qualname": "", "module_or_package": "", "func_name": ""}))


# ------------------------------------------------- vi du that tu test cua du an
TEST_ROOTS = [
    os.path.join(REPO, "data", "raw", "flask", "tests"),
    os.path.join(REPO, "data", "raw", "requests", "tests"),
]


def real_examples(func_name: str, max_ex: int = 2, max_lines: int = 30) -> list[str]:
    """Trich ham test THAT trong bo test cua chinh du an co goi `func_name`.

    Day la bang chung manh nhat va van hoan toan do duoc: khong phai model doan
    cach dung API, ma la cach cac tac gia thu vien THUC SU goi no trong test cua ho.
    Bat duoc nhung quy uoc ma chu ky ham khong the hien (vd: `run_command` phai goi
    qua CliRunner, `get_flashed_messages` phai o trong request context).
    """
    if not func_name or not re.fullmatch(r"[A-Za-z_]\w*", func_name):
        return []
    # Khong doi phai co dau `(`: nhieu API duoc dung gian tiep (vd `run_command`
    # chi xuat hien qua CliRunner().invoke(run_command, ...) hoac ten lenh "run").
    rx = re.compile(rf"\b{re.escape(func_name)}\b")
    out = []
    for root in TEST_ROOTS:
        for dirpath, _, files in os.walk(root):
            for fn in sorted(files):
                if not fn.startswith("test_") or not fn.endswith(".py"):
                    continue
                p = os.path.join(dirpath, fn)
                try:
                    src = open(p, encoding="utf-8", errors="replace").read()
                    tree = ast.parse(src)
                except Exception:
                    continue
                lines = src.splitlines()
                for node in ast.walk(tree):
                    if not isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef)):
                        continue
                    if not node.name.startswith("test"):
                        continue
                    seg = "\n".join(lines[node.lineno - 1:node.end_lineno])
                    if rx.search(seg) and len(seg.splitlines()) <= max_lines:
                        out.append(f"# tu {fn}\n{seg}")
                        if len(out) >= max_ex:
                            return out
    return out
