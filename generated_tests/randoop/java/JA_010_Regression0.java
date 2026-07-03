import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_010_Regression0 {

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
            System.out.format("%n%s%n", "JA_010_Regression0.test01");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test02");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor5 = commandLine1.iterator();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNotNull(optionItor5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test03");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String str15 = commandLine1.getOptionValue(optionGroup14);
        org.apache.commons.cli.Option option16 = null;
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = builder17.setDeprecatedHandler(optionConsumer18);
        java.lang.Class<?> wildcardClass20 = builder19.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration21 = commandLine1.getParsedOptionValue(option16, (java.lang.reflect.GenericDeclaration) wildcardClass20);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(genericDeclaration21);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test04");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option[] optionArray14 = commandLine1.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        java.io.Serializable[] serializableArray16 = commandLine1.getParsedOptionValues(optionGroup15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(serializableArray16);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test05");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        boolean boolean15 = commandLine1.hasOption("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test06");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        java.util.List<java.lang.String> strList18 = commandLine1.getArgList();
        java.lang.String str21 = commandLine1.getOptionValue("", "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test07");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.String str8 = commandLine1.getOptionValue(option6, "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test08");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option[] optionArray14 = commandLine1.getOptions();
        java.lang.constant.Constable[] constableArray16 = commandLine1.getParsedOptionValues("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(constableArray16);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test09");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.lang.String[] strArray9 = commandLine1.getOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test10");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        java.lang.String str18 = commandLine1.getOptionValue("hi!", strSupplier17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test11");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.lang.String[] strArray22 = commandLine1.getOptionValues(option21);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test12");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = builder7.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.CommandLine commandLine10 = commandLine1.getParsedOptionValue('4', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder7);
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        java.lang.String str13 = commandLine1.getOptionValue(optionGroup11, strSupplier12);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test13");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray22 = commandLine1.getParsedOptionValues("hi!");
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        java.lang.String str25 = commandLine1.getOptionValue(optionGroup23, strSupplier24);
        int int27 = commandLine1.getOptionCount("");
        java.lang.String[] strArray28 = commandLine1.getArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(genericDeclarationArray22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test14");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option[] optionArray14 = commandLine1.getOptions();
        java.util.List<java.lang.String> strList15 = commandLine1.getArgList();
        org.apache.commons.cli.Option option16 = null;
        java.lang.Comparable<java.lang.String> strComparable18 = commandLine1.getParsedOptionValue(option16, (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test15");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine1.getOptionValue(option21, strSupplier22);
        boolean boolean25 = commandLine1.hasOption(' ');
        java.lang.String str27 = commandLine1.getOptionValue("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test16");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option[] optionArray14 = commandLine1.getOptions();
        java.lang.Object obj16 = commandLine1.getOptionObject("");
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        java.lang.String str19 = commandLine1.getOptionValue(optionGroup17, "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test17");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.String[] strArray10 = commandLine2.getOptionValues('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test18");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[][] strArray12 = commandLine1.getParsedOptionValues(option11);
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray14 = commandLine1.getParsedOptionValues(optionGroup13);
        org.apache.commons.cli.Option option15 = null;
        java.lang.String str16 = commandLine1.getOptionValue(option15);
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        boolean boolean18 = commandLine1.hasOption(optionGroup17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(commandLineSupplierArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test19");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.Option option8 = null;
        java.lang.String[] strArray9 = commandLine1.getOptionValues(option8);
        org.apache.commons.cli.Option option10 = null;
        int int11 = commandLine1.getOptionCount(option10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test20");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine8 = builder7.get();
        org.apache.commons.cli.Option option9 = null;
        java.util.function.Supplier<java.lang.String> strSupplier10 = null;
        java.lang.String str11 = commandLine8.getOptionValue(option9, strSupplier10);
        java.lang.String[] strArray12 = commandLine8.getArgs();
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(optionGroup6, (java.lang.constant.Constable[]) strArray12);
        org.apache.commons.cli.Option option14 = null;
        boolean boolean15 = commandLine1.hasOption(option14);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertArrayEquals(constableArray13, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test21");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option[] optionArray21 = commandLine1.getOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test22");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[][] strArray12 = commandLine1.getParsedOptionValues(option11);
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray14 = commandLine1.getParsedOptionValues(optionGroup13);
        java.util.Properties properties16 = commandLine1.getOptionProperties("");
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        java.lang.String[] strArray18 = commandLine1.getOptionValues(optionGroup17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(commandLineSupplierArray14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test23");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, strSupplier9);
        org.apache.commons.cli.Option option11 = null;
        int int12 = commandLine1.getOptionCount(option11);
        java.lang.Object obj14 = commandLine1.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test24");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(option6);
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue(optionGroup8);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test25");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[][] strArray12 = commandLine1.getParsedOptionValues(option11);
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray14 = commandLine1.getParsedOptionValues(optionGroup13);
        java.util.Properties properties16 = commandLine1.getOptionProperties("");
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        java.io.Serializable serializable18 = commandLine1.getParsedOptionValue(optionGroup17);
        java.lang.String[] strArray20 = commandLine1.getParsedOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(commandLineSupplierArray14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test26");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine.Builder builder3 = builder0.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine4 = builder3.build();
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray6 = commandLine4.getParsedOptionValues(option5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(commandLine4);
        org.junit.Assert.assertNull(constableArray6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test27");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray22 = commandLine1.getParsedOptionValues("hi!");
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        java.lang.String str25 = commandLine1.getOptionValue(optionGroup23, strSupplier24);
        int int27 = commandLine1.getOptionCount("");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray29 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray30 = commandLine1.getParsedOptionValues('a', genericDeclarationArray29);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(genericDeclarationArray22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(genericDeclarationArray29);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray29, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray30);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray30, new java.lang.reflect.GenericDeclaration[] {});
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test28");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, strSupplier9);
        org.apache.commons.cli.Option option11 = null;
        int int12 = commandLine1.getOptionCount(option11);
        java.util.Properties[][] propertiesArray14 = commandLine1.getParsedOptionValues('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(propertiesArray14);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test29");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test30");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = builder7.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.CommandLine commandLine10 = commandLine1.getParsedOptionValue('4', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder7);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[] strArray12 = commandLine1.getOptionValues(option11);
        java.util.Properties properties14 = commandLine1.getOptionProperties("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test31");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, "hi!");
        org.apache.commons.cli.Option option11 = null;
        int int12 = commandLine1.getOptionCount(option11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test32");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        java.lang.String str14 = commandLine11.getOptionValue('a', strSupplier13);
        java.util.Collection<java.lang.String>[] strCollectionArray16 = commandLine11.getParsedOptionValues('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strCollectionArray16);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test33");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap3 = commandLine1.getParsedOptionValue(option2);
        org.apache.commons.cli.OptionGroup optionGroup4 = null;
        java.util.Hashtable[] hashtableArray6 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray7 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray8 = commandLine1.getParsedOptionValues(optionGroup4, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6);
        java.lang.String[] strArray10 = commandLine1.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNotNull(hashtableArray6);
        org.junit.Assert.assertArrayEquals(hashtableArray6, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray7);
        org.junit.Assert.assertArrayEquals(objMapArray7, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray8);
        org.junit.Assert.assertArrayEquals(objMapArray8, new java.util.Hashtable[] {});
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test34");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.Object[] objArray6 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.OptionGroup optionGroup7 = null;
        java.lang.String[] strArray8 = commandLine1.getOptionValues(optionGroup7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test35");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        java.lang.Object obj7 = commandLine1.getOptionObject("");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][] objMapArray9 = commandLine1.getParsedOptionValues(optionGroup8);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objMapArray9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test36");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine1.getOptionValue(option21, strSupplier22);
        int int25 = commandLine1.getOptionCount("");
        org.apache.commons.cli.Option option26 = null;
        java.lang.String str27 = commandLine1.getOptionValue(option26);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test37");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = commandLine1.getParsedOptionValue(optionGroup8);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor10 = commandLine1.iterator();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNotNull(optionItor10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test38");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option[] optionArray14 = commandLine1.getOptions();
        java.util.List<java.lang.String> strList15 = commandLine1.getArgList();
        org.apache.commons.cli.Option option16 = null;
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray17 = commandLine1.getParsedOptionValue(option16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNull(typeDescriptorArray17);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test39");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        java.lang.String[] strArray11 = commandLine1.getArgs();
        org.apache.commons.cli.Option option12 = null;
        org.apache.commons.cli.CommandLine.Builder builder13 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.CommandLine.Builder builder15 = builder13.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.CommandLine commandLine16 = commandLine1.getParsedOptionValue(option12, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder15);
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        java.lang.String str18 = commandLine16.getOptionValue(optionGroup17);
        org.apache.commons.cli.Option option19 = null;
        int int20 = commandLine16.getOptionCount(option19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test40");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.CommandLine.Builder builder11 = builder9.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.CommandLine commandLine12 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        java.lang.String[] strArray14 = commandLine1.getOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test41");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        java.lang.String[] strArray11 = commandLine1.getArgs();
        boolean boolean13 = commandLine1.hasOption('#');
        java.lang.String str16 = commandLine1.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test42");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, "hi!");
        org.apache.commons.cli.Option option11 = null;
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        java.lang.String str13 = commandLine1.getOptionValue(option11, strSupplier12);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test43");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        boolean boolean7 = commandLine1.hasOption('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test44");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[][] strArray12 = commandLine1.getParsedOptionValues(option11);
        org.apache.commons.cli.CommandLine[] commandLineArray14 = commandLine1.getParsedOptionValues("hi!");
        java.lang.String str17 = commandLine1.getOptionValue("", "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(commandLineArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test45");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = commandLine2.getParsedOptionValues(option6);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField9 = commandLine2.getParsedOptionValue("");
        java.lang.String str11 = commandLine2.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
        org.junit.Assert.assertNull(wildcardClassOfField9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test46");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[][] strArray12 = commandLine1.getParsedOptionValues(option11);
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.lang.String[] strArray14 = commandLine1.getOptionValues(optionGroup13);
        java.lang.String[] strArray16 = commandLine1.getOptionValues('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test47");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue("");
        int int11 = commandLine1.getOptionCount("");
        java.lang.String str13 = commandLine1.getOptionValue("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test48");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray12 = commandLine1.getParsedOptionValue("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(genericDeclarationArray12);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test49");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.Option option8 = null;
        java.lang.String[] strArray9 = commandLine1.getOptionValues(option8);
        org.apache.commons.cli.CommandLine.Builder builder11 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine12 = builder11.get();
        java.lang.constant.ConstantDesc constantDesc14 = null;
        java.lang.constant.ConstantDesc constantDesc15 = commandLine12.getParsedOptionValue('a', constantDesc14);
        java.lang.Object[] objArray17 = commandLine12.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer20 = null;
        org.apache.commons.cli.CommandLine.Builder builder21 = builder19.setDeprecatedHandler(optionConsumer20);
        org.apache.commons.cli.CommandLine commandLine22 = commandLine12.getParsedOptionValue(option18, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder19);
        org.apache.commons.cli.Option option23 = null;
        org.apache.commons.cli.CommandLine.Builder builder24 = builder19.addOption(option23);
        org.apache.commons.cli.CommandLine commandLine25 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder19);
        org.apache.commons.cli.OptionGroup optionGroup26 = null;
        java.util.function.Supplier[][] supplierArray28 = new java.util.function.Supplier[0][];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray29 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][]) supplierArray28;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray30 = commandLine1.getParsedOptionValues(optionGroup26, commandLineSupplierArray29);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(supplierArray28);
        org.junit.Assert.assertArrayEquals(supplierArray28, new java.util.function.Supplier[][] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray29);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray29, new java.util.function.Supplier[][] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray30);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray30, new java.util.function.Supplier[][] {});
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test50");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = builder7.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.CommandLine commandLine10 = commandLine1.getParsedOptionValue('4', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder7);
        org.apache.commons.cli.Option option11 = null;
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        java.lang.String str13 = commandLine1.getOptionValue(option11, strSupplier12);
        boolean boolean15 = commandLine1.hasOption("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test51");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine8 = builder7.get();
        org.apache.commons.cli.Option option9 = null;
        java.util.function.Supplier<java.lang.String> strSupplier10 = null;
        java.lang.String str11 = commandLine8.getOptionValue(option9, strSupplier10);
        java.lang.String[] strArray12 = commandLine8.getArgs();
        org.apache.commons.cli.Option option13 = null;
        java.lang.String[] strArray14 = commandLine8.getOptionValues(option13);
        java.util.Properties[] propertiesArray16 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray17 = commandLine8.getParsedOptionValues(' ', propertiesArray16);
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray18 = commandLine1.getParsedOptionValue(optionGroup6, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) propertiesArray17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(propertiesArray16);
        org.junit.Assert.assertArrayEquals(propertiesArray16, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray17);
        org.junit.Assert.assertArrayEquals(propertiesArray17, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray18);
        org.junit.Assert.assertArrayEquals(objMapArray18, new java.util.Properties[] {});
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test52");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = commandLine2.getParsedOptionValues(option6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = annotatedElementArray7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test53");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.Option option8 = null;
        java.lang.String[] strArray9 = commandLine1.getOptionValues(option8);
        org.apache.commons.cli.CommandLine.Builder builder11 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine12 = builder11.get();
        java.lang.constant.ConstantDesc constantDesc14 = null;
        java.lang.constant.ConstantDesc constantDesc15 = commandLine12.getParsedOptionValue('a', constantDesc14);
        java.lang.Object[] objArray17 = commandLine12.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer20 = null;
        org.apache.commons.cli.CommandLine.Builder builder21 = builder19.setDeprecatedHandler(optionConsumer20);
        org.apache.commons.cli.CommandLine commandLine22 = commandLine12.getParsedOptionValue(option18, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder19);
        org.apache.commons.cli.Option option23 = null;
        org.apache.commons.cli.CommandLine.Builder builder24 = builder19.addOption(option23);
        org.apache.commons.cli.CommandLine commandLine25 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder19);
        java.lang.Object obj27 = commandLine25.getOptionObject('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(constantDesc15);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test54");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.CommandLine.Builder builder11 = builder9.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.CommandLine commandLine12 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        org.apache.commons.cli.Option[] optionArray13 = commandLine1.getOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test55");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.CommandLine.Builder builder11 = builder9.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.CommandLine commandLine12 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        org.apache.commons.cli.CommandLine.Builder builder14 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine15 = builder14.get();
        org.apache.commons.cli.Option option16 = null;
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        java.lang.String str18 = commandLine15.getOptionValue(option16, strSupplier17);
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        java.lang.String str21 = commandLine15.getOptionValue(optionGroup19, "");
        org.apache.commons.cli.OptionGroup optionGroup22 = null;
        java.util.function.Supplier<java.lang.String> strSupplier23 = null;
        java.lang.String str24 = commandLine15.getOptionValue(optionGroup22, strSupplier23);
        org.apache.commons.cli.Option option25 = null;
        int int26 = commandLine15.getOptionCount(option25);
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        org.apache.commons.cli.Option option30 = null;
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        java.lang.String str32 = commandLine29.getOptionValue(option30, strSupplier31);
        org.apache.commons.cli.Option option33 = null;
        org.apache.commons.cli.CommandLine.Builder builder34 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer35 = null;
        org.apache.commons.cli.CommandLine.Builder builder36 = builder34.setDeprecatedHandler(optionConsumer35);
        java.lang.Class<?> wildcardClass37 = builder36.getClass();
        java.lang.Class<?> wildcardClass38 = commandLine29.getParsedOptionValue(option33, wildcardClass37);
        org.apache.commons.cli.CommandLine.Builder builder39 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer40 = null;
        org.apache.commons.cli.CommandLine.Builder builder41 = builder39.setDeprecatedHandler(optionConsumer40);
        java.lang.Class<?> wildcardClass42 = builder41.getClass();
        org.apache.commons.cli.CommandLine.Builder builder43 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine44 = builder43.get();
        org.apache.commons.cli.Option option45 = null;
        java.util.function.Supplier<java.lang.String> strSupplier46 = null;
        java.lang.String str47 = commandLine44.getOptionValue(option45, strSupplier46);
        org.apache.commons.cli.Option option48 = null;
        org.apache.commons.cli.CommandLine.Builder builder49 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer50 = null;
        org.apache.commons.cli.CommandLine.Builder builder51 = builder49.setDeprecatedHandler(optionConsumer50);
        java.lang.Class<?> wildcardClass52 = builder51.getClass();
        java.lang.Class<?> wildcardClass53 = commandLine44.getParsedOptionValue(option48, wildcardClass52);
        org.apache.commons.cli.CommandLine.Builder builder54 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine55 = builder54.get();
        org.apache.commons.cli.Option option56 = null;
        java.util.function.Supplier<java.lang.String> strSupplier57 = null;
        java.lang.String str58 = commandLine55.getOptionValue(option56, strSupplier57);
        org.apache.commons.cli.Option option59 = null;
        java.lang.constant.Constable[] constableArray66 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray67 = commandLine55.getParsedOptionValues(option59, constableArray66);
        org.apache.commons.cli.OptionGroup optionGroup68 = null;
        java.lang.String str69 = commandLine55.getOptionValue(optionGroup68);
        org.apache.commons.cli.Option option70 = null;
        org.apache.commons.cli.CommandLine.Builder builder71 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer72 = null;
        org.apache.commons.cli.CommandLine.Builder builder73 = builder71.setDeprecatedHandler(optionConsumer72);
        java.lang.Class<?> wildcardClass74 = builder73.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration75 = commandLine55.getParsedOptionValue(option70, (java.lang.reflect.GenericDeclaration) wildcardClass74);
        org.apache.commons.cli.CommandLine.Builder builder76 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine77 = builder76.get();
        org.apache.commons.cli.Option option78 = null;
        java.util.function.Supplier<java.lang.String> strSupplier79 = null;
        java.lang.String str80 = commandLine77.getOptionValue(option78, strSupplier79);
        org.apache.commons.cli.Option option81 = null;
        org.apache.commons.cli.CommandLine.Builder builder82 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer83 = null;
        org.apache.commons.cli.CommandLine.Builder builder84 = builder82.setDeprecatedHandler(optionConsumer83);
        java.lang.Class<?> wildcardClass85 = builder84.getClass();
        java.lang.Class<?> wildcardClass86 = commandLine77.getParsedOptionValue(option81, wildcardClass85);
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray87 = new java.lang.invoke.TypeDescriptor[] { wildcardClass38, wildcardClass42, wildcardClass53, wildcardClass74, wildcardClass86 };
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray88 = commandLine15.getParsedOptionValues("hi!", typeDescriptorArray87);
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray89 = commandLine12.getParsedOptionValues(optionGroup13, typeDescriptorArray87);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(constableArray66);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(genericDeclaration75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(typeDescriptorArray87);
        org.junit.Assert.assertNotNull(typeDescriptorArray88);
        org.junit.Assert.assertNotNull(typeDescriptorArray89);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test56");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = commandLine2.getParsedOptionValues(option6);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField9 = commandLine2.getParsedOptionValue("");
        boolean boolean11 = commandLine2.hasOption('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
        org.junit.Assert.assertNull(wildcardClassOfField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test57");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String str15 = commandLine1.getOptionValue(optionGroup14);
        java.lang.CharSequence charSequence18 = commandLine1.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj20 = commandLine1.getOptionObject("hi!");
        java.lang.String[] strArray21 = commandLine1.getArgs();
        java.lang.Object obj23 = commandLine1.getOptionObject('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test58");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, strSupplier9);
        org.apache.commons.cli.Option option11 = null;
        int int12 = commandLine1.getOptionCount(option11);
        org.apache.commons.cli.CommandLine.Builder builder14 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine15 = builder14.get();
        org.apache.commons.cli.Option option16 = null;
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        java.lang.String str18 = commandLine15.getOptionValue(option16, strSupplier17);
        org.apache.commons.cli.Option option19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer21 = null;
        org.apache.commons.cli.CommandLine.Builder builder22 = builder20.setDeprecatedHandler(optionConsumer21);
        java.lang.Class<?> wildcardClass23 = builder22.getClass();
        java.lang.Class<?> wildcardClass24 = commandLine15.getParsedOptionValue(option19, wildcardClass23);
        org.apache.commons.cli.CommandLine.Builder builder25 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer26 = null;
        org.apache.commons.cli.CommandLine.Builder builder27 = builder25.setDeprecatedHandler(optionConsumer26);
        java.lang.Class<?> wildcardClass28 = builder27.getClass();
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.Option option31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine30.getOptionValue(option31, strSupplier32);
        org.apache.commons.cli.Option option34 = null;
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer36 = null;
        org.apache.commons.cli.CommandLine.Builder builder37 = builder35.setDeprecatedHandler(optionConsumer36);
        java.lang.Class<?> wildcardClass38 = builder37.getClass();
        java.lang.Class<?> wildcardClass39 = commandLine30.getParsedOptionValue(option34, wildcardClass38);
        org.apache.commons.cli.CommandLine.Builder builder40 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine41 = builder40.get();
        org.apache.commons.cli.Option option42 = null;
        java.util.function.Supplier<java.lang.String> strSupplier43 = null;
        java.lang.String str44 = commandLine41.getOptionValue(option42, strSupplier43);
        org.apache.commons.cli.Option option45 = null;
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray53 = commandLine41.getParsedOptionValues(option45, constableArray52);
        org.apache.commons.cli.OptionGroup optionGroup54 = null;
        java.lang.String str55 = commandLine41.getOptionValue(optionGroup54);
        org.apache.commons.cli.Option option56 = null;
        org.apache.commons.cli.CommandLine.Builder builder57 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer58 = null;
        org.apache.commons.cli.CommandLine.Builder builder59 = builder57.setDeprecatedHandler(optionConsumer58);
        java.lang.Class<?> wildcardClass60 = builder59.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration61 = commandLine41.getParsedOptionValue(option56, (java.lang.reflect.GenericDeclaration) wildcardClass60);
        org.apache.commons.cli.CommandLine.Builder builder62 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine63 = builder62.get();
        org.apache.commons.cli.Option option64 = null;
        java.util.function.Supplier<java.lang.String> strSupplier65 = null;
        java.lang.String str66 = commandLine63.getOptionValue(option64, strSupplier65);
        org.apache.commons.cli.Option option67 = null;
        org.apache.commons.cli.CommandLine.Builder builder68 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer69 = null;
        org.apache.commons.cli.CommandLine.Builder builder70 = builder68.setDeprecatedHandler(optionConsumer69);
        java.lang.Class<?> wildcardClass71 = builder70.getClass();
        java.lang.Class<?> wildcardClass72 = commandLine63.getParsedOptionValue(option67, wildcardClass71);
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray73 = new java.lang.invoke.TypeDescriptor[] { wildcardClass24, wildcardClass28, wildcardClass39, wildcardClass60, wildcardClass72 };
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray74 = commandLine1.getParsedOptionValues("hi!", typeDescriptorArray73);
        org.apache.commons.cli.CommandLine.Builder builder76 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine77 = builder76.get();
        org.apache.commons.cli.Option option78 = null;
        java.util.function.Supplier<java.lang.String> strSupplier79 = null;
        java.lang.String str80 = commandLine77.getOptionValue(option78, strSupplier79);
        org.apache.commons.cli.Option option81 = null;
        org.apache.commons.cli.CommandLine.Builder builder82 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer83 = null;
        org.apache.commons.cli.CommandLine.Builder builder84 = builder82.setDeprecatedHandler(optionConsumer83);
        java.lang.Class<?> wildcardClass85 = builder84.getClass();
        java.lang.Class<?> wildcardClass86 = commandLine77.getParsedOptionValue(option81, wildcardClass85);
        org.apache.commons.cli.Option option87 = null;
        java.util.Properties properties88 = commandLine77.getOptionProperties(option87);
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap89 = commandLine1.getParsedOptionValue("", (java.util.Hashtable<java.lang.Object, java.lang.Object>) properties88);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(genericDeclaration61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeDescriptorArray73);
        org.junit.Assert.assertNotNull(typeDescriptorArray74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(properties88);
        org.junit.Assert.assertNotNull(objMap89);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test59");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = builder7.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.CommandLine commandLine10 = commandLine1.getParsedOptionValue('4', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder7);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[] strArray12 = commandLine1.getOptionValues(option11);
        org.apache.commons.cli.Option option13 = null;
        java.lang.String str15 = commandLine1.getOptionValue(option13, "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test60");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String str15 = commandLine1.getOptionValue(optionGroup14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = builder17.setDeprecatedHandler(optionConsumer18);
        org.apache.commons.cli.CommandLine.Builder builder20 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine21 = builder20.get();
        org.apache.commons.cli.Option option22 = null;
        java.util.function.Supplier<java.lang.String> strSupplier23 = null;
        java.lang.String str24 = commandLine21.getOptionValue(option22, strSupplier23);
        org.apache.commons.cli.Option option25 = null;
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray33 = commandLine21.getParsedOptionValues(option25, constableArray32);
        java.lang.String[] strArray35 = commandLine21.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder37 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine38 = builder37.get();
        org.apache.commons.cli.CommandLine.Builder builder40 = builder37.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine41 = commandLine21.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder40);
        org.apache.commons.cli.CommandLine.Builder builder42 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine43 = builder42.get();
        org.apache.commons.cli.CommandLine.Builder builder45 = builder42.addArg("hi!");
        java.util.function.Supplier[] supplierArray47 = new java.util.function.Supplier[3];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray48 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray47;
        commandLineSupplierArray48[0] = builder17;
        commandLineSupplierArray48[1] = builder40;
        commandLineSupplierArray48[2] = builder45;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray55 = commandLine1.getParsedOptionValues(optionGroup16, commandLineSupplierArray48);
        java.lang.String[] strArray56 = commandLine1.getArgs();
        boolean boolean58 = commandLine1.hasOption(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(supplierArray47);
        org.junit.Assert.assertNotNull(commandLineSupplierArray48);
        org.junit.Assert.assertNotNull(commandLineSupplierArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test61");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.CommandLine.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.CommandLine commandLine3 = builder0.build();
        org.apache.commons.cli.Option option4 = null;
        boolean boolean5 = commandLine3.hasOption(option4);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test62");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        org.apache.commons.cli.Option option5 = null;
        java.util.function.Supplier<java.lang.String> strSupplier6 = null;
        java.lang.String str7 = commandLine2.getOptionValue(option5, strSupplier6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test63");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.Option option3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine5 = builder4.build();
        java.lang.Class<?> wildcardClass6 = commandLine5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(commandLine5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test64");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray22 = commandLine1.getParsedOptionValues("hi!");
        boolean boolean24 = commandLine1.hasOption('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(genericDeclarationArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test65");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = commandLine2.getParsedOptionValues(option6);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField9 = commandLine2.getParsedOptionValue("");
        java.lang.String[] strArray10 = commandLine2.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder12 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine13 = builder12.get();
        org.apache.commons.cli.Option option14 = null;
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        java.lang.String str16 = commandLine13.getOptionValue(option14, strSupplier15);
        org.apache.commons.cli.Option option17 = null;
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray25 = commandLine13.getParsedOptionValues(option17, constableArray24);
        java.lang.String[] strArray27 = commandLine13.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.CommandLine.Builder builder32 = builder29.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine33 = commandLine13.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder32);
        org.apache.commons.cli.CommandLine.Builder builder35 = builder32.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine36 = commandLine2.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder35);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
        org.junit.Assert.assertNull(wildcardClassOfField9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(commandLine36);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test66");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, strSupplier9);
        org.apache.commons.cli.Option option11 = null;
        int int12 = commandLine1.getOptionCount(option11);
        java.util.function.Supplier<java.lang.String> strSupplier14 = null;
        java.lang.String str15 = commandLine1.getOptionValue("hi!", strSupplier14);
        int int17 = commandLine1.getOptionCount('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test67");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, "hi!");
        boolean boolean12 = commandLine1.hasOption('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine1.getOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test68");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine8 = builder7.get();
        org.apache.commons.cli.Option option9 = null;
        java.util.function.Supplier<java.lang.String> strSupplier10 = null;
        java.lang.String str11 = commandLine8.getOptionValue(option9, strSupplier10);
        org.apache.commons.cli.Option option12 = null;
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray20 = commandLine8.getParsedOptionValues(option12, constableArray19);
        org.apache.commons.cli.OptionGroup optionGroup21 = null;
        java.lang.String str22 = commandLine8.getOptionValue(optionGroup21);
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        org.apache.commons.cli.CommandLine.Builder builder24 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = builder24.setDeprecatedHandler(optionConsumer25);
        org.apache.commons.cli.CommandLine.Builder builder27 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine28 = builder27.get();
        org.apache.commons.cli.Option option29 = null;
        java.util.function.Supplier<java.lang.String> strSupplier30 = null;
        java.lang.String str31 = commandLine28.getOptionValue(option29, strSupplier30);
        org.apache.commons.cli.Option option32 = null;
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray40 = commandLine28.getParsedOptionValues(option32, constableArray39);
        java.lang.String[] strArray42 = commandLine28.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder44 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine45 = builder44.get();
        org.apache.commons.cli.CommandLine.Builder builder47 = builder44.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine48 = commandLine28.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder47);
        org.apache.commons.cli.CommandLine.Builder builder49 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine50 = builder49.get();
        org.apache.commons.cli.CommandLine.Builder builder52 = builder49.addArg("hi!");
        java.util.function.Supplier[] supplierArray54 = new java.util.function.Supplier[3];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray55 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray54;
        commandLineSupplierArray55[0] = builder24;
        commandLineSupplierArray55[1] = builder47;
        commandLineSupplierArray55[2] = builder52;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray62 = commandLine8.getParsedOptionValues(optionGroup23, commandLineSupplierArray55);
        java.lang.String[] strArray63 = commandLine8.getArgs();
        java.lang.constant.ConstantDesc[] constantDescArray64 = commandLine1.getParsedOptionValues("", (java.lang.constant.ConstantDesc[]) strArray63);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(supplierArray54);
        org.junit.Assert.assertNotNull(commandLineSupplierArray55);
        org.junit.Assert.assertNotNull(commandLineSupplierArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertArrayEquals(constantDescArray64, new java.lang.String[] {});
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test69");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine.Builder builder3 = builder0.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine4 = builder0.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(commandLine4);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test70");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String str3 = commandLine1.getOptionValue("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test71");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.Object[] objArray6 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.CommandLine.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option7, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder8);
        org.apache.commons.cli.Option option12 = null;
        org.apache.commons.cli.CommandLine.Builder builder13 = builder8.addOption(option12);
        org.apache.commons.cli.CommandLine commandLine14 = builder8.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test72");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap3 = commandLine1.getParsedOptionValue(option2);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField5 = commandLine1.getParsedOptionValue("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNull(wildcardClassOfField5);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test73");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        java.lang.String[] strArray12 = commandLine1.getOptionValues(' ');
        java.lang.String str15 = commandLine1.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test74");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue("");
        int int11 = commandLine1.getOptionCount("");
        org.apache.commons.cli.Option option12 = null;
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        java.lang.String str14 = commandLine1.getOptionValue(option12, strSupplier13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test75");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(optionGroup6);
        int int9 = commandLine1.getOptionCount("hi!");
        org.apache.commons.cli.OptionGroup optionGroup10 = null;
        boolean boolean11 = commandLine1.hasOption(optionGroup10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test76");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String str15 = commandLine1.getOptionValue(optionGroup14);
        java.lang.CharSequence charSequence18 = commandLine1.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj20 = commandLine1.getOptionObject("hi!");
        java.lang.String[] strArray21 = commandLine1.getArgs();
        org.apache.commons.cli.Option option22 = null;
        java.lang.String str23 = commandLine1.getOptionValue(option22);
        java.lang.constant.Constable[] constableArray25 = commandLine1.getParsedOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(constableArray25);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test77");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        java.lang.String[] strArray15 = commandLine1.getOptionValues("");
        java.lang.String[] strArray17 = commandLine1.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test78");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = builder7.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.CommandLine commandLine10 = commandLine1.getParsedOptionValue('4', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder7);
        int int12 = commandLine10.getOptionCount('#');
        org.apache.commons.cli.Option option13 = null;
        org.apache.commons.cli.CommandLine.Builder builder14 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer15 = null;
        org.apache.commons.cli.CommandLine.Builder builder16 = builder14.setDeprecatedHandler(optionConsumer15);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = builder18.setDeprecatedHandler(optionConsumer19);
        java.lang.Class<?> wildcardClass21 = builder20.getClass();
        org.apache.commons.cli.CommandLine.Builder builder22 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer23 = null;
        org.apache.commons.cli.CommandLine.Builder builder24 = builder22.setDeprecatedHandler(optionConsumer23);
        java.lang.Class<?> wildcardClass25 = builder24.getClass();
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine27 = builder26.get();
        org.apache.commons.cli.Option option28 = null;
        java.util.function.Supplier<java.lang.String> strSupplier29 = null;
        java.lang.String str30 = commandLine27.getOptionValue(option28, strSupplier29);
        org.apache.commons.cli.Option option31 = null;
        org.apache.commons.cli.CommandLine.Builder builder32 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer33 = null;
        org.apache.commons.cli.CommandLine.Builder builder34 = builder32.setDeprecatedHandler(optionConsumer33);
        java.lang.Class<?> wildcardClass35 = builder34.getClass();
        java.lang.Class<?> wildcardClass36 = commandLine27.getParsedOptionValue(option31, wildcardClass35);
        org.apache.commons.cli.CommandLine.Builder builder37 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine38 = builder37.get();
        org.apache.commons.cli.Option option39 = null;
        java.util.function.Supplier<java.lang.String> strSupplier40 = null;
        java.lang.String str41 = commandLine38.getOptionValue(option39, strSupplier40);
        org.apache.commons.cli.Option option42 = null;
        org.apache.commons.cli.CommandLine.Builder builder43 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = builder43.setDeprecatedHandler(optionConsumer44);
        java.lang.Class<?> wildcardClass46 = builder45.getClass();
        java.lang.Class<?> wildcardClass47 = commandLine38.getParsedOptionValue(option42, wildcardClass46);
        java.lang.invoke.TypeDescriptor.OfField[] ofFieldArray49 = new java.lang.invoke.TypeDescriptor.OfField[5];
        @SuppressWarnings("unchecked")
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[] wildcardClassOfFieldArray50 = (java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[]) ofFieldArray49;
        wildcardClassOfFieldArray50[0] = wildcardClass17;
        wildcardClassOfFieldArray50[1] = wildcardClass21;
        wildcardClassOfFieldArray50[2] = wildcardClass25;
        wildcardClassOfFieldArray50[3] = wildcardClass35;
        wildcardClassOfFieldArray50[4] = wildcardClass46;
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[] wildcardClassOfFieldArray61 = commandLine10.getParsedOptionValues(option13, wildcardClassOfFieldArray50);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(ofFieldArray49);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldArray50);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldArray61);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test79");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(option6);
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.lang.Class<?>[] wildcardClassArray9 = commandLine1.getParsedOptionValues(optionGroup8);
        int int11 = commandLine1.getOptionCount("hi!");
        org.apache.commons.cli.Option option12 = null;
        org.apache.commons.cli.CommandLine.Builder builder13 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine14 = builder13.get();
        org.apache.commons.cli.Option option15 = null;
        java.util.function.Supplier<java.lang.String> strSupplier16 = null;
        java.lang.String str17 = commandLine14.getOptionValue(option15, strSupplier16);
        org.apache.commons.cli.Option option18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer20 = null;
        org.apache.commons.cli.CommandLine.Builder builder21 = builder19.setDeprecatedHandler(optionConsumer20);
        java.lang.Class<?> wildcardClass22 = builder21.getClass();
        java.lang.Class<?> wildcardClass23 = commandLine14.getParsedOptionValue(option18, wildcardClass22);
        org.apache.commons.cli.CommandLine.Builder builder24 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = builder24.setDeprecatedHandler(optionConsumer25);
        java.lang.Class<?> wildcardClass27 = builder26.getClass();
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        org.apache.commons.cli.Option option30 = null;
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        java.lang.String str32 = commandLine29.getOptionValue(option30, strSupplier31);
        org.apache.commons.cli.Option option33 = null;
        org.apache.commons.cli.CommandLine.Builder builder34 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer35 = null;
        org.apache.commons.cli.CommandLine.Builder builder36 = builder34.setDeprecatedHandler(optionConsumer35);
        java.lang.Class<?> wildcardClass37 = builder36.getClass();
        java.lang.Class<?> wildcardClass38 = commandLine29.getParsedOptionValue(option33, wildcardClass37);
        org.apache.commons.cli.CommandLine.Builder builder39 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine40 = builder39.get();
        org.apache.commons.cli.Option option41 = null;
        java.util.function.Supplier<java.lang.String> strSupplier42 = null;
        java.lang.String str43 = commandLine40.getOptionValue(option41, strSupplier42);
        org.apache.commons.cli.Option option44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer46 = null;
        org.apache.commons.cli.CommandLine.Builder builder47 = builder45.setDeprecatedHandler(optionConsumer46);
        java.lang.Class<?> wildcardClass48 = builder47.getClass();
        java.lang.Class<?> wildcardClass49 = commandLine40.getParsedOptionValue(option44, wildcardClass48);
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass23, wildcardClass27, wildcardClass38, wildcardClass48 };
        java.lang.reflect.Type[] typeArray51 = commandLine1.getParsedOptionValues(option12, typeArray50);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test80");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine1.getOptionValue(option21, strSupplier22);
        java.lang.String str26 = commandLine1.getOptionValue("hi!", "");
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        org.apache.commons.cli.Option option30 = null;
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        java.lang.String str32 = commandLine29.getOptionValue(option30, strSupplier31);
        org.apache.commons.cli.Option option33 = null;
        java.lang.constant.Constable[] constableArray40 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray41 = commandLine29.getParsedOptionValues(option33, constableArray40);
        java.lang.String[] strArray43 = commandLine29.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder45 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine46 = builder45.get();
        org.apache.commons.cli.CommandLine.Builder builder48 = builder45.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine49 = commandLine29.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        org.apache.commons.cli.CommandLine.Builder builder51 = builder48.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine52 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(commandLine52);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test81");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.util.Properties properties7 = commandLine2.getOptionProperties("");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine2.getOptionValue(optionGroup8, strSupplier9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test82");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine1.getOptionValue(option21, strSupplier22);
        boolean boolean25 = commandLine1.hasOption(' ');
        java.lang.Object obj27 = commandLine1.getOptionObject("hi!");
        java.lang.reflect.GenericDeclaration genericDeclaration29 = commandLine1.getParsedOptionValue('#');
        org.apache.commons.cli.OptionGroup optionGroup30 = null;
        java.lang.constant.Constable[][] constableArray31 = commandLine1.getParsedOptionValues(optionGroup30);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(constableArray31);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test83");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.Object[] objArray6 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.CommandLine.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option7, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder8);
        org.apache.commons.cli.Option option12 = null;
        org.apache.commons.cli.CommandLine.Builder builder13 = builder8.addOption(option12);
        org.apache.commons.cli.CommandLine commandLine14 = builder13.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test84");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray22 = commandLine1.getParsedOptionValues("hi!");
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        java.lang.String str25 = commandLine1.getOptionValue(optionGroup23, strSupplier24);
        int int27 = commandLine1.getOptionCount("");
        org.apache.commons.cli.Option option28 = null;
        java.lang.String str30 = commandLine1.getOptionValue(option28, "");
        java.lang.String[] strArray31 = commandLine1.getArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(genericDeclarationArray22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test85");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(optionGroup6);
        java.lang.String str9 = commandLine1.getOptionValue('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test86");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine1.getOptionValue(option21, strSupplier22);
        java.lang.String[] strArray25 = commandLine1.getOptionValues("");
        int int27 = commandLine1.getOptionCount("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test87");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.CommandLine.Builder builder11 = builder9.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.CommandLine commandLine12 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        org.apache.commons.cli.Option option13 = null;
        java.util.Properties properties14 = commandLine12.getOptionProperties(option13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test88");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine1.getOptionValue(option21, strSupplier22);
        boolean boolean25 = commandLine1.hasOption(' ');
        java.lang.Object obj27 = commandLine1.getOptionObject("hi!");
        java.lang.reflect.GenericDeclaration genericDeclaration29 = commandLine1.getParsedOptionValue('#');
        java.util.List<java.lang.String> strList30 = commandLine1.getArgList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test89");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, strSupplier9);
        org.apache.commons.cli.Option option11 = null;
        int int12 = commandLine1.getOptionCount(option11);
        org.apache.commons.cli.CommandLine.Builder builder14 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine15 = builder14.get();
        org.apache.commons.cli.Option option16 = null;
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        java.lang.String str18 = commandLine15.getOptionValue(option16, strSupplier17);
        org.apache.commons.cli.Option option19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer21 = null;
        org.apache.commons.cli.CommandLine.Builder builder22 = builder20.setDeprecatedHandler(optionConsumer21);
        java.lang.Class<?> wildcardClass23 = builder22.getClass();
        java.lang.Class<?> wildcardClass24 = commandLine15.getParsedOptionValue(option19, wildcardClass23);
        org.apache.commons.cli.CommandLine.Builder builder25 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer26 = null;
        org.apache.commons.cli.CommandLine.Builder builder27 = builder25.setDeprecatedHandler(optionConsumer26);
        java.lang.Class<?> wildcardClass28 = builder27.getClass();
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.Option option31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine30.getOptionValue(option31, strSupplier32);
        org.apache.commons.cli.Option option34 = null;
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer36 = null;
        org.apache.commons.cli.CommandLine.Builder builder37 = builder35.setDeprecatedHandler(optionConsumer36);
        java.lang.Class<?> wildcardClass38 = builder37.getClass();
        java.lang.Class<?> wildcardClass39 = commandLine30.getParsedOptionValue(option34, wildcardClass38);
        org.apache.commons.cli.CommandLine.Builder builder40 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine41 = builder40.get();
        org.apache.commons.cli.Option option42 = null;
        java.util.function.Supplier<java.lang.String> strSupplier43 = null;
        java.lang.String str44 = commandLine41.getOptionValue(option42, strSupplier43);
        org.apache.commons.cli.Option option45 = null;
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray53 = commandLine41.getParsedOptionValues(option45, constableArray52);
        org.apache.commons.cli.OptionGroup optionGroup54 = null;
        java.lang.String str55 = commandLine41.getOptionValue(optionGroup54);
        org.apache.commons.cli.Option option56 = null;
        org.apache.commons.cli.CommandLine.Builder builder57 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer58 = null;
        org.apache.commons.cli.CommandLine.Builder builder59 = builder57.setDeprecatedHandler(optionConsumer58);
        java.lang.Class<?> wildcardClass60 = builder59.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration61 = commandLine41.getParsedOptionValue(option56, (java.lang.reflect.GenericDeclaration) wildcardClass60);
        org.apache.commons.cli.CommandLine.Builder builder62 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine63 = builder62.get();
        org.apache.commons.cli.Option option64 = null;
        java.util.function.Supplier<java.lang.String> strSupplier65 = null;
        java.lang.String str66 = commandLine63.getOptionValue(option64, strSupplier65);
        org.apache.commons.cli.Option option67 = null;
        org.apache.commons.cli.CommandLine.Builder builder68 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer69 = null;
        org.apache.commons.cli.CommandLine.Builder builder70 = builder68.setDeprecatedHandler(optionConsumer69);
        java.lang.Class<?> wildcardClass71 = builder70.getClass();
        java.lang.Class<?> wildcardClass72 = commandLine63.getParsedOptionValue(option67, wildcardClass71);
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray73 = new java.lang.invoke.TypeDescriptor[] { wildcardClass24, wildcardClass28, wildcardClass39, wildcardClass60, wildcardClass72 };
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray74 = commandLine1.getParsedOptionValues("hi!", typeDescriptorArray73);
        java.lang.Object obj76 = commandLine1.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(genericDeclaration61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeDescriptorArray73);
        org.junit.Assert.assertNotNull(typeDescriptorArray74);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test90");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.String[] strArray15 = commandLine1.getOptionValues(option14);
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        boolean boolean17 = commandLine1.hasOption(optionGroup16);
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, strSupplier19);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray22 = commandLine1.getParsedOptionValues("hi!");
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        java.lang.String str25 = commandLine1.getOptionValue(optionGroup23, strSupplier24);
        org.apache.commons.cli.OptionGroup optionGroup26 = null;
        boolean boolean27 = commandLine1.hasOption(optionGroup26);
        org.apache.commons.cli.OptionGroup optionGroup28 = null;
        java.lang.String[] strArray29 = commandLine1.getOptionValues(optionGroup28);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(genericDeclarationArray22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(strArray29);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test91");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[][] strArray12 = commandLine1.getParsedOptionValues(option11);
        org.apache.commons.cli.CommandLine[] commandLineArray14 = commandLine1.getParsedOptionValues("hi!");
        java.util.Properties[][] propertiesArray16 = commandLine1.getParsedOptionValues('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(commandLineArray14);
        org.junit.Assert.assertNull(propertiesArray16);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test92");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.Object[] objArray6 = commandLine1.getParsedOptionValues(' ');
        java.lang.String str8 = commandLine1.getOptionValue("");
        int int10 = commandLine1.getOptionCount("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test93");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = commandLine2.getParsedOptionValues(option6);
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine2.getOptionValue(optionGroup8, strSupplier9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test94");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.Object[] objArray6 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.CommandLine.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option7, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder8);
        org.apache.commons.cli.Option option12 = null;
        org.apache.commons.cli.CommandLine.Builder builder13 = builder8.addOption(option12);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.CommandLine.Builder builder15 = builder8.setDeprecatedHandler(optionConsumer14);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test95");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        java.lang.Class<?> wildcardClass10 = commandLine1.getParsedOptionValue(option5, wildcardClass9);
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[][] strArray12 = commandLine1.getParsedOptionValues(option11);
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray14 = commandLine1.getParsedOptionValues(optionGroup13);
        org.apache.commons.cli.Option option15 = null;
        java.lang.String str16 = commandLine1.getOptionValue(option15);
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        java.lang.String str19 = commandLine1.getOptionValue('a', strSupplier18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(commandLineSupplierArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression0.test96");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String str15 = commandLine1.getOptionValue(optionGroup14);
        java.lang.CharSequence charSequence18 = commandLine1.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj20 = commandLine1.getOptionObject("hi!");
        int int22 = commandLine1.getOptionCount("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }
}

