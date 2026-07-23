package org.jfree.data.statistics;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MeanAndStandardDeviationRegressionTest1 {

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
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0501");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, 0.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1.0, 0.0]" + "'", str3, "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0502");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, -1]" + "'", str5, "[1, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[1, -1]" + "'", str6, "[1, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 1L + "'", number7, 1L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0503");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) (-1));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0504");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0505");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) -1, (java.lang.Number) (-1));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0506");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 10L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0507");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', (double) (byte) 10);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0508");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 100.0]" + "'", str5, "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (short) 1 + "'", number6, (short) 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100.0f + "'", number7, 100.0f);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0509");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) 10L);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double11 = meanAndStandardDeviation10.getMeanValue();
        boolean boolean12 = meanAndStandardDeviation7.equals((java.lang.Object) double11);
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) boolean12);
        java.lang.Class<?> wildcardClass14 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0510");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 32.0d, (java.lang.Number) 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0511");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str11 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[1, 0]" + "'", str11, "[1, 0]");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0512");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0513");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        double double9 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100, -1]" + "'", str8, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0514");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation6.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getMean();
        java.lang.Number number17 = meanAndStandardDeviation14.getMean();
        double double18 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean19 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation14);
        java.lang.Number number20 = meanAndStandardDeviation6.getStandardDeviation();
        java.lang.Class<?> wildcardClass21 = meanAndStandardDeviation6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (-1) + "'", number20, (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0515");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0516");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0517");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) Double.NaN, (java.lang.Number) (-1));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0518");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0519");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = number4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100.0d + "'", number4, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0520");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) Double.NaN, (java.lang.Number) (byte) 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0521");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        double double10 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0522");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 10, (double) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0523");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', 10.0d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0524");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10L);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0525");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0526");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0527");
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
        java.lang.String str19 = meanAndStandardDeviation2.toString();
        double double20 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 0.0d + "'", number11, 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, 100]" + "'", str15, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[-1.0, 10.0]" + "'", str19, "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0528");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) (short) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0529");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) 10);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[97.0, 10]" + "'", str3, "[97.0, 10]");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0530");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 1, 0.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1.0, 0.0]" + "'", str3, "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0531");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 1L);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0532");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean8 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) boolean8);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0533");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 1 + "'", number5, (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0 + "'", number7, 0);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0534");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation6.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getMean();
        java.lang.Number number17 = meanAndStandardDeviation14.getMean();
        double double18 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean19 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation14);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation22 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        double double23 = meanAndStandardDeviation22.getMeanValue();
        java.lang.String str24 = meanAndStandardDeviation22.toString();
        double double25 = meanAndStandardDeviation22.getMeanValue();
        boolean boolean26 = meanAndStandardDeviation14.equals((java.lang.Object) double25);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[-1.0, -1.0]" + "'", str24, "[-1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0535");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0f);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0536");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) ' ', 0.0d);
        java.lang.String str9 = meanAndStandardDeviation8.toString();
        double double10 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100.0d + "'", number4, 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100.0, 1.0]" + "'", str5, "[100.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[32.0, 0.0]" + "'", str9, "[32.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0537");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double10 = meanAndStandardDeviation9.getStandardDeviationValue();
        java.lang.Number number11 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) number11);
        java.lang.Number number13 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number14 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1.0f) + "'", number11, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-1) + "'", number13, (-1));
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1) + "'", number14, (-1));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0538");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, -1]" + "'", str5, "[1, -1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0539");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 100, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0540");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) (short) 100);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) 100L);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1) + "'", number3, (-1));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, -1]" + "'", str5, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0541");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 1 + "'", number5, (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0542");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation6.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getMean();
        java.lang.Number number17 = meanAndStandardDeviation14.getMean();
        double double18 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean19 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation14);
        java.lang.Number number20 = meanAndStandardDeviation14.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (short) 1 + "'", number20, (short) 1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0543");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0544");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean10 = meanAndStandardDeviation6.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double14 = meanAndStandardDeviation13.getMeanValue();
        double double15 = meanAndStandardDeviation13.getMeanValue();
        java.lang.String str16 = meanAndStandardDeviation13.toString();
        boolean boolean17 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation13);
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Class<?> wildcardClass19 = meanAndStandardDeviation6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100]" + "'", str16, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0545");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0 + "'", number6, 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0546");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        double double7 = meanAndStandardDeviation5.getMeanValue();
        double double8 = meanAndStandardDeviation5.getStandardDeviationValue();
        boolean boolean10 = meanAndStandardDeviation5.equals((java.lang.Object) "[100, 0]");
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) "[100, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0547");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, 32.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0548");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, 10.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0549");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0550");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0551");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100]" + "'", str6, "[0, 100]");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0552");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str12 = meanAndStandardDeviation9.toString();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Number number14 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number15 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation18 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Object obj19 = null;
        boolean boolean20 = meanAndStandardDeviation18.equals(obj19);
        java.lang.Number number21 = meanAndStandardDeviation18.getMean();
        boolean boolean22 = meanAndStandardDeviation2.equals((java.lang.Object) number21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100]" + "'", str12, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 1.0d + "'", number14, 1.0d);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 1.0d + "'", number15, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + (-1.0f) + "'", number21, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0553");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0f, (java.lang.Number) 97.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0554");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0555");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 100.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100.0]" + "'", str3, "[0, 100.0]");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0556");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double6 = meanAndStandardDeviation5.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation9.equals((java.lang.Object) 0L);
        boolean boolean13 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Class<?> wildcardClass14 = meanAndStandardDeviation9.getClass();
        boolean boolean15 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0557");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 1);
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100]" + "'", str6, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0558");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation5.getClass();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0559");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10.0f, (double) (byte) -1);
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation6.getClass();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0560");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0561");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (byte) 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0562");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0563");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass10 = number9.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0564");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 0, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0565");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) 100 + "'", number5, (byte) 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 100 + "'", number6, (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[-1.0, 100]" + "'", str8, "[-1.0, 100]");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0566");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, -1]" + "'", str5, "[1, -1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0567");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean8 = meanAndStandardDeviation6.equals((java.lang.Object) (-1));
        java.lang.String str9 = meanAndStandardDeviation6.toString();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) str9);
        java.lang.Number number11 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[100, -1]" + "'", str9, "[100, -1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100.0f + "'", number11, 100.0f);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0568");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[-1.0, 100]" + "'", str5, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 100 + "'", number6, (byte) 100);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0569");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) '4');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 52.0d + "'", number3, 52.0d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0570");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (-1.0d));
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[100.0, -1.0]" + "'", str3, "[100.0, -1.0]");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0571");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 1 + "'", number6, (byte) 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 1 + "'", number7, (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[1, 10.0]" + "'", str8, "[1, 10.0]");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0572");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) -1, (java.lang.Number) (byte) 10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0573");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 52.0d, (java.lang.Number) 52.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0574");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str12 = meanAndStandardDeviation9.toString();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Number number14 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number15 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass16 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100]" + "'", str12, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 1.0d + "'", number14, 1.0d);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 1.0d + "'", number15, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0575");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0 + "'", number9, 0);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0576");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(100.0d, 1.0d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0577");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) -1 + "'", number3, (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, 0]" + "'", str4, "[-1, 0]");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0578");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 100, (java.lang.Number) 10L);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean13 = meanAndStandardDeviation9.equals((java.lang.Object) 100L);
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0579");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1L), 1.0d);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0580");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0581");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100.0f);
        double double9 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        double double11 = meanAndStandardDeviation8.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getStandardDeviation();
        double double17 = meanAndStandardDeviation14.getMeanValue();
        java.lang.String str18 = meanAndStandardDeviation14.toString();
        java.lang.Number number19 = meanAndStandardDeviation14.getStandardDeviation();
        java.lang.Number number20 = meanAndStandardDeviation14.getStandardDeviation();
        double double21 = meanAndStandardDeviation14.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation24 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        java.lang.Number number25 = meanAndStandardDeviation24.getMean();
        boolean boolean26 = meanAndStandardDeviation14.equals((java.lang.Object) meanAndStandardDeviation24);
        java.lang.Number number27 = meanAndStandardDeviation24.getMean();
        boolean boolean28 = meanAndStandardDeviation8.equals((java.lang.Object) number27);
        java.lang.String str29 = meanAndStandardDeviation8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 10.0]" + "'", str5, "[1, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (-1) + "'", number16, (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[100, -1]" + "'", str18, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (-1) + "'", number19, (-1));
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (-1) + "'", number20, (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 100.0d + "'", number25, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 100.0d + "'", number27, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[1.0, 100.0]" + "'", str29, "[1.0, 100.0]");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0582");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation5.getMean();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) number10);
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        double double13 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number14 = meanAndStandardDeviation2.getMean();
        double double15 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0583");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0584");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0585");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 'a');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1.0, 97.0]" + "'", str4, "[1.0, 97.0]");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0586");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10L + "'", number3, 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0587");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', 0.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 97.0d + "'", number4, 97.0d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0588");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0589");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double10 = meanAndStandardDeviation9.getStandardDeviationValue();
        java.lang.Number number11 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) number11);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation15 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation18 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean20 = meanAndStandardDeviation18.equals((java.lang.Object) 0L);
        double double21 = meanAndStandardDeviation18.getStandardDeviationValue();
        boolean boolean22 = meanAndStandardDeviation15.equals((java.lang.Object) meanAndStandardDeviation18);
        java.lang.Class<?> wildcardClass23 = meanAndStandardDeviation18.getClass();
        boolean boolean24 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1.0f) + "'", number11, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0590");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double11 = meanAndStandardDeviation10.getMeanValue();
        java.lang.Class<?> wildcardClass12 = meanAndStandardDeviation10.getClass();
        boolean boolean13 = meanAndStandardDeviation7.equals((java.lang.Object) meanAndStandardDeviation10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation16 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        boolean boolean17 = meanAndStandardDeviation10.equals((java.lang.Object) meanAndStandardDeviation16);
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) boolean17);
        java.lang.String str19 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0f + "'", number3, 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10.0, 0.0]" + "'", str19, "[10.0, 0.0]");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0591");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 10L + "'", number5, 10L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0592");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0593");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1.0f) + "'", number6, (-1.0f));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0594");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getStandardDeviationValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Number number13 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-1) + "'", number13, (-1));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0595");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 1L + "'", number7, 1L);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0596");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number11 = meanAndStandardDeviation2.getMean();
        double double12 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number13 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (short) 1 + "'", number13, (short) 1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0597");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (short) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number6 = meanAndStandardDeviation5.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation9.equals((java.lang.Object) 0L);
        double double13 = meanAndStandardDeviation9.getStandardDeviationValue();
        double double14 = meanAndStandardDeviation9.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation17 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double18 = meanAndStandardDeviation17.getMeanValue();
        boolean boolean20 = meanAndStandardDeviation17.equals((java.lang.Object) 10.0d);
        boolean boolean21 = meanAndStandardDeviation9.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass22 = meanAndStandardDeviation9.getClass();
        boolean boolean23 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation9);
        boolean boolean24 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation27 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 100, (java.lang.Number) 10L);
        boolean boolean28 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation27);
        double double29 = meanAndStandardDeviation5.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0f + "'", number6, 100.0f);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0598");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 0, (java.lang.Number) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0f, (java.lang.Number) (-1));
        boolean boolean9 = meanAndStandardDeviation5.equals((java.lang.Object) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        boolean boolean13 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation12);
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0599");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0f, (java.lang.Number) 100.0f);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0600");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0601");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 1L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1.0, 1.0]" + "'", str3, "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0602");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (short) -1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0603");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 'a');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation6.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0604");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0605");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 100L);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0606");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (-1));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0607");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0 + "'", number7, 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0608");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) -1, (java.lang.Number) (byte) 100);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0609");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 100]" + "'", str3, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1.0, 100]" + "'", str4, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[-1.0, 100]" + "'", str5, "[-1.0, 100]");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0610");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1), (java.lang.Number) (-1L));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0611");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 1.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[null, 1.0]" + "'", str3, "[null, 1.0]");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0612");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1));
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10.0, -1.0]" + "'", str3, "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0613");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0 + "'", number6, 0);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0 + "'", number7, 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0614");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1.0f), 10.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0615");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (short) 0);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation5.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number14 = meanAndStandardDeviation13.getMean();
        boolean boolean16 = meanAndStandardDeviation13.equals((java.lang.Object) 0L);
        double double17 = meanAndStandardDeviation13.getStandardDeviationValue();
        double double18 = meanAndStandardDeviation13.getStandardDeviationValue();
        double double19 = meanAndStandardDeviation13.getStandardDeviationValue();
        java.lang.Number number20 = meanAndStandardDeviation13.getMean();
        boolean boolean21 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation13);
        boolean boolean22 = meanAndStandardDeviation2.equals((java.lang.Object) boolean21);
        java.lang.Number number23 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100 + "'", number14, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 100 + "'", number20, 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + (short) 0 + "'", number23, (short) 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0616");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 10.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10.0d + "'", number3, 10.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0617");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) ' ');
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0618");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) 32.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = number5.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10L + "'", number3, 10L);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10L + "'", number4, 10L);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 32.0d + "'", number5, 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0619");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) (short) 10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) (-1));
        java.lang.Number number8 = meanAndStandardDeviation5.getMean();
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation5.getStandardDeviation();
        double double11 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        double double13 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0620");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1.0f, (double) 100);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0621");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 0.0]" + "'", str3, "[0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0L + "'", number5, 0L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0622");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0623");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0.0d + "'", number5, 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 10.0d + "'", number6, 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10.0, 0.0]" + "'", str7, "[10.0, 0.0]");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0624");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0625");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0626");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (short) -1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0627");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0628");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) 'a');
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0629");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number8 = meanAndStandardDeviation7.getStandardDeviation();
        double double9 = meanAndStandardDeviation7.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation7.getMeanValue();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) double10);
        java.lang.String str12 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation15 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, 1.0d);
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1 + "'", number4, 1);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (byte) 100 + "'", number8, (byte) 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[1, 100.0]" + "'", str12, "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0630");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1L), 0.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0631");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1) + "'", number3, (-1));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0632");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number8 = meanAndStandardDeviation7.getStandardDeviation();
        double double9 = meanAndStandardDeviation7.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation7.getMeanValue();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) double10);
        java.lang.String str12 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass13 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1 + "'", number4, 1);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (byte) 100 + "'", number8, (byte) 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[1, 100.0]" + "'", str12, "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0633");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1 + "'", number4, 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 100.0]" + "'", str5, "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0634");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 1 + "'", number5, (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0635");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double6 = meanAndStandardDeviation5.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation9.equals((java.lang.Object) 0L);
        boolean boolean13 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Class<?> wildcardClass14 = meanAndStandardDeviation9.getClass();
        boolean boolean15 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = null;
        boolean boolean17 = meanAndStandardDeviation2.equals(obj16);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0636");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0d + "'", number4, 1.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1.0d + "'", number5, 1.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0637");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 100, (java.lang.Number) (short) 1);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0638");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0639");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) 10L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[100.0, 10.0]" + "'", str3, "[100.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100.0, 10.0]" + "'", str5, "[100.0, 10.0]");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0640");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1, 0]" + "'", str4, "[1, 0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (short) 1 + "'", number7, (short) 1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0641");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number8 = meanAndStandardDeviation7.getMean();
        double double9 = meanAndStandardDeviation7.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation7.getMean();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation7);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0642");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 10, 1.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0643");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', 0.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0644");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        double double8 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double11 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0645");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(Double.NaN, (double) 10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0646");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 1 + "'", number5, (short) 1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0647");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) '4');
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[100.0, 52.0]" + "'", str3, "[100.0, 52.0]");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0648");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) (short) 100);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0649");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getStandardDeviationValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.String str13 = meanAndStandardDeviation9.toString();
        double double14 = meanAndStandardDeviation9.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[10.0, -1.0]" + "'", str13, "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0650");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 100, (java.lang.Number) (-1.0f));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0651");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double7 = meanAndStandardDeviation6.getMeanValue();
        double double8 = meanAndStandardDeviation6.getMeanValue();
        java.lang.String str9 = meanAndStandardDeviation6.toString();
        double double10 = meanAndStandardDeviation6.getMeanValue();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double12 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str13 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[10, 0]" + "'", str13, "[10, 0]");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0652");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1.0f), 10.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0653");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation14);
        double double17 = meanAndStandardDeviation14.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0654");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Object obj4 = null;
        boolean boolean5 = meanAndStandardDeviation2.equals(obj4);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0655");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) (byte) 1);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0656");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0657");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) (-1));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0658");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) 1L);
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number14 = meanAndStandardDeviation13.getMean();
        boolean boolean16 = meanAndStandardDeviation13.equals((java.lang.Object) 0L);
        double double17 = meanAndStandardDeviation13.getStandardDeviationValue();
        java.lang.Number number18 = meanAndStandardDeviation13.getMean();
        boolean boolean19 = meanAndStandardDeviation10.equals((java.lang.Object) number18);
        java.lang.Number number20 = meanAndStandardDeviation10.getStandardDeviation();
        java.lang.String str21 = meanAndStandardDeviation10.toString();
        boolean boolean22 = meanAndStandardDeviation2.equals((java.lang.Object) str21);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation25 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        double double26 = meanAndStandardDeviation25.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation29 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation32 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean33 = meanAndStandardDeviation29.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation36 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double37 = meanAndStandardDeviation36.getMeanValue();
        double double38 = meanAndStandardDeviation36.getMeanValue();
        java.lang.String str39 = meanAndStandardDeviation36.toString();
        boolean boolean40 = meanAndStandardDeviation29.equals((java.lang.Object) meanAndStandardDeviation36);
        boolean boolean41 = meanAndStandardDeviation25.equals((java.lang.Object) meanAndStandardDeviation29);
        java.lang.Number number42 = meanAndStandardDeviation29.getStandardDeviation();
        boolean boolean43 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100 + "'", number14, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100 + "'", number18, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 100.0d + "'", number20, 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[100.0, 100.0]" + "'", str21, "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[0, 100]" + "'", str39, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + number42 + "' != '" + 1.0d + "'", number42, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0659");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100.0f, (double) 1.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) (-1));
        java.lang.Number number8 = meanAndStandardDeviation5.getMean();
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.String str10 = meanAndStandardDeviation5.toString();
        double double11 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean13 = meanAndStandardDeviation5.equals((java.lang.Object) (byte) 10);
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, -1]" + "'", str10, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0660");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        double double10 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100, -1]" + "'", str8, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0661");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double9 = meanAndStandardDeviation8.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation8.getStandardDeviation();
        double double11 = meanAndStandardDeviation8.getMeanValue();
        double double12 = meanAndStandardDeviation8.getStandardDeviationValue();
        java.lang.Number number13 = meanAndStandardDeviation8.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = number13.getClass();
        boolean boolean15 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass14);
        java.lang.String str16 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-1) + "'", number13, (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[1, 0]" + "'", str16, "[1, 0]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0662");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0663");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1.0, -1.0]" + "'", str4, "[-1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, -1.0]" + "'", str6, "[-1.0, -1.0]");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0664");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        double double7 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.String str10 = meanAndStandardDeviation5.toString();
        double double11 = meanAndStandardDeviation5.getMeanValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[1, 0]" + "'", str10, "[1, 0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0665");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 1, (double) (byte) 1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0666");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 'a');
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10.0, 97.0]" + "'", str3, "[10.0, 97.0]");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0667");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((-1.0d), (double) 1L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0668");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100);
        java.lang.Number number11 = meanAndStandardDeviation10.getStandardDeviation();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        java.lang.Number number13 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100.0d + "'", number11, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0669");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 1L);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0670");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) 10.0f);
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation8.getClass();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 10.0]" + "'", str3, "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[-1.0, 10.0]" + "'", str5, "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0671");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0.0f, 52.0d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0672");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1.0d) + "'", number5, (-1.0d));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0673");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number11 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation10.equals((java.lang.Object) 0L);
        double double14 = meanAndStandardDeviation10.getStandardDeviationValue();
        double double15 = meanAndStandardDeviation10.getStandardDeviationValue();
        double double16 = meanAndStandardDeviation10.getStandardDeviationValue();
        java.lang.Number number17 = meanAndStandardDeviation10.getMean();
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        double double19 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 100 + "'", number17, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0674");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (-1L));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (short) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number9 = meanAndStandardDeviation8.getMean();
        boolean boolean11 = meanAndStandardDeviation8.equals((java.lang.Object) 0L);
        double double12 = meanAndStandardDeviation8.getStandardDeviationValue();
        double double13 = meanAndStandardDeviation8.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation16 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number17 = meanAndStandardDeviation16.getMean();
        boolean boolean19 = meanAndStandardDeviation16.equals((java.lang.Object) 0L);
        double double20 = meanAndStandardDeviation16.getStandardDeviationValue();
        double double21 = meanAndStandardDeviation16.getStandardDeviationValue();
        double double22 = meanAndStandardDeviation16.getStandardDeviationValue();
        java.lang.Number number23 = meanAndStandardDeviation16.getMean();
        boolean boolean24 = meanAndStandardDeviation8.equals((java.lang.Object) meanAndStandardDeviation16);
        boolean boolean25 = meanAndStandardDeviation5.equals((java.lang.Object) boolean24);
        boolean boolean26 = meanAndStandardDeviation2.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 100 + "'", number17, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100 + "'", number23, 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0675");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0676");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (short) 10);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0677");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) 1.0f);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0678");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1L), 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0679");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0680");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) 0);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0681");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0682");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) (byte) 10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0683");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 10.0f + "'", number6, 10.0f);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0684");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0f, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0685");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 10, (java.lang.Number) (-1L));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0686");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) ' ');
        java.lang.String str7 = meanAndStandardDeviation6.toString();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) str7);
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 10.0]" + "'", str3, "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10.0, 32.0]" + "'", str7, "[10.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10.0d + "'", number9, 10.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0687");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        java.lang.String str8 = meanAndStandardDeviation7.toString();
        double double9 = meanAndStandardDeviation7.getMeanValue();
        java.lang.Number number10 = meanAndStandardDeviation7.getStandardDeviation();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0.0]" + "'", str8, "[0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0.0f + "'", number10, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0688");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) 32.0d);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0689");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double10 = meanAndStandardDeviation9.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number14 = meanAndStandardDeviation13.getMean();
        double double15 = meanAndStandardDeviation13.getStandardDeviationValue();
        boolean boolean16 = meanAndStandardDeviation9.equals((java.lang.Object) meanAndStandardDeviation13);
        boolean boolean17 = meanAndStandardDeviation2.equals((java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass18 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100 + "'", number14, 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0690");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (short) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number6 = meanAndStandardDeviation5.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation9.equals((java.lang.Object) 0L);
        double double13 = meanAndStandardDeviation9.getStandardDeviationValue();
        double double14 = meanAndStandardDeviation9.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation17 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double18 = meanAndStandardDeviation17.getMeanValue();
        boolean boolean20 = meanAndStandardDeviation17.equals((java.lang.Object) 10.0d);
        boolean boolean21 = meanAndStandardDeviation9.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass22 = meanAndStandardDeviation9.getClass();
        boolean boolean23 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation9);
        boolean boolean24 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        double double25 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0f + "'", number6, 100.0f);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0691");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        double double8 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.String str10 = meanAndStandardDeviation6.toString();
        double double11 = meanAndStandardDeviation6.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, -1]" + "'", str10, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0692");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = number4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0693");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, number1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0694");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1.0f, (double) (short) 1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0695");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0f, (java.lang.Number) (-1));
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) 100.0f);
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[-1.0, 100.0]" + "'", str7, "[-1.0, 100.0]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0696");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number11 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation10.equals((java.lang.Object) 0L);
        java.lang.Number number14 = meanAndStandardDeviation10.getStandardDeviation();
        boolean boolean15 = meanAndStandardDeviation5.equals((java.lang.Object) number14);
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) number14);
        java.lang.String str17 = meanAndStandardDeviation2.toString();
        java.lang.String str18 = meanAndStandardDeviation2.toString();
        java.lang.Number number19 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1) + "'", number14, (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1.0, -1.0]" + "'", str17, "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[-1.0, -1.0]" + "'", str18, "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (-1.0d) + "'", number19, (-1.0d));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0697");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (short) 0);
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        double double7 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) double7);
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str10 = meanAndStandardDeviation2.toString();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number12 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1.0d + "'", number6, 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0.0, -1.0]" + "'", str10, "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0.0d + "'", number12, 0.0d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0698");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1L) + "'", number3, (-1L));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0699");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100.0f + "'", number5, 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100.0]" + "'", str6, "[0, 100.0]");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0700");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0d, (java.lang.Number) (-1L));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0701");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number12 = meanAndStandardDeviation11.getMean();
        boolean boolean14 = meanAndStandardDeviation11.equals((java.lang.Object) 0L);
        double double15 = meanAndStandardDeviation11.getStandardDeviationValue();
        double double16 = meanAndStandardDeviation11.getStandardDeviationValue();
        double double17 = meanAndStandardDeviation11.getStandardDeviationValue();
        java.lang.Number number18 = meanAndStandardDeviation11.getMean();
        boolean boolean19 = meanAndStandardDeviation2.equals((java.lang.Object) number18);
        java.lang.Number number20 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100 + "'", number12, 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100 + "'", number18, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 100 + "'", number20, 100);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0702");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0703");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) ' ', (double) 0.0f);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0704");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '4', (double) 1L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0705");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (short) 1);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0706");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0707");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 'a');
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0f, (java.lang.Number) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0708");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, number1);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0709");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 1.0f);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0710");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (byte) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0711");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) 10.0f);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0712");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double10 = meanAndStandardDeviation9.getStandardDeviationValue();
        java.lang.Number number11 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) number11);
        java.lang.Number number13 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str14 = meanAndStandardDeviation2.toString();
        java.lang.Number number15 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1.0f) + "'", number11, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-1) + "'", number13, (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[100, -1]" + "'", str14, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1) + "'", number15, (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0713");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, 32.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0714");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) (-1.0f));
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0715");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 100 + "'", number6, (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0716");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0717");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        double double7 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.String str8 = meanAndStandardDeviation5.toString();
        java.lang.Number number9 = meanAndStandardDeviation5.getMean();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0.0, 10.0]" + "'", str8, "[0.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0.0d + "'", number9, 0.0d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0718");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0d + "'", number4, 1.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1.0d + "'", number5, 1.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0719");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1) + "'", number5, (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0720");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0721");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100, 0]" + "'", str4, "[100, 0]");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, 0]" + "'", str7, "[100, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0722");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 0 + "'", number7, (byte) 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0723");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100, -1]" + "'", str8, "[100, -1]");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0724");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(100.0d, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0725");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) (byte) 100);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0726");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, (-1.0d));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0727");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0728");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (byte) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0729");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0730");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) "[10.0, -1.0]");
        java.lang.Class<?> wildcardClass8 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0731");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0f, (java.lang.Number) 0L);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0732");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean10 = meanAndStandardDeviation6.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double14 = meanAndStandardDeviation13.getMeanValue();
        double double15 = meanAndStandardDeviation13.getMeanValue();
        java.lang.String str16 = meanAndStandardDeviation13.toString();
        boolean boolean17 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation13);
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number19 = meanAndStandardDeviation6.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100]" + "'", str16, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 1L + "'", number19, 1L);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0733");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str12 = meanAndStandardDeviation2.toString();
        double double13 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number14 = meanAndStandardDeviation2.getMean();
        double double15 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0 + "'", number10, 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[1, 0]" + "'", str12, "[1, 0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (short) 1 + "'", number14, (short) 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0734");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10.0, 0.0]" + "'", str4, "[10.0, 0.0]");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 10.0d + "'", number5, 10.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 10.0d + "'", number6, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0735");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) '4');
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0736");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        double double9 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0737");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) 10.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0738");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.String str6 = meanAndStandardDeviation5.toString();
        double double7 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass8 = meanAndStandardDeviation5.getClass();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1, -1]" + "'", str6, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0739");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) (byte) -1);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0740");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) 100.0f);
        double double11 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0741");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 0L);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0742");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number10 = meanAndStandardDeviation6.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1.0f) + "'", number10, (-1.0f));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0743");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', Double.NaN);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[35.0, NaN]" + "'", str3, "[35.0, NaN]");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0744");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) (byte) -1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0745");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0746");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 1, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0747");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1) + "'", number3, (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0748");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getStandardDeviation();
        double double9 = meanAndStandardDeviation6.getMeanValue();
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation6.getClass();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double15 = meanAndStandardDeviation14.getMeanValue();
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0749");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (double) 10);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0750");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, -1]" + "'", str3, "[-1, -1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, -1]" + "'", str4, "[-1, -1]");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1L) + "'", number5, (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0751");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) (short) 10);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0752");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, 0.0d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0753");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (short) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number6 = meanAndStandardDeviation5.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation9.equals((java.lang.Object) 0L);
        double double13 = meanAndStandardDeviation9.getStandardDeviationValue();
        double double14 = meanAndStandardDeviation9.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation17 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double18 = meanAndStandardDeviation17.getMeanValue();
        boolean boolean20 = meanAndStandardDeviation17.equals((java.lang.Object) 10.0d);
        boolean boolean21 = meanAndStandardDeviation9.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass22 = meanAndStandardDeviation9.getClass();
        boolean boolean23 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation9);
        boolean boolean24 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation27 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 100, (java.lang.Number) 10L);
        boolean boolean28 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation27);
        java.lang.Class<?> wildcardClass29 = meanAndStandardDeviation5.getClass();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0f + "'", number6, 100.0f);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0754");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 1.0d);
        double double9 = meanAndStandardDeviation8.getMeanValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0755");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0756");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double10 = meanAndStandardDeviation9.getStandardDeviationValue();
        double double11 = meanAndStandardDeviation9.getMeanValue();
        double double12 = meanAndStandardDeviation9.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation15 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double16 = meanAndStandardDeviation15.getStandardDeviationValue();
        java.lang.Number number17 = meanAndStandardDeviation15.getStandardDeviation();
        double double18 = meanAndStandardDeviation15.getMeanValue();
        double double19 = meanAndStandardDeviation15.getStandardDeviationValue();
        java.lang.Number number20 = meanAndStandardDeviation15.getStandardDeviation();
        java.lang.Class<?> wildcardClass21 = number20.getClass();
        boolean boolean22 = meanAndStandardDeviation9.equals((java.lang.Object) wildcardClass21);
        boolean boolean23 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 10.0]" + "'", str5, "[1, 10.0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 1 + "'", number6, (byte) 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (-1) + "'", number17, (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (-1) + "'", number20, (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0757");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 0, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Object obj4 = null;
        boolean boolean5 = meanAndStandardDeviation2.equals(obj4);
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 0 + "'", number3, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, -1]" + "'", str6, "[0, -1]");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0758");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1.0f, (double) 1);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1.0, 1.0]" + "'", str3, "[1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0d + "'", number4, 1.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0759");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '4', 97.0d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0760");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0d, (java.lang.Number) (short) 0);
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0761");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0, 0.0]" + "'", str3, "[0.0, 0.0]");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0762");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0763");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0, 0.0]" + "'", str3, "[0.0, 0.0]");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0764");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1 + "'", number4, 1);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1 + "'", number5, 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0765");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) 1.0f);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0766");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double11 = meanAndStandardDeviation10.getStandardDeviationValue();
        java.lang.Number number12 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation10);
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        java.lang.String str15 = meanAndStandardDeviation2.toString();
        double double16 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (short) 1 + "'", number7, (short) 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (-1.0f) + "'", number12, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[100, -1]" + "'", str15, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0767");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0768");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) (-1L));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0769");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = meanAndStandardDeviation2.equals(obj5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1, 100.0]" + "'", str4, "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0770");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) 32.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10L + "'", number3, 10L);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10L + "'", number4, 10L);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 32.0d + "'", number5, 32.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 10L + "'", number6, 10L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0771");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = number5.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) 100 + "'", number5, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0772");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1.0d) + "'", number5, (-1.0d));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0773");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) 0L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10.0, 0.0]" + "'", str3, "[10.0, 0.0]");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0774");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0775");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        java.lang.String str9 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100, -1]" + "'", str8, "[100, -1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[100, -1]" + "'", str9, "[100, -1]");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0776");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, 100]" + "'", str6, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 100 + "'", number7, (byte) 100);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0777");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 10L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0778");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1, (double) ' ');
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0779");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0 + "'", number9, 0);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0780");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) 97.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0781");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0f, (java.lang.Number) 100L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0782");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        double double13 = meanAndStandardDeviation12.getMeanValue();
        boolean boolean14 = meanAndStandardDeviation9.equals((java.lang.Object) meanAndStandardDeviation12);
        boolean boolean15 = meanAndStandardDeviation2.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0783");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, 10.0d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0784");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0785");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) '#');
        double double6 = meanAndStandardDeviation5.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        double double11 = meanAndStandardDeviation9.getMeanValue();
        double double12 = meanAndStandardDeviation9.getMeanValue();
        boolean boolean13 = meanAndStandardDeviation5.equals((java.lang.Object) double12);
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0786");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (byte) -1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 10 + "'", number3, (byte) 10);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 10 + "'", number4, (byte) 10);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) 10 + "'", number5, (byte) 10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0787");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 1);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0788");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0789");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0.0d + "'", number5, 0.0d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0790");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double13 = meanAndStandardDeviation12.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation16 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number17 = meanAndStandardDeviation16.getMean();
        boolean boolean19 = meanAndStandardDeviation16.equals((java.lang.Object) 0L);
        boolean boolean20 = meanAndStandardDeviation12.equals((java.lang.Object) meanAndStandardDeviation16);
        boolean boolean21 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation16);
        java.lang.String str22 = meanAndStandardDeviation2.toString();
        java.lang.String str23 = meanAndStandardDeviation2.toString();
        double double24 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 100 + "'", number17, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[100, -1]" + "'", str22, "[100, -1]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[100, -1]" + "'", str23, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0791");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number11 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation10.equals((java.lang.Object) 0L);
        double double14 = meanAndStandardDeviation10.getStandardDeviationValue();
        double double15 = meanAndStandardDeviation10.getStandardDeviationValue();
        double double16 = meanAndStandardDeviation10.getStandardDeviationValue();
        java.lang.Number number17 = meanAndStandardDeviation10.getMean();
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        double double19 = meanAndStandardDeviation10.getStandardDeviationValue();
        double double20 = meanAndStandardDeviation10.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 100 + "'", number17, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0792");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.String str10 = meanAndStandardDeviation6.toString();
        double double11 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.String str12 = meanAndStandardDeviation6.toString();
        double double13 = meanAndStandardDeviation6.getMeanValue();
        java.lang.Number number14 = meanAndStandardDeviation6.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[-1.0, 100]" + "'", str10, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[-1.0, 100]" + "'", str12, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1.0f) + "'", number14, (-1.0f));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0793");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 10.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[100.0, 10.0]" + "'", str3, "[100.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100.0d + "'", number5, 100.0d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0794");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0795");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number11 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation10.equals((java.lang.Object) 0L);
        java.lang.Number number14 = meanAndStandardDeviation10.getStandardDeviation();
        boolean boolean15 = meanAndStandardDeviation5.equals((java.lang.Object) number14);
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) number14);
        java.lang.String str17 = meanAndStandardDeviation2.toString();
        java.lang.Number number18 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation21 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), 1.0d);
        boolean boolean22 = meanAndStandardDeviation2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1) + "'", number14, (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1.0, -1.0]" + "'", str17, "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + (-1.0d) + "'", number18, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0796");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean10 = meanAndStandardDeviation6.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double14 = meanAndStandardDeviation13.getMeanValue();
        double double15 = meanAndStandardDeviation13.getMeanValue();
        java.lang.String str16 = meanAndStandardDeviation13.toString();
        boolean boolean17 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation13);
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number19 = meanAndStandardDeviation6.getStandardDeviation();
        double double20 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number21 = meanAndStandardDeviation6.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100]" + "'", str16, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 1.0d + "'", number19, 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 1.0d + "'", number21, 1.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0797");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        java.lang.Number number10 = meanAndStandardDeviation2.getMean();
        java.lang.String str11 = meanAndStandardDeviation2.toString();
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100.0d + "'", number10, 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100.0, 100.0]" + "'", str11, "[100.0, 100.0]");
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0798");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (byte) -1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 10 + "'", number3, (byte) 10);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) -1 + "'", number4, (byte) -1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0799");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        double double9 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0800");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0f, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0801");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double11 = meanAndStandardDeviation10.getStandardDeviationValue();
        java.lang.Number number12 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation10);
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        java.lang.Number number15 = meanAndStandardDeviation10.getMean();
        java.lang.Number number16 = meanAndStandardDeviation10.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (short) 1 + "'", number7, (short) 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (-1.0f) + "'", number12, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0f) + "'", number15, (-1.0f));
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (byte) 100 + "'", number16, (byte) 100);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0802");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0803");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 1L);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1L + "'", number6, 1L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0804");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number14 = meanAndStandardDeviation13.getMean();
        double double15 = meanAndStandardDeviation13.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass16 = meanAndStandardDeviation13.getClass();
        boolean boolean17 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100 + "'", number14, 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0805");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass8 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0806");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double9 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0 + "'", number7, 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0807");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0f, (java.lang.Number) (-1L));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0808");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        java.lang.Number number10 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100, -1]" + "'", str8, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0809");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        java.lang.Number number9 = meanAndStandardDeviation8.getStandardDeviation();
        double double10 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0.0f + "'", number9, 0.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0810");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 100, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0811");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation5.getMean();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) number10);
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        double double13 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation16 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double17 = meanAndStandardDeviation16.getStandardDeviationValue();
        java.lang.Number number18 = meanAndStandardDeviation16.getMean();
        double double19 = meanAndStandardDeviation16.getStandardDeviationValue();
        boolean boolean20 = meanAndStandardDeviation2.equals((java.lang.Object) double19);
        double double21 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number22 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass23 = number22.getClass();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + (-1.0f) + "'", number18, (-1.0f));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 100.0d + "'", number22, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0812");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean10 = meanAndStandardDeviation8.equals((java.lang.Object) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number14 = meanAndStandardDeviation13.getMean();
        boolean boolean16 = meanAndStandardDeviation13.equals((java.lang.Object) 0L);
        java.lang.Number number17 = meanAndStandardDeviation13.getStandardDeviation();
        boolean boolean18 = meanAndStandardDeviation8.equals((java.lang.Object) number17);
        boolean boolean19 = meanAndStandardDeviation5.equals((java.lang.Object) number17);
        java.lang.String str20 = meanAndStandardDeviation5.toString();
        boolean boolean21 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100 + "'", number14, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (-1) + "'", number17, (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[-1.0, -1.0]" + "'", str20, "[-1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0813");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number11 = meanAndStandardDeviation2.getMean();
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0 + "'", number10, 0);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0 + "'", number12, 0);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0814");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', 0.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0815");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) 10.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0816");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, (double) 'a');
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0817");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        java.lang.Number number7 = meanAndStandardDeviation6.getStandardDeviation();
        double double8 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number10 = meanAndStandardDeviation6.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 10L + "'", number7, 10L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 10L + "'", number10, 10L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0818");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str11 = meanAndStandardDeviation9.toString();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        double double13 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double14 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10.0, 0.0]" + "'", str11, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0819");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) '4');
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0820");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 1 + "'", number6, (byte) 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 1 + "'", number7, (byte) 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0821");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (short) 1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1, 1]" + "'", str4, "[1, 1]");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0822");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double9 = meanAndStandardDeviation8.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation8.getStandardDeviation();
        double double11 = meanAndStandardDeviation8.getMeanValue();
        java.lang.String str12 = meanAndStandardDeviation8.toString();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 0 + "'", number3, (short) 0);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10L + "'", number4, 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10, 0]" + "'", str5, "[10, 0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100, -1]" + "'", str12, "[100, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0823");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) -1 + "'", number4, (byte) -1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0824");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) '4');
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0825");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0826");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0827");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(52.0d, (double) (short) 1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0828");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10.0d + "'", number3, 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0829");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1.0d) + "'", number6, (-1.0d));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0830");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (byte) 0);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0831");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (double) (-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0832");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0833");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (byte) 1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0834");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double6 = meanAndStandardDeviation5.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation5.getMeanValue();
        double double8 = meanAndStandardDeviation5.getMeanValue();
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) double9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0835");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number11 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation10.equals((java.lang.Object) 0L);
        double double14 = meanAndStandardDeviation10.getStandardDeviationValue();
        java.lang.String str15 = meanAndStandardDeviation10.toString();
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) str15);
        java.lang.String str17 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 1 + "'", number6, (byte) 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 1 + "'", number7, (byte) 1);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[100, -1]" + "'", str15, "[100, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[1, 10.0]" + "'", str17, "[1, 10.0]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0836");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0d, (java.lang.Number) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '4', (double) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0837");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1, 1]" + "'", str4, "[1, 1]");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0838");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        double double9 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        java.lang.Number number13 = meanAndStandardDeviation12.getMean();
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation12);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation17 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (short) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation20 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number21 = meanAndStandardDeviation20.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation24 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number25 = meanAndStandardDeviation24.getMean();
        boolean boolean27 = meanAndStandardDeviation24.equals((java.lang.Object) 0L);
        double double28 = meanAndStandardDeviation24.getStandardDeviationValue();
        double double29 = meanAndStandardDeviation24.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation32 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double33 = meanAndStandardDeviation32.getMeanValue();
        boolean boolean35 = meanAndStandardDeviation32.equals((java.lang.Object) 10.0d);
        boolean boolean36 = meanAndStandardDeviation24.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass37 = meanAndStandardDeviation24.getClass();
        boolean boolean38 = meanAndStandardDeviation20.equals((java.lang.Object) meanAndStandardDeviation24);
        boolean boolean39 = meanAndStandardDeviation17.equals((java.lang.Object) meanAndStandardDeviation20);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation42 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 100, (java.lang.Number) 10L);
        boolean boolean43 = meanAndStandardDeviation20.equals((java.lang.Object) meanAndStandardDeviation42);
        boolean boolean44 = meanAndStandardDeviation12.equals((java.lang.Object) meanAndStandardDeviation42);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 100.0f + "'", number21, 100.0f);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 100 + "'", number25, 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0839");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, 100.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0840");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double11 = meanAndStandardDeviation10.getStandardDeviationValue();
        java.lang.Number number12 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation10);
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        java.lang.Number number15 = meanAndStandardDeviation10.getMean();
        double double16 = meanAndStandardDeviation10.getMeanValue();
        double double17 = meanAndStandardDeviation10.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (short) 1 + "'", number7, (short) 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (-1.0f) + "'", number12, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0f) + "'", number15, (-1.0f));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0841");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, 0.0d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0842");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 10, (double) '4');
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0843");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (short) 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0844");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double11 = meanAndStandardDeviation6.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0845");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (short) 0);
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        double double7 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) double7);
        double double9 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1.0d + "'", number6, 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0846");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 1L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0847");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) ' ', 0.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double7 = meanAndStandardDeviation6.getMeanValue();
        double double8 = meanAndStandardDeviation6.getStandardDeviationValue();
        double double9 = meanAndStandardDeviation6.getMeanValue();
        double double10 = meanAndStandardDeviation6.getStandardDeviationValue();
        double double11 = meanAndStandardDeviation6.getMeanValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) double11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[32.0, 0.0]" + "'", str3, "[32.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0848");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100, 0]" + "'", str4, "[100, 0]");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0849");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100);
        java.lang.Number number11 = meanAndStandardDeviation10.getStandardDeviation();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        double double13 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double14 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str15 = meanAndStandardDeviation2.toString();
        double double16 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100.0d + "'", number11, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[100, -1]" + "'", str15, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0850");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (-1.0d));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) (byte) 10);
        java.lang.Number number8 = meanAndStandardDeviation5.getStandardDeviation();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Number number10 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 1 + "'", number10, 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0851");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 97.0d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0852");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10.0, 0.0]" + "'", str4, "[10.0, 0.0]");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 10.0d + "'", number5, 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[10.0, 0.0]" + "'", str6, "[10.0, 0.0]");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0853");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0854");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) -1, (java.lang.Number) 52.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0855");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0856");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) 1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1.0d + "'", number5, 1.0d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0857");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Number number7 = meanAndStandardDeviation6.getStandardDeviation();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 1.0d + "'", number7, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0858");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0859");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', (double) (-1));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0860");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) Double.NaN, (java.lang.Number) (byte) -1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0861");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) (short) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100L + "'", number4, 100L);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 100 + "'", number5, (short) 100);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0862");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0f, (java.lang.Number) (-1.0f));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0863");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str11 = meanAndStandardDeviation9.toString();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation15 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 1.0d);
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10.0, 0.0]" + "'", str11, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0864");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0865");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation14);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation19 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        java.lang.Number number20 = meanAndStandardDeviation19.getMean();
        java.lang.Number number21 = meanAndStandardDeviation19.getStandardDeviation();
        java.lang.String str22 = meanAndStandardDeviation19.toString();
        boolean boolean23 = meanAndStandardDeviation14.equals((java.lang.Object) str22);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (short) 1 + "'", number20, (short) 1);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + (byte) 0 + "'", number21, (byte) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[1, 0]" + "'", str22, "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0866");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0867");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0f + "'", number3, 100.0f);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100.0f + "'", number4, 100.0f);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0868");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 32.0d, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0869");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, 100.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0, 100.0]" + "'", str3, "[0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0870");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 1.0d);
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation7);
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100.0d + "'", number4, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100.0d + "'", number9, 100.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0871");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean16 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation14);
        java.lang.String str17 = meanAndStandardDeviation14.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[1, 10]" + "'", str17, "[1, 10]");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0872");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) (byte) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0873");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass9 = number8.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0874");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass12 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0875");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (short) -1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0876");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (short) 0);
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        double double7 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) double7);
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str10 = meanAndStandardDeviation2.toString();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double12 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double13 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1.0d + "'", number6, 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0.0, -1.0]" + "'", str10, "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0877");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) 32.0d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0878");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number9 = meanAndStandardDeviation8.getStandardDeviation();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[null, 0]" + "'", str5, "[null, 0]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0879");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10.0f);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0880");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.String str10 = meanAndStandardDeviation6.toString();
        double double11 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.String str12 = meanAndStandardDeviation6.toString();
        java.lang.Number number13 = meanAndStandardDeviation6.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[-1.0, 100]" + "'", str10, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[-1.0, 100]" + "'", str12, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-1.0f) + "'", number13, (-1.0f));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0881");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 1, 0.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1.0, 0.0]" + "'", str3, "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0882");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0f + "'", number3, 100.0f);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100.0f + "'", number4, 100.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0883");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '4', (double) (-1.0f));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        double double6 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = meanAndStandardDeviation5.equals(obj7);
        boolean boolean9 = meanAndStandardDeviation2.equals(obj7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0884");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', (double) 0.0f);
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0d + "'", number4, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0885");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) (byte) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0886");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation6.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getMean();
        java.lang.Number number17 = meanAndStandardDeviation14.getMean();
        double double18 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean19 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation14);
        double double20 = meanAndStandardDeviation14.getMeanValue();
        java.lang.Class<?> wildcardClass21 = meanAndStandardDeviation14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0887");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10.0f, (double) 10.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0888");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 1L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0889");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 10, number1);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0890");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1, (double) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0891");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0892");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) (-1.0f));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0893");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0894");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, number1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0895");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0896");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100, 0]" + "'", str4, "[100, 0]");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0897");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) 1.0f);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0898");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) (short) 10);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0899");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0900");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 100.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100.0d + "'", number4, 100.0d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0901");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (short) 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0902");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100, -1]" + "'", str4, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0903");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(52.0d, 32.0d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0904");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        double double11 = meanAndStandardDeviation2.getMeanValue();
        double double12 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0905");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10L + "'", number3, 10L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1, 10]" + "'", str4, "[1, 10]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0906");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', Double.NaN);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        double double6 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Number number7 = meanAndStandardDeviation5.getStandardDeviation();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) number7);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10.0f, (double) 10);
        double double12 = meanAndStandardDeviation11.getMeanValue();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation11);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1.0d) + "'", number7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0907");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1, (double) (-1));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0908");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0f, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0909");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0910");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0911");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1 + "'", number4, 1);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1 + "'", number5, 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0912");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 100, (java.lang.Number) 10L);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) 100L);
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number11 = meanAndStandardDeviation10.getStandardDeviation();
        double double12 = meanAndStandardDeviation10.getMeanValue();
        java.lang.Number number13 = meanAndStandardDeviation10.getMean();
        double double14 = meanAndStandardDeviation10.getStandardDeviationValue();
        double double15 = meanAndStandardDeviation10.getStandardDeviationValue();
        double double16 = meanAndStandardDeviation10.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation19 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) (byte) -1);
        boolean boolean20 = meanAndStandardDeviation10.equals((java.lang.Object) meanAndStandardDeviation19);
        boolean boolean21 = meanAndStandardDeviation2.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 100 + "'", number7, (byte) 100);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0 + "'", number13, 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0913");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0914");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str11 = meanAndStandardDeviation9.toString();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        double double13 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number14 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10.0, 0.0]" + "'", str11, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1) + "'", number14, (-1));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0915");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0 + "'", number6, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0916");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) -1, (java.lang.Number) (short) 0);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0917");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 1L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0918");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(97.0d, (double) '#');
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0919");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(32.0d, 0.0d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0920");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 100.0]" + "'", str5, "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (short) 1 + "'", number6, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0921");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', 0.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0922");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, 0.0d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0923");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, number1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10.0f + "'", number3, 10.0f);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0924");
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
        java.lang.Number number19 = meanAndStandardDeviation2.getStandardDeviation();
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
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 100.0f + "'", number19, 100.0f);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0925");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (byte) 10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0926");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) ' ');
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0927");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 100L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0928");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, -1]" + "'", str5, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0929");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number12 = meanAndStandardDeviation11.getMean();
        boolean boolean14 = meanAndStandardDeviation11.equals((java.lang.Object) 0L);
        double double15 = meanAndStandardDeviation11.getStandardDeviationValue();
        double double16 = meanAndStandardDeviation11.getStandardDeviationValue();
        double double17 = meanAndStandardDeviation11.getStandardDeviationValue();
        java.lang.Number number18 = meanAndStandardDeviation11.getMean();
        boolean boolean19 = meanAndStandardDeviation2.equals((java.lang.Object) number18);
        java.lang.String str20 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100 + "'", number12, 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100 + "'", number18, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[100, -1]" + "'", str20, "[100, -1]");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0930");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) (-1.0d));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0931");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (short) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation5.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number14 = meanAndStandardDeviation13.getMean();
        boolean boolean16 = meanAndStandardDeviation13.equals((java.lang.Object) 0L);
        double double17 = meanAndStandardDeviation13.getStandardDeviationValue();
        double double18 = meanAndStandardDeviation13.getStandardDeviationValue();
        double double19 = meanAndStandardDeviation13.getStandardDeviationValue();
        java.lang.Number number20 = meanAndStandardDeviation13.getMean();
        boolean boolean21 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation13);
        boolean boolean22 = meanAndStandardDeviation2.equals((java.lang.Object) boolean21);
        java.lang.Number number23 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation26 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number27 = meanAndStandardDeviation26.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation30 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double31 = meanAndStandardDeviation30.getStandardDeviationValue();
        java.lang.Number number32 = meanAndStandardDeviation30.getMean();
        boolean boolean33 = meanAndStandardDeviation26.equals((java.lang.Object) meanAndStandardDeviation30);
        double double34 = meanAndStandardDeviation26.getMeanValue();
        double double35 = meanAndStandardDeviation26.getMeanValue();
        boolean boolean36 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation26);
        java.lang.Class<?> wildcardClass37 = meanAndStandardDeviation26.getClass();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100 + "'", number14, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 100 + "'", number20, 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 1 + "'", number23, 1);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (short) 1 + "'", number27, (short) 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + (-1.0f) + "'", number32, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0932");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) ' ', (double) (short) 1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0933");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '4', 0.0d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0934");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1, 100.0]" + "'", str3, "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 100.0]" + "'", str5, "[1, 100.0]");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0935");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) '4');
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0936");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation6.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getMean();
        java.lang.Number number17 = meanAndStandardDeviation14.getMean();
        double double18 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean19 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation14);
        double double20 = meanAndStandardDeviation14.getMeanValue();
        double double21 = meanAndStandardDeviation14.getMeanValue();
        java.lang.String str22 = meanAndStandardDeviation14.toString();
        double double23 = meanAndStandardDeviation14.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[1, 0]" + "'", str22, "[1, 0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0937");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0f, (java.lang.Number) (short) 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0938");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0.0d + "'", number5, 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 10.0d + "'", number6, 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0939");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (-1L));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0940");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100.0f);
        double double9 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) 10);
        java.lang.Number number15 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass16 = number15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 10.0]" + "'", str5, "[1, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 10.0f + "'", number12, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 10.0f + "'", number15, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0941");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (-1.0f));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0f) + "'", number3, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0942");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        double double6 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 10.0d + "'", number8, 10.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0943");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass8 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[1, 1.0]" + "'", str7, "[1, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0944");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) 10.0d);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0945");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) (byte) -1);
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation11);
        double double13 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0946");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, number1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0947");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0948");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Object obj4 = null;
        boolean boolean5 = meanAndStandardDeviation2.equals(obj4);
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0949");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1L) + "'", number3, (-1L));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1L) + "'", number4, (-1L));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) -1 + "'", number5, (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0950");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) -1 + "'", number3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0951");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0952");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) (-1.0d));
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, -1.0]" + "'", str3, "[-1, -1.0]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0953");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0954");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) (short) 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0955");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation5.getMean();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) number10);
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        double double13 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation16 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double17 = meanAndStandardDeviation16.getStandardDeviationValue();
        java.lang.Number number18 = meanAndStandardDeviation16.getMean();
        double double19 = meanAndStandardDeviation16.getStandardDeviationValue();
        boolean boolean20 = meanAndStandardDeviation2.equals((java.lang.Object) double19);
        double double21 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number22 = meanAndStandardDeviation2.getStandardDeviation();
        double double23 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + (-1.0f) + "'", number18, (-1.0f));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 100.0d + "'", number22, 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0956");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 52.0d, (java.lang.Number) (byte) 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0957");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 100, (java.lang.Number) (-1));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0958");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1, (double) 1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0959");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, 10.0d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0960");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (-1.0d));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        double double7 = meanAndStandardDeviation5.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Number number9 = meanAndStandardDeviation5.getMean();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (byte) 0 + "'", number9, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0961");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        double double6 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        double double8 = meanAndStandardDeviation5.getMeanValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0962");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', (double) 'a');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0963");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) 10.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0964");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1.0f, (double) 10L);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0965");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, (-1.0d));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0966");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        java.lang.Number number11 = meanAndStandardDeviation9.getStandardDeviation();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) number11);
        java.lang.Number number13 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (byte) 1 + "'", number10, (byte) 1);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 10.0f + "'", number11, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0 + "'", number13, 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0967");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100.0f);
        double double9 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        double double11 = meanAndStandardDeviation8.getMeanValue();
        java.lang.String str12 = meanAndStandardDeviation8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 10.0]" + "'", str5, "[1, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[1.0, 100.0]" + "'", str12, "[1.0, 100.0]");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0968");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, 97.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0969");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1.0f);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0970");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(100.0d, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0971");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0972");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 100, (java.lang.Number) (short) 10);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0973");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation6.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getMean();
        java.lang.Number number17 = meanAndStandardDeviation14.getMean();
        double double18 = meanAndStandardDeviation14.getStandardDeviationValue();
        boolean boolean19 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation14);
        double double20 = meanAndStandardDeviation14.getMeanValue();
        double double21 = meanAndStandardDeviation14.getMeanValue();
        java.lang.String str22 = meanAndStandardDeviation14.toString();
        double double23 = meanAndStandardDeviation14.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + (short) 1 + "'", number17, (short) 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[1, 0]" + "'", str22, "[1, 0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0974");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str11 = meanAndStandardDeviation9.toString();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        double double13 = meanAndStandardDeviation2.getMeanValue();
        double double14 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10.0, 0.0]" + "'", str11, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0975");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1.0f) + "'", number5, (-1.0f));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1.0f) + "'", number6, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0976");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (double) (short) 10);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[97.0, 10.0]" + "'", str3, "[97.0, 10.0]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0977");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0978");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 10]" + "'", str5, "[1, 10]");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0979");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (byte) 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0980");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0981");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (byte) 1);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1, 1]" + "'", str3, "[1, 1]");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0982");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, 1.0d);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0983");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation5.getClass();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        java.lang.Number number10 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10 + "'", number9, 10);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 10 + "'", number10, 10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0984");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, 1.0d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0985");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0986");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 52.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0987");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 100, (java.lang.Number) 1);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0988");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass7 = number6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 10.0]" + "'", str5, "[1, 10.0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 1 + "'", number6, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0989");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0990");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (short) -1);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1, -1]" + "'", str3, "[1, -1]");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0991");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) ' ', (double) (byte) 10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        double double9 = meanAndStandardDeviation8.getMeanValue();
        java.lang.Number number10 = meanAndStandardDeviation8.getMean();
        java.lang.Number number11 = meanAndStandardDeviation8.getMean();
        boolean boolean12 = meanAndStandardDeviation5.equals((java.lang.Object) number11);
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (short) 1 + "'", number10, (short) 1);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0992");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 'a');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0993");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass12 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0994");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation8.getClass();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0995");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0d));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0996");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1) + "'", number5, (-1));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1L + "'", number6, 1L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0997");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (byte) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1L + "'", number3, 1L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0998");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) Double.NaN, (java.lang.Number) 1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test0999");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) (short) 10);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest1.test1000");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

