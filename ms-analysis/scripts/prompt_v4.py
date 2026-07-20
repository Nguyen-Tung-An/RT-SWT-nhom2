"""Prompt v4 — them CACH TRUY CAP cho Java, va constructor cua lop chu.

Bang chung dan toi v4 (do that tren 60 ham Java, xem java_compile_check.csv):
    public          16 OK / 19 FAIL   46%
    protected        0 OK /  4 FAIL    0%
    package-private  1 OK /  3 FAIL   25%
    private          0 OK / 17 FAIL    0%   <- that bai tuyet doi
  21/60 (35%) muc tieu khong public. Phan loai loi javac: 22/41 ca that bai la RAO CAN
  TRUY CAP (private/protected/final).

v1..v3 khong he noi cho model biet phai lam gi voi thanh phan khong public. Nhung dieu do
KHONG co nghia la khong kiem thu duoc — da chung minh chay that trong
ms-analysis/private-access-demo/ReflMain.java:
    getDeclaredMethod + setAccessible(true) -> invoke() -> ham private chay, 5 nhanh phan
    biet duoc. Buoc bat buoc kem theo: dung trang thai receiver bang Field.setAccessible,
    vi khong co no thi invoke() nem NPE.

v4 phat ra cong thuc truy cap DUNG THEO TUNG MUC:
    public                    -> goi truc tiep
    protected/package-private -> test cung package (khong can reflection)
    private                   -> reflection, kem mau code day du
Va chu ky constructor cua lop chu cho receiver kieu instance (tuong duong dieu v3 da lam
cho Python, von xoa sach loi __init__ 11 -> 0).
"""
from __future__ import annotations

import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import prompt_v3  # noqa: E402

REPO = prompt_v3.REPO
load_source = prompt_v3.load_source


def java_source_path(rec: dict) -> str:
    f = rec["file"].replace("\\", "/")
    i = f.find("raw/")
    return os.path.join(REPO, "data", "raw", f[i + 4:]) if i >= 0 else os.path.join(REPO, f)


def java_constructors(rec: dict, limit: int = 3) -> list[str]:
    """Chu ky constructor cua lop chu, doc thang tu ma nguon."""
    p = java_source_path(rec)
    cls = (rec.get("class_path") or "").split(".")[-1]
    if not cls or not os.path.exists(p):
        return []
    try:
        src = open(p, encoding="utf-8", errors="replace").read()
    except OSError:
        return []
    out = []
    for m in re.finditer(r"^\s*(public|protected|private)?\s*" + re.escape(cls)
                         + r"\s*\(([^)]*)\)\s*(?:throws [\w.,\s]+)?\{", src, re.M):
        vis = m.group(1) or "package-private"
        out.append(f"{vis} {cls}({m.group(2).strip()})")
        if len(out) >= limit:
            break
    return out


def access_recipe(rec: dict) -> str:
    """Cong thuc truy cap theo dung muc hien dien cua muc tieu."""
    vis = (rec.get("visibility") or "public").strip()
    cls = (rec.get("class_path") or "").split(".")[-1]
    name = rec["func_name"].split("::")[-1]
    params = [p.strip() for p in (rec.get("param_types") or "").split(",") if p.strip()]
    is_static = (rec.get("receiver_kind") or "") == "static"
    ptypes = ", ".join(f"{p}.class" for p in params) if params else ""
    args = ", ".join(f"/* {p} */" for p in params)

    if vis == "public":
        return ("Access: the target is public - call it directly.")

    if vis in ("protected", "package-private"):
        return (
            f"Access: the target is {vis}. It is NOT visible from an arbitrary package, but\n"
            f"your test class already declares the SAME package as {cls}, so you may call it\n"
            f"directly - no reflection needed. Do not change the package declaration.")

    # private
    recv = f"{cls}.class" if is_static else f"instance"
    invoke_target = "null" if is_static else "instance"
    lines = [
        "Access: the target is PRIVATE. A normal call will not compile. Use reflection -",
        "this is the standard approach and is what EvoSuite does. Template:",
        "",
        "    java.lang.reflect.Method m = " + cls + ".class.getDeclaredMethod(",
        f"        \"{name}\"" + (", " + ptypes if ptypes else "") + ");",
        "    m.setAccessible(true);",
        f"    Object result = m.invoke({invoke_target}" + (", " + args if args else "") + ");",
        "",
        "Assert on `result` (cast it to the declared return type).",
    ]
    if not is_static:
        lines += [
            "",
            "IMPORTANT: the target reads instance state. Constructing the object is not always",
            "enough - private fields it depends on may still be null and invoke() will then",
            "throw InvocationTargetException wrapping a NullPointerException. Set those fields",
            "the same way:",
            "",
            "    java.lang.reflect.Field f = " + cls + ".class.getDeclaredField(\"<field>\");",
            "    f.setAccessible(true);",
            "    f.set(instance, /* a valid value */);",
            "",
            "Read the target's body below to see which fields it touches.",
        ]
    lines += [
        "",
        "Unwrap InvocationTargetException when asserting on exceptions:",
        "    assertThrows(SomeException.class, () -> { try { m.invoke(...); }",
        "        catch (java.lang.reflect.InvocationTargetException e) { throw e.getCause(); } });",
    ]
    return "\n".join(lines)


def target_spec(rec: dict) -> str:
    base = prompt_v3.target_spec(rec)
    if rec["language"] != "java":
        return base
    extra = ["", access_recipe(rec)]
    ctors = java_constructors(rec)
    if ctors and (rec.get("receiver_kind") or "") != "static":
        extra += ["", "Constructors of the declaring class:"]
        extra += [f"    {c}" for c in ctors]
    return base + "\n" + "\n".join(extra)


def build_prompt(rec: dict) -> str:
    if rec["language"] != "java":
        return prompt_v3.build_prompt(rec)
    src = load_source(rec)
    name = rec["func_name"].split("::")[-1]
    return (
        "You are an expert software tester.\n"
        "Generate JUnit 5 tests that maximise branch coverage AND mutation score for exactly "
        "one target method.\n"
        "Output only executable code, no explanation.\n\n"
        "### Target ###\n"
        f"{target_spec(rec)}\n\n"
        "### Rules ###\n"
        "1. Test the real method in the real project. Do NOT re-implement, copy, mock or "
        "stub the target itself.\n"
        "2. Every test must ultimately invoke the exact target above, using the access "
        "recipe given.\n"
        "3. Assert on the RETURNED VALUE or observable state, not merely that the call does "
        "not throw.\n"
        "4. Import every type you use with its fully-qualified package. Do not rely on "
        "wildcard imports.\n"
        "5. Only reference names you are certain exist in this project version.\n"
        "6. Cover the branches inside the target, including boundary and error paths.\n\n"
        "### Source of the target ###\n"
        f"```java\n{src}\n```\n\n"
        f"Now write the JUnit 5 test class for `{name}`.\n"
    )


def main() -> int:
    import argparse
    import csv
    ap = argparse.ArgumentParser()
    ap.add_argument("--demo", default="", help="in prompt cho 1 func_id")
    a = ap.parse_args()
    rows = {r["func_id"]: r for r in csv.DictReader(
        open(os.path.join(REPO, "data", "full_ground_truth_v3.csv"), encoding="utf-8-sig"))}
    if a.demo:
        print(build_prompt(rows[a.demo]).split("### Rules")[0])
    return 0


if __name__ == "__main__":
    sys.exit(main())
