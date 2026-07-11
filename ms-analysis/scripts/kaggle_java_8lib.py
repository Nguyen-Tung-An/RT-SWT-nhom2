# =====================================================================
# Kaggle - DO JAVA 8-THU VIEN (coverage JaCoCo + mutation PIT) cho test gpt-4o-mini. Internet ON.
# TU CLONE 8 repo dung commit pin + Maven build + do tung ham. KHONG can Lộc, KHONG can nguon o may.
# Ra: /kaggle/working/results_java/metrics_java_gpt.csv  (dinh dang git: function_id,language,cc,branch_coverage,mutation_score,compiled)
# LUU Y: day la phan KHO NHAT - can Internet On, ~30-60' build. Repo fail -> ham do note compile-error (honest, partial).
#        Neu loi: gui log dong "BUILD LOI <repo>" / "DO LOI <fid>".
# =====================================================================
import os, sys, glob, re, csv, subprocess, shutil, urllib.request
import xml.etree.ElementTree as ET

_h = glob.glob("/kaggle/input/**/full_ground_truth.csv", recursive=True)
INPUT = os.path.dirname(os.path.dirname(_h[0])) if _h else "/kaggle/input"
OUT = "/kaggle/working/results_java"; os.makedirs(OUT, exist_ok=True)
WORK = "/kaggle/working/j8"; REPOS_DIR = os.path.join(WORK, "repos"); JARS = os.path.join(WORK, "jars")
LOG = os.path.join(OUT, "logs"); os.makedirs(REPOS_DIR, exist_ok=True); os.makedirs(JARS, exist_ok=True); os.makedirs(LOG, exist_ok=True)
print("INPUT =", INPUT)

# 0) JDK 17 + git + Maven. apt cho Maven 3.6.3 (LUON co); nang 3.9 neu tai duoc (apache hay chan urllib -> co fallback apt)
subprocess.run("apt-get -qq update && apt-get -qq install -y openjdk-17-jdk-headless git maven", shell=True)
MVN = "mvn"
MVN_HOME = "/kaggle/working/maven3.9"
if not os.path.exists(os.path.join(MVN_HOME, "bin", "mvn")):
    for url in ["https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz",
                "https://archive.apache.org/dist/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz",
                "https://downloads.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz"]:
        try:
            urllib.request.urlretrieve(url, "/tmp/mvn.tgz")
            subprocess.run(["tar", "xzf", "/tmp/mvn.tgz", "-C", "/kaggle/working"])
            _d = glob.glob("/kaggle/working/apache-maven-3.9*")
            if _d: os.rename(_d[0], MVN_HOME)
            break
        except Exception as e: print("tai maven 3.9 loi (se dung apt 3.6.3):", str(e)[:80])
if os.path.exists(os.path.join(MVN_HOME, "bin", "mvn")): MVN = os.path.join(MVN_HOME, "bin", "mvn")
_v = subprocess.run([MVN, "-v"], capture_output=True, text=True)
print("MVN:", _v.stdout.splitlines()[0] if _v.returncode == 0 else "MVN LOI: " + _v.stderr[:200])

