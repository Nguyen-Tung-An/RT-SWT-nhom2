import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_005_Regression1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test501");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 1024, (-91047L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90023L) + "'", long2 == (-90023L));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test502");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-200L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 200L + "'", long1 == 200L);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test503");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(1L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test504");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test505");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 10.0f, 1.6574544541530771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.4416878563681d + "'", double2 == 45.4416878563681d);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test506");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.9867228626928289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test507");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test508");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.8342233605065102d, (-3361.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test509");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 8L, (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.999999999999999d + "'", double2 == 7.999999999999999d);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test510");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.5063722200659099d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test511");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-2L), (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test512");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test513");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 3360.0002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3360.0d + "'", double1 == 3360.0d);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test514");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(7.374241268949272E19d, 0.1858264752250012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03678794086717075d) + "'", double2 == (-0.03678794086717075d));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test515");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-12));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-11L) + "'", long1 == (-11L));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test516");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-11), 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test517");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(100L, (-127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12700L) + "'", long2 == (-12700L));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test518");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-3361L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3361) + "'", int1 == (-3361));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test519");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(2, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test520");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test521");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test522");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5385494443596428d + "'", double1 == 1.5385494443596428d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test523");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test524");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(252, 396);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 648 + "'", int2 == 648);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test525");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-0.5063722200659099d), 1.3841381659328928E109d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5063722200659099d + "'", double2 == 0.5063722200659099d);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test526");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-12700L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test527");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 99L, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 396.0f + "'", float2 == 396.0f);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test528");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-127));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test529");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(7.600902709541988d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3337.802953724357d + "'", double2 == 3337.802953724357d);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test530");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(127, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test531");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-90023L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-90024L) + "'", long1 == (-90024L));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test532");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1024, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test533");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test534");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 2, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test535");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 152, (float) 101L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101.0f + "'", float2 == 101.0f);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test536");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 34, (double) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.999996f + "'", float2 == 33.999996f);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test537");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-3361));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3361) + "'", int1 == (-3361));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test538");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-2.2894284851066637d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test539");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test540");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test541");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(396);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 397 + "'", int1 == 397);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test542");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(5.394796609446773E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609472941E-6d + "'", double1 == 5.394796609472941E-6d);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test543");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(9.999999999999998d, (double) 3360.0002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3360.015125058972d + "'", double2 == 3360.015125058972d);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test544");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(33.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.0f + "'", float1 == 34.0f);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test545");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(7.151039979174052E54d, (double) 227L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test546");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.0d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test547");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.5063722200659099d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test548");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999999999996d + "'", double1 == 9.999999999999996d);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test549");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test550");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test551");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-3.9512813239549044E31d), (double) 3363);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.9512813239549044E31d) + "'", double2 == (-3.9512813239549044E31d));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test552");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-127));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test553");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(3360.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.643062867009476d + "'", double1 == 58.643062867009476d);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test554");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1151L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1152L) + "'", long1 == (-1152L));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test555");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 6, 8.81152709771016E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test556");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(99L, (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3261L) + "'", long2 == (-3261L));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test557");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1013), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1014) + "'", int2 == (-1014));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test558");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(4.923458286012058E41d, 3360);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test559");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test560");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test561");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1.6574544541530771d, (double) 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6574544541530771d + "'", double2 == 1.6574544541530771d);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test562");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.560895660206908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test563");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-3361L), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13444L) + "'", long2 == (-13444L));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test564");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test565");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test566");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5493061443340549d + "'", double1 == 0.5493061443340549d);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test567");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(31L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test568");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (byte) 10, (float) 200L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200.0f + "'", float2 == 200.0f);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test569");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-10080L), (-91049L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-101129L) + "'", long2 == (-101129L));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test570");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 52, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test571");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(12L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test572");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test573");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.0d, 5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test574");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-11), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test575");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test576");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 227.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.429345628954441d + "'", double1 == 5.429345628954441d);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test577");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4768639242040633d + "'", double1 == 0.4768639242040633d);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test578");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 99, 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50688.0f + "'", float2 == 50688.0f);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test579");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.488609698595885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.430930905201998d + "'", double1 == 4.430930905201998d);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test580");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 52.0f, (long) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.80204032E8d + "'", double2 == 3.80204032E8d);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test581");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(5, (-1024));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1019) + "'", int2 == (-1019));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test582");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.8184464592320666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320666d + "'", double1 == 1.8184464592320666d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test583");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.3841381659328928E109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test584");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test585");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test586");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-35));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test587");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test588");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1014));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1015) + "'", int1 == (-1015));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test589");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test590");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(4.503599627370496E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test591");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test592");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(1.5385494443596428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03224129401095795d + "'", double1 == 0.03224129401095795d);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test593");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-3.9512813239549044E31d), 5.429345628954441d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test594");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) 'a', (-3361));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3264) + "'", int2 == (-3264));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test595");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4219082547560243d) + "'", double1 == (-0.4219082547560243d));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test596");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.9867228626928289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6824293631138654d + "'", double1 == 1.6824293631138654d);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test597");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (-3361), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3360L) + "'", long2 == (-3360L));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test598");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test599");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (byte) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test600");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-3360L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test601");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(8.030084094267563d, (double) 3363);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test602");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(5.394796609394437E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609342101E-6d + "'", double1 == 5.394796609342101E-6d);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test603");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.015625d, (double) 11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015625d + "'", double2 == 0.015625d);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test604");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test605");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(7.999999999999999d, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4095.999999999998d + "'", double2 == 4095.999999999998d);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test606");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) '#', 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3325) + "'", int2 == (-3325));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test607");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test608");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (short) 0, (long) 1013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test609");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test610");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(5.229124373596866E-224d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3549882580404825E-208d + "'", double2 == 2.3549882580404825E-208d);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test611");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test612");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test613");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(34, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test614");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-91049L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91050L) + "'", long2 == (-91050L));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test615");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test616");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.1102230246251565E-16d, 3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1102230246251565E-16d + "'", double2 == 1.1102230246251565E-16d);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test617");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-8.987486442376865E77d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test618");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 99);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test619");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3, (double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1111111111111111d + "'", double2 == 0.1111111111111111d);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test620");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 0, (long) (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test621");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test622");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(35.105399244260575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.81152709771016E14d + "'", double1 == 8.81152709771016E14d);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test623");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-90023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7801368688723638d) + "'", double1 == (-0.7801368688723638d));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test624");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-91050L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-91049.99f) + "'", float1 == (-91049.99f));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test625");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test626");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(9.010913302575805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4602720354524676d + "'", double1 == 1.4602720354524676d);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test627");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(3361L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3361 + "'", int1 == 3361);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test628");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 4096.0f, (-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test629");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(1.2548062764226884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8979266153021832d + "'", double1 == 0.8979266153021832d);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test630");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test631");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 2.0f, 3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test632");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (short) 100, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test633");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-3361), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3361) + "'", int2 == (-3361));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test634");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test635");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(631011.7651164597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631012.0d + "'", double1 == 631012.0d);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test636");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test637");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-0.9992068341863537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1017612416682803d + "'", double1 == 3.1017612416682803d);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test638");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 6, (-3361L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test639");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-11));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test640");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (-3325));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test641");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test642");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test643");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 34);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test644");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(45.4416878563681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.433432603069162E19d + "'", double1 == 5.433432603069162E19d);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test645");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-3.0f), (float) (-221L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test646");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test647");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test648");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-0.014898665854393249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24606459324793134d) + "'", double1 == (-0.24606459324793134d));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test649");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-127L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test650");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-221L), 0.9867228626928289d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5663315471290373d) + "'", double2 == (-1.5663315471290373d));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test651");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-10), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test652");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(7.151039979174052E54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.097244099359933E56d + "'", double1 == 4.097244099359933E56d);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test653");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2599210498948732d) + "'", double1 == (-1.2599210498948732d));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test654");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test655");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test656");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test657");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-11));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test658");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(Double.NEGATIVE_INFINITY, (double) (-1.6099163E32f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test659");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test660");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5705654518541791d + "'", double1 == 0.5705654518541791d);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test661");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.5385494443596428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5385494443596426d + "'", double1 == 1.5385494443596426d);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test662");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(227, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test663");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.25038599000323114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9688168540796861d + "'", double1 == 0.9688168540796861d);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test664");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test665");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-11L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test666");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-91047L), (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93141081L + "'", long2 == 93141081L);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test667");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test668");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test669");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-1151L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9234931422524565d) + "'", double1 == (-0.9234931422524565d));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test670");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(252.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test671");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 3, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test672");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-10080L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-10080L) + "'", long1 == (-10080L));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test673");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0.0f, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test674");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(5.454545454545458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test675");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-1589.1048306483171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test676");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test677");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test678");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-90024L), 3.1017612416682803d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90023.99f) + "'", float2 == (-90023.99f));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test679");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6865874069985796d) + "'", double1 == (-0.6865874069985796d));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test680");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-1014));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1014.0f + "'", float1 == 1014.0f);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test681");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) (-1.6099163E32f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014398509481984E16d + "'", double1 == 1.8014398509481984E16d);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test682");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((-3.6842480121755888E16d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test683");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 4096.0f, 1.488609698595885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6538905358756892d) + "'", double2 == (-0.6538905358756892d));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test684");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) ' ', (-3325));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test685");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test686");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10016675001984403d + "'", double1 == 0.10016675001984403d);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test687");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-8.152424001869451E-48d), 33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test688");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(127L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test689");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 227);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 226L + "'", long1 == 226L);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test690");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-1023));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test691");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 31L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test692");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.1752011936438014d), (double) 252);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6588681624517216E17d + "'", double2 == 4.6588681624517216E17d);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test693");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 1000L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test694");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-3360L), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3357L) + "'", long2 == (-3357L));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test695");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0, 3361);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3361 + "'", int2 == 3361);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test696");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(1120, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1217 + "'", int2 == 1217);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test697");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(20.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1145.9155902616465d + "'", double1 == 1145.9155902616465d);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test698");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test699");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test700");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644298430695373d + "'", double1 == 4.644298430695373d);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test701");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-12700L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12700.0d) + "'", double1 == (-12700.0d));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test702");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47613905136749957d + "'", double1 == 0.47613905136749957d);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test703");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-35L), (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test704");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(631011.7651164597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test705");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 396, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test706");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 396);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test707");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 63);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 64L + "'", long1 == 64L);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test708");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 1217);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test709");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-3325));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5343508798353414d) + "'", double1 == (-2.5343508798353414d));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test710");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test711");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.414213562373095d + "'", double1 == 1.414213562373095d);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test712");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test713");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test714");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(1.9999999999999998d, (double) 252);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999999999999998d + "'", double2 == 1.9999999999999998d);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test715");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 99.999985f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test716");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(3360.015125058972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test717");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-11));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-12L) + "'", long1 == (-12L));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test718");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(3360.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test719");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-91049.99f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9380278686469384d + "'", double1 == 0.9380278686469384d);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test720");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7970747335500249d + "'", double1 == 0.7970747335500249d);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test721");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 11L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test722");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-3264), (float) (-13444L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3264.0f) + "'", float2 == (-3264.0f));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test723");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test724");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test725");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test726");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) '#', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test727");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 10L, (double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0983338231670193E-4d + "'", double2 == 1.0983338231670193E-4d);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test728");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 93141081L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test729");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test730");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 34);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test731");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.5663315471290373d), (-35L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5103259118461393E-7d) + "'", double2 == (-1.5103259118461393E-7d));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test732");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test733");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) 1, 3363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3363 + "'", int2 == 3363);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test734");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) 100, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test735");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-12L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20943951023931956d) + "'", double1 == (-0.20943951023931956d));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test736");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-91050L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91040L) + "'", long2 == (-91040L));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test737");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5755576643364693d + "'", double1 == 0.5755576643364693d);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test738");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(5.394796609342101E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394811161283497E-6d + "'", double1 == 5.394811161283497E-6d);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test739");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 0, (float) (-200L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200.0f) + "'", float2 == (-200.0f));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test740");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-11L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004425697988050785d + "'", double1 == 0.004425697988050785d);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test741");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(5.394796609446773E-6d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.37713787669670895d) + "'", double2 == (-0.37713787669670895d));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test742");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1014.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1014.0f + "'", float1 == 1014.0f);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test743");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 3363);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test744");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) (-127L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.026525695313479d) + "'", double1 == (-5.026525695313479d));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test745");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 648, 2584991.8192772097d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test746");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(2.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test747");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test748");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1.5103259118461393E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5103259118461393E-7d + "'", double1 == 1.5103259118461393E-7d);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test749");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 1024);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0f + "'", float1 == 1024.0f);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test750");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(5.429345628954441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3933408563492384d + "'", double1 == 2.3933408563492384d);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test751");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2239800905693157d + "'", double1 == 2.2239800905693157d);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test752");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(4.2949673E10f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E10f + "'", float2 == 4.2949673E10f);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test753");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(35.10539924426057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test754");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-33));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test755");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(0, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test756");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-11), (-1013));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test757");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(3072.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test758");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33) + "'", int1 == (-33));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test759");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-1015));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.715091907742444d) + "'", double1 == (-17.715091907742444d));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test760");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(Double.NEGATIVE_INFINITY, 1.488609698595885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test761");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-91049L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-91049.0d) + "'", double1 == (-91049.0d));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test762");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-0.8536306738324039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8536306738324038d) + "'", double1 == (-0.8536306738324038d));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test763");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1000L, 31L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E93d + "'", double2 == 1.0E93d);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test764");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.2664982178518892E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2664982178518894E-18d + "'", double1 == 1.2664982178518894E-18d);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test765");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 63);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.000004f + "'", float1 == 63.000004f);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test766");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(52L, 101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49L) + "'", long2 == (-49L));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test767");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 200L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test768");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-103.27892990343184d) + "'", double1 == (-103.27892990343184d));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test769");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 3363);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5704989732502856d + "'", double1 == 1.5704989732502856d);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test770");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(4096.0f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test771");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(100, 396);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test772");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7621186826519104d + "'", double1 == 1.7621186826519104d);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test773");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) -1, 64L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test774");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-3261L), (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test775");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test776");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test777");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(11L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test778");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1151L), 227L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1378L) + "'", long2 == (-1378L));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test779");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(13.787662199743643d, (double) 101L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13567288221260237d + "'", double2 == 0.13567288221260237d);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test780");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(3395);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3394 + "'", int1 == 3394);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test781");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2169902071303054d + "'", double1 == 2.2169902071303054d);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test782");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test783");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-1013));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test784");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test785");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-3360L), (-3264.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3360.0f) + "'", float2 == (-3360.0f));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test786");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test787");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 127);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test788");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(2.2169902071303054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.434045323243469d + "'", double1 == 1.434045323243469d);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test789");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 101L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.00000000000001d + "'", double1 == 101.00000000000001d);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test790");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test791");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-101129L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-101128.99999999999d) + "'", double1 == (-101128.99999999999d));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test792");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-91049L), (float) 89L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-91049.0f) + "'", float2 == (-91049.0f));
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test793");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(227.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 226.99998f + "'", float1 == 226.99998f);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test794");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-35), 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test795");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-1.5663315471290373d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-223.97372996596067d) + "'", double1 == (-223.97372996596067d));
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test796");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-3.6842480121755888E16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6842480121755888E16d) + "'", double1 == (-3.6842480121755888E16d));
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test797");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-90024L), (long) (-1024));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test798");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test799");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test800");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test801");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 1L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test802");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test803");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test804");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 3360);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3359.9998f + "'", float1 == 3359.9998f);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test805");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-3261L), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.674395062530872E112d + "'", double2 == 2.674395062530872E112d);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test806");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(2.000000000000007d, (double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000075d + "'", double2 == 2.0000000000000075d);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test807");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.0983338231670193E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001098394142234d + "'", double1 == 1.0001098394142234d);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test808");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.5638183903210896d), (long) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1636673.740398849d + "'", double2 == 1636673.740398849d);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test809");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(0.8342233605065101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7591697253775695d + "'", double1 == 0.7591697253775695d);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test810");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 99L, (float) (-3325));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3325.0f) + "'", float2 == (-3325.0f));
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test811");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test812");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 33.999996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.834595168017862E14d + "'", double1 == 5.834595168017862E14d);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test813");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-127L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test814");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.95177303495919d + "'", double1 == 47.95177303495919d);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test815");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test816");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((-0.9234931422524565d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0604708196842343d) + "'", double1 == (-1.0604708196842343d));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test817");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-36));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-35.999996f) + "'", float1 == (-35.999996f));
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test818");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-35), 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test819");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(35.10539924426057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test820");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-2), 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test821");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-3361L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test822");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1023L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test823");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(5.394796609446773E-6d, 31.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.911649328672854E-164d + "'", double2 == 4.911649328672854E-164d);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test824");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 28, (double) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 27.999998f + "'", float2 == 27.999998f);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test825");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (short) 100, (double) 127L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0519018604779784d + "'", double2 == 1.0519018604779784d);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test826");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.6766525823045269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1060669239491665d + "'", double1 == 1.1060669239491665d);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test827");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(35.0d, (double) (-10080L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test828");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test829");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (byte) 10, 95L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test830");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2246467991473532E-16d + "'", double1 == 1.2246467991473532E-16d);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test831");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (byte) 10, (long) (-12));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test832");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-1151L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1151) + "'", int1 == (-1151));
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test833");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-70L), 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 930L + "'", long2 == 930L);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test834");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.1017612416682803d, (double) (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2609550958160406E-6d + "'", double2 == 1.2609550958160406E-6d);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test835");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.154262241479262d + "'", double1 == 15.154262241479262d);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test836");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-70L), (long) 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-70L) + "'", long2 == (-70L));
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test837");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3361L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3361L + "'", long2 == 3361L);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test838");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(4.6588681624517216E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.658868162451721E17d + "'", double1 == 4.658868162451721E17d);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test839");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 227L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test840");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test841");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-13444L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-234.64206463811766d) + "'", double1 == (-234.64206463811766d));
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test842");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 28, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 27.999998f + "'", float2 == 27.999998f);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test843");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(5.433432603069162E19d, (double) 99.999985f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.433432603069162E19d + "'", double2 == 5.433432603069162E19d);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test844");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(5.9999995f, 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test845");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) (-3261L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-186841.53699216145d) + "'", double1 == (-186841.53699216145d));
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test846");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test847");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(47.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374736E20d + "'", double1 == 3.3431851641374736E20d);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test848");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(3361);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3360 + "'", int1 == 3360);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test849");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(11, (-1015));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1004) + "'", int2 == (-1004));
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test850");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test851");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (-91049L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test852");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(3.5308397786165204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06162477949724596d + "'", double1 == 0.06162477949724596d);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test853");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(35.105399244260575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.251704920142453d + "'", double1 == 4.251704920142453d);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test854");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806754d + "'", double1 == 22026.465794806754d);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test855");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-12.476649250079015d), (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.604138020626019d) + "'", double2 == (-1.604138020626019d));
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test856");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(9.010913302575805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.010913302575807d + "'", double1 == 9.010913302575807d);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test857");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(34L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test858");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-91049L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2602L) + "'", long2 == (-2602L));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test859");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-303L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9L) + "'", long2 == (-9L));
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test860");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test861");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-12L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test862");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-90023.99f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0838041517012407d + "'", double1 == 0.0838041517012407d);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test863");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(1.8184464592320666d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test864");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (short) 100, 397);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test865");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(227.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 227.0f + "'", float2 == 227.0f);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test866");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 4096.0f, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test867");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(5.394796609394437E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3947966093944364E-6d + "'", double1 == 5.3947966093944364E-6d);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test868");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-127));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test869");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (short) 100, 33.999996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test870");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-91047L), (-12700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103747L) + "'", long2 == (-103747L));
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test871");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-35), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test872");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-0.014898665854393249d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014898665854393249d + "'", double2 == 0.014898665854393249d);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test873");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(396, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 396 + "'", int2 == 396);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test874");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-3360L), (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test875");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-12700.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.142504454556631d) + "'", double1 == (-10.142504454556631d));
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test876");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(7.151039979174051E54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test877");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1378L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1378L + "'", long1 == 1378L);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test878");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test879");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test880");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 252, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test881");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(648);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 649 + "'", int1 == 649);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test882");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 93141081L, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.4512864E8f + "'", float2 == 7.4512864E8f);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test883");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-10));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-11L) + "'", long1 == (-11L));
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test884");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.47613905136749957d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.869469782221848E-11d + "'", double2 == 4.869469782221848E-11d);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test885");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1217, (-1151));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1217 + "'", int2 == 1217);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test886");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-33), 127.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test887");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-91047L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test888");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-1014));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1013.99994f) + "'", float1 == (-1013.99994f));
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test889");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0554544523933395E-6d + "'", double1 == 6.0554544523933395E-6d);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test890");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-91040L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-91040) + "'", int1 == (-91040));
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test891");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(9.999999999999998d, (double) (-3361));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1386173574005567d + "'", double2 == 3.1386173574005567d);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test892");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 21L, (-35.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.999996f) + "'", float2 == (-35.999996f));
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test893");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test894");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(5672.28217179515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test895");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 21L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5477292602242684d) + "'", double1 == (-0.5477292602242684d));
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test896");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test897");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.404833716619938d, (long) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9095811504246125E-14d + "'", double2 == 1.9095811504246125E-14d);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test898");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 28, (long) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 784.0d + "'", double2 == 784.0d);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test899");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test900");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469519831558414E-4d + "'", double1 == 3.469519831558414E-4d);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test901");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-3325.0f), 648);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.8835494537200126E198d) + "'", double2 == (-3.8835494537200126E198d));
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test902");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test903");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test904");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(7.6293945E-6f, (double) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.629394E-6f + "'", float2 == 7.629394E-6f);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test905");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (-1151L), 1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1151.0d) + "'", double2 == (-1151.0d));
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test906");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test907");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test908");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test909");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 200.0f, 99L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141147E227d + "'", double2 == 6.338253001141147E227d);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test910");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-3360L), (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-94080L) + "'", long2 == (-94080L));
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test911");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test912");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6077178770248709d) + "'", double1 == (-0.6077178770248709d));
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test913");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716549E22d + "'", double1 == 3.831008000716549E22d);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test914");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 21L, (-35));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1118044E-10f + "'", float2 == 6.1118044E-10f);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test915");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 3360, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3358L + "'", long2 == 3358L);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test916");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(5.433432603069162E19d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test917");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test918");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1152L), (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1154L) + "'", long2 == (-1154L));
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test919");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-1015), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1019L) + "'", long2 == (-1019L));
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test920");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test921");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3067790607827852d) + "'", double1 == (-1.3067790607827852d));
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test922");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test923");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 'a', (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 137.17871555019022d + "'", double2 == 137.17871555019022d);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test924");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test925");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(5.394796609472941E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609499109E-6d + "'", double1 == 5.394796609499109E-6d);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test926");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 89L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5099.324376664326d + "'", double1 == 5099.324376664326d);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test927");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test928");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-70L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.975449735908647E-31d + "'", double1 == 3.975449735908647E-31d);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test929");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test930");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3395, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test931");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 100, (-90024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90024L) + "'", long2 == (-90024L));
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test932");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-10.142504454556631d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999968999939d) + "'", double1 == (-0.9999999968999939d));
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test933");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(65, 3363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3428 + "'", int2 == 3428);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test934");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-91049.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-91048.99f) + "'", float1 == (-91048.99f));
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test935");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074085d + "'", double1 == 1.4422495703074085d);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test936");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 1217);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1216.9999999999998d + "'", double1 == 1216.9999999999998d);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test937");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(397, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50419) + "'", int2 == (-50419));
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test938");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 3358L, 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6293945E-6f + "'", float2 == 7.6293945E-6f);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test939");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 100, (-91040));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test940");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 1014.0f, (-234.64206463811766d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1040.7943593705909d + "'", double2 == 1040.7943593705909d);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test941");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (byte) 100, (-200L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300L + "'", long2 == 300L);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test942");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-1154L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1154) + "'", int1 == (-1154));
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test943");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test944");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 52L, (float) (-1154L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test945");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test946");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-3361), (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3361) + "'", int2 == (-3361));
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test947");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test948");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(6.691673596021348E41d, (-1.5103259118461393E-7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test949");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) '4', 1217);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1217 + "'", int2 == 1217);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test950");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-32), (float) (-70L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-70.0f) + "'", float2 == (-70.0f));
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test951");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-1013.99994f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test952");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707853434566212d + "'", double1 == 1.5707853434566212d);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test953");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-1378L), (long) 3363);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3363L + "'", long2 == 3363L);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test954");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(18.432576789051176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.432576789051172d + "'", double1 == 18.432576789051172d);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test955");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, (double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test956");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931472401645883d + "'", double1 == 0.6931472401645883d);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test957");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-1019));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1019) + "'", int1 == (-1019));
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test958");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-1L), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test959");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 3361L, 0.1858264752250012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1858264752250012d + "'", double2 == 0.1858264752250012d);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test960");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) (-11L), (double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test961");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(1013, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test962");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((-1.0604708196842343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test963");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 1023L, 9.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1022.99994f + "'", float2 == 1022.99994f);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test964");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) -1, (-1013));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1014) + "'", int2 == (-1014));
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test965");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 99, 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99000L + "'", long2 == 99000L);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test966");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 3363L, 1.2664982178518894E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test967");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 11, 930L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test968");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 101, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test969");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-90023.99f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test970");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(34.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test971");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-50419));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-50419.004f) + "'", float1 == (-50419.004f));
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test972");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3471308950527417d + "'", double1 == 0.3471308950527417d);
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test973");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test974");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test975");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 1024.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test976");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-3360.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3360.0002f) + "'", float1 == (-3360.0002f));
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test977");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test978");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-13444L), 5.394796609394437E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test979");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-12700L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test980");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630.2535746439055d + "'", double1 == 630.2535746439055d);
    }

    @Test
    public void test981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test981");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-1013.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1014.0d) + "'", double1 == (-1014.0d));
    }

    @Test
    public void test982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test982");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test983");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 3361L, (double) 227);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3360.9998f + "'", float2 == 3360.9998f);
    }

    @Test
    public void test984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test984");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-9L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-8.999999f) + "'", float1 == (-8.999999f));
    }

    @Test
    public void test985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test985");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1023, (-1013));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1036299) + "'", int2 == (-1036299));
    }

    @Test
    public void test986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test986");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.2609550958160406E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test987");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test988");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 1024L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0000000000002d + "'", double1 == 1024.0000000000002d);
    }

    @Test
    public void test989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test989");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 227, (-90024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test990");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-8.999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.999999046325682d) + "'", double1 == (-8.999999046325682d));
    }

    @Test
    public void test991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test991");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test992");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.99999999999999d + "'", double1 == 51.99999999999999d);
    }

    @Test
    public void test993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test993");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(3.80204032E8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test994");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 101.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test995");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-90024L), (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 696L + "'", long2 == 696L);
    }

    @Test
    public void test996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression1.test996");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-1019), 200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 200L + "'", long2 == 200L);
    }
}

