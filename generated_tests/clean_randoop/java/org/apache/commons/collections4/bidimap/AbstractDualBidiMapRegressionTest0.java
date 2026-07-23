package org.apache.commons.collections4.bidimap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AbstractDualBidiMapRegressionTest0 {

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
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test001");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.constant.Constable>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test002");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.ConstantDesc> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.constant.ConstantDesc> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.constant.ConstantDesc>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test003");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.String> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.String> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.String>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test004");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.String> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.String> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.String>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test006");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test007");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test008");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.invoke.TypeDescriptor> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.invoke.TypeDescriptor> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.invoke.TypeDescriptor>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test009");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.Constable> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.constant.Constable> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.constant.Constable>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test010");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.GenericDeclaration> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.reflect.GenericDeclaration> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.reflect.GenericDeclaration>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test011");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.invoke.TypeDescriptor>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test012");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.ConstantDesc> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.constant.ConstantDesc> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.constant.ConstantDesc>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test013");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test014");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.String> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.String>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test015");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test016");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.GenericDeclaration> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.reflect.GenericDeclaration> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.reflect.GenericDeclaration>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test017");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.constant.ConstantDesc>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test018");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test019");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.String> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.String> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.String>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test020");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test021");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test022");
        java.util.Map.Entry<java.io.Serializable, java.lang.String> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.String> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.String> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.String>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test023");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test024");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test025");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.reflect.Type>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test026");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.Object>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test027");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.constant.ConstantDesc>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test028");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.Type> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.reflect.Type> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.reflect.Type>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test029");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.constant.Constable>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.Constable> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.constant.Constable> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.constant.Constable>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test030");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.Object>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test031");
        java.util.Map.Entry<java.lang.String, java.lang.Comparable<java.lang.String>> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Comparable<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.Comparable<java.lang.String>> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.Comparable<java.lang.String>>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test032");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test033");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test034");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.io.Serializable>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test035");
        java.util.Map.Entry<java.io.Serializable, java.lang.reflect.Type> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.Type> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.reflect.Type> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.reflect.Type>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test036");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.GenericDeclaration> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.reflect.GenericDeclaration> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.reflect.GenericDeclaration>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test037");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.Comparable<java.lang.String>>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.Comparable<java.lang.String>>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test038");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.CharSequence>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.CharSequence>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test039");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.String> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.String> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.String>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test040");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.constant.Constable>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.Constable> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.constant.Constable> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.constant.Constable>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test041");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test042");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test043");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.reflect.Type> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.reflect.Type>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test044");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test045");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.String> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.String>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test046");
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.io.Serializable> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.io.Serializable> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.io.Serializable>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test047");
        java.util.Map.Entry<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.invoke.TypeDescriptor>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test048");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.constant.ConstantDesc>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test049");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.AnnotatedElement> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.reflect.AnnotatedElement> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.reflect.AnnotatedElement>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test050");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.Constable> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.constant.Constable> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.constant.Constable>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test051");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test052");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test053");
        java.util.Map.Entry<java.lang.Object, java.lang.invoke.TypeDescriptor> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.invoke.TypeDescriptor> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.invoke.TypeDescriptor> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.invoke.TypeDescriptor>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test054");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Comparable<java.lang.String>> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test055");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test056");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.constant.Constable>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.Constable> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.constant.Constable> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.constant.Constable>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test057");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test058");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.io.Serializable> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.io.Serializable> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.io.Serializable>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test059");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test060");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test061");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test062");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.String> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.String>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test063");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.String> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.String> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.String>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test064");
        java.util.Map.Entry<java.lang.String, java.lang.constant.Constable> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.Constable> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.constant.Constable> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.constant.Constable>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test065");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.constant.ConstantDesc>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test066");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.io.Serializable>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test067");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.io.Serializable>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test068");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.String>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test069");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.String> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.String> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.String> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.String>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test070");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test071");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.String> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.String> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.String>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test072");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test073");
        java.util.Map.Entry<java.io.Serializable, java.lang.CharSequence> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.CharSequence> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.CharSequence> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.CharSequence>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test074");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.reflect.Type> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.Type> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.reflect.Type> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.reflect.Type>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test075");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test076");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.reflect.AnnotatedElement>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test077");
        java.util.Map.Entry<java.io.Serializable, java.io.Serializable> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.io.Serializable> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.io.Serializable> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.io.Serializable>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test078");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test079");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test080");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Object> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.Object> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.Object>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test081");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.invoke.TypeDescriptor>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.invoke.TypeDescriptor>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test082");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.invoke.TypeDescriptor>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.invoke.TypeDescriptor> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.invoke.TypeDescriptor> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.invoke.TypeDescriptor>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test083");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.ConstantDesc> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.constant.ConstantDesc> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.constant.ConstantDesc>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test084");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test085");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test086");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.String> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.String> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.String>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test087");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test088");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.reflect.GenericDeclaration>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.GenericDeclaration> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.reflect.GenericDeclaration> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.reflect.GenericDeclaration>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test089");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.String>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.String>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test090");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test091");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.CharSequence> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.CharSequence>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test092");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.CharSequence> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.CharSequence> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.CharSequence>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test093");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test094");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test095");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.io.Serializable>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test096");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.constant.ConstantDesc>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.ConstantDesc> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.constant.ConstantDesc> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.constant.ConstantDesc>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test097");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test098");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test099");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test100");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test101");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test102");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test103");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.CharSequence> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.CharSequence> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.CharSequence>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test104");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.io.Serializable>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test105");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test106");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.constant.ConstantDesc>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test107");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.constant.ConstantDesc>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.constant.ConstantDesc>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test108");
        java.util.Map.Entry<java.io.Serializable, java.lang.constant.ConstantDesc> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.ConstantDesc> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.constant.ConstantDesc> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.constant.ConstantDesc>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test109");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.Object>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test110");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.invoke.TypeDescriptor>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.invoke.TypeDescriptor> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.invoke.TypeDescriptor> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.invoke.TypeDescriptor>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test111");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.CharSequence> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.CharSequence> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.CharSequence>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test112");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.io.Serializable> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.io.Serializable> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.io.Serializable>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test113");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test114");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.Object> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Object> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.Object> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.Object>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test115");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.Object>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Object> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.Object> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.Object>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test116");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test117");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.String>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.String> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.String> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.String>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test118");
        java.util.Map.Entry<java.io.Serializable, java.lang.Object> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Object> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.Object> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.Object>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test119");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.Constable> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.constant.Constable> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.constant.Constable>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test120");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.Type> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.reflect.Type> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.reflect.Type>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test121");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test122");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Object> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.Object> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.Object>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test123");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test124");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.Object> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Object> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.Object> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.Object>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test125");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test126");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.reflect.Type>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.reflect.Type>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test127");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test128");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.String>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.String>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test129");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test130");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test131");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.io.Serializable> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.io.Serializable> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.io.Serializable>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test132");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Comparable<java.lang.String>>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Comparable<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.Comparable<java.lang.String>> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.Comparable<java.lang.String>>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test133");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.io.Serializable> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.io.Serializable> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.io.Serializable>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test134");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.String>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.String> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.String> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.String>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test135");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.CharSequence>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test136");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.reflect.Type>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.reflect.Type> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.reflect.Type>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test137");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test138");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test139");
        java.util.Map.Entry<java.io.Serializable, java.lang.constant.Constable> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.Constable> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.constant.Constable> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.constant.Constable>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test140");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.io.Serializable> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.io.Serializable> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.io.Serializable>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test141");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.Object> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.Object>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test142");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.io.Serializable>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.io.Serializable>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test143");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test144");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.io.Serializable> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.io.Serializable> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.io.Serializable>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test145");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.Constable> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.constant.Constable> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.constant.Constable>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test146");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.constant.ConstantDesc>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test147");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test148");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.io.Serializable> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.io.Serializable> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.io.Serializable>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test149");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.Object>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test150");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test151");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.reflect.Type>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.Type> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.reflect.Type> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.reflect.Type>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test152");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.io.Serializable>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test153");
        java.util.Map.Entry<java.lang.Object, java.lang.constant.ConstantDesc> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.ConstantDesc> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.constant.ConstantDesc> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.constant.ConstantDesc>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test154");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test155");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.CharSequence> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.CharSequence> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.CharSequence>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test156");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.io.Serializable>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test157");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test158");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.Constable> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.constant.Constable> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.constant.Constable>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test159");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.io.Serializable>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test160");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.io.Serializable>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test161");
        java.util.Map.Entry<java.lang.String, java.lang.invoke.TypeDescriptor> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.invoke.TypeDescriptor> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.invoke.TypeDescriptor> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.invoke.TypeDescriptor>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test162");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.reflect.GenericDeclaration>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.GenericDeclaration> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.reflect.GenericDeclaration> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.reflect.GenericDeclaration>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test163");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.Comparable<java.lang.String>>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test164");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.invoke.TypeDescriptor> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.invoke.TypeDescriptor> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.invoke.TypeDescriptor>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test165");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test166");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.constant.Constable>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.Constable> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.constant.Constable> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.constant.Constable>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test167");
        java.util.Map.Entry<java.lang.String, java.lang.Object> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.Object> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.Object>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test168");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test169");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.io.Serializable> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.io.Serializable> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.io.Serializable>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test170");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test171");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test172");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test173");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test174");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Object> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.Object> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.Object>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test175");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test176");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.constant.ConstantDesc>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.constant.ConstantDesc>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test177");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.invoke.TypeDescriptor> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.invoke.TypeDescriptor> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.invoke.TypeDescriptor>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test178");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test179");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test180");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.String> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.String>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test181");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.AnnotatedElement> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.reflect.AnnotatedElement> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.reflect.AnnotatedElement>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test182");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test183");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test184");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.CharSequence> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.CharSequence> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.CharSequence>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test185");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.String> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.String> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.String>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test186");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test187");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test188");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.CharSequence>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.CharSequence> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.CharSequence> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.CharSequence>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test189");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test190");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test191");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.Type> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.reflect.Type> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.reflect.Type>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test192");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test193");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test194");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Object> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.Object> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.Object>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test195");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.String>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test196");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test197");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.Object>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Object> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.Object> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.Object>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test198");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test199");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test200");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test201");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test202");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test203");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test204");
        java.util.Map.Entry<java.lang.Object, java.lang.constant.Constable> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.Constable> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.constant.Constable> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.constant.Constable>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test205");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test206");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.CharSequence> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.CharSequence> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.CharSequence>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test207");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test208");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test209");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.constant.ConstantDesc>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.ConstantDesc> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.constant.ConstantDesc> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.constant.ConstantDesc>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test210");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.String>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.String> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.String> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.String>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test211");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test212");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.Object>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Object> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.Object> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.Object>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test213");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test214");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test215");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test216");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test217");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.constant.ConstantDesc>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test218");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.Object>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.Object>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test219");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test220");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.CharSequence> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.CharSequence> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.CharSequence>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test221");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test222");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test223");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.Constable> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.constant.Constable> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.constant.Constable>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test224");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test225");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test226");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test227");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test228");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test229");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test230");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Object>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test231");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test232");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test233");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.reflect.Type>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.Type> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.reflect.Type> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.reflect.Type>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test234");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.Constable> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.constant.Constable> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.constant.Constable>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test235");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test236");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test237");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.io.Serializable>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.io.Serializable> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.io.Serializable> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.io.Serializable>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test238");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test239");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.Constable> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.constant.Constable> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.constant.Constable>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test240");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test241");
        java.util.Map.Entry<java.lang.Object, java.lang.reflect.Type> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.Type> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.reflect.Type> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.reflect.Type>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test242");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test243");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.reflect.Type> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.reflect.Type>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test244");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.reflect.Type>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test245");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.CharSequence> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.CharSequence> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.CharSequence> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.CharSequence>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test246");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.CharSequence>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.CharSequence> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.CharSequence> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.CharSequence>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test247");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.reflect.GenericDeclaration>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test248");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test249");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test250");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test251");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test252");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test253");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.Comparable<java.lang.String>>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Comparable<java.lang.String>> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test254");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.String>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.String> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.String> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.String>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test255");
        java.util.Map.Entry<java.lang.constant.Constable, java.io.Serializable> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.io.Serializable> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.io.Serializable> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.io.Serializable>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test256");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test257");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.constant.ConstantDesc>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test258");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.io.Serializable>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test259");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.io.Serializable> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.io.Serializable> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.io.Serializable>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test260");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test261");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test262");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test263");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test264");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.Object>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test265");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.String>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test266");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Object> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.Object> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.Object>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test267");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test268");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test269");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.String>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.String> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.String> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.String>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test270");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.constant.ConstantDesc>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.ConstantDesc> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.constant.ConstantDesc> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.constant.ConstantDesc>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test271");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.Object>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Object> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.Object> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.Object>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test272");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.CharSequence> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.CharSequence>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test273");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test274");
        java.util.Map.Entry<java.lang.String, java.lang.constant.ConstantDesc> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.ConstantDesc> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.constant.ConstantDesc> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.constant.ConstantDesc>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test275");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.reflect.Type> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.Type> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.reflect.Type> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.reflect.Type>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test276");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Object> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.Object> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.Object>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test277");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.constant.Constable> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.constant.Constable> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.constant.Constable> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.constant.Constable>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test278");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.GenericDeclaration> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.reflect.GenericDeclaration> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.reflect.GenericDeclaration>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test279");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test280");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.Object>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test281");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.String>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test282");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test283");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test284");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test285");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.Object>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test286");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test287");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test288");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.invoke.TypeDescriptor> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.invoke.TypeDescriptor> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.invoke.TypeDescriptor>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test289");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.Object>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test290");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test291");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.Comparable<java.lang.String>>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test292");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.io.Serializable>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test293");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.CharSequence> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.CharSequence>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test294");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test295");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test296");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test297");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test298");
        java.util.Map.Entry<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.reflect.AnnotatedElement>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test299");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.CharSequence> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.CharSequence> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.CharSequence> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.CharSequence>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test300");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test301");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test302");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test303");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test304");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.String>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test305");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test306");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test307");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.Object>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.Object>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test308");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Object> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.Object> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.Object>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test309");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test310");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test311");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.Constable> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.constant.Constable> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.constant.Constable>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test312");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.io.Serializable>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.io.Serializable> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.io.Serializable> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.io.Serializable>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test313");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test314");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.Constable> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.constant.Constable> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.constant.Constable>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test315");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Object> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.Object> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.Object>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test316");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.String> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.String> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.String> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.String>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test317");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.reflect.Type>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test318");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.CharSequence>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test319");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test320");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test321");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test322");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Object>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.Object>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test323");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test324");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.io.Serializable>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test325");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Object> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.Object> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.Object>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test326");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.CharSequence> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.CharSequence> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.CharSequence>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test327");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.Object>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test328");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.reflect.Type>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.Type> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.reflect.Type> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.reflect.Type>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test329");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.String>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.String> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.String> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.String>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test330");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.String>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test331");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test332");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test333");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.AnnotatedElement> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.reflect.AnnotatedElement> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.reflect.AnnotatedElement>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test334");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test335");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.io.Serializable> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.io.Serializable> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.io.Serializable>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test336");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test337");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.CharSequence> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.CharSequence> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.CharSequence>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test338");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.Type> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.reflect.Type> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.reflect.Type>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test339");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.CharSequence>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.CharSequence> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.CharSequence> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.CharSequence>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test340");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.ConstantDesc> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.constant.ConstantDesc> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.constant.ConstantDesc>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test341");
        java.util.Map.Entry<java.lang.Object, java.lang.Comparable<java.lang.String>> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Comparable<java.lang.String>> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.Comparable<java.lang.String>> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.Comparable<java.lang.String>>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test342");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test343");
        java.util.Map.Entry<java.lang.Object, java.lang.reflect.AnnotatedElement> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.AnnotatedElement> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.reflect.AnnotatedElement> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.reflect.AnnotatedElement>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test344");
        java.util.Map.Entry<java.lang.Object, java.io.Serializable> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.io.Serializable> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.io.Serializable> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.io.Serializable>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test345");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test346");
        java.util.Map.Entry<java.lang.Object, java.lang.String> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.String> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.String> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.String>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test347");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test348");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.Constable> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.constant.Constable> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.constant.Constable>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test349");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.Object>> constantDescEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Object> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.Object> constantDescItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.ConstantDesc, java.lang.Object>(constantDescEntryItor0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test350");
        java.util.Map.Entry<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.reflect.GenericDeclaration>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test351");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.reflect.GenericDeclaration>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.reflect.GenericDeclaration>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test352");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.constant.Constable>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test353");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test354");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test355");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test356");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test357");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.reflect.Type>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.Type> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.reflect.Type> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.reflect.Type>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test358");
        java.util.Map.Entry<java.lang.String, java.lang.CharSequence> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.CharSequence> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.CharSequence> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.CharSequence>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test359");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test360");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.String>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.String>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test361");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test362");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test363");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.String>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test364");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test365");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.io.Serializable> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.io.Serializable> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.io.Serializable>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test366");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Comparable<java.lang.String>> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.Comparable<java.lang.String>> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.Comparable<java.lang.String>>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test367");
        java.util.Map.Entry<java.lang.CharSequence, java.io.Serializable> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.io.Serializable> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.io.Serializable> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.io.Serializable>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test368");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test369");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test370");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.Object>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.Object>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test371");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test372");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.Object>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test373");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.Type> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.reflect.Type> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.reflect.Type>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test374");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test375");
        java.util.Iterator<java.util.Map.Entry<java.io.Serializable, java.lang.constant.Constable>> serializableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.Constable> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.constant.Constable> serializableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.io.Serializable, java.lang.constant.Constable>(serializableEntryItor0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test376");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.constant.ConstantDesc>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test377");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.Type> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.reflect.Type> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.reflect.Type>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test378");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test379");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test380");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.io.Serializable>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.io.Serializable> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.io.Serializable> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.io.Serializable>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test381");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.String>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test382");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.String> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.String> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.String>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test383");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.Type> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.reflect.Type> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.reflect.Type>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test384");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test385");
        java.util.Map.Entry<java.lang.String, java.lang.reflect.Type> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.Type> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.reflect.Type> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.reflect.Type>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test386");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test387");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.constant.Constable> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.Constable> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.constant.Constable> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.constant.Constable>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test388");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.String>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test389");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.Type> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.reflect.Type> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.reflect.Type>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test390");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.CharSequence> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.CharSequence> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.CharSequence>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test391");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test392");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.Type> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.reflect.Type> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.reflect.Type>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test393");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test394");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test395");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test396");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.reflect.Type>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.Type> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.reflect.Type> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.reflect.Type>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test397");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Comparable<java.lang.String>> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.Comparable<java.lang.String>> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.Comparable<java.lang.String>>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test398");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test399");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.io.Serializable>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.io.Serializable>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test400");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Object> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.Object> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.Object>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test401");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.invoke.TypeDescriptor, java.lang.String>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test402");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test403");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test404");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test405");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test406");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test407");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test408");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test409");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.reflect.Type> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.reflect.Type>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test410");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.io.Serializable>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.io.Serializable> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.io.Serializable> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.io.Serializable>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test411");
        java.util.Iterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.io.Serializable>> strComparableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strComparableEntryItor0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test412");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.constant.Constable> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.constant.Constable> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.constant.Constable>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test413");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test414");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test415");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.Object> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.Object>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test416");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.Type> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.reflect.Type> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.reflect.Type>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test417");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Object> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.Object> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.Object>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test418");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.io.Serializable>> annotatedElementEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.AnnotatedElement, java.io.Serializable>(annotatedElementEntryItor0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test419");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.CharSequence> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.CharSequence>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test420");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test421");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>> typeEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(typeEntryItor0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test422");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.CharSequence>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.CharSequence> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.CharSequence> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.CharSequence>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test423");
        java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> charSequenceEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.CharSequence> charSequenceMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.CharSequence, java.lang.CharSequence>(charSequenceEntry0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test424");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.String> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.String> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.lang.String>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test425");
        java.util.Iterator<java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>> genericDeclarationEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>(genericDeclarationEntryItor0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test426");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.String> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.String> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.String>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test427");
        java.util.Map.Entry<java.lang.Object, java.lang.Object> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Object> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.Object> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.Object>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test428");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test429");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.io.Serializable>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.io.Serializable> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.io.Serializable> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.io.Serializable>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test430");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.String> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.String> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.String> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.String>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test431");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Comparable<java.lang.String>> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.Comparable<java.lang.String>> strSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.String, java.lang.Comparable<java.lang.String>>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test432");
        java.util.Map.Entry<java.lang.String, java.lang.reflect.AnnotatedElement> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.AnnotatedElement> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.reflect.AnnotatedElement> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.reflect.AnnotatedElement>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test433");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test434");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.constant.ConstantDesc> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.constant.ConstantDesc> strItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.String, java.lang.constant.ConstantDesc>(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test435");
        java.util.Map.Entry<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>(genericDeclarationEntry0, genericDeclarationMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test436");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.CharSequence> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.CharSequence> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.CharSequence>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test437");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.constant.ConstantDesc>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.constant.ConstantDesc>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test438");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.io.Serializable> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.io.Serializable> constableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.Constable, java.io.Serializable>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test439");
        java.util.Map.Entry<java.lang.Object, java.lang.reflect.GenericDeclaration> objEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.GenericDeclaration> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.reflect.GenericDeclaration> objMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Object, java.lang.reflect.GenericDeclaration>(objEntry0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test440");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test441");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.reflect.AnnotatedElement>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.AnnotatedElement> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.reflect.AnnotatedElement> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.reflect.AnnotatedElement>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test442");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test443");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.Object> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.Object> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.Object> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.Object>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test444");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.String> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.String> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.String> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.String>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test445");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.io.Serializable> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.io.Serializable> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.io.Serializable>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test446");
        java.util.Map.Entry<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(annotatedElementEntry0, annotatedElementMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test447");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.ConstantDesc, java.lang.CharSequence>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test448");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test449");
        java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>(typeDescriptorEntry0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test450");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.Object> charSequenceMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.Object> charSequenceItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.CharSequence, java.lang.Object>(charSequenceMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test451");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.Object> strItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.String, java.lang.Object>(strEntryItor0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test452");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.Object> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.Object> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.Object> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.Object>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test453");
        java.util.Map.Entry<java.lang.constant.Constable, java.lang.constant.Constable> constableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.Constable> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.constant.Constable> constableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.Constable, java.lang.constant.Constable>(constableEntry0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test454");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test455");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.io.Serializable, java.lang.reflect.GenericDeclaration>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test456");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.invoke.TypeDescriptor>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test457");
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strComparableEntry0, strComparableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test458");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(constantDescMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test459");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test460");
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.reflect.AnnotatedElement>> objEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.AnnotatedElement> objMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.reflect.AnnotatedElement> objItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.Object, java.lang.reflect.AnnotatedElement>(objEntryItor0, objMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test461");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test462");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test463");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test464");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.constant.ConstantDesc> serializableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.constant.ConstantDesc> serializableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.io.Serializable, java.lang.constant.ConstantDesc>(serializableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test465");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(annotatedElementMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test466");
        java.util.Iterator<java.util.Map.Entry<java.lang.constant.Constable, java.lang.constant.Constable>> constableEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.constant.Constable> constableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.constant.Constable> constableItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.constant.Constable, java.lang.constant.Constable>(constableEntryItor0, constableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test467");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test468");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test469");
        java.util.Map.Entry<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(constantDescEntry0, constantDescMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test470");
        java.util.Map.Entry<java.lang.String, java.lang.reflect.GenericDeclaration> strEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.String, java.lang.reflect.GenericDeclaration> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.reflect.GenericDeclaration> strMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.String, java.lang.reflect.GenericDeclaration>(strEntry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test471");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.Object> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.Object> objItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.Object, java.lang.Object>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test472");
        java.util.Map.Entry<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.io.Serializable, java.lang.Comparable<java.lang.String>>(serializableEntry0, serializableMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test473");
        java.util.Iterator<java.util.Map.Entry<java.lang.invoke.TypeDescriptor, java.io.Serializable>> typeDescriptorEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.invoke.TypeDescriptor, java.io.Serializable>(typeDescriptorEntryItor0, typeDescriptorMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test474");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test475");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test476");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Object, java.lang.reflect.AnnotatedElement> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.reflect.AnnotatedElement> objSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Object, java.lang.reflect.AnnotatedElement>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test477");
        java.util.Map.Entry<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test478");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>(constableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test479");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.lang.String> typeMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.String> typeItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.Type, java.lang.String>(typeMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test480");
        java.util.Map.Entry<java.lang.reflect.Type, java.io.Serializable> typeEntry0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.Type, java.io.Serializable> typeMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.io.Serializable> typeMapEntry2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry<java.lang.reflect.Type, java.io.Serializable>(typeEntry0, typeMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test481");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc> genericDeclarationSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.reflect.GenericDeclaration, java.lang.constant.ConstantDesc>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test482");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>(typeDescriptorMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test483");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableSet1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>(strComparableMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test484");
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>> charSequenceEntryItor0 = null;
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceItor2 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceEntryItor0, charSequenceMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: iterator");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AbstractDualBidiMapRegressionTest0.test485");
        org.apache.commons.collections4.bidimap.AbstractDualBidiMap<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationItor1 = new org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(genericDeclarationMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"normalMap\" because \"parent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