# 1) jars PIT + JUnit5 + JaCoCo -- TAI QUA MAVEN (urllib toi maven central bi chan tren Kaggle -> thieu JUnit5 -> compile-error HANG LOAT)
POM = ('<project xmlns="http://maven.apache.org/POM/4.0.0"><modelVersion>4.0.0</modelVersion>'
       '<groupId>x</groupId><artifactId>libs</artifactId><version>1</version><dependencies>'
       '<dependency><groupId>org.junit.jupiter</groupId><artifactId>junit-jupiter-api</artifactId><version>5.10.2</version></dependency>'
       '<dependency><groupId>org.junit.jupiter</groupId><artifactId>junit-jupiter-engine</artifactId><version>5.10.2</version></dependency>'
       '<dependency><groupId>org.junit.jupiter</groupId><artifactId>junit-jupiter-params</artifactId><version>5.10.2</version></dependency>'
       '<dependency><groupId>org.junit.platform</groupId><artifactId>junit-platform-console-standalone</artifactId><version>1.10.2</version></dependency>'
       '<dependency><groupId>org.junit.platform</groupId><artifactId>junit-platform-launcher</artifactId><version>1.10.2</version></dependency>'
       '<dependency><groupId>org.junit.vintage</groupId><artifactId>junit-vintage-engine</artifactId><version>5.10.2</version></dependency>'
       '<dependency><groupId>org.pitest</groupId><artifactId>pitest</artifactId><version>1.15.0</version></dependency>'
       '<dependency><groupId>org.pitest</groupId><artifactId>pitest-entry</artifactId><version>1.15.0</version></dependency>'
       '<dependency><groupId>org.pitest</groupId><artifactId>pitest-command-line</artifactId><version>1.15.0</version></dependency>'
       '<dependency><groupId>org.pitest</groupId><artifactId>pitest-junit5-plugin</artifactId><version>1.2.1</version></dependency>'
       '<dependency><groupId>org.jacoco</groupId><artifactId>org.jacoco.agent</artifactId><version>0.8.11</version><classifier>runtime</classifier></dependency>'
       '<dependency><groupId>org.jacoco</groupId><artifactId>org.jacoco.cli</artifactId><version>0.8.11</version><classifier>nodeps</classifier></dependency>'
       '<dependency><groupId>org.mockito</groupId><artifactId>mockito-core</artifactId><version>5.11.0</version></dependency>'
       '</dependencies></project>')
_pom = "/kaggle/working/libs-pom.xml"; open(_pom, "w").write(POM)
_r = subprocess.run([MVN, "-q", "-f", _pom, "dependency:copy-dependencies", "-DoutputDirectory=" + JARS], capture_output=True, text=True)
_jars = glob.glob(os.path.join(JARS, "*.jar"))
print("jars tai qua Maven:", len(_jars))
if len(_jars) < 10: print("JAR LOI:", (_r.stdout + _r.stderr)[-600:])
def _find(*subs):
    for _j in _jars:
        _b = os.path.basename(_j)
        if all(x in _b for x in subs): return _j
    return ""
J5 = os.pathsep.join(_jars)      # tat ca jar tren classpath (thua khong sao)
PIT_CP = J5
JACOCO_AGENT = _find("org.jacoco.agent", "runtime")
JACOCO_CLI = _find("org.jacoco.cli")

# 2) 8 repo + commit pin
REPOS={
 "commons-math":("https://github.com/apache/commons-math","af1d9529e3638d60bc60b1effe4dfb588a44ca96"),
 "commons-cli":("https://github.com/apache/commons-cli","6ed9cde56ad8b2357f75d01052fd47685645e004"),
 "commons-csv":("https://github.com/apache/commons-csv","b346046e10a5833e5f6143fd0162155bb51ccc87"),
 "commons-collections":("https://github.com/apache/commons-collections","0cf09633b39e81c0e0a3c8d69bff2f7005169e14"),
 "gson":("https://github.com/google/gson","c9f3fd55854a743b66f857ace3c7b268ea3e2ef7"),
 "jsoup":("https://github.com/jhy/jsoup","d8c49e5ec72a08ca1ac4e08740e70dc0f47ad911"),
 "joda-time":("https://github.com/JodaOrg/joda-time","d6ba4f03c242c12feac308ac25b841a8c9457674"),
 "jfreechart":("https://github.com/jfree/jfreechart","98d9c90b6e0a1e553a506497daaf64a5704a4413"),
}
MVN_SKIP=["-q","-DskipTests","-Dmaven.test.skip=true","-Drat.skip=true","-Dcheckstyle.skip=true","-Dspotbugs.skip=true",
          "-Denforcer.skip=true","-Dmaven.enforcer.skip=true","-Dmaven.javadoc.skip=true","-Danimal.sniffer.skip=true","-Dpmd.skip=true"]
