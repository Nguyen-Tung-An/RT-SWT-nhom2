package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OptionGroupRegressionTest2 {

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
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1001");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        boolean boolean11 = optionGroup0.isRequired();
        boolean boolean12 = optionGroup0.isSelected();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1002");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isSelected();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1003");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        boolean boolean12 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1004");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1005");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1006");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.toString();
        boolean boolean15 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1007");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strCollection10);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1008");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(strCollection11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1009");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean8 = optionGroup0.isSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1010");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(strCollection9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1011");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.String str16 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(optionCollection17);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1012");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1013");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1014");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1015");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        boolean boolean15 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1016");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1017");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1018");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1019");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1020");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1021");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1022");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(strCollection11);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1023");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(optionCollection13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1024");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1025");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1026");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isRequired();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1027");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.toString();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1028");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection16 = optionGroup0.getNames();
        boolean boolean17 = optionGroup0.isSelected();
        java.lang.String str18 = optionGroup0.getSelected();
        boolean boolean19 = optionGroup0.isRequired();
        java.lang.String str20 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1029");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1030");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1031");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1032");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1033");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.toString();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1034");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.toString();
        boolean boolean4 = optionGroup0.isSelected();
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1035");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1036");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        java.lang.String str16 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass20 = optionCollection19.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strCollection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1037");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1038");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1039");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1040");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1041");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1042");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isSelected();
        java.lang.String str18 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str21 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1043");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1044");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strCollection13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1045");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isRequired();
        boolean boolean14 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1046");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        boolean boolean7 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1047");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1048");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass7 = strCollection6.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1049");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1050");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1051");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isSelected();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1052");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1053");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1054");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1055");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        boolean boolean11 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1056");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1057");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass9 = optionCollection8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1058");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1059");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1060");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1061");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(optionCollection12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1062");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass14 = optionCollection13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1063");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        boolean boolean14 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionCollection17);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1064");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isSelected();
        boolean boolean13 = optionGroup0.isSelected();
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1065");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        java.lang.String str16 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection20 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection21 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strCollection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(optionCollection20);
        org.junit.Assert.assertNotNull(strCollection21);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1066");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1067");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        boolean boolean3 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strCollection4);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1068");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(optionCollection12);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1069");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strCollection9);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1070");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = optionGroup0.getOptions();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strCollection13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1071");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionCollection15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1072");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(optionCollection17);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1073");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1074");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1075");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean15 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1076");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass3 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1077");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1078");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isSelected();
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1079");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1080");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1081");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1082");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection17 = optionGroup0.getNames();
        boolean boolean18 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1083");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1084");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        boolean boolean11 = optionGroup0.isSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1085");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1086");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1087");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        boolean boolean11 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1088");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isSelected();
        java.lang.String str5 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1089");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isSelected();
        boolean boolean11 = optionGroup0.isSelected();
        boolean boolean12 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1090");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1091");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1092");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        boolean boolean12 = optionGroup0.isRequired();
        boolean boolean13 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1093");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1094");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1095");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        boolean boolean11 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1096");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        boolean boolean13 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        java.util.Collection<java.lang.String> strCollection16 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strCollection16);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1097");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1098");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1099");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean17 = optionGroup0.isRequired();
        java.lang.String str18 = optionGroup0.toString();
        org.apache.commons.cli.Option option19 = null;
        optionGroup0.setSelected(option19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1100");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1101");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1102");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        boolean boolean12 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1103");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1104");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection10);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1105");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionCollection7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1106");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str21 = optionGroup0.toString();
        boolean boolean22 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option23 = null;
        optionGroup0.setSelected(option23);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1107");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1108");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1109");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1110");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection16 = optionGroup0.getNames();
        boolean boolean17 = optionGroup0.isSelected();
        java.lang.String str18 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup0.getOptions();
        boolean boolean20 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1111");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isSelected();
        boolean boolean9 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1112");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1113");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1114");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection16 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup20 = optionGroup0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strCollection15);
        org.junit.Assert.assertNotNull(optionCollection16);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1115");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isSelected();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1116");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNotNull(strCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1117");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1118");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isSelected();
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isRequired();
        boolean boolean13 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1119");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1120");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1121");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        boolean boolean8 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1122");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        java.lang.String str16 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1123");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(optionCollection14);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1124");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1125");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str16 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1126");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass10 = optionCollection9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1127");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1128");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1129");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1130");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        optionGroup0.setRequired(false);
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1131");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1132");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        boolean boolean2 = optionGroup0.isSelected();
        java.lang.String str3 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass4 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1133");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        boolean boolean6 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1134");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        boolean boolean13 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1135");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strCollection15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1136");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1137");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1138");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1139");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1140");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isSelected();
        boolean boolean11 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1141");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1142");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strCollection13);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1143");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isSelected();
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isSelected();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1144");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionCollection18);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1145");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1146");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean17 = optionGroup0.isRequired();
        java.lang.String str18 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection19 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(strCollection19);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1147");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1148");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionCollection8);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1149");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1150");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isSelected();
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1151");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1152");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1153");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1154");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strCollection11);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1155");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        boolean boolean6 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1156");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strCollection13);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1157");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isSelected();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1158");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1159");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1160");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.String str13 = optionGroup0.toString();
        boolean boolean14 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1161");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1162");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        boolean boolean12 = optionGroup0.isSelected();
        boolean boolean13 = optionGroup0.isSelected();
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.String str15 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1163");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        boolean boolean10 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1164");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = optionGroup0.getOptions();
        boolean boolean15 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup17 = optionGroup0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1165");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1166");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection9);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1167");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        optionGroup0.setRequired(false);
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1168");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        boolean boolean12 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean15 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1169");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.getSelected();
        boolean boolean6 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1170");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1171");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1172");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass12 = strCollection11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1173");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        boolean boolean6 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1174");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1175");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1176");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1177");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1178");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection5);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1179");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isSelected();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strCollection8);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1180");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        boolean boolean6 = optionGroup0.isSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1181");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        boolean boolean2 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1182");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        boolean boolean10 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1183");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1184");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1185");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionCollection17);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1186");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.String str10 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(optionCollection11);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1187");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.getSelected();
        boolean boolean16 = optionGroup0.isSelected();
        java.lang.String str17 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean20 = optionGroup0.isRequired();
        java.lang.String str21 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1188");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass11 = optionCollection10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1189");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        boolean boolean9 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1190");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1191");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1192");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isSelected();
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.Class<?> wildcardClass14 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1193");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean8 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1194");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1195");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.lang.String str3 = optionGroup0.toString();
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1196");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.String str11 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1197");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1198");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        java.lang.String str13 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str16 = optionGroup0.toString();
        boolean boolean17 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1199");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1200");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isSelected();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1201");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup13 = optionGroup0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strCollection11);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1202");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1203");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1204");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1205");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1206");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1207");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1208");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        optionGroup0.setRequired(false);
        java.lang.String str8 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1209");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean17 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection18 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strCollection18);
        org.junit.Assert.assertNotNull(optionCollection21);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1210");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str13 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1211");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1212");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1213");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionCollection7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1214");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isSelected();
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1215");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1216");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isSelected();
        java.lang.String str12 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(optionCollection13);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1217");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        boolean boolean2 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass11 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1218");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1219");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(optionCollection8);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1220");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1221");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1222");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        boolean boolean11 = optionGroup0.isRequired();
        boolean boolean12 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1223");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1224");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        boolean boolean2 = optionGroup0.isSelected();
        java.lang.Class<?> wildcardClass3 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1225");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strCollection10);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1226");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strCollection15);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1227");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        java.lang.String str14 = optionGroup0.toString();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isRequired();
        boolean boolean18 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1228");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1229");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        boolean boolean3 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strCollection6);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1230");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1231");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.lang.String str21 = optionGroup0.toString();
        boolean boolean22 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection23 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strCollection23);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1232");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isSelected();
        java.lang.String str10 = optionGroup0.toString();
        java.lang.String str11 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1233");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1234");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        boolean boolean8 = optionGroup0.isSelected();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1235");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str8 = optionGroup0.getSelected();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.String str13 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup15 = optionGroup0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1236");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isSelected();
        boolean boolean11 = optionGroup0.isRequired();
        boolean boolean12 = optionGroup0.isSelected();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1237");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNotNull(strCollection13);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1238");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1239");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection17 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(strCollection14);
        org.junit.Assert.assertNotNull(strCollection17);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1240");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(strCollection4);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1241");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionCollection12);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1242");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup6 = optionGroup0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strCollection4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1243");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1244");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionCollection12);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1245");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1246");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        boolean boolean16 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1247");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(strCollection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1248");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1249");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strCollection8);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1250");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option22 = null;
        optionGroup0.setSelected(option22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1251");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strCollection13);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1252");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        boolean boolean16 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1253");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass8 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1254");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.toString();
        boolean boolean8 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1255");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isRequired();
        boolean boolean13 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strCollection14);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1256");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1257");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1258");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        boolean boolean17 = optionGroup0.isSelected();
        boolean boolean18 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1259");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection5);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1260");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        boolean boolean11 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strCollection14);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1261");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str15 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass18 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1262");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.String str16 = optionGroup0.toString();
        java.lang.String str17 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1263");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isSelected();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1264");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1265");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1266");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isRequired();
        boolean boolean8 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1267");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1268");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.toString();
        boolean boolean5 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1269");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strCollection7);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1270");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        boolean boolean13 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strCollection11);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1271");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        boolean boolean2 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strCollection5);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1272");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.toString();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1273");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.lang.String str12 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strCollection13);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1274");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        boolean boolean2 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1275");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        java.lang.String str15 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup20 = optionGroup0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(optionCollection18);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1276");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup11 = optionGroup0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1277");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionCollection8);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1278");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass20 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1279");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        boolean boolean11 = optionGroup0.isRequired();
        boolean boolean12 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1280");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup8 = optionGroup0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strCollection6);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1281");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection18 = optionGroup0.getNames();
        boolean boolean19 = optionGroup0.isRequired();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNotNull(strCollection14);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(strCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1282");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionCollection8);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1283");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        boolean boolean3 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strCollection4);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1284");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass15 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1285");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean17 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass18 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1286");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        java.lang.String str5 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean8 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        java.lang.String str11 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1287");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.toString();
        boolean boolean4 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1288");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1289");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isSelected();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isRequired();
        boolean boolean11 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1290");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1291");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1292");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection20 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertNotNull(strCollection20);
        org.junit.Assert.assertNotNull(optionCollection21);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1293");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isRequired();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1294");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1295");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean11 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        boolean boolean15 = optionGroup0.isSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1296");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1297");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.toString();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1298");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isRequired();
        optionGroup0.setRequired(false);
        boolean boolean16 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1299");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strCollection15);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1300");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection14 = optionGroup0.getOptions();
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(optionCollection14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1301");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionCollection12);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1302");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1303");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1304");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        boolean boolean10 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1305");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1306");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        optionGroup0.setRequired(false);
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1307");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        boolean boolean8 = optionGroup0.isSelected();
        boolean boolean9 = optionGroup0.isRequired();
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.String str12 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1308");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(optionCollection9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1309");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.lang.String str7 = optionGroup0.toString();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        boolean boolean11 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1310");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1311");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(optionCollection8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1312");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean17 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection18 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strCollection18);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1313");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1314");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strCollection15);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1315");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.lang.String str12 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.lang.String str15 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1316");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isSelected();
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1317");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        java.lang.String str13 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean16 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1318");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        java.lang.String str11 = optionGroup0.toString();
        boolean boolean12 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1319");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup16 = optionGroup0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1320");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        boolean boolean11 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strCollection12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1321");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        java.lang.Class<?> wildcardClass6 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1322");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1323");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.lang.String str4 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(optionCollection5);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1324");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str15 = optionGroup0.getSelected();
        java.lang.String str16 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1325");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.String str3 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1326");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        boolean boolean7 = optionGroup0.isSelected();
        java.lang.String str8 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1327");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        boolean boolean16 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1328");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isRequired();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1329");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        boolean boolean9 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionCollection10);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1330");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(strCollection14);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1331");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str5 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1332");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isRequired();
        java.lang.String str7 = optionGroup0.getSelected();
        java.lang.String str8 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1333");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection9 = optionGroup0.getOptions();
        boolean boolean10 = optionGroup0.isSelected();
        java.lang.String str11 = optionGroup0.getSelected();
        boolean boolean12 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option13 = null;
        optionGroup0.setSelected(option13);
        org.apache.commons.cli.Option option15 = null;
        optionGroup0.setSelected(option15);
        java.lang.Class<?> wildcardClass17 = optionGroup0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(optionCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1334");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isSelected();
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1335");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strCollection5);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1336");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1337");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.lang.String str3 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1338");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(optionCollection13);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1339");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1340");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        boolean boolean3 = optionGroup0.isSelected();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        boolean boolean6 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1341");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.toString();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass10 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1342");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        boolean boolean9 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        boolean boolean12 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionCollection15);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1343");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection20 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNotNull(strCollection20);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1344");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        java.lang.String str6 = optionGroup0.getSelected();
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(optionCollection8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1345");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        boolean boolean6 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1346");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(strCollection12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1347");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.toString();
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1348");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        java.lang.String str7 = optionGroup0.toString();
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1349");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(false);
        boolean boolean7 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        optionGroup0.setRequired(true);
        java.lang.String str13 = optionGroup0.toString();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup15 = optionGroup0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1350");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        java.lang.String str16 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option17 = null;
        optionGroup0.setSelected(option17);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup0.getOptions();
        java.lang.String str20 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection21 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option22 = null;
        optionGroup0.setSelected(option22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strCollection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(optionCollection19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(optionCollection21);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1351");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1352");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        boolean boolean14 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection15 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass16 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(strCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionCollection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1353");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        boolean boolean5 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection<java.lang.String> strCollection17 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strCollection17);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1354");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        boolean boolean7 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1355");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option2 = null;
        optionGroup0.setSelected(option2);
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        boolean boolean12 = optionGroup0.isRequired();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1356");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.util.Collection<java.lang.String> strCollection13 = optionGroup0.getNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strCollection13);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1357");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection5);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1358");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        java.lang.String str8 = optionGroup0.toString();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1359");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.lang.String str2 = optionGroup0.getSelected();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        optionGroup0.setSelected(option4);
        optionGroup0.setRequired(false);
        java.lang.String str8 = optionGroup0.toString();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass12 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1360");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        org.apache.commons.cli.Option option9 = null;
        optionGroup0.setSelected(option9);
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        optionGroup0.setRequired(false);
        boolean boolean15 = optionGroup0.isSelected();
        optionGroup0.setRequired(false);
        java.lang.String str18 = optionGroup0.toString();
        boolean boolean19 = optionGroup0.isSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1361");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.String str11 = optionGroup0.toString();
        java.lang.String str12 = optionGroup0.getSelected();
        java.lang.Class<?> wildcardClass13 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1362");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        boolean boolean13 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1363");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        boolean boolean5 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option6 = null;
        optionGroup0.setSelected(option6);
        org.apache.commons.cli.Option option8 = null;
        optionGroup0.setSelected(option8);
        boolean boolean10 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        java.lang.String str13 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strCollection14);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1364");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionCollection6);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1365");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.lang.String str4 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection8 = optionGroup0.getOptions();
        java.lang.String str9 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection10 = optionGroup0.getNames();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup12 = optionGroup0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strCollection10);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1366");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.lang.String str3 = optionGroup0.toString();
        boolean boolean4 = optionGroup0.isRequired();
        java.lang.Class<?> wildcardClass5 = optionGroup0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1367");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1368");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        java.lang.String str8 = optionGroup0.toString();
        java.lang.String str9 = optionGroup0.toString();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1369");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        java.lang.String str10 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1370");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.String str4 = optionGroup0.getSelected();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        boolean boolean11 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection12 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = optionGroup0.getOptions();
        java.lang.String str14 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionCollection12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1371");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        boolean boolean7 = optionGroup0.isSelected();
        java.util.Collection<java.lang.String> strCollection8 = optionGroup0.getNames();
        boolean boolean9 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection11 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection12 = optionGroup0.getNames();
        java.lang.String str13 = optionGroup0.getSelected();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(optionCollection11);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1372");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.lang.String str6 = optionGroup0.getSelected();
        java.lang.String str7 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.lang.String str10 = optionGroup0.toString();
        org.apache.commons.cli.Option option11 = null;
        optionGroup0.setSelected(option11);
        boolean boolean13 = optionGroup0.isSelected();
        org.apache.commons.cli.Option option14 = null;
        optionGroup0.setSelected(option14);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1373");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection5 = optionGroup0.getOptions();
        java.lang.String str6 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        optionGroup0.setRequired(true);
        java.lang.String str11 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option12 = null;
        optionGroup0.setSelected(option12);
        java.util.Collection<java.lang.String> strCollection14 = optionGroup0.getNames();
        java.lang.String str15 = optionGroup0.getSelected();
        boolean boolean16 = optionGroup0.isSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection17 = optionGroup0.getOptions();
        java.lang.String str18 = optionGroup0.getSelected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strCollection14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(optionCollection17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1374");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection4 = optionGroup0.getOptions();
        optionGroup0.setRequired(false);
        java.lang.String str7 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection10 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass11 = optionCollection10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertNotNull(optionCollection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(optionCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1375");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option10 = null;
        optionGroup0.setSelected(option10);
        optionGroup0.setRequired(false);
        java.lang.String str14 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection15 = optionGroup0.getNames();
        java.lang.String str16 = optionGroup0.getSelected();
        boolean boolean17 = optionGroup0.isRequired();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection18 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection19 = optionGroup0.getOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strCollection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionCollection18);
        org.junit.Assert.assertNotNull(optionCollection19);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionGroupRegressionTest2.test1376");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str1 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection2 = optionGroup0.getOptions();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection3 = optionGroup0.getOptions();
        boolean boolean4 = optionGroup0.isRequired();
        boolean boolean5 = optionGroup0.isRequired();
        java.lang.String str6 = optionGroup0.toString();
        boolean boolean7 = optionGroup0.isSelected();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.getSelected();
        boolean boolean10 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection11 = optionGroup0.getNames();
        java.lang.String str12 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup14 = optionGroup0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(optionCollection2);
        org.junit.Assert.assertNotNull(optionCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strCollection11);
        org.junit.Assert.assertNull(str12);
    }
}

