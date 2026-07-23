package com.google.gson.internal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExcluderRegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExcluderRegressionTest1.test501");
        com.google.gson.internal.Excluder excluder0 = com.google.gson.internal.Excluder.DEFAULT;
        int[] intArray5 = new int[] { (-1), '4', (byte) 10, 1 };
        com.google.gson.internal.Excluder excluder6 = excluder0.withModifiers(intArray5);
        int[] intArray8 = new int[] { (byte) -1 };
        com.google.gson.internal.Excluder excluder9 = excluder6.withModifiers(intArray8);
        com.google.gson.internal.Excluder excluder10 = excluder6.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder11 = excluder6.disableInnerClassSerialization();
        org.junit.Assert.assertNotNull(excluder0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 52, 10, 1 });
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertNotNull(excluder9);
        org.junit.Assert.assertNotNull(excluder10);
        org.junit.Assert.assertNotNull(excluder11);
    }
}

