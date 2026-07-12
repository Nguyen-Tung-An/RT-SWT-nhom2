"""
Do FULL baseline Java (evosuite + randoop) cho moi repo theo cong thuc gate:
  chuan bi (va pom, cat test goc, install multi-module) -> chep test (transform)
  -> mvn test + JaCoCo -> PIT -> parser theo ham -> metrics_full.csv.

Chay: python ms-analysis/scripts/run_full_java_measurement.py [--repos a,b] [--tools evosuite,randoop]

Bay da biet (v2 — sau vong do dau 04/07, xem notes.md):
  - EvoSuite test: JDK 11 + release 11 + separateClassLoader=false + evosuite-standalone-runtime.
  - Randoop test:  JDK 17 + release 17.
  - Va pom bang XML (khong thay chuoi — tung chen nham vao <dependencies> cua
    maven-release-plugin lam joda khong parse duoc pom).
  - junit-vintage-engine KHONG pin version neu project da quan ly JUnit 5
    (pin 5.10.2 lech platform 5.13 -> "JUnit jars not properly aligned").
  - CAT TEST GOC cua project (doi ten src/test/java -> src/_test_java_goc):
    test cu cua ho compile loi voi release 11 (equalsverifier...), keo theo -Werror.
  - Repo multi-module: mvn install -DskipTests o ROOT truoc (gson/extras can artifact gson),
    va them cac module anh em lam test-dep (Gson_ESTest import cross-module).
  - commons-*: JaCoCo tich hop san; neu khong ra bao cao thi fallback goi tuong minh.
"""
import argparse
import csv
import glob
import os
import re
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
# Goi surefire truc tiep theo goal de KHONG phu thuoc version pin trong pom
# (joda pin surefire 2.21 — chay "Tests run: 0" im lang voi moi pattern).
SUREFIRE = "org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test"
SKIPS = ["-Drat.skip=true", "-Dcheckstyle.skip=true", "-Dspotbugs.skip=true", "-Dpmd.skip=true",
         "-Danimal.sniffer.skip=true", "-Denforcer.skip=true", "-Dmaven.javadoc.skip=true",
         "-Djapicmp.skip=true", "-DfailIfNoTests=false", "-Dmaven.test.failure.ignore=true",
         "-Dmaven.compiler.failOnWarning=false", "-Dspotless.check.skip=true", "-Dspotless.apply.skip=true",
         "-Dsurefire.failIfNoSpecifiedTests=false",
         # commons-math dat jacoco.skip=true trong pom -> moi goal jacoco im lang bo qua
         "-Djacoco.skip=false"]

# Test-dep noi bo repo can go bo (khong ton tai trong reactor -> resolve fail):
REMOVE_TEST_DEPS = {"commons-math": {"commons-math-docs", "commons-math-examples"}}
# Module anh em can them lam test-dep (ESTest import cross-module), theo TEN THU MUC:
NEED_SIBLINGS = {("gson", "gson"): ["extras", "proto"]}
POM_NS = "http://maven.apache.org/POM/4.0.0"
ET.register_namespace("", POM_NS)


def q(tag):
    return f"{{{POM_NS}}}{tag}"


def sh(cmd, cwd, java_home, timeout=2400):
    env = os.environ.copy()
    env["JAVA_HOME"] = java_home
    r = subprocess.run(cmd, cwd=cwd, shell=True, capture_output=True, text=True,
                       encoding="utf-8", errors="replace", timeout=timeout, env=env)
    return r.returncode, (r.stdout or "") + (r.stderr or "")


def read_gav(pom_path):
    root = ET.parse(pom_path).getroot()
    g = root.findtext(q("groupId")) or root.findtext(f"{q('parent')}/{q('groupId')}")
    a = root.findtext(q("artifactId"))
    v = root.findtext(q("version")) or root.findtext(f"{q('parent')}/{q('version')}")
    return g, a, v


def vintage_version(txt):
    """Chon version cho junit-vintage-engine theo tung kieu pom:
    - co junit-bom / commons-parent -> de trong (da duoc quan ly)
    - co junit-jupiter kem version cu the -> pin DUNG version do (lech la
      "JUnit jars not properly aligned" / "TestEngine failed to discover")
    - con lai (project JUnit3/4 nhu joda) -> 5.10.2
    """
    if "junit-bom" in txt or "commons-parent" in txt:
        return None
    m = re.search(r"junit-jupiter[^<]*</artifactId>\s*<version>([^<]+)</version>", txt)
    if m:
        v = m.group(1).strip()
        pm = re.match(r"\$\{([^}]+)\}", v)
        if pm:
            vm = re.search(rf"<{re.escape(pm.group(1))}>([^<]+)</{re.escape(pm.group(1))}>", txt)
            v = vm.group(1).strip() if vm else None
        return v
    return "5.10.2"


