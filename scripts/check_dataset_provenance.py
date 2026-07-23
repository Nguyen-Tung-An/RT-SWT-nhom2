"""Fail fast when experiment files refer to incompatible target datasets."""

import argparse
import csv
import hashlib
import json
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]


def digest(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


def read_csv(path: Path):
    with path.open(encoding="utf-8", newline="") as stream:
        return list(csv.DictReader(stream))


def target_key(row, metadata):
    meta = metadata.get(row["func_id"], {})
    return (
        row.get("source_repo", ""),
        row.get("file", ""),
        row.get("func_name", ""),
        row.get("cc", ""),
        meta.get("qualified_name", ""),
        meta.get("signature", ""),
    )


def load_dataset(directory: Path):
    dataset_path = directory / "full_ground_truth.csv"
    metadata_path = directory / "target_metadata.csv"
    rows = read_csv(dataset_path)
    metadata_rows = read_csv(metadata_path)
    metadata = {row["func_id"]: row for row in metadata_rows}
    ids = [row["func_id"] for row in rows]
    errors = []
    if len(ids) != len(set(ids)):
        errors.append("duplicate func_id in full_ground_truth.csv")
    if len(metadata) != len(metadata_rows):
        errors.append("duplicate func_id in target_metadata.csv")
    missing = sorted(set(ids) - set(metadata))
    extra = sorted(set(metadata) - set(ids))
    if missing:
        errors.append(f"metadata missing {len(missing)} IDs")
    if extra:
        errors.append(f"metadata has {len(extra)} extra IDs")
    return {
        "directory": str(directory),
        "dataset_sha256": digest(dataset_path),
        "metadata_sha256": digest(metadata_path),
        "rows": len(rows),
        "targets": {row["func_id"]: target_key(row, metadata) for row in rows},
        "errors": errors,
    }


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("datasets", nargs="*", default=["data", "processed_dataset"])
    parser.add_argument("--json", action="store_true")
    args = parser.parse_args()
    loaded = [load_dataset((ROOT / item).resolve()) for item in args.datasets]
    conflicts = []
    for left_index, left in enumerate(loaded):
        for right in loaded[left_index + 1 :]:
            shared = sorted(set(left["targets"]) & set(right["targets"]))
            changed = [fid for fid in shared if left["targets"][fid] != right["targets"][fid]]
            if changed:
                conflicts.append(
                    {
                        "left": left["directory"],
                        "right": right["directory"],
                        "shared_ids": len(shared),
                        "changed_targets": len(changed),
                        "examples": changed[:10],
                    }
                )
    report = {
        "datasets": [{key: value for key, value in item.items() if key != "targets"} for item in loaded],
        "id_reuse_conflicts": conflicts,
    }
    if args.json:
        print(json.dumps(report, indent=2, ensure_ascii=False))
    else:
        for item in report["datasets"]:
            print(
                f"{item['directory']}: rows={item['rows']} "
                f"dataset={item['dataset_sha256'][:12]} metadata={item['metadata_sha256'][:12]}"
            )
            for error in item["errors"]:
                print(f"  ERROR: {error}")
        for conflict in conflicts:
            print(
                "ERROR: func_id reused for different targets: "
                f"{conflict['changed_targets']}/{conflict['shared_ids']} "
                f"({', '.join(conflict['examples'])})"
            )
    if any(item["errors"] for item in loaded) or conflicts:
        raise SystemExit(2)


if __name__ == "__main__":
    main()
