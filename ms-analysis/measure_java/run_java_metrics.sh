#!/usr/bin/env bash
# run_java_metrics.sh - Đo Branch Coverage (JaCoCo) + Mutation Score (PIT) cho 1 hàm Java.
# Vai trò MS, Nhóm 2. CHẠY LOCAL (cần JDK 17 + Maven). KHÔNG chạy được trên Kaggle.
#
# Quy ước: hàm Java đặt trong class `Example`, test JUnit5 tên `ExampleTest`.
#   Example.java     -> public class Example { <hàm static của bạn> }
#   ExampleTest.java -> import org.junit.jupiter...; class ExampleTest { @Test ... Example.f(...) }
#
# Usage:
#   ./run_java_metrics.sh <Example.java> <ExampleTest.java> <function_id> <cc> [out_csv]
# Ghi 1 dòng vào metrics.csv: function_id,language,cc,method,branch_coverage,mutation_score,compiled
set -uo pipefail
SRC="$1"; TST="$2"; FID="$3"; CC="$4"; OUT="${5:-metrics.csv}"
HERE="$(cd "$(dirname "$0")" && pwd)"

PROJ="$(mktemp -d)"
mkdir -p "$PROJ/src/main/java" "$PROJ/src/test/java"
cp "$HERE/pom.xml" "$PROJ/"
cp "$SRC" "$PROJ/src/main/java/Example.java"
cp "$TST" "$PROJ/src/test/java/ExampleTest.java"

cd "$PROJ"
# build + test + jacoco; nếu compile lỗi -> compiled=0
if ! mvn -q -B -DskipTests=false test jacoco:report >/tmp/mvn_"$FID".log 2>&1; then
  if grep -qiE "COMPILATION ERROR|BUILD FAILURE" /tmp/mvn_"$FID".log; then
    echo "$FID,java,$CC,gpt4o-mini,0,0,0" >> "$OUT"; echo "$FID: compiled=0 (build fail)"; exit 0
  fi
fi

# Branch coverage từ jacoco.csv: cột BRANCH_MISSED(6), BRANCH_COVERED(7)
BC=0
if [ -f target/site/jacoco/jacoco.csv ]; then
  BC=$(awk -F, 'NR>1{bm+=$6; bc+=$7} END{ if(bm+bc>0) printf "%.2f", bc/(bm+bc)*100; else print "0" }' target/site/jacoco/jacoco.csv)
fi

# Mutation score từ PIT mutations.xml
mvn -q -B org.pitest:pitest-maven:mutationCoverage >>/tmp/mvn_"$FID".log 2>&1 || true
MS=0
XML=$(find target -name mutations.xml 2>/dev/null | head -1)
if [ -n "$XML" ]; then
  MS=$(python3 - "$XML" <<'PY'
import sys, xml.etree.ElementTree as ET
try:
    root = ET.parse(sys.argv[1]).getroot()
    muts = root.findall("mutation")
    total = len(muts)
    killed = sum(1 for m in muts if (m.get("status") in ("KILLED","TIMED_OUT") or m.get("detected")=="true"))
    print(f"{killed/total*100:.2f}" if total else "0")
except Exception:
    print("0")
PY
)
fi

echo "$FID,java,$CC,gpt4o-mini,$BC,$MS,1" >> "$OUT"
echo "$FID: compiled=1 branch=$BC mutation=$MS"
rm -rf "$PROJ"