def patch_pom(pom_path, extra_deps=(), remove_test_deps=()):
    """Chen test-deps o DUNG project-level <dependencies> (XML, khong thay chuoi)."""
    txt = open(pom_path, encoding="utf-8", errors="replace").read()
    tree = ET.parse(pom_path)
    root = tree.getroot()
    deps = root.find(q("dependencies"))
    if deps is None:
        deps = ET.SubElement(root, q("dependencies"))

    # go test-dep khong resolve duoc (vd commons-math-docs khong nam trong reactor)
    for d in list(deps.findall(q("dependency"))):
        if d.findtext(q("artifactId")) in remove_test_deps:
            deps.remove(d)

    have = {}
    for d in deps.findall(q("dependency")):
        have[(d.findtext(q("groupId")), d.findtext(q("artifactId")))] = d

    def add(g, a, v, force_version=False):
        d = have.get((g, a))
        if d is not None:
            if force_version:
                ver = d.find(q("version"))
                if ver is None:
                    ver = ET.SubElement(d, q("version"))
                ver.text = v  # vd joda khai bao junit 3.8.2 -> ep len 4.13.2
            return
        d = ET.SubElement(deps, q("dependency"))
        ET.SubElement(d, q("groupId")).text = g
        ET.SubElement(d, q("artifactId")).text = a
        if v:
            ET.SubElement(d, q("version")).text = v
        ET.SubElement(d, q("scope")).text = "test"
        have[(g, a)] = d

    add("junit", "junit", "4.13.2", force_version=True)
    add("org.junit.vintage", "junit-vintage-engine", vintage_version(txt))
    add("org.evosuite", "evosuite-standalone-runtime", "1.2.0")
    for g, a, v in extra_deps:
        add(g, a, v)
    tree.write(pom_path, encoding="utf-8", xml_declaration=True)
    fix_pom_text(pom_path)


def fix_pom_text(pom_path):
    """Go cac config lam fail compile test cua minh (chi sua ban clone local):
    gson root pom co <failOnWarning>true> -> compiler them -Werror, property CLI
    khong override duoc config tuong minh trong pom."""
    txt = open(pom_path, encoding="utf-8", errors="replace").read()
    fixed = (txt.replace("<arg>-Werror</arg>", "")
                .replace("<failOnWarning>true</failOnWarning>", "<failOnWarning>false</failOnWarning>"))
    # pom co <argLine> rieng se de mat agent JaCoCo -> tiem @{argLine} (late binding)
    if "<argLine>" in fixed and "@{argLine}" not in fixed:
        fixed = fixed.replace("<argLine>", "<argLine>@{argLine} ")
    if fixed != txt:
        open(pom_path, "w", encoding="utf-8", newline="\n").write(fixed)


def ensure_pitest_junit5_plugin(pom_path):
    """Test gpt4o la JUnit5 ('org.junit.jupiter.api.Test'). PIT KHONG tu nhan
    dien JUnit5 neu thieu plugin nay — chay xong bao 'No test classes
    identified to scan' va MOI mutant thanh NO_COVERAGE (du JaCoCo van do
    dung coverage o buoc truoc, vi surefire+jacoco khong can plugin nay).
    Test EvoSuite/Randoop la JUnit4 nen truoc gio khong dinh loi nay."""
    tree = ET.parse(pom_path)
    root = tree.getroot()
    build = root.find(q("build"))
    if build is None:
        build = ET.SubElement(root, q("build"))
    plugins = build.find(q("plugins"))
    if plugins is None:
        plugins = ET.SubElement(build, q("plugins"))
    pit_plugin = None
    for p in plugins.findall(q("plugin")):
        if p.findtext(q("groupId")) == "org.pitest" and p.findtext(q("artifactId")) == "pitest-maven":
            pit_plugin = p
            break
    if pit_plugin is None:
        pit_plugin = ET.SubElement(plugins, q("plugin"))
        ET.SubElement(pit_plugin, q("groupId")).text = "org.pitest"
        ET.SubElement(pit_plugin, q("artifactId")).text = "pitest-maven"
        ET.SubElement(pit_plugin, q("version")).text = "1.17.2"
    deps = pit_plugin.find(q("dependencies"))
    if deps is None:
        deps = ET.SubElement(pit_plugin, q("dependencies"))
    if not any(d.findtext(q("artifactId")) == "pitest-junit5-plugin" for d in deps.findall(q("dependency"))):
        d = ET.SubElement(deps, q("dependency"))
        ET.SubElement(d, q("groupId")).text = "org.pitest"
        ET.SubElement(d, q("artifactId")).text = "pitest-junit5-plugin"
        ET.SubElement(d, q("version")).text = "1.2.1"
    tree.write(pom_path, encoding="utf-8", xml_declaration=True)


