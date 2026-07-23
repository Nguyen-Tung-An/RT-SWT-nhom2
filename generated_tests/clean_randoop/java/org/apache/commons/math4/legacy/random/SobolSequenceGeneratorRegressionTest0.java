package org.apache.commons.math4.legacy.random;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SobolSequenceGeneratorRegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.OutOfRangeException; message: -1 out of [1, 21,201] range");
        } catch (org.apache.commons.math4.legacy.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test002");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '#', inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test003");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a', inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test005");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(1, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test006");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) -1, inputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.OutOfRangeException; message: 0 out of [1, 21,201] range");
        } catch (org.apache.commons.math4.legacy.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test008");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(10, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test009");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test010");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test011");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test012");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test013");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test014");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test015");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        java.lang.Class<?> wildcardClass2 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test016");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test017");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 100, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test018");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 0, inputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test019");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test020");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test021");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.OutOfRangeException; message: -1 out of [1, 21,201] range");
        } catch (org.apache.commons.math4.legacy.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test023");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test024");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test025");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test026");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test027");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test028");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test029");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test030");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((-1), inputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test031");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test032");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test033");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test034");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test035");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(0, inputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test036");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.OutOfRangeException; message: 0 out of [1, 21,201] range");
        } catch (org.apache.commons.math4.legacy.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test038");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(2, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test039");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) -1, inputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test040");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test041");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 1, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test042");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test043");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(1);
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test044");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test045");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test046");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 0, inputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math4.legacy.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test047");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(4, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test048");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test049");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(1);
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test050");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test051");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test052");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test053");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test054");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(1);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test055");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test056");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test057");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.OutOfRangeException; message: 0 out of [1, 21,201] range");
        } catch (org.apache.commons.math4.legacy.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test059");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4', inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test060");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(1);
        int int5 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test061");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test062");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test063");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math4.legacy.exception.OutOfRangeException; message: -1 out of [1, 21,201] range");
        } catch (org.apache.commons.math4.legacy.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test065");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) '#');
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test066");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test067");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(100);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.4140625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test068");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test069");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(98);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test070");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(98, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test071");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test072");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.046875d, 0.265625d, 0.703125d, 0.546875d, 0.140625d, 0.921875d, 0.796875d, 0.671875d, 0.984375d, 0.046875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test073");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test074");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(2);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test075");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test076");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test077");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test078");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass12 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test079");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test080");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test081");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test082");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test083");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test084");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int12 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass13 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test085");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass11 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test086");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        java.lang.Class<?> wildcardClass2 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test087");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass11 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test088");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test089");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) '4');
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test090");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test091");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test092");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test093");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test094");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(5);
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test095");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) ' ');
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test096");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(53);
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test097");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(5, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test098");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test099");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test100");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test101");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(10);
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9375d, 0.0625d, 0.6875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test102");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test103");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test104");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test105");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(3);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test106");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test107");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(53, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test108");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test109");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(12);
        java.lang.Class<?> wildcardClass11 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test110");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        int int9 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test111");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) ' ');
        java.lang.Class<?> wildcardClass11 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test112");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(6, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test113");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test114");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        java.lang.Class<?> wildcardClass2 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test115");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test116");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test117");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test118");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(12);
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray13 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test119");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test120");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test121");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test122");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test123");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test124");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(100);
        int int5 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test125");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(5);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.875d, 0.875d, 0.125d, 0.375d, 0.875d, 0.625d, 0.875d, 0.375d, 0.375d, 0.125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.625d, 0.125d, 0.875d, 0.625d, 0.625d, 0.875d, 0.125d, 0.125d, 0.125d, 0.375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test126");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass11 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test127");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test128");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(101);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test129");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) ' ');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test130");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(98);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test131");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test132");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test133");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass12 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test134");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test135");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(101, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test136");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test137");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test138");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(0);
        java.lang.Class<?> wildcardClass15 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test139");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(53);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.953125d, 0.859375d, 0.921875d, 0.265625d, 0.546875d, 0.703125d, 0.640625d, 0.078125d, 0.890625d, 0.015625d, 0.109375d, 0.484375d, 0.234375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test140");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(11);
        int int11 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test141");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test142");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(36);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test143");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.7890625d, 0.3828125d, 0.1484375d, 0.1015625d, 0.2578125d, 0.3671875d, 0.1484375d, 0.3515625d, 0.5078125d, 0.8203125d }, 1.0E-15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test144");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test145");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test146");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(36, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test147");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test148");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test149");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test150");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d, 0.8515625d, 0.0078125d, 0.1171875d, 0.8984375d, 0.1015625d, 0.7578125d, 0.5703125d, 0.0859375d, 0.3046875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test151");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(36);
        java.lang.Class<?> wildcardClass2 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test152");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test153");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test154");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test155");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test156");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test157");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test158");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.4140625d }, 1.0E-15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test159");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) ' ');
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test160");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(2);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.953125d, 0.859375d }, 1.0E-15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test161");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test162");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(1);
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test163");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(102);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test164");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(0);
        java.lang.Class<?> wildcardClass15 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test165");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test166");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(0);
        java.lang.Class<?> wildcardClass13 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test167");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo(4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test168");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(102, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test169");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        int int11 = sobolSequenceGenerator1.getNextIndex();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray13 = sobolSequenceGenerator1.get();
        double[] doubleArray14 = sobolSequenceGenerator1.get();
        double[] doubleArray16 = sobolSequenceGenerator1.skipTo(5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test170");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test171");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(99, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test172");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        int int11 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo((-1));
        int int14 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test173");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test174");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test175");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test176");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int6 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test177");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test178");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test179");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test180");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(102);
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.6640625d, 0.0078125d, 0.5234375d, 0.9765625d, 0.1328125d, 0.4921875d, 0.2734375d, 0.7265625d, 0.3828125d, 0.4453125d, 0.7109375d, 0.4296875d, 0.2265625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test181");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test182");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test183");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray12 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test184");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d }, 1.0E-15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test185");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(98);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test186");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test187");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(100);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(11);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.4140625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.4375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test188");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) '#');
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test189");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(98);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test190");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo((int) ' ');
        java.lang.Class<?> wildcardClass15 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test191");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test192");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test193");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(34, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test194");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(34);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.796875d, 0.015625d, 0.953125d, 0.796875d, 0.890625d, 0.171875d, 0.546875d, 0.421875d, 0.234375d, 0.796875d, 0.640625d, 0.203125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test195");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        int int11 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test196");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(1);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(0);
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test197");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test198");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test199");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(99);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.2890625d }, 1.0E-15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test200");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test201");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test202");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(7, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test203");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test204");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.4140625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9140625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d }, 1.0E-15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test205");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test206");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        int int11 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test207");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test208");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        int int11 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass14 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test209");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test210");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test211");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test212");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(10);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test213");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test214");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test215");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test216");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(101);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass12 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test217");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test218");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray12 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass14 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test219");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test220");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo((int) ' ');
        int int15 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass16 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test221");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(10);
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9375d, 0.0625d, 0.6875d, 0.1875d, 0.3125d, 0.5625d, 0.1875d, 0.1875d, 0.1875d, 0.5625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test222");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test223");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test224");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(13);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.8125d, 0.6875d, 0.8125d, 0.0625d, 0.4375d, 0.9375d, 0.5625d, 0.5625d, 0.5625d, 0.4375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test225");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test226");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test227");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) '4');
        java.lang.Class<?> wildcardClass12 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.453125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test228");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.4140625d, 0.2578125d, 0.7734375d, 0.7265625d, 0.8828125d, 0.7421875d, 0.0234375d, 0.4765625d, 0.6328125d, 0.6953125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9140625d, 0.7578125d, 0.2734375d, 0.2265625d, 0.3828125d, 0.2421875d, 0.5234375d, 0.9765625d, 0.1328125d, 0.1953125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test229");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(98);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test230");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass12 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test231");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(5);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.875d, 0.875d, 0.125d, 0.375d, 0.875d, 0.625d, 0.875d, 0.375d, 0.375d, 0.125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test232");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(5);
        int int15 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass16 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test233");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test234");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test235");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test236");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test237");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(10);
        int int9 = sobolSequenceGenerator1.getNextIndex();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9375d, 0.0625d, 0.6875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test238");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9375d, 0.0625d, 0.6875d, 0.1875d, 0.3125d, 0.5625d, 0.1875d, 0.1875d, 0.1875d, 0.5625d }, 1.0E-15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test239");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.875d, 0.875d, 0.125d, 0.375d, 0.875d, 0.625d, 0.875d, 0.375d, 0.375d, 0.125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.625d, 0.125d, 0.875d, 0.625d, 0.625d, 0.875d, 0.125d, 0.125d, 0.125d, 0.375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.4140625d, 0.2578125d, 0.7734375d, 0.7265625d, 0.8828125d, 0.7421875d, 0.0234375d, 0.4765625d, 0.6328125d, 0.6953125d }, 1.0E-15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test240");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) ' ');
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(13);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test241");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(100);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(11);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(13);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.4140625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.4375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.8125d }, 1.0E-15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test242");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54 + "'", int6 == 54);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test243");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(10);
        int int9 = sobolSequenceGenerator1.getNextIndex();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        int int11 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9375d, 0.0625d, 0.6875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test244");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9375d, 0.0625d, 0.6875d, 0.1875d, 0.3125d, 0.5625d, 0.1875d, 0.1875d, 0.1875d, 0.5625d, 0.4375d, 0.8125d, 0.6875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test245");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test246");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test247");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo((int) ' ');
        java.lang.Class<?> wildcardClass15 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test248");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 14 + "'", int10 == 14);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test249");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(33, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test250");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test251");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test252");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test253");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(53);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(53);
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test254");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.875d }, 1.0E-15);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test255");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test256");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int9 = sobolSequenceGenerator1.getNextIndex();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test257");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(34);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test258");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(12);
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test259");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 14 + "'", int10 == 14);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test260");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(12);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.3125d, 0.1875d, 0.3125d, 0.5625d, 0.9375d, 0.4375d, 0.0625d, 0.0625d, 0.0625d, 0.9375d, 0.3125d, 0.4375d, 0.5625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test261");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(1);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d }, 1.0E-15);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test262");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(54, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test263");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(4);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(33);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.546875d, 0.765625d, 0.203125d, 0.046875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.4375d, 0.5625d, 0.1875d, 0.6875d }, 1.0E-15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test264");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        int int9 = sobolSequenceGenerator1.getNextIndex();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test265");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test266");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(99);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test267");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(12);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test268");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(53);
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.953125d, 0.859375d, 0.921875d, 0.265625d, 0.546875d, 0.703125d, 0.640625d, 0.078125d, 0.890625d, 0.015625d, 0.109375d, 0.484375d, 0.234375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test269");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(36);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(36);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test270");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(1);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test271");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(54);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test272");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test273");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test274");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test275");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(1);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d }, 1.0E-15);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test276");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '#');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test277");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(53);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.953125d, 0.859375d, 0.921875d, 0.265625d, 0.546875d, 0.703125d, 0.640625d, 0.078125d, 0.890625d, 0.015625d, 0.109375d, 0.484375d, 0.234375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.703125d, 0.109375d, 0.171875d, 0.515625d, 0.796875d, 0.953125d, 0.390625d, 0.328125d, 0.640625d, 0.265625d, 0.359375d, 0.234375d, 0.984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test278");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test279");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test280");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(53);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(53);
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test281");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(14, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test282");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test283");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo(5);
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray13 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test284");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo(99);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test285");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test286");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(100);
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test287");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test288");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(12);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test289");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(33);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(3);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test290");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(99);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test291");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test292");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test293");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '#');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test294");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(100);
        java.lang.Class<?> wildcardClass11 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test295");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(12);
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test296");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int11 = sobolSequenceGenerator1.getNextIndex();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test297");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray13 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test298");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test299");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test300");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int11 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test301");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test302");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int12 = sobolSequenceGenerator1.getNextIndex();
        int int13 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass14 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test303");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test304");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test305");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test306");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray15 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass16 = doubleArray15.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test307");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test308");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass11 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test309");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(4);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(33);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.546875d, 0.765625d, 0.203125d, 0.046875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.796875d, 0.015625d, 0.953125d, 0.796875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test310");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(10);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9375d, 0.0625d, 0.6875d, 0.1875d, 0.3125d, 0.5625d, 0.1875d, 0.1875d, 0.1875d, 0.5625d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test311");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test312");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test313");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5625d, 0.4375d, 0.0625d, 0.8125d, 0.1875d, 0.6875d, 0.3125d, 0.8125d, 0.8125d, 0.1875d }, 1.0E-15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test314");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test315");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) ' ');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test316");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test317");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass11 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test318");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test319");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test320");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test321");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test322");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(1);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test323");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(6);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.625d, 0.125d, 0.875d, 0.625d, 0.625d, 0.875d, 0.125d, 0.125d, 0.125d, 0.375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test324");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(99);
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test325");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(11);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test326");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test327");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(54);
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test328");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(33);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test329");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test330");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test331");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test332");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test333");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) '#');
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test334");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(2);
        java.lang.Class<?> wildcardClass14 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test335");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((-1));
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.4375d, 0.5625d, 0.1875d }, 1.0E-15);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test336");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(12);
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(4);
        double[] doubleArray16 = sobolSequenceGenerator1.skipTo((int) 'a');
        java.lang.Class<?> wildcardClass17 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test337");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(98);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.453125d, 0.359375d, 0.421875d, 0.765625d, 0.046875d, 0.203125d, 0.140625d, 0.578125d, 0.390625d, 0.515625d, 0.609375d, 0.984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.7890625d, 0.3828125d, 0.1484375d, 0.1015625d, 0.2578125d, 0.3671875d, 0.1484375d, 0.3515625d, 0.5078125d, 0.8203125d, 0.3359375d, 0.0546875d }, 1.0E-15);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test338");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test339");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 37 + "'", int6 == 37);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test340");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) ' ');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test341");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        int int12 = sobolSequenceGenerator1.getNextIndex();
        int int13 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test342");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(101);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray12 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test343");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(33);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(6);
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test344");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test345");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test346");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass12 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test347");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(100);
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(10);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test348");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(6);
        java.lang.Class<?> wildcardClass15 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test349");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((-1));
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.125d, 0.625d, 0.375d, 0.125d, 0.125d, 0.375d, 0.625d, 0.625d, 0.625d, 0.875d }, 1.0E-15);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test350");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(12);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test351");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test352");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(1);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test353");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test354");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(54);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test355");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test356");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.7890625d, 0.3828125d, 0.1484375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test357");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(11);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test358");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test359");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test360");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d }, 1.0E-15);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test361");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(10);
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test362");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(99);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test363");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass11 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test364");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test365");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(3);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test366");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test367");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray12 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.get();
        double[] doubleArray15 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test368");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test369");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test370");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(98);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test371");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test372");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(34);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test373");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test374");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test375");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) ' ');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test376");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test377");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test378");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(36);
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test379");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test380");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(11);
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        int int11 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test381");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(37);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test382");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray15 = sobolSequenceGenerator1.get();
        double[] doubleArray17 = sobolSequenceGenerator1.skipTo((int) '4');
        int int18 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass19 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.453125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test383");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(36);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(36);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test384");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(11);
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test385");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        int int11 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test386");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) ' ');
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test387");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test388");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass5 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test389");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) ' ');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test390");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test391");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test392");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(54);
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d, 0.75d, 0.75d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.703125d, 0.109375d, 0.171875d, 0.515625d, 0.796875d, 0.953125d, 0.390625d, 0.328125d, 0.640625d, 0.265625d, 0.359375d, 0.234375d, 0.984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test393");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test394");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(2);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test395");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test396");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(53);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass3 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test397");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.921875d, 0.640625d, 0.578125d, 0.921875d, 0.765625d, 0.296875d, 0.171875d, 0.796875d, 0.609375d, 0.171875d, 0.015625d }, 1.0E-15);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test398");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) '#');
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test399");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) ' ');
        int int9 = sobolSequenceGenerator1.getNextIndex();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test400");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        int int11 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test401");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(5);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test402");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        int int12 = sobolSequenceGenerator1.getNextIndex();
        int int13 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray14 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test403");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray15 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test404");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test405");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test406");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54 + "'", int10 == 54);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test407");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d, 0.8515625d, 0.0078125d, 0.1171875d, 0.8984375d, 0.1015625d, 0.7578125d, 0.5703125d, 0.0859375d, 0.3046875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test408");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.7890625d, 0.3828125d, 0.1484375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.2890625d, 0.8828125d, 0.6484375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test409");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test410");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test411");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.4140625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9140625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test412");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test413");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test414");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator2 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(35, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test415");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(98);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) (byte) 100);
        int int5 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test416");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(100);
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(36);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test417");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test418");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test419");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test420");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        int int13 = sobolSequenceGenerator1.getNextIndex();
        int int14 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test421");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test422");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(5);
        double[] doubleArray15 = sobolSequenceGenerator1.get();
        double[] doubleArray16 = sobolSequenceGenerator1.get();
        int int17 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test423");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test424");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.9375d, 0.0625d, 0.6875d }, 1.0E-15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test425");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(7);
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d, 0.75d, 0.75d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.125d, 0.625d, 0.375d, 0.125d, 0.125d, 0.375d, 0.625d, 0.625d, 0.625d, 0.875d, 0.625d, 0.125d, 0.625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test426");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test427");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((-1));
        int int8 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test428");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(11);
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test429");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test430");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass9 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.7890625d, 0.3828125d, 0.1484375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.2890625d, 0.8828125d, 0.6484375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test431");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test432");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test433");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(10);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9375d, 0.0625d, 0.6875d, 0.1875d, 0.3125d, 0.5625d, 0.1875d, 0.1875d, 0.1875d, 0.5625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.4375d, 0.5625d, 0.1875d, 0.6875d, 0.8125d, 0.0625d, 0.6875d, 0.6875d, 0.6875d, 0.0625d }, 1.0E-15);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test434");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int12 = sobolSequenceGenerator1.getNextIndex();
        int int13 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray15 = sobolSequenceGenerator1.skipTo(102);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test435");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test436");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(8);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test437");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1875d }, 1.0E-15);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test438");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        int int12 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(5);
        int int15 = sobolSequenceGenerator1.getNextIndex();
        int int16 = sobolSequenceGenerator1.getNextIndex();
        int int17 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test439");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray14 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test440");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(98);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.453125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.7890625d }, 1.0E-15);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test441");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(33);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test442");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass3 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test443");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test444");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test445");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(53);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test446");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((-1));
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        int int10 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test447");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo(12);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test448");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(11);
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test449");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(99);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test450");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 10);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test451");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray15 = sobolSequenceGenerator1.get();
        double[] doubleArray17 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray18 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test452");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test453");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray12 = sobolSequenceGenerator1.get();
        int int13 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.453125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.953125d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54 + "'", int13 == 54);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test454");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(3);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass11 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test455");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test456");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray15 = sobolSequenceGenerator1.get();
        double[] doubleArray17 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int18 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test457");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) ' ');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(10);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) ' ');
        int int7 = sobolSequenceGenerator1.getNextIndex();
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test458");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test459");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(34);
        java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.796875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test460");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(15);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test461");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((-1));
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test462");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(101);
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test463");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.375d, 0.375d, 0.625d, 0.875d, 0.375d, 0.125d, 0.375d, 0.875d, 0.875d, 0.625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test464");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(101);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.4140625d, 0.2578125d, 0.7734375d, 0.7265625d, 0.8828125d, 0.7421875d, 0.0234375d, 0.4765625d, 0.6328125d, 0.6953125d, 0.4609375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9140625d, 0.7578125d, 0.2734375d, 0.2265625d, 0.3828125d, 0.2421875d, 0.5234375d, 0.9765625d, 0.1328125d, 0.1953125d, 0.9609375d }, 1.0E-15);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test465");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(53);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.453125d, 0.359375d, 0.421875d, 0.765625d, 0.046875d, 0.203125d, 0.140625d, 0.578125d, 0.390625d, 0.515625d, 0.609375d, 0.984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.953125d, 0.859375d, 0.921875d, 0.265625d, 0.546875d, 0.703125d, 0.640625d, 0.078125d, 0.890625d, 0.015625d, 0.109375d, 0.484375d }, 1.0E-15);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test466");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        java.lang.Class<?> wildcardClass8 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test467");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) ' ');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(10);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) ' ');
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test468");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray12 = sobolSequenceGenerator1.get();
        double[] doubleArray14 = sobolSequenceGenerator1.skipTo(6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test469");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(3);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d, 0.6328125d, 0.8984375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.7890625d, 0.3828125d, 0.1484375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test470");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '4');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((int) '#');
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(99);
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test471");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        int int8 = sobolSequenceGenerator1.getNextIndex();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test472");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(12);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) '4');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.453125d, 0.359375d, 0.421875d, 0.765625d, 0.046875d, 0.203125d, 0.140625d, 0.578125d, 0.390625d, 0.515625d, 0.609375d, 0.984375d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test473");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(36);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(36);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 38 + "'", int5 == 38);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test474");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(2);
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test475");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test476");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '#');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test477");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) '#');
        int int2 = sobolSequenceGenerator1.getNextIndex();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test478");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        int int9 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d, 0.75d, 0.75d, 0.75d, 0.25d, 0.25d, 0.75d, 0.25d, 0.25d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test479");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo((int) (byte) 0);
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test480");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(7);
        java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d, 0.75d, 0.75d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.125d, 0.625d, 0.375d, 0.125d, 0.125d, 0.375d, 0.625d, 0.625d, 0.625d, 0.875d, 0.625d, 0.125d, 0.625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test481");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        double[] doubleArray3 = sobolSequenceGenerator1.get();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (short) -1);
        double[] doubleArray8 = sobolSequenceGenerator1.skipTo(35);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test482");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 0);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d }, 1.0E-15);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test483");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(38);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test484");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.4140625d, 0.2578125d, 0.7734375d, 0.7265625d, 0.8828125d, 0.7421875d, 0.0234375d, 0.4765625d, 0.6328125d, 0.6953125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9140625d, 0.7578125d, 0.2734375d, 0.2265625d, 0.3828125d, 0.2421875d, 0.5234375d, 0.9765625d, 0.1328125d, 0.1953125d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.6640625d, 0.0078125d, 0.5234375d, 0.9765625d, 0.1328125d, 0.4921875d, 0.2734375d, 0.7265625d, 0.3828125d, 0.4453125d }, 1.0E-15);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test485");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) '#');
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test486");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9375d, 0.0625d, 0.6875d, 0.1875d, 0.3125d, 0.5625d, 0.1875d, 0.1875d, 0.1875d, 0.5625d, 0.4375d, 0.8125d, 0.6875d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test487");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo(33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.546875d, 0.765625d, 0.203125d, 0.046875d, 0.640625d, 0.421875d, 0.296875d, 0.171875d, 0.484375d, 0.546875d, 0.890625d }, 1.0E-15);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test488");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 1);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) 'a');
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5390625d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9375d }, 1.0E-15);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test489");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(6);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.625d, 0.125d, 0.875d, 0.625d, 0.625d, 0.875d, 0.125d, 0.125d, 0.125d, 0.375d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.125d, 0.625d, 0.375d, 0.125d, 0.125d, 0.375d, 0.625d, 0.625d, 0.625d, 0.875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test490");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (short) 10);
        int int2 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray4 = sobolSequenceGenerator1.skipTo((-1));
        int int5 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray8 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d }, 1.0E-15);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test491");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(13);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray4 = sobolSequenceGenerator1.get();
        double[] doubleArray5 = sobolSequenceGenerator1.get();
        java.lang.Class<?> wildcardClass6 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.75d, 0.25d, 0.25d, 0.25d, 0.75d, 0.75d, 0.25d, 0.75d, 0.75d, 0.75d, 0.75d, 0.75d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test492");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(11);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.875d, 0.875d, 0.125d, 0.375d, 0.875d, 0.625d, 0.875d, 0.375d, 0.375d, 0.125d, 0.375d }, 1.0E-15);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test493");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) (byte) 100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo(0);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo(3);
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(2);
        java.lang.Class<?> wildcardClass10 = sobolSequenceGenerator1.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test494");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(99);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test495");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(100);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(2);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 100);
        double[] doubleArray7 = sobolSequenceGenerator1.skipTo((int) '#');
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray10 = sobolSequenceGenerator1.skipTo(15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test496");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        int int8 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.get();
        double[] doubleArray10 = sobolSequenceGenerator1.get();
        double[] doubleArray12 = sobolSequenceGenerator1.skipTo(37);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test497");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(33);
        double[] doubleArray2 = sobolSequenceGenerator1.get();
        int int3 = sobolSequenceGenerator1.getNextIndex();
        int int4 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test498");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator(4);
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo(33);
        int int4 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray6 = sobolSequenceGenerator1.skipTo((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.546875d, 0.765625d, 0.203125d, 0.046875d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test499");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (byte) 1);
        double[] doubleArray6 = sobolSequenceGenerator1.get();
        int int7 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo((int) '#');
        double[] doubleArray11 = sobolSequenceGenerator1.skipTo(4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SobolSequenceGeneratorRegressionTest0.test500");
        org.apache.commons.math4.legacy.random.SobolSequenceGenerator sobolSequenceGenerator1 = new org.apache.commons.math4.legacy.random.SobolSequenceGenerator((int) 'a');
        double[] doubleArray3 = sobolSequenceGenerator1.skipTo((int) (short) 1);
        double[] doubleArray5 = sobolSequenceGenerator1.skipTo((int) (short) 10);
        int int6 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray7 = sobolSequenceGenerator1.get();
        double[] doubleArray9 = sobolSequenceGenerator1.skipTo(3);
        int int10 = sobolSequenceGenerator1.getNextIndex();
        double[] doubleArray11 = sobolSequenceGenerator1.get();
        double[] doubleArray13 = sobolSequenceGenerator1.skipTo(101);
        int int14 = sobolSequenceGenerator1.getNextIndex();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
    }
}

