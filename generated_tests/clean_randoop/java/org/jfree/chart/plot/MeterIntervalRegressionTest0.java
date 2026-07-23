package org.jfree.chart.plot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MeterIntervalRegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeterIntervalRegressionTest0.test1");
        org.jfree.data.Range range1 = null;
        java.awt.Paint paint2 = null;
        java.awt.Stroke stroke3 = null;
        java.awt.Paint paint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.MeterInterval meterInterval5 = new org.jfree.chart.plot.MeterInterval("hi!", range1, paint2, stroke3, paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeterIntervalRegressionTest0.test2");
        org.jfree.data.Range range1 = null;
        java.awt.Paint paint2 = null;
        java.awt.Stroke stroke3 = null;
        java.awt.Paint paint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.MeterInterval meterInterval5 = new org.jfree.chart.plot.MeterInterval("", range1, paint2, stroke3, paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeterIntervalRegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeterIntervalRegressionTest0.test4");
        org.jfree.data.Range range1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.MeterInterval meterInterval2 = new org.jfree.chart.plot.MeterInterval("hi!", range1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MeterIntervalRegressionTest0.test5");
        org.jfree.data.Range range1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.MeterInterval meterInterval2 = new org.jfree.chart.plot.MeterInterval("", range1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

