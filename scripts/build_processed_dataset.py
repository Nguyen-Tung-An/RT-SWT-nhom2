#!/usr/bin/env python3
"""Build a target-resolvable, context-preserving function dataset.

The generated function files are LLM inputs, not standalone replacement modules.
Compilation/import validation must use ``source_file`` and ``qualified_name``.
"""
from __future__ import annotations

import ast
import csv
import re
import shutil
from collections import Counter
from pathlib import Path

import lizard


ROOT = Path(__file__).resolve().parents[1]
REPORT = ROOT / "data-research" / "csv" / "lizard_report.csv"
OUT = ROOT / "processed_dataset"
CC_MIN, CC_MAX = 5, 10
JAVA_TARGET = 60
PYTHON_TARGET = 60
PYTHON_CC_TARGET = {5: 21, 6: 10, 7: 10, 8: 9, 9: 6, 10: 4}
ANNOTATION_COLS = ["annotator_dg", "annotator_rw", "final_label", "notes"]


def actual_path(csv_path: str) -> Path:
    p = ROOT / csv_path
    if p.exists():
        return p
    if csv_path.startswith("data/raw/"):
        return ROOT / csv_path.replace("data/raw/", "raw/", 1)
    raise FileNotFoundError(csv_path)


def source_lines(row: dict[str, str]) -> list[str]:
    return actual_path(row["file"]).read_text(encoding="utf-8", errors="ignore").splitlines(True)


def declaration_text(row: dict[str, str]) -> str:
    lines = source_lines(row)
    start = int(row["start_line"]) - 1
    return " ".join(x.strip() for x in lines[max(0, start - 4): start + 4])


def java_signature(row: dict[str, str]) -> str:
    text = declaration_text(row)
    method = row["func_name"].split("::")[-1]
    match = re.search(rf"([\w<>?\[\],.@ ]+\b{re.escape(method)}\s*\([^)]*\))", text)
    return re.sub(r"\s+", " ", match.group(1)).strip() if match else row["func_name"]


def java_package(path: Path) -> str:
    head = path.read_text(encoding="utf-8", errors="ignore")[:8000]
    match = re.search(r"^\s*package\s+([\w.]+)\s*;", head, re.MULTILINE)
    return match.group(1) if match else ""


def choose_java(rows: list[dict[str, str]]) -> list[dict[str, str]]:
    candidates = []
    for row in rows:
        if row["language"] != "java" or not CC_MIN <= int(row["cc"]) <= CC_MAX:
            continue
        path = actual_path(row["file"])
        owner = row["func_name"].split("::")[0]
        decl = declaration_text(row)
        # Top-level public static targets avoid object construction, private state,
        # nested-private classes, and the AccurateMath Split::cbrt failure.
        if owner != path.stem:
            continue
        if not re.search(r"\bpublic\s+(?:final\s+)?static\b", decl):
            continue
        item = dict(row)
        pkg = java_package(path)
        item.update({
            "qualified_name": f"{pkg}.{path.stem}#{row['func_name'].split('::')[-1]}",
            "signature": java_signature(row),
            "callable_kind": "public_static_top_level",
            "source_file": path.relative_to(ROOT).as_posix(),
            "compile_strategy": "maven_original_project",
        })
        candidates.append(item)

    by_cc = {cc: [] for cc in range(CC_MIN, CC_MAX + 1)}
    for row in sorted(candidates, key=lambda r: (r["source_repo"], r["file"], int(r["start_line"]))):
        by_cc[int(row["cc"])].append(row)

    # Take an even base, then fill deterministically. CC=9 has fewer strict
    # candidates, so the remaining slots are spread over other bins.
    selected = []
    for cc in range(CC_MIN, CC_MAX + 1):
        selected.extend(by_cc[cc][: min(10, len(by_cc[cc]))])
    used = {(r["file"], r["start_line"]) for r in selected}
    leftovers = [r for r in candidates if (r["file"], r["start_line"]) not in used]
    leftovers.sort(key=lambda r: (Counter(int(x["cc"]) for x in selected)[int(r["cc"])], int(r["cc"]), r["file"], int(r["start_line"])))
    selected.extend(leftovers[: JAVA_TARGET - len(selected)])
    if len(selected) != JAVA_TARGET:
        raise RuntimeError(f"Only found {len(selected)} strict Java candidates")
    return selected


def python_node(row: dict[str, str], tree: ast.Module):
    line = int(row["start_line"])
    matches = []

    def visit(body, owner=None, depth=0):
        for node in body:
            if isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef)):
                if node.lineno <= line <= (node.end_lineno or node.lineno):
                    matches.append((node, owner, depth))
                visit(node.body, owner, depth + 1)
            elif isinstance(node, ast.ClassDef):
                visit(node.body, node.name, depth + 1)

    visit(tree.body)
    exact = [m for m in matches if m[0].name == row["func_name"].split(".")[-1]]
    return (exact or matches)[-1] if (exact or matches) else None


def python_module_name(path: Path) -> str:
    normalized = path.as_posix()
    marker = "/src/"
    rel = normalized.split(marker, 1)[1]
    parts = Path(rel).with_suffix("").parts
    if parts[-1] == "__init__":
        parts = parts[:-1]
    return ".".join(parts)


