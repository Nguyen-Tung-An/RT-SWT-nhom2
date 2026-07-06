import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_055_Regression2 {

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
            System.out.format("%n%s%n", "JA_055_Regression2.test1001");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 64);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1002");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1217);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1217 + "'", int1 == 1217);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1003");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-2), (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30L + "'", long2 == 30L);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1004");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-221L), (-221L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1005");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-9L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-8L) + "'", long1 == (-8L));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1006");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) '#', (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1007");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1008");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1009");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-8.152424001869452E-48d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1010");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(52, (-1004));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52208) + "'", int2 == (-52208));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1011");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 10, 100.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1012");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-35L), (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1013");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(696L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 696L + "'", long2 == 696L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1014");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 1023L, 1.7621186826519104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0d + "'", double2 == 1023.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1015");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 52, (long) (-1154));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1016");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.9380278686469384d, (-1013));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0686368200076951E-305d + "'", double2 == 1.0686368200076951E-305d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1017");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(127, (-1151));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-146177) + "'", int2 == (-146177));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1018");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (-221L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-221.0d) + "'", double1 == (-221.0d));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1019");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-52208), (float) (-10));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1020");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 50688.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1021");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-91040L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21681296741429015d + "'", double1 == 0.21681296741429015d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1022");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4342944819032518d + "'", double1 == 0.4342944819032518d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1023");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1024");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1120 + "'", int1 == 1120);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1025");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(3358L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3358 + "'", int1 == 3358);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1026");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 3428);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1027");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-0.5063722200659099d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837862480783425d) + "'", double1 == (-0.008837862480783425d));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1028");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-1.4E-45f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.0f) + "'", float1 == (-0.0f));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1029");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1030");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-12L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.0d) + "'", double1 == (-12.0d));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1031");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) 100, 1013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101300 + "'", int2 == 101300);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1032");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1033");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-3325));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1034");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-8.999999046325682d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4121193541631004d) + "'", double1 == (-0.4121193541631004d));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1035");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(4.923458286012058E41d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1036");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 1217);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9333529894059777d) + "'", double1 == (-0.9333529894059777d));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1037");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-0.5477292602242684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1038");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(1120, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1039");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.9095811504246125E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1040");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(1.0267676341469947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5175872546629673d + "'", double1 == 0.5175872546629673d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1041");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(1.0000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1042");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 227.0f, (long) 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6892365373244917E148d + "'", double2 == 2.6892365373244917E148d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1043");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1044");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1L, (-1151L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1045");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((-0.5477292602242684d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1046");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1047");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 1120, 1120);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1048");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1049");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1040.7943593705909d, (-32));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.78177656282338E-97d + "'", double2 == 2.78177656282338E-97d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1050");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(630.2535746439055d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 630L + "'", long1 == 630L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1051");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.8623188722876839d, 1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7435938375035029d + "'", double2 == 0.7435938375035029d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1052");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) (-221L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1053");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-2.5343508798353414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5343508798353414d + "'", double1 == 2.5343508798353414d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1054");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(101L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 101L + "'", long1 == 101L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1055");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (-13444L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.765625E-4f + "'", float1 == 9.765625E-4f);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1056");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (-8L), 3363);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1057");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-1154L), (double) 7.629394E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1153.9999f) + "'", float2 == (-1153.9999f));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1058");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-49L), (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1059");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1060");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) Float.POSITIVE_INFINITY, (double) (-1378L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1061");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-149.0d) + "'", double1 == (-149.0d));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1062");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (short) 0, (double) (-33));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-33.0d) + "'", double2 == (-33.0d));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1063");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 1014.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1064");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 252.0f, (double) 227L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 252.0d + "'", double2 == 252.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1065");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-1154L), (-3360L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1066");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(4.251704920142453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression2.test1067");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 35L, 1.6574544541530771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.03922309737463d + "'", double2 == 35.03922309737463d);
    }
}

