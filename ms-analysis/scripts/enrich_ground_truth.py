"""Lam giau ground truth: bo sung class/qualname/import de prompt goi DUNG ham muc tieu.

Van de goc (audit 2026-07-17):
  - Python: 26/28 ham INVALID la METHOD bi xe khoi class. Ground truth chi co `func_name`
    tran (vd `raise_routing_exception`) nen prompt khong the noi "day la method cua Flask".
    LLM doan `from flask.app import raise_routing_exception` -> ImportError.
  - Java: `func_name` chi ghi class TRONG CUNG (`Builder::getOptionValues`), thieu class bao
    ngoai + package. LLM goi `CommandLine.getOptionValues` thay vi
    `CommandLine.Builder.getOptionValues` -> wrong-target invocation.

Script doc SOURCE THAT tai pinned commit, xac dinh chinh xac container cua tung ham,
va ghi ra full_ground_truth_v2.csv. KHONG can cao lai repo.

Chay:  python ms-analysis/scripts/enrich_ground_truth.py
"""
from __future__ import annotations

import ast
import csv
import os
import re
import sys

REPO = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
SRC_CSV = os.path.join(REPO, "data", "full_ground_truth.csv")
OUT_CSV = os.path.join(REPO, "data", "full_ground_truth_v2.csv")

NEW_COLS = ["class_path", "qualname", "is_method", "receiver_kind",
            "module_or_package", "visibility", "param_types", "import_hint", "enrich_note"]


def resolve(f: str) -> str:
    """Map duong dan trong CSV (data-research/raw/...) sang ban clone that (data/raw/...)."""
    f = f.replace("\\", "/")
    i = f.find("raw/")
    return os.path.join(REPO, "data", "raw", f[i + 4:]) if i >= 0 else os.path.join(REPO, f)


# ---------------------------------------------------------------- Python
def py_module_path(path: str) -> str:
    """data/raw/flask/src/flask/app.py -> flask.app"""
    p = path.replace("\\", "/")
    for marker in ("/src/", "/raw/"):
        i = p.find(marker)
        if i >= 0:
            p = p[i + len(marker):]
            break
    p = p[:-3] if p.endswith(".py") else p
    parts = [x for x in p.split("/") if x and x != "__init__"]
    # bo prefix ten repo neu trung (requests/requests/utils -> requests.utils)
    if len(parts) > 1 and parts[0] == parts[1]:
        parts = parts[1:]
    return ".".join(parts)


def enrich_python(rec: dict, path: str) -> dict:
    out = dict.fromkeys(NEW_COLS, "")
    # func_name co the la 'Cls::f', 'outer.inner' (closure) hoac 'f'
    name = rec["func_name"].replace("::", ".").split(".")[-1]
    try:
        tree = ast.parse(open(path, encoding="utf-8").read())
    except Exception as e:
        out["enrich_note"] = f"parse-fail: {e.__class__.__name__}"
        return out

    start = int(rec["start_line"] or 0)
    best, chain = None, []

    def walk(node, stack):
        """stack ghi CA class lan ham bao ngoai -> bat duoc closure."""
        nonlocal best, chain
        for child in ast.iter_child_nodes(node):
            if isinstance(child, ast.ClassDef):
                walk(child, stack + [("class", child.name)])
            elif isinstance(child, (ast.FunctionDef, ast.AsyncFunctionDef)):
                if child.name == name:
                    score = 0 if abs(child.lineno - start) <= 2 else 1
                    if best is None or score < best[0]:
                        best, chain = (score, child), list(stack)
                walk(child, stack + [("func", child.name)])
            else:
                walk(child, stack)

    walk(tree, [])
    if best is None:
        out["enrich_note"] = "not-found-in-source"
        return out

    fn = best[1]
    decos = {d.id if isinstance(d, ast.Name) else getattr(d, "attr", "") for d in fn.decorator_list}
    params = [a.arg for a in fn.args.args]
    first = params[0] if params else ""
    classes = [n for kind, n in chain if kind == "class"]
    funcs = [n for kind, n in chain if kind == "func"]
    mod = py_module_path(path)

    out["class_path"] = ".".join(classes)
    out["qualname"] = ".".join([n for _, n in chain] + [name]) if chain else name
    out["module_or_package"] = mod
    out["visibility"] = "private" if name.startswith("_") else "public"
    out["param_types"] = ",".join(p for p in params if p not in ("self", "cls"))

    if funcs:  # closure: dinh nghia ben trong mot ham khac
        out["is_method"] = "no"
        out["receiver_kind"] = "nested-function"
        outer = ".".join(([classes[0]] if classes else []) + [funcs[-1]])
        out["import_hint"] = (f"NOT directly importable — it is a closure inside {outer}(). "
                              f"Reach it by calling {outer}(...) and exercising the branch "
                              f"that invokes {name}.")
        out["enrich_note"] = "closure"
        return out

    out["is_method"] = "yes" if classes else "no"
    out["receiver_kind"] = ("staticmethod" if "staticmethod" in decos else
                            "classmethod" if "classmethod" in decos else
                            "instance" if first == "self" else
                            "class" if first == "cls" else
                            "function" if not classes else "instance")
    if classes:
        cls = classes[0]
        if out["receiver_kind"] in ("staticmethod", "classmethod"):
            out["import_hint"] = f"from {mod} import {cls}  # then call {cls}.{name}(...)"
        else:
            out["import_hint"] = (f"from {mod} import {cls}  # construct an instance first, "
                                  f"then call instance.{name}(...)")
    else:
        out["import_hint"] = f"from {mod} import {name}"
    return out