built=set()
for rp,(url,commit) in REPOS.items():
    d=os.path.join(REPOS_DIR,rp)
    if not os.path.isdir(d):
        subprocess.run(["git","clone","--quiet",url,d])
        subprocess.run(["git","-C",d,"checkout","--quiet",commit])
    extra=["-Dmaven.compiler.source=8","-Dmaven.compiler.target=8","-Dmaven.compiler.fork=false"] if rp=="joda-time" else []
    r=subprocess.run([MVN,"-f",d]+MVN_SKIP+extra+["install"],capture_output=True,text=True,cwd=d)
    open(os.path.join(LOG,rp+"_build.log"),"w").write(r.stdout[-4000:]+"\n==ERR==\n"+r.stderr[-2000:])
    ok=r.returncode==0
    if ok: built.add(rp)
    print(("BUILD OK  " if ok else "BUILD LOI ")+rp)
print("== [DBG] target/classes cua repo build OK ==")
for _rp in sorted(built):
    _c=glob.glob(os.path.join(REPOS_DIR,_rp,"**","target","classes"),recursive=True)
    print("  ",_rp,"->",len(_c),"dir; vd:",_c[:2])

# 3) GT + tests
_t=glob.glob(f"{INPUT}/**/generated_tests/gpt4o/java",recursive=True); TESTS=_t[0] if _t else f"{INPUT}/generated_tests/gpt4o/java"
gt={}
for r in csv.DictReader(open(f"{INPUT}/csv/full_ground_truth.csv")):
    if r.get("language")=="java":
        fp=r["file"]  # data-research/raw/<repo>/<module?>/src/main/java/<pkg>/<Class>.java
        m=re.search(r"raw/([^/]+)/(.*)src/main/java/(.+)\.java$", fp)
        if not m: continue
        repo=m.group(1); module=m.group(2).strip("/"); fq=m.group(3).replace("/",".")
        cls=os.path.basename(fp).replace(".java","")
        gt[r["func_id"]]={"repo":repo,"module":module,"fqcn":fq,"class":cls,"cc":r["cc"],
                          "start":int(r["start_line"]),"end":int(r["end_line"])}

KNOWN={"Arrays","Assertions","Mockito","Object","Objects","String","Integer","Double","Math","Test","Executable","System","Class","List","Map","Set"}
def normalize(src,info):
    cls,fq=info["class"],info["fqcn"]; mth=""
    if not re.search(rf"\b{cls}\b",src):
        src=re.sub(r"(package\s+[\w.]+\s*;)",rf"\1\nimport static {fq}.*;",src,count=1)
    return src
def test_blocks(src):
    blocks=[]
    for m in re.finditer(r"@Test\b",src):
        i=src.find("{",m.end())
        if i<0: continue
        depth=0; j=i; in_s=in_c=in_lc=in_bc=esc=False
        while j<len(src):
            ch=src[j]
            if in_lc:
                if ch=="\n": in_lc=False
            elif in_bc:
                if ch=="*" and src[j:j+2]=="*/": in_bc=False; j+=1
            elif in_s:
                if esc: esc=False
                elif ch=="\\": esc=True
                elif ch=='"': in_s=False
            elif in_c:
                if esc: esc=False
                elif ch=="\\": esc=True
                elif ch=="'": in_c=False
            else:
                if ch=="/" and src[j:j+2]=="//": in_lc=True; j+=1
                elif ch=="/" and src[j:j+2]=="/*": in_bc=True; j+=1
                elif ch=='"': in_s=True
                elif ch=="'": in_c=True
                elif ch=="{": depth+=1
                elif ch=="}":
                    depth-=1
                    if depth==0: blocks.append((src.count("\n",0,m.start())+1, src.count("\n",0,j)+1)); break
            j+=1
    return blocks
def moduledir(info):
    d=os.path.join(REPOS_DIR,info["repo"]); 
    return os.path.join(d,info["module"]) if info["module"] else d
def classpath_for(info):
    md=moduledir(info)
    allcls=glob.glob(os.path.join(REPOS_DIR,info["repo"],"**","target","classes"),recursive=True)  # DUNG HET target/classes cua repo (chac ham nam trong 1 module nao do)
    cpf=os.path.join(md,"cp.txt")
    if not os.path.exists(cpf):
        subprocess.run([MVN,"-f",md,"-q","dependency:build-classpath","-Dmdep.outputFile=cp.txt"],capture_output=True,text=True,cwd=md)
    deps=open(cpf).read().strip() if os.path.exists(cpf) else ""
    app_cp=os.pathsep.join([x for x in (allcls+[deps]) if x])
    return app_cp, os.path.join(md,"target","classes"), os.path.join(md,"src","main","java")

