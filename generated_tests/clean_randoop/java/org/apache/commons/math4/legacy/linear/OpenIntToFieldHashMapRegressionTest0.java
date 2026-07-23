package org.apache.commons.math4.legacy.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OpenIntToFieldHashMapRegressionTest0 {

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
            System.out.format("%n%s%n", "OpenIntToFieldHashMapRegressionTest0.test1");
        byte byte0 = org.apache.commons.math4.legacy.linear.OpenIntToFieldHashMap.FULL;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0 == (byte) 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OpenIntToFieldHashMapRegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OpenIntToFieldHashMapRegressionTest0.test3");
        byte byte0 = org.apache.commons.math4.legacy.linear.OpenIntToFieldHashMap.FREE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OpenIntToFieldHashMapRegressionTest0.test4");
        byte byte0 = org.apache.commons.math4.legacy.linear.OpenIntToFieldHashMap.REMOVED;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 2 + "'", byte0 == (byte) 2);
    }
}