def stash_project_tests(mod_dir):
    src = os.path.join(mod_dir, "src", "test", "java")
    dst = os.path.join(mod_dir, "src", "_test_java_goc")
    if os.path.isdir(src) and not os.path.isdir(dst):
        os.rename(src, dst)
    elif os.path.isdir(src) and os.path.isdir(dst):
        # backup da co nhung test goc "hoi sinh" (vd git checkout khoi phuc
        # file bi rename) -> xoa sach, chi giu test cua minh (chep lai sau)
        import shutil
        shutil.rmtree(src)
    os.makedirs(src, exist_ok=True)


def module_of(row):
    f = row["file"].replace("\\", "/")
    m = re.search(r"/raw/[^/]+/(?:(.+?)/)?src/main/java/", f)
    return (m.group(1) or "") if m else ""


def pkg_class(row):
    rel = row["file"].replace("\\", "/").split("src/main/java/")[1]
    return os.path.dirname(rel).replace("/", "."), os.path.basename(rel).replace(".java", "")


def copy_evosuite_tests(rows, mod_dir):
    n = 0
    for r in rows:
        pkg, cls = pkg_class(r)
        for suffix in ("_ESTest.java", "_ESTest_scaffolding.java"):
            s = os.path.join(GEN, "evosuite", "java", *pkg.split("."), cls + suffix)
            if not os.path.exists(s):
                continue
            code = open(s, encoding="utf-8", errors="replace").read().lstrip("﻿")
            code = code.replace("separateClassLoader = true", "separateClassLoader = false")
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
                code = open(os.path.join(GEN, "randoop", "java", f),
                            encoding="utf-8", errors="replace").read().lstrip("﻿")
                open(os.path.join(d, f), "w", encoding="utf-8", newline="\n").write(code)
                n += 1
    return n


def copy_gpt4o_tests(rows, mod_dir):
    """Test LLM: file JA-XXX_Test.java thuong khai bao class trung ten voi cac
    ham KHAC cua CUNG mot class SUT (vd 3 ham cua CommandLine deu sinh ra
    'class CommandLineTest') -> phai doi ten class + file THEO TUNG HAM de
    khong ghi de nhau khi gom vao chung 1 thu muc package.
    Tra ve dict {duong_dan_file: func_id} de sau nay biet file nao thuoc ham nao
    (dung khi phai loai file compile loi ra khoi batch — xem evict_uncompilable)."""
    file_to_func = {}
    for r in rows:
        s = os.path.join(GEN, "gpt4o", "java", f"{r['func_id']}_Test.java")
        if not os.path.exists(s):
            continue
        code = open(s, encoding="utf-8", errors="replace").read().lstrip("﻿")
        pkg_m = re.search(r"^\s*package\s+([\w.]+)\s*;", code, re.M)
        # class co the la package-private (khong co tu khoa 'public') — van hop le
        cls_m = re.search(r"(?:public\s+)?(?:final\s+)?class\s+(\w+)", code)
        if not cls_m:
            print(f"  !! {r['func_id']}: khong tim thay khai bao class, bo qua")
            continue
        pkg = pkg_m.group(1) if pkg_m else pkg_class(r)[0]
        old_cls = cls_m.group(1)
        safe = r["func_id"].replace("-", "_")
        new_cls = f"{safe}_{old_cls}"
        code2 = re.sub(rf"\b{re.escape(old_cls)}\b", new_cls, code)
        d = os.path.join(mod_dir, "src", "test", "java", *pkg.split("."))
        os.makedirs(d, exist_ok=True)
        out_path = os.path.join(d, new_cls + ".java")
        open(out_path, "w", encoding="utf-8", newline="\n").write(code2)
        file_to_func[out_path] = r["func_id"]
    return file_to_func


