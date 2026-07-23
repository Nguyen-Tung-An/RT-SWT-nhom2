package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtendedBufferedReaderRegressionTest2 {

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
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1001");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int9 = extendedBufferedReader8.getLastChar();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1002");
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
        java.nio.charset.Charset charset15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7, charset15, false);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1003");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
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
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1004");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedBufferedReader6.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1005");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1006");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        long long6 = extendedBufferedReader2.getLineNumber();
        extendedBufferedReader2.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedBufferedReader2.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1007");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader2.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1008");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        java.nio.CharBuffer charBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader1.read(charBuffer15);
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1009");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.mark((int) '#');
        extendedBufferedReader7.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.nio.CharBuffer charBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader12.read(charBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1010");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1011");
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
            int int32 = extendedBufferedReader7.read(charArray25);
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1012");
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
        char[] charArray25 = new char[] { '4', '#', ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int int28 = extendedBufferedReader1.read(charArray25, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + -1) out of bounds for length 5");
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
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1013");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        extendedBufferedReader1.mark(100);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset11, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = extendedBufferedReader13.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1014");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        long long7 = extendedBufferedReader1.getLineNumber();
        int int8 = extendedBufferedReader1.getLastChar();
        boolean boolean9 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1015");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long5 = extendedBufferedReader4.getPosition();
        long long6 = extendedBufferedReader4.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1016");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.setClosed(true);
        int int10 = extendedBufferedReader7.getLastChar();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1017");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        long long5 = extendedBufferedReader1.getBytesRead();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.setClosed(true);
        boolean boolean11 = extendedBufferedReader7.markSupported();
        long long12 = extendedBufferedReader7.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        int int14 = extendedBufferedReader13.getLastChar();
        extendedBufferedReader13.close();
        int int16 = extendedBufferedReader13.getLastChar();
        int int17 = extendedBufferedReader13.getLastChar();
        long long18 = extendedBufferedReader13.getBytesRead();
        extendedBufferedReader13.close();
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader13, charset20, true);
        java.io.Reader reader23 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        long long25 = extendedBufferedReader24.getBytesRead();
        extendedBufferedReader24.setClosed(true);
        java.io.Reader reader28 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader(reader28);
        long long30 = extendedBufferedReader29.getPosition();
        char[] charArray37 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int40 = extendedBufferedReader29.read(charArray37, (int) (byte) 1, (int) (byte) 0);
        int int43 = extendedBufferedReader24.read(charArray37, (-2), (int) (byte) 0);
        int int46 = extendedBufferedReader22.read(charArray37, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = extendedBufferedReader1.peek(charArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1018");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        int int9 = extendedBufferedReader8.getLastChar();
        int int10 = extendedBufferedReader8.getLastChar();
        java.lang.Class<?> wildcardClass11 = extendedBufferedReader8.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1019");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = extendedBufferedReader4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1020");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int5 = extendedBufferedReader1.getLastChar();
        char[] charArray6 = null;
        int int9 = extendedBufferedReader1.read(charArray6, (int) '4', 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long11 = extendedBufferedReader1.getBytesRead();
        boolean boolean12 = extendedBufferedReader1.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1021");
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
        int int30 = extendedBufferedReader1.getLastChar();
        long long31 = extendedBufferedReader1.getBytesRead();
        boolean boolean32 = extendedBufferedReader1.markSupported();
        long long33 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1022");
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
            extendedBufferedReader8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1023");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        boolean boolean9 = extendedBufferedReader8.markSupported();
        long long11 = extendedBufferedReader8.skip((long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1024");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getPosition();
        int int9 = extendedBufferedReader7.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1025");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.isClosed();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1026");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1027");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.setClosed(true);
        boolean boolean11 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.close();
        long long13 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = extendedBufferedReader1.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1028");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.setClosed(true);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getBytesRead();
        extendedBufferedReader12.setClosed(true);
        boolean boolean16 = extendedBufferedReader12.markSupported();
        long long17 = extendedBufferedReader12.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        int int19 = extendedBufferedReader18.getLastChar();
        extendedBufferedReader18.close();
        int int21 = extendedBufferedReader18.getLastChar();
        int int22 = extendedBufferedReader18.getLastChar();
        long long23 = extendedBufferedReader18.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18);
        int int25 = extendedBufferedReader18.getLastChar();
        extendedBufferedReader18.close();
        extendedBufferedReader18.setClosed(true);
        extendedBufferedReader18.close();
        java.io.Reader reader30 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader(reader30);
        long long32 = extendedBufferedReader31.getBytesRead();
        extendedBufferedReader31.setClosed(true);
        java.io.Reader reader35 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader(reader35);
        long long37 = extendedBufferedReader36.getPosition();
        char[] charArray44 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int47 = extendedBufferedReader36.read(charArray44, (int) (byte) 1, (int) (byte) 0);
        int int50 = extendedBufferedReader31.read(charArray44, (-2), (int) (byte) 0);
        int int53 = extendedBufferedReader18.read(charArray44, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = extendedBufferedReader1.peek(charArray44);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1029");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset10, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getPosition();
        char[] charArray23 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int26 = extendedBufferedReader15.read(charArray23, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = extendedBufferedReader13.read(charArray23, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 35) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1030");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(true);
        boolean boolean13 = extendedBufferedReader9.markSupported();
        long long14 = extendedBufferedReader9.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        int int16 = extendedBufferedReader15.getLastChar();
        extendedBufferedReader15.close();
        int int18 = extendedBufferedReader15.getLastChar();
        int int19 = extendedBufferedReader15.getLastChar();
        long long20 = extendedBufferedReader15.getBytesRead();
        extendedBufferedReader15.close();
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15, charset22, true);
        java.io.Reader reader25 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader(reader25);
        long long27 = extendedBufferedReader26.getBytesRead();
        extendedBufferedReader26.setClosed(true);
        java.io.Reader reader30 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader(reader30);
        long long32 = extendedBufferedReader31.getPosition();
        char[] charArray39 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int42 = extendedBufferedReader31.read(charArray39, (int) (byte) 1, (int) (byte) 0);
        int int45 = extendedBufferedReader26.read(charArray39, (-2), (int) (byte) 0);
        int int48 = extendedBufferedReader24.read(charArray39, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = extendedBufferedReader1.peek(charArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1031");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        int int9 = extendedBufferedReader8.getLastChar();
        int int10 = extendedBufferedReader8.getLastChar();
        long long11 = extendedBufferedReader8.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedBufferedReader8.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1032");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7, charset8, true);
        boolean boolean11 = extendedBufferedReader10.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = extendedBufferedReader10.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1033");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10, charset11, true);
        int int14 = extendedBufferedReader10.getLastChar();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1034");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset3, true);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1035");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        long long9 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long12 = extendedBufferedReader11.getPosition();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1036");
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
        char[] charArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader9.peek(charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"buf\" is null");
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1037");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.mark(100);
        extendedBufferedReader2.setClosed(false);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader2.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1038");
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
        long long13 = extendedBufferedReader9.skip(0L);
        long long14 = extendedBufferedReader9.getPosition();
        java.lang.Class<?> wildcardClass15 = extendedBufferedReader9.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1039");
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
        long long13 = extendedBufferedReader9.skip(0L);
        long long14 = extendedBufferedReader9.getPosition();
        long long15 = extendedBufferedReader9.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1040");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        long long15 = extendedBufferedReader1.getBytesRead();
        long long16 = extendedBufferedReader1.getLineNumber();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1041");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        long long9 = extendedBufferedReader1.getPosition();
        int int10 = extendedBufferedReader1.getLastChar();
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedBufferedReader1.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1042");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long9 = extendedBufferedReader8.getPosition();
        long long10 = extendedBufferedReader8.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1043");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long15 = extendedBufferedReader14.getLineNumber();
        long long16 = extendedBufferedReader14.getPosition();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1044");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        long long10 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.reset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1045");
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
        extendedBufferedReader7.close();
        long long16 = extendedBufferedReader7.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1046");
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
        int int16 = extendedBufferedReader15.getLastChar();
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = extendedBufferedReader15.read(charArray31, 1, 1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1047");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean18 = extendedBufferedReader1.isClosed();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.Class<?> wildcardClass20 = extendedBufferedReader19.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1048");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean6 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1049");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7, charset10, false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1050");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset10, true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedBufferedReader12.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1051");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader10.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1052");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getPosition();
        long long10 = extendedBufferedReader8.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        boolean boolean12 = extendedBufferedReader8.isClosed();
        java.nio.charset.Charset charset13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8, charset13, false);
        int int16 = extendedBufferedReader15.getLastChar();
        extendedBufferedReader15.setClosed(true);
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        int int22 = extendedBufferedReader21.getLastChar();
        java.io.Reader reader23 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        long long25 = extendedBufferedReader24.getPosition();
        char[] charArray32 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int35 = extendedBufferedReader24.read(charArray32, (int) (byte) 1, (int) (byte) 0);
        int int38 = extendedBufferedReader21.read(charArray32, (int) (short) 1, (int) (short) 0);
        int int41 = extendedBufferedReader15.read(charArray32, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = extendedBufferedReader1.peek(charArray32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1053");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset9, true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader11.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1054");
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
        java.io.Writer writer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = extendedBufferedReader1.transferTo(writer32);
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
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1055");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = extendedBufferedReader13.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1056");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long11 = extendedBufferedReader8.getLineNumber();
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedBufferedReader8.transferTo(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1057");
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
        extendedBufferedReader7.setClosed(true);
        extendedBufferedReader7.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1058");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getBytesRead();
        extendedBufferedReader11.setClosed(false);
        long long15 = extendedBufferedReader11.getLineNumber();
        boolean boolean16 = extendedBufferedReader11.markSupported();
        long long17 = extendedBufferedReader11.getBytesRead();
        java.io.Reader reader18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        long long20 = extendedBufferedReader19.getBytesRead();
        extendedBufferedReader19.setClosed(true);
        java.io.Reader reader23 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        long long25 = extendedBufferedReader24.getPosition();
        char[] charArray32 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int35 = extendedBufferedReader24.read(charArray32, (int) (byte) 1, (int) (byte) 0);
        int int38 = extendedBufferedReader19.read(charArray32, (-2), (int) (byte) 0);
        int int41 = extendedBufferedReader11.read(charArray32, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = extendedBufferedReader1.read(charArray32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1059");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark(1);
        int int7 = extendedBufferedReader1.getLastChar();
        long long8 = extendedBufferedReader1.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1060");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int17 = extendedBufferedReader16.getLastChar();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1061");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getPosition();
        char[] charArray20 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int23 = extendedBufferedReader12.read(charArray20, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = extendedBufferedReader1.read(charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1062");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader3.mark(0);
        extendedBufferedReader3.mark((int) ' ');
        long long8 = extendedBufferedReader3.getPosition();
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader3, charset9, false);
        long long12 = extendedBufferedReader11.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1063");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader7.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1064");
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
        extendedBufferedReader2.mark((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1065");
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
            int int9 = extendedBufferedReader8.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1066");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6, charset7, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getBytesRead();
        extendedBufferedReader12.setClosed(true);
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getPosition();
        char[] charArray25 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int28 = extendedBufferedReader17.read(charArray25, (int) (byte) 1, (int) (byte) 0);
        int int31 = extendedBufferedReader12.read(charArray25, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = extendedBufferedReader6.read(charArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1067");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1068");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9, charset11, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = extendedBufferedReader9.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1069");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getPosition();
        char[] charArray15 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int18 = extendedBufferedReader7.read(charArray15, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader2.read(charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1070");
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
        long long12 = extendedBufferedReader1.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1071");
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
        java.nio.CharBuffer charBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedBufferedReader7.read(charBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1072");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1073");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        char[] charArray12 = new char[] { ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedBufferedReader1.read(charArray12, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', 'a', 'a' });
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1074");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9, charset10, true);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedBufferedReader12.transferTo(writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1075");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1076");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1077");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long4 = extendedBufferedReader3.getPosition();
        boolean boolean5 = extendedBufferedReader3.markSupported();
        java.nio.CharBuffer charBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedBufferedReader3.read(charBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1078");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getBytesRead();
        extendedBufferedReader11.setClosed(true);
        boolean boolean15 = extendedBufferedReader11.markSupported();
        java.nio.charset.Charset charset16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader11, charset16, true);
        extendedBufferedReader18.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18);
        java.nio.charset.Charset charset21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader20, charset21, true);
        java.io.Reader reader24 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        long long26 = extendedBufferedReader25.getBytesRead();
        extendedBufferedReader25.setClosed(false);
        long long29 = extendedBufferedReader25.getLineNumber();
        extendedBufferedReader25.mark((int) (byte) 10);
        boolean boolean32 = extendedBufferedReader25.isClosed();
        extendedBufferedReader25.mark((int) (short) 0);
        char[] charArray39 = new char[] { 'a', ' ', '4', '4' };
        int int42 = extendedBufferedReader25.read(charArray39, 0, 0);
        int int45 = extendedBufferedReader23.read(charArray39, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = extendedBufferedReader1.read(charArray39, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1079");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1080");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1081");
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
        extendedBufferedReader7.close();
        extendedBufferedReader7.setClosed(true);
        extendedBufferedReader7.close();
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
        int int42 = extendedBufferedReader7.read(charArray33, (int) (short) -1, 0);
        char[] charArray43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = extendedBufferedReader7.peek(charArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"buf\" is null");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1082");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1083");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.Class<?> wildcardClass4 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1084");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.mark(100);
        boolean boolean8 = extendedBufferedReader2.markSupported();
        extendedBufferedReader2.reset();
        int int10 = extendedBufferedReader2.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1085");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        boolean boolean9 = extendedBufferedReader7.isClosed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1086");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        boolean boolean7 = extendedBufferedReader1.isClosed();
        long long8 = extendedBufferedReader1.getBytesRead();
        int int9 = extendedBufferedReader1.getLastChar();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1087");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        java.lang.Class<?> wildcardClass7 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1088");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        int int7 = extendedBufferedReader1.getLastChar();
        int int8 = extendedBufferedReader1.getLastChar();
        int int9 = extendedBufferedReader1.getLastChar();
        boolean boolean10 = extendedBufferedReader1.markSupported();
        long long12 = extendedBufferedReader1.skip(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1089");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        long long9 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getPosition();
        long long13 = extendedBufferedReader11.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader11);
        long long15 = extendedBufferedReader14.getPosition();
        char[] charArray17 = new char[] { 'a' };
        int int20 = extendedBufferedReader14.read(charArray17, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedBufferedReader1.peek(charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1090");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getLineNumber();
        long long9 = extendedBufferedReader7.getPosition();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1091");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        long long6 = extendedBufferedReader5.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader5.skip((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1092");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader1.getBytesRead();
        int int11 = extendedBufferedReader1.getLastChar();
        boolean boolean12 = extendedBufferedReader1.isClosed();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1093");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        long long6 = extendedBufferedReader5.getLineNumber();
        extendedBufferedReader5.mark((int) (byte) 1);
        extendedBufferedReader5.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedBufferedReader5.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1094");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1095");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader9.mark((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1096");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6, charset7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader9.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1097");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        long long5 = extendedBufferedReader2.getBytesRead();
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.setClosed(false);
        long long11 = extendedBufferedReader7.getPosition();
        long long12 = extendedBufferedReader7.getPosition();
        int int13 = extendedBufferedReader7.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader14.mark((int) (short) 100);
        java.io.Reader reader17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        long long19 = extendedBufferedReader18.getBytesRead();
        extendedBufferedReader18.setClosed(true);
        boolean boolean22 = extendedBufferedReader18.markSupported();
        java.nio.charset.Charset charset23 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18, charset23, true);
        extendedBufferedReader25.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader25);
        java.nio.charset.Charset charset28 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader27, charset28, true);
        java.io.Reader reader31 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader32 = new org.apache.commons.csv.ExtendedBufferedReader(reader31);
        long long33 = extendedBufferedReader32.getBytesRead();
        extendedBufferedReader32.setClosed(false);
        long long36 = extendedBufferedReader32.getLineNumber();
        extendedBufferedReader32.mark((int) (byte) 10);
        boolean boolean39 = extendedBufferedReader32.isClosed();
        extendedBufferedReader32.mark((int) (short) 0);
        char[] charArray46 = new char[] { 'a', ' ', '4', '4' };
        int int49 = extendedBufferedReader32.read(charArray46, 0, 0);
        int int52 = extendedBufferedReader30.read(charArray46, (int) (byte) 10, (int) (short) 0);
        int int55 = extendedBufferedReader14.read(charArray46, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = extendedBufferedReader2.read(charArray46);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1098");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader13);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1099");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark(1);
        int int7 = extendedBufferedReader1.getLastChar();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(false);
        int int13 = extendedBufferedReader9.getLastChar();
        boolean boolean14 = extendedBufferedReader9.markSupported();
        long long15 = extendedBufferedReader9.getLineNumber();
        java.io.Reader reader16 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        long long18 = extendedBufferedReader17.getPosition();
        long long19 = extendedBufferedReader17.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        boolean boolean21 = extendedBufferedReader17.markSupported();
        long long22 = extendedBufferedReader17.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        java.io.Reader reader24 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        long long26 = extendedBufferedReader25.getBytesRead();
        extendedBufferedReader25.setClosed(false);
        long long29 = extendedBufferedReader25.getLineNumber();
        extendedBufferedReader25.mark((int) (byte) 10);
        boolean boolean32 = extendedBufferedReader25.isClosed();
        extendedBufferedReader25.mark((int) (short) 0);
        char[] charArray39 = new char[] { 'a', ' ', '4', '4' };
        int int42 = extendedBufferedReader25.read(charArray39, 0, 0);
        int int45 = extendedBufferedReader17.read(charArray39, 0, 0);
        int int48 = extendedBufferedReader9.read(charArray39, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = extendedBufferedReader1.read(charArray39, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [32, 32 + 10) out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1100");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9, charset10, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader12.close();
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
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1101");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        extendedBufferedReader7.mark((int) (byte) 10);
        extendedBufferedReader7.mark((int) ' ');
        boolean boolean13 = extendedBufferedReader7.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1102");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.setClosed(true);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset11, false);
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        boolean boolean16 = extendedBufferedReader15.markSupported();
        long long17 = extendedBufferedReader15.getLineNumber();
        int int18 = extendedBufferedReader15.getLastChar();
        int int19 = extendedBufferedReader15.getLastChar();
        java.nio.charset.Charset charset20 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15, charset20, false);
        java.io.Reader reader23 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        long long25 = extendedBufferedReader24.getPosition();
        char[] charArray32 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int35 = extendedBufferedReader24.read(charArray32, (int) (byte) 1, (int) (byte) 0);
        long long36 = extendedBufferedReader24.getPosition();
        java.io.Reader reader37 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader(reader37);
        long long39 = extendedBufferedReader38.getPosition();
        char[] charArray46 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int49 = extendedBufferedReader38.read(charArray46, (int) (byte) 1, (int) (byte) 0);
        int int52 = extendedBufferedReader24.read(charArray46, (int) (byte) 10, (int) (byte) 0);
        int int55 = extendedBufferedReader15.read(charArray46, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = extendedBufferedReader1.peek(charArray46);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1103");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset9, true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1104");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        java.lang.Class<?> wildcardClass4 = extendedBufferedReader2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1105");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        java.nio.charset.Charset charset14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset14, true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1106");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        boolean boolean9 = extendedBufferedReader1.markSupported();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getPosition();
        char[] charArray19 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int22 = extendedBufferedReader11.read(charArray19, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedBufferedReader1.read(charArray19);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1107");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10, charset11, true);
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
        int int35 = extendedBufferedReader13.read(charArray29, (int) (byte) 10, (int) (short) 0);
        java.io.Reader reader36 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = new org.apache.commons.csv.ExtendedBufferedReader(reader36);
        long long38 = extendedBufferedReader37.getPosition();
        long long39 = extendedBufferedReader37.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader40 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader37);
        boolean boolean41 = extendedBufferedReader37.isClosed();
        java.nio.charset.Charset charset42 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader44 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader37, charset42, false);
        int int45 = extendedBufferedReader44.getLastChar();
        extendedBufferedReader44.setClosed(true);
        java.io.Reader reader48 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader(reader48);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader48);
        int int51 = extendedBufferedReader50.getLastChar();
        java.io.Reader reader52 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader53 = new org.apache.commons.csv.ExtendedBufferedReader(reader52);
        long long54 = extendedBufferedReader53.getPosition();
        char[] charArray61 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int64 = extendedBufferedReader53.read(charArray61, (int) (byte) 1, (int) (byte) 0);
        int int67 = extendedBufferedReader50.read(charArray61, (int) (short) 1, (int) (short) 0);
        int int70 = extendedBufferedReader44.read(charArray61, (int) (byte) 10, (int) (short) 0);
        int int73 = extendedBufferedReader13.read(charArray61, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = extendedBufferedReader13.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-2) + "'", int45 == (-2));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2) + "'", int51 == (-2));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1108");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = extendedBufferedReader3.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1109");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (short) 10);
        boolean boolean9 = extendedBufferedReader1.isClosed();
        boolean boolean10 = extendedBufferedReader1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1110");
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
        long long14 = extendedBufferedReader7.getBytesRead();
        boolean boolean15 = extendedBufferedReader7.isClosed();
        long long16 = extendedBufferedReader7.getPosition();
        extendedBufferedReader7.setClosed(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1111");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset10, true);
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        long long15 = extendedBufferedReader14.getBytesRead();
        extendedBufferedReader14.setClosed(false);
        long long18 = extendedBufferedReader14.getLineNumber();
        extendedBufferedReader14.mark((int) (byte) 10);
        java.io.Reader reader21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        long long23 = extendedBufferedReader22.getBytesRead();
        extendedBufferedReader22.setClosed(false);
        long long26 = extendedBufferedReader22.getLineNumber();
        extendedBufferedReader22.mark((int) (byte) 10);
        boolean boolean29 = extendedBufferedReader22.isClosed();
        extendedBufferedReader22.mark((int) (short) 0);
        char[] charArray36 = new char[] { 'a', ' ', '4', '4' };
        int int39 = extendedBufferedReader22.read(charArray36, 0, 0);
        int int42 = extendedBufferedReader14.read(charArray36, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = extendedBufferedReader1.peek(charArray36);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1112");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1113");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long10 = extendedBufferedReader9.getPosition();
        boolean boolean11 = extendedBufferedReader9.markSupported();
        java.io.Reader reader12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        long long14 = extendedBufferedReader13.getPosition();
        char[] charArray21 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int24 = extendedBufferedReader13.read(charArray21, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedBufferedReader9.read(charArray21, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 100) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1114");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1115");
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
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
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
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1116");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark((int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1117");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        extendedBufferedReader1.reset();
        long long16 = extendedBufferedReader1.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1118");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        boolean boolean13 = extendedBufferedReader1.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset15, false);
        boolean boolean18 = extendedBufferedReader1.isClosed();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1119");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        java.lang.Class<?> wildcardClass7 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1120");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        long long9 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long11 = extendedBufferedReader1.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1121");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getBytesRead();
        extendedBufferedReader8.setClosed(true);
        boolean boolean12 = extendedBufferedReader8.markSupported();
        long long13 = extendedBufferedReader8.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        int int15 = extendedBufferedReader14.getLastChar();
        extendedBufferedReader14.close();
        int int17 = extendedBufferedReader14.getLastChar();
        int int18 = extendedBufferedReader14.getLastChar();
        long long19 = extendedBufferedReader14.getBytesRead();
        extendedBufferedReader14.close();
        java.nio.charset.Charset charset21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader14, charset21, true);
        java.io.Reader reader24 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        long long26 = extendedBufferedReader25.getBytesRead();
        extendedBufferedReader25.setClosed(true);
        java.io.Reader reader29 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader(reader29);
        long long31 = extendedBufferedReader30.getPosition();
        char[] charArray38 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int41 = extendedBufferedReader30.read(charArray38, (int) (byte) 1, (int) (byte) 0);
        int int44 = extendedBufferedReader25.read(charArray38, (-2), (int) (byte) 0);
        int int47 = extendedBufferedReader23.read(charArray38, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = extendedBufferedReader1.read(charArray38, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 10) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1122");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader(reader0, charset1, false);
        int int4 = extendedBufferedReader3.peek();
        java.lang.String str5 = extendedBufferedReader3.readLine();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader3.transferTo(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1123");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedBufferedReader1.ready();
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1124");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.markSupported();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        boolean boolean8 = extendedBufferedReader7.isClosed();
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
            int int28 = extendedBufferedReader7.peek(charArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1125");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        extendedBufferedReader1.mark(100);
        boolean boolean11 = extendedBufferedReader1.markSupported();
        java.io.Reader reader12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        long long14 = extendedBufferedReader13.getBytesRead();
        extendedBufferedReader13.setClosed(false);
        int int17 = extendedBufferedReader13.getLastChar();
        boolean boolean18 = extendedBufferedReader13.markSupported();
        long long19 = extendedBufferedReader13.getLineNumber();
        java.io.Reader reader20 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        long long22 = extendedBufferedReader21.getPosition();
        long long23 = extendedBufferedReader21.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader21);
        boolean boolean25 = extendedBufferedReader21.markSupported();
        long long26 = extendedBufferedReader21.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader21);
        java.io.Reader reader28 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader(reader28);
        long long30 = extendedBufferedReader29.getBytesRead();
        extendedBufferedReader29.setClosed(false);
        long long33 = extendedBufferedReader29.getLineNumber();
        extendedBufferedReader29.mark((int) (byte) 10);
        boolean boolean36 = extendedBufferedReader29.isClosed();
        extendedBufferedReader29.mark((int) (short) 0);
        char[] charArray43 = new char[] { 'a', ' ', '4', '4' };
        int int46 = extendedBufferedReader29.read(charArray43, 0, 0);
        int int49 = extendedBufferedReader21.read(charArray43, 0, 0);
        int int52 = extendedBufferedReader13.read(charArray43, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = extendedBufferedReader1.peek(charArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1126");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getPosition();
        extendedBufferedReader1.setClosed(true);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedBufferedReader1.transferTo(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1127");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        java.nio.CharBuffer charBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedBufferedReader2.read(charBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1128");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader1.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.read();
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1129");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        boolean boolean7 = extendedBufferedReader1.isClosed();
        boolean boolean8 = extendedBufferedReader1.markSupported();
        boolean boolean9 = extendedBufferedReader1.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1130");
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
        java.io.Reader reader30 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader(reader30);
        boolean boolean32 = extendedBufferedReader31.markSupported();
        long long33 = extendedBufferedReader31.getLineNumber();
        int int34 = extendedBufferedReader31.getLastChar();
        int int35 = extendedBufferedReader31.getLastChar();
        java.nio.charset.Charset charset36 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader31, charset36, false);
        java.io.Reader reader39 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader40 = new org.apache.commons.csv.ExtendedBufferedReader(reader39);
        long long41 = extendedBufferedReader40.getPosition();
        char[] charArray48 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int51 = extendedBufferedReader40.read(charArray48, (int) (byte) 1, (int) (byte) 0);
        long long52 = extendedBufferedReader40.getPosition();
        java.io.Reader reader53 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader54 = new org.apache.commons.csv.ExtendedBufferedReader(reader53);
        long long55 = extendedBufferedReader54.getPosition();
        char[] charArray62 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int65 = extendedBufferedReader54.read(charArray62, (int) (byte) 1, (int) (byte) 0);
        int int68 = extendedBufferedReader40.read(charArray62, (int) (byte) 10, (int) (byte) 0);
        int int71 = extendedBufferedReader31.read(charArray62, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = extendedBufferedReader1.read(charArray62);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1131");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean6 = extendedBufferedReader1.isClosed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1132");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        boolean boolean9 = extendedBufferedReader8.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1133");
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
            int int33 = extendedBufferedReader1.peek();
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1134");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        extendedBufferedReader9.mark((int) (byte) 0);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedBufferedReader9.transferTo(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1135");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        long long9 = extendedBufferedReader8.getPosition();
        long long11 = extendedBufferedReader8.skip(0L);
        java.nio.charset.Charset charset12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8, charset12, true);
        long long15 = extendedBufferedReader14.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1136");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10, charset11, true);
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
        int int35 = extendedBufferedReader13.read(charArray29, (int) (byte) 10, (int) (short) 0);
        java.io.Reader reader36 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = new org.apache.commons.csv.ExtendedBufferedReader(reader36);
        long long38 = extendedBufferedReader37.getBytesRead();
        extendedBufferedReader37.setClosed(true);
        java.io.Reader reader41 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader42 = new org.apache.commons.csv.ExtendedBufferedReader(reader41);
        long long43 = extendedBufferedReader42.getPosition();
        char[] charArray50 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int53 = extendedBufferedReader42.read(charArray50, (int) (byte) 1, (int) (byte) 0);
        int int56 = extendedBufferedReader37.read(charArray50, (-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = extendedBufferedReader13.peek(charArray50);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1137");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        long long10 = extendedBufferedReader7.getBytesRead();
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        boolean boolean13 = extendedBufferedReader12.markSupported();
        long long14 = extendedBufferedReader12.getLineNumber();
        int int15 = extendedBufferedReader12.getLastChar();
        int int16 = extendedBufferedReader12.getLastChar();
        java.nio.charset.Charset charset17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12, charset17, false);
        java.io.Reader reader20 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        long long22 = extendedBufferedReader21.getPosition();
        char[] charArray29 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int32 = extendedBufferedReader21.read(charArray29, (int) (byte) 1, (int) (byte) 0);
        long long33 = extendedBufferedReader21.getPosition();
        java.io.Reader reader34 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader35 = new org.apache.commons.csv.ExtendedBufferedReader(reader34);
        long long36 = extendedBufferedReader35.getPosition();
        char[] charArray43 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int46 = extendedBufferedReader35.read(charArray43, (int) (byte) 1, (int) (byte) 0);
        int int49 = extendedBufferedReader21.read(charArray43, (int) (byte) 10, (int) (byte) 0);
        int int52 = extendedBufferedReader12.read(charArray43, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = extendedBufferedReader7.read(charArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1138");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.setClosed(true);
        boolean boolean10 = extendedBufferedReader7.isClosed();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1139");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        long long7 = extendedBufferedReader1.getLineNumber();
        int int8 = extendedBufferedReader1.getLastChar();
        boolean boolean9 = extendedBufferedReader1.isClosed();
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getBytesRead();
        extendedBufferedReader11.setClosed(false);
        long long15 = extendedBufferedReader11.getPosition();
        long long16 = extendedBufferedReader11.getPosition();
        int int17 = extendedBufferedReader11.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader11);
        extendedBufferedReader18.mark((int) (short) 100);
        java.io.Reader reader21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        long long23 = extendedBufferedReader22.getBytesRead();
        extendedBufferedReader22.setClosed(true);
        boolean boolean26 = extendedBufferedReader22.markSupported();
        java.nio.charset.Charset charset27 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader22, charset27, true);
        extendedBufferedReader29.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader29);
        java.nio.charset.Charset charset32 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader31, charset32, true);
        java.io.Reader reader35 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader(reader35);
        long long37 = extendedBufferedReader36.getBytesRead();
        extendedBufferedReader36.setClosed(false);
        long long40 = extendedBufferedReader36.getLineNumber();
        extendedBufferedReader36.mark((int) (byte) 10);
        boolean boolean43 = extendedBufferedReader36.isClosed();
        extendedBufferedReader36.mark((int) (short) 0);
        char[] charArray50 = new char[] { 'a', ' ', '4', '4' };
        int int53 = extendedBufferedReader36.read(charArray50, 0, 0);
        int int56 = extendedBufferedReader34.read(charArray50, (int) (byte) 10, (int) (short) 0);
        int int59 = extendedBufferedReader18.read(charArray50, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = extendedBufferedReader1.peek(charArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1140");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader9.getBytesRead();
        long long11 = extendedBufferedReader9.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedBufferedReader9.peek();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1141");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        long long9 = extendedBufferedReader8.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark == -1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1142");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        boolean boolean6 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) 'a');
        boolean boolean9 = extendedBufferedReader1.isClosed();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1143");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long10 = extendedBufferedReader9.getPosition();
        long long11 = extendedBufferedReader9.getLineNumber();
        long long12 = extendedBufferedReader9.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1144");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        long long7 = extendedBufferedReader5.skip((long) 0);
        boolean boolean8 = extendedBufferedReader5.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1145");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        boolean boolean13 = extendedBufferedReader1.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset15, false);
        java.nio.CharBuffer charBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader17.read(charBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1146");
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
        int int30 = extendedBufferedReader1.getLastChar();
        long long31 = extendedBufferedReader1.getBytesRead();
        boolean boolean32 = extendedBufferedReader1.markSupported();
        long long33 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = extendedBufferedReader1.readLine();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1147");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean5 = extendedBufferedReader1.isClosed();
        int int6 = extendedBufferedReader1.getLastChar();
        extendedBufferedReader1.setClosed(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1148");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset10, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1149");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        char[] charArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader5.read(charArray6, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: char array");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1150");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        java.io.Reader reader4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        long long6 = extendedBufferedReader5.getBytesRead();
        extendedBufferedReader5.setClosed(false);
        long long9 = extendedBufferedReader5.getPosition();
        long long10 = extendedBufferedReader5.getPosition();
        int int11 = extendedBufferedReader5.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader5);
        extendedBufferedReader12.mark((int) (short) 100);
        java.io.Reader reader15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        long long17 = extendedBufferedReader16.getBytesRead();
        extendedBufferedReader16.setClosed(true);
        boolean boolean20 = extendedBufferedReader16.markSupported();
        java.nio.charset.Charset charset21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader16, charset21, true);
        extendedBufferedReader23.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader23);
        java.nio.charset.Charset charset26 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader25, charset26, true);
        java.io.Reader reader29 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader(reader29);
        long long31 = extendedBufferedReader30.getBytesRead();
        extendedBufferedReader30.setClosed(false);
        long long34 = extendedBufferedReader30.getLineNumber();
        extendedBufferedReader30.mark((int) (byte) 10);
        boolean boolean37 = extendedBufferedReader30.isClosed();
        extendedBufferedReader30.mark((int) (short) 0);
        char[] charArray44 = new char[] { 'a', ' ', '4', '4' };
        int int47 = extendedBufferedReader30.read(charArray44, 0, 0);
        int int50 = extendedBufferedReader28.read(charArray44, (int) (byte) 10, (int) (short) 0);
        int int53 = extendedBufferedReader12.read(charArray44, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = extendedBufferedReader2.read(charArray44, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + -1) out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1151");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getPosition();
        char[] charArray20 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int23 = extendedBufferedReader12.read(charArray20, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = extendedBufferedReader7.peek(charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1152");
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
            int int9 = extendedBufferedReader1.peek();
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1153");
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
        long long32 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = extendedBufferedReader1.readLine();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1154");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset4, true);
        extendedBufferedReader6.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedBufferedReader6.readLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1155");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.skip((long) 0);
        long long7 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset8, false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1156");
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
            long long11 = extendedBufferedReader9.skip(10L);
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1157");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset7, true);
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getBytesRead();
        extendedBufferedReader11.setClosed(false);
        int int15 = extendedBufferedReader11.getLastChar();
        boolean boolean16 = extendedBufferedReader11.markSupported();
        long long17 = extendedBufferedReader11.getLineNumber();
        java.io.Reader reader18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        long long20 = extendedBufferedReader19.getPosition();
        long long21 = extendedBufferedReader19.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader19);
        boolean boolean23 = extendedBufferedReader19.markSupported();
        long long24 = extendedBufferedReader19.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader19);
        java.io.Reader reader26 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader26);
        long long28 = extendedBufferedReader27.getBytesRead();
        extendedBufferedReader27.setClosed(false);
        long long31 = extendedBufferedReader27.getLineNumber();
        extendedBufferedReader27.mark((int) (byte) 10);
        boolean boolean34 = extendedBufferedReader27.isClosed();
        extendedBufferedReader27.mark((int) (short) 0);
        char[] charArray41 = new char[] { 'a', ' ', '4', '4' };
        int int44 = extendedBufferedReader27.read(charArray41, 0, 0);
        int int47 = extendedBufferedReader19.read(charArray41, 0, 0);
        int int50 = extendedBufferedReader11.read(charArray41, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = extendedBufferedReader1.read(charArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1158");
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
        long long12 = extendedBufferedReader7.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedBufferedReader7.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1159");
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
        extendedBufferedReader7.close();
        extendedBufferedReader7.setClosed(true);
        long long18 = extendedBufferedReader7.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1160");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        long long6 = extendedBufferedReader1.getBytesRead();
        long long7 = extendedBufferedReader1.getLineNumber();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.setClosed(true);
        extendedBufferedReader1.close();
        java.io.Reader reader12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        long long14 = extendedBufferedReader13.getPosition();
        long long15 = extendedBufferedReader13.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader13);
        long long17 = extendedBufferedReader16.getPosition();
        char[] charArray19 = new char[] { 'a' };
        int int22 = extendedBufferedReader16.read(charArray19, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedBufferedReader1.read(charArray19);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1161");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6, charset7, true);
        long long10 = extendedBufferedReader6.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1162");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long5 = extendedBufferedReader4.getPosition();
        long long6 = extendedBufferedReader4.getPosition();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getBytesRead();
        extendedBufferedReader8.setClosed(true);
        boolean boolean12 = extendedBufferedReader8.markSupported();
        long long13 = extendedBufferedReader8.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        int int15 = extendedBufferedReader14.getLastChar();
        extendedBufferedReader14.close();
        int int17 = extendedBufferedReader14.getLastChar();
        int int18 = extendedBufferedReader14.getLastChar();
        long long19 = extendedBufferedReader14.getBytesRead();
        extendedBufferedReader14.close();
        java.nio.charset.Charset charset21 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader14, charset21, true);
        java.io.Reader reader24 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        long long26 = extendedBufferedReader25.getBytesRead();
        extendedBufferedReader25.setClosed(true);
        java.io.Reader reader29 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader(reader29);
        long long31 = extendedBufferedReader30.getPosition();
        char[] charArray38 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int41 = extendedBufferedReader30.read(charArray38, (int) (byte) 1, (int) (byte) 0);
        int int44 = extendedBufferedReader25.read(charArray38, (-2), (int) (byte) 0);
        int int47 = extendedBufferedReader23.read(charArray38, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = extendedBufferedReader4.read(charArray38, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 100) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1163");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        extendedBufferedReader9.close();
        long long11 = extendedBufferedReader9.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1164");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        extendedBufferedReader2.setClosed(false);
        long long8 = extendedBufferedReader2.getLineNumber();
        extendedBufferedReader2.setClosed(false);
        java.lang.Class<?> wildcardClass11 = extendedBufferedReader2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1165");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getBytesRead();
        extendedBufferedReader15.setClosed(false);
        long long19 = extendedBufferedReader15.getLineNumber();
        boolean boolean20 = extendedBufferedReader15.markSupported();
        long long21 = extendedBufferedReader15.getBytesRead();
        java.io.Reader reader22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        long long24 = extendedBufferedReader23.getBytesRead();
        extendedBufferedReader23.setClosed(true);
        java.io.Reader reader27 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader(reader27);
        long long29 = extendedBufferedReader28.getPosition();
        char[] charArray36 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int39 = extendedBufferedReader28.read(charArray36, (int) (byte) 1, (int) (byte) 0);
        int int42 = extendedBufferedReader23.read(charArray36, (-2), (int) (byte) 0);
        int int45 = extendedBufferedReader15.read(charArray36, (int) (byte) -1, (int) (byte) 0);
        int int48 = extendedBufferedReader13.read(charArray36, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1166");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        extendedBufferedReader1.mark((int) '#');
        long long15 = extendedBufferedReader1.getBytesRead();
        long long16 = extendedBufferedReader1.getPosition();
        long long17 = extendedBufferedReader1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1167");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (short) 10);
        boolean boolean9 = extendedBufferedReader1.isClosed();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1168");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset10, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = extendedBufferedReader1.skip((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1169");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        boolean boolean9 = extendedBufferedReader7.isClosed();
        boolean boolean10 = extendedBufferedReader7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = extendedBufferedReader7.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1170");
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
        java.nio.charset.Charset charset34 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset34, true);
        int int37 = extendedBufferedReader36.getLastChar();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1171");
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
        extendedBufferedReader13.setClosed(false);
        long long18 = extendedBufferedReader13.getLineNumber();
        java.nio.CharBuffer charBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedBufferedReader13.read(charBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1172");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int8 = extendedBufferedReader7.getLastChar();
        extendedBufferedReader7.setClosed(false);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7, charset11, true);
        extendedBufferedReader13.mark(100);
        extendedBufferedReader13.setClosed(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1173");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int3 = extendedBufferedReader2.getLastChar();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        long long5 = extendedBufferedReader2.getPosition();
        boolean boolean6 = extendedBufferedReader2.isClosed();
        long long7 = extendedBufferedReader2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedBufferedReader2.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1174");
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
            java.lang.String str10 = extendedBufferedReader8.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1175");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.ready()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1176");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (short) 10);
        extendedBufferedReader1.reset();
        long long10 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.reset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1177");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long14 = extendedBufferedReader1.getPosition();
        java.nio.charset.Charset charset15 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset15, false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1178");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10, charset11, true);
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
        int int35 = extendedBufferedReader13.read(charArray29, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = extendedBufferedReader13.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1179");
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
        java.nio.charset.Charset charset31 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader30, charset31, false);
        extendedBufferedReader30.mark((int) (byte) 1);
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1180");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        char[] charArray18 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int21 = extendedBufferedReader10.read(charArray18, (int) (byte) 1, (int) (byte) 0);
        long long22 = extendedBufferedReader10.getPosition();
        java.io.Reader reader23 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        long long25 = extendedBufferedReader24.getPosition();
        char[] charArray32 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int35 = extendedBufferedReader24.read(charArray32, (int) (byte) 1, (int) (byte) 0);
        int int38 = extendedBufferedReader10.read(charArray32, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = extendedBufferedReader1.peek(charArray32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1181");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        boolean boolean9 = extendedBufferedReader1.isClosed();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1182");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader3.mark(0);
        extendedBufferedReader3.mark((int) ' ');
        long long8 = extendedBufferedReader3.getPosition();
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader3, charset9, false);
        long long12 = extendedBufferedReader11.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1183");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        boolean boolean7 = extendedBufferedReader1.isClosed();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader8.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1184");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2);
        long long6 = extendedBufferedReader5.getLineNumber();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1185");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.setClosed(true);
        boolean boolean11 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.setClosed(true);
        long long14 = extendedBufferedReader1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1186");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset5, false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1187");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.nio.charset.Charset charset3 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset3, true);
        java.io.Reader reader6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        long long8 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.setClosed(false);
        long long11 = extendedBufferedReader7.getLineNumber();
        boolean boolean12 = extendedBufferedReader7.markSupported();
        long long13 = extendedBufferedReader7.getBytesRead();
        java.io.Reader reader14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        long long16 = extendedBufferedReader15.getBytesRead();
        extendedBufferedReader15.setClosed(true);
        java.io.Reader reader19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        long long21 = extendedBufferedReader20.getPosition();
        char[] charArray28 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int31 = extendedBufferedReader20.read(charArray28, (int) (byte) 1, (int) (byte) 0);
        int int34 = extendedBufferedReader15.read(charArray28, (-2), (int) (byte) 0);
        int int37 = extendedBufferedReader7.read(charArray28, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = extendedBufferedReader2.read(charArray28, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + -1) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1188");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        long long5 = extendedBufferedReader1.getPosition();
        long long6 = extendedBufferedReader1.getPosition();
        int int7 = extendedBufferedReader1.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedBufferedReader1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1189");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Writer writer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = extendedBufferedReader20.transferTo(writer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1190");
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
        long long10 = extendedBufferedReader7.getPosition();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1191");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        boolean boolean10 = extendedBufferedReader1.isClosed();
        boolean boolean11 = extendedBufferedReader1.isClosed();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1192");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        boolean boolean5 = extendedBufferedReader2.markSupported();
        long long6 = extendedBufferedReader2.getLineNumber();
        extendedBufferedReader2.setClosed(true);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedBufferedReader2.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1193");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        extendedBufferedReader1.mark((int) (short) 100);
        java.nio.CharBuffer charBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedBufferedReader1.read(charBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.CharBuffer.isReadOnly()\" because \"target\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1194");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.mark((int) '#');
        extendedBufferedReader7.mark(0);
        java.lang.Class<?> wildcardClass12 = extendedBufferedReader7.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1195");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1196");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset4, false);
        extendedBufferedReader6.setClosed(true);
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6, charset9, true);
        long long12 = extendedBufferedReader6.getLineNumber();
        boolean boolean13 = extendedBufferedReader6.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1197");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.isClosed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1198");
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
        java.nio.charset.Charset charset31 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader30, charset31, false);
        java.nio.charset.Charset charset34 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader33, charset34, true);
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1199");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long11 = extendedBufferedReader8.getLineNumber();
        java.nio.charset.Charset charset12 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8, charset12, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedBufferedReader14.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1200");
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
        long long31 = extendedBufferedReader1.getLineNumber();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1201");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader(reader0, charset1, false);
        java.nio.charset.Charset charset4 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0, charset4, true);
        java.lang.Class<?> wildcardClass7 = reader0.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1202");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        long long9 = extendedBufferedReader1.getPosition();
        java.lang.Class<?> wildcardClass10 = extendedBufferedReader1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1203");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        boolean boolean8 = extendedBufferedReader1.isClosed();
        long long9 = extendedBufferedReader1.getBytesRead();
        java.nio.charset.Charset charset10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset10, true);
        java.io.Reader reader13 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        int int16 = extendedBufferedReader15.getLastChar();
        java.io.Reader reader17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        long long19 = extendedBufferedReader18.getPosition();
        char[] charArray26 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int29 = extendedBufferedReader18.read(charArray26, (int) (byte) 1, (int) (byte) 0);
        int int32 = extendedBufferedReader15.read(charArray26, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = extendedBufferedReader12.read(charArray26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1204");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader9.getLineNumber();
        long long11 = extendedBufferedReader9.getPosition();
        long long12 = extendedBufferedReader9.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedBufferedReader9.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1205");
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
        long long31 = extendedBufferedReader1.getPosition();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1206");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long8 = extendedBufferedReader1.skip((long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1207");
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
        extendedBufferedReader1.setClosed(true);
        long long33 = extendedBufferedReader1.getBytesRead();
        java.io.Writer writer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = extendedBufferedReader1.transferTo(writer34);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1208");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean7 = extendedBufferedReader6.isClosed();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(true);
        boolean boolean13 = extendedBufferedReader9.markSupported();
        java.nio.charset.Charset charset14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9, charset14, true);
        extendedBufferedReader16.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader16);
        java.nio.charset.Charset charset19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18, charset19, true);
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
        int int43 = extendedBufferedReader21.read(charArray37, (int) (byte) 10, (int) (short) 0);
        java.io.Reader reader44 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        long long46 = extendedBufferedReader45.getPosition();
        long long47 = extendedBufferedReader45.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader45);
        boolean boolean49 = extendedBufferedReader45.isClosed();
        java.nio.charset.Charset charset50 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader52 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader45, charset50, false);
        int int53 = extendedBufferedReader52.getLastChar();
        extendedBufferedReader52.setClosed(true);
        java.io.Reader reader56 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader57 = new org.apache.commons.csv.ExtendedBufferedReader(reader56);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader58 = new org.apache.commons.csv.ExtendedBufferedReader(reader56);
        int int59 = extendedBufferedReader58.getLastChar();
        java.io.Reader reader60 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader61 = new org.apache.commons.csv.ExtendedBufferedReader(reader60);
        long long62 = extendedBufferedReader61.getPosition();
        char[] charArray69 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int72 = extendedBufferedReader61.read(charArray69, (int) (byte) 1, (int) (byte) 0);
        int int75 = extendedBufferedReader58.read(charArray69, (int) (short) 1, (int) (short) 0);
        int int78 = extendedBufferedReader52.read(charArray69, (int) (byte) 10, (int) (short) 0);
        int int81 = extendedBufferedReader21.read(charArray69, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = extendedBufferedReader6.read(charArray69, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 100) out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-2) + "'", int53 == (-2));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1209");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long4 = extendedBufferedReader3.getPosition();
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader3, charset5, true);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        java.io.Reader reader9 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        long long11 = extendedBufferedReader10.getPosition();
        long long12 = extendedBufferedReader10.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        long long14 = extendedBufferedReader13.getPosition();
        char[] charArray16 = new char[] { 'a' };
        int int19 = extendedBufferedReader13.read(charArray16, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = extendedBufferedReader7.read(charArray16, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1210");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        boolean boolean4 = extendedBufferedReader1.isClosed();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        long long6 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1211");
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
            int int30 = extendedBufferedReader1.peek(charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1212");
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
        boolean boolean20 = extendedBufferedReader19.isClosed();
        long long21 = extendedBufferedReader19.getLineNumber();
        long long22 = extendedBufferedReader19.getPosition();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1213");
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
        long long32 = extendedBufferedReader1.getPosition();
        long long33 = extendedBufferedReader1.getPosition();
        long long34 = extendedBufferedReader1.getBytesRead();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1214");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        int int5 = extendedBufferedReader1.getLastChar();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.read();
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1215");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        int int9 = extendedBufferedReader8.getLastChar();
        boolean boolean10 = extendedBufferedReader8.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1216");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = extendedBufferedReader7.readLine();
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1217");
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
        extendedBufferedReader7.close();
        extendedBufferedReader7.setClosed(true);
        extendedBufferedReader7.close();
        java.nio.charset.Charset charset19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7, charset19, true);
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1218");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        int int6 = extendedBufferedReader1.getLastChar();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (short) 10);
        extendedBufferedReader1.setClosed(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1219");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        long long4 = extendedBufferedReader1.getPosition();
        boolean boolean5 = extendedBufferedReader1.isClosed();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.setClosed(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1220");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader9.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1221");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        extendedBufferedReader1.mark(100);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset11, false);
        long long14 = extendedBufferedReader13.getBytesRead();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1222");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getLineNumber();
        boolean boolean4 = extendedBufferedReader2.isClosed();
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedBufferedReader2.transferTo(writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1223");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        extendedBufferedReader1.mark((int) (short) 0);
        extendedBufferedReader1.setClosed(false);
        boolean boolean13 = extendedBufferedReader1.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader1.mark((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1224");
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
        int int30 = extendedBufferedReader1.getLastChar();
        long long31 = extendedBufferedReader1.getBytesRead();
        boolean boolean32 = extendedBufferedReader1.markSupported();
        long long33 = extendedBufferedReader1.getPosition();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1225");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        long long7 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark(100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1226");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        long long9 = extendedBufferedReader1.getPosition();
        int int10 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset11, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1227");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        extendedBufferedReader1.mark(100);
        boolean boolean11 = extendedBufferedReader1.markSupported();
        long long12 = extendedBufferedReader1.getPosition();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1228");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int5 = extendedBufferedReader1.getLastChar();
        char[] charArray6 = null;
        int int9 = extendedBufferedReader1.read(charArray6, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedBufferedReader1.skip((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1229");
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
        java.lang.Class<?> wildcardClass12 = extendedBufferedReader7.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1230");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.mark((int) (short) 0);
        java.nio.charset.Charset charset5 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset5, true);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1231");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader1.getPosition();
        java.io.Reader reader11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        long long13 = extendedBufferedReader12.getBytesRead();
        extendedBufferedReader12.setClosed(true);
        boolean boolean16 = extendedBufferedReader12.markSupported();
        java.nio.charset.Charset charset17 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12, charset17, true);
        extendedBufferedReader19.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader19);
        java.nio.charset.Charset charset22 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader21, charset22, true);
        java.io.Reader reader25 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader(reader25);
        long long27 = extendedBufferedReader26.getBytesRead();
        extendedBufferedReader26.setClosed(false);
        long long30 = extendedBufferedReader26.getLineNumber();
        extendedBufferedReader26.mark((int) (byte) 10);
        boolean boolean33 = extendedBufferedReader26.isClosed();
        extendedBufferedReader26.mark((int) (short) 0);
        char[] charArray40 = new char[] { 'a', ' ', '4', '4' };
        int int43 = extendedBufferedReader26.read(charArray40, 0, 0);
        int int46 = extendedBufferedReader24.read(charArray40, (int) (byte) 10, (int) (short) 0);
        java.io.Reader reader47 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader(reader47);
        long long49 = extendedBufferedReader48.getPosition();
        long long50 = extendedBufferedReader48.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader51 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader48);
        boolean boolean52 = extendedBufferedReader48.isClosed();
        java.nio.charset.Charset charset53 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader55 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader48, charset53, false);
        int int56 = extendedBufferedReader55.getLastChar();
        extendedBufferedReader55.setClosed(true);
        java.io.Reader reader59 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader60 = new org.apache.commons.csv.ExtendedBufferedReader(reader59);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader61 = new org.apache.commons.csv.ExtendedBufferedReader(reader59);
        int int62 = extendedBufferedReader61.getLastChar();
        java.io.Reader reader63 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader64 = new org.apache.commons.csv.ExtendedBufferedReader(reader63);
        long long65 = extendedBufferedReader64.getPosition();
        char[] charArray72 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int75 = extendedBufferedReader64.read(charArray72, (int) (byte) 1, (int) (byte) 0);
        int int78 = extendedBufferedReader61.read(charArray72, (int) (short) 1, (int) (short) 0);
        int int81 = extendedBufferedReader55.read(charArray72, (int) (byte) 10, (int) (short) 0);
        int int84 = extendedBufferedReader24.read(charArray72, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = extendedBufferedReader1.read(charArray72, 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-2) + "'", int62 == (-2));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1232");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getLineNumber();
        long long6 = extendedBufferedReader2.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2, charset7, true);
        java.io.Reader reader10 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        long long12 = extendedBufferedReader11.getBytesRead();
        extendedBufferedReader11.setClosed(false);
        long long15 = extendedBufferedReader11.getLineNumber();
        boolean boolean16 = extendedBufferedReader11.markSupported();
        long long17 = extendedBufferedReader11.getBytesRead();
        java.io.Reader reader18 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        long long20 = extendedBufferedReader19.getBytesRead();
        extendedBufferedReader19.setClosed(true);
        java.io.Reader reader23 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        long long25 = extendedBufferedReader24.getPosition();
        char[] charArray32 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int35 = extendedBufferedReader24.read(charArray32, (int) (byte) 1, (int) (byte) 0);
        int int38 = extendedBufferedReader19.read(charArray32, (-2), (int) (byte) 0);
        int int41 = extendedBufferedReader11.read(charArray32, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = extendedBufferedReader2.peek(charArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1233");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader1.isClosed();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader1.getPosition();
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
        int int40 = extendedBufferedReader12.read(charArray34, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = extendedBufferedReader1.read(charArray34);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1234");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.mark((int) '#');
        long long10 = extendedBufferedReader7.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1235");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.skip((long) 0);
        long long7 = extendedBufferedReader1.getLineNumber();
        int int8 = extendedBufferedReader1.getLastChar();
        long long9 = extendedBufferedReader1.getPosition();
        extendedBufferedReader1.mark((int) (short) 0);
        int int12 = extendedBufferedReader1.getLastChar();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1236");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.mark((int) ' ');
        long long8 = extendedBufferedReader1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1237");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long8 = extendedBufferedReader7.getBytesRead();
        extendedBufferedReader7.mark(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1238");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getPosition();
        extendedBufferedReader2.setClosed(true);
        int int6 = extendedBufferedReader2.getLastChar();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader2.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1239");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader(reader7);
        long long9 = extendedBufferedReader8.getPosition();
        long long10 = extendedBufferedReader8.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long12 = extendedBufferedReader11.getPosition();
        char[] charArray14 = new char[] { 'a' };
        int int17 = extendedBufferedReader11.read(charArray14, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedBufferedReader1.read(charArray14, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1240");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.mark((int) (byte) 10);
        long long10 = extendedBufferedReader1.skip(0L);
        long long11 = extendedBufferedReader1.getLineNumber();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1241");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader2.getBytesRead();
        long long4 = extendedBufferedReader2.getLineNumber();
        long long5 = extendedBufferedReader2.getBytesRead();
        boolean boolean6 = extendedBufferedReader2.isClosed();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1242");
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
        long long32 = extendedBufferedReader1.getPosition();
        boolean boolean33 = extendedBufferedReader1.isClosed();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1243");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        extendedBufferedReader1.setClosed(false);
        long long6 = extendedBufferedReader1.getLineNumber();
        java.nio.charset.Charset charset7 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset7, true);
        long long10 = extendedBufferedReader9.getBytesRead();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1244");
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
        long long11 = extendedBufferedReader1.getBytesRead();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1245");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        java.nio.charset.Charset charset11 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10, charset11, true);
        java.nio.charset.Charset charset14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader13, charset14, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader16);
        extendedBufferedReader16.mark((int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1246");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader2.setClosed(true);
        long long5 = extendedBufferedReader2.getBytesRead();
        extendedBufferedReader2.close();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1247");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        int int5 = extendedBufferedReader1.getLastChar();
        int int6 = extendedBufferedReader1.getLastChar();
        long long7 = extendedBufferedReader1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1248");
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
        java.nio.charset.Charset charset14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7, charset14, true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1249");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean18 = extendedBufferedReader1.isClosed();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = extendedBufferedReader1.peek();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1250");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(true);
        boolean boolean5 = extendedBufferedReader1.markSupported();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, true);
        extendedBufferedReader8.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader8);
        long long11 = extendedBufferedReader8.getLineNumber();
        extendedBufferedReader8.close();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1251");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long3 = extendedBufferedReader1.skip(0L);
        boolean boolean4 = extendedBufferedReader1.markSupported();
        long long6 = extendedBufferedReader1.skip((long) 0);
        long long7 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getPosition();
        long long11 = extendedBufferedReader9.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        long long13 = extendedBufferedReader12.getPosition();
        char[] charArray15 = new char[] { 'a' };
        int int18 = extendedBufferedReader12.read(charArray15, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedBufferedReader1.read(charArray15, 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + -2) out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1252");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        char[] charArray9 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int12 = extendedBufferedReader1.read(charArray9, (int) (byte) 1, (int) (byte) 0);
        long long13 = extendedBufferedReader1.getPosition();
        long long14 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean18 = extendedBufferedReader1.isClosed();
        boolean boolean19 = extendedBufferedReader1.markSupported();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1253");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        extendedBufferedReader1.setClosed(true);
        long long7 = extendedBufferedReader1.getPosition();
        long long8 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long10 = extendedBufferedReader1.getBytesRead();
        long long11 = extendedBufferedReader1.getLineNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1254");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader8 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader(reader8);
        long long10 = extendedBufferedReader9.getBytesRead();
        extendedBufferedReader9.setClosed(true);
        boolean boolean13 = extendedBufferedReader9.markSupported();
        java.nio.charset.Charset charset14 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9, charset14, true);
        extendedBufferedReader16.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader16);
        java.nio.charset.Charset charset19 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18, charset19, true);
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
        int int43 = extendedBufferedReader21.read(charArray37, (int) (byte) 10, (int) (short) 0);
        java.io.Reader reader44 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        long long46 = extendedBufferedReader45.getPosition();
        long long47 = extendedBufferedReader45.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader45);
        boolean boolean49 = extendedBufferedReader45.isClosed();
        java.nio.charset.Charset charset50 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader52 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader45, charset50, false);
        int int53 = extendedBufferedReader52.getLastChar();
        extendedBufferedReader52.setClosed(true);
        java.io.Reader reader56 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader57 = new org.apache.commons.csv.ExtendedBufferedReader(reader56);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader58 = new org.apache.commons.csv.ExtendedBufferedReader(reader56);
        int int59 = extendedBufferedReader58.getLastChar();
        java.io.Reader reader60 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader61 = new org.apache.commons.csv.ExtendedBufferedReader(reader60);
        long long62 = extendedBufferedReader61.getPosition();
        char[] charArray69 = new char[] { 'a', '#', 'a', 'a', 'a', '#' };
        int int72 = extendedBufferedReader61.read(charArray69, (int) (byte) 1, (int) (byte) 0);
        int int75 = extendedBufferedReader58.read(charArray69, (int) (short) 1, (int) (short) 0);
        int int78 = extendedBufferedReader52.read(charArray69, (int) (byte) 10, (int) (short) 0);
        int int81 = extendedBufferedReader21.read(charArray69, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int82 = extendedBufferedReader1.read(charArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'a', ' ', '4', '4' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-2) + "'", int53 == (-2));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2) + "'", int59 == (-2));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'a', '#', 'a', 'a', 'a', '#' });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1255");
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
        extendedBufferedReader1.setClosed(false);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.close()\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1256");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getBytesRead();
        extendedBufferedReader1.setClosed(false);
        long long5 = extendedBufferedReader1.getLineNumber();
        boolean boolean6 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.getBytesRead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader8.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedBufferedReader8.skip((long) (byte) 100);
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1257");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long3 = extendedBufferedReader1.getLineNumber();
        int int4 = extendedBufferedReader1.getLastChar();
        int int5 = extendedBufferedReader1.getLastChar();
        java.nio.charset.Charset charset6 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1, charset6, false);
        extendedBufferedReader8.setClosed(true);
        long long11 = extendedBufferedReader8.getLineNumber();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1258");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        long long2 = extendedBufferedReader1.getPosition();
        long long3 = extendedBufferedReader1.getPosition();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        long long5 = extendedBufferedReader4.getPosition();
        char[] charArray7 = new char[] { 'a' };
        int int10 = extendedBufferedReader4.read(charArray7, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = extendedBufferedReader4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1259");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedBufferedReader1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.Reader.read(char[], int, int)\" because \"this.in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExtendedBufferedReaderRegressionTest2.test1260");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = new org.apache.commons.csv.ExtendedBufferedReader(reader0, charset1, false);
        int int4 = extendedBufferedReader3.peek();
        java.lang.String str5 = extendedBufferedReader3.readLine();
        extendedBufferedReader3.setClosed(true);
        extendedBufferedReader3.setClosed(false);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
    }
}

