package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultWindDatasetRegressionTest0 {

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
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0001");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = defaultWindDataset0.getY((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0002");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = defaultWindDataset0.getY((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0003");
        java.lang.String[] strArray0 = null;
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset2 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), defaultWindDataset2, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1L), defaultWindDataset9, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1L), defaultWindDataset16, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1L), defaultWindDataset23, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), defaultWindDataset30, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset37 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1L), defaultWindDataset37, 10.0d, true, (byte) -1, (short) 1 };
        java.lang.Object[][] objArray43 = new java.lang.Object[][] { objArray7, objArray14, objArray21, objArray28, objArray35, objArray42 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset45 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1L), defaultWindDataset45, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset52 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1L), defaultWindDataset52, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset59 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-1L), defaultWindDataset59, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset66 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-1L), defaultWindDataset66, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset73 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray78 = new java.lang.Object[] { (-1L), defaultWindDataset73, 10.0d, true, (byte) -1, (short) 1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset80 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Object[] objArray85 = new java.lang.Object[] { (-1L), defaultWindDataset80, 10.0d, true, (byte) -1, (short) 1 };
        java.lang.Object[][] objArray86 = new java.lang.Object[][] { objArray50, objArray57, objArray64, objArray71, objArray78, objArray85 };
        java.lang.Object[][][] objArray87 = new java.lang.Object[][][] { objArray43, objArray86 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset88 = new org.jfree.data.xy.DefaultWindDataset(strArray0, objArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(objArray87);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0004");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.lang.Object[] objArray13 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[][] objArray21 = new java.lang.Object[][] { objArray13, objArray20 };
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[][] objArray36 = new java.lang.Object[][] { objArray28, objArray35 };
        java.lang.Object[] objArray43 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[] objArray50 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray43, objArray50 };
        java.lang.Object[] objArray58 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[] objArray65 = new java.lang.Object[] { 0, 100.0f, (short) 1, (-1), 100L, 1.0d };
        java.lang.Object[][] objArray66 = new java.lang.Object[][] { objArray58, objArray65 };
        java.lang.Object[][][] objArray67 = new java.lang.Object[][][] { objArray21, objArray36, objArray51, objArray66 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset68 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[0, 100.0, 1, -1, 100, 1.0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0005");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = defaultWindDataset0.getWindForce((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0006");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0007");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray1, objArray3, objArray5, objArray7, objArray9, objArray11 };
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray14, objArray16, objArray18, objArray20, objArray22, objArray24 };
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray38 = new java.lang.Object[][] { objArray27, objArray29, objArray31, objArray33, objArray35, objArray37 };
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray46 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray40, objArray42, objArray44, objArray46, objArray48, objArray50 };
        java.lang.Object[] objArray53 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray55 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray59 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray61 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray63 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray64 = new java.lang.Object[][] { objArray53, objArray55, objArray57, objArray59, objArray61, objArray63 };
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray68 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray70 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray72 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray74 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray77 = new java.lang.Object[][] { objArray66, objArray68, objArray70, objArray72, objArray74, objArray76 };
        java.lang.Object[][][] objArray78 = new java.lang.Object[][][] { objArray12, objArray25, objArray38, objArray51, objArray64, objArray77 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset79 = new org.jfree.data.xy.DefaultWindDataset(objArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0008");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0009");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset7.addChangeListener(datasetChangeListener10);
        java.lang.Object[] objArray13 = new java.lang.Object[] { '4', datasetChangeListener10, (short) -1 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultWindDataset15.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset15.addChangeListener(datasetChangeListener18);
        java.lang.Object[] objArray21 = new java.lang.Object[] { '4', datasetChangeListener18, (short) -1 };
        java.lang.Object[][] objArray22 = new java.lang.Object[][] { objArray13, objArray21 };
        java.lang.Object[][][] objArray23 = new java.lang.Object[][][] { objArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(list5, objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[4, null, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[4, null, -1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[4, null, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[4, null, -1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0010");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray0, objArray1 };
        java.lang.Object[][][] objArray3 = new java.lang.Object[][][] { objArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset4 = new org.jfree.data.xy.DefaultWindDataset(objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0011");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultWindDataset0.getItemCount(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0012");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultWindDataset0.getY((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0013");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        java.lang.Class<?> wildcardClass2 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0014");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(strArray5, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][][] {});
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0015");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getX((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0016");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindForce((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0017");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Class<?> wildcardClass3 = defaultWindDataset0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0018");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultWindDataset0.getX(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0019");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getY((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0020");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0L, 1.0f };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray13 = new java.lang.Object[] { 0L, 1.0f };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray13 };
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray10, objArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, 1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0021");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0022");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindForce(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0023");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass3 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0024");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0025");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0026");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindForce(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0027");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Class<?> wildcardClass7 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0028");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = defaultWindDataset0.getItemCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0029");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0d, "" };
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10.0d, "" };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray9, objArray12 };
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0d, "" };
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0d, "" };
        java.lang.Object[][] objArray20 = new java.lang.Object[][] { objArray16, objArray19 };
        java.lang.Object[][][] objArray21 = new java.lang.Object[][][] { objArray13, objArray20 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Number (java.lang.String and java.lang.Number are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10.0, ]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, ]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0, ]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0030");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray10 = new java.lang.Object[][][] { objArray7, objArray8, objArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0031");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray8, objArray9 };
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray11, objArray12, objArray13 };
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray10, objArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0032");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass8 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0033");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultWindDataset0.getSeriesKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0034");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0035");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.Object[][][] objArray3 = new java.lang.Object[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset4 = new org.jfree.data.xy.DefaultWindDataset(strArray2, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][][] {});
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0036");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindDirection((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0037");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0038");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindForce((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0039");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getWindDirection((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0040");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = defaultWindDataset0.getX((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0041");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        int int1 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultWindDataset0.getX((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0042");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0043");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] { objArray0, objArray1, objArray2, objArray3, objArray4 };
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray9, objArray11 };
        java.util.List list13 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray12);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean18 = defaultWindDataset16.equals((java.lang.Object) (byte) 100);
        boolean boolean19 = defaultWindDataset16.getNotify();
        java.lang.Object[] objArray20 = new java.lang.Object[] { "hi!", objArray12, (short) 1, boolean19 };
        java.lang.Object[][] objArray21 = new java.lang.Object[][] { objArray12 };
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray27 = new java.lang.Object[][] { objArray24, objArray26 };
        java.util.List list28 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray27);
        java.util.List list29 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray27);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset31 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean33 = defaultWindDataset31.equals((java.lang.Object) (byte) 100);
        boolean boolean34 = defaultWindDataset31.getNotify();
        java.lang.Object[] objArray35 = new java.lang.Object[] { "hi!", objArray27, (short) 1, boolean34 };
        java.lang.Object[][] objArray36 = new java.lang.Object[][] { objArray27 };
        java.lang.Object[] objArray39 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray41 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray42 = new java.lang.Object[][] { objArray39, objArray41 };
        java.util.List list43 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray42);
        java.util.List list44 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray42);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset46 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean48 = defaultWindDataset46.equals((java.lang.Object) (byte) 100);
        boolean boolean49 = defaultWindDataset46.getNotify();
        java.lang.Object[] objArray50 = new java.lang.Object[] { "hi!", objArray42, (short) 1, boolean49 };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray42 };
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray56 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray57 = new java.lang.Object[][] { objArray54, objArray56 };
        java.util.List list58 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray57);
        java.util.List list59 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray57);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset61 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean63 = defaultWindDataset61.equals((java.lang.Object) (byte) 100);
        boolean boolean64 = defaultWindDataset61.getNotify();
        java.lang.Object[] objArray65 = new java.lang.Object[] { "hi!", objArray57, (short) 1, boolean64 };
        java.lang.Object[][] objArray66 = new java.lang.Object[][] { objArray57 };
        java.lang.Object[] objArray69 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray72 = new java.lang.Object[][] { objArray69, objArray71 };
        java.util.List list73 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray72);
        java.util.List list74 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray72);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset76 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean78 = defaultWindDataset76.equals((java.lang.Object) (byte) 100);
        boolean boolean79 = defaultWindDataset76.getNotify();
        java.lang.Object[] objArray80 = new java.lang.Object[] { "hi!", objArray72, (short) 1, boolean79 };
        java.lang.Object[][] objArray81 = new java.lang.Object[][] { objArray72 };
        java.lang.Object[] objArray84 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray86 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray87 = new java.lang.Object[][] { objArray84, objArray86 };
        java.util.List list88 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray87);
        java.util.List list89 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray87);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset91 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean93 = defaultWindDataset91.equals((java.lang.Object) (byte) 100);
        boolean boolean94 = defaultWindDataset91.getNotify();
        java.lang.Object[] objArray95 = new java.lang.Object[] { "hi!", objArray87, (short) 1, boolean94 };
        java.lang.Object[][] objArray96 = new java.lang.Object[][] { objArray87 };
        java.lang.Object[][][] objArray97 = new java.lang.Object[][][] { objArray12, objArray36, objArray42, objArray57, objArray72, objArray87 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset98 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, [[-1.0], [-1.0]], 1, true]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[hi!, [[-1.0], [-1.0]], 1, true]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[hi!, [[-1.0], [-1.0]], 1, true]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[hi!, [[-1.0], [-1.0]], 1, true]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[hi!, [[-1.0], [-1.0]], 1, true]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[hi!, [[-1.0], [-1.0]], 1, true]");
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertNotNull(objArray97);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0044");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        java.lang.Class<?> wildcardClass7 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0045");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0046");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0047");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0048");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindForce((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0049");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0050");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray7 = new java.lang.Object[][][] { objArray1, objArray2, objArray3, objArray4, objArray5, objArray6 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset(objArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(strArray0, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0051");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0052");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray11 = new java.lang.Object[][][] { objArray5, objArray6, objArray7, objArray8, objArray9, objArray10 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(objArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(strArray4, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0053");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset2 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset2.removeChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset2.addChangeListener(datasetChangeListener5);
        defaultWindDataset2.setNotify(true);
        boolean boolean9 = defaultWindDataset2.getNotify();
        java.lang.Object[] objArray11 = new java.lang.Object[] { boolean9, 100.0f };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset12.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset12.addChangeListener(datasetChangeListener15);
        defaultWindDataset12.setNotify(true);
        boolean boolean19 = defaultWindDataset12.getNotify();
        java.lang.Object[] objArray21 = new java.lang.Object[] { boolean19, 100.0f };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultWindDataset22.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultWindDataset22.addChangeListener(datasetChangeListener25);
        defaultWindDataset22.setNotify(true);
        boolean boolean29 = defaultWindDataset22.getNotify();
        java.lang.Object[] objArray31 = new java.lang.Object[] { boolean29, 100.0f };
        java.lang.Object[][] objArray32 = new java.lang.Object[][] { objArray11, objArray21, objArray31 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset33 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultWindDataset33.removeChangeListener(datasetChangeListener34);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultWindDataset33.addChangeListener(datasetChangeListener36);
        defaultWindDataset33.setNotify(true);
        boolean boolean40 = defaultWindDataset33.getNotify();
        java.lang.Object[] objArray42 = new java.lang.Object[] { boolean40, 100.0f };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset43 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultWindDataset43.removeChangeListener(datasetChangeListener44);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener46 = null;
        defaultWindDataset43.addChangeListener(datasetChangeListener46);
        defaultWindDataset43.setNotify(true);
        boolean boolean50 = defaultWindDataset43.getNotify();
        java.lang.Object[] objArray52 = new java.lang.Object[] { boolean50, 100.0f };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset53 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener54 = null;
        defaultWindDataset53.removeChangeListener(datasetChangeListener54);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener56 = null;
        defaultWindDataset53.addChangeListener(datasetChangeListener56);
        defaultWindDataset53.setNotify(true);
        boolean boolean60 = defaultWindDataset53.getNotify();
        java.lang.Object[] objArray62 = new java.lang.Object[] { boolean60, 100.0f };
        java.lang.Object[][] objArray63 = new java.lang.Object[][] { objArray42, objArray52, objArray62 };
        java.lang.Object[][][] objArray64 = new java.lang.Object[][][] { objArray32, objArray63 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset65 = new org.jfree.data.xy.DefaultWindDataset(strArray1, objArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[true, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[true, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[true, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[true, 100.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0054");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0055");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        int int1 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = defaultWindDataset0.getItemCount(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0056");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultWindDataset0.getSeriesKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0057");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0058");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultWindDataset0.getSeriesKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0059");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce((int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0060");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(list5, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][][] {});
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0061");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = defaultWindDataset0.getItemCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0062");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        java.lang.Object obj8 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0063");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0064");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0065");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0066");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0067");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindForce(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0068");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "" };
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(strArray5, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0069");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultWindDataset0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0070");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset8.getItemCount(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0071");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0072");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0073");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray22 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray23 = new java.lang.Object[][][] { objArray17, objArray18, objArray19, objArray20, objArray21, objArray22 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(objArray23);
        java.util.List list25 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray23);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset26 = new org.jfree.data.xy.DefaultWindDataset(strArray16, objArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(list8, objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0074");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getX(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0075");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultWindDataset8.getY((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0076");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0077");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getX((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0078");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getWindDirection(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0079");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindDirection((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0080");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray11 = new java.lang.Object[][][] { objArray5, objArray6, objArray7, objArray8, objArray9, objArray10 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(objArray11);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(strArray4, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0081");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultWindDataset0.getItemCount((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0082");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset7.getY((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0083");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getY((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0084");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean4 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0085");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultWindDataset0.getItemCount((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0086");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0087");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0088");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindDirection((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0089");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindForce((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0090");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0091");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        java.lang.Class<?> wildcardClass4 = defaultWindDataset0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0092");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getY((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0093");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getX((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0094");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getY((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0095");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0096");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset16.getWindForce((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0097");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultWindDataset0.clone();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0098");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0099");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        java.lang.Class<?> wildcardClass10 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0100");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0101");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindDirection((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0102");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray10 = new java.lang.Object[][][] { objArray4, objArray5, objArray6, objArray7, objArray8, objArray9 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(strArray3, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0103");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        java.lang.Class<?> wildcardClass18 = defaultWindDataset16.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0104");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getY((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0105");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindDirection((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0106");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray16 = new java.lang.Object[][][] { objArray10, objArray11, objArray12, objArray13, objArray14, objArray15 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(objArray16);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(objArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(list8, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0107");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        java.lang.Class<?> wildcardClass1 = defaultWindDataset0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0108");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultWindDataset0.getSeriesKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0109");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getY((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0110");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0111");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultWindDataset0.getSeriesKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0112");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[][][] objArray17 = new java.lang.Object[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][][] {});
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0113");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        int int3 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindForce((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0114");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0115");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset7.getWindForce(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0116");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] { objArray0, objArray1, objArray2, objArray3, objArray4 };
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0117");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        boolean boolean10 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultWindDataset0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0118");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultWindDataset0.getSeriesKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0119");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset7.getWindForce((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0120");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0121");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindForce((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0122");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0123");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0124");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray9);
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray18 = new java.lang.Object[][][] { objArray12, objArray13, objArray14, objArray15, objArray16, objArray17 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(objArray18);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(objArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(list11, objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0125");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        boolean boolean10 = defaultWindDataset0.getNotify();
        java.lang.Class<?> wildcardClass11 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0126");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindDirection(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0127");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray11 = new java.lang.Object[][][] { objArray5, objArray6, objArray7, objArray8, objArray9, objArray10 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(objArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(strArray4, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0128");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray9);
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray18 = new java.lang.Object[][][] { objArray12, objArray13, objArray14, objArray15, objArray16, objArray17 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(objArray18);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(objArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(list11, objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0129");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = defaultWindDataset0.getItemCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0130");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        int int11 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindDirection(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0131");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getX((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0132");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getWindForce((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0133");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultWindDataset7.getItemCount((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0134");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        java.lang.Class<?> wildcardClass12 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0135");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getY((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0136");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultWindDataset0.getSeriesKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0137");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        int int11 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass12 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0138");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultWindDataset16.getSeriesKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0139");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0140");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Class<?> wildcardClass17 = objArray13.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0141");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        int int1 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultWindDataset0.getWindForce(6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0142");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultWindDataset0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0143");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultWindDataset0.getItemCount((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0144");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray19 = new java.lang.Object[][][] { objArray13, objArray14, objArray15, objArray16, objArray17, objArray18 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(objArray19);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray19);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(strArray12, objArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(list5, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0145");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindDirection((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0146");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] { objArray0, objArray1, objArray2, objArray3, objArray4 };
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.lang.Class<?> wildcardClass7 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0147");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.lang.Class<?> wildcardClass16 = objArray12.getClass();
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) objArray12);
        int int18 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultWindDataset0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0148");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset8.getWindDirection((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0149");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean8 = defaultWindDataset0.equals((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultWindDataset0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0150");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        java.lang.Object obj15 = defaultWindDataset7.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultWindDataset7.getWindForce((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0151");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.lang.Class<?> wildcardClass8 = defaultWindDataset7.getClass();
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0152");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        int int11 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getX((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0153");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0154");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getX((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0155");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        int int9 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0156");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        java.lang.Object obj2 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultWindDataset0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0157");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY((int) (short) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0158");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindDirection((int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0159");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray9);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0160");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultWindDataset0.getItemCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0161");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset0.getWindDirection(6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0162");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset9.getSeriesKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0163");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener12);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = defaultWindDataset0.getItemCount((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0164");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getWindForce((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0165");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindDirection(10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0166");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX(10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0167");
        java.util.List list0 = null;
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray7 = new java.lang.Object[][][] { objArray1, objArray2, objArray3, objArray4, objArray5, objArray6 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset(objArray7);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(objArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list0, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'seriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0168");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultWindDataset0.getSeriesKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0169");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getY(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0170");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0171");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindDirection((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0172");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultWindDataset7.getX((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0173");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX(6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0174");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0175");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = defaultWindDataset0.getItemCount((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0176");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultWindDataset16.getWindDirection(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0177");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        java.lang.Object obj2 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultWindDataset0.getSeriesKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0178");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list5, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0179");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray21 = new java.lang.Object[][] { objArray18, objArray20 };
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray24, objArray25 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(list23, objArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset28 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0180");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getWindDirection(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0181");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset16.getWindDirection((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0182");
        java.lang.String[] strArray0 = null;
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray7 = new java.lang.Object[][][] { objArray1, objArray2, objArray3, objArray4, objArray5, objArray6 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset(objArray7);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray7);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray7);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray7);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(strArray0, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0183");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0184");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getX(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0185");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0186");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce(1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0187");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj8 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0188");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean8 = defaultWindDataset0.equals((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultWindDataset0.getSeriesKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0189");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0190");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getY((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0191");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray21 = new java.lang.Object[][] { objArray18, objArray20 };
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray24, objArray25 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(list23, objArray26);
        java.util.List list28 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray26);
        java.util.List list29 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0192");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        java.lang.Object obj2 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultWindDataset0.getSeriesKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0193");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindDirection((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0194");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset12.getY((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0195");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getWindForce((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0196");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.lang.Object[][][] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0197");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultWindDataset10.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset10.addChangeListener(datasetChangeListener13);
        boolean boolean16 = defaultWindDataset10.equals((java.lang.Object) '4');
        boolean boolean17 = defaultWindDataset10.getNotify();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray22 = new java.lang.Object[][] { objArray19, objArray21 };
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray22);
        java.util.List list24 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray22);
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray26 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray27 = new java.lang.Object[][][] { objArray25, objArray26 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset28 = new org.jfree.data.xy.DefaultWindDataset(list24, objArray27);
        java.util.List list29 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray27);
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray27);
        boolean boolean31 = defaultWindDataset10.equals((java.lang.Object) objArray27);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset32 = new org.jfree.data.xy.DefaultWindDataset(objArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset33 = new org.jfree.data.xy.DefaultWindDataset(list9, objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0198");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = defaultWindDataset0.getItemCount((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0199");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener12);
        java.lang.Object obj14 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0200");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultWindDataset18.removeChangeListener(datasetChangeListener19);
        defaultWindDataset18.setNotify(true);
        java.lang.Object[] objArray23 = new java.lang.Object[] { defaultWindDataset18 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultWindDataset24.removeChangeListener(datasetChangeListener25);
        defaultWindDataset24.setNotify(true);
        java.lang.Object[] objArray29 = new java.lang.Object[] { defaultWindDataset24 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultWindDataset30.removeChangeListener(datasetChangeListener31);
        defaultWindDataset30.setNotify(true);
        java.lang.Object[] objArray35 = new java.lang.Object[] { defaultWindDataset30 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset36 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultWindDataset36.removeChangeListener(datasetChangeListener37);
        defaultWindDataset36.setNotify(true);
        java.lang.Object[] objArray41 = new java.lang.Object[] { defaultWindDataset36 };
        java.lang.Object[][] objArray42 = new java.lang.Object[][] { objArray23, objArray29, objArray35, objArray41 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset43 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultWindDataset43.removeChangeListener(datasetChangeListener44);
        defaultWindDataset43.setNotify(true);
        java.lang.Object[] objArray48 = new java.lang.Object[] { defaultWindDataset43 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset49 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener50 = null;
        defaultWindDataset49.removeChangeListener(datasetChangeListener50);
        defaultWindDataset49.setNotify(true);
        java.lang.Object[] objArray54 = new java.lang.Object[] { defaultWindDataset49 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset55 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener56 = null;
        defaultWindDataset55.removeChangeListener(datasetChangeListener56);
        defaultWindDataset55.setNotify(true);
        java.lang.Object[] objArray60 = new java.lang.Object[] { defaultWindDataset55 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset61 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener62 = null;
        defaultWindDataset61.removeChangeListener(datasetChangeListener62);
        defaultWindDataset61.setNotify(true);
        java.lang.Object[] objArray66 = new java.lang.Object[] { defaultWindDataset61 };
        java.lang.Object[][] objArray67 = new java.lang.Object[][] { objArray48, objArray54, objArray60, objArray66 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset68 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener69 = null;
        defaultWindDataset68.removeChangeListener(datasetChangeListener69);
        defaultWindDataset68.setNotify(true);
        java.lang.Object[] objArray73 = new java.lang.Object[] { defaultWindDataset68 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset74 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener75 = null;
        defaultWindDataset74.removeChangeListener(datasetChangeListener75);
        defaultWindDataset74.setNotify(true);
        java.lang.Object[] objArray79 = new java.lang.Object[] { defaultWindDataset74 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset80 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener81 = null;
        defaultWindDataset80.removeChangeListener(datasetChangeListener81);
        defaultWindDataset80.setNotify(true);
        java.lang.Object[] objArray85 = new java.lang.Object[] { defaultWindDataset80 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset86 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener87 = null;
        defaultWindDataset86.removeChangeListener(datasetChangeListener87);
        defaultWindDataset86.setNotify(true);
        java.lang.Object[] objArray91 = new java.lang.Object[] { defaultWindDataset86 };
        java.lang.Object[][] objArray92 = new java.lang.Object[][] { objArray73, objArray79, objArray85, objArray91 };
        java.lang.Object[][][] objArray93 = new java.lang.Object[][][] { objArray42, objArray67, objArray92 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset94 = new org.jfree.data.xy.DefaultWindDataset(list17, objArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertNotNull(objArray93);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0201");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray3, objArray4, objArray5, objArray6, objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(objArray9);
        boolean boolean11 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindDirection((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0202");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0203");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.lang.Class<?> wildcardClass12 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0204");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        java.lang.Object obj2 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getY(6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0205");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0206");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        java.lang.Object obj10 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getY(6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0207");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray11, objArray13 };
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray14);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray14);
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray19 = new java.lang.Object[][][] { objArray17, objArray18 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(list16, objArray19);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(list9, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0208");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindForce(6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0209");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getX((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0210");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0211");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        int int3 = defaultWindDataset0.getSeriesCount();
        boolean boolean4 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0212");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getY(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0213");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getY((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0214");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray22 = new java.lang.Object[][] { objArray19, objArray21 };
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray22);
        java.util.List list24 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray22);
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray26 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray27 = new java.lang.Object[][][] { objArray25, objArray26 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset28 = new org.jfree.data.xy.DefaultWindDataset(list24, objArray27);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset29 = new org.jfree.data.xy.DefaultWindDataset(objArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(list17, objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0215");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getY(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0216");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultWindDataset0.getSeriesKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0217");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0218");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(true);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0219");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray9);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray22 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray25 = new java.lang.Object[][][] { objArray19, objArray20, objArray21, objArray22, objArray23, objArray24 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset26 = new org.jfree.data.xy.DefaultWindDataset(objArray25);
        java.util.List list27 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset28 = new org.jfree.data.xy.DefaultWindDataset(strArray18, objArray25);
        java.util.List list29 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(list11, objArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0220");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getX((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0221");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getY(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0222");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = defaultWindDataset0.getItemCount(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0223");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        int int1 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultWindDataset0.getWindForce((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0224");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        int int9 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj10 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0225");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0226");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0227");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultWindDataset7.getWindDirection(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0228");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindDirection(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0229");
        java.lang.Object[][][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset1 = new org.jfree.data.xy.DefaultWindDataset(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0230");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultWindDataset0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0231");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0232");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset11.getX((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0233");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = defaultWindDataset0.getItemCount((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0234");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean8 = defaultWindDataset0.equals((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultWindDataset0.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0235");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getY(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0236");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0237");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindForce((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0238");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultWindDataset0.getSeriesKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0239");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0240");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset9.getX((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0241");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindDirection(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0242");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0243");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj8 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getY((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0244");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindForce((int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0245");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        boolean boolean7 = defaultWindDataset0.getNotify();
        int int8 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getX((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0246");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultWindDataset18.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset18.addChangeListener(datasetChangeListener21);
        boolean boolean24 = defaultWindDataset18.equals((java.lang.Object) '4');
        boolean boolean25 = defaultWindDataset18.getNotify();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray30 = new java.lang.Object[][] { objArray27, objArray29 };
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray30);
        java.util.List list32 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray30);
        java.lang.Object[][] objArray33 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray34 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray35 = new java.lang.Object[][][] { objArray33, objArray34 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset36 = new org.jfree.data.xy.DefaultWindDataset(list32, objArray35);
        java.util.List list37 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray35);
        java.util.List list38 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray35);
        boolean boolean39 = defaultWindDataset18.equals((java.lang.Object) objArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset40 = new org.jfree.data.xy.DefaultWindDataset(list17, objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0247");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        int int3 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindForce((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0248");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray10, objArray12 };
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray18 = new java.lang.Object[][][] { objArray16, objArray17 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(list15, objArray18);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        boolean boolean22 = defaultWindDataset0.equals((java.lang.Object) list21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultWindDataset0.getWindDirection((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0249");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0250");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener2);
        java.lang.Object obj4 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0251");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getWindForce((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0252");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultWindDataset16.getWindDirection((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0253");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        java.lang.Object obj2 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultWindDataset0.getSeriesKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0254");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultWindDataset16.getSeriesKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0255");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getX((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0256");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener12);
        defaultWindDataset0.setNotify(true);
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0257");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        java.lang.Class<?> wildcardClass10 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0258");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindDirection(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0259");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray20 = new java.lang.Object[][] { objArray17, objArray19 };
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray25 = new java.lang.Object[][][] { objArray23, objArray24 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset26 = new org.jfree.data.xy.DefaultWindDataset(list22, objArray25);
        java.util.List list27 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset28 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0260");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0261");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0262");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindDirection((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0263");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj6 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0264");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "Series 2", "hi!" };
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray17 = new java.lang.Object[][][] { objArray11, objArray12, objArray13, objArray14, objArray15, objArray16 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(objArray17);
        java.util.List list19 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(strArray10, objArray17);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(objArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(strArray3, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "Series 2", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0265");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset9.getX((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0266");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] { objArray0, objArray1, objArray2 };
        java.util.List list4 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray3);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset5 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset5.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset5.addChangeListener(datasetChangeListener8);
        boolean boolean11 = defaultWindDataset5.equals((java.lang.Object) '4');
        boolean boolean12 = defaultWindDataset5.getNotify();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray17 = new java.lang.Object[][] { objArray14, objArray16 };
        java.util.List list18 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray17);
        java.util.List list19 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray17);
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray22 = new java.lang.Object[][][] { objArray20, objArray21 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(list19, objArray22);
        java.util.List list24 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray22);
        java.util.List list25 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray22);
        boolean boolean26 = defaultWindDataset5.equals((java.lang.Object) objArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(list4, objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0267");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getX((int) (short) 10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0268");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0269");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0270");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean5 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = defaultWindDataset0.getItemCount((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0271");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray8 = new java.lang.Object[][] { objArray5, objArray7 };
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray8);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray8);
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(list10, objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(strArray3, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0272");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindDirection((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0273");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        java.lang.Object obj8 = defaultWindDataset0.clone();
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0274");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        int int3 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindDirection(6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0275");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        int int1 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.validateObject();
        java.lang.Class<?> wildcardClass5 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0276");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset16.getY((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0277");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener15);
        int int17 = defaultWindDataset7.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset7.addChangeListener(datasetChangeListener18);
        java.lang.Comparable comparable21 = defaultWindDataset7.getSeriesKey(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultWindDataset7.getY((int) (short) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "Series 2" + "'", comparable21, "Series 2");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0278");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        java.lang.Object obj6 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindDirection((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0279");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindForce((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0280");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray8 = new java.lang.Object[][][] { objArray2, objArray3, objArray4, objArray5, objArray6, objArray7 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(objArray8);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(strArray1, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0281");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultWindDataset16.addChangeListener(datasetChangeListener19);
        boolean boolean22 = defaultWindDataset16.equals((java.lang.Object) '4');
        boolean boolean23 = defaultWindDataset16.getNotify();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray28 = new java.lang.Object[][] { objArray25, objArray27 };
        java.util.List list29 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray28);
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray28);
        java.lang.Object[][] objArray31 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray32 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray33 = new java.lang.Object[][][] { objArray31, objArray32 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset34 = new org.jfree.data.xy.DefaultWindDataset(list30, objArray33);
        java.util.List list35 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray33);
        java.util.List list36 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray33);
        boolean boolean37 = defaultWindDataset16.equals((java.lang.Object) objArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset38 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0282");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindForce(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0283");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0284");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset10.getWindDirection((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0285");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindDirection(6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0286");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindForce(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0287");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getY(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0288");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getY((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0289");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        java.lang.Object obj2 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getY((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0290");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0291");
        java.lang.String[] strArray1 = new java.lang.String[] { "Series 2" };
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray8 = new java.lang.Object[][][] { objArray2, objArray3, objArray4, objArray5, objArray6, objArray7 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(objArray8);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(strArray1, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Series 2" });
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0292");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0293");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0294");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0295");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.lang.Class<?> wildcardClass16 = objArray12.getClass();
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) objArray12);
        int int18 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass19 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0296");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0297");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultWindDataset0.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0298");
        java.lang.String[] strArray0 = null;
        java.lang.Object[][][] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset2 = new org.jfree.data.xy.DefaultWindDataset(strArray0, objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0299");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        java.lang.Object obj10 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getY(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0300");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getX((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0301");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset16.getWindForce((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0302");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0303");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0304");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getX(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0305");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0306");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Class<?> wildcardClass6 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0307");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        java.lang.Object obj6 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultWindDataset0.getSeriesKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0308");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[][][] objArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0309");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0310");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] { objArray0, objArray1, objArray2, objArray3, objArray4 };
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0311");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        int int3 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass4 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0312");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = defaultWindDataset0.getItemCount(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0313");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray16 = new java.lang.Object[][][] { objArray10, objArray11, objArray12, objArray13, objArray14, objArray15 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(objArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(list8, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0314");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindDirection((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0315");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindDirection((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0316");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindForce((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0317");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "Series 2", "Series 2", "Series 2" };
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(strArray5, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "Series 2", "Series 2", "Series 2" });
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0318");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "Series 2" };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset4 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset4.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset4.addChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultWindDataset4.equals((java.lang.Object) '4');
        boolean boolean11 = defaultWindDataset4.getNotify();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray16 = new java.lang.Object[][] { objArray13, objArray15 };
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray16);
        java.util.List list18 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray16);
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray21 = new java.lang.Object[][][] { objArray19, objArray20 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(list18, objArray21);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray21);
        java.util.List list24 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray21);
        boolean boolean25 = defaultWindDataset4.equals((java.lang.Object) objArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset26 = new org.jfree.data.xy.DefaultWindDataset(strArray3, objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "hi!", "Series 2" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0319");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener12);
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj16 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultWindDataset0.getY((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0320");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        boolean boolean6 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0321");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        java.lang.Object obj6 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultWindDataset0.getSeriesKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0322");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getWindDirection(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0323");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset16.getY(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0324");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0325");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultWindDataset0.equals(obj6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getY((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0326");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce(6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0327");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultWindDataset0.getItemCount((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0328");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray3, objArray4, objArray5, objArray6, objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(objArray9);
        boolean boolean11 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset10);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener14);
        int int16 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultWindDataset0.getX((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0329");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        int int12 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getWindDirection((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0330");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultWindDataset0.getSeriesKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0331");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        boolean boolean4 = defaultWindDataset0.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultWindDataset0.getSeriesKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0332");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.lang.Object[][][] objArray11 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(objArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][][] {});
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0333");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0334");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset9 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = defaultWindDataset9.getItemCount(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0335");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset12.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset12.addChangeListener(datasetChangeListener15);
        boolean boolean18 = defaultWindDataset12.equals((java.lang.Object) '4');
        boolean boolean19 = defaultWindDataset12.getNotify();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray24 = new java.lang.Object[][] { objArray21, objArray23 };
        java.util.List list25 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray24);
        java.util.List list26 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray24);
        java.lang.Object[][] objArray27 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray28 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray29 = new java.lang.Object[][][] { objArray27, objArray28 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(list26, objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        java.util.List list32 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        boolean boolean33 = defaultWindDataset12.equals((java.lang.Object) objArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset34 = new org.jfree.data.xy.DefaultWindDataset(list11, objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0336");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0337");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindDirection((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0338");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        java.lang.Class<?> wildcardClass18 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0339");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass6 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0340");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getY((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0341");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass11 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0342");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        boolean boolean6 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener7);
        boolean boolean9 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0343");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0344");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        java.lang.Object obj7 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindForce(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0345");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list1 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0346");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        java.lang.Class<?> wildcardClass10 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0347");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        java.lang.Object obj15 = defaultWindDataset7.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultWindDataset7.getWindForce((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0348");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindForce(6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0349");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.lang.Class<?> wildcardClass16 = objArray12.getClass();
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) objArray12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultWindDataset0.getWindForce((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0350");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset1 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultWindDataset1.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset1.addChangeListener(datasetChangeListener4);
        boolean boolean7 = defaultWindDataset1.equals((java.lang.Object) '4');
        boolean boolean8 = defaultWindDataset1.getNotify();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray10, objArray12 };
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray18 = new java.lang.Object[][][] { objArray16, objArray17 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(list15, objArray18);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        boolean boolean22 = defaultWindDataset1.equals((java.lang.Object) objArray18);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(objArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(strArray0, objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0351");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0352");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        int int7 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindDirection(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0353");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean5 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0354");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj9 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0355");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultWindDataset0.getY((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0356");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset16.getX((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0357");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getWindDirection((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0358");
        java.lang.String[] strArray3 = new java.lang.String[] { "Series 2", "", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray17 = new java.lang.Object[][][] { objArray11, objArray12, objArray13, objArray14, objArray15, objArray16 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(objArray17);
        java.util.List list19 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(strArray10, objArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(strArray3, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Series 2", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0359");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getY(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0360");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getY(6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0361");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0362");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray11, objArray13 };
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray14);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray14);
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray19 = new java.lang.Object[][][] { objArray17, objArray18 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(list16, objArray19);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray19);
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray19);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(objArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(list9, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0363");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener6);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0364");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        java.lang.Object obj10 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getWindDirection(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0365");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0366");
        java.lang.Object[][][] objArray0 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset1 = new org.jfree.data.xy.DefaultWindDataset(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultWindDataset1.getWindForce((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][][] {});
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0367");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray3, objArray4, objArray5, objArray6, objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(objArray9);
        boolean boolean11 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset10);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener14);
        int int16 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass17 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0368");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray19 = new java.lang.Object[][][] { objArray13, objArray14, objArray15, objArray16, objArray17, objArray18 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(objArray19);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(strArray12, objArray19);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(objArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(list5, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0369");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = defaultWindDataset0.getItemCount(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0370");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        int int6 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0371");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "Series 2", "hi!", "", "" };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset7.addChangeListener(datasetChangeListener10);
        boolean boolean13 = defaultWindDataset7.equals((java.lang.Object) '4');
        boolean boolean14 = defaultWindDataset7.getNotify();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray19 = new java.lang.Object[][] { objArray16, objArray18 };
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray19);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray19);
        java.lang.Object[][] objArray22 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray24 = new java.lang.Object[][][] { objArray22, objArray23 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset25 = new org.jfree.data.xy.DefaultWindDataset(list21, objArray24);
        java.util.List list26 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray24);
        java.util.List list27 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray24);
        boolean boolean28 = defaultWindDataset7.equals((java.lang.Object) objArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset29 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "Series 2", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0372");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0373");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener15);
        int int17 = defaultWindDataset7.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset7.addChangeListener(datasetChangeListener18);
        java.lang.Comparable comparable21 = defaultWindDataset7.getSeriesKey(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultWindDataset7.getWindDirection((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "Series 2" + "'", comparable21, "Series 2");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0374");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getX((int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0375");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = defaultWindDataset0.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0376");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Class<?> wildcardClass6 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0377");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[][][] objArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0378");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        boolean boolean15 = defaultWindDataset8.getNotify();
        defaultWindDataset8.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultWindDataset8.getY(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0379");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0380");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener6);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0381");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        boolean boolean6 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0382");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray22 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray24 = new java.lang.Object[][][] { objArray18, objArray19, objArray20, objArray21, objArray22, objArray23 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset25 = new org.jfree.data.xy.DefaultWindDataset(objArray24);
        java.util.List list26 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray24);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(strArray17, objArray24);
        java.util.List list28 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset29 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0383");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce((int) '4', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0384");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        int int3 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0385");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener15);
        defaultWindDataset7.validateObject();
        boolean boolean18 = defaultWindDataset7.getNotify();
        int int19 = defaultWindDataset7.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultWindDataset7.getY((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0386");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        java.lang.Object obj18 = defaultWindDataset16.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultWindDataset16.getSeriesKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0387");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultWindDataset16.getSeriesKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0388");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        boolean boolean15 = defaultWindDataset8.getNotify();
        defaultWindDataset8.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset8.addChangeListener(datasetChangeListener17);
        java.lang.Object obj19 = defaultWindDataset8.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultWindDataset8.getY((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0389");
        java.lang.String[] strArray5 = new java.lang.String[] { "Series 2", "hi!", "hi!", "hi!", "Series 2" };
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray5, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "Series 2", "hi!", "hi!", "hi!", "Series 2" });
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0390");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        int int6 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0391");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        int int9 = defaultWindDataset0.getSeriesCount();
        boolean boolean10 = defaultWindDataset0.getNotify();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray22 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray24 = new java.lang.Object[][][] { objArray18, objArray19, objArray20, objArray21, objArray22, objArray23 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset25 = new org.jfree.data.xy.DefaultWindDataset(objArray24);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset26 = new org.jfree.data.xy.DefaultWindDataset(strArray17, objArray24);
        boolean boolean27 = defaultWindDataset0.equals((java.lang.Object) defaultWindDataset26);
        boolean boolean28 = defaultWindDataset26.getNotify();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0392");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray17 = new java.lang.Object[][][] { objArray11, objArray12, objArray13, objArray14, objArray15, objArray16 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(objArray17);
        java.util.List list19 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0393");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        int int3 = defaultWindDataset0.getSeriesCount();
        int int4 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0394");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        defaultWindDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0395");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.lang.Object[][][] objArray11 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(objArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(list10, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][][] {});
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0396");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        boolean boolean15 = defaultWindDataset8.getNotify();
        defaultWindDataset8.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset8.addChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultWindDataset8.getWindForce((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0397");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0398");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean5 = defaultWindDataset0.getNotify();
        int int6 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass7 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0399");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        boolean boolean5 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0400");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0401");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray16 = new java.lang.Object[][] { objArray13, objArray15 };
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray16);
        java.util.List list18 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray16);
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray21 = new java.lang.Object[][][] { objArray19, objArray20 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(list18, objArray21);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(objArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(list11, objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0402");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        defaultWindDataset0.setNotify(false);
        boolean boolean10 = defaultWindDataset0.getNotify();
        java.lang.Class<?> wildcardClass11 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0403");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        boolean boolean10 = defaultWindDataset0.getNotify();
        int int11 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass12 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0404");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(list5, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0405");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj8 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getY((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0406");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindDirection((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0407");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0408");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        boolean boolean15 = defaultWindDataset8.getNotify();
        int int16 = defaultWindDataset8.getSeriesCount();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray21 = new java.lang.Object[][] { objArray18, objArray20 };
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray24, objArray25 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(list23, objArray26);
        boolean boolean28 = defaultWindDataset8.equals((java.lang.Object) list23);
        java.lang.Class<?> wildcardClass29 = list23.getClass();
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0409");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray20 = new java.lang.Object[][] { objArray17, objArray19 };
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray25 = new java.lang.Object[][][] { objArray23, objArray24 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset26 = new org.jfree.data.xy.DefaultWindDataset(list22, objArray25);
        java.util.List list27 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        java.util.List list28 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset29 = new org.jfree.data.xy.DefaultWindDataset(objArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0410");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultWindDataset0.hasListener(eventListener8);
        java.lang.Object obj10 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0411");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getY((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0412");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray10, objArray12 };
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray18 = new java.lang.Object[][][] { objArray16, objArray17 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(list15, objArray18);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        boolean boolean22 = defaultWindDataset0.equals((java.lang.Object) list21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultWindDataset0.getSeriesKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0413");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.lang.Class<?> wildcardClass16 = objArray12.getClass();
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) objArray12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener18);
        int int20 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = defaultWindDataset0.getItemCount((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0414");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0415");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getX((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0416");
        java.lang.Object[][][] objArray0 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset1 = new org.jfree.data.xy.DefaultWindDataset(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultWindDataset1.getX((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][][] {});
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0417");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener15);
        int int17 = defaultWindDataset7.getSeriesCount();
        java.lang.Object obj18 = defaultWindDataset7.clone();
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0418");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        java.lang.Object obj12 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getX(6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0419");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        boolean boolean8 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getX((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0420");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getY((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0421");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0422");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getWindForce((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0423");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0424");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray12 = new java.lang.Object[][][] { objArray6, objArray7, objArray8, objArray9, objArray10, objArray11 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset13 = new org.jfree.data.xy.DefaultWindDataset(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray12);
        java.lang.Class<?> wildcardClass16 = objArray12.getClass();
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) objArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset0.getX((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0425");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultWindDataset0.getSeriesKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0426");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        boolean boolean6 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindForce((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0427");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener11);
        boolean boolean13 = defaultWindDataset0.getNotify();
        java.lang.Class<?> wildcardClass14 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0428");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0429");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
        java.lang.Object obj7 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindDirection((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0430");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getY(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0431");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultWindDataset0.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0432");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        boolean boolean4 = defaultWindDataset0.equals((java.lang.Object) "hi!");
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindDirection(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0433");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultWindDataset7.hasListener(eventListener17);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0434");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        boolean boolean2 = defaultWindDataset0.getNotify();
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getY(100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0435");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        boolean boolean15 = defaultWindDataset8.getNotify();
        int int16 = defaultWindDataset8.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultWindDataset8.getWindForce((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0436");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray3, objArray4, objArray5, objArray6, objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(objArray9);
        boolean boolean11 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset10);
        java.lang.Object obj12 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getY((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0437");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray10, objArray12 };
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray13);
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray18 = new java.lang.Object[][][] { objArray16, objArray17 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(list15, objArray18);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray18);
        boolean boolean22 = defaultWindDataset0.equals((java.lang.Object) list21);
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray26 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray27 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray28 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray29 = new java.lang.Object[][][] { objArray23, objArray24, objArray25, objArray26, objArray27, objArray28 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        java.util.List list32 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        java.util.List list33 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        java.util.List list34 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset35 = new org.jfree.data.xy.DefaultWindDataset(list21, objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0438");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        defaultWindDataset0.setNotify(false);
        boolean boolean10 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultWindDataset0.getItemCount((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0439");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindDirection((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0440");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0441");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getY((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0442");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        java.lang.Class<?> wildcardClass5 = defaultWindDataset0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0443");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener10);
        java.lang.Object obj12 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0444");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener15);
        int int17 = defaultWindDataset7.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultWindDataset7.getSeriesKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0445");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        int int7 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj8 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0446");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        int int6 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getY((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0447");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0448");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        boolean boolean10 = defaultWindDataset0.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0449");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener17);
        boolean boolean19 = defaultWindDataset16.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset16.addChangeListener(datasetChangeListener20);
        defaultWindDataset16.validateObject();
        java.lang.Class<?> wildcardClass23 = defaultWindDataset16.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0450");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindDirection(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0451");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0452");
        java.util.List list0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray14 = new java.lang.Object[][][] { objArray8, objArray9, objArray10, objArray11, objArray12, objArray13 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(objArray14);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray7, objArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(list0, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'seriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0453");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getY((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0454");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0455");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindDirection((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0456");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        boolean boolean6 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindDirection((int) (short) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0457");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindForce(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0458");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0459");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray9, objArray11 };
        java.util.List list13 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray12);
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray17 = new java.lang.Object[][][] { objArray15, objArray16 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(list14, objArray17);
        java.util.List list19 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        boolean boolean21 = defaultWindDataset0.equals((java.lang.Object) objArray17);
        int int22 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultWindDataset0.getSeriesKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0460");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        java.lang.Object obj9 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0461");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        boolean boolean15 = defaultWindDataset8.getNotify();
        defaultWindDataset8.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultWindDataset8.getSeriesKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0462");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        int int12 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultWindDataset0.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0463");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray3, objArray4, objArray5, objArray6, objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(objArray9);
        boolean boolean11 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset10);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray20 = new java.lang.Object[][] { objArray17, objArray19 };
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        boolean boolean22 = defaultWindDataset0.equals((java.lang.Object) objArray20);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.util.List list24 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray26 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray27 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray28 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray29 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray30 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray31 = new java.lang.Object[][][] { objArray25, objArray26, objArray27, objArray28, objArray29, objArray30 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset32 = new org.jfree.data.xy.DefaultWindDataset(objArray31);
        java.util.List list33 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray31);
        java.util.List list34 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray31);
        java.util.List list35 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset36 = new org.jfree.data.xy.DefaultWindDataset(list24, objArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0464");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray18 = new java.lang.Object[][][] { objArray12, objArray13, objArray14, objArray15, objArray16, objArray17 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(objArray18);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(strArray11, objArray18);
        defaultWindDataset20.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultWindDataset20.removeChangeListener(datasetChangeListener23);
        boolean boolean25 = defaultWindDataset0.equals((java.lang.Object) datasetChangeListener23);
        java.lang.Class<?> wildcardClass26 = defaultWindDataset0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0465");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.equals((java.lang.Object) defaultWindDataset16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = defaultWindDataset0.getItemCount((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0466");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultWindDataset0.getWindDirection((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0467");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener18);
        defaultWindDataset16.validateObject();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0468");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "Series 2" };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray10 = new java.lang.Object[][][] { objArray4, objArray5, objArray6, objArray7, objArray8, objArray9 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        java.util.List list13 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(strArray3, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!", "Series 2" });
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0469");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        int int4 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0470");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = defaultWindDataset0.getItemCount(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0471");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultWindDataset0.equals(obj6);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultWindDataset0.getItemCount((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0472");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        java.lang.Class<?> wildcardClass8 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0473");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray9);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray9);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray19 = new java.lang.Object[][][] { objArray13, objArray14, objArray15, objArray16, objArray17, objArray18 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset20 = new org.jfree.data.xy.DefaultWindDataset(objArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0474");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray7, objArray9 };
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray10);
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray15);
        boolean boolean17 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = defaultWindDataset0.getItemCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0475");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset12.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset12.addChangeListener(datasetChangeListener15);
        boolean boolean18 = defaultWindDataset12.equals((java.lang.Object) '4');
        boolean boolean19 = defaultWindDataset12.getNotify();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray24 = new java.lang.Object[][] { objArray21, objArray23 };
        java.util.List list25 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray24);
        java.util.List list26 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray24);
        java.lang.Object[][] objArray27 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray28 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray29 = new java.lang.Object[][][] { objArray27, objArray28 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(list26, objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        java.util.List list32 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray29);
        boolean boolean33 = defaultWindDataset12.equals((java.lang.Object) objArray29);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset34 = new org.jfree.data.xy.DefaultWindDataset(objArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset35 = new org.jfree.data.xy.DefaultWindDataset(list11, objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0476");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener15);
        java.lang.Object obj17 = defaultWindDataset7.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultWindDataset7.getWindForce((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0477");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] { objArray0, objArray1, objArray2 };
        java.util.List list4 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray3);
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray11 = new java.lang.Object[][][] { objArray5, objArray6, objArray7, objArray8, objArray9, objArray10 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(objArray11);
        java.util.List list13 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray11);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(list4, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0478");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0479");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getX((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0480");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray10 = new java.lang.Object[][][] { objArray4, objArray5, objArray6, objArray7, objArray8, objArray9 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(objArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset12 = new org.jfree.data.xy.DefaultWindDataset(strArray3, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0481");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        java.lang.Class<?> wildcardClass13 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0482");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getX((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0483");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultWindDataset0.equals(obj6);
        java.lang.Object obj8 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindDirection((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0484");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray21 = new java.lang.Object[][] { objArray18, objArray20 };
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray21);
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray24, objArray25 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(list23, objArray26);
        java.util.List list28 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray26);
        java.util.List list29 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray26);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(objArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset31 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0485");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray20 = new java.lang.Object[][] { objArray17, objArray19 };
        java.util.List list21 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray20);
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray25 = new java.lang.Object[][][] { objArray23, objArray24 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset26 = new org.jfree.data.xy.DefaultWindDataset(list22, objArray25);
        java.util.List list27 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        java.util.List list28 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        java.util.List list29 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset30 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0486");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0487");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultWindDataset0.getSeriesKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0488");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        java.lang.Class<?> wildcardClass11 = defaultWindDataset10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0489");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        boolean boolean11 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultWindDataset0.getWindDirection((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0490");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener17);
        java.lang.Object obj19 = defaultWindDataset16.clone();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0491");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindDirection(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0492");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0493");
        java.lang.Object[][][] objArray0 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset1 = new org.jfree.data.xy.DefaultWindDataset(objArray0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultWindDataset1.addChangeListener(datasetChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset1.getWindForce(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][][] {});
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0494");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray13 = new java.lang.Object[][][] { objArray7, objArray8, objArray9, objArray10, objArray11, objArray12 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset15 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultWindDataset16.getSeriesKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0495");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray9, objArray11 };
        java.util.List list13 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray12);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray12);
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray17 = new java.lang.Object[][][] { objArray15, objArray16 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(list14, objArray17);
        java.util.List list19 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        java.util.List list20 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        boolean boolean21 = defaultWindDataset0.equals((java.lang.Object) objArray17);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(objArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = defaultWindDataset22.getItemCount(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0496");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getY((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0497");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getY((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0498");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        boolean boolean10 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener11);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultWindDataset0.getX((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0499");
        java.lang.Object[][] objArray0 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray1 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray2 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray3 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray4 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray6 = new java.lang.Object[][][] { objArray0, objArray1, objArray2, objArray3, objArray4, objArray5 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset7 = new org.jfree.data.xy.DefaultWindDataset(objArray6);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset8 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset8.setNotify(true);
        defaultWindDataset8.validateObject();
        defaultWindDataset8.setNotify(true);
        boolean boolean14 = defaultWindDataset7.equals((java.lang.Object) defaultWindDataset8);
        boolean boolean15 = defaultWindDataset8.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultWindDataset8.getWindDirection((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest0.test0500");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean5 = defaultWindDataset0.getNotify();
        int int6 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getX((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }
}