def _surefire_txt(mod_dir, cls):
    return glob.glob(os.path.join(mod_dir, "target", "surefire-reports", f"*{cls}.txt"))


def evict_invalid_gpt4o_tests(mod_dir, jdk, comp, file_to_func, max_rounds=15):
    """Test LLM sinh ra co the (a) goi method private/sai kieu/sai overload ->
    COMPILE LOI, hoac (b) compile duoc nhung FAIL/ERROR luc chay (vd Mockito
    khong mock duoc final class, assert sai) -> ca hai deu la 'serious runtime
    error'/khong compile theo proposal Ã‚Â§5.1 = INVALID, giong het chinh sach
    green-check nghiem ngat da ap dung cho Python (khong doi xu long leo giua
    2 ngon ngu — mot phan test fail la ca ham bi loai, khong do coverage/mutation).
    Chay `mvn test` (khong chi test-compile) moi vong de bat CA HAI loai loi
    cung luc, loai file tuong ung, lap toi sach hoac het vong.
    Tra ve (remaining, invalid): remaining = {file: func_id} con hop le,
    invalid = list func_id bi loai (se ghi INVALID vao metrics)."""
    invalid = []
    remaining = dict(file_to_func)
    for _ in range(max_rounds):
        if not remaining:
            break
        rc, out = sh(f"mvn -q test {comp} " + " ".join(SKIPS), mod_dir, jdk, timeout=900)
        # (a) loi compile — Maven in path kieu URI ("/F:/Ky_5/.../File.java")
        # tren Windows -> so sanh theo BASENAME (moi file trong batch nay
        # ten duy nhat).
        bad_basenames = {os.path.basename(b) for b in
                         re.findall(r"\[ERROR\]\s+(\S+\.java):\[\d+,\d+\]", out)}
        bad_here = [p for p in remaining if os.path.basename(p) in bad_basenames]
        # (b) compile OK nhung fail/error luc chay — doc surefire report .txt
        for p in list(remaining):
            if p in bad_here:
                continue
            cls = os.path.splitext(os.path.basename(p))[0]
            reports = _surefire_txt(mod_dir, cls)
            if not reports:
                continue  # co the do file KHAC trong batch lam sap build; xu ly vong sau
            txt = open(reports[0], encoding="utf-8", errors="replace").read()
            m = re.search(r"Tests run:\s*(\d+),\s*Failures:\s*(\d+),\s*Errors:\s*(\d+)", txt)
            if m and (int(m.group(1)) == 0 or int(m.group(2)) > 0 or int(m.group(3)) > 0):
                bad_here.append(p)
        if rc == 0 and not bad_here:
            break
        if not bad_here:
            print("  !! mvn test that bai nhung khong xac dinh duoc file loi, dung vong lap")
            break
        for p in set(bad_here):
            fid = remaining.pop(p, None)
            if fid is None:
                continue
            invalid.append(fid)
            os.remove(p)
            print(f"  !! {fid}: INVALID (khong compile hoac test fail luc chay) -> loai khoi batch")
    # XAC THUC LAN CUOI: neu vong lap thoat vi "khong xac dinh duoc file loi"
    # (rc!=0 nhung khong file nao khop regex loi/surefire), CAC FILE CON LAI co
    # the chua bao gio thuc su chay (vd bi 1 file khac trong batch lam sap ca
    # buoc test truoc do, hoac loi Maven khac thuong) — DUNG mac dinh la valid
    # chi vi "khong bat duoc ly do sai". Yeu cau MOI file con lai phai co bao
    # cao surefire that, tests>0, 0 fail/error, moi duoc tinh la hop le.
    for p in list(remaining):
        cls = os.path.splitext(os.path.basename(p))[0]
        reports = _surefire_txt(mod_dir, cls)
        ok = False
        if reports:
            txt = open(reports[0], encoding="utf-8", errors="replace").read()
            m = re.search(r"Tests run:\s*(\d+),\s*Failures:\s*(\d+),\s*Errors:\s*(\d+)", txt)
            ok = bool(m) and int(m.group(1)) > 0 and int(m.group(2)) == 0 and int(m.group(3)) == 0
        if not ok:
            fid = remaining.pop(p)
            invalid.append(fid)
            os.remove(p)
            print(f"  !! {fid}: INVALID (khong co bao cao surefire hop le sau vong lap) -> loai khoi batch")
    return remaining, invalid


