package org.apache.commons.math4.core.jdkmath;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccurateMathRegressionTest1 {

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
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0501");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607268686116467d + "'", double1 == 1.5607268686116467d);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0502");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.9999999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0503");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(0.19571745311082508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003415913960401516d + "'", double1 == 0.003415913960401516d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0504");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(35, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0505");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0506");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, 3.443584143042217E69d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0507");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000004f + "'", float1 == 35.000004f);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0508");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 35, 1.653595504961241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27449439581393875d + "'", double2 == 0.27449439581393875d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0509");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (short) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0510");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 9L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.000001f + "'", float1 == 9.000001f);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0511");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(31, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0512");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 1076, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35508L + "'", long2 == 35508L);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0513");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 39001, (-1100));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0514");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (-71750L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-71750.0d) + "'", double1 == (-71750.0d));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0515");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 8.620024E31f, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0516");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0517");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 6, (long) 150);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0518");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0519");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 1500, (long) 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1404L + "'", long2 == 1404L);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0520");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0521");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 6, (double) 15132L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0522");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(39000.061038413776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39000.0d + "'", double1 == 39000.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0523");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0524");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) (-58.0f), (double) (-100.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-58.0d) + "'", double2 == (-58.0d));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0525");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) (-0.9999999f), 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999998807907103d) + "'", double2 == (-0.9999998807907103d));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0526");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(1.5405025670009254d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0527");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(52.000004f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0528");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0529");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(303.5726559648473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 304.0d + "'", double1 == 304.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0530");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(9.889030319346946E42d, (double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0232584343194607d + "'", double2 == 0.0232584343194607d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0531");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 39097);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39098L + "'", long1 == 39098L);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0532");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(6, 39097);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0533");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(39339L, (-101L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3973239L) + "'", long2 == (-3973239L));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0534");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1404L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1404 + "'", int1 == 1404);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0535");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(39097, 1076);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 361 + "'", int2 == 361);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0536");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0537");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 11L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0538");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515679291054285d + "'", double1 == 1.5515679291054285d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0539");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-0.9999999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0540");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(31, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0541");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) (-11), 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0542");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042505E42d + "'", double1 == 1.3383347192042505E42d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0543");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 5044L, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40352.0f + "'", float2 == 40352.0f);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0544");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0545");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 150, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4346483754816115E113d + "'", double2 == 1.4346483754816115E113d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0546");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(39000, 39001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39001 + "'", int2 == 39001);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0547");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0548");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0549");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0000000000000002d) + "'", double1 == (-1.0000000000000002d));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0550");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 15132L, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15132.0d + "'", double2 == 15132.0d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0551");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 12L, (float) 990);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0552");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-58L), 2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-57.999996f) + "'", float2 == (-57.999996f));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0553");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(52.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0554");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 96);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0555");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1557176047248046d + "'", double1 == 2.1557176047248046d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0556");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 0.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0557");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0558");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703413d + "'", double1 == 11013.232874703413d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0559");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) (-3973239L), 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3973239.0000026687d + "'", double2 == 3973239.0000026687d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0560");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 361);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 361.00003f + "'", float1 == 361.00003f);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0561");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 752L, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-24.0d) + "'", double2 == (-24.0d));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0562");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1023.9999999999999d, 1076);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0563");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 39000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0564");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0000000000000002d) + "'", double1 == (-1.0000000000000002d));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0565");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(9.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0566");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 32, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0567");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(6.0d, (-5786.873730821314d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5786.873730821314d) + "'", double2 == (-5786.873730821314d));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0568");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(4.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0569");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(0.9155494254642262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01597935193909316d + "'", double1 == 0.01597935193909316d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0570");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0571");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 9L, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0572");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 10, (long) 1076);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1066L) + "'", long2 == (-1066L));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0573");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1100), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1101) + "'", int2 == (-1101));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0574");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(3.443584143042217E69d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.887168286084434E69d + "'", double2 == 6.887168286084434E69d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0575");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 98L + "'", long1 == 98L);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0576");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0577");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 5, (double) 18L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0578");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0579");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(39339L, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 472068L + "'", long2 == 472068L);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0580");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0581");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-58L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0122909661567112d) + "'", double1 == (-1.0122909661567112d));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0582");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(2.9173106007279803d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0583");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(9L, (long) 5044);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5044L + "'", long2 == 5044L);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0584");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (short) 10, (float) (-71750L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0585");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 9, (-5041L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5032L) + "'", long2 == (-5032L));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0586");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0587");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(44L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 43L + "'", long1 == 43L);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0588");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0589");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(0.36787939731679814d, (double) 33L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36787939731679814d + "'", double2 == 0.36787939731679814d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0590");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(6, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0591");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0592");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 44L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8066624897703196d + "'", double1 == 3.8066624897703196d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0593");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0594");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 5, 990);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0595");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 9.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8103.0916552820945d + "'", double1 == 8103.0916552820945d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0596");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-57.999996f), 43L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.720514074595375E75d) + "'", double2 == (-6.720514074595375E75d));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0597");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0598");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(39000.061038413776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39000.061038413776d + "'", double1 == 39000.061038413776d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0599");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0600");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1353352832366127d + "'", double1 == 0.1353352832366127d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0601");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0602");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0603");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(1.2252151862076787E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2252151862076787E55d + "'", double1 == 1.2252151862076787E55d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0604");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0L, (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0605");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0606");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((-24.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.0d) + "'", double1 == (-24.0d));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0607");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0608");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 45L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0609");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4000681972008891d + "'", double1 == 0.4000681972008891d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0610");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 7.9999995f, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.196599625992853d + "'", double2 == 1.196599625992853d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0611");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) -1, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0612");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((-57.29577951308232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0613");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.8920048697881602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4400166664355611d + "'", double1 == 1.4400166664355611d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0614");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 39000, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39035L + "'", long2 == 39035L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0615");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.003532431295962d + "'", double1 == 9.003532431295962d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0616");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (short) -1, (long) 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0617");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(45L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0618");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 31, (double) 361.00003f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0619");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(0.003415913960401516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00341590067433341d + "'", double1 == 0.00341590067433341d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0620");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(1.791759469228055d, (-0.1411200080598672d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.042800635550218846d) + "'", double2 == (-0.042800635550218846d));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0621");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0622");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 39001, (-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0020139859587473643d + "'", double2 == 0.0020139859587473643d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0623");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) '#', (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1058 + "'", int2 == 1058);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0624");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0625");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(31L, 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0626");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 0, 990);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 990 + "'", int2 == 990);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0627");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(97.0d, 990);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.015003270479179E300d + "'", double2 == 1.015003270479179E300d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0628");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(2.386824089051352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9405433411969535d) + "'", double1 == (-0.9405433411969535d));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0629");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(150, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0630");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0631");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 97, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1403L) + "'", long2 == (-1403L));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0632");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(96.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0633");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(20.000000000000004d, 0.5943808256397736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.000000000000004d + "'", double2 == 20.000000000000004d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0634");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-0.9673576209121749d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0635");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.3383347192042505E42d, 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0636");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(31L, (long) 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0637");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 5, 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0638");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0639");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 1500);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.013560982203286d + "'", double1 == 9.013560982203286d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0640");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(98.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.0f + "'", float1 == 99.0f);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0641");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.2252151862076787E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2252151862076788E55d + "'", double1 == 1.2252151862076788E55d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0642");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0643");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (-0.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981037928d) + "'", double1 == (-0.7853981037928d));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0644");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 149);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0645");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(9.0d, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8154648767857287d + "'", double2 == 0.8154648767857287d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0646");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0647");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.5515679291054285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007188009910847d + "'", double1 == 1.007188009910847d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0648");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(1.0000000000000002d, (double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000004d + "'", double2 == 1.0000000000000004d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0649");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-2), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0650");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(10, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0651");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0652");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 45);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 45.000004f + "'", float1 == 45.000004f);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0653");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-0.5202350444438292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.117922474660835d + "'", double1 == 2.117922474660835d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0654");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 6, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0655");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 68);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0656");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (-68L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0657");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(2.718281817253452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0658");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0659");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(12L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0660");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 5044L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0661");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-58), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0662");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(750);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 751 + "'", int1 == 751);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0663");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 69L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.0d + "'", double1 == 69.0d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0664");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0665");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(5L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0666");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(2.386824089051352d, 0.00341590067433341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5693651788699738d + "'", double2 == 1.5693651788699738d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0667");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-3L), (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0668");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.88733853924697d + "'", double1 == 171.88733853924697d);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0669");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0670");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0671");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) (-58L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0672");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-0.11038872761434562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11038872761434562d + "'", double1 == 0.11038872761434562d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0673");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.725887222397812d) + "'", double1 == (-27.725887222397812d));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0674");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(8103.083927575384d, (double) 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0675");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.5515679291054285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.718863228190481d + "'", double1 == 4.718863228190481d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0676");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6865874069985796d) + "'", double1 == (-0.6865874069985796d));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0677");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.999999999999996d + "'", double1 == 30.999999999999996d);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0678");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(39001, 39000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39000 + "'", int2 == 39000);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0679");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(1023.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9873536182198303d + "'", double1 == 0.9873536182198303d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0680");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0681");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-1100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0682");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1022L, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31682L + "'", long2 == 31682L);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0683");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0684");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 150);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.968547903331898E64d + "'", double1 == 6.968547903331898E64d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0685");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(1.4346483754816115E113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6767603855848264d) + "'", double1 == (-0.6767603855848264d));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0686");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0687");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(44L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0688");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 39097);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39097L + "'", long1 == 39097L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0689");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0690");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (-58.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-58.0d) + "'", double1 == (-58.0d));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0691");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-6.445708581007513E-85d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.445708581007513E-85d) + "'", double1 == (-6.445708581007513E-85d));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0692");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(0.9873536182198303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5149218250144574d + "'", double1 == 1.5149218250144574d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0693");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(1.196599625992853d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0694");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(9.999999f, (double) 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0695");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0696");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(8.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.999999f + "'", float1 == 8.999999f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0697");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-0.1411200080598672d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0698");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(3.702775077901044d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0699");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((-6.445708581007513E-85d), (double) (-1066L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.445708581007513E-85d) + "'", double2 == (-6.445708581007513E-85d));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0700");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 1, 1058);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1058 + "'", int2 == 1058);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0701");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 1076);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0702");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(150.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.968547903331898E64d + "'", double1 == 6.968547903331898E64d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0703");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(11.0d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0704");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-1101));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1101L + "'", long1 == 1101L);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0705");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0706");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0707");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0708");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(5044.0f, 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0709");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(30.999999999999996d, (double) (-5032L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0710");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 6L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0711");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(3L, (-101L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98L) + "'", long2 == (-98L));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0712");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0, 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0713");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-2), 1076);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1074 + "'", int2 == 1074);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0714");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.4000681972008891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.92221921701848d + "'", double1 == 22.92221921701848d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0715");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0716");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(22.92221921701848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.82477774979246d + "'", double1 == 3.82477774979246d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0717");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0718");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(9.003532431295962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9544129332653245d + "'", double1 == 0.9544129332653245d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0719");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 45L, (float) 39001);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0720");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.003415913960401516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034159006743024046d + "'", double1 == 0.0034159006743024046d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0721");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(39339L, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0722");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0723");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-1100L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1099L) + "'", long1 == (-1099L));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0724");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(35.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0725");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.53674316406539E-7d + "'", double1 == 9.53674316406539E-7d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0726");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 31682L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31682.0f + "'", float1 == 31682.0f);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0727");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430805647677968d + "'", double1 == 1.5430805647677968d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0728");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-8.620024E31f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0729");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(4.718863228190481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0730");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.7615941559557649d, (-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.34555456183832556d) + "'", double2 == (-0.34555456183832556d));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0731");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0732");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 5044L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0733");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(5042L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5041L + "'", long1 == 5041L);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0734");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-5786.873730821314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0735");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.9873536182198303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5509003805879408d + "'", double1 == 0.5509003805879408d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0736");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-57.999996f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11918392295652788d + "'", double1 == 0.11918392295652788d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0737");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((-58.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-58) + "'", int1 == (-58));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0738");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 96, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.0f + "'", float2 == 96.0f);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0739");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0740");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(1.0000000000009095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348163126d + "'", double1 == 1.5430806348163126d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0741");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0742");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(101, 39000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0743");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 98, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5198201197195833d + "'", double2 == 1.5198201197195833d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0744");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0745");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0746");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(92L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 91L + "'", long1 == 91L);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0747");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0748");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3, 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0031545098999704E16d + "'", double2 == 5.0031545098999704E16d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0749");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(39098L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39098 + "'", int1 == 39098);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0750");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0751");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 5L, (float) (-1100L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1100.0f) + "'", float2 == (-1100.0f));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0752");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 101);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7627825445142729d + "'", double1 == 1.7627825445142729d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0753");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(35L, (long) 1022);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1057L + "'", long2 == 1057L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0754");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.4400166664355611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8937010821802513d + "'", double1 == 0.8937010821802513d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0755");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1416876847493498d + "'", double1 == 1.1416876847493498d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0756");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 1L, (float) 18L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0757");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6506783754890694d + "'", double1 == 0.6506783754890694d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0758");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((-0.5872139151569291d), 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0759");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 51);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0760");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0761");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248715407688383d + "'", double1 == 22.248715407688383d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0762");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.7523589792368448d, 10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.057815221421969015d + "'", double2 == 0.057815221421969015d);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0763");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0764");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.01597935193909316d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0765");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0766");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0767");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) (-1100));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.322801154563672d) + "'", double1 == (-10.322801154563672d));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0768");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 15, 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0769");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-0.5206304090742055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0770");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(0, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1500) + "'", int2 == (-1500));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0771");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1500, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0772");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0773");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1404);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1403 + "'", int1 == 1403);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0774");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 149);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.600540585471551d + "'", double1 == 2.600540585471551d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0775");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 752L, (double) 8.999999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 752.0538544431735d + "'", double2 == 752.0538544431735d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0776");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-58));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-58.0d) + "'", double1 == (-58.0d));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0777");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 5044L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5044.000000000001d + "'", double1 == 5044.000000000001d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0778");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(100.00000000000001d, (long) 45);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000064E90d + "'", double2 == 1.0000000000000064E90d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0779");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 45.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.00000381469727d + "'", double1 == 45.00000381469727d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0780");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 752L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 752.00006f + "'", float1 == 752.00006f);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0781");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 39097, 1022L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38075L + "'", long2 == 38075L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0782");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 1022L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0783");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(1.4400166664355611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3646546874345162d + "'", double1 == 0.3646546874345162d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0784");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2626272556789118d + "'", double1 == 1.2626272556789118d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0785");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 39340L, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 78680.0f + "'", float2 == 78680.0f);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0786");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(97, (-1500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1403) + "'", int2 == (-1403));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0787");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0788");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 15.0f, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0656117753521525E117d + "'", double2 == 4.0656117753521525E117d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0789");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 31682L, (float) 1057L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31682.0f + "'", float2 == 31682.0f);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0790");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0791");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 5051L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.220488712827077d + "'", double1 == 9.220488712827077d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0792");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(41L, 69L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0793");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 39000, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38903L + "'", long2 == 38903L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0794");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(2.9173106007279803d, 3.8066624897703196d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6538956333321687d + "'", double2 == 0.6538956333321687d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0795");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0796");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 1101L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.697121111046137d + "'", double1 == 7.697121111046137d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0797");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 39098);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0798");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-58));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-59) + "'", int1 == (-59));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0799");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(750.0000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0800");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 39035L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0801");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0802");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 18L, 0.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0803");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(752.0538544431735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0804");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(5042L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5042L + "'", long1 == 5042L);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0805");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.2379400392853803E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.07639343095502d + "'", double1 == 63.07639343095502d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0806");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0807");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 58);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.00000000000001d + "'", double1 == 58.00000000000001d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0808");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 12L, (float) 1025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0809");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-2));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.0000002f) + "'", float1 == (-2.0000002f));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0810");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(149, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0811");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 5043.9995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.739270507804302d) + "'", double1 == (-5.739270507804302d));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0812");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.5509003805879408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0813");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(52L, (long) 30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0814");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-3973239L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3973239) + "'", int1 == (-3973239));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0815");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100 + "'", int1 == 1100);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0816");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 752.00006f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0817");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(51.0f, (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0818");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(750, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 747 + "'", int2 == 747);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0819");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 747);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.309211917671014d + "'", double1 == 7.309211917671014d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0820");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.9999995f + "'", float1 == 4.9999995f);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0821");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(9.889030319346946E42d, (-1403));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0822");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(20.0d, 0.27449439581393875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.999999999999996d + "'", double2 == 19.999999999999996d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0823");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831022614880196E22d + "'", double1 == 3.831022614880196E22d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0824");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 35, (-71750L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0825");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-0.11038872761434562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11016575469079737d) + "'", double1 == (-0.11016575469079737d));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0826");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 750, (float) 747);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 747.0f + "'", float2 == 747.0f);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0827");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(58.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5535566556003668d + "'", double1 == 1.5535566556003668d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0828");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5558738409986911d + "'", double1 == 0.5558738409986911d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0829");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((-0.011004063217493365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011004507408263503d) + "'", double1 == (-0.011004507408263503d));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0830");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(2.841651095269318E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0831");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5049299045672764d) + "'", double1 == (-2.5049299045672764d));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0832");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 68);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7021380249658704E29d + "'", double1 == 1.7021380249658704E29d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0833");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 1124);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1124.0001f + "'", float1 == 1124.0001f);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0834");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(150, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1174 + "'", int2 == 1174);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0835");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(2.1557176047248046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0836");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 68, 0.00390625f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 68.0f + "'", float2 == 68.0f);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0837");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0838");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.9999468636254574d, (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9972406491372166d + "'", double2 == 0.9972406491372166d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0839");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-1403L), (double) (-8.620024E31f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1403.0001f) + "'", float2 == (-1403.0001f));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0840");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-98L), (double) (-101L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0841");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 2248.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.410943342102899d + "'", double1 == 8.410943342102899d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0842");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 68.0f, (double) (-59));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0843");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-1403));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1403L + "'", long1 == 1403L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0844");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-98L), 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0845");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 51);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6702291758433747d + "'", double1 == 0.6702291758433747d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0846");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1612L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0847");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0848");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 990, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 996L + "'", long2 == 996L);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0849");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-0.99999994f), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999940395531084d + "'", double2 == 0.9999940395531084d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0850");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (short) 1, 45L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0851");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0852");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.99999999999999d + "'", double1 == 51.99999999999999d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0853");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-1100L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0854");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0855");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 31682L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 552.9552136168435d + "'", double1 == 552.9552136168435d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0856");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0857");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 0.9999999f, (double) 31682.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998807907104d + "'", double2 == 0.9999998807907104d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0858");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-1023), (float) 5051L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5051.0f + "'", float2 == 5051.0f);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0859");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.2328896037985d) + "'", double1 == (-89.2328896037985d));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0860");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(3.8066624897703196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0861");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0862");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-59));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-60) + "'", int1 == (-60));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0863");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(96, 1100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0864");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(752.0538544431735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0865");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(5.214906219438257d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0866");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7278759594743862d + "'", double1 == 1.7278759594743862d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0867");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8163011535675582d + "'", double1 == 1.8163011535675582d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0868");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.7278759594743862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.628685645972712d + "'", double1 == 5.628685645972712d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0869");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-101L), 1.2379400392853803E27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.158715026157792E-26d) + "'", double2 == (-8.158715026157792E-26d));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0870");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3841857910156255E-7d + "'", double1 == 2.3841857910156255E-7d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0871");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 99);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0872");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-58L), 38903L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0873");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (short) 100, (long) 1076);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0874");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1174);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1174 + "'", int1 == 1174);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0875");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-5041L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-505L) + "'", long2 == (-505L));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0876");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((-0.00949495958537668d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999954923209893d + "'", double1 == 0.999954923209893d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0877");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(5557.690612768985d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0878");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (short) 100, 39098);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0879");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(45.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0880");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.4210854715202004E-14d, 39097);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0881");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0882");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 1124);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1124.0f + "'", float1 == 1124.0f);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0883");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 1403L, 45.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1403.0f + "'", float2 == 1403.0f);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0884");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0885");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(96L, 5051L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96L + "'", long2 == 96L);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0886");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 9.999999f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999046325684d + "'", double2 == 9.999999046325684d);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0887");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (byte) 0, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0888");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 1024, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0889");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 5044L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.219101887471052d + "'", double1 == 9.219101887471052d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0890");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(8103.0916552820945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.693148130426774d + "'", double1 == 9.693148130426774d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0891");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0892");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 990);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0893");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0894");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-1023), 1057L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0895");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-58));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-57) + "'", int1 == (-57));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0896");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(18.0f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18432.0f + "'", float2 == 18432.0f);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0897");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-1023));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1024L) + "'", long1 == (-1024L));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0898");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 32, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.989595361011175E145d + "'", double2 == 9.989595361011175E145d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0899");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (byte) 0, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0900");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 69L, (float) 1023);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 69.0f + "'", float2 == 69.0f);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0901");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(171.88733853924697d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0902");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(747.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 747.00006f + "'", float1 == 747.00006f);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0903");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0904");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(99.00000000000001d, 2.1557176047248046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.549024842023776d + "'", double2 == 1.549024842023776d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0905");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(97.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0906");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0907");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3043045862358962d + "'", double1 == 1.3043045862358962d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0908");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((-1023.0000000000001d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4000681972009933d + "'", double1 == 0.4000681972009933d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0909");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0686474581524463E13d + "'", double1 == 1.0686474581524463E13d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0910");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.5943808256397736d, 34L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0806684928305065E-8d + "'", double2 == 2.0806684928305065E-8d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0911");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1022L, (long) 39098);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0912");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 44L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.00000000000001d + "'", double1 == 44.00000000000001d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0913");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.6906127689845d + "'", double1 == 5557.6906127689845d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0914");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.9544129332653245d, 1100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0915");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0916");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-5041L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5041) + "'", int1 == (-5041));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0917");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(58.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0918");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 0, 2.876217840591642d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0919");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 18.0f, (double) (-58.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-58.0d) + "'", double2 == (-58.0d));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0920");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0921");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(2, 39000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39002 + "'", int2 == 39002);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0922");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0923");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-5041), (long) 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6927768764848492E44d + "'", double2 == 2.6927768764848492E44d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0924");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(39002);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39001 + "'", int1 == 39001);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0925");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 32, 95L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3040L + "'", long2 == 3040L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0926");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 41L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9873392775238264d) + "'", double1 == (-0.9873392775238264d));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0927");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0928");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) ' ', 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2048.0f + "'", float2 == 2048.0f);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0929");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(52L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0930");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 39339L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.275957614183426E-12d + "'", double1 == 7.275957614183426E-12d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0931");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(39000L, (long) (-3973239));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3934239L) + "'", long2 == (-3934239L));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0932");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 1174, (long) (-1500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2674L + "'", long2 == 2674L);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0933");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0934");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-0.5206304090742055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5733992068331006d) + "'", double1 == (-0.5733992068331006d));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0935");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0936");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(9.0d, 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3383347192042695E42d + "'", double2 == 1.3383347192042695E42d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0937");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.27449439581393875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27806386201969124d + "'", double1 == 0.27806386201969124d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0938");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.38927884571783d + "'", double1 == 137.38927884571783d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0939");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0940");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794630987664d + "'", double1 == 0.3678794630987664d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0941");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0942");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(101, 39002);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39002 + "'", int2 == 39002);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0943");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 31, (long) 1076);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0944");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0945");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(39000, 150);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39150 + "'", int2 == 39150);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0946");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-101L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-100.99999f) + "'", float1 == (-100.99999f));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0947");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988093d + "'", double1 == 4.605170185988093d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0948");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9E-324d) + "'", double1 == (-4.9E-324d));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0949");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-3973239), (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230447862 + "'", int2 == 230447862);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0950");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 45, (float) 92L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0951");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 1404, 751);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0952");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 97.0f, 1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.01570065818144d + "'", double2 == 97.01570065818144d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0953");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-2), 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46L) + "'", long2 == (-46L));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0954");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0955");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 39001);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0956");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(4.7683716E-7f, (float) 39035L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39035.0f + "'", float2 == 39035.0f);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0957");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0958");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 0, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0959");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0960");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((-0.011004507408263503d), (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011004507408263501d) + "'", double2 == (-0.011004507408263501d));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0961");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1076, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1076 + "'", int2 == 1076);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0962");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (byte) 100, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0963");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(150.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0964");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0965");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 1, (long) (-5041));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0966");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(99.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0967");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, 1.0000000000000064E90d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0968");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978951861007016d + "'", double1 == 2.3978951861007016d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0969");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1022L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1022 + "'", int1 == 1022);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0970");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.9999999f, (float) (-1403));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0971");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-3.6268604078470186d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6268604078470186d) + "'", double2 == (-3.6268604078470186d));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0972");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((-0.011004507408263503d), (double) 39339L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39339.00000000154d + "'", double2 == 39339.00000000154d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0973");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(750, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0974");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0975");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-3973239L), 8.410943342102899d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3973238.8f) + "'", float2 == (-3973238.8f));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0976");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(58, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0977");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-1099L), 1403L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1541897L) + "'", long2 == (-1541897L));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0978");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 103, 9.220488712827077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.481515002819878d + "'", double2 == 1.481515002819878d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0979");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(3L, (long) 1074);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0980");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(31682L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31682L + "'", long2 == 31682L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0981");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0982");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0983");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(3.469446951953614E-76d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-75.45973974851091d) + "'", double1 == (-75.45973974851091d));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0984");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1124.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0985");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(58.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.753515866530499d + "'", double1 == 4.753515866530499d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0986");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0987");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 230447862);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3044784E8f + "'", float1 == 2.3044784E8f);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0988");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 34L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0989");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 9.000001f, 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.363416448178017d + "'", double2 == 1.363416448178017d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0990");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.999954923209893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29319680325519d + "'", double1 == 57.29319680325519d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0991");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 7.9999995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0992");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(9.000001f, 1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0993");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 1058);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1058.0001f + "'", float1 == 1058.0001f);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0994");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(96, (-3973239));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-381430944) + "'", int2 == (-381430944));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0995");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) (-2.0000002f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0996");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0997");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 31682L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31682.000000000004d + "'", double1 == 31682.000000000004d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0998");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 5, (long) (-381430944));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test0999");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 98.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.99999237060548d + "'", double1 == 98.99999237060548d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest1.test1000");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 18432.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }
}