def pit_score(rep,cls,s,e):
    xmlf=os.path.join(rep,"mutations.xml")
    if not os.path.exists(xmlf): return None
    try: root=ET.parse(xmlf).getroot()
    except Exception: return None
    tot=killed=0
    for mu in root.findall("mutation"):
        if not (mu.findtext("mutatedClass","")).split("$")[0].endswith(cls): continue
        ln=int(mu.findtext("lineNumber","-1"))
        if s<=ln<=e:
            tot+=1
            if mu.get("status") in ("KILLED","TIMED_OUT") or mu.get("detected")=="true": killed+=1
    return round(killed/tot*100,2) if tot else None

def jacoco_branch(xmlf,cls,s,e):
    if not os.path.exists(xmlf): return None
    try: root=ET.parse(xmlf).getroot()
    except Exception: return None
    cov=mis=0
    for c in root.iter("class"):
        if not (c.get("name","")).split("$")[0].endswith(cls.replace(".","/")): continue
        for ln in c.iter("line"):
            nr=int(ln.get("nr","-1"))
            if s<=nr<=e:
                cov+=int(ln.get("cb","0")); mis+=int(ln.get("mb","0"))
    t=cov+mis
    return round(cov/t*100,2) if t else None

# ---- GHI CSV TUNG DONG (incremental) — chet giua chung van con file; moi dong con in ra log voi prefix [CSV] de xem live/khoi phuc ----
FIELDS=["function_id","language","cc","branch_coverage","mutation_score","compiled","note"]
CSVF=os.path.join(OUT,"metrics_java_gpt.csv")
rows=[]; done=set()
if os.path.exists(CSVF):   # resume trong cung session: bo qua ham da do roi
    try:
        for _r in csv.DictReader(open(CSVF,encoding="utf-8")):
            if _r.get("function_id"): rows.append(_r); done.add(_r["function_id"])
    except Exception: rows=[]; done=set()
_csv=open(CSVF,"a" if done else "w",newline="",encoding="utf-8")
_w=csv.DictWriter(_csv,fieldnames=FIELDS)
if not done:
    _w.writeheader(); _csv.flush(); print("[CSV] "+",".join(FIELDS))
else:
    print("Resume: bo qua",len(done),"ham da do trong",CSVF)
def save_row(row):
    rows.append(row); _w.writerow({k:row.get(k,"") for k in FIELDS}); _csv.flush(); os.fsync(_csv.fileno())
    print("[CSV] "+",".join(str(row.get(k,"")) for k in FIELDS))

