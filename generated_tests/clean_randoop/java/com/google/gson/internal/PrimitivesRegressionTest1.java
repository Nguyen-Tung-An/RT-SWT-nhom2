package com.google.gson.internal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PrimitivesRegressionTest1 {

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
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test501");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test502");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test503");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test504");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test505");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test506");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test507");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test508");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test509");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test510");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test511");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test512");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test513");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test514");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test515");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test516");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test517");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test518");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test519");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test520");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean23 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean24 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test521");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test522");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test523");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test524");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test525");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test526");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test527");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test528");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test529");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test530");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test531");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test532");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test533");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test534");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test535");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test536");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test537");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean23 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean24 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test538");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test539");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test540");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test541");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test542");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test543");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test544");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test545");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test546");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test547");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test548");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test549");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test550");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test551");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test552");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test553");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test554");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test555");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test556");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test557");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test558");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test559");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test560");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test561");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean23 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean24 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean25 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean26 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test562");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test563");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test564");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test565");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test566");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test567");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test568");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test569");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test570");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test571");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test572");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test573");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test574");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test575");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean23 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean24 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test576");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test577");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test578");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test579");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test580");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test581");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test582");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test583");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test584");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test585");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test586");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test587");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test588");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test589");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test590");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test591");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean23 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean24 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean25 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean26 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean27 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean28 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean29 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean30 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test592");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test593");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test594");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test595");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test596");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test597");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test598");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test599");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test600");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test601");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test602");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test603");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test604");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test605");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test606");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test607");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test608");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test609");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test610");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test611");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test612");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test613");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test614");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean23 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean24 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean25 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean26 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test615");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test616");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test617");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test618");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test619");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test620");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test621");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test622");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test623");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean17 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean18 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean19 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean20 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean21 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean22 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean23 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test624");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test625");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test626");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PrimitivesRegressionTest1.test627");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean5 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean6 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean8 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean9 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean10 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean11 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean12 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean13 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean14 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        boolean boolean15 = com.google.gson.internal.Primitives.isWrapperType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean16 = com.google.gson.internal.Primitives.isPrimitive((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