def append_invalid_rows(csv_out_path, full_csv_path, method, func_ids):
    if not func_ids:
        return
    cc_of = {}
    for r in csv.DictReader(open(full_csv_path, encoding="utf-8-sig")):
        cc_of[r["func_id"]] = r["cc"]
    fields = ["function_id", "language", "cc", "method", "branch_coverage", "mutation_score", "compiled"]
    exists = os.path.exists(csv_out_path)
    old = []
    if exists:
        old = [x for x in csv.DictReader(open(csv_out_path, encoding="utf-8-sig"))
               if not (x["method"] == method and x["function_id"] in func_ids)]
    with open(csv_out_path, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fields)
        w.writeheader()
        for x in old:
            w.writerow({k: x.get(k, "") for k in fields})
        for fid in func_ids:
            w.writerow({"function_id": fid, "language": "java", "cc": cc_of.get(fid, ""),
                       "method": method, "branch_coverage": 0.0, "mutation_score": 0.0, "compiled": 0})


def clean_our_tests(mod_dir):
    t = os.path.join(mod_dir, "src", "test", "java")
    if not os.path.isdir(t):
        return
    for root, _, files in os.walk(t):
        for f in files:
            if "_ESTest" in f or re.match(r"JA_\d+_(Regression|[A-Z])", f):
                os.remove(os.path.join(root, f))


def rm(path):
    if os.path.exists(path):
        os.remove(path)


def run_parser(repo, method, jacoco_xml, pit_xml, csv_path, exclude_ids=()):
    cmd = [sys.executable, os.path.join(REPO_ROOT, "ms-analysis", "scripts", "measure_java_from_reports.py"),
           "--csv", csv_path, "--repo", repo, "--method", method,
           "--jacoco", jacoco_xml, "--skip-missing",
           "--out", os.path.join("ms-analysis", "results", "metrics_full.csv")]
    if pit_xml and os.path.exists(pit_xml):
        cmd += ["--pit", pit_xml]
    if exclude_ids:
        cmd += ["--exclude", ",".join(exclude_ids)]
    r = subprocess.run(cmd, cwd=REPO_ROOT, capture_output=True, text=True,
                       encoding="utf-8", errors="replace")
    print(r.stdout.strip())
    if r.returncode != 0:
        print("PARSER ERR:", r.stderr.strip()[-400:])