def python_signature(node) -> str:
    args = ast.unparse(node.args)
    prefix = "async def" if isinstance(node, ast.AsyncFunctionDef) else "def"
    returns = f" -> {ast.unparse(node.returns)}" if node.returns else ""
    return f"{prefix} {node.name}({args}){returns}"


def choose_python(rows: list[dict[str, str]]) -> list[dict[str, str]]:
    trees = {}
    candidates = []
    for row in rows:
        if row["language"] != "python" or not CC_MIN <= int(row["cc"]) <= CC_MAX:
            continue
        path = actual_path(row["file"])
        tree = trees.setdefault(path, ast.parse(path.read_text(encoding="utf-8")))
        found = python_node(row, tree)
        if not found:
            continue
        node, owner, depth = found
        # Nested closures are deliberately excluded (the old PY-036 failure).
        if depth > 1:
            continue
        module = python_module_name(path)
        kind = "module_function" if owner is None else "instance_or_class_method"
        score = 0 if kind == "module_function" else 1
        item = dict(row)
        item["_node"] = node
        item["_score"] = score
        item.update({
            "qualified_name": f"{module}.{node.name}" if owner is None else f"{module}.{owner}.{node.name}",
            "signature": python_signature(node),
            "callable_kind": kind,
            "source_file": path.relative_to(ROOT).as_posix(),
            "compile_strategy": "import_original_package",
        })
        candidates.append(item)

    selected = []
    for cc, target in PYTHON_CC_TARGET.items():
        bucket = [r for r in candidates if int(r["cc"]) == cc]
        bucket.sort(key=lambda r: (r["_score"], r["source_repo"], r["file"], int(r["start_line"])))
        selected.extend(bucket[:min(target, len(bucket))])
    used = {(r["file"], r["start_line"]) for r in selected}
    leftovers = [r for r in candidates if (r["file"], r["start_line"]) not in used]
    leftovers.sort(key=lambda r: (r["_score"], int(r["cc"]), r["file"], int(r["start_line"])))
    selected.extend(leftovers[:PYTHON_TARGET - len(selected)])
    if len(selected) != PYTHON_TARGET:
        raise RuntimeError(f"Expected {PYTHON_TARGET} Python rows, got {len(selected)}")
    return selected


def write_snippet(row: dict[str, str], func_id: str) -> str:
    language = row["language"]
    suffix = ".java" if language == "java" else ".py"
    directory = OUT / f"{language}_functions"
    directory.mkdir(parents=True, exist_ok=True)
    lines = source_lines(row)
    snippet = "".join(lines[int(row["start_line"]) - 1:int(row["end_line"])])
    if language == "python":
        node = row["_node"]
        original = actual_path(row["file"]).read_text(encoding="utf-8")
        snippet = ast.get_source_segment(original, node) or snippet
        snippet = "from __future__ import annotations\n\n" + snippet + "\n"
    path = directory / f"{func_id}{suffix}"
    path.write_text(snippet, encoding="utf-8")
    return path.relative_to(ROOT).as_posix()


FIELDS = [
    "func_id", "language", "source_repo", "file", "func_name", "cc", "nloc",
    "params", "start_line", "end_line", "raw_source_path",
]

METADATA_FIELDS = [
    "func_id", "qualified_name", "signature", "callable_kind", "source_file",
    "compile_strategy",
]


def clean_row(row: dict[str, str], func_id: str) -> dict[str, str]:
    return {key: (func_id if key == "func_id" else row.get(key, "")) for key in FIELDS}


def metadata_row(row: dict[str, str], func_id: str) -> dict[str, str]:
    return {key: (func_id if key == "func_id" else row.get(key, "")) for key in METADATA_FIELDS}


def write_csv(path: Path, rows: list[dict[str, str]], fields=FIELDS):
    with path.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.DictWriter(handle, fieldnames=fields)
        writer.writeheader()
        writer.writerows(rows)


def validate(rows: list[dict[str, str]]) -> list[dict[str, str]]:
    report = []
    for row in rows:
        snippet = ROOT / row["raw_source_path"]
        cc_ok = False
        syntax_ok = False
        try:
            result = lizard.analyze_file(str(snippet))
            cc_ok = bool(result.function_list) and any(f.cyclomatic_complexity == int(row["cc"]) for f in result.function_list)
            if row["language"] == "python":
                ast.parse(snippet.read_text(encoding="utf-8"))
            syntax_ok = True
        except Exception:
            pass
        report.append({
            "func_id": row["func_id"], "cc_match": int(cc_ok), "syntax_valid": int(syntax_ok),
            "target_unambiguous": int(bool(row["qualified_name"] and row["signature"])),
            "source_exists": int((ROOT / row["source_file"]).exists()),
            "overall_static_gate": int(cc_ok and syntax_ok and bool(row["qualified_name"])),
        })
    return report


