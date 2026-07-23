package org.apache.commons.math4.core.jdkmath;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccurateMathRegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0001");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0002");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0003");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0004");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0005");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (short) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0006");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0007");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(10.0d, (double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0008");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0009");
        double double0 = org.apache.commons.math4.core.jdkmath.AccurateMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0010");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 10.0f, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0011");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0012");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0013");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0014");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0015");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) (-1), (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0016");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(4.605170185988092d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.605170185988092d + "'", double2 == 4.605170185988092d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0017");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0018");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) ' ', (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5395564933646284d + "'", double2 == 1.5395564933646284d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0019");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0020");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05483113556160755d + "'", double1 == 0.05483113556160755d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0021");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0022");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 5044);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5043.9995f + "'", float1 == 5043.9995f);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0023");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0024");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0025");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0026");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 5044);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.702775077901044d + "'", double1 == 3.702775077901044d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0027");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0028");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 'a', (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0030");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0031");
        double double0 = org.apache.commons.math4.core.jdkmath.AccurateMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0032");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0033");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0034");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0035");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((-0.5872139151569291d), (double) 2.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0036");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 303.5726559648473d + "'", double1 == 303.5726559648473d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0037");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0038");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0039");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0040");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0041");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0042");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 0L, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0043");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0044");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0045");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0046");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (short) 100, (double) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0047");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.99999994f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0048");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0049");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0050");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(Double.NaN, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0051");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(2.0f, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0052");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0053");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999999f + "'", float1 == 9.999999f);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0054");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0055");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0056");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0057");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (short) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0058");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0059");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0060");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 100L, 0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6304863798575191d) + "'", double2 == (-0.6304863798575191d));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0061");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0062");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) ' ', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-68L) + "'", long2 == (-68L));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0063");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0064");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 2, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0065");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0066");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0067");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0068");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0069");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(5043.9995f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5043.9995f + "'", float2 == 5043.9995f);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0070");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0071");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1.3383347192042695E42d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0072");
        int int0 = org.apache.commons.math4.core.jdkmath.AccurateMath.EXP_INT_TABLE_MAX_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 750 + "'", int0 == 750);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0073");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((-0.99999994f), (double) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999999f) + "'", float2 == (-0.9999999f));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0074");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (-68L), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.620024E31f) + "'", float2 == (-8.620024E31f));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0075");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0076");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (short) 1, (-68L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 69L + "'", long2 == 69L);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0077");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0078");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 5044, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5044L + "'", long2 == 5044L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0079");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0080");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0081");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0082");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(0.0d, (double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0083");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0084");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0085");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0086");
        int int0 = org.apache.commons.math4.core.jdkmath.AccurateMath.LN_MANT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0087");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0088");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0089");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0090");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0091");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0092");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 6, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0093");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) -1, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0094");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 99, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0095");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 1.0f, 0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5160200414096707d + "'", double2 == 1.5160200414096707d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0096");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0000001f) + "'", float1 == (-1.0000001f));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0097");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0098");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0099");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) ' ', (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0100");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 1024, 1.5160200414096707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.9999999999999d + "'", double2 == 1023.9999999999999d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0101");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.889030319346946E42d + "'", double1 == 9.889030319346946E42d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0102");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(10L, (-68L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58L) + "'", long2 == (-58L));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0103");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 6, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0104");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0L, (-68L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0105");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 69L, 1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000602d + "'", double2 == 1.0000000000000602d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0106");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0107");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0108");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0109");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0110");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 9L, (double) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.999999f + "'", float2 == 8.999999f);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0111");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0112");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 99.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0113");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-2L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0114");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(5044);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5044 + "'", int1 == 5044);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0115");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(97.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999999d + "'", double2 == 96.99999999999999d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0116");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-58L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0117");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0118");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 10, (-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0119");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(5044L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5042L + "'", long2 == 5042L);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0120");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0121");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0122");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0123");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(2, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0124");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.4210854715202004E-14d, 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0125");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0126");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0000000000001d + "'", double1 == 750.0000000000001d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0127");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0128");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0129");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.9999995f + "'", float1 == 7.9999995f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0130");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0131");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0132");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0133");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9092974268256817d) + "'", double1 == (-0.9092974268256817d));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0134");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0135");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(750, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39000 + "'", int2 == 39000);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0136");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0137");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 3L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0138");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0139");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0140");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) (short) 0, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0141");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0142");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-58L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0143");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.999999999999999d + "'", double1 == 4.999999999999999d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0144");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 8.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0145");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0146");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-100));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-101L) + "'", long1 == (-101L));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0147");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0148");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0149");
        int int0 = org.apache.commons.math4.core.jdkmath.AccurateMath.EXP_INT_TABLE_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1500 + "'", int0 == 1500);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0150");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0151");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0152");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0153");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 1L, 3.702775077901044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0154");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(10, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 990 + "'", int2 == 990);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0155");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0156");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(97, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0157");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0158");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0159");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999999f + "'", float1 == 9.999999f);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0160");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0161");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 990, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0162");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(2, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0163");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0164");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-100), 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1100L) + "'", long2 == (-1100L));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0165");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-101L), (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.580696992792798d) + "'", double2 == (-1.580696992792798d));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0166");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(12.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.0f + "'", float1 == 12.0f);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0167");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 990, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0168");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (short) 1, 5042L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5041L) + "'", long2 == (-5041L));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0169");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0170");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(1023.9999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0171");
        int int0 = org.apache.commons.math4.core.jdkmath.AccurateMath.EXP_FRAC_TABLE_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1025 + "'", int0 == 1025);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0172");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) (-101L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5786.873730821314d) + "'", double1 == (-5786.873730821314d));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0173");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 5043.9995f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0174");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 1024, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0175");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0176");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0177");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 11L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0178");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0179");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(4.605170185988092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0180");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0181");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-1.0000001f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0182");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0183");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 69L, (double) 39000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39000.061038413776d + "'", double2 == 39000.061038413776d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0184");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 100, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0185");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 96, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 95.99999999999999d + "'", double2 == 95.99999999999999d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0186");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 1500, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1499.9999f + "'", float2 == 1499.9999f);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0187");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 5042L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0188");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 69L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.92720117104388d + "'", double1 == 4.92720117104388d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0189");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11038872761434562d) + "'", double1 == (-0.11038872761434562d));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0190");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(1024L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0191");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0192");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0193");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 10L, (-1.580696992792798d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.580696992792798d) + "'", double2 == (-1.580696992792798d));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0194");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0195");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0196");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.498986710526204d + "'", double1 == 50.498986710526204d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0197");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0198");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 1025);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0199");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0200");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-1100L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0201");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(10.000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0202");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1411200080598672d) + "'", double1 == (-0.1411200080598672d));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0203");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787939731679814d + "'", double1 == 0.36787939731679814d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0204");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0205");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0206");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0207");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0208");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 5044L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0209");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.00000000000001d + "'", double1 == 99.00000000000001d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0210");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(5042L, (long) 990);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 92L + "'", long2 == 92L);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0211");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0212");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 0L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0213");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 92L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.532599493153256d + "'", double1 == 4.532599493153256d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0214");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.99999994f + "'", float1 == 0.99999994f);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0215");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1, (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0216");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4645918875615231d + "'", double1 == 1.4645918875615231d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0217");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0218");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0219");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(97, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0220");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (short) -1, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0221");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 5042L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5041.999999999999d + "'", double1 == 5041.999999999999d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0222");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(10L, (-5041L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5051L + "'", long2 == 5051L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0223");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9155494254642262d + "'", double1 == 0.9155494254642262d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0224");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0225");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3.141592653589793d, 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0226");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0227");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.5063656411097588d), 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.841651095269318E-4d + "'", double2 == 2.841651095269318E-4d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0228");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0229");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-0.6304863798575191d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011004063217493365d) + "'", double1 == (-0.011004063217493365d));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0230");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 92L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.214906219438257d + "'", double1 == 5.214906219438257d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0231");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0232");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0233");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 1025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0234");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(5041.999999999999d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5042L + "'", long1 == 5042L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0235");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-58L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-58) + "'", int1 == (-58));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0236");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0237");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0238");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (short) 0, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0239");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-1.0000001f), (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3561944007853803d) + "'", double2 == (-2.3561944007853803d));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0240");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-100), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0241");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) (-100), (double) 51);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 112.25417586887359d + "'", double2 == 112.25417586887359d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0242");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(9.094947017729282E-13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0243");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(3.5553480614894135d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0244");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-1023));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.0f + "'", float1 == 1023.0f);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0245");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0246");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-2.3561944007853803d), 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.09582231551322E10d) + "'", double2 == (-8.09582231551322E10d));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0247");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0248");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((-0.0d), 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0249");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33L + "'", long1 == 33L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0250");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(100, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1124 + "'", int2 == 1124);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0251");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(9.0d, 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0252");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0253");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0254");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999999999999d + "'", double1 == 96.99999999999999d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0255");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 9L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0256");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0257");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 39000);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0258");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) (-5041L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0259");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 100L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0260");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0261");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0262");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1124, 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0263");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0264");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 51, (long) 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0265");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0266");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.99999994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0267");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-323.3062153431158d) + "'", double1 == (-323.3062153431158d));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0268");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 99);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 98.99999f + "'", float1 == 98.99999f);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0269");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0270");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0271");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.732511156817248d, 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0272");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-2L), (float) 5051L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0273");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 98.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0274");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-8.620024E31f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0275");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) (-1L), (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0276");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(5044L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15132L + "'", long2 == 15132L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0277");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(11.0d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.378061233982227E104d + "'", double2 == 1.378061233982227E104d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0278");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0279");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(99, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0280");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8103.083927575384d + "'", double1 == 8103.083927575384d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0281");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0282");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0283");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0284");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(52.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0285");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999999999998d + "'", double1 == 9.999999999999998d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0286");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(50.498986710526204d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0287");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) 'a', 1124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0288");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (byte) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0289");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (short) 0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0290");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281817253452d + "'", double1 == 2.718281817253452d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0291");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 750);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0292");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0293");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0294");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.0f, 96);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0295");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0296");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5202350444438292d) + "'", double1 == (-0.5202350444438292d));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0297");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0298");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(Double.POSITIVE_INFINITY, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0299");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0300");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0301");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(5041.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.218705298141904d + "'", double1 == 9.218705298141904d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0302");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(99.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0303");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0304");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(8.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0305");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(7.9999995f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.9999995f + "'", float1 == 7.9999995f);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0306");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 31, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0307");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-0.99999994f), 3.7621956910836314d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0308");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 1500);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0309");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) 10, 1124);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0310");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 5044L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5044.0f + "'", float2 == 5044.0f);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0311");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.447142115009699d + "'", double1 == 11.447142115009699d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0312");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(1.5160200414096707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.386824089051352d + "'", double1 == 2.386824089051352d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0313");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(750.0000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0000000000001d + "'", double1 == 750.0000000000001d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0314");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0315");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0316");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((-5786.873730821314d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0317");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.5553480614894135d, 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2252151862076787E55d + "'", double2 == 1.2252151862076787E55d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0318");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(51, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0319");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0320");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(52, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0321");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0322");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-2), 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1022 + "'", int2 == 1022);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0323");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-1023));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.0000000000001d) + "'", double1 == (-1023.0000000000001d));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0324");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(2.841651095269318E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.841651018781726E-4d + "'", double1 == 2.841651018781726E-4d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0325");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0326");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 33L, (double) (-5041L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5041.108013125686d + "'", double2 == 5041.108013125686d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0327");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-0.1411200080598672d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5206304090742055d) + "'", double1 == (-0.5206304090742055d));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0328");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0329");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((-0.6304863798575191d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0330");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((-0.5206304090742055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0331");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0332");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 1024, (float) (-58L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-58.0f) + "'", float2 == (-58.0f));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0333");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0334");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0335");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0336");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) 10, 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0337");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 52, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.978368973363018d + "'", double2 == 0.978368973363018d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0338");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999468636254574d + "'", double1 == 0.9999468636254574d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0339");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0340");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 0, (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0341");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-58L), 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0342");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0343");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(39000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39001 + "'", int1 == 39001);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0344");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0345");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(1.3440585709080678E43d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0346");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0347");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(11013.232874703393d, 750.0000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5028014133078293d + "'", double2 == 1.5028014133078293d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0348");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, (double) 7.9999995f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0349");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0350");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-2), 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0351");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (byte) 0, (long) (-100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0352");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 1022, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1022L + "'", long2 == 1022L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0353");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(1.3169578969248166d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.653595504961241d + "'", double2 == 1.653595504961241d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0354");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1024L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0355");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-100), 0.9999999958776927d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0356");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 5042L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9673576209121749d) + "'", double1 == (-0.9673576209121749d));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0357");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 99);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0358");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0359");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) 'a', (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0360");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33L + "'", long1 == 33L);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0361");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0362");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-100), 39000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(96, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0364");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-2), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0365");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (short) -1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0366");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0367");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) (-100));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0368");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0369");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 100, (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0370");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.30685281944005d + "'", double1 == 99.30685281944005d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0371");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0372");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0373");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (short) 0, 1.4645918875615231d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0374");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-100.0f), (long) 99);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0E198d) + "'", double2 == (-1.0E198d));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0375");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0376");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 1124, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39340L + "'", long2 == 39340L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0377");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.1411200080598672d), (long) 99);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.445708581007513E-85d) + "'", double2 == (-6.445708581007513E-85d));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0378");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (short) 10, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0379");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0380");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((-6.445708581007513E-85d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.445708581007513E-85d) + "'", double1 == (-6.445708581007513E-85d));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0381");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-8.620024E31f), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.620024E31f + "'", float2 == 8.620024E31f);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0382");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (short) 10, (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0383");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(9.218705298141904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9173106007279803d + "'", double1 == 2.9173106007279803d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0384");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(99.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.0d + "'", double2 == 99.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0385");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0386");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 51, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0387");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(39340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39339L + "'", long1 == 39339L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0388");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000004d + "'", double1 == 1.0000000000000004d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0389");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 5044L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5044.0f + "'", float1 == 5044.0f);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0390");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 1000L, (double) 5044);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19571745311082508d + "'", double2 == 0.19571745311082508d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0391");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-58L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0392");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) 1, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0393");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 750, 9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0394");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(8103.083927575384d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0395");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-58), (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-70L) + "'", long2 == (-70L));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0396");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-11));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0397");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.9999999958776927d, (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776927d + "'", double2 == 0.9999999958776927d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0398");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0399");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(20.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.000000000000004d + "'", double1 == 20.000000000000004d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0400");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0401");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00949495958537668d) + "'", double1 == (-0.00949495958537668d));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0402");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-70L), (long) 1025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-71750L) + "'", long2 == (-71750L));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0403");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-5041L), 1000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0404");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(31L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0405");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0406");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0407");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) (byte) 1, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0408");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(51, 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1076 + "'", int2 == 1076);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0409");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 1, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0410");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.750469787535078d) + "'", double1 == (-14.750469787535078d));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0411");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 12, (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0412");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 5044, 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0413");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-101L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8920048697881602d + "'", double1 == 0.8920048697881602d);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0414");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0415");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0416");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0417");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0418");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0419");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1023);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1022 + "'", int1 == 1022);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0420");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(39000.061038413776d, (double) 7.9999995f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39000.061038413776d + "'", double2 == 39000.061038413776d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0421");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.978368973363018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7523589792368448d + "'", double1 == 0.7523589792368448d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0422");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.19571745311082508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9809083986665003d + "'", double1 == 0.9809083986665003d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0423");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (-58));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5535566556003668d) + "'", double1 == (-1.5535566556003668d));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0424");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 33L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0425");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0426");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402.4287934927351d + "'", double1 == 402.4287934927351d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0427");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-58), 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-57.999996f) + "'", float2 == (-57.999996f));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0428");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 12.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0429");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) 1, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0430");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0000000000000002d) + "'", double1 == (-1.0000000000000002d));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0431");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-0.5202350444438292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5202350444438293d) + "'", double1 == (-0.5202350444438293d));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0432");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(9L, (-70L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0433");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-58L), (float) 990);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-58.0f) + "'", float2 == (-58.0f));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0434");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0435");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(15132L, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0436");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(63L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0437");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(33.0d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5405025670009254d + "'", double2 == 1.5405025670009254d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0438");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.3169578969248166d, (long) 51);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1253621.4988231377d + "'", double2 == 1253621.4988231377d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0439");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 12.0f, (double) 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.0d + "'", double2 == 12.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0440");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2684529660545276d + "'", double1 == 1.2684529660545276d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0441");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(39000, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0442");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874927409903d + "'", double1 == 10.017874927409903d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0443");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(96, 39001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39097 + "'", int2 == 39097);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0444");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0445");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(8.0f, 5043.9995f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5043.9995f + "'", float2 == 5043.9995f);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0446");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(51, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 150 + "'", int2 == 150);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0447");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 63);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0448");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0449");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590464d + "'", double1 == 2.7182818284590464d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0450");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0451");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.9999999958776927d, (double) 15132L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776928d + "'", double2 == 0.9999999958776928d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0452");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 1022L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0453");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(92L, (-1100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 92L + "'", long2 == 92L);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0454");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0455");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(41L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0456");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 5, (double) 1000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.29202967422018d + "'", double2 == 4.29202967422018d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0457");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0458");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(0.9809083986665003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19571745311082495d + "'", double1 == 0.19571745311082495d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0459");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 150);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 150.0d + "'", double1 == 150.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0460");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.9092974268256817d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0461");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0462");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 1124, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2248.0f + "'", float2 == 2248.0f);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0463");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0464");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 750, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 752L + "'", long2 == 752L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0465");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.7182818284590464d, 9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000009095d + "'", double2 == 1.0000000000009095d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0466");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 752L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.876217840591642d + "'", double1 == 2.876217840591642d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0467");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-3L), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0468");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 69L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0469");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 1076);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1077L + "'", long1 == 1077L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0470");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 15132L, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15132.0d + "'", double2 == 15132.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0471");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0472");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-0.9999999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.9999999f + "'", float1 == 0.9999999f);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0473");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(9.889030319346946E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2379400392853803E27d + "'", double1 == 1.2379400392853803E27d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0474");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(31, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0475");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(11L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0476");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0477");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-11), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1100) + "'", int2 == (-1100));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0478");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8872709503576206d + "'", double1 == 2.8872709503576206d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0479");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(31, 150);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0480");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(2.0d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0481");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0482");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-11), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0483");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 'a', 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.443584143042217E69d + "'", double2 == 3.443584143042217E69d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0484");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 45, (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0485");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(45L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 44L + "'", long1 == 44L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0486");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(69L, (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0487");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0488");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0489");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(39000.061038413776d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39000L + "'", long1 == 39000L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0490");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0491");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0492");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(98, 39000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0493");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0494");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 10L, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0495");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(150, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0496");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0497");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(31L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1612L + "'", long2 == 1612L);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0498");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0499");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(20.0d, (-58));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.469446951953614E-76d + "'", double2 == 3.469446951953614E-76d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest0.test0500");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-0.5202350444438293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5943808256397736d + "'", double1 == 0.5943808256397736d);
    }
}

