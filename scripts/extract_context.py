"""
extract_context.py -- RQ4 (exploratory, post-hoc, KHONG thuoc N=120 da dang ky).

Trich "API skeleton" THAT tu source file cua ham muc tieu, de nhet vao prompt
one-shot thay vi chi dua source hàm trich roi -- muc tieu giai quyet dung
nguyen nhan chinh da chan doan trong Results/Discussion:
  - Java: LLM goi nham method/overload khac cung ten (vd CommandLine.getOptionValues
    thay vi CommandLine.Builder.getOptionValues) vi khong thay CAU TRUC class that.
  - Python: LLM nham instance-method thanh module-level function, hoac doan sai
    duong import noi bo, vi khong thay danh sach export/class that cua module.

Khong dung lai bat ky file nao trong N=120 da co (generated_tests/gpt4o/...,
metrics_full.csv, ...). Script sinh test moi (run_experiment_rq4_context.py)
ghi ra thu muc RIENG (generated_tests/gpt4o_ctx/).
"""
from __future__ import annotations
import ast
import javalang


def java_class_skeleton(source_code: str, max_depth: int = 3) -> str:
    """Tra ve danh sach chu ky method public/protected (KHONG private) cua MOI
    class/nested-class trong file, phan cap ro rang -- de LLM biet chinh xac
    method nao thuoc class nao (giai quyet nham CommandLine vs CommandLine.Builder)."""
    try:
        tree = javalang.parse.parse(source_code)
    except (javalang.parser.JavaSyntaxError, javalang.tokenizer.LexerError):
        return ""

    lines = []

    def visit_type(node, qualified_name, depth):
        if depth > max_depth:
            return
        mods = " ".join(sorted(getattr(node, "modifiers", set())))
        kind = "interface" if isinstance(node, javalang.tree.InterfaceDeclaration) else "class"
        lines.append(f"{'  ' * depth}{mods} {kind} {qualified_name} {{".strip())
        for m in getattr(node, "methods", []) or []:
            m_mods = set(getattr(m, "modifiers", set()))
            if "private" in m_mods:
                continue
            params = ", ".join(f"{_type_str(p.type)} {p.name}" for p in (m.parameters or []))
            ret = _type_str(m.return_type) if m.return_type else "void"
            m_mod_str = " ".join(sorted(m_mods)) or "package-private"
            lines.append(f"{'  ' * (depth+1)}{m_mod_str} {ret} {m.name}({params});")
        for c in getattr(node, "constructors", []) or []:
            c_mods = set(getattr(c, "modifiers", set()))
            if "private" in c_mods:
                continue
            params = ", ".join(f"{_type_str(p.type)} {p.name}" for p in (c.parameters or []))
            lines.append(f"{'  ' * (depth+1)}{' '.join(sorted(c_mods)) or 'package-private'} {qualified_name.split('.')[-1]}({params});")
        for inner in getattr(node, "body", []) or []:
            if isinstance(inner, (javalang.tree.ClassDeclaration, javalang.tree.InterfaceDeclaration)):
                visit_type(inner, f"{qualified_name}.{inner.name}", depth + 1)
        lines.append(f"{'  ' * depth}}}")

    for _, node in tree.filter(javalang.tree.ClassDeclaration):
        pass  # placeholder to ensure filter import path is warmed (no-op)

    for type_decl in tree.types:
        if isinstance(type_decl, (javalang.tree.ClassDeclaration, javalang.tree.InterfaceDeclaration)):
            visit_type(type_decl, type_decl.name, 0)

    return "\n".join(lines)


def _type_str(t) -> str:
    if t is None:
        return "void"
    name = getattr(t, "name", str(t))
    dims = "[]" * len(getattr(t, "dimensions", []) or [])
    targs = getattr(t, "arguments", None)
    if targs:
        inner = ", ".join(_type_str(getattr(a, "type", a)) for a in targs if a is not None)
        name = f"{name}<{inner}>" if inner else f"{name}<?>"
    return f"{name}{dims}"


def python_module_skeleton(source_code: str) -> str:
    """Tra ve danh sach top-level function/class (+ method cua class) THAT trong
    module -- de LLM biet chinh xac cai gi la module-level function, cai gi la
    method-cua-class (giai quyet nham update_template_context la method cua Flask
    class chu khong phai ham top-level cua module)."""
    try:
        tree = ast.parse(source_code)
    except SyntaxError:
        return ""

    lines = []
    for node in tree.body:
        if isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef)):
            if node.name.startswith("_"):
                continue
            lines.append(f"def {node.name}({_py_args(node.args)}):  # module-level function")
        elif isinstance(node, ast.ClassDef):
            bases = ", ".join(_py_expr(b) for b in node.bases)
            lines.append(f"class {node.name}({bases}):" if bases else f"class {node.name}:")
            for item in node.body:
                if isinstance(item, (ast.FunctionDef, ast.AsyncFunctionDef)):
                    if item.name.startswith("_") and item.name not in ("__init__",):
                        continue
                    lines.append(f"    def {item.name}({_py_args(item.args)}):  # method of {node.name}")
    return "\n".join(lines)


def _py_args(args: ast.arguments) -> str:
    parts = [a.arg for a in args.args]
    return ", ".join(parts)


def _py_expr(node) -> str:
    try:
        return ast.unparse(node)
    except Exception:
        return "?"
