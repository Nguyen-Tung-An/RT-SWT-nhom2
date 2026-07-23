package org.apache.commons.math4.core.jdkmath;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccurateMathRegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1501");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) 34);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1502");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(0, 5044);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1503");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 44L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998433086476912d + "'", double1 == 0.9998433086476912d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1504");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-100), (-24.0d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-99.99999f) + "'", float2 == (-99.99999f));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1505");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(1.4346483754816115E113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4346483754816115E113d + "'", double1 == 1.4346483754816115E113d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1506");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 38999);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 680.6609549852686d + "'", double1 == 680.6609549852686d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1507");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(0.3646546874345162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1508");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1124.0001f, 1541897.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1541897.0f + "'", float2 == 1541897.0f);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1509");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 11.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 162753.63620401348d + "'", double1 == 162753.63620401348d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1510");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-3L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1511");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(98.99999237060548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1512");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-2065L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1513");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 98L, (float) 195077L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 98.0f + "'", float2 == 98.0f);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1514");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(38999, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1515");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 964);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1516");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1517");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1101), 1058);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1518");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(9.220488712827077d, 0.513417119032592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1283921591813537d + "'", double2 == 3.1283921591813537d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1519");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 34L, 1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.0d + "'", double2 == 34.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1520");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 151);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 150L + "'", long1 == 150L);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1521");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) '4', 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1077 + "'", int2 == 1077);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1522");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1523");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(4.9E-324d, (double) 2248.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2248.0d + "'", double2 == 2248.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1524");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 6.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1525");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (short) 10, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1526");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(303.5726559648473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4585921114877173E131d + "'", double1 == 3.4585921114877173E131d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1527");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1528");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (-3973238.8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3973238.7499999995d) + "'", double1 == (-3973238.7499999995d));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1529");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((int) ' ', 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1530");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037345d + "'", double1 == 1.4711276743037345d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1531");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1532");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1099L), (long) 1023);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-76L) + "'", long2 == (-76L));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1533");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(2340L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2340 + "'", int1 == 2340);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1534");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(2.600540585471551d, (double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.03380071484756d + "'", double2 == 100.03380071484756d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1535");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1536");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1537");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(4.718863228190482d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1538");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(1.8419481980121127E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.055358578278213E33d + "'", double1 == 1.055358578278213E33d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1539");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(78.1180081993175d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1540");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-4), 10197);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40788) + "'", int2 == (-40788));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1541");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(4.9999995f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1542");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(0.513417119032592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1347192713383873d + "'", double1 == 1.1347192713383873d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1543");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 990);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 989.9999999999999d + "'", double1 == 989.9999999999999d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1544");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(0, 150);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1545");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 5041L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1546");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 38999, (long) (-40788));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38999L + "'", long2 == 38999L);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1547");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1548");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 69.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.0d + "'", double1 == 69.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1549");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 371);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1550");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.384186E-7f + "'", float1 == 2.384186E-7f);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1551");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(45.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1552");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(4.605170185988093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1070134835587689d) + "'", double1 == (-0.1070134835587689d));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1553");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) 9.000001f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1554");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (-2.0f), 318432.2159511391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1555");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(41.0f, 31682.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1556");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 29.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1718.873276109443d + "'", double1 == 1718.873276109443d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1557");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21481175810568434d + "'", double1 == 0.21481175810568434d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1558");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-100));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-99.99999f) + "'", float1 == (-99.99999f));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1559");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 1, (-19500L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19499L) + "'", long2 == (-19499L));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1560");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.4645918875615231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1561");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 1124, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1093L + "'", long2 == 1093L);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1562");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(1.5552986459319043d, 0.6702291758433747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.163911308887745d + "'", double2 == 1.163911308887745d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1563");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(5L, (long) (-19500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19495L) + "'", long2 == (-19495L));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1564");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 5051L, (double) 5042.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5050.9995f + "'", float2 == 5050.9995f);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1565");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-58.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.72769467795052E24d + "'", double1 == 7.72769467795052E24d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1566");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(4624);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4624 + "'", int1 == 4624);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1567");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.998222855403824d + "'", double1 == 2.998222855403824d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1568");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 3693, (long) (-101277));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97584L) + "'", long2 == (-97584L));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1569");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(3.1283921591813537d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1570");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.378061233982227E104d, 22.248715407688383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.378061233982227E104d + "'", double2 == 1.378061233982227E104d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1571");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-1.0E198d), 1.378061233982227E104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E198d + "'", double2 == 1.0E198d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1572");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-1100L), 11.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1100.0f) + "'", float2 == (-1100.0f));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1573");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-5032), (-38968L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1574");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 8.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1575");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-70L), 43L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-113L) + "'", long2 == (-113L));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1576");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-1024L), (float) 1022);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1577");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-10.322801154563672d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18016686817580815d) + "'", double1 == (-0.18016686817580815d));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1578");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.0316963077695576E-54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0316963077695576E-54d + "'", double1 == 1.0316963077695576E-54d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1579");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(45L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1580");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-1023), (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1581");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(44L, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1582");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (-10), 13L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1583");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 750, (long) 4981);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3735750L + "'", long2 == 3735750L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1584");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 30);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 29L + "'", long1 == 29L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1585");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) (-31.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1586");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(81377.39571257407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81377.39571257406d + "'", double1 == 81377.39571257406d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1587");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0.999954923209893d, (-10.322801154563672d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.322801154563672d) + "'", double2 == (-10.322801154563672d));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1588");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 98.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.99999237060547d + "'", double1 == 98.99999237060547d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1589");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) (-46L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1590");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(0.14877547572335054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0025966218975933594d + "'", double1 == 0.0025966218975933594d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1591");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(5.74952226429356E-19d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.74952226429356E-19d + "'", double2 == 5.74952226429356E-19d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1592");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-3934239L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3934239.2f) + "'", float1 == (-3934239.2f));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1593");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 15132L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.317714165221055d + "'", double1 == 10.317714165221055d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1594");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(6.300638599699529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1099668885430018d + "'", double1 == 0.1099668885430018d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1595");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((-6.720514074595375E75d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1596");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-4.657009507803836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6699457962021294d) + "'", double1 == (-1.6699457962021294d));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1597");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(4.29202967422018d, 0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6610060414837631d + "'", double2 == 0.6610060414837631d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1598");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 10, 39339L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1599");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (byte) -1, (-57));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.938894E-18f) + "'", float2 == (-6.938894E-18f));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1600");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(52, (-1500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1552 + "'", int2 == 1552);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1601");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.8753428854949784d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8753428854949784d) + "'", double2 == (-0.8753428854949784d));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1602");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3.0000002f) + "'", float1 == (-3.0000002f));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1603");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-323.3062153431158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.471749481519179d) + "'", double1 == (-6.471749481519179d));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1604");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948823d + "'", double1 == 1.5707963267948823d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1605");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1606");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((-0.7853981037928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0593060152583629d) + "'", double1 == (-1.0593060152583629d));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1607");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(11013.232874703413d, (long) 1021);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1608");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 63, (float) (-40788));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1609");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-101L), 3334366L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3334265L + "'", long2 == 3334265L);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1610");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(5.74952226429356E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.74952226429356E-19d + "'", double1 == 5.74952226429356E-19d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1611");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 60L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 60.000004f + "'", float1 == 60.000004f);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1612");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(750, (-56));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1613");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (byte) 10, 1404L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1614");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.6108652381980153d, 2.1169562199502203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6108652381980153d + "'", double2 == 0.6108652381980153d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1615");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-9223372036854775808L), 149);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.582018229284824E63d) + "'", double2 == (-6.582018229284824E63d));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1616");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-5041));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5041.0005f) + "'", float1 == (-5041.0005f));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1617");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-24.0d), (-1158));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1618");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0.513417119032592d, (-0.9287285890811148d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9287285890811148d) + "'", double2 == (-0.9287285890811148d));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1619");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 101217);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 101216L + "'", long1 == 101216L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1620");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-9), 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1621");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(5041L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5040L + "'", long1 == 5040L);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1622");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(1.0137944462594644d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1623");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-4), 1403);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1624");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 2339.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8838478767553765d) + "'", double1 == (-0.8838478767553765d));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1625");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(99, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1626");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9156174186055479d) + "'", double1 == (-0.9156174186055479d));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1627");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 67320, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3837240L + "'", long2 == 3837240L);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1628");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.2185587342324002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2185587342324d + "'", double1 == 1.2185587342324d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1629");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 39339L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1630");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 110L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 110.0f + "'", float2 == 110.0f);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1631");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1632");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 17, 752L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 769L + "'", long2 == 769L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1633");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1634");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(81377.39571257406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.33458039961069d + "'", double1 == 43.33458039961069d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1635");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (-24), 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1636");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 12L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.0f + "'", float1 == 12.0f);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1637");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 1404L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1638");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.9998433086476912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998433086476913d + "'", double1 == 0.9998433086476913d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1639");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(9.536743164063944E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707953731205802d + "'", double1 == 1.5707953731205802d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1640");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.011004507408263501d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1641");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1404);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1404 + "'", int1 == 1404);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1642");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 98);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637970947608805E42d + "'", double1 == 3.637970947608805E42d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1643");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((-1.0d), 9.999999046325684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1644");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549018d) + "'", double1 == (-1.5574077246549018d));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1645");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(34, 2340);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2306) + "'", int2 == (-2306));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1646");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((-6.720514074595375E75d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9294703655440564d + "'", double1 == 0.9294703655440564d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1647");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-2241L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2240L) + "'", long1 == (-2240L));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1648");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1649");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 4624);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4624L + "'", long1 == 4624L);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1650");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(3693);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3694 + "'", int1 == 3694);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1651");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 751, (long) (-34));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-25534L) + "'", long2 == (-25534L));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1652");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 39339L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.010089277979496d + "'", double1 == 34.010089277979496d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1653");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(13L, 98L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-85L) + "'", long2 == (-85L));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1654");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1058);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1057 + "'", int1 == 1057);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1655");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(5901.465289847479d, (-5.739270507804302d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5901.465289847479d + "'", double2 == 5901.465289847479d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1656");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-1126323), (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1126322.9f) + "'", float2 == (-1126322.9f));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1657");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 1500, (double) (-25534L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-25534.0d) + "'", double2 == (-25534.0d));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1658");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1659");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 50, (long) (-24));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1200L) + "'", long2 == (-1200L));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1660");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 35, 8642L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1661");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1662");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(68, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1663");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(1023);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1664");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(12, 990);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-978) + "'", int2 == (-978));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1665");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((-0.9673576209121749d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1666");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-57L), (long) (-2306));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131442L + "'", long2 == 131442L);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1667");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-46L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-45.999996f) + "'", float1 == (-45.999996f));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1668");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615942060206032d) + "'", double1 == (-0.7615942060206032d));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1669");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(1.026672031199051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.21678121072212d + "'", double1 == 1.21678121072212d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1670");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.6506783754890694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9168407258198261d + "'", double1 == 0.9168407258198261d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1671");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-1158));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1672");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-53L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1673");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) (-100.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5729.5779513082325d) + "'", double1 == (-5729.5779513082325d));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1674");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, 1.653595504961241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1675");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-57L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-57) + "'", int1 == (-57));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1676");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 1025);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.9999f + "'", float1 == 1024.9999f);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1677");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 747, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 715L + "'", long2 == 715L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1678");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(0, 3694);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1679");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(1.0686474581524463E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1680");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-19499L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-19498.998f) + "'", float1 == (-19498.998f));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1681");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-85L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-84L) + "'", long1 == (-84L));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1682");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 39000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39000 + "'", int1 == 39000);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1683");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(0.4000681972008891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3805651664202132d + "'", double1 == 0.3805651664202132d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1684");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(1407.0110163037104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1685");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(2.876217840591642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.74702401240318d + "'", double1 == 17.74702401240318d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1686");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1687");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-3973239));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3973239.0d) + "'", double1 == (-3973239.0d));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1688");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(19L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1689");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(39340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39340L + "'", long1 == 39340L);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1690");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (-9));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-8.999999f) + "'", float1 == (-8.999999f));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1691");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 163L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 163.0f + "'", float1 == 163.0f);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1692");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.9783689733630179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2579496654928866d + "'", double1 == 2.2579496654928866d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1693");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-1403));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1694");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(996L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 997L + "'", long1 == 997L);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1695");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1.5149218250144574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1696");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) 0, 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1697");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 2.89137198E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1698");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-101L), 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.99999f) + "'", float2 == (-100.99999f));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1699");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1403.0001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1403.0001f + "'", float1 == 1403.0001f);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1700");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 131442L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 131442.0d + "'", double1 == 131442.0d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1701");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(35508.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1702");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-59));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-60L) + "'", long1 == (-60L));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1703");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 101);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 101.0f + "'", float1 == 101.0f);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1704");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) (-19500L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19500.0d + "'", double1 == 19500.0d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1705");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.00390625f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0039062505f + "'", float1 == 0.0039062505f);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1706");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(1022, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1021 + "'", int2 == 1021);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1707");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 29.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15424956536653608d + "'", double1 == 0.15424956536653608d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1708");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-19500), 39001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39001 + "'", int2 == 39001);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1709");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-113L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 113.0f + "'", float1 == 113.0f);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1710");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1.0911919338029339d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0911919338029339d + "'", double2 == 1.0911919338029339d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1711");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1712");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 29L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 28.999998f + "'", float1 == 28.999998f);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1713");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 68);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.404276049931741E29d + "'", double1 == 3.404276049931741E29d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1714");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(552.9552136168435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.988243315458331E239d + "'", double1 == 6.988243315458331E239d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1715");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(5.74952226429356E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1716");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1717");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-2), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1718");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-1.0122909661567112d), (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.007908523173099306d) + "'", double2 == (-0.007908523173099306d));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1719");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.4131591025766d + "'", double1 == 148.4131591025766d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1720");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 5044.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.219101887471052d + "'", double1 == 9.219101887471052d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1721");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1722");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1723");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 163L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1724");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 715L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8543060418010806d + "'", double1 == 2.8543060418010806d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1725");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (-56), (-2240L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1726");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (-84L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1727");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(45.00000381469727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4934404321407803E19d + "'", double1 == 3.4934404321407803E19d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1728");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((-0.9999999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1729");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(63L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1730");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-110));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-109) + "'", int1 == (-109));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1731");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1.378061233982227E104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.405170582708583E102d + "'", double1 == 2.405170582708583E102d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1732");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 11L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999994421064d + "'", double1 == 0.9999999994421064d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1733");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(103, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1734");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(0.9294703655440564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6572455432582894d + "'", double1 == 0.6572455432582894d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1735");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1736");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 110, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1737");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(1403);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1404 + "'", int1 == 1404);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1738");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 39339L, (-1398));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1739");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.9998433086476913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404341504613386d + "'", double1 == 0.5404341504613386d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1740");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5125322052253505d + "'", double1 == 1.5125322052253505d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1741");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(0.8191520442889918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9356674176231776d + "'", double1 == 0.9356674176231776d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1742");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 17);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.41549527535753E7d + "'", double1 == 2.41549527535753E7d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1743");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 100L, 101217);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1744");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 10197, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1745");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(1.5707953731205802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99994535848664d + "'", double1 == 89.99994535848664d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1746");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 149);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1747");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 1499.9999f, (-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5203309189782885d) + "'", double2 == (-1.5203309189782885d));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1748");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-5786.873730821314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1749");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-2.3561944007853803d), (double) 45L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.6169477278265224E16d) + "'", double2 == (-5.6169477278265224E16d));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1750");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-1403), (float) (-381430944));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.81430944E8f) + "'", float2 == (-3.81430944E8f));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1751");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 58);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.99999999999999d + "'", double1 == 57.99999999999999d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1752");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 98);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6998536538095259d + "'", double1 == 0.6998536538095259d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1753");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1754");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 3040L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1755");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(0.6538956333321687d, (double) 46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46.00464736849192d + "'", double2 == 46.00464736849192d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1756");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-97584L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-97584.01f) + "'", float1 == (-97584.01f));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1757");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 4981);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1758");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((-0.9999999801317847d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1759");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (-46.000004f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-46.0d) + "'", double1 == (-46.0d));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1760");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(62.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.99999999999999d + "'", double1 == 61.99999999999999d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1761");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) (-381430944), (-0.9673576209121749d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.81430944E8d + "'", double2 == 3.81430944E8d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1762");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 101217);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1763");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-19495L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9882860056052201d + "'", double1 == 0.9882860056052201d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1764");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 1543299L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.249433538888923d + "'", double1 == 14.249433538888923d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1765");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 4, (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1766");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 42L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.0d + "'", double1 == 42.0d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1767");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(29L, 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1053L + "'", long2 == 1053L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1768");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(39098);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39099 + "'", int1 == 39099);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1769");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(1.7278759594743862d, 1058);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1770");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(39098L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39099L + "'", long1 == 39099L);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1771");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-100.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5063656411097588d + "'", double1 == 0.5063656411097588d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1772");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-5041L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5041.0f + "'", float1 == 5041.0f);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1773");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(98.99999237060548d, 230447862);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1774");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987703015263d + "'", double1 == 0.19611987703015263d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1775");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(3395, 1124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1776");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 0.00390625f, (double) 39340L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00390625d + "'", double2 == 0.00390625d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1777");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-3.81430944E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9197588302983898d) + "'", double1 == (-0.9197588302983898d));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1778");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-97584L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1779");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(0.27449439581393875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2678960939837347d + "'", double1 == 0.2678960939837347d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1780");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 51);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.625068916307673d + "'", double1 == 4.625068916307673d);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1781");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-0.01100428531422293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011004063222871775d) + "'", double1 == (-0.011004063222871775d));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1782");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) 10, 0.9155494254642262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.232835264726399d + "'", double2 == 8.232835264726399d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1783");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(1.0401141806741405d, 0.3805651664202132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.22003820237725d + "'", double2 == 1.22003820237725d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1784");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-60));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1785");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1786");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 33L, (float) 17);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1787");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-59));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1788");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(4.0656117753521525E117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1789");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(1543300, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1790");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1791");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 59, 50.498986710526204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.0d + "'", double2 == 59.0d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1792");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((-0.9405433411969535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2242263767952082d) + "'", double1 == (-1.2242263767952082d));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1793");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(27.725887222397812d, (double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-27.725887222397812d) + "'", double2 == (-27.725887222397812d));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1794");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(2.3978951861007016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.454544973767493d + "'", double1 == 5.454544973767493d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1795");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 10197);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10197.0f + "'", float1 == 10197.0f);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1796");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(3.443584143042217E69d, 3.009973513226778E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06502202612056943d) + "'", double2 == (-0.06502202612056943d));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1797");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 1024, 9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0d + "'", double2 == 1024.0d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1798");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(964.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.824973989225338d + "'", double1 == 16.824973989225338d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1799");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (-8.999999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1800");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-101.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-101.00001f) + "'", float1 == (-101.00001f));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1801");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.0000000000000064E90d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1802");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(96.00000000000001d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1803");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(30.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4913616938342726d + "'", double1 == 1.4913616938342726d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1804");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 371, 117L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1805");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47677144967045465d + "'", double1 == 0.47677144967045465d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1806");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 1403, 3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6268604078470186d + "'", double2 == 3.6268604078470186d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1807");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.4346483754816115E113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1808");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(1.7021380249658704E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.541979622617874E9d + "'", double1 == 5.541979622617874E9d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1809");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(7.309211917671014d, (double) (-1403.0001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1403.019161347474d + "'", double2 == 1403.019161347474d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AccurateMathRegressionTest3.test1810");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(1021, (-1126323));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1125302) + "'", int2 == (-1125302));
    }
}