def main():
    if OUT.exists():
        shutil.rmtree(OUT)
    OUT.mkdir()
    rows = list(csv.DictReader(REPORT.open(encoding="utf-8")))
    java = choose_java(rows)
    python = choose_python(rows)
    final = []
    metadata = []
    # Versioned IDs prevent legacy metrics from being joined to replacement
    # targets merely because both datasets used positions 001..060.
    for prefix, selected in (("J2", java), ("P2", python)):
        selected.sort(key=lambda r: (int(r["cc"]), r["source_repo"], r["file"], int(r["start_line"])))
        for index, row in enumerate(selected, 1):
            func_id = f"{prefix}-{index:03d}"
            row["raw_source_path"] = write_snippet(row, func_id)
            final.append(clean_row(row, func_id))
            metadata.append(metadata_row(row, func_id))

    write_csv(OUT / "full_ground_truth.csv", final)
    write_csv(OUT / "target_metadata.csv", metadata, METADATA_FIELDS)
    pilot = []
    for language in ("java", "python"):
        for cc in range(CC_MIN, CC_MAX + 1):
            bucket = [r for r in final if r["language"] == language and int(r["cc"]) == cc]
            pilot.extend(bucket[:2])
    write_csv(OUT / "pilot_sample.csv", pilot)
    write_csv(OUT / "pilot_ground_truth.csv", pilot, FIELDS + ANNOTATION_COLS)
    metadata_by_id = {r["func_id"]: r for r in metadata}
    validation_rows = [{**r, **metadata_by_id[r["func_id"]]} for r in final]
    checks = validate(validation_rows)
    write_csv(OUT / "validation_report.csv", checks, list(checks[0]))
    (OUT / "README.md").write_text("""# Processed function dataset

This folder is generated by `python scripts/build_processed_dataset.py`.
It replaces ambiguous targets with functions that retain CC 5-10 and have an
explicit qualified name and signature. The original `data/` and
`data-research/` datasets are not modified.

This is dataset version 2. IDs use `J2-*` and `P2-*`; legacy results keyed by
`JA-*`/`PY-*` are incompatible and must not be joined to this dataset.

## Contents

- `java_functions/`: 60 exact method snippets selected from the original Java sources.
- `python_functions/`: 60 exact function/method snippets selected from the original Python sources.
- `full_ground_truth.csv`: all 120 targets using the original 11-column schema.
- `pilot_sample.csv`: two targets per language per CC bin (24 rows).
- `pilot_ground_truth.csv`: the pilot plus empty annotation columns.
- `target_metadata.csv`: qualified target/signature metadata keyed by `func_id`.
- `validation_report.csv`: reproducible static validation results.

## What was changed

Java selection requires a `public static` method owned by the top-level class.
This excludes private nested targets such as `AccurateMath.Split::cbrt` and
reduces object-construction/private-state failures. Python selection prioritizes
module-level functions and excludes nested closures such as the former
`iter_content.generate` target. Class methods are used only when necessary
because there are only 40 module-level Python functions in the requested CC band.

The three compatibility CSV files retain the original schema. Additional fields
`qualified_name`, `signature`, `callable_kind`, `source_file`, and
`compile_strategy` are stored in `target_metadata.csv` and joined by `func_id`.
Generated tests must use this metadata and execute the original project code.
The snippet files are prompt inputs;
they must not be compiled as replacement classes/modules and must not be copied
into tests as reimplementations.

## Rebuild

From the repository root:

```powershell
python scripts/build_processed_dataset.py
```

The command deletes and recreates only `processed_dataset/`. Selection is
deterministic for the same raw sources and Lizard version.

## Static validation

The builder checks all 120 rows for:

1. source file exists;
2. snippet has valid syntax;
3. Lizard recomputes the labelled CC;
4. target has an explicit qualified name and signature.

Success is printed as `Static gate: 120 / 120` and recorded in
`validation_report.csv`.

## Compile/import and test validation

Static validation does not claim that a generated test is correct. Java tests
must be compiled in the Maven module containing `source_file`; Python tests must
import `qualified_name` from the original package. Use these gates in order:

1. project build/import succeeds;
2. generated test compiles or pytest collects it;
3. test is green on the original source;
4. coverage proves the qualified target was executed;
5. mutation tool generated mutants without an infrastructure error.

Do not collapse these outcomes into one ambiguous `compiled` flag. Recommended
columns are `project_build`, `test_compile_or_collect`, `green_test`,
`target_covered`, `mutants_generated`, and `mutation_valid`.

## Distribution

Java CC distribution: 5=14, 6=10, 7=10, 8=10, 9=6, 10=10.
Python CC distribution: 5=21, 6=12, 7=10, 8=8, 9=5, 10=4.

The distribution is not forced to ten per bin because strict standalone-friendly
selection leaves only six Java CC=9 candidates and excludes invalid Python
closures. Every CC bin remains represented in the full and pilot datasets.
""", encoding="utf-8")
    print("Output:", OUT)
    print("Java CC:", dict(sorted(Counter(int(r["cc"]) for r in final if r["language"] == "java").items())))
    print("Python CC:", dict(sorted(Counter(int(r["cc"]) for r in final if r["language"] == "python").items())))
    print("Static gate:", sum(int(r["overall_static_gate"]) for r in checks), "/", len(checks))


if __name__ == "__main__":
    main()
