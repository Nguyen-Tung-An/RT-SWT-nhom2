package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PatternOptionBuilderRegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test01");
        java.lang.Class<java.util.Date> dateClass0 = org.apache.commons.cli.PatternOptionBuilder.DATE_VALUE;
        org.junit.Assert.assertNotNull(dateClass0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test02");
        java.lang.Class<?> wildcardClass0 = org.apache.commons.cli.PatternOptionBuilder.CLASS_VALUE;
        org.junit.Assert.assertNotNull(wildcardClass0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test03");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test04");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<java.util.Date> dateClass0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test05");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('a');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test06");
        java.lang.Class<java.lang.Object> objClass0 = org.apache.commons.cli.PatternOptionBuilder.OBJECT_VALUE;
        org.junit.Assert.assertNotNull(objClass0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test07");
        java.lang.Class<java.io.File> fileClass0 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        org.junit.Assert.assertNotNull(fileClass0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test08");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType('4');
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test09");
        java.lang.Class<java.io.FileInputStream> fileInputStreamClass0 = org.apache.commons.cli.PatternOptionBuilder.EXISTING_FILE_VALUE;
        org.junit.Assert.assertNotNull(fileInputStreamClass0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test10");
        java.lang.Class<java.lang.Number> numberClass0 = org.apache.commons.cli.PatternOptionBuilder.NUMBER_VALUE;
        org.junit.Assert.assertNotNull(numberClass0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test11");
        org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("");
        java.lang.Class<?> wildcardClass2 = options1.getClass();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test12");
        java.lang.Class<java.lang.String> strClass0 = org.apache.commons.cli.PatternOptionBuilder.STRING_VALUE;
        org.junit.Assert.assertNotNull(strClass0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test13");
        java.lang.Class<java.net.URL> uRLClass0 = org.apache.commons.cli.PatternOptionBuilder.URL_VALUE;
        org.junit.Assert.assertNotNull(uRLClass0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test14");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType('a');
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test16");
        org.apache.commons.cli.PatternOptionBuilder patternOptionBuilder0 = new org.apache.commons.cli.PatternOptionBuilder();
        java.lang.Class<?> wildcardClass1 = patternOptionBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable constable0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.constant.Constable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test18");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType('#');
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test20");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.CharSequence");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test21");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.reflect.GenericDeclaration");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test22");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.reflect.Type");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test23");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test24");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('4');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test25");
        java.lang.Class<java.io.File[]> fileArrayClass0 = org.apache.commons.cli.PatternOptionBuilder.FILES_VALUE;
        org.junit.Assert.assertNotNull(fileArrayClass0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test26");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test27");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.constant.ConstantDesc");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test28");
        org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("hi!");
        java.lang.Class<?> wildcardClass2 = options1.getClass();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test29");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test30");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass(' ');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test31");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('#');
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class java.util.Date");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class java.util.Date");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class java.util.Date");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test32");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType(' ');
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test33");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.io.Serializable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test34");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test35");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test36");
        java.lang.Object obj0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test37");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.invoke.TypeDescriptor$OfField");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test38");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.PatternOptionBuilder patternOptionBuilder0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to org.apache.commons.cli.PatternOptionBuilder");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test39");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.invoke.TypeDescriptor typeDescriptor0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to java.lang.invoke.TypeDescriptor");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PatternOptionBuilderRegressionTest0.test40");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options0 = org.apache.commons.cli.PatternOptionBuilder.unsupported();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.cli.PatternOptionBuilder$$Lambda$109/0x00000251020ca5f8 to org.apache.commons.cli.Options");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }
}

