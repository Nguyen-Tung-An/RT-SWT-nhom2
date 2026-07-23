package org.jfree.data.statistics;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MeanAndStandardDeviationRegressionTest0 {

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
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0001");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0003");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0004");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0005");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0006");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0007");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0008");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0009");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0010");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0011");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0012");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = number4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0013");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0014");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0015");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = number4.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0016");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0017");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number9 = meanAndStandardDeviation8.getMean();
        java.lang.String str10 = meanAndStandardDeviation8.toString();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) str10);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, -1]" + "'", str10, "[100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0018");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0019");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass8 = number7.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0020");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0021");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0022");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 0, (java.lang.Number) 0.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0023");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0024");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, (double) (byte) 10);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0025");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0026");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) (byte) 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0027");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0028");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0029");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0030");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1L) + "'", number3, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0031");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean10 = meanAndStandardDeviation6.equals((java.lang.Object) 1L);
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) 1L);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1L) + "'", number3, (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0032");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 0]" + "'", str5, "[1, 0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0033");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0034");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) 1.0d);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0035");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0036");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number12 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass13 = number12.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (-1.0f) + "'", number12, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0037");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0038");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0.0d + "'", number5, 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0039");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1L + "'", number5, 1L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0040");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (short) -1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0041");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0042");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number8 = meanAndStandardDeviation7.getMean();
        boolean boolean10 = meanAndStandardDeviation7.equals((java.lang.Object) 0L);
        double double11 = meanAndStandardDeviation7.getStandardDeviationValue();
        double double12 = meanAndStandardDeviation7.getMeanValue();
        java.lang.Number number13 = meanAndStandardDeviation7.getMean();
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) number13);
        java.lang.Class<?> wildcardClass15 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0043");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0044");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0045");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 100]" + "'", str3, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0046");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 10.0f + "'", number5, 10.0f);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0047");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 10, (double) (short) 1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0048");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0049");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0050");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0f, (java.lang.Number) 0.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) "[10, 0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0051");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1 + "'", number3, 1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0052");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0053");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0054");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0055");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0056");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double14 = meanAndStandardDeviation13.getStandardDeviationValue();
        java.lang.Number number15 = meanAndStandardDeviation13.getMean();
        boolean boolean16 = meanAndStandardDeviation9.equals((java.lang.Object) meanAndStandardDeviation13);
        java.lang.Number number17 = meanAndStandardDeviation9.getStandardDeviation();
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) number17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (short) 1 + "'", number10, (short) 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0f) + "'", number15, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0 + "'", number17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0057");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 0.0]" + "'", str3, "[0, 0.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0058");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0059");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 0 + "'", number3, (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0060");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0061");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0062");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1L) + "'", number3, (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0063");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation5.getClass();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) (short) 0);
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0064");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0065");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 0.0]" + "'", str3, "[0, 0.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0L + "'", number5, 0L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0066");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0067");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) 100 + "'", number5, (byte) 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1.0f) + "'", number6, (-1.0f));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0068");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, -1]" + "'", str3, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0069");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0070");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1, 10.0]" + "'", str3, "[1, 10.0]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0071");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 0, (java.lang.Number) (short) 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0072");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0073");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0074");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 'a');
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0075");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10.0d + "'", number3, 10.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0076");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0077");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, -1]" + "'", str5, "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0078");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation2.getStandardDeviation();
        double double12 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0079");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10L + "'", number4, 10L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0080");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (-1));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0081");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', 0.0d);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0082");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) 10.0f);
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0083");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 100);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0084");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 100.0d);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0085");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 10, (double) (short) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0086");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double11 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass12 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0087");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        java.lang.Number number8 = meanAndStandardDeviation7.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) number8);
        java.lang.Number number10 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (short) 1 + "'", number8, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0 + "'", number10, 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0088");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) (-1.0f));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0089");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str11 = meanAndStandardDeviation9.toString();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Number number13 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10.0, 0.0]" + "'", str11, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (-1) + "'", number13, (-1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0090");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0d, (java.lang.Number) (-1L));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) "[1, 0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0091");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0.0f, 10.0d);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0092");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0093");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10.0f, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0094");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0095");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1), (java.lang.Number) (byte) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0096");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) 0 + "'", number5, (byte) 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0097");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) '#');
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0098");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Object obj4 = null;
        boolean boolean5 = meanAndStandardDeviation2.equals(obj4);
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 1.0d);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0099");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1) + "'", number3, (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100, -1]" + "'", str4, "[100, -1]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0100");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        double double8 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0101");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0102");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0103");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[1, 0]" + "'", str6, "[1, 0]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0104");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0.0d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0105");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) (byte) -1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0106");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean10 = meanAndStandardDeviation8.equals((java.lang.Object) 0L);
        double double11 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) double11);
        double double13 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0107");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0108");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, -1]" + "'", str3, "[-1, -1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1, -1]" + "'", str4, "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0109");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean10 = meanAndStandardDeviation8.equals((java.lang.Object) false);
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0 + "'", number12, 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0110");
        java.lang.Number number0 = null;
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, number1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0111");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0112");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0 + "'", number8, 0);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0113");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0114");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10.0f, Double.NaN);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0115");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0116");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1) + "'", number3, (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0117");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0118");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100.0f, (double) (byte) 100);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0119");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0120");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) (short) 100);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        double double6 = meanAndStandardDeviation5.getStandardDeviationValue();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) double6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0121");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10.0, 0.0]" + "'", str3, "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0122");
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
        java.lang.Class<?> wildcardClass20 = meanAndStandardDeviation14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0123");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, -1]" + "'", str5, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0124");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0f + "'", number3, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0125");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str8 = meanAndStandardDeviation7.toString();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation7);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number11 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 10.0d + "'", number11, 10.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0126");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) true);
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0127");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10.0, -1.0]" + "'", str5, "[10.0, -1.0]");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0128");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, (double) 10L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0129");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass11 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0130");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0131");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1.0f), (double) (short) 10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0132");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) (byte) 100);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0133");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0134");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0135");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0136");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0137");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (short) 0);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean9 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation8);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0138");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation5.getMean();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) number10);
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str13 = meanAndStandardDeviation2.toString();
        java.lang.Number number14 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[100.0, 100.0]" + "'", str13, "[100.0, 100.0]");
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0139");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) 0.0f);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0140");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, 0]" + "'", str3, "[-1, 0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) -1 + "'", number4, (byte) -1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0141");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.String str7 = meanAndStandardDeviation5.toString();
        java.lang.Class<?> wildcardClass8 = meanAndStandardDeviation5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0.0, 10.0]" + "'", str7, "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0142");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10.0, -1.0]" + "'", str7, "[10.0, -1.0]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0143");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 97.0d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0144");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) 100 + "'", number5, (byte) 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 100 + "'", number6, (byte) 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 100 + "'", number7, (byte) 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0145");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', (double) 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0146");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[10.0, -1.0]" + "'", str6, "[10.0, -1.0]");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0147");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number9 = meanAndStandardDeviation8.getMean();
        double double10 = meanAndStandardDeviation8.getMeanValue();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[-1.0, 100]" + "'", str5, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (byte) 0 + "'", number9, (byte) 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0148");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10.0, 10.0]" + "'", str3, "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0149");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0150");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0151");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0 + "'", number5, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0152");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (double) '4');
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0153");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0154");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number13 = meanAndStandardDeviation12.getMean();
        boolean boolean15 = meanAndStandardDeviation12.equals((java.lang.Object) 0L);
        double double16 = meanAndStandardDeviation12.getStandardDeviationValue();
        java.lang.Number number17 = meanAndStandardDeviation12.getMean();
        boolean boolean18 = meanAndStandardDeviation9.equals((java.lang.Object) number17);
        boolean boolean19 = meanAndStandardDeviation2.equals((java.lang.Object) boolean18);
        java.lang.Number number20 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, 100]" + "'", str6, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 100 + "'", number17, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (byte) 100 + "'", number20, (byte) 100);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0155");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0156");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0157");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) 0.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 0.0]" + "'", str3, "[-1.0, 0.0]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0158");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1) + "'", number5, (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0159");
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
        java.lang.Number number15 = meanAndStandardDeviation12.getMean();
        java.lang.Number number16 = meanAndStandardDeviation12.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 100.0d + "'", number16, 100.0d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0160");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0161");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1.0f));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0162");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) -1, (java.lang.Number) (byte) -1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0163");
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
        java.lang.String str17 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass18 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1.0, 100]" + "'", str17, "[-1.0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0164");
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
        java.lang.Class<?> wildcardClass22 = meanAndStandardDeviation2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0165");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (double) ' ');
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0166");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0167");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 100.0f);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0168");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0169");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(number4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0170");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0171");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = number5.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0172");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) 0L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0173");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (short) -1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0174");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0175");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100, -1]" + "'", str5, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0176");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((-1.0d), (double) (-1L));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0177");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', (double) 1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0178");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1), (java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0179");
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
        java.lang.Number number19 = meanAndStandardDeviation10.getMean();
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
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 100 + "'", number19, 100);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0180");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double8 = meanAndStandardDeviation5.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        double double10 = meanAndStandardDeviation5.getMeanValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0181");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0182");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0183");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0184");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, 1.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0, 1.0]" + "'", str3, "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0185");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0186");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (short) -1);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, -1]" + "'", str3, "[-1.0, -1]");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0187");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) Double.NaN);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Number number7 = meanAndStandardDeviation5.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str11 = meanAndStandardDeviation10.toString();
        boolean boolean12 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation10);
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Class<?> wildcardClass14 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100]" + "'", str11, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0188");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number8 = meanAndStandardDeviation7.getMean();
        boolean boolean10 = meanAndStandardDeviation7.equals((java.lang.Object) 0L);
        double double11 = meanAndStandardDeviation7.getStandardDeviationValue();
        double double12 = meanAndStandardDeviation7.getMeanValue();
        java.lang.Number number13 = meanAndStandardDeviation7.getMean();
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) number13);
        double double15 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0189");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10, -1]" + "'", str4, "[10, -1]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0190");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0191");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = number4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0192");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0193");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0 + "'", number6, 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0194");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 10.0]" + "'", str3, "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[-1.0, 10.0]" + "'", str5, "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0195");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) "[0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 100.0]" + "'", str5, "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0196");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) "[100, 0]");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double11 = meanAndStandardDeviation10.getMeanValue();
        java.lang.Number number12 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) number12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0 + "'", number12, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0197");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0d, (java.lang.Number) 1.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0198");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str8 = meanAndStandardDeviation7.toString();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation7);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass11 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0199");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10L + "'", number3, 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 1 + "'", number5, (short) 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0200");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, (-1.0d));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0201");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.String str8 = meanAndStandardDeviation6.toString();
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, 0]" + "'", str3, "[-1, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[1, 0]" + "'", str8, "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0202");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) (-1L));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0203");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (byte) 10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0204");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) 100.0f);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0205");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0206");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (-1.0d));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0207");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0208");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (double) 10L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0209");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1), (java.lang.Number) (byte) 10);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0210");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) 32.0d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0211");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0212");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0213");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) 100L);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1L) + "'", number3, (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0214");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100);
        java.lang.Number number11 = meanAndStandardDeviation10.getStandardDeviation();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        double double13 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100.0d + "'", number11, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0215");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double8 = meanAndStandardDeviation7.getMeanValue();
        double double9 = meanAndStandardDeviation7.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation7.getMeanValue();
        java.lang.Class<?> wildcardClass11 = meanAndStandardDeviation7.getClass();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation7);
        double double13 = meanAndStandardDeviation7.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0216");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (short) 10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0217");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0218");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(Double.NaN, Double.NaN);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0219");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0f, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0220");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number8 = meanAndStandardDeviation7.getStandardDeviation();
        java.lang.Number number9 = meanAndStandardDeviation7.getStandardDeviation();
        double double10 = meanAndStandardDeviation7.getMeanValue();
        java.lang.Number number11 = meanAndStandardDeviation7.getMean();
        java.lang.Number number12 = meanAndStandardDeviation7.getStandardDeviation();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) number12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, 0]" + "'", str3, "[-1, 0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0 + "'", number8, 0);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0 + "'", number9, 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0 + "'", number12, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0221");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) 97.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0222");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 0.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 0.0]" + "'", str3, "[0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0223");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, 0.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0224");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double8 = meanAndStandardDeviation7.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation7.getMean();
        double double10 = meanAndStandardDeviation7.getStandardDeviationValue();
        java.lang.String str11 = meanAndStandardDeviation7.toString();
        double double12 = meanAndStandardDeviation7.getStandardDeviationValue();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) double12);
        java.lang.String str14 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0f) + "'", number9, (-1.0f));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[-1.0, 100]" + "'", str11, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[1, 10.0]" + "'", str14, "[1, 10.0]");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0225");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1L), (double) (byte) -1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0226");
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
        java.lang.Number number22 = meanAndStandardDeviation2.getMean();
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
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0227");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (byte) -1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0228");
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
        java.lang.Class<?> wildcardClass18 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1) + "'", number14, (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1.0, -1.0]" + "'", str17, "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0229");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (short) 1 + "'", number4, (short) 1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0230");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) ' ', (double) 100L);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0231");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) 0);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0232");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) Double.NaN);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0233");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0 + "'", number8, 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0234");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation5.getMean();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) number10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number15 = meanAndStandardDeviation14.getMean();
        double double16 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass17 = meanAndStandardDeviation14.getClass();
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation14);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100 + "'", number15, 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0235");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, 100]" + "'", str6, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (byte) 100 + "'", number8, (byte) 100);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0236");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) 97.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0237");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10.0, 0.0]" + "'", str4, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0238");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) (byte) 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0239");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0d, (java.lang.Number) 100.0f);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0240");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, 0.0d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0241");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1L), (double) (byte) -1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1.0d) + "'", number3, (-1.0d));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0242");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass8 = number7.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0243");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) 97.0d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0244");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0245");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) "[-1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0246");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, 1.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0247");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 10.0f);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0248");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 1.0d);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0249");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10.0d, (java.lang.Number) 1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0250");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10.0, 10.0]" + "'", str3, "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10.0, 10.0]" + "'", str5, "[10.0, 10.0]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0251");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) 10.0f);
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0.0, 100.0]" + "'", str7, "[0.0, 100.0]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0252");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) 100L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0253");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1, 100.0]" + "'", str4, "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1 + "'", number5, 1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0254");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100, 0]" + "'", str4, "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0255");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0256");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (short) 1);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) double6);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double11 = meanAndStandardDeviation10.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number15 = meanAndStandardDeviation14.getMean();
        boolean boolean17 = meanAndStandardDeviation14.equals((java.lang.Object) 0L);
        boolean boolean18 = meanAndStandardDeviation10.equals((java.lang.Object) meanAndStandardDeviation14);
        java.lang.Number number19 = meanAndStandardDeviation10.getStandardDeviation();
        boolean boolean20 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100 + "'", number15, 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + (byte) 100 + "'", number19, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0257");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (short) 0);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, 0]" + "'", str3, "[-1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0258");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 1);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1, 1]" + "'", str3, "[1, 1]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1 + "'", number4, 1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0259");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(97.0d, 0.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0260");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 10.0d);
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) '#');
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (short) 1 + "'", number6, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0261");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0262");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double8 = meanAndStandardDeviation5.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0263");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (double) 'a');
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 97.0]" + "'", str3, "[-1.0, 97.0]");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0264");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.String str7 = meanAndStandardDeviation5.toString();
        java.lang.Number number8 = meanAndStandardDeviation5.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0.0, 10.0]" + "'", str7, "[0.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 10.0d + "'", number8, 10.0d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0265");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 0]" + "'", str5, "[1, 0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 0 + "'", number7, (byte) 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0266");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0267");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 10, (java.lang.Number) 1.0d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0268");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double13 = meanAndStandardDeviation12.getMeanValue();
        java.lang.Object obj14 = null;
        boolean boolean15 = meanAndStandardDeviation12.equals(obj14);
        boolean boolean16 = meanAndStandardDeviation6.equals(obj14);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100.0d + "'", number7, 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100.0d + "'", number8, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0269");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10.0d + "'", number3, 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0270");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0, 1.0d);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0271");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10L + "'", number3, 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 10L + "'", number5, 10L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0272");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) 97.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0273");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0274");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100.0d + "'", number7, 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100.0d + "'", number8, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0275");
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
        java.lang.String str17 = meanAndStandardDeviation2.toString();
        java.lang.Number number18 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1.0, 100]" + "'", str17, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + (byte) 100 + "'", number18, (byte) 100);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0276");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) (short) 100);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0277");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 0 + "'", number3, (short) 0);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10L + "'", number4, 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0278");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (-1.0d));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0279");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = number4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0280");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 100]" + "'", str3, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1.0, 100]" + "'", str4, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1.0f) + "'", number6, (-1.0f));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0281");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 10);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number6 = meanAndStandardDeviation5.getStandardDeviation();
        double double7 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Number number8 = meanAndStandardDeviation5.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) number8);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0 + "'", number8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0282");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) Double.NaN);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[100, NaN]" + "'", str3, "[100, NaN]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0283");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0f, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0284");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) 10.0d);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0285");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (byte) -1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 10 + "'", number3, (byte) 10);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 10 + "'", number4, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0286");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(Double.NaN, 0.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0287");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 97.0d, (java.lang.Number) 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0288");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) ' ');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 32.0d + "'", number3, 32.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 32.0d + "'", number4, 32.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0289");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number8 = meanAndStandardDeviation7.getMean();
        boolean boolean10 = meanAndStandardDeviation7.equals((java.lang.Object) 0L);
        java.lang.Number number11 = meanAndStandardDeviation7.getStandardDeviation();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) number11);
        double double13 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0290");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1) + "'", number3, (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10, -1]" + "'", str5, "[10, -1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0291");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[1, 0]" + "'", str4, "[1, 0]");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0292");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0293");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = number4.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0294");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0f + "'", number3, 100.0f);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0295");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 32.0d, number1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0296");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[100.0, 1.0]" + "'", str3, "[100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100.0d + "'", number5, 100.0d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0297");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, (double) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0298");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str12 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass13 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0 + "'", number10, 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[1, 0]" + "'", str12, "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0299");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1), (java.lang.Number) (byte) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0300");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number11 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass12 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0301");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation5.getMean();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) number10);
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        double double13 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass14 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0302");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0303");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0f + "'", number3, 100.0f);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0304");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0305");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0.0f, (double) 100L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0306");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (double) 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0307");
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
        java.lang.Class<?> wildcardClass19 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1) + "'", number14, (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1.0, -1.0]" + "'", str17, "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[-1.0, -1.0]" + "'", str18, "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0308");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) (byte) 10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0309");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (-1));
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0310");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 10.0d + "'", number3, 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0311");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0d + "'", number4, 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[100.0, 1.0]" + "'", str5, "[100.0, 1.0]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0312");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0, -1]" + "'", str4, "[0, -1]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, -1]" + "'", str6, "[0, -1]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0313");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 100, (java.lang.Number) 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0314");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (short) -1);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) -1 + "'", number3, (short) -1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0315");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass8 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, 100]" + "'", str6, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0316");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        double double12 = meanAndStandardDeviation11.getStandardDeviationValue();
        java.lang.Number number13 = meanAndStandardDeviation11.getMean();
        java.lang.String str14 = meanAndStandardDeviation11.toString();
        boolean boolean15 = meanAndStandardDeviation2.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[100.0, 1.0]" + "'", str14, "[100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0317");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Object obj4 = null;
        boolean boolean5 = meanAndStandardDeviation2.equals(obj4);
        double double6 = meanAndStandardDeviation2.getMeanValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0318");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10.0, 0.0]" + "'", str4, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0319");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 0]" + "'", str5, "[1, 0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0320");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) ' ', 97.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0321");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number11 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number12 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation15 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100, (double) 1L);
        double double16 = meanAndStandardDeviation15.getStandardDeviationValue();
        boolean boolean17 = meanAndStandardDeviation2.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (byte) 100 + "'", number11, (byte) 100);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (byte) 100 + "'", number12, (byte) 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0322");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10.0f);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) 10.0f);
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0323");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 100, 97.0d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0324");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(10.0d, (double) (short) 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0325");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double8 = meanAndStandardDeviation7.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation7.getMean();
        double double10 = meanAndStandardDeviation7.getStandardDeviationValue();
        java.lang.String str11 = meanAndStandardDeviation7.toString();
        double double12 = meanAndStandardDeviation7.getStandardDeviationValue();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) double12);
        java.lang.Number number14 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0f) + "'", number9, (-1.0f));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[-1.0, 100]" + "'", str11, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 10.0f + "'", number14, 10.0f);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0326");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 10, (double) 'a');
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0327");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '4', (double) (short) 10);
        boolean boolean7 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean14 = meanAndStandardDeviation10.equals((java.lang.Object) meanAndStandardDeviation13);
        boolean boolean15 = meanAndStandardDeviation6.equals((java.lang.Object) meanAndStandardDeviation13);
        java.lang.Class<?> wildcardClass16 = meanAndStandardDeviation6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0328");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100.0d + "'", number8, 100.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0329");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10.0f, 0.0d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0330");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) false);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0d, (java.lang.Number) 100.0f);
        double double9 = meanAndStandardDeviation8.getStandardDeviationValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation8);
        double double11 = meanAndStandardDeviation8.getMeanValue();
        double double12 = meanAndStandardDeviation8.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 10.0]" + "'", str5, "[1, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0331");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0332");
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
        double double22 = meanAndStandardDeviation16.getStandardDeviationValue();
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0333");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0334");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 0.0d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0335");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1L), (java.lang.Number) (short) -1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0336");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) (short) 1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        double double8 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 1.0d + "'", number10, 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0337");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (short) -1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0338");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double8 = meanAndStandardDeviation7.getMeanValue();
        java.lang.Number number9 = meanAndStandardDeviation7.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number13 = meanAndStandardDeviation12.getMean();
        boolean boolean15 = meanAndStandardDeviation12.equals((java.lang.Object) 0L);
        double double16 = meanAndStandardDeviation12.getStandardDeviationValue();
        double double17 = meanAndStandardDeviation12.getMeanValue();
        java.lang.Number number18 = meanAndStandardDeviation12.getMean();
        boolean boolean19 = meanAndStandardDeviation7.equals((java.lang.Object) number18);
        java.lang.Number number20 = meanAndStandardDeviation7.getStandardDeviation();
        boolean boolean21 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation7);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0.0d + "'", number9, 0.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100 + "'", number18, 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0339");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, 0.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0340");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        double double10 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0 + "'", number9, 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0341");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) 10L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[100.0, 10.0]" + "'", str3, "[100.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[100.0, 10.0]" + "'", str4, "[100.0, 10.0]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0342");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0 + "'", number4, 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0343");
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
        java.lang.Class<?> wildcardClass19 = meanAndStandardDeviation2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0344");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0345");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.String str10 = meanAndStandardDeviation6.toString();
        double double11 = meanAndStandardDeviation6.getStandardDeviationValue();
        double double12 = meanAndStandardDeviation6.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[-1.0, 100]" + "'", str10, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0346");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100.0d + "'", number7, 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100.0, 100.0]" + "'", str8, "[100.0, 100.0]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0347");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 1);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1, 1]" + "'", str3, "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0348");
        java.lang.Number number0 = null;
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, number1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[null, null]" + "'", str4, "[null, null]");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0349");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation2.getMeanValue();
        double double11 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass12 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0350");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 1.0f);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0351");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, 0.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1.0, 0.0]" + "'", str3, "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0352");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10L, (java.lang.Number) (short) 0);
        java.lang.Number number10 = meanAndStandardDeviation9.getStandardDeviation();
        java.lang.Number number11 = meanAndStandardDeviation9.getMean();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Number number13 = meanAndStandardDeviation9.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1.0f) + "'", number5, (-1.0f));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1.0f) + "'", number6, (-1.0f));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (short) 0 + "'", number10, (short) 0);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 10L + "'", number11, 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (short) 0 + "'", number13, (short) 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0353");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (double) (byte) 10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0354");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 0, 97.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0355");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 0L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0356");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 'a');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0357");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 10.0d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0358");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0359");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10, (double) 10L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0360");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getStandardDeviationValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Number number13 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0361");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        double double13 = meanAndStandardDeviation12.getStandardDeviationValue();
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation12);
        java.lang.Number number15 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100 + "'", number15, 100);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0362");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Object obj4 = null;
        boolean boolean5 = meanAndStandardDeviation2.equals(obj4);
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100]" + "'", str6, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0 + "'", number7, 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0363");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0.0d + "'", number5, 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 10.0d + "'", number6, 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0364");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (byte) 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0365");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number8 = meanAndStandardDeviation7.getMean();
        double double9 = meanAndStandardDeviation7.getStandardDeviationValue();
        double double10 = meanAndStandardDeviation7.getStandardDeviationValue();
        double double11 = meanAndStandardDeviation7.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation14 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double15 = meanAndStandardDeviation14.getStandardDeviationValue();
        java.lang.Number number16 = meanAndStandardDeviation14.getMean();
        boolean boolean17 = meanAndStandardDeviation7.equals((java.lang.Object) number16);
        boolean boolean18 = meanAndStandardDeviation2.equals((java.lang.Object) boolean17);
        java.lang.Class<?> wildcardClass19 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1, -1]" + "'", str3, "[-1, -1]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (-1.0f) + "'", number16, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0366");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0367");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) Double.NaN, (java.lang.Number) 1.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[NaN, 1.0]" + "'", str3, "[NaN, 1.0]");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0368");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) 10.0f);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0369");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str12 = meanAndStandardDeviation9.toString();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.String str14 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100]" + "'", str12, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[1, 1.0]" + "'", str14, "[1, 1.0]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0370");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0371");
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
        java.lang.Number number15 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1) + "'", number15, (-1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0372");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number6 = meanAndStandardDeviation5.getMean();
        boolean boolean8 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double9 = meanAndStandardDeviation5.getStandardDeviationValue();
        java.lang.String str10 = meanAndStandardDeviation5.toString();
        java.lang.String str11 = meanAndStandardDeviation5.toString();
        java.lang.Class<?> wildcardClass12 = meanAndStandardDeviation5.getClass();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, -1]" + "'", str10, "[100, -1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100, -1]" + "'", str11, "[100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0373");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (short) 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0374");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0f, (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0375");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0376");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
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
        double double22 = meanAndStandardDeviation13.getStandardDeviationValue();
        boolean boolean23 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation13);
        java.lang.Class<?> wildcardClass24 = meanAndStandardDeviation2.getClass();
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0377");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Number number10 = meanAndStandardDeviation6.getStandardDeviation();
        java.lang.Class<?> wildcardClass11 = number10.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (byte) 100 + "'", number10, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0378");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0f, (java.lang.Number) 10.0d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0379");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0380");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0381");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0d), (java.lang.Number) (-1.0d));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0382");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0.0f, (double) 1);
        boolean boolean11 = meanAndStandardDeviation9.equals((java.lang.Object) 1L);
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, -1]" + "'", str5, "[1, -1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0383");
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
        double double19 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1) + "'", number14, (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1.0, -1.0]" + "'", str17, "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[-1.0, -1.0]" + "'", str18, "[-1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0384");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        double double9 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number10 = meanAndStandardDeviation2.getStandardDeviation();
        double double11 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1) + "'", number7, (-1));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0385");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1 + "'", number4, 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 100.0]" + "'", str5, "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0386");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0387");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double11 = meanAndStandardDeviation2.getMeanValue();
        double double12 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0388");
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
        java.lang.String str15 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 100 + "'", number10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 100.0d + "'", number14, 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[100.0, 100.0]" + "'", str15, "[100.0, 100.0]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0389");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 100.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0390");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0f, (java.lang.Number) (byte) -1);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0391");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean10 = meanAndStandardDeviation8.equals((java.lang.Object) (-1));
        java.lang.String str11 = meanAndStandardDeviation8.toString();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) str11);
        double double13 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100, -1]" + "'", str11, "[100, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0392");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0393");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) (-1.0f));
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getStandardDeviationValue();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        java.lang.Class<?> wildcardClass13 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0394");
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
        double double20 = meanAndStandardDeviation10.getStandardDeviationValue();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0395");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        double double9 = meanAndStandardDeviation8.getMeanValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) double9);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 0]" + "'", str5, "[1, 0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0396");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0397");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100);
        java.lang.Number number11 = meanAndStandardDeviation10.getStandardDeviation();
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        java.lang.Number number13 = meanAndStandardDeviation10.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100.0d + "'", number11, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100.0d + "'", number13, 100.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0398");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 10, (java.lang.Number) 0.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0399");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100]" + "'", str6, "[0, 100]");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0400");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(100.0d, (double) (short) 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0401");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.Number number12 = meanAndStandardDeviation11.getStandardDeviation();
        java.lang.Number number13 = meanAndStandardDeviation11.getStandardDeviation();
        java.lang.String str14 = meanAndStandardDeviation11.toString();
        java.lang.Number number15 = meanAndStandardDeviation11.getMean();
        java.lang.Class<?> wildcardClass16 = meanAndStandardDeviation11.getClass();
        boolean boolean17 = meanAndStandardDeviation2.equals((java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100, -1]" + "'", str7, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100 + "'", number12, 100);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 100]" + "'", str14, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0 + "'", number15, 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0402");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, number1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0 + "'", number3, 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0403");
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
        double double19 = meanAndStandardDeviation6.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100]" + "'", str16, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0404");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, number1);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0405");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0406");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0407");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) -1, (java.lang.Number) 1.0f);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0408");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 10, (java.lang.Number) (byte) -1);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) -1 + "'", number3, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0409");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (double) 10L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[97.0, 10.0]" + "'", str3, "[97.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 97.0d + "'", number4, 97.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0410");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0411");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (-1.0d));
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0412");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Object obj4 = null;
        boolean boolean5 = meanAndStandardDeviation2.equals(obj4);
        double double6 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0413");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double9 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0414");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0f + "'", number3, 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100.0]" + "'", str5, "[0, 100.0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0415");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1.0f), (double) 10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0416");
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
        java.lang.Class<?> wildcardClass21 = number20.getClass();
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0417");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 100, (double) (short) 10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0418");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100 + "'", number5, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0419");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        java.lang.Class<?> wildcardClass9 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0420");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) 1.0d);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) (byte) 0);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (short) 1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double10 = meanAndStandardDeviation9.getMeanValue();
        double double11 = meanAndStandardDeviation9.getMeanValue();
        java.lang.String str12 = meanAndStandardDeviation9.toString();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        double double14 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100]" + "'", str12, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0421");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation8 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean9 = meanAndStandardDeviation5.equals((java.lang.Object) 1L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) boolean9);
        java.lang.Class<?> wildcardClass11 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0422");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) (short) 10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0423");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (short) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0424");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) '#', Double.NaN);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (-1));
        double double6 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Number number7 = meanAndStandardDeviation5.getStandardDeviation();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) number7);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation11 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100.0f, (double) 10L);
        boolean boolean12 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation11);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1.0d) + "'", number7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0425");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0426");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1.0f, 0.0d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0427");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 10.0f + "'", number5, 10.0f);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0428");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[1, 100.0]" + "'", str3, "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0429");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = meanAndStandardDeviation2.equals(obj3);
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number10 = meanAndStandardDeviation9.getMean();
        java.lang.Number number11 = meanAndStandardDeviation9.getStandardDeviation();
        double double12 = meanAndStandardDeviation9.getStandardDeviationValue();
        java.lang.Number number13 = meanAndStandardDeviation9.getMean();
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation9);
        double double15 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (-1.0f) + "'", number5, (-1.0f));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1.0f) + "'", number6, (-1.0f));
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (byte) 1 + "'", number10, (byte) 1);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 10.0f + "'", number11, 10.0f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + (byte) 1 + "'", number13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0430");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100.0d + "'", number3, 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0d + "'", number4, 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0431");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) 1.0f);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0432");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0L, (double) '4');
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0433");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0d, (java.lang.Number) 32.0d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0434");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation2.getStandardDeviation();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation13 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        java.lang.Number number14 = meanAndStandardDeviation13.getStandardDeviation();
        boolean boolean15 = meanAndStandardDeviation2.equals((java.lang.Object) number14);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 1.0d + "'", number14, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0435");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1L), (double) (byte) -1);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, -1.0]" + "'", str3, "[-1.0, -1.0]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0436");
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
        double double14 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1) + "'", number4, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[100, -1]" + "'", str6, "[100, -1]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10.0, 0.0]" + "'", str11, "[10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0437");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 1);
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100]" + "'", str6, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0438");
        java.lang.Number number0 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(number0, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass5 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (byte) 0 + "'", number4, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0439");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0440");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str9 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[100, -1]" + "'", str9, "[100, -1]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0441");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (byte) 100 + "'", number5, (byte) 100);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 100 + "'", number6, (byte) 100);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 100 + "'", number7, (byte) 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0442");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation7 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number8 = meanAndStandardDeviation7.getStandardDeviation();
        java.lang.Number number9 = meanAndStandardDeviation7.getStandardDeviation();
        java.lang.String str10 = meanAndStandardDeviation7.toString();
        boolean boolean11 = meanAndStandardDeviation2.equals((java.lang.Object) str10);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10 + "'", number4, 10);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1) + "'", number8, (-1));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, -1]" + "'", str10, "[100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0443");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        double double3 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0444");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, 1.0d);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10.0, 1.0]" + "'", str3, "[10.0, 1.0]");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0445");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) (short) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) (-1));
        java.lang.Number number8 = meanAndStandardDeviation5.getMean();
        double double9 = meanAndStandardDeviation5.getMeanValue();
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) double9);
        java.lang.String str11 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 100 + "'", number8, 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[1, -1]" + "'", str11, "[1, -1]");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0446");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (double) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0447");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, 100.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0448");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) (-1L));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0449");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) -1, (double) 10L);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str9 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[-1.0, 10.0]" + "'", str3, "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0d + "'", number4, 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[-1.0, 10.0]" + "'", str5, "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, 10.0]" + "'", str6, "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (-1.0d) + "'", number7, (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[-1.0, 10.0]" + "'", str9, "[-1.0, 10.0]");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0450");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Class<?> wildcardClass6 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0451");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass10 = number9.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0 + "'", number9, 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0452");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (-1));
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) (byte) 100);
        boolean boolean7 = meanAndStandardDeviation5.equals((java.lang.Object) 0L);
        double double8 = meanAndStandardDeviation5.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) 0);
        java.lang.Number number13 = meanAndStandardDeviation12.getMean();
        java.lang.String str14 = meanAndStandardDeviation12.toString();
        boolean boolean15 = meanAndStandardDeviation5.equals((java.lang.Object) meanAndStandardDeviation12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[100, 0]" + "'", str14, "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0453");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) 100.0d);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        java.lang.Number number7 = meanAndStandardDeviation6.getStandardDeviation();
        double double8 = meanAndStandardDeviation6.getStandardDeviationValue();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.Class<?> wildcardClass10 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 10L + "'", number7, 10L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0454");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, 100]" + "'", str6, "[-1.0, 100]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0f) + "'", number9, (-1.0f));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0455");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 100, (java.lang.Number) 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0456");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 0, (double) (short) 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0457");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number7 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation6.equals((java.lang.Object) 0L);
        boolean boolean10 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double11 = meanAndStandardDeviation6.getStandardDeviationValue();
        double double12 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.String str13 = meanAndStandardDeviation6.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[100, -1]" + "'", str13, "[100, -1]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0458");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 100 + "'", number3, (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[-1.0, 100]" + "'", str4, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[-1.0, 100]" + "'", str5, "[-1.0, 100]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0459");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getMeanValue();
        double double8 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0460");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(1.0d, (double) 'a');
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 97.0d + "'", number3, 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0461");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        double double10 = meanAndStandardDeviation6.getStandardDeviationValue();
        double double11 = meanAndStandardDeviation6.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0462");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0.0f, (java.lang.Number) 10.0f);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0463");
        java.lang.Number number1 = null;
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, number1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0464");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(10.0d, 32.0d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0465");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 1L, (double) (short) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number5 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0.0d + "'", number5, 0.0d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0466");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 'a', (-1.0d));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0467");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        boolean boolean8 = meanAndStandardDeviation6.equals((java.lang.Object) (-1));
        java.lang.Number number9 = meanAndStandardDeviation6.getMean();
        double double10 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number11 = meanAndStandardDeviation6.getStandardDeviation();
        double double12 = meanAndStandardDeviation6.getMeanValue();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) double12);
        double double14 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 100 + "'", number9, 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0468");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation10 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (-1), (-1.0d));
        double double11 = meanAndStandardDeviation10.getMeanValue();
        java.lang.Number number12 = meanAndStandardDeviation10.getMean();
        boolean boolean13 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation10);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 10.0f + "'", number4, 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 1 + "'", number6, (byte) 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + (byte) 1 + "'", number7, (byte) 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + (-1.0d) + "'", number12, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0469");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getMean();
        java.lang.Number number7 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 0 + "'", number3, (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (byte) 0 + "'", number6, (byte) 0);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0L + "'", number7, 0L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0470");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(100.0d, (double) 0L);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0471");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) -1, (double) (-1.0f));
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0d) + "'", number4, (-1.0d));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0472");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(Double.NaN, (double) 100L);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0473");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        java.lang.Number number8 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0, 100]" + "'", str5, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0 + "'", number8, 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0474");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double7 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double8 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        double double13 = meanAndStandardDeviation12.getStandardDeviationValue();
        boolean boolean14 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation12);
        java.lang.Class<?> wildcardClass15 = meanAndStandardDeviation12.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0475");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        java.lang.String str5 = meanAndStandardDeviation2.toString();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[1, 100.0]" + "'", str5, "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100.0f + "'", number6, 100.0f);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0476");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 1);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0477");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation6 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double7 = meanAndStandardDeviation6.getStandardDeviationValue();
        java.lang.Number number8 = meanAndStandardDeviation6.getMean();
        boolean boolean9 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation6);
        java.lang.String str10 = meanAndStandardDeviation2.toString();
        java.lang.Number number11 = meanAndStandardDeviation2.getMean();
        double double12 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (short) 1 + "'", number3, (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1.0f) + "'", number8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[1, 0]" + "'", str10, "[1, 0]");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (short) 1 + "'", number11, (short) 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0478");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0L, (java.lang.Number) 100.0f);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.String str4 = meanAndStandardDeviation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100.0]" + "'", str3, "[0, 100.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0, 100.0]" + "'", str4, "[0, 100.0]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0479");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 10, (java.lang.Number) (byte) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 10L, (double) 0L);
        double double6 = meanAndStandardDeviation5.getMeanValue();
        java.lang.Class<?> wildcardClass7 = meanAndStandardDeviation5.getClass();
        boolean boolean8 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.Number number9 = meanAndStandardDeviation5.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 10.0d + "'", number9, 10.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0480");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1L, (java.lang.Number) (-1));
        boolean boolean4 = meanAndStandardDeviation2.equals((java.lang.Object) (byte) 10);
        java.lang.Number number5 = meanAndStandardDeviation2.getMean();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1L + "'", number5, 1L);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + (-1) + "'", number6, (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0481");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) 10);
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation5);
        java.lang.String str7 = meanAndStandardDeviation5.toString();
        double double8 = meanAndStandardDeviation5.getMeanValue();
        java.lang.String str9 = meanAndStandardDeviation5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0.0, 10.0]" + "'", str7, "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0.0, 10.0]" + "'", str9, "[0.0, 10.0]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0482");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) 1L);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0483");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1), (java.lang.Number) (short) -1);
        java.lang.Class<?> wildcardClass3 = meanAndStandardDeviation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0484");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (byte) -1);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation5 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1, (java.lang.Number) (-1.0d));
        boolean boolean6 = meanAndStandardDeviation2.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0485");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) (byte) 0);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0486");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 100);
        double double3 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number4 = meanAndStandardDeviation2.getMean();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.String str6 = meanAndStandardDeviation2.toString();
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation9 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 100L, (double) 100.0f);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation12 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number13 = meanAndStandardDeviation12.getMean();
        boolean boolean15 = meanAndStandardDeviation12.equals((java.lang.Object) 0L);
        double double16 = meanAndStandardDeviation12.getStandardDeviationValue();
        java.lang.Number number17 = meanAndStandardDeviation12.getMean();
        boolean boolean18 = meanAndStandardDeviation9.equals((java.lang.Object) number17);
        boolean boolean19 = meanAndStandardDeviation2.equals((java.lang.Object) boolean18);
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation22 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 0);
        java.lang.Number number23 = meanAndStandardDeviation22.getMean();
        java.lang.Number number24 = meanAndStandardDeviation22.getMean();
        boolean boolean25 = meanAndStandardDeviation2.equals((java.lang.Object) meanAndStandardDeviation22);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + (-1.0f) + "'", number4, (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[-1.0, 100]" + "'", str6, "[-1.0, 100]");
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 100 + "'", number13, 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 100 + "'", number17, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + (short) 1 + "'", number23, (short) 1);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + (short) 1 + "'", number24, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0487");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, (double) (byte) -1);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0488");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100L, (java.lang.Number) 0L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0489");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 1.0f, (java.lang.Number) (short) 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0490");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        java.lang.String str3 = meanAndStandardDeviation2.toString();
        java.lang.Number number4 = meanAndStandardDeviation2.getStandardDeviation();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double6 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0, 100]" + "'", str3, "[0, 100]");
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 100 + "'", number4, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0491");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) 0.0f, (double) 1);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0492");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10.0f);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0493");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (short) 10, (double) 100.0f);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0494");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) 1, (java.lang.Number) 10.0f);
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        java.lang.Class<?> wildcardClass4 = number3.getClass();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (byte) 1 + "'", number3, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0495");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 100, (java.lang.Number) (-1));
        java.lang.Number number3 = meanAndStandardDeviation2.getMean();
        boolean boolean5 = meanAndStandardDeviation2.equals((java.lang.Object) 0L);
        double double6 = meanAndStandardDeviation2.getStandardDeviationValue();
        java.lang.Number number7 = meanAndStandardDeviation2.getMean();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        java.lang.Number number9 = meanAndStandardDeviation2.getStandardDeviation();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 100 + "'", number7, 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100, -1]" + "'", str8, "[100, -1]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1) + "'", number9, (-1));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0496");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (short) 1, (java.lang.Number) 10L);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0497");
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
        java.lang.Class<?> wildcardClass23 = meanAndStandardDeviation2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0498");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) (byte) -1, (java.lang.Number) (-1L));
        java.lang.Number number3 = meanAndStandardDeviation2.getStandardDeviation();
        double double4 = meanAndStandardDeviation2.getStandardDeviationValue();
        double double5 = meanAndStandardDeviation2.getStandardDeviationValue();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + (-1L) + "'", number3, (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0499");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((java.lang.Number) 0, (java.lang.Number) 100);
        double double3 = meanAndStandardDeviation2.getMeanValue();
        double double4 = meanAndStandardDeviation2.getMeanValue();
        double double5 = meanAndStandardDeviation2.getMeanValue();
        java.lang.Number number6 = meanAndStandardDeviation2.getStandardDeviation();
        java.lang.String str7 = meanAndStandardDeviation2.toString();
        java.lang.String str8 = meanAndStandardDeviation2.toString();
        double double9 = meanAndStandardDeviation2.getMeanValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100 + "'", number6, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeanAndStandardDeviationRegressionTest0.test0500");
        org.jfree.data.statistics.MeanAndStandardDeviation meanAndStandardDeviation2 = new org.jfree.data.statistics.MeanAndStandardDeviation((double) (byte) 100, (double) 1);
    }
}

