package org.apache.commons.math4.legacy.core;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathArraysRegressionTest2 {

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
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1001");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray5);
        double[] doubleArray11 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray11);
        double[] doubleArray14 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray11, 100.0d);
        double[] doubleArray15 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray5, doubleArray14);
        double[] doubleArray20 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray21 = new double[][] { doubleArray20 };
        double[] doubleArray22 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray21);
        double double23 = org.apache.commons.math4.legacy.core.MathArrays.distance(doubleArray14, doubleArray22);
        double[] doubleArray24 = org.apache.commons.math4.legacy.core.MathArrays.unique(doubleArray22);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean32 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray25, doubleArray30, false);
        double[] doubleArray37 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray37);
        double[] doubleArray39 = org.apache.commons.math4.legacy.core.MathArrays.convolve(doubleArray30, doubleArray37);
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection40 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING;
        boolean boolean42 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(doubleArray39, orderDirection40, true);
        org.apache.commons.math4.legacy.core.MathArrays.checkOrder(doubleArray24, orderDirection40, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(doubleArray0, orderDirection40, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from double array because \"val\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 90.0166651237425d + "'", double23 == 90.0166651237425d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.0d, (-32.0d), 1664.0d, 320.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + orderDirection40 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING + "'", orderDirection40.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1002");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        double[][] doubleArray5 = new double[][] { doubleArray0, doubleArray1, doubleArray2, doubleArray3, doubleArray4 };
        double[] doubleArray6 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray5);
        double[] doubleArray7 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1003");
        long[] longArray2 = new long[] { (short) 10, ' ' };
        long[] longArray5 = new long[] { (short) 10, ' ' };
        long[] longArray8 = new long[] { (short) 10, ' ' };
        long[] longArray11 = new long[] { (short) 10, ' ' };
        long[] longArray14 = new long[] { (short) 10, ' ' };
        long[] longArray17 = new long[] { (short) 10, ' ' };
        long[][] longArray18 = new long[][] { longArray2, longArray5, longArray8, longArray11, longArray14, longArray17 };
        org.apache.commons.math4.legacy.core.MathArrays.checkRectangular(longArray18);
        org.apache.commons.math4.legacy.core.MathArrays.checkRectangular(longArray18);
        org.apache.commons.math4.legacy.core.MathArrays.checkRectangular(longArray18);
        org.apache.commons.math4.legacy.core.MathArrays.checkRectangular(longArray18);
        org.apache.commons.math4.legacy.core.MathArrays.checkNonNegative(longArray18);
        org.apache.commons.math4.legacy.core.MathArrays.checkRectangular(longArray18);
        java.lang.Class<?> wildcardClass25 = longArray18.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 10L, 32L });
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 10L, 32L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 10L, 32L });
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 10L, 32L });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 10L, 32L });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 10L, 32L });
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1004");
        double[] doubleArray5 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray5, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray5);
        double[] doubleArray10 = org.apache.commons.math4.legacy.core.MathArrays.unique(doubleArray5);
        double[] doubleArray11 = org.apache.commons.math4.legacy.core.MathArrays.scale(55009.75913417545d, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1760312.2922936145d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1005");
        double[] doubleArray4 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        double[] doubleArray6 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray5);
        double[] doubleArray7 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray5);
        double[] doubleArray13 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray13);
        double[] doubleArray16 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray13, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray13);
        double[] doubleArray22 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray22);
        double[] doubleArray28 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray28, 100.0d);
        double[] doubleArray32 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray22, doubleArray31);
        double double33 = org.apache.commons.math4.legacy.core.MathArrays.distanceInf(doubleArray13, doubleArray32);
        double[] doubleArray38 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray39 = new double[][] { doubleArray38 };
        double[] doubleArray40 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray39);
        double[] doubleArray46 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray46);
        double[] doubleArray49 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray46, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray46);
        double[] doubleArray51 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray40, doubleArray46);
        double[] doubleArray52 = org.apache.commons.math4.legacy.core.MathArrays.ebeSubtract(doubleArray13, doubleArray40);
        double[] doubleArray53 = org.apache.commons.math4.legacy.core.MathArrays.ebeDivide(doubleArray7, doubleArray52);
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray52);
        double[] doubleArray55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray52, doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 3232.0d + "'", double33 == 3232.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-0.0d), (-320.0d), (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), (-42.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), (-0.23809523809523808d), (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1006");
        double[] doubleArray4 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray4);
        double[] doubleArray7 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray4, 100.0d);
        double[] doubleArray12 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray12);
        double[] doubleArray18 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray18);
        double[] doubleArray21 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray18, 100.0d);
        double[] doubleArray22 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray12, doubleArray21);
        double[] doubleArray27 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray28 = new double[][] { doubleArray27 };
        double[] doubleArray29 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray28);
        double double30 = org.apache.commons.math4.legacy.core.MathArrays.distance(doubleArray21, doubleArray29);
        double double31 = org.apache.commons.math4.legacy.core.MathArrays.distance1(doubleArray4, doubleArray29);
        org.apache.commons.math4.legacy.core.MathArrays.checkFinite(doubleArray29);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray39 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean41 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray34, doubleArray39, false);
        org.apache.commons.math4.legacy.core.MathArrays.checkFinite(doubleArray39);
        double[] doubleArray43 = org.apache.commons.math4.legacy.core.MathArrays.scale((-1.0d), doubleArray39);
        double[] doubleArray49 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray49);
        double[] doubleArray52 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray49, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray49);
        double[] doubleArray54 = null;
        boolean boolean55 = org.apache.commons.math4.legacy.core.MathArrays.equalsIncludingNaN(doubleArray49, doubleArray54);
        double double56 = org.apache.commons.math4.legacy.core.MathArrays.distance1(doubleArray43, doubleArray49);
        double[] doubleArray61 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray62 = new double[][] { doubleArray61 };
        double[] doubleArray63 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray62);
        double[] doubleArray69 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray69);
        double[] doubleArray72 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray69, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray69);
        double[] doubleArray74 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray63, doubleArray69);
        boolean boolean76 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray49, doubleArray63, true);
        double double77 = org.apache.commons.math4.legacy.core.MathArrays.distance(doubleArray29, doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0166651237425d + "'", double30 == 90.0166651237425d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 25.0d + "'", double31 == 25.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, (-52.0d), (-10.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 31.0d + "'", double56 == 31.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-0.0d), (-320.0d), (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 42.035699113967404d + "'", double77 == 42.035699113967404d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1007");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean8 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray1, doubleArray6, false);
        double[] doubleArray9 = org.apache.commons.math4.legacy.core.MathArrays.scale(0.0d, doubleArray1);
        org.apache.commons.math4.legacy.core.MathArrays.checkPositive(doubleArray9);
        double[] doubleArray16 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray16);
        double[] doubleArray22 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray22);
        double[] doubleArray25 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray22, 100.0d);
        double[] doubleArray26 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray16, doubleArray25);
        double[] doubleArray33 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray33);
        double[] doubleArray36 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray33, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray33);
        double[] doubleArray42 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray42);
        double[] doubleArray48 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray48);
        double[] doubleArray51 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray48, 100.0d);
        double[] doubleArray52 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray42, doubleArray51);
        double[] doubleArray57 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray58 = new double[][] { doubleArray57 };
        double[] doubleArray59 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray58);
        double double60 = org.apache.commons.math4.legacy.core.MathArrays.distance(doubleArray51, doubleArray59);
        double[] doubleArray61 = org.apache.commons.math4.legacy.core.MathArrays.ebeSubtract(doubleArray33, doubleArray59);
        double[] doubleArray62 = org.apache.commons.math4.legacy.core.MathArrays.scale((double) (byte) 10, doubleArray59);
        double[] doubleArray63 = org.apache.commons.math4.legacy.core.MathArrays.ebeDivide(doubleArray26, doubleArray59);
        double[] doubleArray64 = org.apache.commons.math4.legacy.core.MathArrays.scale((double) '#', doubleArray59);
        double[] doubleArray65 = org.apache.commons.math4.legacy.core.MathArrays.unique(doubleArray59);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray9, doubleArray65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.DimensionMismatchException; message: 0 != 3");
        } catch (org.apache.commons.math4.legacy.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 90.0166651237425d + "'", double60 == 90.0166651237425d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), (-42.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, 100.0d, 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 0.0d, 320.0d, 0.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 35.0d, 350.0d, 35.0d, (-35.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1008");
        double[] doubleArray4 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray4);
        double[] doubleArray10 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray10);
        double[] doubleArray13 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray10, 100.0d);
        double[] doubleArray14 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray4, doubleArray13);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray21 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean23 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray16, doubleArray21, false);
        double[] doubleArray24 = org.apache.commons.math4.legacy.core.MathArrays.scale(0.0d, doubleArray16);
        org.apache.commons.math4.legacy.core.MathArrays.checkFinite(doubleArray16);
        double[] doubleArray30 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray30);
        double[] doubleArray36 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray36);
        double[] doubleArray39 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray36, 100.0d);
        double[] doubleArray40 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray30, doubleArray39);
        boolean boolean41 = org.apache.commons.math4.legacy.core.MathArrays.equals(doubleArray16, doubleArray40);
        double[] doubleArray42 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray13, doubleArray40);
        double[] doubleArray43 = org.apache.commons.math4.legacy.core.MathArrays.unique(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 0.0d, 320000.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1009");
        long[] longArray5 = new long[] { (short) 100, (byte) 1, 100, 'a', 10L };
        org.apache.commons.math4.legacy.core.MathArrays.checkNonNegative(longArray5);
        org.apache.commons.math4.legacy.core.MathArrays.checkNonNegative(longArray5);
        org.apache.commons.math4.legacy.core.MathArrays.checkNonNegative(longArray5);
        org.apache.commons.math4.legacy.core.MathArrays.checkNonNegative(longArray5);
        org.apache.commons.math4.legacy.core.MathArrays.checkNonNegative(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 100L, 1L, 100L, 97L, 10L });
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1010");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean8 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray1, doubleArray6, false);
        double[] doubleArray13 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray13);
        double[] doubleArray15 = org.apache.commons.math4.legacy.core.MathArrays.convolve(doubleArray6, doubleArray13);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (byte) 10, doubleArray13);
        double[] doubleArray22 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray22);
        double[] doubleArray25 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray22, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray22);
        double[] doubleArray31 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray31);
        double[] doubleArray37 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray37);
        double[] doubleArray40 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray37, 100.0d);
        double[] doubleArray41 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray31, doubleArray40);
        double double42 = org.apache.commons.math4.legacy.core.MathArrays.distanceInf(doubleArray22, doubleArray41);
        double[] doubleArray47 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray48 = new double[][] { doubleArray47 };
        double[] doubleArray49 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray48);
        double[] doubleArray55 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray55);
        double[] doubleArray58 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray55, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray55);
        double[] doubleArray60 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray49, doubleArray55);
        double[] doubleArray61 = org.apache.commons.math4.legacy.core.MathArrays.ebeSubtract(doubleArray22, doubleArray49);
        double[] doubleArray63 = new double[] {};
        double[] doubleArray68 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean70 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray63, doubleArray68, false);
        org.apache.commons.math4.legacy.core.MathArrays.checkFinite(doubleArray68);
        double[] doubleArray72 = org.apache.commons.math4.legacy.core.MathArrays.scale((-1.0d), doubleArray68);
        double double73 = org.apache.commons.math4.legacy.core.MathArrays.distanceInf(doubleArray61, doubleArray68);
        double[] doubleArray74 = org.apache.commons.math4.legacy.core.MathArrays.ebeDivide(doubleArray13, doubleArray68);
        double[] doubleArray75 = new double[] {};
        double[] doubleArray80 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean82 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray75, doubleArray80, false);
        double[] doubleArray87 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray87);
        double[] doubleArray89 = org.apache.commons.math4.legacy.core.MathArrays.convolve(doubleArray80, doubleArray87);
        boolean boolean90 = org.apache.commons.math4.legacy.core.MathArrays.equals(doubleArray68, doubleArray89);
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray89);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.MathArrays.checkPositive(doubleArray89);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 320.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-32.0d), 1664.0d, 320.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 3232.0d + "'", double42 == 3232.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { (-0.0d), (-320.0d), (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), (-42.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 1.0d, (-52.0d), (-10.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 94.0d + "'", double73 == 94.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-0.0d), 6.153846153846154d, 0.0d, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 0.0d, (-32.0d), 1664.0d, 320.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1011");
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection0 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING;
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection1 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING;
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection2 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING;
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection3 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING;
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection4 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING;
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection[] orderDirectionArray5 = new org.apache.commons.math4.legacy.core.MathArrays.OrderDirection[] { orderDirection0, orderDirection1, orderDirection2, orderDirection3, orderDirection4 };
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection6 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING;
        boolean boolean8 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(orderDirectionArray5, orderDirection6, true);
        double[] doubleArray13 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray13);
        double[] doubleArray19 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray19);
        double[] doubleArray22 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray19, 100.0d);
        double[] doubleArray23 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray13, doubleArray22);
        double[] doubleArray28 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        double[] doubleArray30 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray29);
        double double31 = org.apache.commons.math4.legacy.core.MathArrays.distance(doubleArray22, doubleArray30);
        double[] doubleArray32 = org.apache.commons.math4.legacy.core.MathArrays.unique(doubleArray30);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray38 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean40 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray33, doubleArray38, false);
        double[] doubleArray45 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray45);
        double[] doubleArray47 = org.apache.commons.math4.legacy.core.MathArrays.convolve(doubleArray38, doubleArray45);
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection48 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING;
        boolean boolean50 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(doubleArray47, orderDirection48, true);
        org.apache.commons.math4.legacy.core.MathArrays.checkOrder(doubleArray32, orderDirection48, false);
        boolean boolean54 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(orderDirectionArray5, orderDirection48, false);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "" };
        double[] doubleArray58 = new double[] {};
        double[] doubleArray63 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean65 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray58, doubleArray63, false);
        double[] doubleArray70 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray70);
        double[] doubleArray72 = org.apache.commons.math4.legacy.core.MathArrays.convolve(doubleArray63, doubleArray70);
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection73 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING;
        boolean boolean75 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(doubleArray72, orderDirection73, true);
        boolean boolean77 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(strArray57, orderDirection73, false);
        boolean boolean79 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(orderDirectionArray5, orderDirection73, false);
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection80 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(orderDirectionArray5, orderDirection80, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.MathArrays$OrderDirection.ordinal()\" because \"dir\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + orderDirection0 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING + "'", orderDirection0.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection1 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING + "'", orderDirection1.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + orderDirection2 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING + "'", orderDirection2.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING + "'", orderDirection3.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + orderDirection4 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING + "'", orderDirection4.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(orderDirectionArray5);
        org.junit.Assert.assertArrayEquals(orderDirectionArray5, new org.apache.commons.math4.legacy.core.MathArrays.OrderDirection[] { org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING, org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING, org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING, org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING, org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING });
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING + "'", orderDirection6.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.INCREASING));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 90.0166651237425d + "'", double31 == 90.0166651237425d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 0.0d, (-32.0d), 1664.0d, 320.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + orderDirection48 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING + "'", orderDirection48.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 0.0d, (-32.0d), 1664.0d, 320.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + orderDirection73 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING + "'", orderDirection73.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathArraysRegressionTest2.test1012");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean8 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray1, doubleArray6, false);
        org.apache.commons.math4.legacy.core.MathArrays.checkFinite(doubleArray6);
        double[] doubleArray10 = org.apache.commons.math4.legacy.core.MathArrays.scale((-1.0d), doubleArray6);
        double[] doubleArray15 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray15);
        double[] doubleArray21 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray21);
        double[] doubleArray24 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray21, 100.0d);
        double[] doubleArray25 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray15, doubleArray24);
        boolean boolean26 = org.apache.commons.math4.legacy.core.MathArrays.equals(doubleArray10, doubleArray24);
        double[] doubleArray32 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray32);
        double[] doubleArray35 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray32, 100.0d);
        org.apache.commons.math4.legacy.core.MathArrays.scaleInPlace((double) (-1.0f), doubleArray32);
        double[] doubleArray41 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray41);
        double[] doubleArray47 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray47);
        double[] doubleArray50 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray47, 100.0d);
        double[] doubleArray51 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray41, doubleArray50);
        double[] doubleArray56 = new double[] { (byte) 1, (short) 10, 1, (short) -1 };
        double[][] doubleArray57 = new double[][] { doubleArray56 };
        double[] doubleArray58 = org.apache.commons.math4.legacy.core.MathArrays.concatenate(doubleArray57);
        double double59 = org.apache.commons.math4.legacy.core.MathArrays.distance(doubleArray50, doubleArray58);
        double[] doubleArray60 = org.apache.commons.math4.legacy.core.MathArrays.ebeSubtract(doubleArray32, doubleArray58);
        org.apache.commons.math4.legacy.core.MathArrays.OrderDirection orderDirection61 = org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING;
        boolean boolean63 = org.apache.commons.math4.legacy.core.MathArrays.isMonotonic(doubleArray58, orderDirection61, false);
        boolean boolean64 = org.apache.commons.math4.legacy.core.MathArrays.equals(doubleArray10, doubleArray58);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray71 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        boolean boolean73 = org.apache.commons.math4.legacy.core.MathArrays.checkEqualLength(doubleArray66, doubleArray71, false);
        double[] doubleArray74 = org.apache.commons.math4.legacy.core.MathArrays.scale(0.0d, doubleArray66);
        org.apache.commons.math4.legacy.core.MathArrays.checkFinite(doubleArray66);
        double[] doubleArray80 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray80);
        double[] doubleArray86 = new double[] { 0.0f, ' ', 0L, (byte) 0 };
        org.apache.commons.math4.legacy.core.MathArrays.checkNotNaN(doubleArray86);
        double[] doubleArray89 = org.apache.commons.math4.legacy.core.MathArrays.normalizeArray(doubleArray86, 100.0d);
        double[] doubleArray90 = org.apache.commons.math4.legacy.core.MathArrays.ebeMultiply(doubleArray80, doubleArray89);
        boolean boolean91 = org.apache.commons.math4.legacy.core.MathArrays.equals(doubleArray66, doubleArray90);
        double[] doubleArray92 = org.apache.commons.math4.legacy.core.MathArrays.ebeDivide(doubleArray58, doubleArray90);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = org.apache.commons.math4.legacy.core.MathArrays.verifyValues(doubleArray90, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NumberIsTooLargeException; message: subarray ends after array end");
        } catch (org.apache.commons.math4.legacy.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-52.0d), (-10.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { (-0.0d), (-32.0d), (-0.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 90.0166651237425d + "'", double59 == 90.0166651237425d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { (-1.0d), (-42.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + orderDirection61 + "' != '" + org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING + "'", orderDirection61.equals(org.apache.commons.math4.legacy.core.MathArrays.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 0.0d, 32.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 0.0d, 3200.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { Double.POSITIVE_INFINITY, 0.003125d, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY }, 1.0E-15);
    }
}