def measure(repo, rows, tools, csv_path):
    by_mod = {}
    for r in rows:
        by_mod.setdefault(module_of(r), []).append(r)
    repo_dir = os.path.join(RAW, repo)
    multi = any(m for m in by_mod)
    # root pom giu config anh huong module (vd gson <failOnWarning>) -> va luon
    root_pom = os.path.join(repo_dir, "pom.xml")
    if os.path.exists(root_pom):
        fix_pom_text(root_pom)

    # multi-module: install toan bo artifact vao .m2 mot lan (extras can gson...)
    if multi:
        marker = os.path.join(repo_dir, "target", ".rtswt-installed")
        if not os.path.exists(marker):
            print(f">> {repo}: mvn install -DskipTests (multi-module, 1 lan)...")
            rc, out = sh("mvn -q install -DskipTests -Dmaven.test.skip=true " + " ".join(SKIPS),
                         repo_dir, JDK17)
            if rc != 0:
                print(f"!! {repo}: install fail (rc={rc}):",
                      "\n".join(l for l in out.splitlines() if "ERROR" in l)[:400])
            else:
                os.makedirs(os.path.dirname(marker), exist_ok=True)
                open(marker, "w").write("ok")
    for mod, mrows in by_mod.items():
        mod_dir = os.path.join(repo_dir, mod) if mod else repo_dir
        pom = os.path.join(mod_dir, "pom.xml")
        if not os.path.exists(pom):
            print(f"!! {repo}/{mod}: khong thay pom, bo qua")
            continue
        # them module anh em lam test-dep NEU can (vd Gson_ESTest import extras/proto)
        extra = []
        for sib in NEED_SIBLINGS.get((repo, mod), []):
            sp = os.path.join(repo_dir, sib, "pom.xml")
            if os.path.isfile(sp):
                try:
                    g, a, v = read_gav(sp)
                    extra.append((g, a, v))
                except ET.ParseError:
                    pass
        patch_pom(pom, extra, REMOVE_TEST_DEPS.get(repo, ()))
        ensure_pitest_junit5_plugin(pom)
        stash_project_tests(mod_dir)
        target_classes = ",".join(sorted({".".join(pkg_class(r)) for r in mrows}))
        uniq = f"{repo}/{mod or '.'}"

        for method in tools:
            clean_our_tests(mod_dir)
            rm(os.path.join(mod_dir, "target", "jacoco.exec"))
            # xoa bytecode test cu — pass truoc compile bang JDK khac (17 vs 11)
            # de lai class ma surefire quet phai la chet im lang (rc=0, 0 test)
            tc = os.path.join(mod_dir, "target", "test-classes")
            if os.path.isdir(tc):
                import shutil
                shutil.rmtree(tc, ignore_errors=True)
            invalid_ids = []
            if method == "evosuite":
                n = copy_evosuite_tests(mrows, mod_dir)
                jdk, rel, tpat, pit_tests = JDK11, "11", "*ESTest", "*ESTest"
            elif method == "gpt4o":
                # test LLM la JUnit5 thuong, khong can JDK dac thu nhu EvoSuite.
                # QUAN TRONG: PIT -DtargetTests KHONG nhan glob "JA_*" tran (khac
                # voi surefire -Dtest, cai nay van nhan binh thuong) — phai co
                # PACKAGE DAY DU ("org.foo.bar.JA_*"), neu khong PIT lang le bao
                # "No test classes identified to scan" va MOI mutant thanh
                # NO_COVERAGE du JaCoCo van do dung coverage o buoc truoc.
                jdk, rel, tpat = JDK17, "17", "JA_*"
                pkgs_here = sorted({pkg_class(r)[0] for r in mrows})
                pit_tests = ",".join(f"{p}.JA_*" for p in pkgs_here)
                comp0 = f"-Dmaven.compiler.release={rel} -Dmaven.compiler.source={rel} -Dmaven.compiler.target={rel}"
                file_to_func = copy_gpt4o_tests(mrows, mod_dir)
                # test LLM co the (a) goi method private/sai overload -> COMPILE
                # LOI, hoac (b) compile OK nhung FAIL luc chay (Mockito khong
                # mock duoc final class, assert sai...) -> ca hai deu INVALID
                # theo proposal Ã‚Â§5.1 (dong bo chinh sach voi green-check ben
                # Python — khong do coverage/mutation cho ham co test fail).
                _, invalid_ids = evict_invalid_gpt4o_tests(mod_dir, jdk, comp0, file_to_func)
                if invalid_ids:
                    append_invalid_rows(os.path.join(REPO_ROOT, "ms-analysis", "results", "metrics_full.csv"),
                                        os.path.join(REPO_ROOT, csv_path), "gpt4o-mini", invalid_ids)
                    print(f"  -> {len(invalid_ids)} ham INVALID (khong compile hoac test fail luc chay): {', '.join(invalid_ids)}")
                n = len(file_to_func) - len(invalid_ids)
            else:
                n = copy_randoop_tests(mrows, mod_dir)
                jdk, rel, tpat, pit_tests = JDK17, "17", "*_Regression*", "JA_*"
            if n == 0:
                print(f"-- {uniq} [{method}]: khong co test hop le, bo qua")
                continue
            comp = f"-Dmaven.compiler.release={rel} -Dmaven.compiler.source={rel} -Dmaven.compiler.target={rel}"
            # DAM BAO main source da compile DUNG bytecode version cho `jdk` nay.
            # Bug tung gap: khi buoc do sau day roi vao fallback (test-compile +
            # SUREFIRE goal truc tiep, khong qua lifecycle `test` day du), phase
            # `compile` cho MAIN source đôi khi khong chay -> target/classes RONG
            # -> PIT bao "Created 0 mutation test units" / "No mutations found"
            # (commons-math, jfreechart). `mvn compile` rieng, tuong minh, luon an toan.
            sh(f"mvn -q compile {comp} " + " ".join(SKIPS), mod_dir, jdk, timeout=600)
            print(f">> {uniq} [{method}] test+jacoco ({n} file test)...")
            jxml = os.path.join(mod_dir, "target", "site", "jacoco", "jacoco.xml")
            pxml_path = os.path.join(mod_dir, "target", "pit-reports", "mutations.xml")
            # XOA bao cao CU truoc khi chay — neu khong, lan chay sau co the
            # that bai am tham (vd loi compile) ma script van tuong "co bao cao"
            # vi file jacoco.xml/mutations.xml cua LAN CHAY TRUOC van con o do.
            rm(jxml)
            rm(pxml_path)
            rc, out = sh(f'mvn -q test jacoco:report -Dtest="{tpat}" {comp} ' + " ".join(SKIPS),
                         mod_dir, jdk)
            if not os.path.exists(jxml):
                # fallback 1: prepare-agent + test-compile + SUREFIRE GOAL TRUC TIEP
                # (khong dung lifecycle `test` de ne surefire co pin trong pom) + report
                rm(os.path.join(mod_dir, "target", "jacoco.exec"))
                rc, out = sh(f'mvn -q {JACOCO}:prepare-agent test-compile {SUREFIRE} {JACOCO}:report '
                             f'-Dtest="{tpat}" {comp} ' + " ".join(SKIPS), mod_dir, jdk)
            if not os.path.exists(jxml):
                # fallback 2 (bat kha chien bai): chay test TRONG JVM cua maven
                # (-DforkCount=0 -> argLine trong pom bi bo qua), agent gan vao maven
                # qua MAVEN_OPTS nen khong config nao de duoc.
                rm(os.path.join(mod_dir, "target", "jacoco.exec"))
                agent = os.path.join(os.path.expanduser("~"), ".m2", "repository", "org", "jacoco",
                                     "org.jacoco.agent", "0.8.12",
                                     "org.jacoco.agent-0.8.12-runtime.jar").replace("\\", "/")
                exec_f = os.path.join(mod_dir, "target", "jacoco.exec").replace("\\", "/")
                env_extra = os.environ.get("MAVEN_OPTS", "")
                os.environ["MAVEN_OPTS"] = f"-javaagent:{agent}=destfile={exec_f} {env_extra}".strip()
                try:
                    rc, out = sh(f'mvn -q test-compile {SUREFIRE} -DforkCount=0 '
                                 f'-Dtest="{tpat}" {comp} ' + " ".join(SKIPS), mod_dir, jdk)
                    sh(f"mvn -q {JACOCO}:report", mod_dir, jdk)
                finally:
                    if env_extra:
                        os.environ["MAVEN_OPTS"] = env_extra
                    else:
                        os.environ.pop("MAVEN_OPTS", None)
            if not os.path.exists(jxml):
                print(f"!! {uniq} [{method}]: jacoco.xml KHONG sinh (rc={rc}). Loi cuoi:")
                print("\n".join([l for l in out.splitlines() if "ERROR" in l][:5]))
                continue
            print(f">> {uniq} [{method}] PIT...")
            # skipFailingTests: suite co test flaky fail thi PIT mac dinh ABORT
            # ("tests did not pass without mutation") -> bo test do thay vi bo ca repo
            rc2, out2 = sh(f'mvn -q {PIT} -DtargetClasses="{target_classes}" -DtargetTests="{pit_tests}" '
                           f'-DoutputFormats=XML -DtimestampedReports=false -DskipFailingTests=true {comp} '
                           + " ".join(SKIPS), mod_dir, jdk, timeout=3600)
            pxml = os.path.join(mod_dir, "target", "pit-reports", "mutations.xml")
            if not os.path.exists(pxml):
                print(f"!! {uniq} [{method}]: PIT khong ra bao cao (rc={rc2}) -> chi co coverage")
                pxml = None
            # nhan method trong metrics.csv: "gpt4o" (chon nhanh code) -> "gpt4o-mini"
            # (khop ten voi phia Python de compute_metric.py nhan dung 1 nhom)
            out_method = "gpt4o-mini" if method == "gpt4o" else method
            run_parser(repo, out_method, jxml, pxml, csv_path, exclude_ids=invalid_ids)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--csv", default=os.path.join("data", "full_ground_truth.csv"))
    ap.add_argument("--repos", default="")
    ap.add_argument("--tools", default="evosuite,randoop")
    args = ap.parse_args()

    rows = [r for r in csv.DictReader(open(os.path.join(REPO_ROOT, args.csv), encoding="utf-8-sig"))
            if r["language"] == "java"]
    by_repo = {}
    for r in rows:
        by_repo.setdefault(r["source_repo"].split("/")[-1], []).append(r)
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
