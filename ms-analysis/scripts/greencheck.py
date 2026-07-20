"""Green-check theo TUNG TEST thay vi ca file — sua artifact all-or-nothing.

Van de (audit sau bao ve):
  Ca hai harness deu chay `pytest <file>` roi kiem returncode. Chi can MOT test hong la
  toan bo ham/module bi gan 0.
    - measure_python_module.py : 1 test hong  -> ca ham INVALID (chinh artifact bai mo ta
      o RQ4: "an all-or-nothing pass criterion penalises test-suite thoroughness")
    - measure_pynguin.py       : 1 test hong  -> ZERO ca module (48/60 ham bi zero oan,
      ke ca module Pynguin tu bao phu 40%)

Cach sua: lay danh sach test node, chay tung node, chi giu node PASS tren ban goc, roi do
tren tap xanh do. Dung nguyen tac ma kaggle_mutation_py.py (arm GPT) da ap dung.

Duong nhanh: chay ca file truoc; neu xanh het thi khoi tach node (khong mat them thoi gian).
"""
from __future__ import annotations

import os
import subprocess
import sys

PY = sys.executable
COLLECT_TIMEOUT = 120
NODE_TIMEOUT = 90


def _run(cmd, cwd, timeout):
    env = os.environ.copy()
    env.setdefault("PYTHONDONTWRITEBYTECODE", "1")
    return subprocess.run(cmd, cwd=cwd, capture_output=True, text=True,
                          encoding="utf-8", errors="replace", timeout=timeout, env=env)


def collect_nodes(test_file: str, cwd: str) -> list[str]:
    """Danh sach node-id pytest (vd 'test_gen.py::test_foo'). [] neu collect that bai."""
    try:
        r = _run([PY, "-m", "pytest", "--collect-only", "-q", "-p", "no:cacheprovider",
                  test_file], cwd, COLLECT_TIMEOUT)
    except subprocess.TimeoutExpired:
        return []
    nodes = []
    for line in (r.stdout or "").splitlines():
        line = line.strip()
        if "::" in line and not line.startswith(("=", "-", "<", "ERROR", "warning")):
            nodes.append(line.split(" ")[0])
    return nodes


def green_nodes(test_file: str, cwd: str) -> tuple[list[str], list[str], str]:
    """-> (all_nodes, passing_nodes, mode).

    mode: 'file-green'  ca file xanh (duong nhanh)
          'per-test'    co test hong -> da loc tung node
          'collect-fail' khong collect duoc test nao (INVALID that su)
    """
    # duong nhanh: ca file xanh thi khong can tach
    try:
        r = _run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider", test_file],
                 cwd, COLLECT_TIMEOUT)
        whole_ok = r.returncode == 0
    except subprocess.TimeoutExpired:
        whole_ok = False

    nodes = collect_nodes(test_file, cwd)
    if not nodes:
        return [], [], "collect-fail"
    if whole_ok:
        return nodes, list(nodes), "file-green"

    passing = []
    for n in nodes:
        try:
            rr = _run([PY, "-m", "pytest", "-q", "-p", "no:cacheprovider", n],
                      cwd, NODE_TIMEOUT)
            if rr.returncode == 0:
                passing.append(n)
        except subprocess.TimeoutExpired:
            pass
    return nodes, passing, "per-test"


def pytest_args(test_file: str, passing: list[str], all_nodes: list[str]) -> list[str]:
    """Doi so pytest de chi chay tap XANH (fallback ve ca file neu xanh toan bo)."""
    if passing and len(passing) < len(all_nodes):
        return list(passing)
    return [test_file]
