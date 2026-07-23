package org.apache.commons.math4.core.jdkmath;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccurateMathRegressionTest2 {

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
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1001");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(4.605170185988093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988093d + "'", double1 == 4.605170185988093d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1002");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 99.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1003");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 98);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1004");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(35L, (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1005");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(2L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1006");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1007");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1008");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(150);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 151 + "'", int1 == 151);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1009");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(98.99999237060548d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1010");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1011");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 58, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42L) + "'", long2 == (-42L));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1012");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(5042L, 31682L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5042L + "'", long2 == 5042L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1013");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 39150);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39151L + "'", long1 == 39151L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1014");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(5044L, 752L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5044L + "'", long2 == 5044L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1015");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 39001);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.264489746204287d + "'", double1 == 11.264489746204287d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1016");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1017");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 43L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1018");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(58, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8642 + "'", int2 == 8642);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1019");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(4.718863228190481d, (double) 1022L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.718863228190482d + "'", double2 == 4.718863228190482d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1020");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(45L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2340L + "'", long2 == 2340L);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1021");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-42L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1022");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 91L, 0.19571745311082508d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.0d + "'", double2 == 91.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1023");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 5044, (long) 103);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5044L + "'", long2 == 5044L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1024");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 95L, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6080.0d + "'", double2 == 6080.0d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1025");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(97, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1026");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(4.532599493153256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1027");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 44L, (float) 1124);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1124.0f + "'", float2 == 1124.0f);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1028");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(5.298342365610589d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1029");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.185039863261519d + "'", double1 == 2.185039863261519d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1030");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(0.9999468636254574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3077447383581763E-5d) + "'", double1 == (-2.3077447383581763E-5d));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1031");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(1.5430806348163126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1032");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-57));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-57) + "'", int1 == (-57));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1033");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(1024L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1034");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459046d + "'", double1 == 2.718281828459046d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1035");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.16118920324881E-9d + "'", double1 == 4.16118920324881E-9d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1036");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1037");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999801317847d) + "'", double1 == (-0.9999999801317847d));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1038");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-5041));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5041.0d) + "'", double1 == (-5041.0d));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1039");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(103, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10197 + "'", int2 == 10197);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1040");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1041");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 12L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81377.39571257407d + "'", double1 == 81377.39571257407d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1042");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(552.9552136168435d, (double) 18.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.0d + "'", double2 == 18.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1043");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 1077L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5364966035106962d + "'", double1 == 0.5364966035106962d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1044");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (-1101));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1045");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(58, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1046");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-14.750469787535078d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1047");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 2674L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8753428854949784d) + "'", double1 == (-0.8753428854949784d));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1048");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 18432.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1049");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.5553480614894135d, (-98L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0316963077695576E-54d + "'", double2 == 1.0316963077695576E-54d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1050");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1051");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.5160200414096707d, 752L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.764559724083748E135d + "'", double2 == 7.764559724083748E135d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1052");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(171.88733853924697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.14683925370892d + "'", double1 == 5.14683925370892d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1053");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1054");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 751, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 375.5f + "'", float2 == 375.5f);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1055");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 230447862);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 230447861L + "'", long1 == 230447861L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1056");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.5509003805879408d, 39000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1057");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-1066L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1066L) + "'", long1 == (-1066L));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1058");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 92L, 1.2379400392853803E27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1059");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1060");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.8154648767857287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8154648767857287d + "'", double1 == 0.8154648767857287d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1061");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1062");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (-5041L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1063");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(2.3841858E-7f, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.7778932E22f + "'", float2 == 3.7778932E22f);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1064");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-46L), (double) (-505L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-46.000004f) + "'", float2 == (-46.000004f));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1065");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-2L), (float) (-46L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1066");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1067");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-1403), 0.7523589792368448d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1068");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1069");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(11.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1070");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 39097);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1071");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(2.8872709503576206d, (double) 35508L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35508.0d + "'", double2 == 35508.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1072");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(4.29202967422018d, (long) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.915187884409635E32d + "'", double2 == 7.915187884409635E32d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1073");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 1124);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1124.0d + "'", double1 == 1124.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1074");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(4.9E-324d, (double) (-1101));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1101.0d + "'", double2 == 1101.0d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1075");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-71750L), (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1076");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 39340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.273144272664531d + "'", double1 == 11.273144272664531d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1077");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023560237179d + "'", double1 == 0.5403023560237179d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1078");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1079");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 40352.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6058650648929875d + "'", double1 == 4.6058650648929875d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1080");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(0.9999940395531084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813693723408469d + "'", double1 == 0.8813693723408469d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1081");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 32, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.01562118716424d + "'", double2 == 32.01562118716424d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1082");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(171.88733853924697d, (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 171.88733853924694d + "'", double2 == 171.88733853924694d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1083");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-53L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1084");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (byte) 1, (double) 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1085");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 58, (long) 39150);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1086");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(0.1353352832366127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.513417119032592d + "'", double1 == 0.513417119032592d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1087");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(2.600540585471551d, (-1.580696992792798d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1169562199502203d + "'", double2 == 2.1169562199502203d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1088");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(57, 361);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1089");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.7021380249658704E29d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1090");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5552986459319043d + "'", double1 == 1.5552986459319043d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1091");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 96);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.00000000000001d + "'", double1 == 96.00000000000001d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1092");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.8813735870195429d, 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013659697099373378d + "'", double2 == 0.013659697099373378d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1093");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3.7778932E22f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.7778932E22f + "'", float2 == 3.7778932E22f);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1094");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.8066624897703196d, 51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5427919997918545E30d + "'", double2 == 1.5427919997918545E30d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1095");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 8642);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.765625E-4f + "'", float1 == 9.765625E-4f);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1096");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(3.469446951953614E-76d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1097");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 10L, 1.5607268686116467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.368623890763764d + "'", double2 == 36.368623890763764d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1098");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1099");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (-58.0f), 2.718281817253452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-58.0d) + "'", double2 == (-58.0d));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1100");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (-46.000004f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5490606217550391d) + "'", double1 == (-1.5490606217550391d));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1101");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-0.00949495958537668d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009494816922659067d) + "'", double1 == (-0.009494816922659067d));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1102");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1103");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, 2.117922474660835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1104");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(68, 990);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67320 + "'", int2 == 67320);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1105");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2075343299958265d + "'", double1 == 3.2075343299958265d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1106");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610486d + "'", double1 == 5.298292365610486d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1107");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 15.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.000000000000002d + "'", double1 == 15.000000000000002d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1108");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-42L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-43L) + "'", long1 == (-43L));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1109");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(750, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1110");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(4.999999999999999d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.999999999999999d + "'", double2 == 4.999999999999999d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1111");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 9);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1112");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 68);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5560915044170451d + "'", double1 == 1.5560915044170451d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1113");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((-0.8414709848078965d), 0.8813693723408469d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2185587342324002d + "'", double2 == 1.2185587342324002d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1114");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) '#', (float) 103);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 103.0f + "'", float2 == 103.0f);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1115");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.363416448178017d, (-1023.0000000000001d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.363416448178017d) + "'", double2 == (-1.363416448178017d));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1116");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-5032L), (float) 751);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5032.0f) + "'", float2 == (-5032.0f));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1117");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(4.605170185988093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1118");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 34, 5051L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1119");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 62, (double) 69L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.0d + "'", double2 == 62.0d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1120");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (-59));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1121");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.026672031199051d + "'", double1 == 1.026672031199051d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1122");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 1022);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5550380793155483d) + "'", double1 == (-0.5550380793155483d));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1123");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1124");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39592515018183416d) + "'", double1 == (-0.39592515018183416d));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1125");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 38903L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38903 + "'", int1 == 38903);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1126");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 1074, (float) 5051L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1074.0f + "'", float2 == 1074.0f);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1127");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1128");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1.5604874136486533d, 0.1353352832366127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5604874136486533d + "'", double2 == 1.5604874136486533d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1129");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 100, 0.9155494254642262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01915910278274013d) + "'", double2 == (-0.01915910278274013d));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1130");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 4, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1131");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 39000, (float) 1077L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39000.0f + "'", float2 == 39000.0f);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1132");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.633123935319537E16d) + "'", double1 == (-1.633123935319537E16d));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1133");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-46.000004f), 990);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1134");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, 1.0000000000000064E90d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1135");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(171.88733853924694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7834868911723644d + "'", double1 == 0.7834868911723644d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1136");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 39001, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39000.996f + "'", float2 == 39000.996f);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1137");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0980197632589188d + "'", double1 == 1.0980197632589188d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1138");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(9.765625E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1139");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-4));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1140");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(0.978368973363018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009497328366384585d) + "'", double1 == (-0.009497328366384585d));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1141");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1142");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 38903, 39098);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1143");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.8163011535675582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8163011535675584d + "'", double1 == 1.8163011535675584d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1144");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1145");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1146");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1147");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(1.363416448178017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.1180081993175d + "'", double1 == 78.1180081993175d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1148");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(1.363416448178017d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1149");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1403, 1100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1543300 + "'", int2 == 1543300);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1150");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(31682L, 11L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1151");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 32, (long) 50);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330656E75d + "'", double2 == 1.8092513943330656E75d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1152");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(18L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19L + "'", long2 == 19L);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1153");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 39000, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19500L) + "'", long2 == (-19500L));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1154");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.5515679291054285d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5515679291054285d + "'", double2 == 1.5515679291054285d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1155");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.4400166664355611d, 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1156");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-58L), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 58.0f + "'", float2 == 58.0f);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1157");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(58L, (long) 230447862);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13365975996L + "'", long2 == 13365975996L);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1158");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((-5041.0d), 2.386824089051352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5041.000565059404d + "'", double2 == 5041.000565059404d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1159");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1160");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(4.718863228190482d, 0.01597935193909316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01597935193909316d + "'", double2 == 0.01597935193909316d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1161");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(2.117922474660835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1162");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-5032L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5031.999999999999d) + "'", double1 == (-5031.999999999999d));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1163");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 38903, (long) 747);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59L + "'", long2 == 59L);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1164");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1165");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.0316963077695576E-54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0316963077695574E-54d + "'", double1 == 1.0316963077695574E-54d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1166");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(58.0f, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 58.0f + "'", float2 == 58.0f);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1167");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(35L, (long) (-1403));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1403L) + "'", long2 == (-1403L));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1168");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-0.34555456183832556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35999884922789255d) + "'", double1 == (-0.35999884922789255d));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1169");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 5, 39035L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195175L + "'", long2 == 195175L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1170");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-68L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-67L) + "'", long1 == (-67L));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1171");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(0L, (long) 747);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-747L) + "'", long2 == (-747L));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1172");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(5557.6906127689845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 318432.2159511391d + "'", double1 == 318432.2159511391d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1173");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-101L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1174");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(1.007188009910847d, 0.0034159006743024046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-792.945650913739d) + "'", double2 == (-792.945650913739d));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1175");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 62, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1176");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577404893098d + "'", double1 == 572.9577404893098d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1177");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 39000.0f, 1.363416448178017d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 38999.99999999999d + "'", double2 == 38999.99999999999d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1178");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((-8.620024E31f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1179");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1403), (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1180");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1181");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (short) -1, (double) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1182");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 3.0000002f, 99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.185474980337434d + "'", double2 == 4.185474980337434d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1183");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 5044.0f, 3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14877547572335054d + "'", double2 == 0.14877547572335054d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1184");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(39098L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39097L + "'", long2 == 39097L);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1185");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(95L, (long) 68);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 163L + "'", long2 == 163L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1186");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1022);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1021 + "'", int1 == 1021);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1187");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1188");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3.174802103936399d, (-75.45973974851091d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-75.45973974851091d) + "'", double2 == (-75.45973974851091d));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1189");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(8.410943342102899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5286095418186677d) + "'", double1 == (-0.5286095418186677d));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1190");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(35508L, 996L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1191");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(112.25417586887359d, (-0.5733992068331006d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1192");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(195175L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97588L) + "'", long2 == (-97588L));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1193");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1194");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(0.00341590067433341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034158940313342378d + "'", double1 == 0.0034158940313342378d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1195");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(0.4000681972009933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4228736087868736d + "'", double1 == 0.4228736087868736d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1196");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(6, 1404);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1398) + "'", int2 == (-1398));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1197");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453290855467615d + "'", double1 == 0.17453290855467615d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1198");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1199");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1200");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-97588L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1201");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(5044.000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1202");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 96L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 96.00001f + "'", float1 == 96.00001f);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1203");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(30.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1204");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 12L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.999999f + "'", float1 == 11.999999f);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1205");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 6, 99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000000000000001d + "'", double2 == 6.000000000000001d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1206");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-747L), 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2241L) + "'", long2 == (-2241L));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1207");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 10197, 1.0000000000000064E90d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.452443371346828d + "'", double2 == 22.452443371346828d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1208");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999403953551d) + "'", double1 == (-0.9999999403953551d));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1209");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 2L, (-381430944));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1210");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(7.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1211");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(1.7278759594743862d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1212");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(39150);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39150 + "'", int1 == 39150);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1213");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1214");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 39340L, 1124);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1215");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-3973239), 92L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1216");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 22L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1217");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-1398), 195175L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195175L + "'", long2 == 195175L);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1218");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(0.3646546874345162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43811819944950753d) + "'", double1 == (-0.43811819944950753d));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1219");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1500, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1500) + "'", int2 == (-1500));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1220");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(5051.0f, 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1221");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 3.7778932E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.67918572255584d + "'", double1 == 52.67918572255584d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1222");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(100, (-1100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1100) + "'", int2 == (-1100));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1223");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-1023));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1224");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (-42L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.74952226429356E-19d + "'", double1 == 5.74952226429356E-19d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1225");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 747);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1226");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 99, (float) 39098L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.0f + "'", float2 == 99.0f);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1227");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 8.620024E31f, (-1.5535566556003668d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.62002408155196E31d) + "'", double2 == (-8.62002408155196E31d));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1228");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-1403.0001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1229");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(1021, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1021 + "'", int2 == 1021);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1230");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1231");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(0.11918392295652788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1189035473777249d + "'", double1 == 0.1189035473777249d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1232");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(35508.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 619.7315107981466d + "'", double1 == 619.7315107981466d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1233");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-101L), (float) (-19500L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-101.0f) + "'", float2 == (-101.0f));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1234");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1235");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 195175L, 0.01597935193909316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 195174.99999999997d + "'", double2 == 195174.99999999997d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1236");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-2.5049299045672764d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5049299045672764d) + "'", double2 == (-2.5049299045672764d));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1237");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(9.53674316406539E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164063944E-7d + "'", double1 == 9.536743164063944E-7d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1238");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 100, 1076);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1239");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(38075L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38076L + "'", long1 == 38076L);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1240");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1241");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-19500L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19500) + "'", int1 == (-19500));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1242");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-57.999996f), 39002);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1243");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-67L), 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-274432.0d) + "'", double2 == (-274432.0d));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1244");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(3.7778932E22f, 1074);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1245");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 3395);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3395.0002f + "'", float1 == 3395.0002f);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1246");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1247");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-10), 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1248");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 99.99999f, 3395);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1249");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.6538956333321687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7127220246404314d + "'", double1 == 0.7127220246404314d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1250");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(1.5515679291054285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.718863228190481d + "'", double1 == 3.718863228190481d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1251");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1252");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.7523589792368448d, 51L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.985176463039533E-7d + "'", double2 == 4.985176463039533E-7d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1253");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(5557.6906127689845d, 5.14683925370892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8809156821590884E19d + "'", double2 == 1.8809156821590884E19d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1254");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(1.196599625992853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0137944462594644d + "'", double1 == 1.0137944462594644d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1255");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 39098L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.57385217019883d + "'", double1 == 10.57385217019883d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1256");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-101.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7627825445142729d) + "'", double1 == (-1.7627825445142729d));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1257");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-747L), (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-75447L) + "'", long2 == (-75447L));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1258");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 747.0f, 0.36787939731679814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16305595041706056d) + "'", double2 == (-0.16305595041706056d));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1259");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 30);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 29.999998f + "'", float1 == 29.999998f);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1260");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 747.00006f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.073472885824545d + "'", double1 == 9.073472885824545d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1261");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(5041.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.147505353300847d + "'", double1 == 17.147505353300847d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1262");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-3973239), 69L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 69L + "'", long2 == 69L);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1263");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.0000000000009095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1264");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(0.5558738409986911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8222276533526796d + "'", double1 == 0.8222276533526796d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1265");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 34L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 33.999996f + "'", float1 == 33.999996f);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1266");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(1.8163011535675584d, 103);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8419481980121127E31d + "'", double2 == 1.8419481980121127E31d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1267");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(1.7453292519943295d, 1.0316963077695576E-54d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1268");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.1353352832366127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1361707344559158d + "'", double1 == 0.1361707344559158d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1269");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(39098);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39098 + "'", int1 == 39098);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1270");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-70L), 3.469446951953614E-76d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1271");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(2.993222846126381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1272");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-101.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-101.00000000000001d) + "'", double1 == (-101.00000000000001d));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1273");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1274");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(4.532599493153256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1275");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(39002, 39150);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39002 + "'", int2 == 39002);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1276");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(5044, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4981 + "'", int2 == 4981);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1277");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(39000.996f, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1278");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 3040L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3040.0f + "'", float1 == 3040.0f);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1279");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(195175L, 98L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195077L + "'", long2 == 195077L);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1280");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) (-71750L), 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1281");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1282");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(1021, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 964 + "'", int2 == 964);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1283");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(2048.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1284");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-1023), 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101277) + "'", int2 == (-101277));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1285");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 15, (-6.720514074595375E75d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1286");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.8937010821802513d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1287");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1288");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (short) 1, 58L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57L) + "'", long2 == (-57L));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1289");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(45L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 46L + "'", long1 == 46L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1290");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 5042L, (float) (-100));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5042.0f + "'", float2 == 5042.0f);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1291");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.7523589792368448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6365541778616164d + "'", double1 == 0.6365541778616164d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1292");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.7127220246404314d, (double) 1058);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1058.0d + "'", double2 == 1058.0d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1293");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1294");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1.8809156821590884E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2828171606071258E17d + "'", double1 == 3.2828171606071258E17d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1295");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(2.841651018781726E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.959616647039234E-6d + "'", double1 == 4.959616647039234E-6d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1296");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.17453290855467615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999046325684d + "'", double1 == 9.999999046325684d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1297");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-5041), 39150);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1298");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 5042.0f, 1124);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1299");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(1.5607966601082315d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1598.255779950829d + "'", double2 == 1598.255779950829d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1300");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1301");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.39592515018183416d), (long) 1174);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1302");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 375.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 376.0d + "'", double1 == 376.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1303");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 57L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1304");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) (-101L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.657009507803836d) + "'", double1 == (-4.657009507803836d));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1305");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 0L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1306");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 103);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5901.465289847479d + "'", double1 == 5901.465289847479d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1307");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1308");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-43L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-43) + "'", int1 == (-43));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1309");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(2.841651018781726E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.841651018781726E-4d + "'", double1 == 2.841651018781726E-4d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1310");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(230447862, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1311");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.9972406491372166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4964912690902843d + "'", double1 == 1.4964912690902843d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1312");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-1.0000001f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1313");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 96);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1314");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 31L, 0.013659697099373378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.0d + "'", double2 == 31.0d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1315");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 39098);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 39098.0f + "'", float1 == 39098.0f);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1316");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8191520442889918d + "'", double1 == 0.8191520442889918d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1317");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.8419481980121127E31d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8419481980121127E31d) + "'", double2 == (-1.8419481980121127E31d));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1318");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(361, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 371 + "'", int2 == 371);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1319");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(303.5726559648473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1320");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 361);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.300638599699529d + "'", double1 == 6.300638599699529d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1321");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-747L), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1322");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(50, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1323");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 964);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 964.0d + "'", double1 == 964.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1324");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 13365975996L, (float) 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1325");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715201903E-14d + "'", double1 == 1.4210854715201903E-14d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1326");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 9.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1327");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.216499084404722d + "'", double1 == 0.216499084404722d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1328");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 7.9999995f, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6340077101299677d + "'", double2 == 1.6340077101299677d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1329");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(59L, 31682L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31682L + "'", long2 == 31682L);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1330");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(10.0d, (double) 5044L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1331");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (short) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100L) + "'", long2 == (-100L));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1332");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 39150);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1333");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(51, (-60));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1334");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 6, 3040L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3034L) + "'", long2 == (-3034L));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1335");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(4.999999999999999d, 2.600540585471551d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0911919338029339d + "'", double2 == 1.0911919338029339d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1336");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.31608511601036d + "'", double1 == 9.31608511601036d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1337");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(6.887168286084434E69d, (long) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1338");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(4.605170185988093d, 1.8092513943330656E75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330656E75d + "'", double2 == 1.8092513943330656E75d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1339");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) (-46L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1340");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-0.011004507408263501d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01100428531422293d) + "'", double1 == (-0.01100428531422293d));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1341");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1342");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.8419481980121127E31d, (double) (-1100.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1343");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 34L, 1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4210854715202004E-14d + "'", double2 == 1.4210854715202004E-14d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1344");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1345");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-58.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.72769467795052E24d + "'", double1 == 7.72769467795052E24d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1346");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(78.1180081993175d, (double) 11L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 78.1180081993175d + "'", double2 == 78.1180081993175d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1347");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(31682.0f, (float) 5044);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31682.0f + "'", float2 == 31682.0f);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1348");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-101.00000000000001d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1349");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(1023, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1350");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((-0.1411200080598672d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.085580866682552d) + "'", double1 == (-8.085580866682552d));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1351");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 45.000004f, (double) 45.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.00000381469726d + "'", double2 == 45.00000381469726d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1352");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 1499.9999f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1353");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1354");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.196599625992853d, (double) 39151L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1355");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1356");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(11.264489746204287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1357");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 10, 67320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1358");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1359");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779276891516d + "'", double1 == 57.295779276891516d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1360");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(39000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38999 + "'", int1 == 38999);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1361");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(40352.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1362");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(8.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1363");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-0.9405433411969535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7354717903629746d) + "'", double1 == (-0.7354717903629746d));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1364");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-1.0f), 151);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1365");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-1.0122909661567112d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1366");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) (-70L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4010.7045659157625d) + "'", double1 == (-4010.7045659157625d));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1367");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 41L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2349.1269600363753d + "'", double1 == 2349.1269600363753d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1368");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1369");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1370");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-60), (-101277));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101217 + "'", int2 == 101217);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1371");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1372");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 38999);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1373");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 1124.0001f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1374");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 3.0000002f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1375");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 151);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 151L + "'", long1 == 151L);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1376");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1377");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-59));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-58) + "'", int1 == (-58));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1378");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(32L, 39000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38968L) + "'", long2 == (-38968L));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1379");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 31, (float) (-381430944));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-31.0f) + "'", float2 == (-31.0f));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1380");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-71750L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-71750) + "'", int1 == (-71750));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1381");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-100.99999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.99999237060548d) + "'", double1 == (-100.99999237060548d));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1382");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.009497328366384585d), 58);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.022088039094572E-118d + "'", double2 == 5.022088039094572E-118d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1383");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9287285890811148d) + "'", double1 == (-0.9287285890811148d));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1384");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 96L, 3.82477774979246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2939084190528261d + "'", double2 == 0.2939084190528261d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1385");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.27806386201969124d, 91.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.0d + "'", double2 == 91.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1386");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1387");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 38903L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1388");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 33L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1389");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(0.9873536182198303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.68412185397831d + "'", double1 == 2.68412185397831d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1390");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9227673888116062d) + "'", double1 == (-0.9227673888116062d));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1391");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-57L), 1.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5532542667374942d) + "'", double2 == (-1.5532542667374942d));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1392");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(552.9552136168435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.650889093682501d + "'", double1 == 9.650889093682501d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1393");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-1101), 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1126323) + "'", int2 == (-1126323));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1394");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 68.0f, 1023);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1395");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(0.17453290855467615d, (double) 57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17453290855467615d + "'", double2 == 0.17453290855467615d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1396");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 31, (double) 33L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.27692569068709d + "'", double2 == 45.27692569068709d);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1397");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 41L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 41.0f + "'", float1 == 41.0f);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1398");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(97.0d, (double) 1000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1004.6934855964778d + "'", double2 == 1004.6934855964778d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1399");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(15.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 859.4366926962349d + "'", double1 == 859.4366926962349d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1400");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-1541897L), (long) 747);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2065L) + "'", long2 == (-2065L));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1401");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 45.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4934404321407554E19d + "'", double1 == 3.4934404321407554E19d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1402");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 103);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6229886314423488d + "'", double1 == 0.6229886314423488d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1403");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013462623778017066d) + "'", double1 == (-0.013462623778017066d));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1404");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 9L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1405");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(1.7278759594743862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1406");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, (double) (-3034L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1407");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 1403L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1403.0000000000002d + "'", double1 == 1403.0000000000002d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1408");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-57L), (float) 34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-57.0f) + "'", float2 == (-57.0f));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1409");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 151, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 117L + "'", long2 == 117L);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1410");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-100), 1058);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1158) + "'", int2 == (-1158));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1411");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 163L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.099866427824199d + "'", double1 == 5.099866427824199d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1412");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((-0.5206304090742055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1413");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 1058, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1058.0f) + "'", float2 == (-1058.0f));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1414");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(68, 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4624 + "'", int2 == 4624);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1415");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(5043.9995f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5043.9995f + "'", float2 == 5043.9995f);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1416");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(1.5430806348163126d, 0.7834868911723644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7305922553230297d + "'", double2 == 1.7305922553230297d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1417");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-27.725887222397812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.725887222397812d + "'", double1 == 27.725887222397812d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1418");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(1076, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1419");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(45, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56) + "'", int2 == (-56));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1420");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 46);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.748059710301224E19d + "'", double1 == 4.748059710301224E19d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1421");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-4), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-388) + "'", int2 == (-388));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1422");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1423");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(43L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 42L + "'", long1 == 42L);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1424");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, 2.600540585471551d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1425");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-2065L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1426");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.999996f + "'", float1 == 51.999996f);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1427");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-57.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.99999999999999d) + "'", double1 == (-56.99999999999999d));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1428");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(20.0d, 1.5552986459319043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1429");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-1101), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1430");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-0.9999998807907103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999998807907102d) + "'", double1 == (-0.9999998807907102d));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1431");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(3.8066624897703196d, (double) (-1099L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8066624897703196d + "'", double2 == 3.8066624897703196d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1432");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 50);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.550798992821746d + "'", double1 == 1.550798992821746d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1433");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1434");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) (-1100), (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1100.0018181803155d + "'", double2 == 1100.0018181803155d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1435");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.19571745311082495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1436");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(39001, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3693 + "'", int2 == 3693);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1437");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-57.999996f), (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-57.999996f) + "'", float2 == (-57.999996f));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1438");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 92L, (double) 1404L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1407.0110163037104d + "'", double2 == 1407.0110163037104d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1439");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-1.5707963267948966d), 5.0031545098999704E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1440");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4430227241169226d + "'", double1 == 0.4430227241169226d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1441");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(68);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 68 + "'", int1 == 68);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1442");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1443");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-60));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 60L + "'", long1 == 60L);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1444");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(1.5028014133078293d, 2.876217840591642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.245156568546063d + "'", double2 == 3.245156568546063d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1445");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0, (-57));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1446");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-3034L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1447");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 38076L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1448");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08037538236017183d + "'", double1 == 0.08037538236017183d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1449");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-388));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-388) + "'", int1 == (-388));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1450");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 9.999999f, (double) (-1403.0001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999046325682d + "'", double2 == 9.999999046325682d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1451");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(63L, (long) (-100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37L) + "'", long2 == (-37L));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1452");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-3973239L), (double) 0.00390625f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1453");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.6229886314423488d, 22L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.009973513226778E-5d + "'", double2 == 3.009973513226778E-5d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1454");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(1.5198201197195833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3950770242027244d + "'", double1 == 2.3950770242027244d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1455");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(0.8920048697881602d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1456");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(36.368623890763764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.0d + "'", double1 == 37.0d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1457");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-1541897L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1541897.0f + "'", float1 == 1541897.0f);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1458");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1459");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(39000, (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1460");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(371, 1174);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 371 + "'", int2 == 371);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1461");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-43), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1462");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) (-38968L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.26364325621096d) + "'", double1 == (-11.26364325621096d));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1463");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.08037538236017183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08020274804312569d + "'", double1 == 0.08020274804312569d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1464");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 1022L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8318249398218998d) + "'", double1 == (-0.8318249398218998d));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1465");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.0f, (-1403));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1466");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-67L), 18432.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-67.0f) + "'", float2 == (-67.0f));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1467");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(5044, 39001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5044 + "'", int2 == 5044);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1468");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175201377593356d + "'", double1 == 1.175201377593356d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1469");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.99999999999999d + "'", double1 == 33.99999999999999d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1470");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 41.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.406867935097715d + "'", double1 == 4.406867935097715d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1471");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-10), 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0d) + "'", double2 == (-10.0d));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1472");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 1021, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1473");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(9.53674316406539E-7d, 69.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1474");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-3034L), (-1099L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3334366L + "'", long2 == 3334366L);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1475");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.7523589792368448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9783689733630179d + "'", double1 == 0.9783689733630179d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1476");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(52.67918572255584d, (double) 151L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.67918572255585d + "'", double2 == 52.67918572255585d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1477");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 3395.0002f, 0.7127220246404314d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3052407782502087d + "'", double2 == 0.3052407782502087d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1478");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 964);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.871091294610546d + "'", double1 == 6.871091294610546d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1479");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 5051L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5051.0f + "'", float1 == 5051.0f);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1480");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 34);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1481");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((-0.7354717903629746d), (-0.7354717903629746d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0401141806741405d + "'", double2 == 1.0401141806741405d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1482");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 39151L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39150.99999999999d + "'", double1 == 39150.99999999999d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1483");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1174, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1484");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 9.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.887271056981645d + "'", double1 == 2.887271056981645d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1485");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1486");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1487");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 15);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.999999f + "'", float1 == 14.999999f);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1488");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(7.72769467795052E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1489");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.9287285890811148d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1490");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 1404);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9576941879988857d) + "'", double1 == (-0.9576941879988857d));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1491");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 40352.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1492");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 2340L, (double) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2339.9998f + "'", float2 == 2339.9998f);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1493");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(5.0031545098999704E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.741933484050666d + "'", double1 == 0.741933484050666d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1494");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(38903L, (long) 8642);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8642L + "'", long2 == 8642L);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1495");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 67320, 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.89137198E14f + "'", float2 == 2.89137198E14f);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1496");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 1543300);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1543299L + "'", long1 == 1543299L);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1497");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(0.3052407782502087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.356951688128395d + "'", double1 == 1.356951688128395d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1498");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1578212823495775d + "'", double1 == 1.1578212823495775d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1499");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-5032L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5032) + "'", int1 == (-5032));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest2.test1500");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 8.620024E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4174281362735916E10d + "'", double1 == 4.4174281362735916E10d);
    }
}

