package org.apache.commons.cli;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Bang chung CHAY THAT: ham private VAN kiem thu duoc bang reflection.
 *
 * Boi canh: 17/60 muc tieu Java trong dataset la `private`, va ca 17 deu KHONG bien dich
 * duoc (0%). Bao cao truoc do cua toi ket luan chung "khong the kiem thu bang bat ky cong
 * cu nao". Ket luan do SAI — day la phan bac bo.
 *
 * Muc tieu: DefaultParser.isShortOption(String), khai bao tai
 * data/raw/commons-cli/.../DefaultParser.java  ->  `private boolean isShortOption(final String token)`
 *
 * Ba buoc, moi buoc deu da chay:
 *   1. getDeclaredMethod + setAccessible(true)          -> bien dich rc=0
 *   2. invoke()                                          -> vao toi dong 735 BEN TRONG ham,
 *      that bai NPE 'this.options is null' => da vuot rao truy cap, chi thieu trang thai
 *   3. dung trang thai bang Field.setAccessible + set    -> ham chay day du, 5 nhanh phan biet duoc
 *
 * Bien dich & chay:
 *   MD=data/raw/commons-cli
 *   CP="$MD/target/classes;$(cat $MD/target/_cp.txt)"
 *   javac -cp "$CP" -d out ReflMain.java
 *   java -cp "out;$CP" org.apache.commons.cli.ReflMain
 *
 * Ket qua thu duoc:
 *   isShortOption("-a")      = true
 *   isShortOption("-x")      = false
 *   isShortOption("--alpha") = false
 *   isShortOption("notopt")  = false
 *   isShortOption("-")       = false
 */
public class ReflMain {

    public static void main(String[] args) throws Exception {
        DefaultParser parser = new DefaultParser();

        // Buoc 3: dung trang thai receiver. Khong co buoc nay thi invoke() nem NPE —
        // rao truy cap da vuot, nhung ham can `this.options` khac null.
        Options opts = new Options();
        opts.addOption("a", "alpha", false, "an option");
        Field optionsField = DefaultParser.class.getDeclaredField("options");
        optionsField.setAccessible(true);
        optionsField.set(parser, opts);

        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);

        for (String token : new String[] {"-a", "-x", "--alpha", "notopt", "-"}) {
            System.out.println("  isShortOption(\"" + token + "\") = " + m.invoke(parser, token));
        }
    }
}
