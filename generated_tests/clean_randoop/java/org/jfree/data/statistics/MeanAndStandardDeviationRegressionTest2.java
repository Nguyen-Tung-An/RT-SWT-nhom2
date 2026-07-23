package org.jfree.data.statistics;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MeanAndStandardDeviationRegressionTest2 {

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
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1001");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (short) -1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1002");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getStandardDeviation();
        double double9 = meanAndStandardDeviation6.getMeanValue();
        java.lang.String str10 = meanAndStandardDeviation6.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double14 = meanAndStandardDeviation13.getMeanValue();
        java.lang.String str15 = meanAndStandardDeviation13.toString();
        boolean boolean16 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation13);
        double double17 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) double17);
        java.lang.Class<?> wildcardClass19 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0f + "'", number3, 100.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, -1]" + "'", str10, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[10.0, 0.0]" + "'", str15, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1003");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getMeanValue();
        double double12 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1004");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) Double.NaN);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        java.lang.Number number11 = meanAndStandardDeviation9.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str15 = meanAndStandardDeviation14.toString();
        boolean boolean16 = meanAndStandardDeviation9.equals((java.lang.Object) meanAndStandardDeviation14);
        boolean boolean17 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation9);
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) boolean17);
        double double19 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number20 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 0.0d + "'", number11, 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, 100]" + "'", str15, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (-1.0d) + "'", number20, (-1.0d));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1005");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean10 = meanAndStandardDeviation8.equals((java.lang.Object) 0L);
        double double11 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) double11);
        double double13 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number14 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100 + "'", number14, 100);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1006");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) 1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1007");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest2.test1008");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100.0f + "'", number4, 100.0f);
    }
}

