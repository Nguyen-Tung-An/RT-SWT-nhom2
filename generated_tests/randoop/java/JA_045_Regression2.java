import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_045_Regression2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1001");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 64);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1002");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1217);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1217 + "'", int1 == 1217);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1003");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-2), (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30L + "'", long2 == 30L);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1004");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-221L), (-221L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1005");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-9L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-8L) + "'", long1 == (-8L));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1006");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) '#', (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1007");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1008");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1009");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-8.152424001869452E-48d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1010");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(52, (-1004));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52208) + "'", int2 == (-52208));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1011");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 10, 100.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1012");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-35L), (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1013");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(696L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 696L + "'", long2 == 696L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1014");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 1023L, 1.7621186826519104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0d + "'", double2 == 1023.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1015");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 52, (long) (-1154));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1016");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.9380278686469384d, (-1013));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0686368200076951E-305d + "'", double2 == 1.0686368200076951E-305d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1017");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(127, (-1151));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-146177) + "'", int2 == (-146177));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1018");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (-221L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-221.0d) + "'", double1 == (-221.0d));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1019");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-52208), (float) (-10));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1020");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 50688.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1021");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-91040L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21681296741429015d + "'", double1 == 0.21681296741429015d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1022");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4342944819032518d + "'", double1 == 0.4342944819032518d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1023");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1024");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1120 + "'", int1 == 1120);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1025");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(3358L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3358 + "'", int1 == 3358);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1026");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 3428);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1027");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-0.5063722200659099d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837862480783425d) + "'", double1 == (-0.008837862480783425d));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1028");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-1.4E-45f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.0f) + "'", float1 == (-0.0f));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1029");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1030");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-12L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.0d) + "'", double1 == (-12.0d));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1031");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) 100, 1013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101300 + "'", int2 == 101300);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1032");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1033");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-3325));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1034");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-8.999999046325682d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4121193541631004d) + "'", double1 == (-0.4121193541631004d));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1035");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(4.923458286012058E41d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1036");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 1217);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9333529894059777d) + "'", double1 == (-0.9333529894059777d));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1037");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-0.5477292602242684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1038");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(1120, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1039");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.9095811504246125E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1040");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(1.0267676341469947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5175872546629673d + "'", double1 == 0.5175872546629673d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1041");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(1.0000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1042");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 227.0f, (long) 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6892365373244917E148d + "'", double2 == 2.6892365373244917E148d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1043");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1044");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1L, (-1151L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1045");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((-0.5477292602242684d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1046");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1047");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 1120, 1120);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1048");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1049");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1040.7943593705909d, (-32));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.78177656282338E-97d + "'", double2 == 2.78177656282338E-97d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1050");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(630.2535746439055d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 630L + "'", long1 == 630L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1051");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.8623188722876839d, 1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7435938375035029d + "'", double2 == 0.7435938375035029d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1052");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) (-221L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1053");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-2.5343508798353414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5343508798353414d + "'", double1 == 2.5343508798353414d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1054");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(101L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 101L + "'", long1 == 101L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1055");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (-13444L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.765625E-4f + "'", float1 == 9.765625E-4f);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1056");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (-8L), 3363);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1057");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-1154L), (double) 7.629394E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1153.9999f) + "'", float2 == (-1153.9999f));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1058");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-49L), (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1059");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1060");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) Float.POSITIVE_INFINITY, (double) (-1378L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1061");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-149.0d) + "'", double1 == (-149.0d));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1062");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (short) 0, (double) (-33));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-33.0d) + "'", double2 == (-33.0d));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1063");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 1014.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1064");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 252.0f, (double) 227L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 252.0d + "'", double2 == 252.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1065");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-1154L), (-3360L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1066");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(4.251704920142453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1067");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 35L, 1.6574544541530771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.03922309737463d + "'", double2 == 35.03922309737463d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1068");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(10L, (-91047L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91037L) + "'", long2 == (-91037L));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1069");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-221.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.091315000688712d) + "'", double1 == (-6.091315000688712d));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1070");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((-0.03678794086717075d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993234000150693d + "'", double1 == 0.9993234000150693d);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1071");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.401298464324817E-45d) + "'", double1 == (-1.401298464324817E-45d));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1072");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(252.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.401400540781544d + "'", double1 == 2.401400540781544d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1073");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.219723898031069d + "'", double1 == 4.219723898031069d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1074");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((-0.9899924966004454d), (double) 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.01360972109468d + "'", double2 == 36.01360972109468d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1075");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) (-1014), 3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1013.9999999999999d) + "'", double2 == (-1013.9999999999999d));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1076");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 1023, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1077");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 4, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9999998f + "'", float2 == 3.9999998f);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1078");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(12L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1079");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(1.0001098394142234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000366117976345d + "'", double1 == 1.0000366117976345d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1080");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 93141081L, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963257212565d + "'", double2 == 1.5707963257212565d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1081");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3, 3358);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1082");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.03224129401095795d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.858655269864414E-48d + "'", double2 == 1.858655269864414E-48d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1083");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(7.374241268949272E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4193459.4473932735d + "'", double1 == 4193459.4473932735d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1084");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.000000000000002d + "'", double1 == 11.000000000000002d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1085");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1000L, 28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E84d + "'", double2 == 1.0E84d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1086");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-3361L), (float) 12L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1087");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-2602L), 2.718281828459045d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1088");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1089");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-3261L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999640215871468d + "'", double1 == 0.999640215871468d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1090");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3.8146973E-6f, 35.105399244260575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.025494840663478E-191d + "'", double2 == 6.025494840663478E-191d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1091");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-94080L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-94079.99999999999d) + "'", double1 == (-94079.99999999999d));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1092");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0.8342233605065102d, (double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1093");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(0.999640215871468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852182389681465d + "'", double1 == 0.7852182389681465d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1094");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1095");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, 5.433432603069162E19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1096");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(3395);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3396 + "'", int1 == 3396);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1097");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) 1, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1098");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4645918875615231d + "'", double1 == 1.4645918875615231d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1099");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309447d + "'", double1 == 5.267884728309447d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1100");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.8979266153021832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8979266153021833d + "'", double1 == 0.8979266153021833d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1101");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 64);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1102");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1103");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.8623188722876839d, 0.5063722200659099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15042556784413585d) + "'", double2 == (-0.15042556784413585d));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1104");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (-12700L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.765625E-4f + "'", float1 == 9.765625E-4f);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1105");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1106");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 63, (-0.8536306738324039d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 63.00578295146651d + "'", double2 == 63.00578295146651d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1107");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(27.999998f, (float) (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 27.999998f + "'", float2 == 27.999998f);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1108");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) (-35.999996f), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.999996185302734d + "'", double2 == 35.999996185302734d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1109");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-1013.99994f), (float) 252);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1013.99994f) + "'", float2 == (-1013.99994f));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1110");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 227L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 227.0d + "'", double1 == 227.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1111");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 648, (long) 3358);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 648L + "'", long2 == 648L);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1112");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(630.2535746439055d, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 630.2535746439055d + "'", double2 == 630.2535746439055d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1113");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6040640580642322d) + "'", double1 == (-0.6040640580642322d));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1114");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(4.923458286012058E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1115");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 6.1118044E-10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1116");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1117");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.318496768257947d) + "'", double1 == (-0.318496768257947d));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1118");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 396);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 396 + "'", int1 == 396);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1119");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 1000L, (float) 89L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89.0f + "'", float2 == 89.0f);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1120");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1121");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.9226350743220142d, (double) (-8L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9226350743220142d + "'", double2 == 0.9226350743220142d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1122");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 1013, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.915824896517067d + "'", double2 == 13.915824896517067d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1123");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(930L, (-13444L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13444L) + "'", long2 == (-13444L));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1124");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-3360.0002f), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3360.0002f + "'", float2 == 3360.0002f);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1125");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-0.6925076809349759d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8295607199719183d) + "'", double1 == (-0.8295607199719183d));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1126");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 11, (-1151));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1127");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, 2.3933408563492384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1128");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 200L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8732972972139946d) + "'", double1 == (-0.8732972972139946d));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1129");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 227, (double) (-2602L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 226.99998f + "'", float2 == 226.99998f);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1130");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1131");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(9.765625E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1132");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-221L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 221L + "'", long1 == 221L);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1133");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 64L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.806179973983887d + "'", double1 == 1.806179973983887d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1134");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-1004), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6024) + "'", int2 == (-6024));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1135");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (short) 100, 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7179869184E12d + "'", double2 == 1.7179869184E12d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1136");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.063437068895561d + "'", double1 == 2.063437068895561d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1137");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 1023L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.00006f + "'", float1 == 1023.00006f);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1138");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9E-324d) + "'", double1 == (-4.9E-324d));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1139");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1.5707853434566212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1140");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(18.432576789051176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.432576789051176d + "'", double1 == 18.432576789051176d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1141");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(18.432576789051176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1056.108855563435d + "'", double1 == 1056.108855563435d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1142");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.03224129401095795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03224688243525382d + "'", double1 == 0.03224688243525382d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1143");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-6024), 1013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6102312) + "'", int2 == (-6102312));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1144");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-10080L), (long) 1217);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10080L) + "'", long2 == (-10080L));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1145");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.6925076809349759d), (long) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47956688815393844d + "'", double2 == 0.47956688815393844d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1146");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 3394, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3428L + "'", long2 == 3428L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1147");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (short) 1, 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1148");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(3.0d, 22026.465794806754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1149");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-10080L), 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1150");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 696L, (float) 3428);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 696.0f + "'", float2 == 696.0f);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1151");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(89L, (long) 16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1424L + "'", long2 == 1424L);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1152");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((-0.9999999968999939d), (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00499987497525d + "'", double2 == 100.00499987497525d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1153");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-3325), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3325) + "'", int2 == (-3325));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1154");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(4.503599627370496E15d, (-1.3067790607827852d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3067790607827852d) + "'", double2 == (-1.3067790607827852d));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1155");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1156");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(4095.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4095.9999999999986d + "'", double1 == 4095.9999999999986d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1157");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 11, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1158");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 3358);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1159");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-200.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-200.00000000000003d) + "'", double1 == (-200.00000000000003d));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1160");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 2, 252.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1161");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 152, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1162");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-1151));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4073440961692225d) + "'", double1 == (-2.4073440961692225d));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1163");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 1023, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1164");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1165");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(0L, (-3261L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3261L + "'", long2 == 3261L);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1166");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((-0.8536306738324038d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-48.9094348735053d) + "'", double1 == (-48.9094348735053d));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1167");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-101128.99999999999d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1168");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-1L), (double) 93141081L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1169");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (-1013), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1013L) + "'", long2 == (-1013L));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1170");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1171");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(2.2737367544323206E-13d, (-103.27892990343184d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2737367544323203E-13d + "'", double2 == 2.2737367544323203E-13d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1172");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((-3.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1173");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1174");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-17.715091907742444d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999992d) + "'", double1 == (-0.9999999999999992d));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1175");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 3396, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3395.9998f + "'", float2 == 3395.9998f);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1176");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-94080L), 6.025494840663478E-191d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1177");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 63.000004f, (double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1115182938793198d + "'", double2 == 1.1115182938793198d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1178");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-3261L), (long) 3358);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6619L) + "'", long2 == (-6619L));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1179");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 32, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 129L + "'", long2 == 129L);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1180");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(649);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 648 + "'", int1 == 648);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1181");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (-103747L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1182");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1183");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(5.0d, (double) 9.765625E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.765625E-4d + "'", double2 == 9.765625E-4d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1184");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 99000L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5324596581265606d) + "'", double1 == (-0.5324596581265606d));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1185");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(99000L, 1424L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 69L + "'", long2 == 69L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1186");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 1424L, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4772935501794975d + "'", double2 == 0.4772935501794975d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1187");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 0, (long) 3358);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1188");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) (-10.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.99822295029797d) + "'", double1 == (-2.99822295029797d));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1189");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(0.9999999999854481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848000341d + "'", double1 == 0.8414709848000341d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1190");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1191");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-11), (-1019));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1008 + "'", int2 == 1008);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1192");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 696.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.147491593880535d + "'", double1 == 12.147491593880535d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1193");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-8L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9L) + "'", long1 == (-9L));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1194");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-3361.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48305403451165263d + "'", double1 == 0.48305403451165263d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1195");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-10.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1196");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(3.2947553997329484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1197");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-1036299));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1036298.94f) + "'", float1 == (-1036298.94f));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1198");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 3396);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1199");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1014.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1013.99994f + "'", float1 == 1013.99994f);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1200");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.47956688815393844d, 200.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4795668881539385d + "'", double2 == 0.4795668881539385d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1201");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1013));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1014) + "'", int1 == (-1014));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1202");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-12700L), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1203");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.17278084418222234d, (double) (-303L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1204");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 105L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.00000000000001d + "'", double1 == 105.00000000000001d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1205");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.8414709848000341d, 65);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.104479980411714E19d + "'", double2 == 3.104479980411714E19d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1206");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-1151));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1207");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(7.737125245533627E25d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1208");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1209");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 930L, (float) 93141081L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 930.0f + "'", float2 == 930.0f);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1210");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(22026.465794806754d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.353852668370216E17d + "'", double2 == 2.353852668370216E17d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1211");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 252, 30L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1212");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (-3361));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414062E-4f + "'", float1 == 2.4414062E-4f);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1213");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 33, 1378L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1378L + "'", long2 == 1378L);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1214");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(0.21681296741429015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6639147465429942d) + "'", double1 == (-0.6639147465429942d));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1215");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-32), (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1216");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 65, 227.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 65.0f + "'", float2 == 65.0f);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1217");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(5.267884728309447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.345643037242276d + "'", double1 == 2.345643037242276d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1218");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-1004), (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1004) + "'", int2 == (-1004));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1219");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1220");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(4.2949673E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1221");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(4.869469782221848E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000486946d + "'", double1 == 1.0000000000486946d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1222");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((-0.50637222006591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5309725442679148d) + "'", double1 == (-0.5309725442679148d));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1223");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-35.0f), (float) 95L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1224");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(4.923458286012058E41d, 1024.0000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.923458286012058E41d + "'", double2 == 4.923458286012058E41d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1225");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 1120);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1226");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-35), 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1227");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(4.097244099359933E56d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 131.0482269650408d + "'", double1 == 131.0482269650408d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1228");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 65.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1344640137963142d + "'", double1 == 1.1344640137963142d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1229");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3072.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1230");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 630L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11044716389997422d) + "'", double1 == (-0.11044716389997422d));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1231");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(1.4886096985958848d, (double) 34L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.488609698595885d + "'", double2 == 1.488609698595885d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1232");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 30L, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1233");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1008);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1008 + "'", int1 == 1008);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1234");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1235");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 100, 1217);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1236");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1237");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-3.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1238");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 3423);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3423 + "'", int1 == 3423);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1239");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(1023.0d, 1013);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.97968787580151E307d + "'", double2 == 8.97968787580151E307d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1240");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-1013L), (-6024));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1241");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 696L, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.39143779E13f + "'", float2 == 2.39143779E13f);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1242");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 11L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.000001f + "'", float1 == 11.000001f);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1243");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-6619L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6619.0d) + "'", double1 == (-6619.0d));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1244");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(3423, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1245");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 99000L, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1246");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(3.104479980411714E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1247");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1248");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.063437068895561d, (long) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.407280917310196d + "'", double2 == 37.407280917310196d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1249");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(35.999996185302734d, (double) (-90023L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1250");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(5.433432603069162E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.134835036928045d + "'", double1 == 46.134835036928045d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1251");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 1120);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.02197642307216d + "'", double1 == 7.02197642307216d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1252");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 101L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7627825445142729d + "'", double1 == 1.7627825445142729d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1253");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 252, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2520L + "'", long2 == 2520L);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1254");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 50688.0f, (double) (-103747L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50688.0d + "'", double2 == 50688.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1255");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1013.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1013.9999f + "'", float1 == 1013.9999f);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1256");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3.814697265606496E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015624999999974735d + "'", double1 == 0.015624999999974735d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1257");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(3363);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3364 + "'", int1 == 3364);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1258");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3360.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.977744774437014d + "'", double1 == 14.977744774437014d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1259");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 3395, (long) (-1004));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3395L + "'", long2 == 3395L);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1260");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-1.421946954983242d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1261");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1262");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-33.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-33.000004f) + "'", float1 == (-33.000004f));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1263");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(8.81152709771016E14d, 252);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.376907075094279E90d + "'", double2 == 6.376907075094279E90d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1264");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-221.0d), (-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5758060075902711d) + "'", double2 == (-1.5758060075902711d));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1265");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1266");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1267");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-1015), 2.397895272798371d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1268");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(1.9095811504246125E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9095811504246125E-14d + "'", double1 == 1.9095811504246125E-14d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1269");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.434045323243469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4340453232434687d + "'", double1 == 1.4340453232434687d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1270");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1271");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1023.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1272");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-127), 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1273");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-91040), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-91137) + "'", int2 == (-91137));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1274");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 2L, (float) (-1154L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1154.0f) + "'", float2 == (-1154.0f));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1275");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-3.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1276");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-11), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-108L) + "'", long2 == (-108L));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1277");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(7.896296018268069E13d, (double) 152);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-63.3125d) + "'", double2 == (-63.3125d));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1278");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1279");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(252, (-91040));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90788) + "'", int2 == (-90788));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1280");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1281");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-1023), (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32736 + "'", int2 == 32736);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1282");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-1.5103259118461393E-7d), (double) (-1013));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.141592653440699d) + "'", double2 == (-3.141592653440699d));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1283");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(3072.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1284");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 649);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 649.0d + "'", double1 == 649.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1285");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1L), (-108L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107L + "'", long2 == 107L);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1286");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-32));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-31L) + "'", long1 == (-31L));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1287");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-1154), (float) (-91047L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1154.0f) + "'", float2 == (-1154.0f));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1288");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 3394);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1289");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1.2548062764226884d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549023d + "'", double2 == 1.5574077246549023d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1290");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1291");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06048850250843339d + "'", double1 == 0.06048850250843339d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1292");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-103747L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1810.726739066557d) + "'", double1 == (-1810.726739066557d));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1293");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 254.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14553.12799632291d + "'", double1 == 14553.12799632291d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1294");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(227, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1295");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(51.99999999999999d, (-6102312));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1296");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-0.26602380077804594d), (-3361));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1297");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(6.376907075094279E90d, 63L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1298");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-1014));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1014.0d) + "'", double1 == (-1014.0d));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1299");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-52208));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1300");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 1023);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.07608628613008d + "'", double1 == 10.07608628613008d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1301");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-3325.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1302");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(1.858655269864414E-48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0649310253298E-46d + "'", double1 == 1.0649310253298E-46d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1303");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(1022.99994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1304");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-12.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1305");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(32736, (-91040));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1306");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1972245773362196d + "'", double1 == 2.1972245773362196d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1307");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(11L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1308");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 97.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1309");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-1151));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1151.0f + "'", float1 == 1151.0f);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1310");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 101);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8920048697881602d + "'", double1 == 0.8920048697881602d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1311");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(0.6557942026326724d, 6.376907075094279E90d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6557942026326724d + "'", double2 == 0.6557942026326724d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1312");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) ' ', 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1313");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 1014.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1314");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1.5707963257212565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02741556776206522d + "'", double1 == 0.02741556776206522d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1315");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.26602380077804594d), 3396);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1316");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-1151), 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1317");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 152);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 152.0d + "'", double1 == 152.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1318");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1319");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-1154L), (-90023.99f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90023.99f) + "'", float2 == (-90023.99f));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1320");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(3.80204032E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.7562185955373d + "'", double1 == 19.7562185955373d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1321");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1322");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.633123935319537E16d) + "'", double1 == (-1.633123935319537E16d));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1323");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(20.0d, (-0.15042556784413585d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5783174633666084d + "'", double2 == 1.5783174633666084d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1324");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-2), 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1325");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(12.0d, (double) 101300);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.0d + "'", double2 == 12.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1326");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (-12), (-1151L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1327");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 1013.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1328");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-19), (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1329");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 3, (long) 3358);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3355L) + "'", long2 == (-3355L));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1330");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3358);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3358 + "'", int1 == 3358);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1331");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 100.0f, 4.911649328672854E-164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1332");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(0.06048850250843339d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1333");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.0d, (long) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E29d + "'", double2 == 1.5845632502852868E29d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1334");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.5063722200659099d, 0.015624999999974735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5063722200659099d + "'", double2 == 0.5063722200659099d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1335");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1336");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 3428);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.832879481552068d + "'", double1 == 8.832879481552068d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1337");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(1.560895660206908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1338");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 4.2949673E10f, (double) 8.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.157920892373162E85d + "'", double2 == 1.157920892373162E85d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1339");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-2.4457272005608357E-47d), 5.433432603069162E19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4457272005608357E-47d) + "'", double2 == (-2.4457272005608357E-47d));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1340");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1341");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 31L, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.0d + "'", double2 == 31.0d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1342");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-1013L), (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1013.0f + "'", float2 == 1013.0f);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1343");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1344");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(3358, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1345");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(252.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14438.536437296745d + "'", double1 == 14438.536437296745d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_045_Regression2.test1346");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(1023.0d, (double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1022.9999999999999d + "'", double2 == 1022.9999999999999d);
    }
}

