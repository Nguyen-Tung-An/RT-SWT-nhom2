package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OptionRegressionTest2 {

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
            System.out.format("%n%s%n", "OptionRegressionTest2.test1001");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.required(false);
        org.apache.commons.cli.Option.Builder builder8 = builder2.valueSeparator('4');
        org.apache.commons.cli.Option.Builder builder10 = builder8.valueSeparator(' ');
        org.apache.commons.cli.Option.Builder builder11 = builder8.required();
        org.apache.commons.cli.Option.Builder builder13 = builder11.argName("[ Option null  ::  :: class org.apache.commons.cli.Option ]");
        org.apache.commons.cli.Option.Builder builder15 = builder13.valueSeparator('\000');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1002");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        java.lang.String str18 = option16.getValue((int) (short) 100);
        java.lang.String str19 = option16.getArgName();
        boolean boolean20 = option16.hasLongOpt();
        option16.clearValues();
        java.lang.String str22 = option16.getKey();
        boolean boolean23 = option16.isValuesEmpty();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes24 = option16.getDeprecated();
        java.lang.String str26 = option16.getValue("[ Option null [ARG...] ::  :: class java.lang.String ]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = option16.addValue("[ Option null [ Option null  ::  :: class java.lang.String ] ::  :: class java.lang.String ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the processValue method instead.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(deprecatedAttributes24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Option null [ARG...] ::  :: class java.lang.String ]" + "'", str26, "[ Option null [ARG...] ::  :: class java.lang.String ]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1003");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        java.lang.String str17 = option16.getOpt();
        java.lang.String str18 = option16.getDescription();
        java.lang.String str19 = option16.getValue();
        org.apache.commons.cli.Option.Builder builder20 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes21 = null;
        org.apache.commons.cli.Option.Builder builder22 = builder20.deprecated(deprecatedAttributes21);
        org.apache.commons.cli.Option.Builder builder24 = builder22.desc("hi!");
        org.apache.commons.cli.Option.Builder builder26 = builder22.required(false);
        org.apache.commons.cli.Option.Builder builder28 = builder22.valueSeparator('4');
        org.apache.commons.cli.Option.Builder builder29 = builder22.required();
        org.apache.commons.cli.Option.Builder builder31 = builder29.optionalArg(true);
        org.apache.commons.cli.Option.Builder builder33 = builder31.hasArg(false);
        org.apache.commons.cli.Option.Builder builder35 = builder31.valueSeparator('4');
        java.lang.Class<?> wildcardClass36 = builder31.getClass();
        boolean boolean37 = option16.equals((java.lang.Object) wildcardClass36);
        boolean boolean38 = option16.hasLongOpt();
        boolean boolean39 = option16.requiresArg();
        boolean boolean40 = option16.hasArgName();
        option16.setDescription("[ Option null [ARG...] ::  :: class java.lang.String ]");
        java.lang.Object obj43 = option16.clone();
        boolean boolean44 = option16.hasArg();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "[ Option null  :: [ Option null [ARG...] ::  :: class java.lang.String ] :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "[ Option null  :: [ Option null [ARG...] ::  :: class java.lang.String ] :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "[ Option null  :: [ Option null [ARG...] ::  :: class java.lang.String ] :: class java.lang.String ]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1004");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.required(false);
        org.apache.commons.cli.Option.Builder builder8 = builder2.valueSeparator('4');
        org.apache.commons.cli.Option.Builder builder9 = builder2.required();
        org.apache.commons.cli.Option.Builder builder10 = builder2.deprecated();
        org.apache.commons.cli.Option.Builder builder11 = builder2.required();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option.Builder builder13 = builder2.option("[ Option null [ Option null  ::  :: class java.lang.String ] ::  :: class org.apache.commons.cli.Option$Builder ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '['.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1005");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder5 = builder2.required();
        org.apache.commons.cli.Option.Builder builder7 = builder5.hasArg(true);
        org.apache.commons.cli.Option.Builder builder8 = builder7.required();
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1006");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasArgName();
        java.lang.String str18 = option16.getOpt();
        java.lang.String[] strArray19 = option16.getValues();
        java.lang.String str20 = option16.getLongOpt();
        java.lang.Object obj21 = option16.clone();
        option16.setValueSeparator(' ');
        org.apache.commons.cli.Option.Builder builder24 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes25 = null;
        org.apache.commons.cli.Option.Builder builder26 = builder24.deprecated(deprecatedAttributes25);
        org.apache.commons.cli.Option.Builder builder28 = builder26.desc("hi!");
        org.apache.commons.cli.Option.Builder builder30 = builder26.hasArg(false);
        org.apache.commons.cli.Option.Builder builder32 = builder30.longOpt("");
        org.apache.commons.cli.Option.Builder builder33 = builder32.hasArg();
        org.apache.commons.cli.Option.Builder builder35 = builder33.desc("");
        org.apache.commons.cli.Option.Builder builder37 = builder35.hasArg(true);
        org.apache.commons.cli.Option.Builder builder39 = builder37.numberOfArgs(0);
        org.apache.commons.cli.Option option40 = builder39.build();
        java.lang.String str41 = option40.toString();
        org.apache.commons.cli.Converter<?, ?> wildcardConverter42 = option40.getConverter();
        boolean boolean43 = option16.equals((java.lang.Object) wildcardConverter42);
        java.lang.String str44 = option16.getDescription();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[ Option null  ::  :: class java.lang.String ]" + "'", str41, "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertNotNull(wildcardConverter42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1007");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasValueSeparator();
        java.util.List<java.lang.String> strList18 = option16.getValuesList();
        org.apache.commons.cli.Converter<?, ?> wildcardConverter19 = option16.getConverter();
        java.util.List<java.lang.String> strList20 = option16.getValuesList();
        java.lang.String str21 = option16.getOpt();
        java.lang.String str22 = option16.toDeprecatedString();
        java.lang.String str23 = option16.toString();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardConverter19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ Option null  ::  :: class java.lang.String ]" + "'", str23, "[ Option null  ::  :: class java.lang.String ]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1008");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes9 = null;
        org.apache.commons.cli.Option.Builder builder10 = builder6.deprecated(deprecatedAttributes9);
        org.apache.commons.cli.Option.Builder builder11 = builder10.deprecated();
        org.apache.commons.cli.Option.Builder builder13 = builder11.longOpt("hi!");
        org.apache.commons.cli.Option.Builder builder15 = builder13.argName("hi!");
        org.apache.commons.cli.Option.Builder builder17 = builder13.optionalArg(true);
        org.apache.commons.cli.Option.Builder builder19 = builder17.optionalArg(true);
        org.apache.commons.cli.Option.Builder builder21 = builder17.since("[ Option null  ::  :: class org.apache.commons.cli.Option$Builder ]");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty option name.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1010");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasArgName();
        java.lang.String str18 = option16.getOpt();
        java.lang.String[] strArray19 = option16.getValues();
        java.lang.String str20 = option16.getLongOpt();
        java.lang.Object obj21 = option16.clone();
        option16.setValueSeparator(' ');
        option16.setArgName("hi!");
        org.apache.commons.cli.Converter<?, ?> wildcardConverter26 = option16.getConverter();
        org.apache.commons.cli.Option.Builder builder27 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes28 = null;
        org.apache.commons.cli.Option.Builder builder29 = builder27.deprecated(deprecatedAttributes28);
        org.apache.commons.cli.Option.Builder builder31 = builder29.desc("hi!");
        org.apache.commons.cli.Option.Builder builder33 = builder29.required(false);
        org.apache.commons.cli.Option.Builder builder35 = builder33.optionalArg(false);
        org.apache.commons.cli.Option.Builder builder36 = builder35.deprecated();
        org.apache.commons.cli.Option.Builder builder38 = builder35.optionalArg(true);
        boolean boolean39 = option16.equals((java.lang.Object) true);
        java.lang.String str40 = option16.getSince();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertNotNull(wildcardConverter26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1011");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.required(false);
        org.apache.commons.cli.Option.Builder builder17 = builder13.required(false);
        org.apache.commons.cli.Option.Builder builder19 = builder13.required(true);
        org.apache.commons.cli.Option.Builder builder21 = builder19.longOpt("[ Option null  ::  :: class java.lang.String ]");
        org.apache.commons.cli.Option.Builder builder22 = builder21.deprecated();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1012");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.required(false);
        org.apache.commons.cli.Option.Builder builder7 = builder2.hasArgs();
        org.apache.commons.cli.Option.Builder builder8 = builder7.deprecated();
        org.apache.commons.cli.Option.Builder builder9 = builder8.valueSeparator();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes10 = null;
        org.apache.commons.cli.Option.Builder builder11 = builder9.deprecated(deprecatedAttributes10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1013");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        java.lang.String str17 = option16.getOpt();
        java.lang.String str18 = option16.getDescription();
        java.lang.String str19 = option16.getValue();
        option16.setOptionalArg(false);
        java.lang.String str22 = option16.getOpt();
        java.lang.String str23 = option16.getValue();
        java.lang.String str25 = option16.getValue("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1014");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        java.lang.String str17 = option16.toString();
        java.lang.String str18 = option16.getKey();
        boolean boolean19 = option16.isValuesEmpty();
        char char20 = option16.getValueSeparator();
        boolean boolean21 = option16.hasArg();
        int int22 = option16.getArgs();
        java.lang.String str23 = option16.getValue();
        java.lang.String str25 = option16.getValue((int) (short) 0);
        java.lang.String str26 = option16.toString();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Option null  ::  :: class java.lang.String ]" + "'", str17, "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Option null  ::  :: class java.lang.String ]" + "'", str26, "[ Option null  ::  :: class java.lang.String ]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1015");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasValueSeparator();
        java.util.List<java.lang.String> strList18 = option16.getValuesList();
        org.apache.commons.cli.Converter<?, ?> wildcardConverter19 = option16.getConverter();
        java.util.List<java.lang.String> strList20 = option16.getValuesList();
        java.lang.String str21 = option16.getOpt();
        boolean boolean22 = option16.acceptsArg();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardConverter19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1016");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        java.lang.String str18 = option16.getValue((int) (short) 100);
        java.lang.String str19 = option16.getArgName();
        boolean boolean20 = option16.hasLongOpt();
        option16.clearValues();
        java.lang.String str22 = option16.getKey();
        boolean boolean23 = option16.isValuesEmpty();
        java.util.List<java.lang.String> strList24 = option16.getValuesList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = option16.addValue("[ Option null  ::  :: class java.lang.String ]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The addValue method is not intended for client use. Subclasses should use the processValue method instead.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1017");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.required(false);
        org.apache.commons.cli.Option.Builder builder8 = builder2.optionalArg(true);
        org.apache.commons.cli.Option.Builder builder10 = builder2.argName("hi!");
        org.apache.commons.cli.Option.Builder builder12 = builder10.optionalArg(false);
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes13 = null;
        org.apache.commons.cli.Option.Builder builder14 = builder10.deprecated(deprecatedAttributes13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("[ Option null  :: hi! :: class org.apache.commons.cli.Option$Builder ]", "[ Option null [ARG...] ::  :: class java.lang.String ]", false, "[ Option null [ARG...] ::  :: class java.lang.String ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '['.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1019");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasArgName();
        java.lang.String str18 = option16.getOpt();
        java.lang.String[] strArray19 = option16.getValues();
        java.lang.String str20 = option16.getLongOpt();
        option16.setArgName("");
        option16.setOptionalArg(false);
        option16.setRequired(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Option option2 = new org.apache.commons.cli.Option("[ Option null  :: hi! :: class org.apache.commons.cli.Option$Builder ]", "[ Option null  ::  :: class java.lang.String ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '['.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1021");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        java.lang.String str18 = option16.getValue((int) (short) 100);
        java.lang.String str19 = option16.getArgName();
        java.lang.String str20 = option16.getOpt();
        boolean boolean21 = option16.hasArgName();
        boolean boolean22 = option16.hasArgName();
        option16.setOptionalArg(false);
        option16.setOptionalArg(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1022");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasValueSeparator();
        java.util.List<java.lang.String> strList18 = option16.getValuesList();
        org.apache.commons.cli.Converter<?, ?> wildcardConverter19 = option16.getConverter();
        java.util.List<java.lang.String> strList20 = option16.getValuesList();
        java.lang.String str21 = option16.getOpt();
        java.lang.String str22 = option16.toDeprecatedString();
        boolean boolean23 = option16.hasLongOpt();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardConverter19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1023");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasArgName();
        java.lang.String str18 = option16.getOpt();
        java.lang.String[] strArray19 = option16.getValues();
        boolean boolean20 = option16.hasArg();
        java.lang.String str21 = option16.toString();
        option16.clearValues();
        boolean boolean23 = option16.isRequired();
        java.lang.String str24 = option16.getArgName();
        java.lang.String str26 = option16.getValue("[ Option null [ARG...] ::  :: class java.lang.String ]");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[ Option null  ::  :: class java.lang.String ]" + "'", str21, "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Option null [ARG...] ::  :: class java.lang.String ]" + "'", str26, "[ Option null [ARG...] ::  :: class java.lang.String ]");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1024");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        boolean boolean17 = option16.hasArgName();
        java.lang.String str18 = option16.toString();
        org.apache.commons.cli.Converter<?, ?> wildcardConverter19 = option16.getConverter();
        java.lang.String str20 = option16.toDeprecatedString();
        org.apache.commons.cli.Converter<?, ?> wildcardConverter21 = option16.getConverter();
        int int22 = option16.getArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ Option null  ::  :: class java.lang.String ]" + "'", str18, "[ Option null  ::  :: class java.lang.String ]");
        org.junit.Assert.assertNotNull(wildcardConverter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardConverter21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OptionRegressionTest2.test1025");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.DeprecatedAttributes deprecatedAttributes1 = null;
        org.apache.commons.cli.Option.Builder builder2 = builder0.deprecated(deprecatedAttributes1);
        org.apache.commons.cli.Option.Builder builder4 = builder2.desc("hi!");
        org.apache.commons.cli.Option.Builder builder6 = builder2.hasArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder9 = builder8.hasArg();
        org.apache.commons.cli.Option.Builder builder11 = builder9.desc("");
        org.apache.commons.cli.Option.Builder builder13 = builder11.hasArg(true);
        org.apache.commons.cli.Option.Builder builder15 = builder13.numberOfArgs(0);
        org.apache.commons.cli.Option option16 = builder15.build();
        java.lang.String str18 = option16.getValue((int) (short) 100);
        option16.setOptionalArg(true);
        java.lang.String str21 = option16.getKey();
        option16.setRequired(true);
        boolean boolean24 = option16.hasValueSeparator();
        option16.setValueSeparator('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

