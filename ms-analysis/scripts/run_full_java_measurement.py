"""
Do FULL baseline Java (evosuite + randoop) cho moi repo theo cong thuc gate:
  vá pom -> chép test (transform) -> mvn test + JaCoCo -> PIT -> parser theo hàm.

Chay: python ms-analysis/scripts/run_full_java_measurement.py [--repos csv,list] [--tools evosuite,randoop]
Yeu cau: repos da build + dep-cp.txt da sinh; test da nam trong generated_tests/.

Bay da biet (xu ly san trong script — xem notes.md 04/07):
  - EvoSuite test: can JDK 11 + release 11 + separateClassLoader=false + evosuite-standalone-runtime.
  - Randoop test:  can JDK 17 + release 17 (sinh duoi JDK 17).
  - commons-*: JaCoCo TICH HOP SAN (2 agent = crash) -> chi goi jacoco:report;
    repo khac: goi prepare-agent + report tuong minh.
  - Ghi file khong BOM.
"""
import argparse
import csv
import os
import re
import shutil
import subprocess
import sys
import xml.etree.ElementTree as ET

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
RAW = os.path.join(REPO_ROOT, "data", "raw")
GEN = os.path.join(REPO_ROOT, "generated_tests")
JDK11 = r"F:\Java\jdk-11.0.31+11"
JDK17 = r"F:\jdk17"
PIT = "org.pitest:pitest-maven:1.17.2:mutationCoverage"
JACOCO = "org.jacoco:jacoco-maven-plugin:0.8.12"
SKIPS = ["-Drat.skip=true", "-Dcheckstyle.skip=true", "-Dspotbugs.skip=true", "-Dpmd.skip=true",
         "-Danimal.sniffer.skip=true", "-Denforcer.skip=true", "-Dmaven.javadoc.skip=true",
         "-Djapicmp.skip=true", "-DfailIfNoTests=false", "-Dmaven.test.failure.ignore=true"]

DEPS_SNIPPET = """    <!-- RT-SWT-nhom2: do luong test EvoSuite/Randoop (JUnit4) -->
    <dependency><groupId>junit</groupId><artifactId>junit</artifactId><version>4.13.2</version><scope>test</scope></dependency>
    <dependency><groupId>org.junit.vintage</groupId><artifactId>junit-vintage-engine</artifactId><version>5.10.2</version><scope>test</scope></dependency>
    <dependency><groupId>org.evosuite</groupId><artifactId>evosuite-standalone-runtime</artifactId><version>1.2.0</version><scope>test</scope></dependency>
"""


def sh(cmd, cwd, java_home, timeout=1800):
    env = os.environ.copy()
    env["JAVA_HOME"] = java_home
    r = subprocess.run(cmd, cwd=cwd, shell=True, capture_output=True, text=True,
                       encoding="utf-8", errors="replace", timeout=timeout, env=env)
    return r.returncode, (r.stdout or "") + (r.stderr or "")


def patch_pom(pom_path):
    src = open(pom_path, encoding="utf-8", errors="replace").read()
    if "evosuite-standalone-runtime" in src:
        return False
    if "<dependencies>" not in src:
        src = src.replace("</project>", "  <dependencies>\n" + DEPS_SNIPPET + "  </dependencies>\n</project>")
    else:
        src = src.replace("<dependencies>", "<dependencies>\n" + DEPS_SNIPPET, 1)
    open(pom_path, "w", encoding="utf-8", newline="\n").write(src)
    return True


def module_of(row):
    """'' neu single-module; 'extras' neu gson/extras/src/main/java/..."""
    f = row["file"].replace("\\", "/")
    m = re.search(r"/raw/[^/]+/(?:(.+?)/)?src/main/java/", f)
    return (m.group(1) or "") if m else ""


def pkg_class(row):
    f = row["file"].replace("\\", "/")
    rel = f.split("src/main/java/")[1]
    cls = os.path.basename(rel).replace(".java", "")
    pkg = os.path.dirname(rel).replace("/", ".")
    return pkg, cls


def copy_evosuite_tests(rows, mod_dir):
    n = 0
    for r in rows:
        pkg, cls = pkg_class(r)
        src_dir = os.path.join(GEN, "evosuite", "java", *pkg.split("."))
        for suffix in ("_ESTest.java", "_ESTest_scaffolding.java"):
            s = os.path.join(src_dir, cls + suffix)
            if not os.path.exists(s):
                continue
            code = open(s, encoding="utf-8", errors="replace").read()
            code = code.replace("separateClassLoader = true", "separateClassLoader = false")
            code = code.lstrip("﻿")
            d = os.path.join(mod_dir, "src", "test", "java", *pkg.split("."))
            os.makedirs(d, exist_ok=True)
            open(os.path.join(d, cls + suffix), "w", encoding="utf-8", newline="\n").write(code)
            n += 1
    return n


def copy_randoop_tests(rows, mod_dir):
    n = 0
    d = os.path.join(mod_dir, "src", "test", "java")
    os.makedirs(d, exist_ok=True)
    for r in rows:
        safe = r["func_id"].replace("-", "_")
        for f in os.listdir(os.path.join(GEN, "randoop", "java")):
            if f.startswith(safe + "_Regression"):
                code = open(os.path.join(GEN, "randoop", "java", f), encoding="utf-8", errors="replace").read()
                code = code.lstrip("﻿")
                open(os.path.join(d, f), "w", encoding="utf-8", newline="\n").write(code)
                n += 1
    return n


