package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultWindDatasetRegressionTest2 {

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
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1001");
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
        defaultWindDataset8.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener18);
        int int20 = defaultWindDataset8.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultWindDataset8.getWindDirection((int) (short) -1, 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1002");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultWindDataset0.getWindForce((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1003");
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
        int int18 = defaultWindDataset16.getSeriesCount();
        java.lang.Class<?> wildcardClass19 = defaultWindDataset16.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1004");
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
        int int19 = defaultWindDataset7.getItemCount(0);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1005");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultWindDataset0.getWindDirection((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1006");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener15);
        java.lang.Object obj17 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1007");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultWindDataset0.getX((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1008");
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
        defaultWindDataset7.validateObject();
        defaultWindDataset7.setNotify(false);
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1009");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        boolean boolean7 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1010");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        boolean boolean4 = defaultWindDataset0.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce((int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1011");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener10);
        boolean boolean12 = defaultWindDataset0.getNotify();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1012");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.setNotify(false);
        int int11 = defaultWindDataset0.getSeriesCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1013");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean5 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1014");
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
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray26);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray26);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset32 = new org.jfree.data.xy.DefaultWindDataset(objArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset33 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray26);
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
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1015");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultWindDataset0.getSeriesKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1016");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener9);
        int int11 = defaultWindDataset0.getSeriesCount();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1017");
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
        defaultWindDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultWindDataset16.getSeriesCount();
        defaultWindDataset16.setNotify(true);
        boolean boolean22 = defaultWindDataset16.getNotify();
        defaultWindDataset16.setNotify(true);
        defaultWindDataset16.validateObject();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1018");
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
            int int20 = defaultWindDataset16.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1019");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1020");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1021");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset7.addChangeListener(datasetChangeListener20);
        int int22 = defaultWindDataset7.getSeriesCount();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1022");
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
        defaultWindDataset8.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener18);
        int int20 = defaultWindDataset8.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = defaultWindDataset8.getItemCount((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1023");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.validateObject();
        java.lang.Object obj4 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1024");
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
            java.lang.Number number18 = defaultWindDataset8.getX((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1025");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray8 = new java.lang.Object[][] { objArray5, objArray7 };
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray8);
        java.util.List list10 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray8);
        java.util.List list11 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray8);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray8);
        java.lang.Class<?> wildcardClass13 = objArray8.getClass();
        boolean boolean14 = defaultWindDataset0.equals((java.lang.Object) objArray8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1026");
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
            java.lang.Number number11 = defaultWindDataset0.getY((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1027");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1028");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getY(10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1029");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
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
        java.util.List list27 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset28 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray24);
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
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1030");
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
            java.lang.Number number11 = defaultWindDataset0.getY((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1031");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        int int6 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultWindDataset0.getSeriesKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1032");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener23);
        java.lang.Class<?> wildcardClass25 = defaultWindDataset0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1033");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener23);
        boolean boolean25 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener26);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1034");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        boolean boolean6 = defaultWindDataset0.getNotify();
        boolean boolean7 = defaultWindDataset0.getNotify();
        int int8 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1035");
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
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean18 = defaultWindDataset17.getNotify();
        int int19 = defaultWindDataset17.getSeriesCount();
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray22 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray24 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray25 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray20, objArray21, objArray22, objArray23, objArray24, objArray25 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset27 = new org.jfree.data.xy.DefaultWindDataset(objArray26);
        boolean boolean28 = defaultWindDataset17.hasListener((java.util.EventListener) defaultWindDataset27);
        defaultWindDataset17.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultWindDataset17.removeChangeListener(datasetChangeListener31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray36 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray37 = new java.lang.Object[][] { objArray34, objArray36 };
        java.util.List list38 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray37);
        boolean boolean39 = defaultWindDataset17.equals((java.lang.Object) objArray37);
        java.util.List list40 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray37);
        java.util.List list41 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray37);
        java.util.List list42 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray37);
        java.util.List list43 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray37);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray47 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray48 = new java.lang.Object[][] { objArray45, objArray47 };
        java.util.List list49 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray48);
        java.util.List list50 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray48);
        java.lang.Object[][] objArray51 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray52 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray53 = new java.lang.Object[][][] { objArray51, objArray52 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset54 = new org.jfree.data.xy.DefaultWindDataset(list50, objArray53);
        java.util.List list55 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray53);
        java.util.List list56 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray53);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset57 = new org.jfree.data.xy.DefaultWindDataset(list43, objArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset58 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray53);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
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
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertArrayEquals(objArray51, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1036");
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
            java.lang.Number number15 = defaultWindDataset12.getX((int) '#', (int) '4');
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
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1037");
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
        boolean boolean16 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultWindDataset0.getSeriesKey((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1038");
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
        defaultWindDataset0.validateObject();
        int int12 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getWindDirection(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1039");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        java.lang.Object obj9 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getWindDirection((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1040");
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
        boolean boolean16 = defaultWindDataset8.getNotify();
        defaultWindDataset8.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultWindDataset8.getWindDirection((int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1041");
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
        boolean boolean18 = defaultWindDataset0.getNotify();
        java.lang.Object obj19 = defaultWindDataset0.clone();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1042");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultWindDataset0.getItemCount(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1043");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener20);
        defaultWindDataset7.validateObject();
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1044");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getX((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1045");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        int int3 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX((int) (byte) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1046");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        boolean boolean10 = defaultWindDataset0.getNotify();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1047");
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
        boolean boolean17 = defaultWindDataset7.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1048");
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
            int int24 = defaultWindDataset0.getItemCount(1);
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1049");
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
        int int17 = defaultWindDataset16.getSeriesCount();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1050");
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
            java.lang.Number number12 = defaultWindDataset0.getY((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1051");
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
        defaultWindDataset8.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener18);
        int int20 = defaultWindDataset8.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener21);
        int int23 = defaultWindDataset8.getSeriesCount();
        int int24 = defaultWindDataset8.getSeriesCount();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1052");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1053");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray20 = new java.lang.Object[][][] { objArray14, objArray15, objArray16, objArray17, objArray18, objArray19 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(strArray13, objArray20);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray20);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray29 = new java.lang.Object[][] { objArray26, objArray28 };
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.lang.Object[][] objArray32 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray34 = new java.lang.Object[][][] { objArray32, objArray33 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset35 = new org.jfree.data.xy.DefaultWindDataset(list31, objArray34);
        java.util.List list36 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        java.util.List list37 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        java.util.List list38 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        java.util.List list39 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset40 = new org.jfree.data.xy.DefaultWindDataset(objArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset41 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
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
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1054");
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
            java.lang.Number number10 = defaultWindDataset0.getWindDirection((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1055");
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
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1056");
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
        java.lang.Class<?> wildcardClass25 = objArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1057");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[][] objArray5 = new java.lang.Object[][] { objArray0, objArray1, objArray2, objArray3, objArray4 };
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.util.List list7 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.util.List list9 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
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
        org.junit.Assert.assertNotNull(list7);
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1058");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        defaultWindDataset0.validateObject();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1059");
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
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultWindDataset8.hasListener(eventListener19);
        int int21 = defaultWindDataset8.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = defaultWindDataset8.getItemCount((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1060");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = defaultWindDataset0.getItemCount(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1061");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultWindDataset0.equals(obj6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1062");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        boolean boolean6 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce(2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1063");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass10 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1064");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener21);
        java.lang.Object obj23 = defaultWindDataset0.clone();
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
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1065");
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
        defaultWindDataset0.setNotify(true);
        boolean boolean30 = defaultWindDataset0.getNotify();
        java.lang.Object obj31 = defaultWindDataset0.clone();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1066");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray20 = new java.lang.Object[][][] { objArray14, objArray15, objArray16, objArray17, objArray18, objArray19 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(strArray13, objArray20);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray20);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray29 = new java.lang.Object[][] { objArray26, objArray28 };
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.lang.Object[][] objArray32 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray34 = new java.lang.Object[][][] { objArray32, objArray33 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset35 = new org.jfree.data.xy.DefaultWindDataset(list31, objArray34);
        java.util.List list36 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        java.util.List list37 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset38 = new org.jfree.data.xy.DefaultWindDataset(objArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset39 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
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
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1067");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        boolean boolean6 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultWindDataset0.getSeriesKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1068");
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
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener14);
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray22 = new java.lang.Object[][][] { objArray16, objArray17, objArray18, objArray19, objArray20, objArray21 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(objArray22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultWindDataset23.removeChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultWindDataset23.addChangeListener(datasetChangeListener26);
        boolean boolean28 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset23);
        java.lang.Object obj29 = defaultWindDataset0.clone();
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
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1069");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        boolean boolean6 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindForce((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1070");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getY((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1071");
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
        java.lang.Object obj11 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindDirection(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1072");
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
            java.lang.Number number25 = defaultWindDataset0.getY((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1073");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        int int6 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray10 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray11 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray12 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray13 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray15 = new java.lang.Object[][][] { objArray9, objArray10, objArray11, objArray12, objArray13, objArray14 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset16 = new org.jfree.data.xy.DefaultWindDataset(objArray15);
        boolean boolean17 = defaultWindDataset16.getNotify();
        boolean boolean18 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultWindDataset0.getX(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1074");
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
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener14);
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray21 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray22 = new java.lang.Object[][][] { objArray16, objArray17, objArray18, objArray19, objArray20, objArray21 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(objArray22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultWindDataset23.removeChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultWindDataset23.addChangeListener(datasetChangeListener26);
        boolean boolean28 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset23);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener31);
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
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[][] {});
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1075");
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
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray6);
        java.lang.Object[][][] objArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset14 = new org.jfree.data.xy.DefaultWindDataset(list12, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1076");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray5 = new java.lang.Object[][] { objArray2, objArray4 };
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.util.List list7 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray5);
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray9 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray10 = new java.lang.Object[][][] { objArray8, objArray9 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset11 = new org.jfree.data.xy.DefaultWindDataset(list7, objArray10);
        java.util.List list12 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        java.util.List list13 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        java.util.List list14 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        java.util.List list15 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray10);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset(objArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(strArray0, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1077");
        java.lang.String[] strArray1 = new java.lang.String[] { "Series 3" };
        java.lang.Object[][][] objArray2 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset3 = new org.jfree.data.xy.DefaultWindDataset(objArray2);
        java.util.List list4 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray2);
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset6 = new org.jfree.data.xy.DefaultWindDataset(strArray1, objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Series 3" });
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1078");
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
        defaultWindDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultWindDataset16.getSeriesCount();
        java.lang.Object obj20 = defaultWindDataset16.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultWindDataset16.getWindForce((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1079");
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
        defaultWindDataset8.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener18);
        int int20 = defaultWindDataset8.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener21);
        defaultWindDataset8.setNotify(false);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1080");
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
        defaultWindDataset0.validateObject();
        int int12 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getWindDirection((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1081");
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
        defaultWindDataset15.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultWindDataset15.getSeriesKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1082");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindDirection(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1083");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1084");
        java.lang.Object[][][] objArray0 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset1 = new org.jfree.data.xy.DefaultWindDataset(objArray0);
        java.util.List list2 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray0);
        java.util.List list3 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray0);
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
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray13);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset18 = new org.jfree.data.xy.DefaultWindDataset(objArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset19 = new org.jfree.data.xy.DefaultWindDataset(list3, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[][][] {});
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list3);
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
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1085");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = defaultWindDataset0.getItemCount(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1086");
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
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1087");
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
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray15 = new java.lang.Object[][] { objArray12, objArray14 };
        java.util.List list16 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray15);
        java.util.List list17 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray15);
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray20 = new java.lang.Object[][][] { objArray18, objArray19 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(list17, objArray20);
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray20);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray20);
        java.util.List list24 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset25 = new org.jfree.data.xy.DefaultWindDataset(list10, objArray20);
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
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1088");
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
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultWindDataset8.hasListener(eventListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultWindDataset8.getY((int) '#', (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1089");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        defaultWindDataset0.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1090");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        java.lang.Object obj6 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultWindDataset0.getItemCount((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1091");
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
            int int11 = defaultWindDataset0.getItemCount((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1092");
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
            java.lang.Number number21 = defaultWindDataset16.getY((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1093");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        boolean boolean9 = defaultWindDataset0.getNotify();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1094");
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
        boolean boolean18 = defaultWindDataset16.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultWindDataset16.getY(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1095");
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
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset23 = new org.jfree.data.xy.DefaultWindDataset(objArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultWindDataset23.getY((int) (byte) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1096");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultWindDataset0.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1097");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultWindDataset0.getX((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1098");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindDirection(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1099");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getY(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1100");
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
            java.lang.Number number15 = defaultWindDataset0.getX(0, (int) (short) 0);
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
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1101");
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
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindForce((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1102");
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
        defaultWindDataset0.setNotify(false);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultWindDataset0.hasListener(eventListener12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1103");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        int int3 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj4 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getX((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1104");
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
            java.lang.Number number15 = defaultWindDataset0.getWindDirection((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1105");
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
        java.lang.Object obj11 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindDirection(2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1106");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultWindDataset16.getWindForce((int) ' ', (int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1107");
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
        defaultWindDataset16.removeChangeListener(datasetChangeListener18);
        java.lang.Object obj20 = defaultWindDataset16.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultWindDataset16.getWindForce(6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1108");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultWindDataset15.addChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset15.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset15.addChangeListener(datasetChangeListener20);
        defaultWindDataset15.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultWindDataset15.addChangeListener(datasetChangeListener23);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1109");
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
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultWindDataset0.getWindDirection(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1110");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        int int4 = defaultWindDataset0.getSeriesCount();
        boolean boolean5 = defaultWindDataset0.getNotify();
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultWindDataset22.removeChangeListener(datasetChangeListener23);
        boolean boolean25 = defaultWindDataset22.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultWindDataset22.addChangeListener(datasetChangeListener26);
        defaultWindDataset22.validateObject();
        boolean boolean29 = defaultWindDataset0.hasListener((java.util.EventListener) defaultWindDataset22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1111");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener10);
        int int12 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener14);
        int int16 = defaultWindDataset0.getSeriesCount();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1112");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        int int3 = defaultWindDataset0.getSeriesCount();
        int int4 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1113");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        java.lang.Object obj3 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getY(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1114");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1115");
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
        defaultWindDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultWindDataset16.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset16.removeChangeListener(datasetChangeListener20);
        java.lang.Comparable comparable23 = defaultWindDataset16.getSeriesKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultWindDataset16.getX((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + "" + "'", comparable23, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1116");
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
        defaultWindDataset0.validateObject();
        boolean boolean12 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getY((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1117");
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
            java.lang.Number number18 = defaultWindDataset8.getWindDirection(100, 0);
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1118");
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
        int int12 = defaultWindDataset10.getSeriesCount();
        int int13 = defaultWindDataset10.getSeriesCount();
        int int14 = defaultWindDataset10.getSeriesCount();
        java.lang.Object obj15 = defaultWindDataset10.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = defaultWindDataset10.getItemCount((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 32");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1119");
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
        boolean boolean12 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1120");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        int int3 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1121");
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
        java.lang.Class<?> wildcardClass17 = defaultWindDataset16.getClass();
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1122");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultWindDataset15.getX((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1123");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        boolean boolean6 = defaultWindDataset0.getNotify();
        boolean boolean7 = defaultWindDataset0.getNotify();
        java.lang.Object obj8 = null;
        boolean boolean9 = defaultWindDataset0.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultWindDataset0.getY((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1124");
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
        java.util.List list38 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray33);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset39 = new org.jfree.data.xy.DefaultWindDataset(objArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset40 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray33);
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
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1125");
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
            java.lang.Number number25 = defaultWindDataset0.getX((int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1126");
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
        int int17 = defaultWindDataset8.getSeriesCount();
        defaultWindDataset8.setNotify(false);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1127");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1128");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getWindForce(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1129");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        java.lang.Object obj4 = null;
        boolean boolean5 = defaultWindDataset0.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1130");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray20 = new java.lang.Object[][][] { objArray14, objArray15, objArray16, objArray17, objArray18, objArray19 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(strArray13, objArray20);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray20);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray29 = new java.lang.Object[][] { objArray26, objArray28 };
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.lang.Object[][] objArray32 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray34 = new java.lang.Object[][][] { objArray32, objArray33 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset35 = new org.jfree.data.xy.DefaultWindDataset(list31, objArray34);
        java.util.List list36 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        java.util.List list37 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        java.util.List list38 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset39 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
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
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1131");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1132");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        boolean boolean5 = defaultWindDataset0.equals((java.lang.Object) 1);
        int int6 = defaultWindDataset0.getSeriesCount();
        java.lang.Class<?> wildcardClass7 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1133");
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
        java.lang.Class<?> wildcardClass14 = defaultWindDataset0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1134");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1135");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        defaultWindDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1136");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        boolean boolean8 = defaultWindDataset0.getNotify();
        boolean boolean9 = defaultWindDataset0.getNotify();
        java.lang.Class<?> wildcardClass10 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1137");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean5 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1138");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getY((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultWindDataset0.getSeriesKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1140");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        int int3 = defaultWindDataset0.getSeriesCount();
        int int4 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1141");
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
        boolean boolean12 = defaultWindDataset0.getNotify();
        int int13 = defaultWindDataset0.getSeriesCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1142");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        int int3 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindForce(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1143");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        int int2 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1144");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.validateObject();
        java.lang.Object obj8 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultWindDataset0.getItemCount(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1145");
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
        defaultWindDataset0.setNotify(true);
        boolean boolean30 = defaultWindDataset0.getNotify();
        boolean boolean31 = defaultWindDataset0.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1146");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj6 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultWindDataset0.getWindForce((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1147");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        int int1 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1148");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultWindDataset0.getY(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1149");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset7.addChangeListener(datasetChangeListener20);
        int int23 = defaultWindDataset7.getItemCount(0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1150");
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
        defaultWindDataset26.validateObject();
        boolean boolean29 = defaultWindDataset26.getNotify();
        java.lang.Object obj30 = defaultWindDataset26.clone();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1151");
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
        defaultWindDataset0.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultWindDataset0.getY(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1152");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener21);
        boolean boolean23 = defaultWindDataset0.getNotify();
        java.lang.Object obj24 = defaultWindDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultWindDataset0.getSeriesKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1153");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener15);
        java.lang.Class<?> wildcardClass17 = defaultWindDataset0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1154");
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
            java.lang.Comparable comparable24 = defaultWindDataset22.getSeriesKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1155");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.validateObject();
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1156");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        boolean boolean4 = defaultWindDataset0.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultWindDataset0.getWindForce((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1157");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        defaultWindDataset0.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultWindDataset0.getItemCount((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1158");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultWindDataset0.getWindDirection((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1159");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset7.removeChangeListener(datasetChangeListener20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultWindDataset7.addChangeListener(datasetChangeListener22);
        defaultWindDataset7.validateObject();
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1160");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        boolean boolean6 = defaultWindDataset0.equals((java.lang.Object) '4');
        int int7 = defaultWindDataset0.getSeriesCount();
        int int8 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultWindDataset0.getWindForce((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1161");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        int int1 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1162");
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
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset17 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultWindDataset17.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultWindDataset17.addChangeListener(datasetChangeListener20);
        boolean boolean23 = defaultWindDataset17.equals((java.lang.Object) '4');
        boolean boolean24 = defaultWindDataset17.getNotify();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray29 = new java.lang.Object[][] { objArray26, objArray28 };
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.lang.Object[][] objArray32 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray34 = new java.lang.Object[][][] { objArray32, objArray33 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset35 = new org.jfree.data.xy.DefaultWindDataset(list31, objArray34);
        java.util.List list36 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        java.util.List list37 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray34);
        boolean boolean38 = defaultWindDataset17.equals((java.lang.Object) objArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset39 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray34);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1163");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = defaultWindDataset0.getItemCount(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 1");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1164");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        defaultWindDataset0.setNotify(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultWindDataset0.getWindDirection(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1165");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray4, objArray6 };
        java.util.List list8 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray7);
        boolean boolean9 = defaultWindDataset0.equals((java.lang.Object) list8);
        int int10 = defaultWindDataset0.getSeriesCount();
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener13);
        java.lang.Object obj15 = defaultWindDataset0.clone();
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
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1166");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        int int5 = defaultWindDataset0.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        defaultWindDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1167");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        int int8 = defaultWindDataset0.getSeriesCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1168");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        java.lang.Class<?> wildcardClass5 = defaultWindDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1169");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        defaultWindDataset0.setNotify(false);
        int int4 = defaultWindDataset0.getSeriesCount();
        boolean boolean5 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1170");
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
            java.lang.Comparable comparable13 = defaultWindDataset0.getSeriesKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1171");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean1 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean4 = defaultWindDataset0.getNotify();
        int int5 = defaultWindDataset0.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultWindDataset0.getSeriesKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1172");
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
            int int21 = defaultWindDataset7.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1173");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener14);
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
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1174");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray15 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray17 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray18 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray20 = new java.lang.Object[][][] { objArray14, objArray15, objArray16, objArray17, objArray18, objArray19 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset21 = new org.jfree.data.xy.DefaultWindDataset(objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset22 = new org.jfree.data.xy.DefaultWindDataset(strArray13, objArray20);
        java.util.List list23 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray20);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray20);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray29 = new java.lang.Object[][] { objArray26, objArray28 };
        java.util.List list30 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.util.List list31 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray29);
        java.lang.Object[][] objArray32 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray33 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray34 = new java.lang.Object[][][] { objArray32, objArray33 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset35 = new org.jfree.data.xy.DefaultWindDataset(list31, objArray34);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset36 = new org.jfree.data.xy.DefaultWindDataset(objArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset37 = new org.jfree.data.xy.DefaultWindDataset(strArray6, objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "", "", "Series 2", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
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
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1175");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean8 = defaultWindDataset0.equals((java.lang.Object) (byte) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener9);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultWindDataset0.getWindDirection(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1176");
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
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1177");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) (byte) 1);
        boolean boolean3 = defaultWindDataset0.getNotify();
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener5);
        boolean boolean7 = defaultWindDataset0.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener8);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1178");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        defaultWindDataset0.validateObject();
        defaultWindDataset0.validateObject();
        boolean boolean9 = defaultWindDataset0.getNotify();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1179");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray1, objArray3 };
        java.util.List list5 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.util.List list6 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objArray4);
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray7, objArray8 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset10 = new org.jfree.data.xy.DefaultWindDataset(list6, objArray9);
        defaultWindDataset10.validateObject();
        defaultWindDataset10.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset10.addChangeListener(datasetChangeListener13);
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1180");
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
        defaultWindDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1181");
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
        java.util.List list22 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray17);
        java.lang.Object[][][] objArray23 = new java.lang.Object[][][] {};
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset24 = new org.jfree.data.xy.DefaultWindDataset(objArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset25 = new org.jfree.data.xy.DefaultWindDataset(list22, objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of series keys does not match the number of series in the data array.");
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
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][][] {});
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1182");
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
        defaultWindDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultWindDataset16.getSeriesCount();
        defaultWindDataset16.setNotify(true);
        boolean boolean22 = defaultWindDataset16.getNotify();
        defaultWindDataset16.setNotify(true);
        defaultWindDataset16.validateObject();
        java.lang.Object[] objArray26 = new java.lang.Object[] { defaultWindDataset16 };
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.Object[][] objArray34 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray35 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray36 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray37 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray38 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray39 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray40 = new java.lang.Object[][][] { objArray34, objArray35, objArray36, objArray37, objArray38, objArray39 };
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset41 = new org.jfree.data.xy.DefaultWindDataset(objArray40);
        java.util.List list42 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray((java.lang.Object[][]) objArray40);
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset43 = new org.jfree.data.xy.DefaultWindDataset(strArray33, objArray40);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultWindDataset43.addChangeListener(datasetChangeListener44);
        int int46 = defaultWindDataset43.getSeriesCount();
        defaultWindDataset43.setNotify(true);
        boolean boolean49 = defaultWindDataset43.getNotify();
        defaultWindDataset43.setNotify(true);
        defaultWindDataset43.validateObject();
        java.lang.Object[] objArray53 = new java.lang.Object[] { defaultWindDataset43 };
        java.lang.Object[][] objArray54 = new java.lang.Object[][] { objArray26, objArray53 };
        java.lang.Object[][][] objArray55 = new java.lang.Object[][][] { objArray54 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.DefaultWindDataset defaultWindDataset56 = new org.jfree.data.xy.DefaultWindDataset(objArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertArrayEquals(objArray39, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1183");
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
        boolean boolean12 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultWindDataset0.getItemCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1184");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener21);
        boolean boolean23 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultWindDataset0.getSeriesKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 10");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1185");
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
        boolean boolean16 = defaultWindDataset8.getNotify();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultWindDataset8.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = defaultWindDataset8.getItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: -1");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1186");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener1);
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultWindDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultWindDataset0.getY((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1187");
        org.jfree.data.xy.DefaultWindDataset defaultWindDataset0 = new org.jfree.data.xy.DefaultWindDataset();
        boolean boolean2 = defaultWindDataset0.equals((java.lang.Object) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener3);
        defaultWindDataset0.setNotify(true);
        boolean boolean7 = defaultWindDataset0.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultWindDataset0.getItemCount((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid series index: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultWindDatasetRegressionTest2.test1188");
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
        defaultWindDataset0.setNotify(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultWindDataset0.removeChangeListener(datasetChangeListener13);
        int int15 = defaultWindDataset0.getSeriesCount();
        java.lang.Object obj16 = defaultWindDataset0.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
    }
}