# ---------------------------------------------------------------- Java
def java_package(tree) -> str:
    return tree.package.name if getattr(tree, "package", None) else ""


def _strip_java_noise(src: str) -> str:
    """Xoa comment + noi dung string/char de dem ngoac nhon khong bi lech."""
    out, i, n = [], 0, len(src)
    while i < n:
        c = src[i]
        if c == "/" and i + 1 < n and src[i + 1] == "/":
            j = src.find("\n", i)
            i = n if j < 0 else j
        elif c == "/" and i + 1 < n and src[i + 1] == "*":
            j = src.find("*/", i + 2)
            block = src[i:(n if j < 0 else j + 2)]
            out.append("\n" * block.count("\n"))  # giu so dong
            i = n if j < 0 else j + 2
        elif c in "\"'":
            q, i = c, i + 1
            while i < n and src[i] != q:
                i += 2 if src[i] == "\\" else 1
            i += 1
            out.append('""')
        else:
            out.append(c)
            i += 1
    return "".join(out)


_TYPE_DECL = re.compile(
    r"\b(?:class|interface|enum|record|@interface)\s+([A-Za-z_$][\w$]*)")


def enrich_java_fallback(rec: dict, path: str) -> dict:
    """Quet theo do sau ngoac nhon — dung khi javalang khong parse duoc
    (annotation tren tham so, record, text block, switch expression...)."""
    out = dict.fromkeys(NEW_COLS, "")
    raw = open(path, encoding="utf-8", errors="replace").read()
    clean = _strip_java_noise(raw)
    lines = clean.split("\n")
    start = int(rec["start_line"] or 0)
    name = rec["func_name"].split("::")[-1]

    m = re.search(r"^\s*package\s+([\w.]+)\s*;", clean, re.M)
    pkg = m.group(1) if m else ""

    depth, stack, pending = 0, [], None
    for ln, text in enumerate(lines, 1):
        if ln > start:
            break
        if pending is None:
            d = _TYPE_DECL.search(text)
            if d:
                pending = d.group(1)
        for ch in text:
            if ch == "{":
                if pending is not None:
                    stack.append((pending, depth))
                    pending = None
                depth += 1
            elif ch == "}":
                depth -= 1
                while stack and stack[-1][1] >= depth:
                    stack.pop()

    chain = [n for n, _ in stack]
    decl = " ".join(lines[max(0, start - 3):start + 2])
    mods = set(re.findall(r"\b(public|private|protected|static|final|abstract)\b", decl))
    ptypes = []
    pm = re.search(re.escape(name) + r"\s*\(([^)]*)\)", decl, re.S)
    if pm and pm.group(1).strip():
        for part in pm.group(1).split(","):
            toks = [t for t in re.split(r"\s+", part.strip()) if t and not t.startswith("@")]
            toks = [t for t in toks if t not in ("final",)]
            if toks:
                t = toks[0].split("<")[0]
                ptypes.append(t + ("..." if "..." in part else ""))

    out["class_path"] = ".".join(chain)
    out["qualname"] = ".".join(([pkg] if pkg else []) + chain + [name])
    out["is_method"] = "yes"
    out["receiver_kind"] = "static" if "static" in mods else "instance"
    out["module_or_package"] = pkg
    out["visibility"] = ("private" if "private" in mods else
                         "protected" if "protected" in mods else
                         "public" if "public" in mods else "package-private")
    out["param_types"] = ",".join(ptypes)
    outer = chain[0] if chain else ""
    sig = f"{name}({', '.join(ptypes)})"
    if len(chain) > 1:
        out["import_hint"] = (f"import {pkg}.{outer};  // TARGET IS NESTED: "
                              f"{'.'.join(chain)}.{sig} — NOT {outer}.{sig}")
        out["enrich_note"] = "nested-class;brace-scan"
    else:
        verb = f"call {outer}.{sig}" if "static" in mods else f"construct {outer}, then instance.{sig}"
        out["import_hint"] = f"import {pkg}.{outer};  // {verb}"
        out["enrich_note"] = "brace-scan"
    return out


