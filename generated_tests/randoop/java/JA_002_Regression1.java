import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_002_Regression1 {

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
            System.out.format("%n%s%n", "JA_002_Regression1.test501");
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
        org.apache.commons.cli.Option option31 = null;
        org.apache.commons.cli.CommandLine.Builder builder32 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine33 = builder32.get();
        org.apache.commons.cli.Option option34 = null;
        java.util.function.Supplier<java.lang.String> strSupplier35 = null;
        java.lang.String str36 = commandLine33.getOptionValue(option34, strSupplier35);
        org.apache.commons.cli.Option option37 = null;
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray45 = commandLine33.getParsedOptionValues(option37, constableArray44);
        org.apache.commons.cli.Option[] optionArray46 = commandLine33.getOptions();
        java.util.List<java.lang.String> strList47 = commandLine33.getArgList();
        java.lang.Iterable<java.lang.String> strIterable48 = commandLine1.getParsedOptionValue(option31, (java.lang.Iterable<java.lang.String>) strList47);
        java.lang.String[] strArray49 = commandLine1.getArgs();
        org.apache.commons.cli.OptionGroup optionGroup50 = null;
        java.lang.String str52 = commandLine1.getOptionValue(optionGroup50, "hi!");
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray45);
        org.junit.Assert.assertNotNull(optionArray46);
        org.junit.Assert.assertArrayEquals(optionArray46, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strIterable48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_002_Regression1.test502");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        java.util.Collection<java.lang.String>[] strCollectionArray13 = commandLine1.getParsedOptionValue("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        java.lang.String str16 = commandLine1.getOptionValue('#', strSupplier15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(strCollectionArray13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_002_Regression1.test503");
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
        java.lang.String str17 = commandLine1.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(propertiesArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_002_Regression1.test504");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = commandLine2.getParsedOptionValues(option6);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField9 = commandLine2.getParsedOptionValue("");
        org.apache.commons.cli.CommandLine.Builder builder11 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine12 = builder11.get();
        org.apache.commons.cli.Option option13 = null;
        java.util.function.Supplier<java.lang.String> strSupplier14 = null;
        java.lang.String str15 = commandLine12.getOptionValue(option13, strSupplier14);
        org.apache.commons.cli.Option option16 = null;
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray24 = commandLine12.getParsedOptionValues(option16, constableArray23);
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        java.lang.String str26 = commandLine12.getOptionValue(optionGroup25);
        java.lang.CharSequence charSequence29 = commandLine12.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj31 = commandLine12.getOptionObject("hi!");
        int int33 = commandLine12.getOptionCount("");
        org.apache.commons.cli.CommandLine.Builder[] builderArray35 = commandLine12.getParsedOptionValues("");
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[][] strArray79 = new java.lang.String[][] { strArray43, strArray50, strArray57, strArray64, strArray71, strArray78 };
        java.lang.String[][] strArray80 = commandLine12.getParsedOptionValues('a', strArray79);
        java.lang.constant.Constable[][] constableArray81 = commandLine2.getParsedOptionValues('#', (java.lang.constant.Constable[][]) strArray80);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
        org.junit.Assert.assertNull(wildcardClassOfField9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + charSequence29 + "' != '" + "" + "'", charSequence29, "");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(builderArray35);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(constableArray81);
    }
}

