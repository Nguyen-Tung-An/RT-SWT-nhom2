package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtendedBufferedReaderRegressionTest0 {

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
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0001");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0002");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0003");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = extendedBufferedReader2.transferTo(writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0004");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0005");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0006");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = extendedBufferedReader1.transferTo(writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0007");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0008");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray6 = new char[] { '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.read(charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', '#' });
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0009");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0010");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0011");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0012");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader1.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0013");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader1.read(charArray10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#' });
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0014");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0015");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        char[] charArray6 = new char[] { '#', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.peek(charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', ' ' });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0016");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0017");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0018");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        char[] charArray12 = new char[] { '#', 'a', '#', '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedBufferedReader1.read(charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', 'a', '#', '4', 'a', '4' });
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0019");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        char[] charArray6 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.read(charArray6, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 97) out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', 'a' });
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0020");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0021");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        java.nio.CharBuffer charBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = reader0.read(charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0022");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0023");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = extendedBufferedReader2.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0024");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0025");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0026");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.lang.Class<?> wildcardClass6 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0027");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.Class<?> wildcardClass8 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0028");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        java.lang.Class<?> wildcardClass4 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0029");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        java.lang.Class<?> wildcardClass4 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0030");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0031");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0032");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        int int3 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0033");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader1.transferTo(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0034");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        java.lang.Class<?> wildcardClass5 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0035");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0036");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0037");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader7.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0038");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0039");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        long long6 = extendedBufferedReader5.getPosition();
        char[] charArray13 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int16 = extendedBufferedReader5.read(charArray13, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedBufferedReader1.peek(charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0040");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = extendedBufferedReader1.transferTo(writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0041");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0042");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = extendedBufferedReader1.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0043");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0044");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        java.nio.CharBuffer charBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.read(charBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0045");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0046");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        java.nio.CharBuffer charBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.read(charBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0047");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader1.transferTo(writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0048");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader1.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0049");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = extendedBufferedReader2.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0050");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = extendedBufferedReader1.transferTo(writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0051");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        char[] charArray8 = new char[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader1.read(charArray8, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [52, 52 + -1) out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '4' });
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0052");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0053");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0054");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = extendedBufferedReader2.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0055");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        char[] charArray14 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int17 = extendedBufferedReader6.read(charArray14, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader1.read(charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0056");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = extendedBufferedReader1.transferTo(writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0057");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getPosition();
        char[] charArray16 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int19 = extendedBufferedReader8.read(charArray16, (int) (byte) 1, (int) (byte) 0);
        long long20 = extendedBufferedReader8.getPosition();
        java.io.Reader reader21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        long long23 = extendedBufferedReader22.getPosition();
        char[] charArray30 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int33 = extendedBufferedReader22.read(charArray30, (int) (byte) 1, (int) (byte) 0);
        int int36 = extendedBufferedReader8.read(charArray30, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = extendedBufferedReader1.peek(charArray30);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0058");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        java.lang.Class<?> wildcardClass10 = extendedBufferedReader7.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0059");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = extendedBufferedReader1.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0060");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0061");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0062");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0063");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0064");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0065");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader1.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0066");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0067");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        java.nio.CharBuffer charBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader1.read(charBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0068");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0069");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        boolean boolean10 = extendedBufferedReader7.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0070");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0071");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0072");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader2.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0073");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        char[] charArray18 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int21 = extendedBufferedReader10.read(charArray18, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = extendedBufferedReader7.read(charArray18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0074");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getBytesRead();
        extendedBufferedReader6.setClosed(false);
        long long10 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.mark((int) (byte) 10);
        boolean boolean13 = extendedBufferedReader6.isClosed();
        extendedBufferedReader6.mark((int) (short) 0);
        char[] charArray20 = new char[] { 'a', ' ', '4', '4' };
        int int23 = extendedBufferedReader6.read(charArray20, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = extendedBufferedReader1.read(charArray20, (-2), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-2, -2 + 10) out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0075");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        java.lang.Class<?> wildcardClass5 = extendedBufferedReader2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0076");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        boolean boolean6 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0077");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0078");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0079");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0080");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0081");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0082");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader8.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0083");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0084");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0085");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        char[] charArray17 = new char[] { '#', ' ', ' ', '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedBufferedReader7.read(charArray17, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', ' ', ' ', '#', 'a', 'a' });
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0086");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getBytesRead();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = extendedBufferedReader1.transferTo(writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0087");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        int int12 = extendedBufferedReader11.getLastChar();
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        long long15 = extendedBufferedReader14.getPosition();
        char[] charArray22 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int25 = extendedBufferedReader14.read(charArray22, (int) (byte) 1, (int) (byte) 0);
        int int28 = extendedBufferedReader11.read(charArray22, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = extendedBufferedReader1.read(charArray22, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + -1) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0088");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.Class<?> wildcardClass2 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0089");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getPosition();
        char[] charArray16 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int19 = extendedBufferedReader8.read(charArray16, (int) (byte) 1, (int) (byte) 0);
        long long20 = extendedBufferedReader8.getPosition();
        java.io.Reader reader21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        long long23 = extendedBufferedReader22.getPosition();
        char[] charArray30 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int33 = extendedBufferedReader22.read(charArray30, (int) (byte) 1, (int) (byte) 0);
        int int36 = extendedBufferedReader8.read(charArray30, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = extendedBufferedReader1.read(charArray30, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + -1) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0090");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0091");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getPosition();
        long long14 = extendedBufferedReader12.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        boolean boolean16 = extendedBufferedReader12.markSupported();
        long long17 = extendedBufferedReader12.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        long long21 = extendedBufferedReader20.getBytesRead();
        extendedBufferedReader20.setClosed(false);
        long long24 = extendedBufferedReader20.getLineNumber();
        extendedBufferedReader20.mark((int) (byte) 10);
        boolean boolean27 = extendedBufferedReader20.isClosed();
        extendedBufferedReader20.mark((int) (short) 0);
        char[] charArray34 = new char[] { 'a', ' ', '4', '4' };
        int int37 = extendedBufferedReader20.read(charArray34, 0, 0);
        int int40 = extendedBufferedReader12.read(charArray34, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = extendedBufferedReader7.read(charArray34, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 10) out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0092");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader4.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0093");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0094");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        boolean boolean19 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0095");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedBufferedReader8.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0096");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0097");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0098");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long4 = extendedBufferedReader3.getPosition();
        java.lang.Class<?> wildcardClass5 = extendedBufferedReader3.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0099");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = extendedBufferedReader1.skip((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0100");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getPosition();
        char[] charArray17 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int20 = extendedBufferedReader9.read(charArray17, (int) (byte) 1, (int) (byte) 0);
        long long21 = extendedBufferedReader9.getPosition();
        java.io.Reader reader22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        long long24 = extendedBufferedReader23.getPosition();
        char[] charArray31 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int34 = extendedBufferedReader23.read(charArray31, (int) (byte) 1, (int) (byte) 0);
        int int37 = extendedBufferedReader9.read(charArray31, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = extendedBufferedReader1.read(charArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0101");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0102");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0103");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0104");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0105");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        char[] charArray14 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int17 = extendedBufferedReader6.read(charArray14, (int) (byte) 1, (int) (byte) 0);
        int int20 = extendedBufferedReader1.read(charArray14, (-2), (int) (byte) 0);
        extendedBufferedReader1.close();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0106");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0107");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0108");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0109");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader1.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0110");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        long long21 = extendedBufferedReader20.getBytesRead();
        extendedBufferedReader20.setClosed(false);
        long long24 = extendedBufferedReader20.getLineNumber();
        extendedBufferedReader20.mark((int) (byte) 10);
        boolean boolean27 = extendedBufferedReader20.isClosed();
        extendedBufferedReader20.mark((int) (short) 0);
        char[] charArray34 = new char[] { 'a', ' ', '4', '4' };
        int int37 = extendedBufferedReader20.read(charArray34, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = extendedBufferedReader1.read(charArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0111");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader8.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0112");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.read(charArray6, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [52, 52 + 10) out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0113");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        char[] charArray23 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int26 = extendedBufferedReader15.read(charArray23, (int) (byte) 1, (int) (byte) 0);
        int int29 = extendedBufferedReader1.read(charArray23, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0114");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = extendedBufferedReader16.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0115");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0116");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.isClosed();
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.read(charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', 'a' });
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0117");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = extendedBufferedReader1.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0118");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0119");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        boolean boolean6 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0120");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        long long20 = extendedBufferedReader19.getPosition();
        char[] charArray27 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int30 = extendedBufferedReader19.read(charArray27, (int) (byte) 1, (int) (byte) 0);
        long long31 = extendedBufferedReader19.getPosition();
        java.io.Reader reader32 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader(reader32);
        long long34 = extendedBufferedReader33.getPosition();
        char[] charArray41 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int44 = extendedBufferedReader33.read(charArray41, (int) (byte) 1, (int) (byte) 0);
        int int47 = extendedBufferedReader19.read(charArray41, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = extendedBufferedReader1.peek(charArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0121");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        long long8 = extendedBufferedReader6.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean10 = extendedBufferedReader6.markSupported();
        long long11 = extendedBufferedReader6.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        long long15 = extendedBufferedReader14.getBytesRead();
        extendedBufferedReader14.setClosed(false);
        long long18 = extendedBufferedReader14.getLineNumber();
        extendedBufferedReader14.mark((int) (byte) 10);
        boolean boolean21 = extendedBufferedReader14.isClosed();
        extendedBufferedReader14.mark((int) (short) 0);
        char[] charArray28 = new char[] { 'a', ' ', '4', '4' };
        int int31 = extendedBufferedReader14.read(charArray28, 0, 0);
        int int34 = extendedBufferedReader6.read(charArray28, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = extendedBufferedReader2.peek(charArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0122");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int17 = extendedBufferedReader16.getLastChar();
        java.io.Reader reader18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        long long20 = extendedBufferedReader19.getPosition();
        char[] charArray27 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int30 = extendedBufferedReader19.read(charArray27, (int) (byte) 1, (int) (byte) 0);
        int int33 = extendedBufferedReader16.read(charArray27, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = extendedBufferedReader1.read(charArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0123");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0124");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader1.transferTo(writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0125");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0126");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0127");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0128");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0129");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        char[] charArray18 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int21 = extendedBufferedReader10.read(charArray18, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = extendedBufferedReader1.read(charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0130");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        long long12 = extendedBufferedReader10.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        boolean boolean14 = extendedBufferedReader10.markSupported();
        long long15 = extendedBufferedReader10.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        java.io.Reader reader17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        long long19 = extendedBufferedReader18.getBytesRead();
        extendedBufferedReader18.setClosed(false);
        long long22 = extendedBufferedReader18.getLineNumber();
        extendedBufferedReader18.mark((int) (byte) 10);
        boolean boolean25 = extendedBufferedReader18.isClosed();
        extendedBufferedReader18.mark((int) (short) 0);
        char[] charArray32 = new char[] { 'a', ' ', '4', '4' };
        int int35 = extendedBufferedReader18.read(charArray32, 0, 0);
        int int38 = extendedBufferedReader10.read(charArray32, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = extendedBufferedReader1.peek(charArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0131");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0132");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader8.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0133");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0134");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) (short) 1);
        long long15 = extendedBufferedReader1.getLineNumber();
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = extendedBufferedReader1.transferTo(writer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0135");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = extendedBufferedReader6.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0136");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0137");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader7.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0138");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long17 = extendedBufferedReader16.getPosition();
        int int18 = extendedBufferedReader16.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader16.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0139");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0140");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0141");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0142");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        java.nio.CharBuffer charBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = extendedBufferedReader1.read(charBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0143");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader7.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0144");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0145");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        long long5 = extendedBufferedReader2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0146");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0147");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0148");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        int int15 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0149");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0150");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        char[] charArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader1.peek(charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"buf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0151");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long17 = extendedBufferedReader16.getPosition();
        java.io.Reader reader18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        long long20 = extendedBufferedReader19.getBytesRead();
        extendedBufferedReader19.setClosed(false);
        long long23 = extendedBufferedReader19.getLineNumber();
        extendedBufferedReader19.mark((int) (byte) 10);
        boolean boolean26 = extendedBufferedReader19.isClosed();
        extendedBufferedReader19.mark((int) (short) 0);
        char[] charArray33 = new char[] { 'a', ' ', '4', '4' };
        int int36 = extendedBufferedReader19.read(charArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = extendedBufferedReader16.read(charArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0152");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        java.lang.Class<?> wildcardClass11 = extendedBufferedReader7.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0153");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0154");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset7, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0155");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        boolean boolean19 = extendedBufferedReader1.markSupported();
        char[] charArray25 = new char[] { 'a', ' ', ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int int28 = extendedBufferedReader1.read(charArray25, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 10) out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', ' ', ' ', '#', ' ' });
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0156");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        int int29 = extendedBufferedReader1.read(charArray23, 0, 0);
        boolean boolean30 = extendedBufferedReader1.markSupported();
        java.io.Writer writer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long32 = extendedBufferedReader1.transferTo(writer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0157");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        long long21 = extendedBufferedReader20.getBytesRead();
        extendedBufferedReader20.setClosed(true);
        java.io.Reader reader24 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        long long26 = extendedBufferedReader25.getPosition();
        char[] charArray33 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int36 = extendedBufferedReader25.read(charArray33, (int) (byte) 1, (int) (byte) 0);
        int int39 = extendedBufferedReader20.read(charArray33, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = extendedBufferedReader1.peek(charArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0158");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0159");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader1.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0160");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset7, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedBufferedReader9.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0161");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        long long6 = extendedBufferedReader5.getBytesRead();
        extendedBufferedReader5.setClosed(true);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        char[] charArray18 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int21 = extendedBufferedReader10.read(charArray18, (int) (byte) 1, (int) (byte) 0);
        int int24 = extendedBufferedReader5.read(charArray18, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedBufferedReader3.read(charArray18, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [52, 52 + 35) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0162");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0163");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        java.nio.CharBuffer charBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.read(charBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0164");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader1.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0165");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0166");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader2.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0167");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.setClosed(true);
        long long11 = extendedBufferedReader1.getPosition();
        char[] charArray18 = new char[] { ' ', '4', ' ', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader1.peek(charArray18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', '4', ' ', ' ', 'a', '4' });
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0168");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0169");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getPosition();
        java.lang.Class<?> wildcardClass4 = extendedBufferedReader2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0170");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        char[] charArray14 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int17 = extendedBufferedReader6.read(charArray14, (int) (byte) 1, (int) (byte) 0);
        long long18 = extendedBufferedReader6.getPosition();
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        long long21 = extendedBufferedReader20.getPosition();
        char[] charArray28 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int31 = extendedBufferedReader20.read(charArray28, (int) (byte) 1, (int) (byte) 0);
        int int34 = extendedBufferedReader6.read(charArray28, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = extendedBufferedReader2.peek(charArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0171");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long5 = extendedBufferedReader4.getPosition();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        int int9 = extendedBufferedReader8.getLastChar();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getPosition();
        char[] charArray19 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int22 = extendedBufferedReader11.read(charArray19, (int) (byte) 1, (int) (byte) 0);
        int int25 = extendedBufferedReader8.read(charArray19, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = extendedBufferedReader4.read(charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0172");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long4 = extendedBufferedReader3.getPosition();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader3, charset5, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0173");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (short) 10);
        char[] charArray11 = new char[] { '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader1.read(charArray11, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + -1) out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#' });
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0174");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        char[] charArray23 = new char[] { '#', ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int24 = extendedBufferedReader1.read(charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#', ' ', 'a', '#' });
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0175");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.skip((long) 0);
        long long7 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        boolean boolean14 = extendedBufferedReader9.markSupported();
        long long15 = extendedBufferedReader9.getBytesRead();
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getBytesRead();
        extendedBufferedReader17.setClosed(true);
        java.io.Reader reader21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        long long23 = extendedBufferedReader22.getPosition();
        char[] charArray30 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int33 = extendedBufferedReader22.read(charArray30, (int) (byte) 1, (int) (byte) 0);
        int int36 = extendedBufferedReader17.read(charArray30, (-2), (int) (byte) 0);
        int int39 = extendedBufferedReader9.read(charArray30, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = extendedBufferedReader1.read(charArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0176");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0177");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.CharBuffer charBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader7.read(charBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0178");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader9.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0179");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0180");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.CharBuffer charBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader1.read(charBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0181");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        long long10 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.close();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0182");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0183");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        java.nio.CharBuffer charBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader7.read(charBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0184");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getBytesRead();
        boolean boolean4 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0185");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getBytesRead();
        extendedBufferedReader10.setClosed(false);
        long long14 = extendedBufferedReader10.getLineNumber();
        extendedBufferedReader10.mark((int) (byte) 10);
        boolean boolean17 = extendedBufferedReader10.isClosed();
        extendedBufferedReader10.mark((int) (short) 0);
        char[] charArray24 = new char[] { 'a', ' ', '4', '4' };
        int int27 = extendedBufferedReader10.read(charArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = extendedBufferedReader8.read(charArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0186");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset6, true);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        long long12 = extendedBufferedReader10.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        boolean boolean14 = extendedBufferedReader10.markSupported();
        long long15 = extendedBufferedReader10.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        java.io.Reader reader17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        long long19 = extendedBufferedReader18.getBytesRead();
        extendedBufferedReader18.setClosed(false);
        long long22 = extendedBufferedReader18.getLineNumber();
        extendedBufferedReader18.mark((int) (byte) 10);
        boolean boolean25 = extendedBufferedReader18.isClosed();
        extendedBufferedReader18.mark((int) (short) 0);
        char[] charArray32 = new char[] { 'a', ' ', '4', '4' };
        int int35 = extendedBufferedReader18.read(charArray32, 0, 0);
        int int38 = extendedBufferedReader10.read(charArray32, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = extendedBufferedReader8.read(charArray32, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + -1) out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0187");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0188");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0189");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long10 = extendedBufferedReader9.getPosition();
        java.nio.CharBuffer charBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader9.read(charBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0190");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        long long10 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.close();
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedBufferedReader7.transferTo(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0191");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0192");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.Class<?> wildcardClass8 = extendedBufferedReader7.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0193");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = extendedBufferedReader2.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0194");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0195");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        long long10 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.close();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0196");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader6.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0197");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader9.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0198");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = extendedBufferedReader1.transferTo(writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0199");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0200");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader8.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0201");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0202");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        long long5 = extendedBufferedReader2.getPosition();
        long long6 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0203");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        long long10 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.close();
        long long12 = extendedBufferedReader7.getPosition();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0204");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getBytesRead();
        extendedBufferedReader6.setClosed(false);
        long long10 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.mark((int) (byte) 10);
        boolean boolean13 = extendedBufferedReader6.isClosed();
        extendedBufferedReader6.mark((int) (short) 0);
        char[] charArray20 = new char[] { 'a', ' ', '4', '4' };
        int int23 = extendedBufferedReader6.read(charArray20, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = extendedBufferedReader2.read(charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0205");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getPosition();
        char[] charArray19 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int22 = extendedBufferedReader11.read(charArray19, (int) (byte) 1, (int) (byte) 0);
        long long23 = extendedBufferedReader11.getPosition();
        java.io.Reader reader24 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        long long26 = extendedBufferedReader25.getPosition();
        char[] charArray33 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int36 = extendedBufferedReader25.read(charArray33, (int) (byte) 1, (int) (byte) 0);
        int int39 = extendedBufferedReader11.read(charArray33, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = extendedBufferedReader9.read(charArray33, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 1) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0206");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = extendedBufferedReader2.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0207");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader8.setClosed(true);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedBufferedReader8.transferTo(writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0208");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        java.lang.Class<?> wildcardClass13 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0209");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        java.lang.Class<?> wildcardClass9 = extendedBufferedReader8.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0210");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0211");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        boolean boolean5 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0212");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        boolean boolean14 = extendedBufferedReader9.markSupported();
        long long15 = extendedBufferedReader9.getBytesRead();
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getBytesRead();
        extendedBufferedReader17.setClosed(true);
        java.io.Reader reader21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        long long23 = extendedBufferedReader22.getPosition();
        char[] charArray30 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int33 = extendedBufferedReader22.read(charArray30, (int) (byte) 1, (int) (byte) 0);
        int int36 = extendedBufferedReader17.read(charArray30, (-2), (int) (byte) 0);
        int int39 = extendedBufferedReader9.read(charArray30, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = extendedBufferedReader1.read(charArray30);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0213");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.setClosed(true);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getPosition();
        char[] charArray20 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int23 = extendedBufferedReader12.read(charArray20, (int) (byte) 1, (int) (byte) 0);
        int int26 = extendedBufferedReader7.read(charArray20, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedBufferedReader5.peek(charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0214");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getPosition();
        char[] charArray25 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int28 = extendedBufferedReader17.read(charArray25, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = extendedBufferedReader1.read(charArray25, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0215");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long5 = extendedBufferedReader4.getPosition();
        extendedBufferedReader4.setClosed(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0216");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean10 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0217");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        int int8 = extendedBufferedReader7.getLastChar();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        char[] charArray18 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int21 = extendedBufferedReader10.read(charArray18, (int) (byte) 1, (int) (byte) 0);
        int int24 = extendedBufferedReader7.read(charArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedBufferedReader4.read(charArray18, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 35) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0218");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0219");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0220");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0221");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader8.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0222");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        long long6 = extendedBufferedReader5.getLineNumber();
        int int7 = extendedBufferedReader5.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader5.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0223");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        long long15 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0224");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean10 = extendedBufferedReader1.markSupported();
        long long11 = extendedBufferedReader1.getPosition();
        java.nio.CharBuffer charBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedBufferedReader1.read(charBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0225");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        int int3 = extendedBufferedReader1.getLastChar();
        java.io.Reader reader4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        long long6 = extendedBufferedReader5.getBytesRead();
        extendedBufferedReader5.setClosed(false);
        long long9 = extendedBufferedReader5.getLineNumber();
        extendedBufferedReader5.mark((int) (byte) 10);
        boolean boolean12 = extendedBufferedReader5.isClosed();
        extendedBufferedReader5.mark((int) (short) 0);
        char[] charArray19 = new char[] { 'a', ' ', '4', '4' };
        int int22 = extendedBufferedReader5.read(charArray19, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedBufferedReader1.peek(charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0226");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0227");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0228");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0229");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        int int15 = extendedBufferedReader1.getLastChar();
        java.nio.CharBuffer charBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedBufferedReader1.read(charBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0230");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) (short) 1);
        long long15 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedBufferedReader16.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0231");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = extendedBufferedReader7.transferTo(writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0232");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.skip((long) 0);
        long long7 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0233");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        long long21 = extendedBufferedReader20.getPosition();
        char[] charArray28 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int31 = extendedBufferedReader20.read(charArray28, (int) (byte) 1, (int) (byte) 0);
        long long32 = extendedBufferedReader20.getPosition();
        java.io.Reader reader33 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader(reader33);
        long long35 = extendedBufferedReader34.getPosition();
        char[] charArray42 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int45 = extendedBufferedReader34.read(charArray42, (int) (byte) 1, (int) (byte) 0);
        int int48 = extendedBufferedReader20.read(charArray42, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = extendedBufferedReader1.read(charArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0234");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader2.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0235");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        int int5 = extendedBufferedReader2.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0236");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0237");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader9.mark(0);
        long long13 = extendedBufferedReader9.skip((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0238");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        char[] charArray14 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int17 = extendedBufferedReader6.read(charArray14, (int) (byte) 1, (int) (byte) 0);
        int int20 = extendedBufferedReader1.read(charArray14, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0239");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader9.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0240");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader3.mark(0);
        extendedBufferedReader3.mark((int) ' ');
        long long8 = extendedBufferedReader3.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0241");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getBytesRead();
        boolean boolean4 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0242");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        long long13 = extendedBufferedReader7.getPosition();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        char[] charArray23 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int26 = extendedBufferedReader15.read(charArray23, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedBufferedReader7.peek(charArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0243");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.mark(100);
        boolean boolean8 = extendedBufferedReader2.markSupported();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getBytesRead();
        extendedBufferedReader10.setClosed(false);
        long long14 = extendedBufferedReader10.getLineNumber();
        boolean boolean15 = extendedBufferedReader10.markSupported();
        long long16 = extendedBufferedReader10.getBytesRead();
        java.io.Reader reader17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        long long19 = extendedBufferedReader18.getBytesRead();
        extendedBufferedReader18.setClosed(true);
        java.io.Reader reader22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        long long24 = extendedBufferedReader23.getPosition();
        char[] charArray31 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int34 = extendedBufferedReader23.read(charArray31, (int) (byte) 1, (int) (byte) 0);
        int int37 = extendedBufferedReader18.read(charArray31, (-2), (int) (byte) 0);
        int int40 = extendedBufferedReader10.read(charArray31, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = extendedBufferedReader2.peek(charArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0244");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.mark(100);
        boolean boolean8 = extendedBufferedReader2.markSupported();
        java.lang.Class<?> wildcardClass9 = extendedBufferedReader2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0245");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        long long6 = extendedBufferedReader5.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader5.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0246");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0247");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0248");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = extendedBufferedReader2.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0249");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getPosition();
        char[] charArray15 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int18 = extendedBufferedReader7.read(charArray15, (int) (byte) 1, (int) (byte) 0);
        long long19 = extendedBufferedReader7.getPosition();
        java.io.Reader reader20 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        long long22 = extendedBufferedReader21.getPosition();
        char[] charArray29 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int32 = extendedBufferedReader21.read(charArray29, (int) (byte) 1, (int) (byte) 0);
        int int35 = extendedBufferedReader7.read(charArray29, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = extendedBufferedReader1.peek(charArray29);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0250");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = extendedBufferedReader7.transferTo(writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0251");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        boolean boolean7 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0252");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader1.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0253");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader7.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0254");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        int int5 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader1.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0255");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0256");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (short) 10);
        boolean boolean9 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0257");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0258");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        long long4 = extendedBufferedReader2.getBytesRead();
        java.lang.Class<?> wildcardClass5 = extendedBufferedReader2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0259");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        long long4 = extendedBufferedReader1.getBytesRead();
        int int5 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0260");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader1.skip((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0261");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0262");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long10 = extendedBufferedReader9.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0263");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean9 = extendedBufferedReader1.markSupported();
        java.nio.CharBuffer charBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader1.read(charBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0264");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader1.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0265");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        java.nio.CharBuffer charBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader7.read(charBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0266");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        java.nio.CharBuffer charBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader1.read(charBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0267");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        int int5 = extendedBufferedReader2.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0268");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) (short) 1);
        long long15 = extendedBufferedReader1.getLineNumber();
        boolean boolean16 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0269");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader9.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = extendedBufferedReader9.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0270");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader15.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0271");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        java.lang.Class<?> wildcardClass5 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0272");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.close();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.mark(100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0273");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        long long6 = extendedBufferedReader1.getBytesRead();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getPosition();
        long long10 = extendedBufferedReader8.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        boolean boolean12 = extendedBufferedReader8.markSupported();
        long long13 = extendedBufferedReader8.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.io.Reader reader15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        long long17 = extendedBufferedReader16.getBytesRead();
        extendedBufferedReader16.setClosed(false);
        long long20 = extendedBufferedReader16.getLineNumber();
        extendedBufferedReader16.mark((int) (byte) 10);
        boolean boolean23 = extendedBufferedReader16.isClosed();
        extendedBufferedReader16.mark((int) (short) 0);
        char[] charArray30 = new char[] { 'a', ' ', '4', '4' };
        int int33 = extendedBufferedReader16.read(charArray30, 0, 0);
        int int36 = extendedBufferedReader8.read(charArray30, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = extendedBufferedReader1.read(charArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0274");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader1.mark((int) (byte) 0);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader1.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0275");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = extendedBufferedReader1.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0276");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        long long11 = extendedBufferedReader7.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader7.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0277");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader7.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0278");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0279");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        char[] charArray14 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int17 = extendedBufferedReader6.read(charArray14, (int) (byte) 1, (int) (byte) 0);
        int int20 = extendedBufferedReader1.read(charArray14, (-2), (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = charArray14.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0280");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader7.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0281");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0282");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0283");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        long long9 = extendedBufferedReader8.getPosition();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        int int13 = extendedBufferedReader12.getLastChar();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        char[] charArray23 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int26 = extendedBufferedReader15.read(charArray23, (int) (byte) 1, (int) (byte) 0);
        int int29 = extendedBufferedReader12.read(charArray23, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = extendedBufferedReader8.peek(charArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0284");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        extendedBufferedReader7.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0285");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        char[] charArray15 = new char[] { 'a', ' ', '4', '4' };
        int int18 = extendedBufferedReader1.read(charArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = extendedBufferedReader1.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0286");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long5 = extendedBufferedReader4.getPosition();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.setClosed(true);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getPosition();
        char[] charArray20 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int23 = extendedBufferedReader12.read(charArray20, (int) (byte) 1, (int) (byte) 0);
        int int26 = extendedBufferedReader7.read(charArray20, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedBufferedReader4.peek(charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0287");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.io.Reader reader2 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader(reader2);
        long long4 = extendedBufferedReader3.getBytesRead();
        extendedBufferedReader3.setClosed(false);
        long long7 = extendedBufferedReader3.getLineNumber();
        extendedBufferedReader3.mark((int) (byte) 10);
        boolean boolean10 = extendedBufferedReader3.isClosed();
        extendedBufferedReader3.mark((int) (short) 0);
        char[] charArray17 = new char[] { 'a', ' ', '4', '4' };
        int int20 = extendedBufferedReader3.read(charArray17, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedBufferedReader1.peek(charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0288");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader1.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0289");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0290");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0291");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0292");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0293");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getBytesRead();
        extendedBufferedReader8.setClosed(false);
        long long12 = extendedBufferedReader8.getLineNumber();
        boolean boolean13 = extendedBufferedReader8.markSupported();
        long long14 = extendedBufferedReader8.getBytesRead();
        java.io.Reader reader15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        long long17 = extendedBufferedReader16.getBytesRead();
        extendedBufferedReader16.setClosed(true);
        java.io.Reader reader20 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        long long22 = extendedBufferedReader21.getPosition();
        char[] charArray29 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int32 = extendedBufferedReader21.read(charArray29, (int) (byte) 1, (int) (byte) 0);
        int int35 = extendedBufferedReader16.read(charArray29, (-2), (int) (byte) 0);
        int int38 = extendedBufferedReader8.read(charArray29, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = extendedBufferedReader1.read(charArray29, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + -1) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0294");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset5, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0295");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.setClosed(true);
        boolean boolean11 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0296");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader1.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0297");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0298");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getBytesRead();
        extendedBufferedReader12.setClosed(false);
        long long16 = extendedBufferedReader12.getLineNumber();
        extendedBufferedReader12.mark((int) (byte) 10);
        boolean boolean19 = extendedBufferedReader12.isClosed();
        extendedBufferedReader12.mark((int) (short) 0);
        char[] charArray26 = new char[] { 'a', ' ', '4', '4' };
        int int29 = extendedBufferedReader12.read(charArray26, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = extendedBufferedReader8.read(charArray26, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0299");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        boolean boolean6 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0300");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedBufferedReader7.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0301");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0302");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader1.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0303");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        int int3 = extendedBufferedReader1.getLastChar();
        long long4 = extendedBufferedReader1.getLineNumber();
        long long5 = extendedBufferedReader1.getBytesRead();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader1.transferTo(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0304");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.skip((long) 0);
        long long7 = extendedBufferedReader1.getPosition();
        java.lang.Class<?> wildcardClass8 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0305");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = extendedBufferedReader10.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0306");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader2.transferTo(writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0307");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader1.getPosition();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0308");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        java.nio.CharBuffer charBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.read(charBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0309");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        int int5 = extendedBufferedReader1.getLastChar();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getPosition();
        char[] charArray15 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int18 = extendedBufferedReader7.read(charArray15, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader1.peek(charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0310");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getPosition();
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset10, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedBufferedReader12.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0311");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        int int15 = extendedBufferedReader1.getLastChar();
        long long16 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0312");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0313");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader8.setClosed(true);
        int int11 = extendedBufferedReader8.getLastChar();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0314");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0315");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0316");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.setClosed(true);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        boolean boolean9 = extendedBufferedReader1.isClosed();
        java.nio.CharBuffer charBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader1.read(charBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0317");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset7, true);
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset10, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0318");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getPosition();
        long long11 = extendedBufferedReader9.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        boolean boolean13 = extendedBufferedReader9.markSupported();
        long long14 = extendedBufferedReader9.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getBytesRead();
        extendedBufferedReader17.setClosed(false);
        long long21 = extendedBufferedReader17.getLineNumber();
        extendedBufferedReader17.mark((int) (byte) 10);
        boolean boolean24 = extendedBufferedReader17.isClosed();
        extendedBufferedReader17.mark((int) (short) 0);
        char[] charArray31 = new char[] { 'a', ' ', '4', '4' };
        int int34 = extendedBufferedReader17.read(charArray31, 0, 0);
        int int37 = extendedBufferedReader9.read(charArray31, 0, 0);
        int int40 = extendedBufferedReader1.read(charArray31, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0319");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        boolean boolean5 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0320");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader3.mark(0);
        extendedBufferedReader3.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader3.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0321");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getPosition();
        char[] charArray17 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int20 = extendedBufferedReader9.read(charArray17, (int) (byte) 1, (int) (byte) 0);
        long long21 = extendedBufferedReader9.getPosition();
        java.io.Reader reader22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        long long24 = extendedBufferedReader23.getPosition();
        char[] charArray31 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int34 = extendedBufferedReader23.read(charArray31, (int) (byte) 1, (int) (byte) 0);
        int int37 = extendedBufferedReader9.read(charArray31, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = extendedBufferedReader2.read(charArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0322");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        long long11 = extendedBufferedReader7.getLineNumber();
        java.io.Reader reader12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        int int15 = extendedBufferedReader14.getLastChar();
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getPosition();
        char[] charArray25 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int28 = extendedBufferedReader17.read(charArray25, (int) (byte) 1, (int) (byte) 0);
        int int31 = extendedBufferedReader14.read(charArray25, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = extendedBufferedReader7.peek(charArray25);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0323");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        boolean boolean7 = extendedBufferedReader1.markSupported();
        java.lang.Class<?> wildcardClass8 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0324");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        long long10 = extendedBufferedReader1.getLineNumber();
        java.nio.CharBuffer charBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader1.read(charBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0325");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.io.Reader reader4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        long long6 = extendedBufferedReader5.getPosition();
        char[] charArray13 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int16 = extendedBufferedReader5.read(charArray13, (int) (byte) 1, (int) (byte) 0);
        int int19 = extendedBufferedReader2.read(charArray13, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0326");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset6, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0327");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        extendedBufferedReader7.close();
        java.io.Reader reader12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        long long14 = extendedBufferedReader13.getBytesRead();
        extendedBufferedReader13.setClosed(false);
        long long17 = extendedBufferedReader13.getLineNumber();
        extendedBufferedReader13.mark((int) (byte) 10);
        boolean boolean20 = extendedBufferedReader13.isClosed();
        extendedBufferedReader13.mark((int) (short) 0);
        char[] charArray27 = new char[] { 'a', ' ', '4', '4' };
        int int30 = extendedBufferedReader13.read(charArray27, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = extendedBufferedReader7.read(charArray27, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0328");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0329");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getPosition();
        long long11 = extendedBufferedReader9.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        boolean boolean13 = extendedBufferedReader9.markSupported();
        long long14 = extendedBufferedReader9.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getBytesRead();
        extendedBufferedReader17.setClosed(false);
        long long21 = extendedBufferedReader17.getLineNumber();
        extendedBufferedReader17.mark((int) (byte) 10);
        boolean boolean24 = extendedBufferedReader17.isClosed();
        extendedBufferedReader17.mark((int) (short) 0);
        char[] charArray31 = new char[] { 'a', ' ', '4', '4' };
        int int34 = extendedBufferedReader17.read(charArray31, 0, 0);
        int int37 = extendedBufferedReader9.read(charArray31, 0, 0);
        int int40 = extendedBufferedReader1.read(charArray31, (int) (byte) 10, (int) (short) 0);
        java.io.Reader reader41 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader42 = new org.apache.commons.csv.ExtendedBufferedReader(reader41);
        long long43 = extendedBufferedReader42.getPosition();
        long long44 = extendedBufferedReader42.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader42);
        boolean boolean46 = extendedBufferedReader42.markSupported();
        long long47 = extendedBufferedReader42.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader42);
        java.io.Reader reader49 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader49);
        long long51 = extendedBufferedReader50.getBytesRead();
        extendedBufferedReader50.setClosed(false);
        long long54 = extendedBufferedReader50.getLineNumber();
        extendedBufferedReader50.mark((int) (byte) 10);
        boolean boolean57 = extendedBufferedReader50.isClosed();
        extendedBufferedReader50.mark((int) (short) 0);
        char[] charArray64 = new char[] { 'a', ' ', '4', '4' };
        int int67 = extendedBufferedReader50.read(charArray64, 0, 0);
        int int70 = extendedBufferedReader42.read(charArray64, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = extendedBufferedReader1.peek(charArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0330");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0331");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.setClosed(true);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        boolean boolean9 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader1.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0332");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        boolean boolean8 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0333");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0334");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0335");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        long long9 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0336");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0337");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0338");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        int int8 = extendedBufferedReader7.getLastChar();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        char[] charArray18 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int21 = extendedBufferedReader10.read(charArray18, (int) (byte) 1, (int) (byte) 0);
        int int24 = extendedBufferedReader7.read(charArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = extendedBufferedReader2.read(charArray18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0339");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        boolean boolean10 = extendedBufferedReader7.isClosed();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0340");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0341");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0342");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader(reader0, charset1, false);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = extendedBufferedReader3.transferTo(writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0343");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        long long7 = extendedBufferedReader2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0344");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        java.nio.CharBuffer charBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader1.read(charBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0345");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0346");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.io.Reader reader4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        long long6 = extendedBufferedReader5.getPosition();
        char[] charArray13 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int16 = extendedBufferedReader5.read(charArray13, (int) (byte) 1, (int) (byte) 0);
        int int19 = extendedBufferedReader2.read(charArray13, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0347");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0348");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        boolean boolean8 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0349");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        extendedBufferedReader7.reset();
        extendedBufferedReader7.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader7.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0350");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedBufferedReader7.transferTo(writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0351");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedBufferedReader2.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0352");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        char[] charArray14 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int17 = extendedBufferedReader6.read(charArray14, (int) (byte) 1, (int) (byte) 0);
        int int20 = extendedBufferedReader1.read(charArray14, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0353");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset5, true);
        long long8 = extendedBufferedReader7.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0354");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getPosition();
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader1.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0355");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) (short) 1);
        long long15 = extendedBufferedReader1.getLineNumber();
        java.nio.CharBuffer charBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedBufferedReader1.read(charBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0356");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(true);
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        long long15 = extendedBufferedReader14.getPosition();
        char[] charArray22 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int25 = extendedBufferedReader14.read(charArray22, (int) (byte) 1, (int) (byte) 0);
        int int28 = extendedBufferedReader9.read(charArray22, (-2), (int) (byte) 0);
        int int31 = extendedBufferedReader1.read(charArray22, (int) (byte) -1, (int) (byte) 0);
        java.io.Reader reader32 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader(reader32);
        long long34 = extendedBufferedReader33.getBytesRead();
        extendedBufferedReader33.setClosed(false);
        long long37 = extendedBufferedReader33.getLineNumber();
        extendedBufferedReader33.mark((int) (byte) 10);
        boolean boolean40 = extendedBufferedReader33.isClosed();
        extendedBufferedReader33.mark((int) (short) 0);
        char[] charArray47 = new char[] { 'a', ' ', '4', '4' };
        int int50 = extendedBufferedReader33.read(charArray47, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = extendedBufferedReader1.read(charArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0357");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        long long5 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0358");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0359");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.skip((long) 0);
        long long7 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0360");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0361");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0362");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6, charset7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader6.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0363");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = extendedBufferedReader7.transferTo(writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0364");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        int int15 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0365");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0366");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.CharBuffer charBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.read(charBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0367");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0368");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        extendedBufferedReader8.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader8.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0369");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0370");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.CharBuffer charBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.read(charBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0371");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0372");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        java.nio.CharBuffer charBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader2.read(charBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0373");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        int int29 = extendedBufferedReader1.read(charArray23, 0, 0);
        boolean boolean30 = extendedBufferedReader1.markSupported();
        java.io.Reader reader31 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader32 = new org.apache.commons.csv.ExtendedBufferedReader(reader31);
        long long33 = extendedBufferedReader32.getPosition();
        long long34 = extendedBufferedReader32.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader35 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader32);
        boolean boolean36 = extendedBufferedReader32.markSupported();
        long long37 = extendedBufferedReader32.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader32);
        java.io.Reader reader39 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader40 = new org.apache.commons.csv.ExtendedBufferedReader(reader39);
        long long41 = extendedBufferedReader40.getBytesRead();
        extendedBufferedReader40.setClosed(false);
        long long44 = extendedBufferedReader40.getLineNumber();
        extendedBufferedReader40.mark((int) (byte) 10);
        boolean boolean47 = extendedBufferedReader40.isClosed();
        extendedBufferedReader40.mark((int) (short) 0);
        char[] charArray54 = new char[] { 'a', ' ', '4', '4' };
        int int57 = extendedBufferedReader40.read(charArray54, 0, 0);
        int int60 = extendedBufferedReader32.read(charArray54, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = extendedBufferedReader1.read(charArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0374");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = extendedBufferedReader4.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0375");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        int int9 = extendedBufferedReader1.getLastChar();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0376");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.setClosed(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0377");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        long long9 = extendedBufferedReader1.getPosition();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getBytesRead();
        extendedBufferedReader11.setClosed(true);
        java.io.Reader reader15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        long long17 = extendedBufferedReader16.getPosition();
        char[] charArray24 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int27 = extendedBufferedReader16.read(charArray24, (int) (byte) 1, (int) (byte) 0);
        int int30 = extendedBufferedReader11.read(charArray24, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = extendedBufferedReader1.read(charArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0378");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) (short) 1);
        long long15 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.Class<?> wildcardClass17 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0379");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getPosition();
        long long11 = extendedBufferedReader9.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        boolean boolean13 = extendedBufferedReader9.markSupported();
        long long14 = extendedBufferedReader9.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getBytesRead();
        extendedBufferedReader17.setClosed(false);
        long long21 = extendedBufferedReader17.getLineNumber();
        extendedBufferedReader17.mark((int) (byte) 10);
        boolean boolean24 = extendedBufferedReader17.isClosed();
        extendedBufferedReader17.mark((int) (short) 0);
        char[] charArray31 = new char[] { 'a', ' ', '4', '4' };
        int int34 = extendedBufferedReader17.read(charArray31, 0, 0);
        int int37 = extendedBufferedReader9.read(charArray31, 0, 0);
        int int40 = extendedBufferedReader1.read(charArray31, (int) (byte) 10, (int) (short) 0);
        java.nio.CharBuffer charBuffer41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = extendedBufferedReader1.read(charBuffer41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0380");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        long long9 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0381");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0382");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader9.mark(0);
        long long12 = extendedBufferedReader9.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedBufferedReader9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0383");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0384");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        long long4 = extendedBufferedReader1.getBytesRead();
        int int5 = extendedBufferedReader1.getLastChar();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        int int11 = extendedBufferedReader10.getLastChar();
        java.io.Reader reader12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        long long14 = extendedBufferedReader13.getPosition();
        char[] charArray21 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int24 = extendedBufferedReader13.read(charArray21, (int) (byte) 1, (int) (byte) 0);
        int int27 = extendedBufferedReader10.read(charArray21, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = extendedBufferedReader1.read(charArray21, (int) (short) 100, (-2));
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0385");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader1.setClosed(false);
        java.lang.Class<?> wildcardClass16 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0386");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0387");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader7.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0388");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset18, true);
        java.io.Reader reader21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        long long23 = extendedBufferedReader22.getPosition();
        char[] charArray30 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int33 = extendedBufferedReader22.read(charArray30, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = extendedBufferedReader20.read(charArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0389");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        boolean boolean14 = extendedBufferedReader13.markSupported();
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = extendedBufferedReader13.transferTo(writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0390");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0391");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset7, true);
        boolean boolean10 = extendedBufferedReader2.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedBufferedReader2.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0392");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset6, true);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        long long12 = extendedBufferedReader10.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        boolean boolean14 = extendedBufferedReader10.markSupported();
        long long15 = extendedBufferedReader10.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        java.io.Reader reader17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        long long19 = extendedBufferedReader18.getBytesRead();
        extendedBufferedReader18.setClosed(false);
        long long22 = extendedBufferedReader18.getLineNumber();
        extendedBufferedReader18.mark((int) (byte) 10);
        boolean boolean25 = extendedBufferedReader18.isClosed();
        extendedBufferedReader18.mark((int) (short) 0);
        char[] charArray32 = new char[] { 'a', ' ', '4', '4' };
        int int35 = extendedBufferedReader18.read(charArray32, 0, 0);
        int int38 = extendedBufferedReader10.read(charArray32, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = extendedBufferedReader2.peek(charArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0393");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long17 = extendedBufferedReader16.getPosition();
        int int18 = extendedBufferedReader16.getLastChar();
        java.lang.Class<?> wildcardClass19 = extendedBufferedReader16.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0394");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        int int15 = extendedBufferedReader1.getLastChar();
        long long16 = extendedBufferedReader1.getPosition();
        java.nio.charset.Charset charset17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset17, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0395");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = extendedBufferedReader2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0396");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        int int7 = extendedBufferedReader1.getLastChar();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = extendedBufferedReader1.read(charArray23, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + -1) out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0397");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        long long5 = extendedBufferedReader2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = extendedBufferedReader2.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0398");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset5, true);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0399");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(false);
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        long long21 = extendedBufferedReader20.getPosition();
        char[] charArray28 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int31 = extendedBufferedReader20.read(charArray28, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = extendedBufferedReader1.read(charArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0400");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader7.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0401");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        boolean boolean9 = extendedBufferedReader8.isClosed();
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader8.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0402");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long10 = extendedBufferedReader9.getPosition();
        boolean boolean11 = extendedBufferedReader9.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = extendedBufferedReader9.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0403");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        boolean boolean14 = extendedBufferedReader13.markSupported();
        java.lang.Class<?> wildcardClass15 = extendedBufferedReader13.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0404");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        long long7 = extendedBufferedReader1.getLineNumber();
        int int8 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0405");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0406");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        extendedBufferedReader7.reset();
        java.io.Reader reader12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        long long14 = extendedBufferedReader13.getPosition();
        char[] charArray21 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int24 = extendedBufferedReader13.read(charArray21, (int) (byte) 1, (int) (byte) 0);
        long long25 = extendedBufferedReader13.getPosition();
        java.io.Reader reader26 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader26);
        long long28 = extendedBufferedReader27.getPosition();
        char[] charArray35 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int38 = extendedBufferedReader27.read(charArray35, (int) (byte) 1, (int) (byte) 0);
        int int41 = extendedBufferedReader13.read(charArray35, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = extendedBufferedReader7.read(charArray35);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0407");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0408");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0409");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0410");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0411");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        int int29 = extendedBufferedReader1.read(charArray23, 0, 0);
        extendedBufferedReader1.setClosed(false);
        boolean boolean32 = extendedBufferedReader1.markSupported();
        int int33 = extendedBufferedReader1.getLastChar();
        boolean boolean34 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0412");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0413");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getPosition();
        char[] charArray14 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int17 = extendedBufferedReader6.read(charArray14, (int) (byte) 1, (int) (byte) 0);
        int int20 = extendedBufferedReader1.read(charArray14, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0414");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        int int29 = extendedBufferedReader1.read(charArray23, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0415");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        boolean boolean9 = extendedBufferedReader8.isClosed();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0416");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        int int29 = extendedBufferedReader1.read(charArray23, 0, 0);
        extendedBufferedReader1.setClosed(false);
        boolean boolean32 = extendedBufferedReader1.markSupported();
        int int33 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0417");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getBytesRead();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getBytesRead();
        extendedBufferedReader10.setClosed(false);
        long long14 = extendedBufferedReader10.getLineNumber();
        boolean boolean15 = extendedBufferedReader10.markSupported();
        long long16 = extendedBufferedReader10.getBytesRead();
        java.io.Reader reader17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        long long19 = extendedBufferedReader18.getBytesRead();
        extendedBufferedReader18.setClosed(true);
        java.io.Reader reader22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        long long24 = extendedBufferedReader23.getPosition();
        char[] charArray31 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int34 = extendedBufferedReader23.read(charArray31, (int) (byte) 1, (int) (byte) 0);
        int int37 = extendedBufferedReader18.read(charArray31, (-2), (int) (byte) 0);
        int int40 = extendedBufferedReader10.read(charArray31, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = extendedBufferedReader7.read(charArray31);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0418");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        long long10 = extendedBufferedReader1.getLineNumber();
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedBufferedReader1.transferTo(writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0419");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0420");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = extendedBufferedReader3.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0421");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        boolean boolean11 = extendedBufferedReader7.markSupported();
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedBufferedReader7.transferTo(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0422");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0423");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        int int9 = extendedBufferedReader8.getLastChar();
        extendedBufferedReader8.setClosed(true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        char[] charArray15 = new char[] { ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader12.read(charArray15, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 97) out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', '#' });
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0424");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        boolean boolean14 = extendedBufferedReader13.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader15.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0425");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getPosition();
        char[] charArray20 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int23 = extendedBufferedReader12.read(charArray20, (int) (byte) 1, (int) (byte) 0);
        long long24 = extendedBufferedReader12.getPosition();
        java.io.Reader reader25 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader(reader25);
        long long27 = extendedBufferedReader26.getPosition();
        char[] charArray34 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int37 = extendedBufferedReader26.read(charArray34, (int) (byte) 1, (int) (byte) 0);
        int int40 = extendedBufferedReader12.read(charArray34, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = extendedBufferedReader7.read(charArray34, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0426");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0427");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long15 = extendedBufferedReader1.skip((long) (short) 0);
        char[] charArray20 = new char[] { 'a', '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedBufferedReader1.read(charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', 'a', 'a' });
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0428");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader2.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0429");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) (short) 1);
        long long15 = extendedBufferedReader1.getLineNumber();
        boolean boolean16 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0430");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader10.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0431");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getPosition();
        char[] charArray19 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int22 = extendedBufferedReader11.read(charArray19, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedBufferedReader7.read(charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0432");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader8.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = extendedBufferedReader8.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0433");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        long long5 = extendedBufferedReader2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader2.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0434");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        long long8 = extendedBufferedReader1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0435");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        long long13 = extendedBufferedReader7.getBytesRead();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        long long17 = extendedBufferedReader15.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15);
        boolean boolean19 = extendedBufferedReader15.markSupported();
        long long20 = extendedBufferedReader15.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15);
        java.io.Reader reader22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        long long24 = extendedBufferedReader23.getBytesRead();
        extendedBufferedReader23.setClosed(false);
        long long27 = extendedBufferedReader23.getLineNumber();
        extendedBufferedReader23.mark((int) (byte) 10);
        boolean boolean30 = extendedBufferedReader23.isClosed();
        extendedBufferedReader23.mark((int) (short) 0);
        char[] charArray37 = new char[] { 'a', ' ', '4', '4' };
        int int40 = extendedBufferedReader23.read(charArray37, 0, 0);
        int int43 = extendedBufferedReader15.read(charArray37, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = extendedBufferedReader7.peek(charArray37);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0436");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader7.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0437");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        java.lang.Class<?> wildcardClass7 = extendedBufferedReader2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0438");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = extendedBufferedReader14.transferTo(writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0439");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0440");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.mark(100);
        boolean boolean8 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.reset();
        java.nio.CharBuffer charBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader2.read(charBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0441");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        int int8 = extendedBufferedReader7.getLastChar();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        char[] charArray18 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int21 = extendedBufferedReader10.read(charArray18, (int) (byte) 1, (int) (byte) 0);
        int int24 = extendedBufferedReader7.read(charArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = extendedBufferedReader1.read(charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0442");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long17 = extendedBufferedReader16.getPosition();
        int int18 = extendedBufferedReader16.getLastChar();
        java.nio.CharBuffer charBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedBufferedReader16.read(charBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0443");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        long long5 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader2.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0444");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(true);
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        long long15 = extendedBufferedReader14.getPosition();
        char[] charArray22 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int25 = extendedBufferedReader14.read(charArray22, (int) (byte) 1, (int) (byte) 0);
        int int28 = extendedBufferedReader9.read(charArray22, (-2), (int) (byte) 0);
        int int31 = extendedBufferedReader1.read(charArray22, (int) (byte) -1, (int) (byte) 0);
        long long32 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0445");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader1.mark((int) (short) 100);
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getBytesRead();
        extendedBufferedReader11.setClosed(false);
        long long15 = extendedBufferedReader11.getLineNumber();
        extendedBufferedReader11.mark((int) (byte) 10);
        boolean boolean18 = extendedBufferedReader11.isClosed();
        extendedBufferedReader11.mark((int) (short) 0);
        char[] charArray25 = new char[] { 'a', ' ', '4', '4' };
        int int28 = extendedBufferedReader11.read(charArray25, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = extendedBufferedReader1.read(charArray25, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [32, 32 + 10) out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0446");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0447");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        long long11 = extendedBufferedReader1.getBytesRead();
        long long12 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        long long17 = extendedBufferedReader16.getPosition();
        char[] charArray24 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int27 = extendedBufferedReader16.read(charArray24, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = extendedBufferedReader1.read(charArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0448");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader9.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader9.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0449");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        boolean boolean7 = extendedBufferedReader1.isClosed();
        long long8 = extendedBufferedReader1.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0450");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        int int9 = extendedBufferedReader8.getLastChar();
        extendedBufferedReader8.setClosed(true);
        boolean boolean12 = extendedBufferedReader8.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedBufferedReader8.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0451");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        boolean boolean8 = extendedBufferedReader7.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedBufferedReader7.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0452");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        boolean boolean5 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0453");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset6, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0454");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0455");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        int int29 = extendedBufferedReader1.read(charArray23, 0, 0);
        extendedBufferedReader1.setClosed(false);
        boolean boolean32 = extendedBufferedReader1.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset34 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader33, charset34, true);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = extendedBufferedReader33.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0456");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset18, true);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedBufferedReader20.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0457");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0458");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        extendedBufferedReader7.mark((int) 'a');
        extendedBufferedReader7.reset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0459");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedBufferedReader7.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0460");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        long long13 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0461");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        int int7 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader8.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0462");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0463");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.mark(100);
        boolean boolean8 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.reset();
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader2.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0464");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader3.mark(0);
        extendedBufferedReader3.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedBufferedReader3.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0465");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        int int12 = extendedBufferedReader11.getLastChar();
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        long long15 = extendedBufferedReader14.getPosition();
        char[] charArray22 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int25 = extendedBufferedReader14.read(charArray22, (int) (byte) 1, (int) (byte) 0);
        int int28 = extendedBufferedReader11.read(charArray22, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = extendedBufferedReader1.read(charArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0466");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        extendedBufferedReader9.close();
        extendedBufferedReader9.close();
        java.lang.Class<?> wildcardClass12 = extendedBufferedReader9.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0467");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.reset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0468");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        int int3 = extendedBufferedReader1.getLastChar();
        long long4 = extendedBufferedReader1.getLineNumber();
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader1.transferTo(writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0469");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0470");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        long long5 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader2.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0471");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        int int7 = extendedBufferedReader1.getLastChar();
        int int8 = extendedBufferedReader1.getLastChar();
        int int9 = extendedBufferedReader1.getLastChar();
        extendedBufferedReader1.mark((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0472");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        java.nio.CharBuffer charBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.read(charBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0473");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        java.nio.CharBuffer charBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader1.read(charBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0474");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        extendedBufferedReader9.close();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0475");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        long long5 = extendedBufferedReader2.getLineNumber();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0476");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.close();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0477");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        int int7 = extendedBufferedReader1.getLastChar();
        int int8 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset9, false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader11.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0478");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getPosition();
        extendedBufferedReader7.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedBufferedReader7.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0479");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.Class<?> wildcardClass11 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0480");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        char[] charArray23 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int26 = extendedBufferedReader15.read(charArray23, (int) (byte) 1, (int) (byte) 0);
        int int29 = extendedBufferedReader1.read(charArray23, (int) (byte) 10, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = extendedBufferedReader30.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0481");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader8.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0482");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader7.skip((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0483");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        long long7 = extendedBufferedReader1.getLineNumber();
        int int8 = extendedBufferedReader1.getLastChar();
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader1.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0484");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int17 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0485");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        long long6 = extendedBufferedReader5.getLineNumber();
        extendedBufferedReader5.mark((int) (byte) 1);
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getBytesRead();
        extendedBufferedReader10.setClosed(true);
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        char[] charArray23 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int26 = extendedBufferedReader15.read(charArray23, (int) (byte) 1, (int) (byte) 0);
        int int29 = extendedBufferedReader10.read(charArray23, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = extendedBufferedReader5.read(charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0486");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        long long13 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader9.isClosed();
        extendedBufferedReader9.mark((int) (short) 0);
        char[] charArray23 = new char[] { 'a', ' ', '4', '4' };
        int int26 = extendedBufferedReader9.read(charArray23, 0, 0);
        int int29 = extendedBufferedReader1.read(charArray23, 0, 0);
        extendedBufferedReader1.setClosed(false);
        boolean boolean32 = extendedBufferedReader1.markSupported();
        java.lang.Class<?> wildcardClass33 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0487");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean10 = extendedBufferedReader1.markSupported();
        long long11 = extendedBufferedReader1.getPosition();
        long long12 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0488");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader3.mark(0);
        extendedBufferedReader3.mark((int) ' ');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader3);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader8.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0489");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.isClosed();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getPosition();
        long long13 = extendedBufferedReader11.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader11);
        boolean boolean15 = extendedBufferedReader11.markSupported();
        long long16 = extendedBufferedReader11.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader11);
        java.io.Reader reader18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        long long20 = extendedBufferedReader19.getBytesRead();
        extendedBufferedReader19.setClosed(false);
        long long23 = extendedBufferedReader19.getLineNumber();
        extendedBufferedReader19.mark((int) (byte) 10);
        boolean boolean26 = extendedBufferedReader19.isClosed();
        extendedBufferedReader19.mark((int) (short) 0);
        char[] charArray33 = new char[] { 'a', ' ', '4', '4' };
        int int36 = extendedBufferedReader19.read(charArray33, 0, 0);
        int int39 = extendedBufferedReader11.read(charArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = extendedBufferedReader1.read(charArray33);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0490");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.setClosed(false);
        long long11 = extendedBufferedReader7.getLineNumber();
        extendedBufferedReader7.mark((int) (byte) 10);
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getBytesRead();
        extendedBufferedReader15.setClosed(false);
        long long19 = extendedBufferedReader15.getLineNumber();
        extendedBufferedReader15.mark((int) (byte) 10);
        boolean boolean22 = extendedBufferedReader15.isClosed();
        extendedBufferedReader15.mark((int) (short) 0);
        char[] charArray29 = new char[] { 'a', ' ', '4', '4' };
        int int32 = extendedBufferedReader15.read(charArray29, 0, 0);
        int int35 = extendedBufferedReader7.read(charArray29, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = extendedBufferedReader1.read(charArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0491");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader9.setClosed(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0492");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0493");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader(reader0, charset1, false);
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0, charset4, true);
        int int7 = extendedBufferedReader6.getLastChar();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0494");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.close();
        int int10 = extendedBufferedReader7.getLastChar();
        int int11 = extendedBufferedReader7.getLastChar();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        int int14 = extendedBufferedReader7.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0495");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        java.io.Reader reader5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader5);
        long long7 = extendedBufferedReader6.getBytesRead();
        extendedBufferedReader6.setClosed(false);
        long long10 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.mark((int) (byte) 10);
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        long long15 = extendedBufferedReader14.getBytesRead();
        extendedBufferedReader14.setClosed(false);
        long long18 = extendedBufferedReader14.getLineNumber();
        extendedBufferedReader14.mark((int) (byte) 10);
        boolean boolean21 = extendedBufferedReader14.isClosed();
        extendedBufferedReader14.mark((int) (short) 0);
        char[] charArray28 = new char[] { 'a', ' ', '4', '4' };
        int int31 = extendedBufferedReader14.read(charArray28, 0, 0);
        int int34 = extendedBufferedReader6.read(charArray28, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = extendedBufferedReader1.peek(charArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0496");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long5 = extendedBufferedReader4.getPosition();
        long long6 = extendedBufferedReader4.getPosition();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader4.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0497");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader3.mark(0);
        extendedBufferedReader3.mark((int) ' ');
        long long8 = extendedBufferedReader3.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader3.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0498");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        char[] charArray23 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int26 = extendedBufferedReader15.read(charArray23, (int) (byte) 1, (int) (byte) 0);
        int int29 = extendedBufferedReader1.read(charArray23, (int) (byte) 10, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.CharBuffer charBuffer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = extendedBufferedReader30.read(charBuffer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0499");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest0.test0500");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }
}