def enrich_java(rec: dict, path: str) -> dict:
    out = dict.fromkeys(NEW_COLS, "")
    import javalang
    raw = rec["func_name"]
    name = raw.split("::")[-1]
    try:
        tree = javalang.parse.parse(open(path, encoding="utf-8", errors="replace").read())
    except Exception:
        return enrich_java_fallback(rec, path)   # javalang cu -> quet ngoac nhon

    start = int(rec["start_line"] or 0)
    pkg = java_package(tree)
    found = None

    def visit(node, stack):
        nonlocal found
        for child in getattr(node, "children", []) or []:
            items = child if isinstance(child, (list, tuple, set)) else [child]
            for it in items:
                if isinstance(it, (javalang.tree.ClassDeclaration,
                                   javalang.tree.InterfaceDeclaration,
                                   javalang.tree.EnumDeclaration)):
                    visit(it, stack + [it.name])
                elif isinstance(it, (javalang.tree.MethodDeclaration,
                                     javalang.tree.ConstructorDeclaration)):
                    if it.name == name and it.position:
                        d = abs(it.position.line - start)
                        if found is None or d < found[0]:
                            found = (d, it, list(stack))
                elif hasattr(it, "children"):
                    visit(it, stack)

    visit(tree, [])
    if found is None:
        return enrich_java_fallback(rec, path)

    _, m, chain = found
    mods = set(getattr(m, "modifiers", []) or [])
    ptypes = []
    for p in getattr(m, "parameters", []) or []:
        t = getattr(p.type, "name", "?")
        if getattr(p, "varargs", False):
            t += "..."
        ptypes.append(t)

    out["class_path"] = ".".join(chain)
    out["qualname"] = ".".join(([pkg] if pkg else []) + chain + [name])
    out["is_method"] = "yes"
    out["receiver_kind"] = "static" if "static" in mods else "instance"
    out["module_or_package"] = pkg
    out["visibility"] = ("private" if "private" in mods else
                         "protected" if "protected" in mods else
                         "public" if "public" in mods else "package-private")
    out["param_types"] = ",".join(ptypes)

    outer = chain[0] if chain else ""
    nested = len(chain) > 1
    sig = f"{name}({', '.join(ptypes)})"
    if nested:
        out["import_hint"] = (f"import {pkg}.{outer};  // TARGET IS NESTED: "
                              f"{'.'.join(chain)}.{sig} — NOT {outer}.{sig}")
        out["enrich_note"] = "nested-class"
    elif out["receiver_kind"] == "static":
        out["import_hint"] = f"import {pkg}.{outer};  // call {outer}.{sig}"
    else:
        out["import_hint"] = f"import {pkg}.{outer};  // construct {outer}, then instance.{sig}"
    return out


def main() -> int:
    rows = list(csv.DictReader(open(SRC_CSV, encoding="utf-8")))
    fields = list(rows[0].keys()) + NEW_COLS
    stats = {"python-method": 0, "python-func": 0, "java-nested": 0, "java-flat": 0, "fail": 0}

    for r in rows:
        path = resolve(r["file"])
        if not os.path.exists(path):
            r.update(dict.fromkeys(NEW_COLS, ""))
            r["enrich_note"] = "source-missing"
            stats["fail"] += 1
            continue
        add = enrich_python(r, path) if r["language"] == "python" else enrich_java(r, path)
        r.update(add)
        if add.get("enrich_note", "").startswith(("parse-fail", "not-found")):
            stats["fail"] += 1
        elif r["language"] == "python":
            stats["python-method" if add["is_method"] == "yes" else "python-func"] += 1
        else:
            stats["java-nested" if add.get("enrich_note") == "nested-class" else "java-flat"] += 1

    with open(OUT_CSV, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fields)
        w.writeheader()
        w.writerows(rows)

    print(f"ghi {OUT_CSV}  ({len(rows)} dong)")
    for k, v in stats.items():
        print(f"   {k:16s} {v}")
    return 1 if stats["fail"] else 0


if __name__ == "__main__":
    sys.exit(main())
