package org.apache.commons.math4.legacy.core.dfp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DfpMathRegressionTest0 {

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
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test001");
        org.apache.commons.math4.legacy.core.dfp.DfpField dfpField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.split(dfpField0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.DfpField.getRadixDigits()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test002");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.split(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getRadixDigits()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test003");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.expInternal(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test004");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.sinInternal(dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test005");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.cosInternal(dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"a[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test006");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.sinInternal(dfpArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test007");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test008");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.logInternal(dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.divide(int)\" because \"a[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test009");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test010");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.cosInternal(dfpArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test011");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.exp(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.rint()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test012");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.atan(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getField()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test013");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.log(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getZero()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test014");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.tan(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getField()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test015");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.sin(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getField()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test016");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.asin(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test017");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test018");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray0, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
        org.junit.Assert.assertNotNull(dfpArray2);
        org.junit.Assert.assertArrayEquals(dfpArray2, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test019");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.atanInternal(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"mant\" because \"d\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test020");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.cos(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getField()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test021");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test022");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, dfp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getField()\" because \"x\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test023");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test024");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test025");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.logInternal(dfpArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test026");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray1, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getZero()\" because \"a[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
        org.junit.Assert.assertNotNull(dfpArray2);
        org.junit.Assert.assertArrayEquals(dfpArray2, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test027");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test028");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test029");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test030");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test031");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray4 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray1, dfpArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.divide(org.apache.commons.math4.legacy.core.dfp.Dfp)\" because \"a[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
        org.junit.Assert.assertNotNull(dfpArray3);
        org.junit.Assert.assertArrayEquals(dfpArray3, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test032");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.acos(dfp0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getZero()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test033");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test034");
        org.apache.commons.math4.legacy.core.dfp.DfpField dfpField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.split(dfpField0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.DfpField.newDfp(String)\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test035");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test036");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test037");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test038");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray0, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
        org.junit.Assert.assertNotNull(dfpArray2);
        org.junit.Assert.assertArrayEquals(dfpArray2, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test039");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.sinInternal(dfpArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test040");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test041");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test042");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray1, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
        org.junit.Assert.assertNotNull(dfpArray2);
        org.junit.Assert.assertArrayEquals(dfpArray2, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test043");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray4 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray1, dfpArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getZero()\" because \"a[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
        org.junit.Assert.assertNotNull(dfpArray3);
        org.junit.Assert.assertArrayEquals(dfpArray3, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test044");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test045");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test046");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test047");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test048");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test049");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test050");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test051");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test052");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test053");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray0, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray2);
        org.junit.Assert.assertArrayEquals(dfpArray2, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test054");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test055");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test056");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test057");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test058");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test059");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test060");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test061");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test062");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test063");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test064");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test065");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test066");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test067");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test068");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test069");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray0, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray2);
        org.junit.Assert.assertArrayEquals(dfpArray2, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test070");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test071");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.cosInternal(dfpArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test072");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test073");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test074");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test075");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test076");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray1, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getZero()\" because \"a[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test077");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test078");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test079");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test080");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test081");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test082");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test083");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test084");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test085");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test086");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test087");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test088");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = org.apache.commons.math4.legacy.core.dfp.DfpMath.logInternal(dfpArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test089");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test090");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test091");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test092");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test093");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.pow(dfp0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test094");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test095");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test096");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray1, dfpArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"b\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test097");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test098");
        org.apache.commons.math4.legacy.core.dfp.Dfp dfp0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] { dfp0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp3 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.math4.legacy.core.dfp.Dfp.getOne()\" because \"base[0]\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray1);
        org.junit.Assert.assertArrayEquals(dfpArray1, new org.apache.commons.math4.legacy.core.dfp.Dfp[] { null });
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test099");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test100");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test101");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test102");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test103");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test104");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test105");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test106");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitDiv(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test107");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = new org.apache.commons.math4.legacy.core.dfp.Dfp[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dfpArray0);
        org.junit.Assert.assertArrayEquals(dfpArray0, new org.apache.commons.math4.legacy.core.dfp.Dfp[] {});
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test108");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test109");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test110");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test111");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test112");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test113");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test114");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test115");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test116");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test117");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp dfp2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitPow(dfpArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"base\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DfpMathRegressionTest0.test118");
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray0 = null;
        org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math4.legacy.core.dfp.Dfp[] dfpArray2 = org.apache.commons.math4.legacy.core.dfp.DfpMath.splitMult(dfpArray0, dfpArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

