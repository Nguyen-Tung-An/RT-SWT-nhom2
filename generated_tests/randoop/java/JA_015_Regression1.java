import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_015_Regression1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0501");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 1024, (-91047L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90023L) + "'", long2 == (-90023L));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0502");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-200L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 200L + "'", long1 == 200L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0503");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(1L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0504");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0505");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 10.0f, 1.6574544541530771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.4416878563681d + "'", double2 == 45.4416878563681d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0506");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.9867228626928289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0507");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0508");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.8342233605065102d, (-3361.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0509");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 8L, (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.999999999999999d + "'", double2 == 7.999999999999999d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0510");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.5063722200659099d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0511");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-2L), (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0512");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0513");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 3360.0002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3360.0d + "'", double1 == 3360.0d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0514");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(7.374241268949272E19d, 0.1858264752250012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03678794086717075d) + "'", double2 == (-0.03678794086717075d));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0515");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-12));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-11L) + "'", long1 == (-11L));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0516");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-11), 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0517");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(100L, (-127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12700L) + "'", long2 == (-12700L));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0518");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-3361L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3361) + "'", int1 == (-3361));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0519");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(2, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0520");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0521");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0522");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5385494443596428d + "'", double1 == 1.5385494443596428d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0523");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0524");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(252, 396);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 648 + "'", int2 == 648);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0525");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-0.5063722200659099d), 1.3841381659328928E109d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5063722200659099d + "'", double2 == 0.5063722200659099d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0526");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-12700L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0527");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 99L, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 396.0f + "'", float2 == 396.0f);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0528");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-127));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0529");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(7.600902709541988d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3337.802953724357d + "'", double2 == 3337.802953724357d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0530");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(127, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0531");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-90023L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-90024L) + "'", long1 == (-90024L));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0532");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1024, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0533");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0534");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 2, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0535");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 152, (float) 101L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101.0f + "'", float2 == 101.0f);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0536");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 34, (double) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.999996f + "'", float2 == 33.999996f);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0537");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-3361));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3361) + "'", int1 == (-3361));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0538");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-2.2894284851066637d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0539");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0540");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0541");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(396);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 397 + "'", int1 == 397);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0542");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(5.394796609446773E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609472941E-6d + "'", double1 == 5.394796609472941E-6d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0543");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(9.999999999999998d, (double) 3360.0002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3360.015125058972d + "'", double2 == 3360.015125058972d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0544");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(33.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.0f + "'", float1 == 34.0f);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0545");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(7.151039979174052E54d, (double) 227L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0546");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.0d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0547");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.5063722200659099d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0548");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999999999996d + "'", double1 == 9.999999999999996d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0549");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0550");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0551");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-3.9512813239549044E31d), (double) 3363);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.9512813239549044E31d) + "'", double2 == (-3.9512813239549044E31d));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0552");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-127));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0553");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(3360.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.643062867009476d + "'", double1 == 58.643062867009476d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0554");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1151L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1152L) + "'", long1 == (-1152L));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0555");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 6, 8.81152709771016E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0556");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(99L, (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3261L) + "'", long2 == (-3261L));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0557");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1013), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1014) + "'", int2 == (-1014));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0558");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(4.923458286012058E41d, 3360);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0559");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0560");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0561");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1.6574544541530771d, (double) 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6574544541530771d + "'", double2 == 1.6574544541530771d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0562");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.560895660206908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0563");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-3361L), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13444L) + "'", long2 == (-13444L));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0564");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0565");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0566");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5493061443340549d + "'", double1 == 0.5493061443340549d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0567");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(31L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0568");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (byte) 10, (float) 200L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200.0f + "'", float2 == 200.0f);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0569");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-10080L), (-91049L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-101129L) + "'", long2 == (-101129L));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0570");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 52, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0571");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(12L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0572");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0573");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.0d, 5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0574");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-11), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0575");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0576");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 227.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.429345628954441d + "'", double1 == 5.429345628954441d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0577");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4768639242040633d + "'", double1 == 0.4768639242040633d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0578");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 99, 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50688.0f + "'", float2 == 50688.0f);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0579");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.488609698595885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.430930905201998d + "'", double1 == 4.430930905201998d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0580");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 52.0f, (long) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.80204032E8d + "'", double2 == 3.80204032E8d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0581");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(5, (-1024));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1019) + "'", int2 == (-1019));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0582");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.8184464592320666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320666d + "'", double1 == 1.8184464592320666d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0583");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.3841381659328928E109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0584");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0585");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0586");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-35));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0587");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0588");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1014));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1015) + "'", int1 == (-1015));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0589");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0590");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(4.503599627370496E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0591");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0592");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(1.5385494443596428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03224129401095795d + "'", double1 == 0.03224129401095795d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0593");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-3.9512813239549044E31d), 5.429345628954441d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0594");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) 'a', (-3361));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3264) + "'", int2 == (-3264));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0595");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4219082547560243d) + "'", double1 == (-0.4219082547560243d));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0596");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.9867228626928289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6824293631138654d + "'", double1 == 1.6824293631138654d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0597");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (-3361), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3360L) + "'", long2 == (-3360L));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0598");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0599");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (byte) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0600");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-3360L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0601");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(8.030084094267563d, (double) 3363);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0602");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(5.394796609394437E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609342101E-6d + "'", double1 == 5.394796609342101E-6d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0603");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.015625d, (double) 11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015625d + "'", double2 == 0.015625d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0604");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0605");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(7.999999999999999d, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4095.999999999998d + "'", double2 == 4095.999999999998d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0606");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) '#', 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3325) + "'", int2 == (-3325));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0607");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0608");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (short) 0, (long) 1013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0609");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0610");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(5.229124373596866E-224d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3549882580404825E-208d + "'", double2 == 2.3549882580404825E-208d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0611");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0612");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0613");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(34, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0614");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-91049L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91050L) + "'", long2 == (-91050L));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0615");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0616");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.1102230246251565E-16d, 3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1102230246251565E-16d + "'", double2 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0617");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-8.987486442376865E77d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0618");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 99);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0619");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3, (double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1111111111111111d + "'", double2 == 0.1111111111111111d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0620");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 0, (long) (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0621");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0622");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(35.105399244260575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.81152709771016E14d + "'", double1 == 8.81152709771016E14d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0623");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-90023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7801368688723638d) + "'", double1 == (-0.7801368688723638d));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0624");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-91050L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-91049.99f) + "'", float1 == (-91049.99f));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0625");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0626");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(9.010913302575805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4602720354524676d + "'", double1 == 1.4602720354524676d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0627");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(3361L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3361 + "'", int1 == 3361);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0628");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 4096.0f, (-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0629");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(1.2548062764226884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8979266153021832d + "'", double1 == 0.8979266153021832d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0630");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0631");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 2.0f, 3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0632");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (short) 100, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0633");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-3361), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3361) + "'", int2 == (-3361));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0634");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0635");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(631011.7651164597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631012.0d + "'", double1 == 631012.0d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0636");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0637");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-0.9992068341863537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1017612416682803d + "'", double1 == 3.1017612416682803d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0638");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 6, (-3361L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0639");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-11));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0640");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (-3325));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0641");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0642");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0643");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 34);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0644");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(45.4416878563681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.433432603069162E19d + "'", double1 == 5.433432603069162E19d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0645");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-3.0f), (float) (-221L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0646");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0647");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0648");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-0.014898665854393249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24606459324793134d) + "'", double1 == (-0.24606459324793134d));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0649");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-127L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0650");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-221L), 0.9867228626928289d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5663315471290373d) + "'", double2 == (-1.5663315471290373d));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0651");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-10), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0652");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(7.151039979174052E54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.097244099359933E56d + "'", double1 == 4.097244099359933E56d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0653");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2599210498948732d) + "'", double1 == (-1.2599210498948732d));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0654");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0655");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0656");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0657");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-11));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0658");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(Double.NEGATIVE_INFINITY, (double) (-1.6099163E32f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0659");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0660");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5705654518541791d + "'", double1 == 0.5705654518541791d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0661");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.5385494443596428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5385494443596426d + "'", double1 == 1.5385494443596426d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0662");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(227, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0663");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.25038599000323114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9688168540796861d + "'", double1 == 0.9688168540796861d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0664");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0665");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-11L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0666");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-91047L), (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93141081L + "'", long2 == 93141081L);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0667");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0668");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0669");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-1151L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9234931422524565d) + "'", double1 == (-0.9234931422524565d));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0670");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(252.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0671");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 3, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0672");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-10080L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-10080L) + "'", long1 == (-10080L));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0673");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0.0f, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0674");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(5.454545454545458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0675");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-1589.1048306483171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0676");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0677");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0678");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-90024L), 3.1017612416682803d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90023.99f) + "'", float2 == (-90023.99f));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0679");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6865874069985796d) + "'", double1 == (-0.6865874069985796d));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0680");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-1014));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1014.0f + "'", float1 == 1014.0f);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0681");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) (-1.6099163E32f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014398509481984E16d + "'", double1 == 1.8014398509481984E16d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0682");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((-3.6842480121755888E16d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0683");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 4096.0f, 1.488609698595885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6538905358756892d) + "'", double2 == (-0.6538905358756892d));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0684");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) ' ', (-3325));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0685");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0686");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10016675001984403d + "'", double1 == 0.10016675001984403d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0687");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-8.152424001869451E-48d), 33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0688");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(127L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0689");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 227);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 226L + "'", long1 == 226L);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0690");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-1023));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0691");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 31L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0692");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.1752011936438014d), (double) 252);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6588681624517216E17d + "'", double2 == 4.6588681624517216E17d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0693");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 1000L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0694");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-3360L), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3357L) + "'", long2 == (-3357L));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0695");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0, 3361);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3361 + "'", int2 == 3361);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0696");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(1120, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1217 + "'", int2 == 1217);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0697");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(20.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1145.9155902616465d + "'", double1 == 1145.9155902616465d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0698");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0699");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0700");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644298430695373d + "'", double1 == 4.644298430695373d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0701");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-12700L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12700.0d) + "'", double1 == (-12700.0d));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0702");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47613905136749957d + "'", double1 == 0.47613905136749957d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0703");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-35L), (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0704");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(631011.7651164597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0705");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 396, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0706");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 396);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0707");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 63);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 64L + "'", long1 == 64L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0708");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 1217);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0709");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-3325));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5343508798353414d) + "'", double1 == (-2.5343508798353414d));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0710");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0711");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.414213562373095d + "'", double1 == 1.414213562373095d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0712");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0713");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0714");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(1.9999999999999998d, (double) 252);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999999999999998d + "'", double2 == 1.9999999999999998d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0715");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 99.999985f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0716");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(3360.015125058972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0717");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-11));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-12L) + "'", long1 == (-12L));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0718");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(3360.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0719");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-91049.99f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9380278686469384d + "'", double1 == 0.9380278686469384d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0720");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7970747335500249d + "'", double1 == 0.7970747335500249d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0721");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 11L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0722");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-3264), (float) (-13444L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3264.0f) + "'", float2 == (-3264.0f));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0723");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0724");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0725");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0726");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) '#', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0727");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 10L, (double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0983338231670193E-4d + "'", double2 == 1.0983338231670193E-4d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0728");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 93141081L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0729");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0730");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 34);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0731");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.5663315471290373d), (-35L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5103259118461393E-7d) + "'", double2 == (-1.5103259118461393E-7d));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0732");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0733");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) 1, 3363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3363 + "'", int2 == 3363);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0734");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) 100, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0735");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-12L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20943951023931956d) + "'", double1 == (-0.20943951023931956d));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0736");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-91050L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91040L) + "'", long2 == (-91040L));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0737");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5755576643364693d + "'", double1 == 0.5755576643364693d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0738");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(5.394796609342101E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394811161283497E-6d + "'", double1 == 5.394811161283497E-6d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0739");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 0, (float) (-200L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200.0f) + "'", float2 == (-200.0f));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0740");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-11L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004425697988050785d + "'", double1 == 0.004425697988050785d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0741");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(5.394796609446773E-6d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.37713787669670895d) + "'", double2 == (-0.37713787669670895d));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0742");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1014.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1014.0f + "'", float1 == 1014.0f);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0743");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 3363);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0744");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) (-127L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.026525695313479d) + "'", double1 == (-5.026525695313479d));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0745");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 648, 2584991.8192772097d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0746");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(2.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0747");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0748");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1.5103259118461393E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5103259118461393E-7d + "'", double1 == 1.5103259118461393E-7d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0749");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 1024);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0f + "'", float1 == 1024.0f);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0750");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(5.429345628954441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3933408563492384d + "'", double1 == 2.3933408563492384d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0751");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2239800905693157d + "'", double1 == 2.2239800905693157d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0752");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(4.2949673E10f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E10f + "'", float2 == 4.2949673E10f);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0753");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(35.10539924426057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0754");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-33));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0755");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(0, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0756");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-11), (-1013));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0757");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(3072.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0758");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33) + "'", int1 == (-33));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0759");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-1015));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.715091907742444d) + "'", double1 == (-17.715091907742444d));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0760");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(Double.NEGATIVE_INFINITY, 1.488609698595885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0761");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-91049L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-91049.0d) + "'", double1 == (-91049.0d));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0762");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-0.8536306738324039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8536306738324038d) + "'", double1 == (-0.8536306738324038d));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0763");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1000L, 31L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E93d + "'", double2 == 1.0E93d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0764");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.2664982178518892E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2664982178518894E-18d + "'", double1 == 1.2664982178518894E-18d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0765");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 63);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.000004f + "'", float1 == 63.000004f);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0766");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(52L, 101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49L) + "'", long2 == (-49L));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0767");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 200L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0768");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-103.27892990343184d) + "'", double1 == (-103.27892990343184d));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0769");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 3363);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5704989732502856d + "'", double1 == 1.5704989732502856d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0770");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(4096.0f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0771");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(100, 396);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0772");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7621186826519104d + "'", double1 == 1.7621186826519104d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0773");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) -1, 64L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0774");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-3261L), (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0775");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0776");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0777");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(11L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0778");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1151L), 227L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1378L) + "'", long2 == (-1378L));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0779");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(13.787662199743643d, (double) 101L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13567288221260237d + "'", double2 == 0.13567288221260237d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0780");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(3395);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3394 + "'", int1 == 3394);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0781");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2169902071303054d + "'", double1 == 2.2169902071303054d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0782");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0783");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-1013));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0784");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0785");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-3360L), (-3264.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3360.0f) + "'", float2 == (-3360.0f));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0786");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0787");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 127);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0788");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(2.2169902071303054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.434045323243469d + "'", double1 == 1.434045323243469d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0789");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 101L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.00000000000001d + "'", double1 == 101.00000000000001d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0790");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0791");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-101129L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-101128.99999999999d) + "'", double1 == (-101128.99999999999d));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0792");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-91049L), (float) 89L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-91049.0f) + "'", float2 == (-91049.0f));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0793");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(227.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 226.99998f + "'", float1 == 226.99998f);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0794");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-35), 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0795");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-1.5663315471290373d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-223.97372996596067d) + "'", double1 == (-223.97372996596067d));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0796");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-3.6842480121755888E16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6842480121755888E16d) + "'", double1 == (-3.6842480121755888E16d));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0797");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-90024L), (long) (-1024));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0798");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0799");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0800");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0801");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 1L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0802");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0803");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0804");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 3360);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3359.9998f + "'", float1 == 3359.9998f);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0805");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-3261L), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.674395062530872E112d + "'", double2 == 2.674395062530872E112d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0806");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(2.000000000000007d, (double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000075d + "'", double2 == 2.0000000000000075d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0807");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.0983338231670193E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001098394142234d + "'", double1 == 1.0001098394142234d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0808");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.5638183903210896d), (long) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1636673.740398849d + "'", double2 == 1636673.740398849d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0809");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(0.8342233605065101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7591697253775695d + "'", double1 == 0.7591697253775695d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0810");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 99L, (float) (-3325));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3325.0f) + "'", float2 == (-3325.0f));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0811");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0812");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 33.999996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.834595168017862E14d + "'", double1 == 5.834595168017862E14d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0813");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-127L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0814");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.95177303495919d + "'", double1 == 47.95177303495919d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0815");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0816");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((-0.9234931422524565d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0604708196842343d) + "'", double1 == (-1.0604708196842343d));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0817");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-36));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-35.999996f) + "'", float1 == (-35.999996f));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0818");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-35), 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0819");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(35.10539924426057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0820");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-2), 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0821");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-3361L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0822");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1023L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0823");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(5.394796609446773E-6d, 31.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.911649328672854E-164d + "'", double2 == 4.911649328672854E-164d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0824");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 28, (double) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 27.999998f + "'", float2 == 27.999998f);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0825");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (short) 100, (double) 127L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0519018604779784d + "'", double2 == 1.0519018604779784d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0826");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.6766525823045269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1060669239491665d + "'", double1 == 1.1060669239491665d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0827");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(35.0d, (double) (-10080L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0828");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0829");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (byte) 10, 95L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0830");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2246467991473532E-16d + "'", double1 == 1.2246467991473532E-16d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0831");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (byte) 10, (long) (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0832");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-1151L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1151) + "'", int1 == (-1151));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0833");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-70L), 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 930L + "'", long2 == 930L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0834");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.1017612416682803d, (double) (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2609550958160406E-6d + "'", double2 == 1.2609550958160406E-6d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0835");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.154262241479262d + "'", double1 == 15.154262241479262d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0836");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-70L), (long) 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-70L) + "'", long2 == (-70L));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0837");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3361L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3361L + "'", long2 == 3361L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0838");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(4.6588681624517216E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.658868162451721E17d + "'", double1 == 4.658868162451721E17d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0839");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 227L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0840");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0841");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-13444L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-234.64206463811766d) + "'", double1 == (-234.64206463811766d));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0842");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 28, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 27.999998f + "'", float2 == 27.999998f);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0843");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(5.433432603069162E19d, (double) 99.999985f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.433432603069162E19d + "'", double2 == 5.433432603069162E19d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0844");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(5.9999995f, 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0845");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) (-3261L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-186841.53699216145d) + "'", double1 == (-186841.53699216145d));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0846");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0847");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(47.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374736E20d + "'", double1 == 3.3431851641374736E20d);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0848");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(3361);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3360 + "'", int1 == 3360);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0849");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(11, (-1015));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1004) + "'", int2 == (-1004));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0850");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0851");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (-91049L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0852");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(3.5308397786165204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06162477949724596d + "'", double1 == 0.06162477949724596d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0853");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(35.105399244260575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.251704920142453d + "'", double1 == 4.251704920142453d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0854");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806754d + "'", double1 == 22026.465794806754d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0855");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-12.476649250079015d), (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.604138020626019d) + "'", double2 == (-1.604138020626019d));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0856");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(9.010913302575805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.010913302575807d + "'", double1 == 9.010913302575807d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0857");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(34L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0858");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-91049L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2602L) + "'", long2 == (-2602L));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0859");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-303L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9L) + "'", long2 == (-9L));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0860");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0861");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-12L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0862");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-90023.99f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0838041517012407d + "'", double1 == 0.0838041517012407d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0863");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(1.8184464592320666d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0864");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (short) 100, 397);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0865");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(227.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 227.0f + "'", float2 == 227.0f);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0866");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 4096.0f, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0867");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(5.394796609394437E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3947966093944364E-6d + "'", double1 == 5.3947966093944364E-6d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0868");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-127));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0869");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (short) 100, 33.999996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0870");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-91047L), (-12700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103747L) + "'", long2 == (-103747L));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0871");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-35), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0872");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-0.014898665854393249d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014898665854393249d + "'", double2 == 0.014898665854393249d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0873");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(396, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 396 + "'", int2 == 396);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0874");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-3360L), (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0875");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-12700.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.142504454556631d) + "'", double1 == (-10.142504454556631d));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0876");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(7.151039979174051E54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0877");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1378L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1378L + "'", long1 == 1378L);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0878");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0879");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0880");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 252, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0881");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(648);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 649 + "'", int1 == 649);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0882");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 93141081L, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.4512864E8f + "'", float2 == 7.4512864E8f);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0883");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-10));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-11L) + "'", long1 == (-11L));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0884");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.47613905136749957d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.869469782221848E-11d + "'", double2 == 4.869469782221848E-11d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0885");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1217, (-1151));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1217 + "'", int2 == 1217);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0886");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-33), 127.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0887");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-91047L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0888");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-1014));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1013.99994f) + "'", float1 == (-1013.99994f));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0889");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0554544523933395E-6d + "'", double1 == 6.0554544523933395E-6d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0890");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-91040L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-91040) + "'", int1 == (-91040));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0891");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(9.999999999999998d, (double) (-3361));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1386173574005567d + "'", double2 == 3.1386173574005567d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0892");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 21L, (-35.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.999996f) + "'", float2 == (-35.999996f));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0893");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0894");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(5672.28217179515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0895");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 21L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5477292602242684d) + "'", double1 == (-0.5477292602242684d));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0896");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0897");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.404833716619938d, (long) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9095811504246125E-14d + "'", double2 == 1.9095811504246125E-14d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0898");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 28, (long) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 784.0d + "'", double2 == 784.0d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0899");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0900");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469519831558414E-4d + "'", double1 == 3.469519831558414E-4d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0901");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-3325.0f), 648);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.8835494537200126E198d) + "'", double2 == (-3.8835494537200126E198d));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0902");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0903");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0904");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(7.6293945E-6f, (double) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.629394E-6f + "'", float2 == 7.629394E-6f);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0905");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (-1151L), 1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1151.0d) + "'", double2 == (-1151.0d));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0906");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0907");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0908");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0909");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 200.0f, 99L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141147E227d + "'", double2 == 6.338253001141147E227d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0910");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-3360L), (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-94080L) + "'", long2 == (-94080L));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0911");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0912");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6077178770248709d) + "'", double1 == (-0.6077178770248709d));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0913");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716549E22d + "'", double1 == 3.831008000716549E22d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0914");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 21L, (-35));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1118044E-10f + "'", float2 == 6.1118044E-10f);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0915");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 3360, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3358L + "'", long2 == 3358L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0916");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(5.433432603069162E19d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0917");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0918");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1152L), (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1154L) + "'", long2 == (-1154L));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0919");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-1015), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1019L) + "'", long2 == (-1019L));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0920");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0921");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3067790607827852d) + "'", double1 == (-1.3067790607827852d));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0922");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0923");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 'a', (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 137.17871555019022d + "'", double2 == 137.17871555019022d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0924");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0925");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(5.394796609472941E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609499109E-6d + "'", double1 == 5.394796609499109E-6d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0926");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 89L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5099.324376664326d + "'", double1 == 5099.324376664326d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0927");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0928");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-70L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.975449735908647E-31d + "'", double1 == 3.975449735908647E-31d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0929");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0930");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3395, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0931");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 100, (-90024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90024L) + "'", long2 == (-90024L));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0932");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-10.142504454556631d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999968999939d) + "'", double1 == (-0.9999999968999939d));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0933");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(65, 3363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3428 + "'", int2 == 3428);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0934");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-91049.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-91048.99f) + "'", float1 == (-91048.99f));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0935");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074085d + "'", double1 == 1.4422495703074085d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0936");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 1217);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1216.9999999999998d + "'", double1 == 1216.9999999999998d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0937");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(397, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50419) + "'", int2 == (-50419));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0938");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 3358L, 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6293945E-6f + "'", float2 == 7.6293945E-6f);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0939");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 100, (-91040));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0940");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 1014.0f, (-234.64206463811766d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1040.7943593705909d + "'", double2 == 1040.7943593705909d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0941");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (byte) 100, (-200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300L + "'", long2 == 300L);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0942");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-1154L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1154) + "'", int1 == (-1154));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0943");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0944");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 52L, (float) (-1154L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0945");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0946");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-3361), (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3361) + "'", int2 == (-3361));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0947");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0948");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(6.691673596021348E41d, (-1.5103259118461393E-7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0949");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) '4', 1217);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1217 + "'", int2 == 1217);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0950");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-32), (float) (-70L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-70.0f) + "'", float2 == (-70.0f));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0951");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-1013.99994f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0952");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707853434566212d + "'", double1 == 1.5707853434566212d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0953");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-1378L), (long) 3363);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3363L + "'", long2 == 3363L);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0954");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(18.432576789051176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.432576789051172d + "'", double1 == 18.432576789051172d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0955");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, (double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0956");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931472401645883d + "'", double1 == 0.6931472401645883d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0957");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-1019));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1019) + "'", int1 == (-1019));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0958");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-1L), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0959");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 3361L, 0.1858264752250012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1858264752250012d + "'", double2 == 0.1858264752250012d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0960");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) (-11L), (double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0961");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(1013, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0962");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((-1.0604708196842343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0963");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 1023L, 9.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1022.99994f + "'", float2 == 1022.99994f);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0964");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) -1, (-1013));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1014) + "'", int2 == (-1014));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0965");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 99, 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99000L + "'", long2 == 99000L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0966");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 3363L, 1.2664982178518894E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0967");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 11, 930L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0968");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 101, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0969");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-90023.99f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0970");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(34.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0971");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-50419));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-50419.004f) + "'", float1 == (-50419.004f));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0972");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3471308950527417d + "'", double1 == 0.3471308950527417d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0973");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0974");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0975");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 1024.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0976");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-3360.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3360.0002f) + "'", float1 == (-3360.0002f));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0977");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0978");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-13444L), 5.394796609394437E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0979");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-12700L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0980");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630.2535746439055d + "'", double1 == 630.2535746439055d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0981");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-1013.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1014.0d) + "'", double1 == (-1014.0d));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0982");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0983");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 3361L, (double) 227);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3360.9998f + "'", float2 == 3360.9998f);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0984");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-9L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-8.999999f) + "'", float1 == (-8.999999f));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0985");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1023, (-1013));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1036299) + "'", int2 == (-1036299));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0986");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.2609550958160406E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0987");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0988");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 1024L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0000000000002d + "'", double1 == 1024.0000000000002d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0989");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 227, (-90024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0990");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-8.999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.999999046325682d) + "'", double1 == (-8.999999046325682d));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0991");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0992");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.99999999999999d + "'", double1 == 51.99999999999999d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0993");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(3.80204032E8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0994");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 101.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0995");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-90024L), (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 696L + "'", long2 == 696L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0996");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-1019), 200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 200L + "'", long2 == 200L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0997");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(0.6931472401645883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6061119749939378d + "'", double1 == 0.6061119749939378d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0998");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(28, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3423 + "'", int2 == 3423);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test0999");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 127, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_015_Regression1.test1000");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(3394);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3395 + "'", int1 == 3395);
    }
}