_dbg=[0]; _cerr=[]
TC=os.path.join(WORK,"tclasses")
for fid in sorted(gt):
    if fid in done: continue
    info=gt[fid]; row={"function_id":fid,"language":"java","cc":info["cc"],"branch_coverage":"","mutation_score":"","compiled":0}
    tf=os.path.join(TESTS,fid+"_Test.java")
    if info["repo"] not in built or not os.path.exists(tf):
        row["note"]="no-build" if info["repo"] not in built else "no-test"; save_row(row); print(fid,row["note"]); continue
    app_cp,classes,srcdir=classpath_for(info)
    if _dbg[0]<5: print("  [DBG]",fid,"classes_dir_exist=",os.path.isdir(classes),"| cp_len=",len(app_cp),"| srcdir_exist=",os.path.isdir(srcdir))
    src=normalize(open(tf,encoding="utf-8").read(),info)
    _cm=re.search(r"public\s+class\s+(\w+)",src) or re.search(r"class\s+(\w+)",src)
    tname=_cm.group(1) if _cm else fid.replace("-","_")+"_Test"
    tf2=os.path.join(WORK,tname+".java"); c1=None
    for _rnd in range(4):     # prune @Test loi compile, giu phan chay duoc
        open(tf2,"w",encoding="utf-8").write(src)
        shutil.rmtree(TC,ignore_errors=True); os.makedirs(TC)
        c1=subprocess.run(["javac","-encoding","UTF-8","-nowarn","-proc:none","-cp",app_cp+os.pathsep+J5,"-d",TC,tf2],capture_output=True,text=True)
        if c1.returncode==0: break
        errl=sorted({int(m.group(1)) for m in re.finditer(r"\.java:(\d+): error",c1.stderr)})
        blocks=test_blocks(src); bad=set(); outside=False
        for el in errl:
            hit=next((bl for bl in blocks if bl[0]<=el<=bl[1]),None)
            if hit is None: outside=True; break
            bad.add(hit)
        if outside or not bad: break
        lines=src.splitlines(keepends=True)
        for (s0,e0) in sorted(bad,reverse=True): del lines[s0-1:e0]
        src="".join(lines)
    if c1.returncode!=0 or not re.search(r"@Test\b",src):
        open(os.path.join(LOG,fid+"_javac.log"),"w").write(c1.stderr[-2000:])
        errs=[l.strip() for l in c1.stderr.splitlines() if "error:" in l]; _cerr.extend(errs[:2])
        if _dbg[0]<5: print("  [DBG]",fid,"| JAVAC:",(errs[0][:200] if errs else c1.stderr.strip()[-250:])); _dbg[0]+=1
        row["note"]="compile-error"; save_row(row); print(fid,"compile-error"); continue
    run_cp=os.pathsep.join([classes,TC,J5,app_cp])
    # coverage JaCoCo
    ex=os.path.join(WORK,"jacoco.exec"); [os.remove(ex) for _ in range(1) if os.path.exists(ex)]
    subprocess.run(["java",f"-javaagent:{JACOCO_AGENT}=destfile={ex}","-cp",run_cp,
                    "org.junit.platform.console.ConsoleLauncher","-c",f"{info['fqcn'].rsplit('.',1)[0]}.{tname}","--disable-banner"],capture_output=True,text=True)
    jx=os.path.join(WORK,"jacoco.xml")
    subprocess.run(["java","-jar",JACOCO_CLI,"report",ex,"--classfiles",classes,"--sourcefiles",srcdir,"--xml",jx],capture_output=True,text=True)
    bc=jacoco_branch(jx,info["fqcn"],info["start"],info["end"])
    rep=os.path.join(WORK,"pit"); shutil.rmtree(rep,ignore_errors=True)
    pit=subprocess.run(["java","-cp",PIT_CP,"org.pitest.mutationtest.commandline.MutationCoverageReport","--classPath",run_cp,
                        "--targetClasses",info["fqcn"],"--targetTests",f"{info['fqcn'].rsplit('.',1)[0]}.{tname}","--sourceDirs",srcdir,
                        "--reportDir",rep,"--outputFormats","XML","--timestampedReports","false","--mutators","DEFAULTS"],capture_output=True,text=True,timeout=600)
    open(os.path.join(LOG,fid+"_pit.log"),"w").write((pit.stdout+"\n==ERR==\n"+pit.stderr)[-3000:])
    ms=pit_score(rep,info["class"],info["start"],info["end"])
    row["branch_coverage"]= bc if bc is not None else 0.0
    row["mutation_score"]= ms if ms is not None else ""
    row["compiled"]=1; row["note"]="ok"
    save_row(row); print(fid,"bc=",bc,"ms=",ms)

_csv.close()
import pandas as pd
df=pd.DataFrame(rows)   # CSV da duoc ghi tung dong o tren — KHONG ghi lai o day
df["compiled"]=pd.to_numeric(df["compiled"],errors="coerce").fillna(0).astype(int)  # resume doc tu CSV ra string
print("\n== Do duoc:", int((df["compiled"]==1).sum()),"/",len(df)," | build OK repos:",sorted(built))
from collections import Counter as _C
if _cerr:
    print("== TOP LOI COMPILE (chup dong nay gui MS) ==")
    for _e,_c in _C(_cerr).most_common(6): print(f"  [{_c}x] {_e[:170]}")
print("Luu:",f"{OUT}/metrics_java_gpt.csv"," -> dua vao BAI-MS-8LIB/03_PHAN-TICH/results/ roi chay analyze_8lib.py")