def clean_tests(mod_dir):
    """Xoa test do minh chen (ESTest / *_Regression) de 2 pass khong lan nhau."""
    t = os.path.join(mod_dir, "src", "test", "java")
    if not os.path.isdir(t):
        return
    for root, _, files in os.walk(t):
        for f in files:
            if "_ESTest" in f or re.match(r"JA_\d+_Regression", f):
                os.remove(os.path.join(root, f))
    for root, _, files in os.walk(os.path.join(mod_dir, "target"), topdown=False):
        pass  # jacoco exec xoa rieng


def rm(path):
    if os.path.exists(path):
        os.remove(path)


def run_parser(repo, method, jacoco_xml, pit_xml, csv_path):
    cmd = [sys.executable, os.path.join(REPO_ROOT, "ms-analysis", "scripts", "measure_java_from_reports.py"),
           "--csv", csv_path, "--repo", repo, "--method", method,
           "--jacoco", jacoco_xml, "--skip-missing",
           "--out", os.path.join("ms-analysis", "results", "metrics_full.csv")]
    if pit_xml and os.path.exists(pit_xml):
        cmd += ["--pit", pit_xml]
    r = subprocess.run(cmd, cwd=REPO_ROOT, capture_output=True, text=True, encoding="utf-8", errors="replace")
    print(r.stdout.strip())
    if r.returncode != 0:
        print("PARSER ERR:", r.stderr.strip()[-400:])


def measure(repo, rows, tools, csv_path):
    by_mod = {}
    for r in rows:
        by_mod.setdefault(module_of(r), []).append(r)
    commons_builtin = repo.startswith("commons-")

    for mod, mrows in by_mod.items():
        mod_dir = os.path.join(RAW, repo, mod) if mod else os.path.join(RAW, repo)
        pom = os.path.join(mod_dir, "pom.xml")
        if not os.path.exists(pom):
            print(f"!! {repo}/{mod}: khong thay pom, bo qua {len(mrows)} ham")
            continue
        patch_pom(pom)
        classes = sorted({".".join(pkg_class(r)) for r in mrows})
        target_classes = ",".join(classes)
        uniq = f"{repo}/{mod or '.'}"

        for method in tools:
            clean_tests(mod_dir)
            rm(os.path.join(mod_dir, "target", "jacoco.exec"))
            if method == "evosuite":
                n = copy_evosuite_tests(mrows, mod_dir)
                jdk, rel, tpat, pit_tests = JDK11, "11", "*ESTest", "*ESTest"
            else:
                n = copy_randoop_tests(mrows, mod_dir)
                jdk, rel, tpat, pit_tests = JDK17, "17", "*_Regression*", "JA_*"
            if n == 0:
                print(f"-- {uniq} [{method}]: khong co test, bo qua")
                continue
            comp = f"-Dmaven.compiler.release={rel} -Dmaven.compiler.source={rel} -Dmaven.compiler.target={rel}"
            jac = "jacoco:report" if commons_builtin else f"{JACOCO}:prepare-agent test {JACOCO}:report"
            mvn_test = (f'mvn -q test jacoco:report -Dtest="{tpat}" {comp} ' + " ".join(SKIPS)) if commons_builtin \
                else (f'mvn -q {JACOCO}:prepare-agent test {JACOCO}:report -Dtest="{tpat}" {comp} ' + " ".join(SKIPS))
            print(f">> {uniq} [{method}] test+jacoco ({n} file test)...")
            rc, out = sh(mvn_test, mod_dir, jdk)
            jxml = os.path.join(mod_dir, "target", "site", "jacoco", "jacoco.xml")
            if not os.path.exists(jxml):
                print(f"!! {uniq} [{method}]: jacoco.xml KHONG sinh (rc={rc}). Loi cuoi:\n" +
                      "\n".join([l for l in out.splitlines() if "ERROR" in l][:5]))
                continue
            print(f">> {uniq} [{method}] PIT...")
            pit_cmd = (f'mvn -q {PIT} -DtargetClasses="{target_classes}" -DtargetTests="{pit_tests}" '
                       f'-DoutputFormats=XML -DtimestampedReports=false {comp} ' + " ".join(SKIPS))
            rc2, out2 = sh(pit_cmd, mod_dir, jdk, timeout=3600)
            pxml = os.path.join(mod_dir, "target", "pit-reports", "mutations.xml")
            if rc2 != 0 and not os.path.exists(pxml):
                print(f"!! {uniq} [{method}]: PIT fail (rc={rc2}) -> chi co coverage")
                pxml = None
            run_parser(repo, method, jxml, pxml, csv_path)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--csv", default=os.path.join("data", "full_ground_truth.csv"))
    ap.add_argument("--repos", default="", help="loc theo ten repo, phay; mac dinh: tat ca")
    ap.add_argument("--tools", default="evosuite,randoop")
    args = ap.parse_args()

    rows = [r for r in csv.DictReader(open(os.path.join(REPO_ROOT, args.csv), encoding="utf-8-sig"))
            if r["language"] == "java"]
    by_repo = {}
    for r in rows:
        name = r["source_repo"].split("/")[-1]
        by_repo.setdefault(name, []).append(r)
    want = [s.strip() for s in args.repos.split(",") if s.strip()] or sorted(by_repo)
    tools = [t.strip() for t in args.tools.split(",")]

    for repo in want:
        if repo not in by_repo:
            print(f"!! khong co ham nao thuoc {repo}")
            continue
        print(f"\n================ {repo} ({len(by_repo[repo])} ham) ================")
        measure(repo, by_repo[repo], tools, args.csv)

    print("\nXONG. Ket qua: ms-analysis/results/metrics_full.csv")


if __name__ == "__main__":
    sys.exit(main())
