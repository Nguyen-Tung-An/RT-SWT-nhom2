package org.apache.commons.collections4.bloomfilter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayCountingBloomFilterRegressionTest0 {

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
            System.out.format("%n%s%n", "ArrayCountingBloomFilterRegressionTest0.test1");
        org.apache.commons.collections4.bloomfilter.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bloomfilter.ArrayCountingBloomFilter arrayCountingBloomFilter1 = new org.apache.commons.collections4.bloomfilter.ArrayCountingBloomFilter(shape0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: shape");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayCountingBloomFilterRegressionTest0.test2");
        int int0 = org.apache.commons.collections4.bloomfilter.BloomFilter.SPARSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ArrayCountingBloomFilterRegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

