import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_010_Regression1 {

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
            System.out.format("%n%s%n", "JA_010_Regression1.test501");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.Option option3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addOption(option3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = builder0.addOption(option5);
        org.apache.commons.cli.CommandLine commandLine7 = builder0.build();
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine7.getOptionValue("", strSupplier9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test502");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        java.util.function.Supplier<java.lang.String> strSupplier4 = null;
        java.lang.String str5 = commandLine2.getOptionValue("hi!", strSupplier4);
        java.lang.String str8 = commandLine2.getOptionValue('#', "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test503");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        java.lang.Object obj7 = commandLine1.getOptionObject("");
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][] objMapArray9 = commandLine1.getParsedOptionValues(optionGroup8);
        java.lang.Object obj11 = commandLine1.getOptionObject(' ');
        java.lang.String[] strArray13 = commandLine1.getOptionValues('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objMapArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test504");
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
        java.lang.String[] strArray13 = commandLine11.getOptionValues(option12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String[] strArray15 = commandLine11.getOptionValues(optionGroup14);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = commandLine11.getParsedOptionValue(' ');
        java.lang.Object obj19 = commandLine11.getParsedOptionValue('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test505");
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
        java.lang.String[] strArray21 = commandLine16.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder23 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine24 = builder23.get();
        org.apache.commons.cli.CommandLine commandLine25 = commandLine16.getParsedOptionValue('a', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder23);
        java.lang.Object obj27 = commandLine16.getOptionObject("");
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test506");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(optionGroup6);
        int int9 = commandLine1.getOptionCount("hi!");
        org.apache.commons.cli.OptionGroup optionGroup10 = null;
        boolean boolean11 = commandLine1.hasOption(optionGroup10);
        java.util.List<java.lang.String> strList13 = commandLine1.getParsedOptionValue(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test507");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        org.apache.commons.cli.CommandLine.Builder builder3 = builder0.addOption(option2);
        org.apache.commons.cli.CommandLine commandLine4 = builder3.get();
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String[] strArray6 = commandLine4.getOptionValues(optionGroup5);
        java.util.List[] listArray9 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String>[] strListArray10 = (java.util.List<java.lang.String>[]) listArray9;
        java.util.List<java.lang.String>[] strListArray11 = commandLine4.getParsedOptionValue('a', strListArray10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(commandLine4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(listArray9);
        org.junit.Assert.assertArrayEquals(listArray9, new java.util.List[] {});
        org.junit.Assert.assertNotNull(strListArray10);
        org.junit.Assert.assertArrayEquals(strListArray10, new java.util.List[] {});
        org.junit.Assert.assertNotNull(strListArray11);
        org.junit.Assert.assertArrayEquals(strListArray11, new java.util.List[] {});
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test508");
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
        java.util.Properties properties12 = commandLine1.getOptionProperties(option11);
        org.apache.commons.cli.Option option13 = null;
        int int14 = commandLine1.getOptionCount(option13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test509");
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
        org.apache.commons.cli.CommandLine.Builder[] builderArray33 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        boolean boolean35 = commandLine1.hasOption(optionGroup34);
        int int37 = commandLine1.getOptionCount("");
        org.apache.commons.cli.Option option38 = null;
        org.apache.commons.cli.CommandLine.Builder builder39 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine40 = builder39.get();
        org.apache.commons.cli.Option option41 = null;
        java.util.function.Supplier<java.lang.String> strSupplier42 = null;
        java.lang.String str43 = commandLine40.getOptionValue(option41, strSupplier42);
        org.apache.commons.cli.OptionGroup optionGroup44 = null;
        java.lang.String str46 = commandLine40.getOptionValue(optionGroup44, "");
        org.apache.commons.cli.Option option47 = null;
        java.lang.String[] strArray48 = commandLine40.getOptionValues(option47);
        org.apache.commons.cli.Option option49 = null;
        int int50 = commandLine40.getOptionCount(option49);
        boolean boolean52 = commandLine40.hasOption("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier54 = null;
        java.lang.String str55 = commandLine40.getOptionValue("hi!", strSupplier54);
        org.apache.commons.cli.OptionGroup optionGroup56 = null;
        org.apache.commons.cli.CommandLine.Builder builder57 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine58 = builder57.get();
        java.lang.String str60 = commandLine58.getOptionValue("");
        java.util.function.Supplier[] supplierArray63 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray64 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray63;
        java.util.function.Supplier[] supplierArray66 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray67 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray66;
        java.util.function.Supplier[] supplierArray69 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray70 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray69;
        java.util.function.Supplier[] supplierArray72 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray73 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray72;
        java.util.function.Supplier[] supplierArray75 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray76 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray75;
        java.util.function.Supplier[] supplierArray78 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray79 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray78;
        java.util.function.Supplier[][] supplierArray81 = new java.util.function.Supplier[6][];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray82 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][]) supplierArray81;
        commandLineSupplierArray82[0] = supplierArray63;
        commandLineSupplierArray82[1] = supplierArray66;
        commandLineSupplierArray82[2] = commandLineSupplierArray70;
        commandLineSupplierArray82[3] = supplierArray72;
        commandLineSupplierArray82[4] = commandLineSupplierArray76;
        commandLineSupplierArray82[5] = supplierArray78;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray95 = commandLine58.getParsedOptionValue('#', commandLineSupplierArray82);
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray96 = commandLine40.getParsedOptionValues(optionGroup56, commandLineSupplierArray82);
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray97 = commandLine1.getParsedOptionValues(option38, commandLineSupplierArray96);
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
        org.junit.Assert.assertNull(builderArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(supplierArray63);
        org.junit.Assert.assertArrayEquals(supplierArray63, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray64);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray64, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray66);
        org.junit.Assert.assertArrayEquals(supplierArray66, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray67);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray67, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray69);
        org.junit.Assert.assertArrayEquals(supplierArray69, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray70);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray70, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray72);
        org.junit.Assert.assertArrayEquals(supplierArray72, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray73);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray73, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray75);
        org.junit.Assert.assertArrayEquals(supplierArray75, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray76);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray76, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray78);
        org.junit.Assert.assertArrayEquals(supplierArray78, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray79);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray79, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray81);
        org.junit.Assert.assertNotNull(commandLineSupplierArray82);
        org.junit.Assert.assertNotNull(commandLineSupplierArray95);
        org.junit.Assert.assertNotNull(commandLineSupplierArray96);
        org.junit.Assert.assertNotNull(commandLineSupplierArray97);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test510");
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
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine14.getOptions();
        org.apache.commons.cli.Option option18 = null;
        boolean boolean19 = commandLine14.hasOption(option18);
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        org.apache.commons.cli.Option[][] optionArray21 = commandLine14.getParsedOptionValue(optionGroup20);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(optionArray21);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test511");
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
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.util.function.Supplier<java.lang.String> strSupplier14 = null;
        java.lang.String str15 = commandLine1.getOptionValue(optionGroup13, strSupplier14);
        java.lang.String[] strArray17 = commandLine1.getOptionValues('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test512");
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
        org.apache.commons.cli.Option option16 = null;
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.Option option19 = null;
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        java.lang.String str21 = commandLine18.getOptionValue(option19, strSupplier20);
        org.apache.commons.cli.OptionGroup optionGroup22 = null;
        java.lang.String str24 = commandLine18.getOptionValue(optionGroup22, "");
        org.apache.commons.cli.Option option25 = null;
        java.lang.String[] strArray26 = commandLine18.getOptionValues(option25);
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        java.lang.constant.ConstantDesc constantDesc31 = null;
        java.lang.constant.ConstantDesc constantDesc32 = commandLine29.getParsedOptionValue('a', constantDesc31);
        java.lang.Object[] objArray34 = commandLine29.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option35 = null;
        org.apache.commons.cli.CommandLine.Builder builder36 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer37 = null;
        org.apache.commons.cli.CommandLine.Builder builder38 = builder36.setDeprecatedHandler(optionConsumer37);
        org.apache.commons.cli.CommandLine commandLine39 = commandLine29.getParsedOptionValue(option35, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.Option option40 = null;
        org.apache.commons.cli.CommandLine.Builder builder41 = builder36.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine42 = commandLine18.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.CommandLine commandLine43 = commandLine1.getParsedOptionValue(option16, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray45 = commandLine1.getParsedOptionValue("hi!");
        boolean boolean47 = commandLine1.hasOption('a');
        org.apache.commons.cli.CommandLine.Builder builder49 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine50 = builder49.get();
        org.apache.commons.cli.Option option51 = null;
        java.util.function.Supplier<java.lang.String> strSupplier52 = null;
        java.lang.String str53 = commandLine50.getOptionValue(option51, strSupplier52);
        java.lang.String[] strArray54 = commandLine50.getArgs();
        boolean boolean56 = commandLine50.hasOption('#');
        org.apache.commons.cli.CommandLine.Builder builder58 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine59 = builder58.get();
        org.apache.commons.cli.CommandLine.Builder builder61 = builder58.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine62 = builder61.build();
        org.apache.commons.cli.Option option63 = null;
        org.apache.commons.cli.CommandLine.Builder builder64 = builder61.addOption(option63);
        org.apache.commons.cli.CommandLine commandLine65 = commandLine50.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder61);
        org.apache.commons.cli.CommandLine commandLine66 = commandLine1.getParsedOptionValue('4', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder61);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(constantDesc32);
        org.junit.Assert.assertNull(objArray34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNull(genericDeclarationArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(commandLine59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(commandLine65);
        org.junit.Assert.assertNotNull(commandLine66);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test513");
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
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.util.function.Supplier<java.lang.String> strSupplier14 = null;
        java.lang.String str15 = commandLine1.getOptionValue(optionGroup13, strSupplier14);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray17 = commandLine1.getParsedOptionValues('a');
        org.apache.commons.cli.Option option18 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option18, "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(genericDeclarationArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test514");
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
        int int13 = commandLine1.getOptionCount("hi!");
        java.lang.Object obj15 = commandLine1.getOptionObject("");
        org.apache.commons.cli.Option option16 = null;
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.CommandLine commandLine19 = builder17.build();
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        java.lang.String[] strArray21 = commandLine19.getOptionValues(optionGroup20);
        java.lang.String[] strArray22 = commandLine19.getArgs();
        org.apache.commons.cli.Option option23 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray24 = commandLine19.getParsedOptionValues(option23);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField26 = commandLine19.getParsedOptionValue("");
        java.lang.String[] strArray27 = commandLine19.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.Option option31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine30.getOptionValue(option31, strSupplier32);
        org.apache.commons.cli.Option option34 = null;
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray42 = commandLine30.getParsedOptionValues(option34, constableArray41);
        java.lang.String[] strArray44 = commandLine30.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder46 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine47 = builder46.get();
        org.apache.commons.cli.CommandLine.Builder builder49 = builder46.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine50 = commandLine30.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder49);
        org.apache.commons.cli.CommandLine.Builder builder52 = builder49.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine53 = commandLine19.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder52);
        org.apache.commons.cli.CommandLine commandLine54 = builder52.build();
        org.apache.commons.cli.CommandLine commandLine55 = commandLine1.getParsedOptionValue(option16, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder52);
        org.apache.commons.cli.Option option56 = null;
        java.util.Properties properties57 = commandLine55.getOptionProperties(option56);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray24);
        org.junit.Assert.assertNull(wildcardClassOfField26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(commandLine47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(properties57);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test515");
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
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.CommandLine commandLine19 = builder17.build();
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        java.lang.String[] strArray21 = commandLine19.getOptionValues(optionGroup20);
        java.lang.String[] strArray22 = commandLine19.getArgs();
        org.apache.commons.cli.Option option23 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray24 = commandLine19.getParsedOptionValues(option23);
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine27 = builder26.get();
        java.lang.String[] strArray29 = commandLine27.getOptionValues('a');
        java.lang.String str31 = commandLine27.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup32 = null;
        org.apache.commons.cli.CommandLine.Builder builder33 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine34 = builder33.get();
        org.apache.commons.cli.Option option35 = null;
        java.util.function.Supplier<java.lang.String> strSupplier36 = null;
        java.lang.String str37 = commandLine34.getOptionValue(option35, strSupplier36);
        java.lang.String[] strArray38 = commandLine34.getArgs();
        org.apache.commons.cli.Option option39 = null;
        java.lang.String[] strArray40 = commandLine34.getOptionValues(option39);
        java.util.Properties[] propertiesArray42 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray43 = commandLine34.getParsedOptionValues(' ', propertiesArray42);
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray44 = commandLine27.getParsedOptionValue(optionGroup32, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) propertiesArray43);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray45 = commandLine19.getParsedOptionValues(optionGroup25, (java.util.Map<java.lang.Object, java.lang.Object>[]) objMapArray44);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray46 = commandLine1.getParsedOptionValue(optionGroup16, objMapArray45);
        int int48 = commandLine1.getOptionCount("");
        java.lang.Object obj50 = commandLine1.getOptionObject('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(propertiesArray42);
        org.junit.Assert.assertArrayEquals(propertiesArray42, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray43);
        org.junit.Assert.assertArrayEquals(propertiesArray43, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray44);
        org.junit.Assert.assertArrayEquals(objMapArray44, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray45);
        org.junit.Assert.assertArrayEquals(objMapArray45, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray46);
        org.junit.Assert.assertArrayEquals(objMapArray46, new java.util.Properties[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test516");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        java.lang.String[] strArray12 = commandLine1.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine1.getOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test517");
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
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray29 = commandLine1.getParsedOptionValues('4');
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        java.lang.String str32 = commandLine1.getOptionValue("hi!", strSupplier31);
        boolean boolean34 = commandLine1.hasOption('#');
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
        org.junit.Assert.assertNull(typeDescriptorArray29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test518");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.Class<?>[] wildcardClassArray10 = commandLine2.getParsedOptionValues(' ');
        java.lang.String[] strArray12 = commandLine2.getOptionValues("");
        java.lang.String[] strArray13 = commandLine2.getArgs();
        java.lang.reflect.Type[] typeArray15 = commandLine2.getParsedOptionValue(' ');
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        java.lang.String str17 = commandLine2.getOptionValue(optionGroup16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNull(typeArray15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test519");
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
        org.apache.commons.cli.CommandLine.Builder builder13 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine14 = builder13.get();
        org.apache.commons.cli.CommandLine commandLine15 = builder13.get();
        org.apache.commons.cli.CommandLine commandLine16 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder13);
        org.apache.commons.cli.Option option17 = null;
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        org.apache.commons.cli.CommandLine commandLine20 = builder18.get();
        org.apache.commons.cli.CommandLine commandLine21 = commandLine16.getParsedOptionValue(option17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder18);
        org.apache.commons.cli.Option option22 = null;
        java.lang.String[] strArray23 = commandLine16.getOptionValues(option22);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test520");
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
        org.apache.commons.cli.CommandLine.Builder builder14 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine15 = commandLine1.getParsedOptionValue('#', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder14);
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        java.lang.String str18 = commandLine15.getOptionValue(' ', strSupplier17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(genericDeclarationArray12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test521");
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
        org.apache.commons.cli.Option option26 = null;
        int int27 = commandLine1.getOptionCount(option26);
        java.lang.String[] strArray29 = commandLine1.getOptionValues("");
        java.lang.String str31 = commandLine1.getOptionValue(' ');
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][] wildcardClassOfFieldArray33 = commandLine1.getParsedOptionValues('a');
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(wildcardClassOfFieldArray33);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test522");
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
        java.util.Properties properties38 = commandLine36.getOptionProperties("");
        org.apache.commons.cli.CommandLine.Builder builder40 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine41 = builder40.get();
        org.apache.commons.cli.Option option42 = null;
        java.util.function.Supplier<java.lang.String> strSupplier43 = null;
        java.lang.String str44 = commandLine41.getOptionValue(option42, strSupplier43);
        org.apache.commons.cli.Option option45 = null;
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray53 = commandLine41.getParsedOptionValues(option45, constableArray52);
        org.apache.commons.cli.Option option54 = null;
        java.lang.String[] strArray55 = commandLine41.getOptionValues(option54);
        org.apache.commons.cli.CommandLine.Builder builder57 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine58 = builder57.get();
        org.apache.commons.cli.Option option59 = null;
        java.util.function.Supplier<java.lang.String> strSupplier60 = null;
        java.lang.String str61 = commandLine58.getOptionValue(option59, strSupplier60);
        org.apache.commons.cli.Option option62 = null;
        java.lang.constant.Constable[] constableArray69 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray70 = commandLine58.getParsedOptionValues(option62, constableArray69);
        org.apache.commons.cli.Option[] optionArray71 = commandLine58.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup72 = null;
        java.io.Serializable[] serializableArray73 = commandLine58.getParsedOptionValues(optionGroup72);
        java.util.List<java.lang.String> strList74 = commandLine58.getArgList();
        java.util.List<java.lang.String> strList75 = commandLine41.getParsedOptionValue("", strList74);
        java.util.Collection<java.lang.String> strCollection76 = commandLine36.getParsedOptionValue("", (java.util.Collection<java.lang.String>) strList74);
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
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray70);
        org.junit.Assert.assertNotNull(optionArray71);
        org.junit.Assert.assertArrayEquals(optionArray71, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(serializableArray73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strCollection76);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test523");
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
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap16 = commandLine1.getParsedOptionValue(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(objMap16);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test524");
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
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.lang.String[][] strArray12 = commandLine2.getParsedOptionValues(optionGroup11);
        org.apache.commons.cli.Option option13 = null;
        java.lang.String[] strArray14 = commandLine2.getOptionValues(option13);
        java.lang.String[] strArray16 = commandLine2.getOptionValues('4');
        org.apache.commons.cli.Option option17 = null;
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        org.apache.commons.cli.Option option20 = null;
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        java.lang.String str22 = commandLine19.getOptionValue(option20, strSupplier21);
        org.apache.commons.cli.Option option23 = null;
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray31 = commandLine19.getParsedOptionValues(option23, constableArray30);
        org.apache.commons.cli.Option option32 = null;
        java.lang.String[] strArray33 = commandLine19.getOptionValues(option32);
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        boolean boolean35 = commandLine19.hasOption(optionGroup34);
        org.apache.commons.cli.Option option36 = null;
        java.util.function.Supplier<java.lang.String> strSupplier37 = null;
        java.lang.String str38 = commandLine19.getOptionValue(option36, strSupplier37);
        org.apache.commons.cli.Option option39 = null;
        java.util.function.Supplier<java.lang.String> strSupplier40 = null;
        java.lang.String str41 = commandLine19.getOptionValue(option39, strSupplier40);
        org.apache.commons.cli.OptionGroup optionGroup42 = null;
        java.lang.String str43 = commandLine19.getOptionValue(optionGroup42);
        org.apache.commons.cli.OptionGroup optionGroup44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine46 = builder45.get();
        java.lang.constant.ConstantDesc constantDesc48 = null;
        java.lang.constant.ConstantDesc constantDesc49 = commandLine46.getParsedOptionValue('a', constantDesc48);
        java.lang.String str52 = commandLine46.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option53 = null;
        org.apache.commons.cli.CommandLine.Builder builder54 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine55 = builder54.get();
        org.apache.commons.cli.CommandLine commandLine56 = commandLine46.getParsedOptionValue(option53, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.CommandLine commandLine57 = commandLine19.getParsedOptionValue(optionGroup44, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.CommandLine commandLine58 = commandLine2.getParsedOptionValue(option17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.OptionGroup optionGroup59 = null;
        java.util.function.Supplier<java.lang.String> strSupplier60 = null;
        java.lang.String str61 = commandLine58.getOptionValue(optionGroup59, strSupplier60);
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
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNull(constantDesc49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test525");
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
        boolean boolean17 = commandLine1.hasOption("");
        org.apache.commons.cli.Option option18 = null;
        int int19 = commandLine1.getOptionCount(option18);
        int int21 = commandLine1.getOptionCount("");
        java.util.Hashtable[][][] hashtableArray24 = new java.util.Hashtable[0][][];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][][] objMapArray25 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[][][]) hashtableArray24;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][][] objMapArray26 = commandLine1.getParsedOptionValues('#', objMapArray25);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(hashtableArray24);
        org.junit.Assert.assertArrayEquals(hashtableArray24, new java.util.Hashtable[][][] {});
        org.junit.Assert.assertNotNull(objMapArray25);
        org.junit.Assert.assertArrayEquals(objMapArray25, new java.util.Hashtable[][][] {});
        org.junit.Assert.assertNotNull(objMapArray26);
        org.junit.Assert.assertArrayEquals(objMapArray26, new java.util.Hashtable[][][] {});
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test526");
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
        org.apache.commons.cli.Option option32 = null;
        java.util.function.Supplier<java.lang.String> strSupplier33 = null;
        java.lang.String str34 = commandLine1.getOptionValue(option32, strSupplier33);
        org.apache.commons.cli.Option[] optionArray35 = commandLine1.getOptions();
        org.apache.commons.cli.Option option36 = null;
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][][] wildcardClassOfFieldArray37 = commandLine1.getParsedOptionValues(option36);
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(optionArray35);
        org.junit.Assert.assertArrayEquals(optionArray35, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(wildcardClassOfFieldArray37);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test527");
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
        java.lang.String str23 = commandLine1.getOptionValue(' ');
        org.apache.commons.cli.Option option24 = null;
        org.apache.commons.cli.CommandLine.Builder builder25 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine26 = builder25.get();
        org.apache.commons.cli.Option option27 = null;
        java.util.function.Supplier<java.lang.String> strSupplier28 = null;
        java.lang.String str29 = commandLine26.getOptionValue(option27, strSupplier28);
        org.apache.commons.cli.Option option30 = null;
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray38 = commandLine26.getParsedOptionValues(option30, constableArray37);
        org.apache.commons.cli.Option[] optionArray39 = commandLine26.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup40 = null;
        java.io.Serializable[] serializableArray41 = commandLine26.getParsedOptionValues(optionGroup40);
        org.apache.commons.cli.CommandLine.Builder builder43 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine44 = builder43.get();
        org.apache.commons.cli.CommandLine commandLine45 = builder43.build();
        org.apache.commons.cli.Option option46 = null;
        org.apache.commons.cli.CommandLine.Builder builder47 = builder43.addOption(option46);
        org.apache.commons.cli.CommandLine commandLine48 = builder47.build();
        org.apache.commons.cli.CommandLine commandLine49 = commandLine26.getParsedOptionValue('a', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder47);
        org.apache.commons.cli.OptionGroup optionGroup50 = null;
        java.lang.String[] strArray51 = commandLine49.getParsedOptionValue(optionGroup50);
        java.lang.String[] strArray53 = commandLine49.getOptionValues('4');
        org.apache.commons.cli.CommandLine.Builder builder55 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine56 = builder55.get();
        java.lang.constant.ConstantDesc constantDesc58 = null;
        java.lang.constant.ConstantDesc constantDesc59 = commandLine56.getParsedOptionValue('a', constantDesc58);
        java.lang.Object[] objArray61 = commandLine56.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option62 = null;
        org.apache.commons.cli.CommandLine.Builder builder63 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer64 = null;
        org.apache.commons.cli.CommandLine.Builder builder65 = builder63.setDeprecatedHandler(optionConsumer64);
        org.apache.commons.cli.CommandLine commandLine66 = commandLine56.getParsedOptionValue(option62, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder63);
        java.lang.String[] strArray68 = commandLine66.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder70 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine71 = builder70.get();
        java.lang.constant.ConstantDesc constantDesc73 = null;
        java.lang.constant.ConstantDesc constantDesc74 = commandLine71.getParsedOptionValue('a', constantDesc73);
        java.lang.Object[] objArray76 = commandLine71.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option77 = null;
        org.apache.commons.cli.CommandLine.Builder builder78 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer79 = null;
        org.apache.commons.cli.CommandLine.Builder builder80 = builder78.setDeprecatedHandler(optionConsumer79);
        org.apache.commons.cli.CommandLine commandLine81 = commandLine71.getParsedOptionValue(option77, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder78);
        org.apache.commons.cli.Option option82 = null;
        org.apache.commons.cli.CommandLine.Builder builder83 = builder78.addOption(option82);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer84 = null;
        org.apache.commons.cli.CommandLine.Builder builder85 = builder78.setDeprecatedHandler(optionConsumer84);
        org.apache.commons.cli.CommandLine commandLine86 = commandLine66.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder78);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer87 = null;
        org.apache.commons.cli.CommandLine.Builder builder88 = builder78.setDeprecatedHandler(optionConsumer87);
        org.apache.commons.cli.CommandLine commandLine89 = commandLine49.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder78);
        org.apache.commons.cli.CommandLine commandLine90 = commandLine1.getParsedOptionValue(option24, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder78);
        org.apache.commons.cli.OptionGroup optionGroup91 = null;
        java.lang.String str92 = commandLine90.getOptionValue(optionGroup91);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(optionArray39);
        org.junit.Assert.assertArrayEquals(optionArray39, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(serializableArray41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNull(constantDesc59);
        org.junit.Assert.assertNull(objArray61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(commandLine71);
        org.junit.Assert.assertNull(constantDesc74);
        org.junit.Assert.assertNull(objArray76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(commandLine89);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test528");
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
        java.lang.String str27 = commandLine1.getOptionValue(' ');
        java.util.function.Supplier<java.lang.String> strSupplier29 = null;
        java.lang.String str30 = commandLine1.getOptionValue('a', strSupplier29);
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test529");
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
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][] objMapArray29 = commandLine1.getParsedOptionValues(' ');
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        java.lang.String str32 = commandLine1.getOptionValue("", strSupplier31);
        org.apache.commons.cli.Option option33 = null;
        java.lang.String str34 = commandLine1.getOptionValue(option33);
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
        org.junit.Assert.assertNull(objMapArray29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test530");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        java.lang.String str10 = commandLine1.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option option11 = null;
        boolean boolean12 = commandLine1.hasOption(option11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test531");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        java.lang.String[] strArray15 = commandLine1.getOptionValues("");
        int int17 = commandLine1.getOptionCount("");
        org.apache.commons.cli.OptionGroup optionGroup18 = null;
        java.lang.String str20 = commandLine1.getOptionValue(optionGroup18, "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test532");
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
        int int15 = commandLine1.getOptionCount("");
        java.lang.String[] strArray16 = commandLine1.getArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test533");
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
        java.lang.reflect.AnnotatedElement annotatedElement27 = commandLine1.getParsedOptionValue("");
        java.lang.Class<?> wildcardClass28 = commandLine1.getClass();
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
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test534");
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
        org.apache.commons.cli.Option option15 = null;
        java.lang.String str16 = commandLine11.getOptionValue(option15);
        org.apache.commons.cli.Option option17 = null;
        int int18 = commandLine11.getOptionCount(option17);
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine21 = builder20.get();
        org.apache.commons.cli.Option option22 = null;
        java.util.function.Supplier<java.lang.String> strSupplier23 = null;
        java.lang.String str24 = commandLine21.getOptionValue(option22, strSupplier23);
        org.apache.commons.cli.Option option25 = null;
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray33 = commandLine21.getParsedOptionValues(option25, constableArray32);
        org.apache.commons.cli.Option option34 = null;
        java.lang.String[] strArray35 = commandLine21.getOptionValues(option34);
        org.apache.commons.cli.OptionGroup optionGroup36 = null;
        org.apache.commons.cli.CommandLine.Builder builder37 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine38 = builder37.get();
        org.apache.commons.cli.CommandLine commandLine39 = builder37.build();
        org.apache.commons.cli.OptionGroup optionGroup40 = null;
        java.lang.String[] strArray41 = commandLine39.getOptionValues(optionGroup40);
        java.lang.String[] strArray42 = commandLine39.getArgs();
        org.apache.commons.cli.Option option43 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray44 = commandLine39.getParsedOptionValues(option43);
        org.apache.commons.cli.OptionGroup optionGroup45 = null;
        org.apache.commons.cli.CommandLine.Builder builder46 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine47 = builder46.get();
        java.lang.String[] strArray49 = commandLine47.getOptionValues('a');
        java.lang.String str51 = commandLine47.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup52 = null;
        org.apache.commons.cli.CommandLine.Builder builder53 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine54 = builder53.get();
        org.apache.commons.cli.Option option55 = null;
        java.util.function.Supplier<java.lang.String> strSupplier56 = null;
        java.lang.String str57 = commandLine54.getOptionValue(option55, strSupplier56);
        java.lang.String[] strArray58 = commandLine54.getArgs();
        org.apache.commons.cli.Option option59 = null;
        java.lang.String[] strArray60 = commandLine54.getOptionValues(option59);
        java.util.Properties[] propertiesArray62 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray63 = commandLine54.getParsedOptionValues(' ', propertiesArray62);
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray64 = commandLine47.getParsedOptionValue(optionGroup52, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) propertiesArray63);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray65 = commandLine39.getParsedOptionValues(optionGroup45, (java.util.Map<java.lang.Object, java.lang.Object>[]) objMapArray64);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray66 = commandLine21.getParsedOptionValue(optionGroup36, objMapArray65);
        java.lang.Class[] classArray69 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        java.lang.Class[] classArray72 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        java.lang.Class[] classArray75 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray76 = (java.lang.Class<?>[]) classArray75;
        java.lang.Class[][] classArray78 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray79 = (java.lang.Class<?>[][]) classArray78;
        wildcardClassArray79[0] = classArray69;
        wildcardClassArray79[1] = wildcardClassArray73;
        wildcardClassArray79[2] = classArray75;
        java.lang.Class<?>[][] wildcardClassArray86 = commandLine21.getParsedOptionValues("hi!", wildcardClassArray79);
        java.lang.Object[][] objArray87 = commandLine11.getParsedOptionValues(optionGroup19, (java.lang.Object[][]) wildcardClassArray86);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(commandLine47);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNotNull(propertiesArray62);
        org.junit.Assert.assertArrayEquals(propertiesArray62, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray63);
        org.junit.Assert.assertArrayEquals(propertiesArray63, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray64);
        org.junit.Assert.assertArrayEquals(objMapArray64, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray65);
        org.junit.Assert.assertArrayEquals(objMapArray65, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray66);
        org.junit.Assert.assertArrayEquals(objMapArray66, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertArrayEquals(classArray72, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertArrayEquals(wildcardClassArray73, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray75);
        org.junit.Assert.assertArrayEquals(classArray75, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertArrayEquals(wildcardClassArray76, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(objArray87);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test535");
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
        java.lang.String str30 = commandLine1.getOptionValue(option28, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine1.getOptionValue(optionGroup31, strSupplier32);
        java.lang.String str35 = commandLine1.getParsedOptionValue('a');
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test536");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.CommandLine commandLine3 = builder0.get();
        org.apache.commons.cli.CommandLine.Builder builder5 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine6 = builder5.get();
        org.apache.commons.cli.CommandLine.Builder builder8 = builder5.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine9 = commandLine3.getParsedOptionValue('a', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder8);
        org.apache.commons.cli.OptionGroup optionGroup10 = null;
        org.apache.commons.cli.CommandLine.Builder builder11 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine12 = builder11.get();
        org.apache.commons.cli.CommandLine commandLine13 = builder11.build();
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String[] strArray15 = commandLine13.getOptionValues(optionGroup14);
        java.lang.String[] strArray16 = commandLine13.getArgs();
        org.apache.commons.cli.Option option17 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray18 = commandLine13.getParsedOptionValues(option17);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField20 = commandLine13.getParsedOptionValue("");
        java.lang.String[] strArray21 = commandLine13.getArgs();
        java.io.Serializable[] serializableArray22 = commandLine9.getParsedOptionValue(optionGroup10, (java.io.Serializable[]) strArray21);
        java.lang.String str25 = commandLine9.getOptionValue("hi!", "hi!");
        java.util.function.Supplier<java.lang.String> strSupplier27 = null;
        java.lang.String str28 = commandLine9.getOptionValue('a', strSupplier27);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(commandLine3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray18);
        org.junit.Assert.assertNull(wildcardClassOfField20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(serializableArray22);
        org.junit.Assert.assertArrayEquals(serializableArray22, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test537");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        int int3 = commandLine1.getOptionCount(option2);
        org.apache.commons.cli.Option option4 = null;
        org.apache.commons.cli.CommandLine.Builder builder5 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.CommandLine.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.CommandLine.Builder builder9 = builder7.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine10 = commandLine1.getParsedOptionValue(option4, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test538");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap3 = commandLine1.getParsedOptionValue(option2);
        org.apache.commons.cli.OptionGroup optionGroup4 = null;
        java.util.Hashtable[] hashtableArray6 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray7 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray8 = commandLine1.getParsedOptionValues(optionGroup4, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6);
        boolean boolean10 = commandLine1.hasOption('a');
        org.apache.commons.cli.CommandLine.Builder builder12 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine13 = builder12.get();
        org.apache.commons.cli.CommandLine commandLine14 = builder12.build();
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        java.lang.String[] strArray16 = commandLine14.getOptionValues(optionGroup15);
        java.lang.String[] strArray17 = commandLine14.getArgs();
        org.apache.commons.cli.Option option18 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray19 = commandLine14.getParsedOptionValues(option18);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField21 = commandLine14.getParsedOptionValue("");
        org.apache.commons.cli.CommandLine.Builder builder23 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine24 = builder23.get();
        org.apache.commons.cli.Option option25 = null;
        java.util.function.Supplier<java.lang.String> strSupplier26 = null;
        java.lang.String str27 = commandLine24.getOptionValue(option25, strSupplier26);
        org.apache.commons.cli.Option option28 = null;
        java.lang.constant.Constable[] constableArray35 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray36 = commandLine24.getParsedOptionValues(option28, constableArray35);
        org.apache.commons.cli.OptionGroup optionGroup37 = null;
        java.lang.String str38 = commandLine24.getOptionValue(optionGroup37);
        java.lang.CharSequence charSequence41 = commandLine24.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj43 = commandLine24.getOptionObject("hi!");
        int int45 = commandLine24.getOptionCount("");
        org.apache.commons.cli.CommandLine.Builder[] builderArray47 = commandLine24.getParsedOptionValues("");
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[][] strArray91 = new java.lang.String[][] { strArray55, strArray62, strArray69, strArray76, strArray83, strArray90 };
        java.lang.String[][] strArray92 = commandLine24.getParsedOptionValues('a', strArray91);
        java.lang.constant.Constable[][] constableArray93 = commandLine14.getParsedOptionValues('#', (java.lang.constant.Constable[][]) strArray92);
        java.lang.CharSequence[][] charSequenceArray94 = commandLine1.getParsedOptionValues('a', (java.lang.CharSequence[][]) strArray92);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNotNull(hashtableArray6);
        org.junit.Assert.assertArrayEquals(hashtableArray6, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray7);
        org.junit.Assert.assertArrayEquals(objMapArray7, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray8);
        org.junit.Assert.assertArrayEquals(objMapArray8, new java.util.Hashtable[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray19);
        org.junit.Assert.assertNull(wildcardClassOfField21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + charSequence41 + "' != '" + "" + "'", charSequence41, "");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(builderArray47);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(constableArray93);
        org.junit.Assert.assertNotNull(charSequenceArray94);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test539");
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
        java.lang.String str22 = commandLine1.getOptionValue('a', "hi!");
        boolean boolean24 = commandLine1.hasOption("hi!");
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine27 = builder26.get();
        org.apache.commons.cli.CommandLine.Builder builder29 = builder26.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine30 = commandLine1.getParsedOptionValue('#', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder26);
        org.apache.commons.cli.Option option31 = null;
        org.apache.commons.cli.CommandLine.Builder builder32 = builder26.addOption(option31);
        org.apache.commons.cli.CommandLine commandLine33 = builder26.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(commandLine33);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test540");
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
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine14.getOptions();
        org.apache.commons.cli.Option option18 = null;
        boolean boolean19 = commandLine14.hasOption(option18);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor20 = commandLine14.iterator();
        java.lang.String str22 = commandLine14.getOptionValue("hi!");
        org.apache.commons.cli.Option option23 = null;
        java.lang.String[] strArray24 = commandLine14.getOptionValues(option23);
        org.apache.commons.cli.Option option25 = null;
        java.lang.String[] strArray26 = commandLine14.getOptionValues(option25);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionItor20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test541");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue("");
        int int11 = commandLine1.getOptionCount("");
        org.apache.commons.cli.OptionGroup optionGroup12 = null;
        java.lang.String[] strArray13 = commandLine1.getOptionValues(optionGroup12);
        java.lang.String[] strArray15 = commandLine1.getOptionValues('#');
        java.lang.String[] strArray17 = commandLine1.getOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test542");
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
        java.util.Collection<java.lang.String> strCollection12 = commandLine1.getParsedOptionValue(option11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(strCollection12);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test543");
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
        java.lang.String str26 = commandLine1.getOptionValue('#', "hi!");
        org.apache.commons.cli.Option option27 = null;
        java.util.function.Supplier<java.lang.String> strSupplier28 = null;
        java.lang.String str29 = commandLine1.getOptionValue(option27, strSupplier28);
        org.apache.commons.cli.Option option30 = null;
        org.apache.commons.cli.CommandLine.Builder builder31 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine32 = builder31.get();
        java.lang.String[] strArray34 = commandLine32.getOptionValues('a');
        java.lang.String str36 = commandLine32.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup37 = null;
        java.lang.String[] strArray38 = commandLine32.getOptionValues(optionGroup37);
        int int40 = commandLine32.getOptionCount("hi!");
        org.apache.commons.cli.OptionGroup optionGroup41 = null;
        boolean boolean42 = commandLine32.hasOption(optionGroup41);
        org.apache.commons.cli.OptionGroup optionGroup43 = null;
        boolean boolean44 = commandLine32.hasOption(optionGroup43);
        boolean boolean46 = commandLine32.hasOption(' ');
        org.apache.commons.cli.Option option47 = null;
        java.util.Properties properties48 = commandLine32.getOptionProperties(option47);
        org.apache.commons.cli.Option option49 = null;
        java.util.Properties properties50 = commandLine32.getOptionProperties(option49);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary51 = commandLine1.getParsedOptionValue(option30, (java.util.Dictionary<java.lang.Object, java.lang.Object>) properties50);
        org.apache.commons.cli.Option option52 = null;
        java.lang.String str53 = commandLine1.getOptionValue(option52);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(objDictionary51);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test544");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.String[] strArray10 = commandLine2.getOptionValues('#');
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.lang.CharSequence[] charSequenceArray12 = commandLine2.getParsedOptionValues(optionGroup11);
        java.lang.constant.Constable constable15 = commandLine2.getParsedOptionValue("hi!", (java.lang.constant.Constable) ' ');
        java.lang.String str18 = commandLine2.getOptionValue("", "");
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        boolean boolean20 = commandLine2.hasOption(optionGroup19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(charSequenceArray12);
        org.junit.Assert.assertEquals("'" + constable15 + "' != '" + ' ' + "'", constable15, ' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test545");
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
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder26.setDeprecatedHandler(optionConsumer27);
        org.apache.commons.cli.CommandLine commandLine29 = builder26.build();
        org.apache.commons.cli.Option option30 = null;
        boolean boolean31 = commandLine29.hasOption(option30);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor32 = commandLine29.iterator();
        org.apache.commons.cli.CommandLine.Builder builder33 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine34 = builder33.get();
        org.apache.commons.cli.Option option35 = null;
        java.util.function.Supplier<java.lang.String> strSupplier36 = null;
        java.lang.String str37 = commandLine34.getOptionValue(option35, strSupplier36);
        org.apache.commons.cli.OptionGroup optionGroup38 = null;
        java.lang.String str40 = commandLine34.getOptionValue(optionGroup38, "");
        org.apache.commons.cli.OptionGroup optionGroup41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = commandLine34.getParsedOptionValue(optionGroup41);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor43 = commandLine34.iterator();
        java.util.Iterator[] iteratorArray45 = new java.util.Iterator[2];
        @SuppressWarnings("unchecked")
        java.util.Iterator<org.apache.commons.cli.Option>[] optionItorArray46 = (java.util.Iterator<org.apache.commons.cli.Option>[]) iteratorArray45;
        optionItorArray46[0] = optionItor32;
        optionItorArray46[1] = optionItor43;
        java.util.Iterator<org.apache.commons.cli.Option>[] optionItorArray51 = commandLine1.getParsedOptionValues(optionGroup25, optionItorArray46);
        java.util.function.Supplier<java.lang.String> strSupplier53 = null;
        java.lang.String str54 = commandLine1.getOptionValue('a', strSupplier53);
        org.apache.commons.cli.OptionGroup optionGroup55 = null;
        boolean boolean56 = commandLine1.hasOption(optionGroup55);
        org.apache.commons.cli.Option option57 = null;
        java.lang.String[] strArray58 = commandLine1.getOptionValues(option57);
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionItor32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(commandLine42);
        org.junit.Assert.assertNotNull(optionItor43);
        org.junit.Assert.assertNotNull(iteratorArray45);
        org.junit.Assert.assertNotNull(optionItorArray46);
        org.junit.Assert.assertNotNull(optionItorArray51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(strArray58);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test546");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.Class<?>[] wildcardClassArray10 = commandLine2.getParsedOptionValues(' ');
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        java.lang.String str13 = commandLine2.getOptionValue("hi!", strSupplier12);
        java.util.Properties properties15 = commandLine2.getOptionProperties("");
        java.lang.String str18 = commandLine2.getOptionValue('4', "");
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        java.lang.String str21 = commandLine2.getOptionValue(optionGroup19, strSupplier20);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test547");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        boolean boolean7 = commandLine1.hasOption('#');
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.CommandLine.Builder builder12 = builder9.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine13 = builder12.build();
        org.apache.commons.cli.Option option14 = null;
        org.apache.commons.cli.CommandLine.Builder builder15 = builder12.addOption(option14);
        org.apache.commons.cli.CommandLine commandLine16 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder12);
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        java.lang.String[] strArray21 = commandLine19.getOptionValues('a');
        org.apache.commons.cli.Option option22 = null;
        java.lang.constant.ConstantDesc[] constantDescArray27 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray32 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray37 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray53 = new java.lang.constant.ConstantDesc[][] { constantDescArray27, constantDescArray32, constantDescArray37, constantDescArray42, constantDescArray47, constantDescArray52 };
        java.lang.constant.ConstantDesc[][] constantDescArray54 = commandLine19.getParsedOptionValues(option22, constantDescArray53);
        org.apache.commons.cli.OptionGroup optionGroup55 = null;
        java.lang.String str57 = commandLine19.getOptionValue(optionGroup55, "hi!");
        org.apache.commons.cli.CommandLine.Builder builder59 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine60 = builder59.get();
        org.apache.commons.cli.Option option61 = null;
        java.util.function.Supplier<java.lang.String> strSupplier62 = null;
        java.lang.String str63 = commandLine60.getOptionValue(option61, strSupplier62);
        java.lang.String[] strArray64 = commandLine60.getArgs();
        org.apache.commons.cli.Option option65 = null;
        java.lang.String[] strArray66 = commandLine60.getOptionValues(option65);
        java.util.Properties[] propertiesArray68 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray69 = commandLine60.getParsedOptionValues(' ', propertiesArray68);
        java.util.Dictionary<java.lang.Object, java.lang.Object>[] objDictionaryArray70 = commandLine19.getParsedOptionValues("", (java.util.Dictionary<java.lang.Object, java.lang.Object>[]) propertiesArray68);
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray71 = commandLine1.getParsedOptionValue(optionGroup17, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) propertiesArray68);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(constantDescArray27);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray37);
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertNotNull(constantDescArray54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNotNull(propertiesArray68);
        org.junit.Assert.assertArrayEquals(propertiesArray68, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray69);
        org.junit.Assert.assertArrayEquals(propertiesArray69, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objDictionaryArray70);
        org.junit.Assert.assertArrayEquals(objDictionaryArray70, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray71);
        org.junit.Assert.assertArrayEquals(objMapArray71, new java.util.Properties[] {});
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test548");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(optionGroup6);
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        java.lang.String str10 = commandLine1.getOptionValue(optionGroup8, strSupplier9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test549");
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
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = builder17.setDeprecatedHandler(optionConsumer18);
        org.apache.commons.cli.CommandLine commandLine20 = commandLine1.getParsedOptionValue(' ', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder19);
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine20.getOptionValue("", strSupplier22);
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        java.lang.String[] strArray25 = commandLine20.getParsedOptionValues(optionGroup24);
        java.util.function.Supplier<java.lang.String> strSupplier27 = null;
        java.lang.String str28 = commandLine20.getOptionValue(' ', strSupplier27);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test550");
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
        org.apache.commons.cli.Option option26 = null;
        int int27 = commandLine1.getOptionCount(option26);
        java.lang.String[] strArray29 = commandLine1.getOptionValues("");
        java.lang.String str31 = commandLine1.getOptionValue(' ');
        java.util.List<java.lang.String> strList32 = commandLine1.getArgList();
        org.apache.commons.cli.Option option33 = null;
        org.apache.commons.cli.CommandLine.Builder builder34 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine35 = builder34.get();
        java.lang.String str37 = commandLine35.getOptionValue("");
        java.util.function.Supplier[] supplierArray40 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray41 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray40;
        java.util.function.Supplier[] supplierArray43 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray44 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray43;
        java.util.function.Supplier[] supplierArray46 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray47 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray46;
        java.util.function.Supplier[] supplierArray49 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray50 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray49;
        java.util.function.Supplier[] supplierArray52 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray53 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray52;
        java.util.function.Supplier[] supplierArray55 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray56 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray55;
        java.util.function.Supplier[][] supplierArray58 = new java.util.function.Supplier[6][];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray59 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][]) supplierArray58;
        commandLineSupplierArray59[0] = supplierArray40;
        commandLineSupplierArray59[1] = supplierArray43;
        commandLineSupplierArray59[2] = commandLineSupplierArray47;
        commandLineSupplierArray59[3] = supplierArray49;
        commandLineSupplierArray59[4] = commandLineSupplierArray53;
        commandLineSupplierArray59[5] = supplierArray55;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray72 = commandLine35.getParsedOptionValue('#', commandLineSupplierArray59);
        org.apache.commons.cli.OptionGroup optionGroup73 = null;
        org.apache.commons.cli.CommandLine.Builder builder74 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine75 = builder74.get();
        java.lang.constant.ConstantDesc constantDesc77 = null;
        java.lang.constant.ConstantDesc constantDesc78 = commandLine75.getParsedOptionValue('a', constantDesc77);
        java.lang.Object[] objArray80 = commandLine75.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option81 = null;
        org.apache.commons.cli.CommandLine.Builder builder82 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer83 = null;
        org.apache.commons.cli.CommandLine.Builder builder84 = builder82.setDeprecatedHandler(optionConsumer83);
        org.apache.commons.cli.CommandLine commandLine85 = commandLine75.getParsedOptionValue(option81, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder82);
        org.apache.commons.cli.Option option86 = null;
        org.apache.commons.cli.CommandLine.Builder builder87 = builder82.addOption(option86);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer88 = null;
        org.apache.commons.cli.CommandLine.Builder builder89 = builder82.setDeprecatedHandler(optionConsumer88);
        org.apache.commons.cli.CommandLine commandLine90 = commandLine35.getParsedOptionValue(optionGroup73, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder82);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer91 = null;
        org.apache.commons.cli.CommandLine.Builder builder92 = builder82.setDeprecatedHandler(optionConsumer91);
        org.apache.commons.cli.CommandLine commandLine93 = commandLine1.getParsedOptionValue(option33, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder92);
        org.apache.commons.cli.Option option94 = null;
        boolean boolean95 = commandLine93.hasOption(option94);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(supplierArray40);
        org.junit.Assert.assertArrayEquals(supplierArray40, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray41);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray41, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray43);
        org.junit.Assert.assertArrayEquals(supplierArray43, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray44);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray44, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray46);
        org.junit.Assert.assertArrayEquals(supplierArray46, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray47);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray47, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray49);
        org.junit.Assert.assertArrayEquals(supplierArray49, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray50);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray50, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray52);
        org.junit.Assert.assertArrayEquals(supplierArray52, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray53);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray53, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray55);
        org.junit.Assert.assertArrayEquals(supplierArray55, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray56);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray56, new java.util.function.Supplier[] {});
        org.junit.Assert.assertNotNull(supplierArray58);
        org.junit.Assert.assertNotNull(commandLineSupplierArray59);
        org.junit.Assert.assertNotNull(commandLineSupplierArray72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(commandLine75);
        org.junit.Assert.assertNull(constantDesc78);
        org.junit.Assert.assertNull(objArray80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(commandLine85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test551");
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
        org.apache.commons.cli.Option option28 = null;
        java.util.Properties properties29 = commandLine1.getOptionProperties(option28);
        org.apache.commons.cli.Option option30 = null;
        java.lang.String str31 = commandLine1.getOptionValue(option30);
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
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test552");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        java.lang.String str14 = commandLine1.getOptionValue('#', "hi!");
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        org.apache.commons.cli.CommandLine.Builder builder16 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine17 = builder16.get();
        java.lang.constant.ConstantDesc constantDesc19 = null;
        java.lang.constant.ConstantDesc constantDesc20 = commandLine17.getParsedOptionValue('a', constantDesc19);
        java.lang.String str23 = commandLine17.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option24 = null;
        org.apache.commons.cli.CommandLine.Builder builder25 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine26 = builder25.get();
        org.apache.commons.cli.CommandLine commandLine27 = commandLine17.getParsedOptionValue(option24, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder25);
        org.apache.commons.cli.CommandLine commandLine28 = builder25.get();
        org.apache.commons.cli.CommandLine commandLine29 = builder25.get();
        org.apache.commons.cli.CommandLine commandLine30 = commandLine1.getParsedOptionValue(optionGroup15, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder25);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNull(constantDesc20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(commandLine30);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test553");
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
        java.lang.String[] strArray22 = commandLine1.getArgs();
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        boolean boolean24 = commandLine1.hasOption(optionGroup23);
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder26.setDeprecatedHandler(optionConsumer27);
        org.apache.commons.cli.CommandLine commandLine29 = builder26.build();
        org.apache.commons.cli.CommandLine commandLine30 = commandLine1.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder26);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(commandLine30);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test554");
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
        java.lang.String[] strArray13 = commandLine11.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder15 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine16 = builder15.get();
        java.lang.constant.ConstantDesc constantDesc18 = null;
        java.lang.constant.ConstantDesc constantDesc19 = commandLine16.getParsedOptionValue('a', constantDesc18);
        java.lang.Object[] objArray21 = commandLine16.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option22 = null;
        org.apache.commons.cli.CommandLine.Builder builder23 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer24 = null;
        org.apache.commons.cli.CommandLine.Builder builder25 = builder23.setDeprecatedHandler(optionConsumer24);
        org.apache.commons.cli.CommandLine commandLine26 = commandLine16.getParsedOptionValue(option22, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder23);
        org.apache.commons.cli.Option option27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder23.addOption(option27);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer29 = null;
        org.apache.commons.cli.CommandLine.Builder builder30 = builder23.setDeprecatedHandler(optionConsumer29);
        org.apache.commons.cli.CommandLine commandLine31 = commandLine11.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder23);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer32 = null;
        org.apache.commons.cli.CommandLine.Builder builder33 = builder23.setDeprecatedHandler(optionConsumer32);
        org.apache.commons.cli.CommandLine commandLine34 = builder23.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(commandLine34);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test555");
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
        org.apache.commons.cli.Option option17 = null;
        java.util.Iterator[][] iteratorArray19 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<org.apache.commons.cli.Option>[][] optionItorArray20 = (java.util.Iterator<org.apache.commons.cli.Option>[][]) iteratorArray19;
        java.util.Iterator<org.apache.commons.cli.Option>[][] optionItorArray21 = commandLine1.getParsedOptionValues(option17, optionItorArray20);
        int int23 = commandLine1.getOptionCount("hi!");
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
        org.junit.Assert.assertNotNull(iteratorArray19);
        org.junit.Assert.assertArrayEquals(iteratorArray19, new java.util.Iterator[][] {});
        org.junit.Assert.assertNotNull(optionItorArray20);
        org.junit.Assert.assertArrayEquals(optionItorArray20, new java.util.Iterator[][] {});
        org.junit.Assert.assertNotNull(optionItorArray21);
        org.junit.Assert.assertArrayEquals(optionItorArray21, new java.util.Iterator[][] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test556");
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
        java.lang.String str16 = commandLine1.getOptionValue(optionGroup15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test557");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(optionGroup6);
        int int9 = commandLine1.getOptionCount("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        java.lang.String str12 = commandLine1.getOptionValue('a', strSupplier11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test558");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue("");
        int int11 = commandLine1.getOptionCount("");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray13 = commandLine1.getParsedOptionValues("");
        java.lang.String[] strArray14 = commandLine1.getArgs();
        org.apache.commons.cli.Option option15 = null;
        org.apache.commons.cli.CommandLine.Builder builder16 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine17 = builder16.get();
        org.apache.commons.cli.CommandLine commandLine18 = builder16.build();
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        java.lang.String[] strArray20 = commandLine18.getOptionValues(optionGroup19);
        java.lang.String[] strArray21 = commandLine18.getArgs();
        org.apache.commons.cli.Option option22 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray23 = commandLine18.getParsedOptionValues(option22);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField25 = commandLine18.getParsedOptionValue("");
        java.lang.String[] strArray26 = commandLine18.getArgs();
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
        org.apache.commons.cli.CommandLine commandLine52 = commandLine18.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder51);
        org.apache.commons.cli.CommandLine commandLine53 = commandLine1.getParsedOptionValue(option15, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder51);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(annotatedElementArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray23);
        org.junit.Assert.assertNull(wildcardClassOfField25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
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
        org.junit.Assert.assertNotNull(commandLine53);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test559");
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
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        java.lang.constant.ConstantDesc constantDesc21 = null;
        java.lang.constant.ConstantDesc constantDesc22 = commandLine19.getParsedOptionValue('a', constantDesc21);
        java.lang.String str25 = commandLine19.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option26 = null;
        org.apache.commons.cli.CommandLine.Builder builder27 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer28 = null;
        org.apache.commons.cli.CommandLine.Builder builder29 = builder27.setDeprecatedHandler(optionConsumer28);
        org.apache.commons.cli.CommandLine commandLine30 = commandLine19.getParsedOptionValue(option26, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder27);
        org.apache.commons.cli.Option[] optionArray31 = commandLine19.getOptions();
        org.apache.commons.cli.CommandLine.Builder[] builderArray33 = new org.apache.commons.cli.CommandLine.Builder[] {};
        org.apache.commons.cli.CommandLine.Builder[] builderArray34 = commandLine19.getParsedOptionValues('a', builderArray33);
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray35 = commandLine1.getParsedOptionValues(optionGroup17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) builderArray33);
        org.apache.commons.cli.Option option36 = null;
        java.lang.String str37 = commandLine1.getOptionValue(option36);
        java.lang.String[] strArray39 = commandLine1.getOptionValues("hi!");
        java.lang.String str42 = commandLine1.getOptionValue("", "");
        org.apache.commons.cli.CommandLine.Builder builder44 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine45 = builder44.get();
        org.apache.commons.cli.CommandLine commandLine46 = builder44.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer47 = null;
        org.apache.commons.cli.CommandLine.Builder builder48 = builder44.setDeprecatedHandler(optionConsumer47);
        org.apache.commons.cli.CommandLine commandLine49 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder44);
        org.apache.commons.cli.CommandLine.Builder builder51 = builder44.addArg("");
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(optionArray31);
        org.junit.Assert.assertArrayEquals(optionArray31, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(builderArray33);
        org.junit.Assert.assertArrayEquals(builderArray33, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(builderArray34);
        org.junit.Assert.assertArrayEquals(builderArray34, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray35);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray35, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test560");
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
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.CommandLine.Builder builder20 = builder17.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine21 = builder20.build();
        org.apache.commons.cli.Option option22 = null;
        java.lang.constant.Constable[] constableArray23 = commandLine21.getParsedOptionValues(option22);
        java.io.Serializable serializable24 = commandLine1.getParsedOptionValue("", (java.io.Serializable) commandLine21);
        java.util.Properties[] propertiesArray26 = commandLine21.getParsedOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(constableArray23);
        org.junit.Assert.assertNotNull(serializable24);
        org.junit.Assert.assertNull(propertiesArray26);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test561");
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
        org.apache.commons.cli.Option option16 = null;
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.Option option19 = null;
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        java.lang.String str21 = commandLine18.getOptionValue(option19, strSupplier20);
        org.apache.commons.cli.OptionGroup optionGroup22 = null;
        java.lang.String str24 = commandLine18.getOptionValue(optionGroup22, "");
        org.apache.commons.cli.Option option25 = null;
        java.lang.String[] strArray26 = commandLine18.getOptionValues(option25);
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        java.lang.constant.ConstantDesc constantDesc31 = null;
        java.lang.constant.ConstantDesc constantDesc32 = commandLine29.getParsedOptionValue('a', constantDesc31);
        java.lang.Object[] objArray34 = commandLine29.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option35 = null;
        org.apache.commons.cli.CommandLine.Builder builder36 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer37 = null;
        org.apache.commons.cli.CommandLine.Builder builder38 = builder36.setDeprecatedHandler(optionConsumer37);
        org.apache.commons.cli.CommandLine commandLine39 = commandLine29.getParsedOptionValue(option35, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.Option option40 = null;
        org.apache.commons.cli.CommandLine.Builder builder41 = builder36.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine42 = commandLine18.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.CommandLine commandLine43 = commandLine1.getParsedOptionValue(option16, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.Option option44 = null;
        java.lang.String str45 = commandLine43.getOptionValue(option44);
        boolean boolean47 = commandLine43.hasOption("");
        java.util.Iterator<org.apache.commons.cli.Option> optionItor48 = commandLine43.iterator();
        java.lang.Object obj50 = commandLine43.getOptionObject("");
        org.apache.commons.cli.Option option51 = null;
        java.util.function.Supplier<java.lang.String> strSupplier52 = null;
        java.lang.String str53 = commandLine43.getOptionValue(option51, strSupplier52);
        org.apache.commons.cli.Option option54 = null;
        boolean boolean55 = commandLine43.hasOption(option54);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(constantDesc32);
        org.junit.Assert.assertNull(objArray34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(optionItor48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test562");
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
        java.lang.String str22 = commandLine1.getOptionValue('a', "hi!");
        boolean boolean24 = commandLine1.hasOption("hi!");
        java.lang.String str26 = commandLine1.getOptionValue(' ');
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        org.apache.commons.cli.Option option30 = null;
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        java.lang.String str32 = commandLine29.getOptionValue(option30, strSupplier31);
        org.apache.commons.cli.Option option33 = null;
        java.lang.constant.Constable[] constableArray40 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray41 = commandLine29.getParsedOptionValues(option33, constableArray40);
        org.apache.commons.cli.OptionGroup optionGroup42 = null;
        java.lang.String str43 = commandLine29.getOptionValue(optionGroup42);
        java.lang.CharSequence charSequence46 = commandLine29.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj48 = commandLine29.getOptionObject("hi!");
        java.lang.String[] strArray49 = commandLine29.getArgs();
        java.lang.constant.Constable[] constableArray50 = commandLine1.getParsedOptionValues('a', (java.lang.constant.Constable[]) strArray49);
        java.lang.String str52 = commandLine1.getOptionValue("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + charSequence46 + "' != '" + "" + "'", charSequence46, "");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertArrayEquals(constableArray50, new java.lang.String[] {});
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test563");
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
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[] wildcardClassOfFieldArray23 = commandLine1.getParsedOptionValues('#');
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
        org.junit.Assert.assertNull(wildcardClassOfFieldArray23);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test564");
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
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.Option option31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine30.getOptionValue(option31, strSupplier32);
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        java.lang.String str36 = commandLine30.getOptionValue(optionGroup34, "");
        org.apache.commons.cli.Option option37 = null;
        java.lang.String[] strArray38 = commandLine30.getOptionValues(option37);
        org.apache.commons.cli.CommandLine.Builder builder40 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine41 = builder40.get();
        java.lang.constant.ConstantDesc constantDesc43 = null;
        java.lang.constant.ConstantDesc constantDesc44 = commandLine41.getParsedOptionValue('a', constantDesc43);
        java.lang.Object[] objArray46 = commandLine41.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option47 = null;
        org.apache.commons.cli.CommandLine.Builder builder48 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer49 = null;
        org.apache.commons.cli.CommandLine.Builder builder50 = builder48.setDeprecatedHandler(optionConsumer49);
        org.apache.commons.cli.CommandLine commandLine51 = commandLine41.getParsedOptionValue(option47, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        org.apache.commons.cli.Option option52 = null;
        org.apache.commons.cli.CommandLine.Builder builder53 = builder48.addOption(option52);
        org.apache.commons.cli.CommandLine commandLine54 = commandLine30.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        org.apache.commons.cli.CommandLine commandLine55 = builder48.get();
        org.apache.commons.cli.CommandLine commandLine56 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        int int58 = commandLine56.getOptionCount("hi!");
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray60 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray61 = commandLine56.getParsedOptionValues('4', objMapArray60);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNull(constantDesc44);
        org.junit.Assert.assertNull(objArray46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(objMapArray61);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test565");
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
        org.apache.commons.cli.Option option77 = null;
        int int78 = commandLine1.getOptionCount(option77);
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test566");
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
        org.apache.commons.cli.Option option26 = null;
        int int27 = commandLine1.getOptionCount(option26);
        java.lang.Cloneable[][] cloneableArray29 = commandLine1.getParsedOptionValues("");
        int int31 = commandLine1.getOptionCount("");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(cloneableArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test567");
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
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        java.lang.String str25 = commandLine1.getOptionValue(optionGroup24);
        org.apache.commons.cli.Option option26 = null;
        java.lang.String[] strArray27 = commandLine1.getOptionValues(option26);
        org.apache.commons.cli.Option option28 = null;
        int int29 = commandLine1.getOptionCount(option28);
        java.lang.String str32 = commandLine1.getOptionValue("", "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test568");
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
        boolean boolean22 = commandLine1.hasOption("");
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        java.lang.String str25 = commandLine1.getOptionValue(optionGroup23, "");
        org.apache.commons.cli.CommandLine.Builder builder27 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine28 = builder27.get();
        java.lang.constant.ConstantDesc constantDesc30 = null;
        java.lang.constant.ConstantDesc constantDesc31 = commandLine28.getParsedOptionValue('a', constantDesc30);
        java.lang.Object[] objArray33 = commandLine28.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option34 = null;
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer36 = null;
        org.apache.commons.cli.CommandLine.Builder builder37 = builder35.setDeprecatedHandler(optionConsumer36);
        org.apache.commons.cli.CommandLine commandLine38 = commandLine28.getParsedOptionValue(option34, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder35);
        java.lang.String[] strArray40 = commandLine38.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder42 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine43 = builder42.get();
        java.lang.constant.ConstantDesc constantDesc45 = null;
        java.lang.constant.ConstantDesc constantDesc46 = commandLine43.getParsedOptionValue('a', constantDesc45);
        java.lang.Object[] objArray48 = commandLine43.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option49 = null;
        org.apache.commons.cli.CommandLine.Builder builder50 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer51 = null;
        org.apache.commons.cli.CommandLine.Builder builder52 = builder50.setDeprecatedHandler(optionConsumer51);
        org.apache.commons.cli.CommandLine commandLine53 = commandLine43.getParsedOptionValue(option49, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder50);
        org.apache.commons.cli.Option option54 = null;
        org.apache.commons.cli.CommandLine.Builder builder55 = builder50.addOption(option54);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer56 = null;
        org.apache.commons.cli.CommandLine.Builder builder57 = builder50.setDeprecatedHandler(optionConsumer56);
        org.apache.commons.cli.CommandLine commandLine58 = commandLine38.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder50);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer59 = null;
        org.apache.commons.cli.CommandLine.Builder builder60 = builder50.setDeprecatedHandler(optionConsumer59);
        org.apache.commons.cli.CommandLine commandLine61 = commandLine1.getParsedOptionValue('a', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder60);
        org.apache.commons.cli.CommandLine.Builder builder63 = builder60.addArg("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNull(constantDesc31);
        org.junit.Assert.assertNull(objArray33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNull(constantDesc46);
        org.junit.Assert.assertNull(objArray48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test569");
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
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        org.apache.commons.cli.CommandLine commandLine20 = builder18.build();
        org.apache.commons.cli.OptionGroup optionGroup21 = null;
        java.lang.String[] strArray22 = commandLine20.getOptionValues(optionGroup21);
        java.lang.String[] strArray23 = commandLine20.getArgs();
        org.apache.commons.cli.Option option24 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray25 = commandLine20.getParsedOptionValues(option24);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField27 = commandLine20.getParsedOptionValue("");
        java.lang.String str29 = commandLine20.getOptionValue("hi!");
        java.lang.String[] strArray31 = commandLine20.getOptionValues("hi!");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray36 };
        java.lang.String[][] strArray38 = commandLine20.getParsedOptionValues("", strArray37);
        java.lang.constant.ConstantDesc[][] constantDescArray39 = commandLine14.getParsedOptionValues("hi!", (java.lang.constant.ConstantDesc[][]) strArray37);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray25);
        org.junit.Assert.assertNull(wildcardClassOfField27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(constantDescArray39);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test570");
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
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        org.apache.commons.cli.CommandLine.Builder builder16 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine17 = builder16.get();
        org.apache.commons.cli.CommandLine commandLine18 = builder16.build();
        org.apache.commons.cli.CommandLine commandLine19 = commandLine1.getParsedOptionValue(optionGroup15, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(commandLineArray14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(commandLine19);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test571");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.String[] strArray10 = commandLine2.getOptionValues('#');
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.lang.CharSequence[] charSequenceArray12 = commandLine2.getParsedOptionValues(optionGroup11);
        java.lang.constant.Constable constable15 = commandLine2.getParsedOptionValue("hi!", (java.lang.constant.Constable) ' ');
        java.lang.Object obj17 = commandLine2.getOptionObject('a');
        boolean boolean19 = commandLine2.hasOption('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(charSequenceArray12);
        org.junit.Assert.assertEquals("'" + constable15 + "' != '" + ' ' + "'", constable15, ' ');
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test572");
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
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        java.util.function.Supplier<java.lang.String> strSupplier16 = null;
        java.lang.String str17 = commandLine1.getOptionValue(optionGroup15, strSupplier16);
        int int19 = commandLine1.getOptionCount('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test573");
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
        org.apache.commons.cli.Option option23 = null;
        java.util.Properties properties24 = commandLine1.getOptionProperties(option23);
        org.apache.commons.cli.Option[][][] optionArray26 = commandLine1.getParsedOptionValues("");
        int int28 = commandLine1.getOptionCount('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(optionArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test574");
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
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][] objMapArray29 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.OptionGroup optionGroup30 = null;
        java.lang.CharSequence charSequence32 = commandLine1.getParsedOptionValue(optionGroup30, (java.lang.CharSequence) "");
        java.util.function.Supplier<java.lang.String> strSupplier34 = null;
        java.lang.String str35 = commandLine1.getOptionValue('#', strSupplier34);
        org.apache.commons.cli.Option option36 = null;
        boolean boolean37 = commandLine1.hasOption(option36);
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[][] commandLineSupplierArray39 = commandLine1.getParsedOptionValues("hi!");
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
        org.junit.Assert.assertNull(objMapArray29);
        org.junit.Assert.assertEquals("'" + charSequence32 + "' != '" + "" + "'", charSequence32, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(commandLineSupplierArray39);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test575");
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
        org.apache.commons.cli.CommandLine.Builder builder22 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer23 = null;
        org.apache.commons.cli.CommandLine.Builder builder24 = builder22.setDeprecatedHandler(optionConsumer23);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = builder22.setDeprecatedHandler(optionConsumer25);
        org.apache.commons.cli.CommandLine commandLine27 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder22);
        java.lang.String str30 = commandLine1.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test576");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.CommandLine.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.CommandLine.Builder builder4 = builder2.addArg("hi!");
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = builder4.setDeprecatedHandler(optionConsumer5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test577");
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
        java.lang.String[] strArray22 = commandLine1.getArgs();
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        boolean boolean24 = commandLine1.hasOption(optionGroup23);
        java.lang.String[] strArray25 = commandLine1.getArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test578");
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
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        org.apache.commons.cli.CommandLine.Builder builder14 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine15 = builder14.get();
        java.lang.constant.ConstantDesc constantDesc17 = null;
        java.lang.constant.ConstantDesc constantDesc18 = commandLine15.getParsedOptionValue('a', constantDesc17);
        java.lang.Object[] objArray20 = commandLine15.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option21 = null;
        org.apache.commons.cli.CommandLine.Builder builder22 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer23 = null;
        org.apache.commons.cli.CommandLine.Builder builder24 = builder22.setDeprecatedHandler(optionConsumer23);
        org.apache.commons.cli.CommandLine commandLine25 = commandLine15.getParsedOptionValue(option21, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder22);
        java.lang.String[] strArray27 = commandLine25.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        java.lang.constant.ConstantDesc constantDesc32 = null;
        java.lang.constant.ConstantDesc constantDesc33 = commandLine30.getParsedOptionValue('a', constantDesc32);
        java.lang.Object[] objArray35 = commandLine30.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option36 = null;
        org.apache.commons.cli.CommandLine.Builder builder37 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer38 = null;
        org.apache.commons.cli.CommandLine.Builder builder39 = builder37.setDeprecatedHandler(optionConsumer38);
        org.apache.commons.cli.CommandLine commandLine40 = commandLine30.getParsedOptionValue(option36, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder37);
        org.apache.commons.cli.Option option41 = null;
        org.apache.commons.cli.CommandLine.Builder builder42 = builder37.addOption(option41);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer43 = null;
        org.apache.commons.cli.CommandLine.Builder builder44 = builder37.setDeprecatedHandler(optionConsumer43);
        org.apache.commons.cli.CommandLine commandLine45 = commandLine25.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder37);
        org.apache.commons.cli.CommandLine commandLine46 = commandLine10.getParsedOptionValue(optionGroup13, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder37);
        java.lang.CharSequence[][][] charSequenceArray48 = commandLine46.getParsedOptionValue("");
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
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(constantDesc33);
        org.junit.Assert.assertNull(objArray35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNull(charSequenceArray48);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test579");
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
        int int29 = commandLine25.getOptionCount('a');
        boolean boolean31 = commandLine25.hasOption("");
        java.lang.Comparable<java.lang.String> strComparable34 = commandLine25.getParsedOptionValue("", (java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + strComparable34 + "' != '" + "hi!" + "'", strComparable34, "hi!");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test580");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        java.lang.String[] strArray15 = commandLine1.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.CommandLine.Builder builder20 = builder17.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine21 = commandLine1.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder20);
        org.apache.commons.cli.CommandLine.Builder builder23 = builder20.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine24 = builder20.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = builder20.setDeprecatedHandler(optionConsumer25);
        org.apache.commons.cli.Option option27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder20.addOption(option27);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test581");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        org.apache.commons.cli.Option option4 = null;
        java.lang.constant.ConstantDesc[] constantDescArray9 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray14 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray19 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray34 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray35 = new java.lang.constant.ConstantDesc[][] { constantDescArray9, constantDescArray14, constantDescArray19, constantDescArray24, constantDescArray29, constantDescArray34 };
        java.lang.constant.ConstantDesc[][] constantDescArray36 = commandLine1.getParsedOptionValues(option4, constantDescArray35);
        org.apache.commons.cli.OptionGroup optionGroup37 = null;
        java.lang.String str39 = commandLine1.getOptionValue(optionGroup37, "hi!");
        java.lang.String[] strArray41 = commandLine1.getOptionValues('4');
        org.apache.commons.cli.CommandLine.Builder builder43 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine44 = builder43.get();
        org.apache.commons.cli.CommandLine.Builder builder46 = builder43.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine47 = builder46.build();
        org.apache.commons.cli.Option option48 = null;
        org.apache.commons.cli.CommandLine.Builder builder49 = builder46.addOption(option48);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer50 = null;
        org.apache.commons.cli.CommandLine.Builder builder51 = builder49.setDeprecatedHandler(optionConsumer50);
        org.apache.commons.cli.CommandLine commandLine52 = commandLine1.getParsedOptionValue(' ', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder49);
        java.util.function.Supplier<java.lang.String> strSupplier54 = null;
        java.lang.String str55 = commandLine52.getOptionValue("hi!", strSupplier54);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(constantDescArray9);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(constantDescArray19);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray35);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(commandLine47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test582");
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
        org.apache.commons.cli.Option option31 = null;
        int int32 = commandLine1.getOptionCount(option31);
        org.apache.commons.cli.Option option33 = null;
        java.lang.String str34 = commandLine1.getOptionValue(option33);
        org.apache.commons.cli.OptionGroup optionGroup35 = null;
        org.apache.commons.cli.CommandLine.Builder builder36 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine37 = builder36.get();
        java.lang.constant.ConstantDesc constantDesc39 = null;
        java.lang.constant.ConstantDesc constantDesc40 = commandLine37.getParsedOptionValue('a', constantDesc39);
        java.lang.Object[] objArray42 = commandLine37.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option43 = null;
        org.apache.commons.cli.CommandLine.Builder builder44 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer45 = null;
        org.apache.commons.cli.CommandLine.Builder builder46 = builder44.setDeprecatedHandler(optionConsumer45);
        org.apache.commons.cli.CommandLine commandLine47 = commandLine37.getParsedOptionValue(option43, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder44);
        java.lang.String[] strArray49 = commandLine47.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder51 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine52 = builder51.get();
        java.lang.constant.ConstantDesc constantDesc54 = null;
        java.lang.constant.ConstantDesc constantDesc55 = commandLine52.getParsedOptionValue('a', constantDesc54);
        java.lang.Object[] objArray57 = commandLine52.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option58 = null;
        org.apache.commons.cli.CommandLine.Builder builder59 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer60 = null;
        org.apache.commons.cli.CommandLine.Builder builder61 = builder59.setDeprecatedHandler(optionConsumer60);
        org.apache.commons.cli.CommandLine commandLine62 = commandLine52.getParsedOptionValue(option58, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder59);
        org.apache.commons.cli.Option option63 = null;
        org.apache.commons.cli.CommandLine.Builder builder64 = builder59.addOption(option63);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer65 = null;
        org.apache.commons.cli.CommandLine.Builder builder66 = builder59.setDeprecatedHandler(optionConsumer65);
        org.apache.commons.cli.CommandLine commandLine67 = commandLine47.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder59);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer68 = null;
        org.apache.commons.cli.CommandLine.Builder builder69 = builder59.setDeprecatedHandler(optionConsumer68);
        org.apache.commons.cli.CommandLine commandLine70 = commandLine1.getParsedOptionValue(optionGroup35, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder59);
        org.apache.commons.cli.CommandLine commandLine71 = builder59.get();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNull(constantDesc40);
        org.junit.Assert.assertNull(objArray42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(commandLine47);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNull(constantDesc55);
        org.junit.Assert.assertNull(objArray57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertNotNull(commandLine71);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test583");
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
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = builder17.setDeprecatedHandler(optionConsumer18);
        org.apache.commons.cli.CommandLine commandLine20 = commandLine1.getParsedOptionValue(' ', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder19);
        java.util.function.Supplier<java.lang.String> strSupplier22 = null;
        java.lang.String str23 = commandLine20.getOptionValue("", strSupplier22);
        org.apache.commons.cli.Option option24 = null;
        java.lang.String str26 = commandLine20.getOptionValue(option24, "");
        org.apache.commons.cli.Option option27 = null;
        int int28 = commandLine20.getOptionCount(option27);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test584");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        org.apache.commons.cli.OptionGroup optionGroup4 = null;
        org.apache.commons.cli.CommandLine.Builder builder5 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine6 = commandLine1.getParsedOptionValue(optionGroup4, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(commandLine6);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test585");
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
        org.apache.commons.cli.CommandLine.Builder builder22 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer23 = null;
        org.apache.commons.cli.CommandLine.Builder builder24 = builder22.setDeprecatedHandler(optionConsumer23);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = builder22.setDeprecatedHandler(optionConsumer25);
        org.apache.commons.cli.CommandLine commandLine27 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder22);
        java.lang.String str30 = commandLine1.getOptionValue("", "");
        org.apache.commons.cli.OptionGroup optionGroup31 = null;
        java.util.List<java.lang.String>[][] strListArray32 = commandLine1.getParsedOptionValues(optionGroup31);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(strListArray32);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test586");
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
        org.apache.commons.cli.CommandLine.Builder builder16 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine17 = builder16.get();
        org.apache.commons.cli.CommandLine commandLine18 = builder16.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = builder16.setDeprecatedHandler(optionConsumer19);
        org.apache.commons.cli.CommandLine commandLine21 = builder16.get();
        org.apache.commons.cli.CommandLine commandLine22 = commandLine11.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder16);
        java.util.Properties properties24 = commandLine22.getOptionProperties("hi!");
        org.apache.commons.cli.Option option25 = null;
        int int26 = commandLine22.getOptionCount(option25);
        java.util.Properties[] propertiesArray28 = commandLine22.getParsedOptionValues("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(propertiesArray28);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test587");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(optionGroup6);
        boolean boolean9 = commandLine1.hasOption("");
        java.lang.String str11 = commandLine1.getOptionValue('a');
        java.lang.String str14 = commandLine1.getOptionValue("", "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test588");
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
        java.lang.String[] strArray20 = commandLine1.getOptionValues('a');
        java.lang.String[] strArray22 = commandLine1.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder24 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine25 = builder24.get();
        org.apache.commons.cli.CommandLine commandLine26 = builder24.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder24.setDeprecatedHandler(optionConsumer27);
        org.apache.commons.cli.CommandLine commandLine29 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder28);
        java.lang.String str32 = commandLine1.getOptionValue('a', "hi!");
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
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test589");
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
        boolean boolean19 = commandLine1.hasOption('a');
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        org.apache.commons.cli.CommandLine.Builder builder21 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine22 = builder21.get();
        org.apache.commons.cli.CommandLine commandLine23 = commandLine1.getParsedOptionValue(optionGroup20, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder21);
        java.util.List<java.lang.String> strList25 = commandLine23.getParsedOptionValue("");
        org.apache.commons.cli.Option option26 = null;
        java.lang.String str28 = commandLine23.getOptionValue(option26, "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNull(typeDescriptorArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test590");
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
        org.apache.commons.cli.Option option26 = null;
        int int27 = commandLine1.getOptionCount(option26);
        java.lang.String[] strArray29 = commandLine1.getOptionValues("");
        java.lang.String str31 = commandLine1.getOptionValue(' ');
        java.util.List<java.lang.String> strList32 = commandLine1.getArgList();
        java.util.List<java.lang.String> strList33 = commandLine1.getArgList();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test591");
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
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        java.lang.String str21 = commandLine1.getOptionValue(optionGroup19, strSupplier20);
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test592");
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
        org.apache.commons.cli.Option option16 = null;
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.Option option19 = null;
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        java.lang.String str21 = commandLine18.getOptionValue(option19, strSupplier20);
        org.apache.commons.cli.OptionGroup optionGroup22 = null;
        java.lang.String str24 = commandLine18.getOptionValue(optionGroup22, "");
        org.apache.commons.cli.Option option25 = null;
        java.lang.String[] strArray26 = commandLine18.getOptionValues(option25);
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        java.lang.constant.ConstantDesc constantDesc31 = null;
        java.lang.constant.ConstantDesc constantDesc32 = commandLine29.getParsedOptionValue('a', constantDesc31);
        java.lang.Object[] objArray34 = commandLine29.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option35 = null;
        org.apache.commons.cli.CommandLine.Builder builder36 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer37 = null;
        org.apache.commons.cli.CommandLine.Builder builder38 = builder36.setDeprecatedHandler(optionConsumer37);
        org.apache.commons.cli.CommandLine commandLine39 = commandLine29.getParsedOptionValue(option35, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.Option option40 = null;
        org.apache.commons.cli.CommandLine.Builder builder41 = builder36.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine42 = commandLine18.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.CommandLine commandLine43 = commandLine1.getParsedOptionValue(option16, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        java.lang.String[] strArray44 = commandLine43.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder46 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine47 = builder46.get();
        org.apache.commons.cli.Option option48 = null;
        java.util.function.Supplier<java.lang.String> strSupplier49 = null;
        java.lang.String str50 = commandLine47.getOptionValue(option48, strSupplier49);
        java.lang.String[] strArray51 = commandLine47.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder53 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer54 = null;
        org.apache.commons.cli.CommandLine.Builder builder55 = builder53.setDeprecatedHandler(optionConsumer54);
        org.apache.commons.cli.CommandLine commandLine56 = commandLine47.getParsedOptionValue('4', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder53);
        org.apache.commons.cli.CommandLine commandLine57 = commandLine43.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder53);
        org.apache.commons.cli.Option option58 = null;
        java.util.Collection<java.lang.String>[][][][] strCollectionArray59 = commandLine57.getParsedOptionValues(option58);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(constantDesc32);
        org.junit.Assert.assertNull(objArray34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(commandLine47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNull(strCollectionArray59);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test593");
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
        java.util.Iterator<org.apache.commons.cli.Option> optionItor32 = commandLine1.iterator();
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
        org.junit.Assert.assertNotNull(optionItor32);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test594");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.String str8 = commandLine1.getOptionValue(option6, "hi!");
        org.apache.commons.cli.OptionGroup optionGroup9 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration10 = commandLine1.getParsedOptionValue(optionGroup9);
        org.apache.commons.cli.CommandLine.Builder builder12 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine13 = builder12.get();
        org.apache.commons.cli.Option option14 = null;
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        java.lang.String str16 = commandLine13.getOptionValue(option14, strSupplier15);
        org.apache.commons.cli.Option option17 = null;
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray25 = commandLine13.getParsedOptionValues(option17, constableArray24);
        org.apache.commons.cli.Option option26 = null;
        java.lang.String[] strArray27 = commandLine13.getOptionValues(option26);
        org.apache.commons.cli.OptionGroup optionGroup28 = null;
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.CommandLine commandLine31 = builder29.build();
        org.apache.commons.cli.OptionGroup optionGroup32 = null;
        java.lang.String[] strArray33 = commandLine31.getOptionValues(optionGroup32);
        java.lang.String[] strArray34 = commandLine31.getArgs();
        org.apache.commons.cli.Option option35 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray36 = commandLine31.getParsedOptionValues(option35);
        org.apache.commons.cli.OptionGroup optionGroup37 = null;
        org.apache.commons.cli.CommandLine.Builder builder38 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine39 = builder38.get();
        java.lang.String[] strArray41 = commandLine39.getOptionValues('a');
        java.lang.String str43 = commandLine39.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine46 = builder45.get();
        org.apache.commons.cli.Option option47 = null;
        java.util.function.Supplier<java.lang.String> strSupplier48 = null;
        java.lang.String str49 = commandLine46.getOptionValue(option47, strSupplier48);
        java.lang.String[] strArray50 = commandLine46.getArgs();
        org.apache.commons.cli.Option option51 = null;
        java.lang.String[] strArray52 = commandLine46.getOptionValues(option51);
        java.util.Properties[] propertiesArray54 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray55 = commandLine46.getParsedOptionValues(' ', propertiesArray54);
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray56 = commandLine39.getParsedOptionValue(optionGroup44, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) propertiesArray55);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray57 = commandLine31.getParsedOptionValues(optionGroup37, (java.util.Map<java.lang.Object, java.lang.Object>[]) objMapArray56);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray58 = commandLine13.getParsedOptionValue(optionGroup28, objMapArray57);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        java.lang.Class[] classArray64 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        java.lang.Class[] classArray67 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        java.lang.Class[][] classArray70 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray71 = (java.lang.Class<?>[][]) classArray70;
        wildcardClassArray71[0] = classArray61;
        wildcardClassArray71[1] = wildcardClassArray65;
        wildcardClassArray71[2] = classArray67;
        java.lang.Class<?>[][] wildcardClassArray78 = commandLine13.getParsedOptionValues("hi!", wildcardClassArray71);
        java.lang.invoke.TypeDescriptor[][] typeDescriptorArray79 = commandLine1.getParsedOptionValues("", (java.lang.invoke.TypeDescriptor[][]) wildcardClassArray78);
        java.lang.String[] strArray81 = commandLine1.getOptionValues('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(genericDeclaration10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(propertiesArray54);
        org.junit.Assert.assertArrayEquals(propertiesArray54, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray55);
        org.junit.Assert.assertArrayEquals(propertiesArray55, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray56);
        org.junit.Assert.assertArrayEquals(objMapArray56, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray57);
        org.junit.Assert.assertArrayEquals(objMapArray57, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray58);
        org.junit.Assert.assertArrayEquals(objMapArray58, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertArrayEquals(classArray61, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertArrayEquals(classArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertArrayEquals(classArray67, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertArrayEquals(wildcardClassArray68, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(typeDescriptorArray79);
        org.junit.Assert.assertNull(strArray81);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test595");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        java.lang.Object obj7 = commandLine1.getOptionObject("");
        org.apache.commons.cli.Option option8 = null;
        int int9 = commandLine1.getOptionCount(option8);
        boolean boolean11 = commandLine1.hasOption(' ');
        org.apache.commons.cli.CommandLine.Builder builder13 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine14 = builder13.get();
        org.apache.commons.cli.Option option15 = null;
        java.util.function.Supplier<java.lang.String> strSupplier16 = null;
        java.lang.String str17 = commandLine14.getOptionValue(option15, strSupplier16);
        org.apache.commons.cli.Option option18 = null;
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray26 = commandLine14.getParsedOptionValues(option18, constableArray25);
        org.apache.commons.cli.OptionGroup optionGroup27 = null;
        java.lang.String str28 = commandLine14.getOptionValue(optionGroup27);
        java.lang.CharSequence charSequence31 = commandLine14.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj33 = commandLine14.getOptionObject("hi!");
        int int35 = commandLine14.getOptionCount("");
        org.apache.commons.cli.CommandLine.Builder[] builderArray37 = commandLine14.getParsedOptionValues("");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[][] strArray81 = new java.lang.String[][] { strArray45, strArray52, strArray59, strArray66, strArray73, strArray80 };
        java.lang.String[][] strArray82 = commandLine14.getParsedOptionValues('a', strArray81);
        java.lang.constant.ConstantDesc[][] constantDescArray83 = commandLine1.getParsedOptionValue(' ', (java.lang.constant.ConstantDesc[][]) strArray82);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + charSequence31 + "' != '" + "" + "'", charSequence31, "");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(builderArray37);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(constantDescArray83);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test596");
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
        java.lang.String str33 = commandLine1.getParsedOptionValue("", "");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test597");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.Option option3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine5 = builder0.build();
        org.apache.commons.cli.Option option6 = null;
        java.lang.constant.Constable[] constableArray7 = commandLine5.getParsedOptionValues(option6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(commandLine5);
        org.junit.Assert.assertNull(constableArray7);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test598");
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
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.lang.String[][] strArray12 = commandLine2.getParsedOptionValues(optionGroup11);
        org.apache.commons.cli.Option option13 = null;
        java.lang.String[] strArray14 = commandLine2.getOptionValues(option13);
        java.lang.String[] strArray16 = commandLine2.getOptionValues('4');
        org.apache.commons.cli.Option option17 = null;
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        org.apache.commons.cli.Option option20 = null;
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        java.lang.String str22 = commandLine19.getOptionValue(option20, strSupplier21);
        org.apache.commons.cli.Option option23 = null;
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray31 = commandLine19.getParsedOptionValues(option23, constableArray30);
        org.apache.commons.cli.Option option32 = null;
        java.lang.String[] strArray33 = commandLine19.getOptionValues(option32);
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        boolean boolean35 = commandLine19.hasOption(optionGroup34);
        org.apache.commons.cli.Option option36 = null;
        java.util.function.Supplier<java.lang.String> strSupplier37 = null;
        java.lang.String str38 = commandLine19.getOptionValue(option36, strSupplier37);
        org.apache.commons.cli.Option option39 = null;
        java.util.function.Supplier<java.lang.String> strSupplier40 = null;
        java.lang.String str41 = commandLine19.getOptionValue(option39, strSupplier40);
        org.apache.commons.cli.OptionGroup optionGroup42 = null;
        java.lang.String str43 = commandLine19.getOptionValue(optionGroup42);
        org.apache.commons.cli.OptionGroup optionGroup44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine46 = builder45.get();
        java.lang.constant.ConstantDesc constantDesc48 = null;
        java.lang.constant.ConstantDesc constantDesc49 = commandLine46.getParsedOptionValue('a', constantDesc48);
        java.lang.String str52 = commandLine46.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option53 = null;
        org.apache.commons.cli.CommandLine.Builder builder54 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine55 = builder54.get();
        org.apache.commons.cli.CommandLine commandLine56 = commandLine46.getParsedOptionValue(option53, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.CommandLine commandLine57 = commandLine19.getParsedOptionValue(optionGroup44, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.CommandLine commandLine58 = commandLine2.getParsedOptionValue(option17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.Option option59 = null;
        java.util.Properties properties60 = commandLine58.getOptionProperties(option59);
        java.lang.String[] strArray62 = commandLine58.getOptionValues('#');
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
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNull(constantDesc49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertNull(strArray62);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test599");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.CommandLine commandLine5 = builder0.get();
        org.apache.commons.cli.CommandLine.Builder builder7 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine8 = builder7.get();
        org.apache.commons.cli.Option option9 = null;
        java.util.function.Supplier<java.lang.String> strSupplier10 = null;
        java.lang.String str11 = commandLine8.getOptionValue(option9, strSupplier10);
        org.apache.commons.cli.Option option12 = null;
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray20 = commandLine8.getParsedOptionValues(option12, constableArray19);
        org.apache.commons.cli.Option option21 = null;
        java.lang.String[] strArray22 = commandLine8.getOptionValues(option21);
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        boolean boolean24 = commandLine8.hasOption(optionGroup23);
        org.apache.commons.cli.Option option25 = null;
        java.util.function.Supplier<java.lang.String> strSupplier26 = null;
        java.lang.String str27 = commandLine8.getOptionValue(option25, strSupplier26);
        org.apache.commons.cli.Option option28 = null;
        java.util.function.Supplier<java.lang.String> strSupplier29 = null;
        java.lang.String str30 = commandLine8.getOptionValue(option28, strSupplier29);
        java.lang.String str33 = commandLine8.getOptionValue("hi!", "");
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine36 = builder35.get();
        org.apache.commons.cli.Option option37 = null;
        java.util.function.Supplier<java.lang.String> strSupplier38 = null;
        java.lang.String str39 = commandLine36.getOptionValue(option37, strSupplier38);
        org.apache.commons.cli.Option option40 = null;
        java.lang.constant.Constable[] constableArray47 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray48 = commandLine36.getParsedOptionValues(option40, constableArray47);
        java.lang.String[] strArray50 = commandLine36.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder52 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine53 = builder52.get();
        org.apache.commons.cli.CommandLine.Builder builder55 = builder52.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine56 = commandLine36.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder55);
        org.apache.commons.cli.CommandLine.Builder builder58 = builder55.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine59 = commandLine8.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder55);
        org.apache.commons.cli.CommandLine commandLine60 = commandLine5.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder55);
        org.apache.commons.cli.Option option61 = null;
        java.lang.String str62 = commandLine60.getOptionValue(option61);
        int int64 = commandLine60.getOptionCount("");
        org.apache.commons.cli.CommandLine.Builder builder66 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine67 = builder66.get();
        org.apache.commons.cli.Option option68 = null;
        java.util.function.Supplier<java.lang.String> strSupplier69 = null;
        java.lang.String str70 = commandLine67.getOptionValue(option68, strSupplier69);
        org.apache.commons.cli.Option option71 = null;
        org.apache.commons.cli.CommandLine.Builder builder72 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer73 = null;
        org.apache.commons.cli.CommandLine.Builder builder74 = builder72.setDeprecatedHandler(optionConsumer73);
        java.lang.Class<?> wildcardClass75 = builder74.getClass();
        java.lang.Class<?> wildcardClass76 = commandLine67.getParsedOptionValue(option71, wildcardClass75);
        java.lang.String[] strArray77 = commandLine67.getArgs();
        org.apache.commons.cli.Option option78 = null;
        org.apache.commons.cli.CommandLine.Builder builder79 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer80 = null;
        org.apache.commons.cli.CommandLine.Builder builder81 = builder79.setDeprecatedHandler(optionConsumer80);
        org.apache.commons.cli.CommandLine commandLine82 = commandLine67.getParsedOptionValue(option78, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder81);
        org.apache.commons.cli.OptionGroup optionGroup83 = null;
        java.lang.String str84 = commandLine82.getOptionValue(optionGroup83);
        org.apache.commons.cli.Option option85 = null;
        int int86 = commandLine82.getOptionCount(option85);
        java.lang.String[] strArray87 = commandLine82.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder89 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine90 = builder89.get();
        org.apache.commons.cli.CommandLine commandLine91 = commandLine82.getParsedOptionValue('a', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder89);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer92 = null;
        org.apache.commons.cli.CommandLine.Builder builder93 = builder89.setDeprecatedHandler(optionConsumer92);
        org.apache.commons.cli.CommandLine commandLine94 = commandLine60.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder89);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(commandLine5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(commandLine59);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(commandLine91);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(commandLine94);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test600");
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
        org.apache.commons.cli.OptionGroup optionGroup24 = null;
        org.apache.commons.cli.CommandLine.Builder builder25 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine26 = builder25.get();
        org.apache.commons.cli.CommandLine commandLine27 = commandLine1.getParsedOptionValue(optionGroup24, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder25);
        org.apache.commons.cli.OptionGroup optionGroup28 = null;
        boolean boolean29 = commandLine1.hasOption(optionGroup28);
        java.util.List<java.lang.String> strList30 = commandLine1.getArgList();
        org.apache.commons.cli.Option[] optionArray31 = commandLine1.getOptions();
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(optionArray31);
        org.junit.Assert.assertArrayEquals(optionArray31, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test601");
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
        org.apache.commons.cli.CommandLine.Builder[] builderArray24 = commandLine1.getParsedOptionValues("");
        int int26 = commandLine1.getOptionCount("hi!");
        org.apache.commons.cli.Option option27 = null;
        java.lang.CharSequence charSequence29 = commandLine1.getParsedOptionValue(option27, (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(builderArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + charSequence29 + "' != '" + "hi!" + "'", charSequence29, "hi!");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test602");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.CommandLine commandLine3 = builder0.get();
        org.apache.commons.cli.CommandLine.Builder builder5 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine6 = builder5.get();
        org.apache.commons.cli.CommandLine.Builder builder8 = builder5.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine9 = commandLine3.getParsedOptionValue('a', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder8);
        org.apache.commons.cli.OptionGroup optionGroup10 = null;
        org.apache.commons.cli.CommandLine.Builder builder11 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine12 = builder11.get();
        org.apache.commons.cli.CommandLine commandLine13 = builder11.build();
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String[] strArray15 = commandLine13.getOptionValues(optionGroup14);
        java.lang.String[] strArray16 = commandLine13.getArgs();
        org.apache.commons.cli.Option option17 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray18 = commandLine13.getParsedOptionValues(option17);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField20 = commandLine13.getParsedOptionValue("");
        java.lang.String[] strArray21 = commandLine13.getArgs();
        java.io.Serializable[] serializableArray22 = commandLine9.getParsedOptionValue(optionGroup10, (java.io.Serializable[]) strArray21);
        org.apache.commons.cli.Option option23 = null;
        int int24 = commandLine9.getOptionCount(option23);
        java.lang.String[] strArray26 = commandLine9.getOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(commandLine3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray18);
        org.junit.Assert.assertNull(wildcardClassOfField20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(serializableArray22);
        org.junit.Assert.assertArrayEquals(serializableArray22, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test603");
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
        org.apache.commons.cli.Option option11 = null;
        java.lang.String[] strArray12 = commandLine2.getOptionValues(option11);
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
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test604");
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
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray29 = commandLine1.getParsedOptionValues('4');
        org.apache.commons.cli.CommandLine.Builder builder31 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine32 = builder31.get();
        org.apache.commons.cli.CommandLine commandLine33 = builder31.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer34 = null;
        org.apache.commons.cli.CommandLine.Builder builder35 = builder31.setDeprecatedHandler(optionConsumer34);
        org.apache.commons.cli.CommandLine commandLine36 = builder31.get();
        org.apache.commons.cli.CommandLine commandLine37 = builder31.get();
        org.apache.commons.cli.CommandLine commandLine38 = commandLine1.getParsedOptionValue(' ', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder31);
        boolean boolean40 = commandLine38.hasOption("");
        java.lang.String str43 = commandLine38.getOptionValue('4', "");
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
        org.junit.Assert.assertNull(typeDescriptorArray29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test605");
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
        org.apache.commons.cli.OptionGroup optionGroup56 = null;
        boolean boolean57 = commandLine1.hasOption(optionGroup56);
        java.util.List<java.lang.String> strList58 = commandLine1.getArgList();
        int int60 = commandLine1.getOptionCount("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test606");
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
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        org.apache.commons.cli.CommandLine.Builder builder16 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine17 = builder16.get();
        org.apache.commons.cli.Option option18 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap19 = commandLine17.getParsedOptionValue(option18);
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        java.util.Hashtable[] hashtableArray22 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray23 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray22;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray24 = commandLine17.getParsedOptionValues(optionGroup20, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray22);
        boolean boolean26 = commandLine17.hasOption('a');
        java.lang.Object obj27 = commandLine14.getParsedOptionValue(optionGroup15, (java.lang.Object) boolean26);
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.Option option31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine30.getOptionValue(option31, strSupplier32);
        org.apache.commons.cli.Option option34 = null;
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray42 = commandLine30.getParsedOptionValues(option34, constableArray41);
        org.apache.commons.cli.Option[] optionArray43 = commandLine30.getOptions();
        org.apache.commons.cli.Option option44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine46 = builder45.get();
        org.apache.commons.cli.CommandLine.Builder builder48 = builder45.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine49 = builder48.build();
        org.apache.commons.cli.Option option50 = null;
        org.apache.commons.cli.CommandLine.Builder builder51 = builder48.addOption(option50);
        org.apache.commons.cli.CommandLine commandLine52 = builder51.get();
        org.apache.commons.cli.CommandLine commandLine53 = commandLine30.getParsedOptionValue(option44, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder51);
        org.apache.commons.cli.CommandLine commandLine54 = commandLine14.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder51);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNull(objMap19);
        org.junit.Assert.assertNotNull(hashtableArray22);
        org.junit.Assert.assertArrayEquals(hashtableArray22, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray23);
        org.junit.Assert.assertArrayEquals(objMapArray23, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray24);
        org.junit.Assert.assertArrayEquals(objMapArray24, new java.util.Hashtable[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(optionArray43);
        org.junit.Assert.assertArrayEquals(optionArray43, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(commandLine54);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test607");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine.Builder builder3 = builder0.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine4 = builder0.build();
        org.apache.commons.cli.CommandLine.Builder builder6 = builder0.addArg("hi!");
        org.apache.commons.cli.CommandLine.Builder builder8 = builder6.addArg("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(commandLine4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test608");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.util.Properties properties7 = commandLine2.getOptionProperties("");
        java.lang.Cloneable[] cloneableArray9 = commandLine2.getParsedOptionValues("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(cloneableArray9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test609");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue("");
        int int11 = commandLine1.getOptionCount("");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray13 = commandLine1.getParsedOptionValues("");
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.invoke.TypeDescriptor[][] typeDescriptorArray15 = commandLine1.getParsedOptionValues(optionGroup14);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(annotatedElementArray13);
        org.junit.Assert.assertNull(typeDescriptorArray15);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test610");
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
        org.apache.commons.cli.OptionGroup optionGroup57 = null;
        java.lang.Class<?>[][] wildcardClassArray58 = commandLine1.getParsedOptionValues(optionGroup57);
        org.apache.commons.cli.OptionGroup optionGroup59 = null;
        java.lang.String str61 = commandLine1.getOptionValue(optionGroup59, "hi!");
        org.apache.commons.cli.CommandLine.Builder builder63 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine64 = builder63.get();
        java.lang.String[] strArray66 = commandLine64.getOptionValues('a');
        java.lang.String str68 = commandLine64.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup69 = null;
        java.lang.String[] strArray70 = commandLine64.getOptionValues(optionGroup69);
        int int72 = commandLine64.getOptionCount("hi!");
        org.apache.commons.cli.OptionGroup optionGroup73 = null;
        boolean boolean74 = commandLine64.hasOption(optionGroup73);
        org.apache.commons.cli.CommandLine.Builder builder76 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine77 = builder76.get();
        java.lang.constant.ConstantDesc constantDesc79 = null;
        java.lang.constant.ConstantDesc constantDesc80 = commandLine77.getParsedOptionValue('a', constantDesc79);
        java.lang.Object[] objArray82 = commandLine77.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option83 = null;
        org.apache.commons.cli.CommandLine.Builder builder84 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer85 = null;
        org.apache.commons.cli.CommandLine.Builder builder86 = builder84.setDeprecatedHandler(optionConsumer85);
        org.apache.commons.cli.CommandLine commandLine87 = commandLine77.getParsedOptionValue(option83, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder84);
        org.apache.commons.cli.Option option88 = null;
        org.apache.commons.cli.CommandLine.Builder builder89 = builder84.addOption(option88);
        org.apache.commons.cli.CommandLine commandLine90 = commandLine64.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder84);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer91 = null;
        org.apache.commons.cli.CommandLine.Builder builder92 = builder84.setDeprecatedHandler(optionConsumer91);
        org.apache.commons.cli.CommandLine commandLine93 = commandLine1.getParsedOptionValue('#', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder92);
        org.apache.commons.cli.Option option94 = null;
        boolean boolean95 = commandLine1.hasOption(option94);
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
        org.junit.Assert.assertNull(wildcardClassArray58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(strArray70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(commandLine77);
        org.junit.Assert.assertNull(constantDesc80);
        org.junit.Assert.assertNull(objArray82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test611");
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
        int int28 = commandLine1.getOptionCount(' ');
        java.lang.Object obj30 = commandLine1.getOptionObject('a');
        org.apache.commons.cli.OptionGroup optionGroup31 = null;
        java.lang.String str32 = commandLine1.getOptionValue(optionGroup31);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test612");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option[] optionArray14 = commandLine1.getOptions();
        java.util.Iterator<org.apache.commons.cli.Option> optionItor15 = commandLine1.iterator();
        java.lang.constant.Constable[] constableArray20 = new java.lang.constant.Constable[] { 1.0f, (short) 100, (-1.0f) };
        java.lang.constant.Constable[] constableArray21 = commandLine1.getParsedOptionValue("", constableArray20);
        int int23 = commandLine1.getOptionCount("");
        java.lang.String str25 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup26 = null;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine> commandLineSupplier27 = commandLine1.getParsedOptionValue(optionGroup26);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionItor15);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(commandLineSupplier27);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test613");
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
        org.apache.commons.cli.Option option90 = null;
        java.lang.constant.ConstantDesc[][] constantDescArray91 = commandLine12.getParsedOptionValues(option90);
        java.lang.Class<?>[][] wildcardClassArray93 = commandLine12.getParsedOptionValue(' ');
        java.lang.Object obj95 = commandLine12.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(constantDescArray91);
        org.junit.Assert.assertNull(wildcardClassArray93);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test614");
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
        org.apache.commons.cli.CommandLine.Builder builder14 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine15 = commandLine1.getParsedOptionValue('#', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder14);
        java.lang.String str17 = commandLine1.getOptionValue('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(genericDeclarationArray12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test615");
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
        int int13 = commandLine1.getOptionCount("hi!");
        java.lang.Object obj15 = commandLine1.getOptionObject("");
        java.util.Properties[] propertiesArray17 = commandLine1.getParsedOptionValue('#');
        org.apache.commons.cli.Option[] optionArray18 = commandLine1.getOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(propertiesArray17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test616");
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
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.Option option31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine30.getOptionValue(option31, strSupplier32);
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        java.lang.String str36 = commandLine30.getOptionValue(optionGroup34, "");
        org.apache.commons.cli.Option option37 = null;
        java.lang.String[] strArray38 = commandLine30.getOptionValues(option37);
        org.apache.commons.cli.CommandLine.Builder builder40 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine41 = builder40.get();
        java.lang.constant.ConstantDesc constantDesc43 = null;
        java.lang.constant.ConstantDesc constantDesc44 = commandLine41.getParsedOptionValue('a', constantDesc43);
        java.lang.Object[] objArray46 = commandLine41.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option47 = null;
        org.apache.commons.cli.CommandLine.Builder builder48 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer49 = null;
        org.apache.commons.cli.CommandLine.Builder builder50 = builder48.setDeprecatedHandler(optionConsumer49);
        org.apache.commons.cli.CommandLine commandLine51 = commandLine41.getParsedOptionValue(option47, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        org.apache.commons.cli.Option option52 = null;
        org.apache.commons.cli.CommandLine.Builder builder53 = builder48.addOption(option52);
        org.apache.commons.cli.CommandLine commandLine54 = commandLine30.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        org.apache.commons.cli.CommandLine commandLine55 = builder48.get();
        org.apache.commons.cli.CommandLine commandLine56 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder48);
        org.apache.commons.cli.OptionGroup optionGroup57 = null;
        java.lang.constant.Constable[] constableArray58 = commandLine1.getParsedOptionValues(optionGroup57);
        org.apache.commons.cli.Option option59 = null;
        org.apache.commons.cli.CommandLine.Builder builder60 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine61 = builder60.get();
        org.apache.commons.cli.Option option62 = null;
        java.util.function.Supplier<java.lang.String> strSupplier63 = null;
        java.lang.String str64 = commandLine61.getOptionValue(option62, strSupplier63);
        java.lang.String[] strArray65 = commandLine61.getArgs();
        org.apache.commons.cli.Option option66 = null;
        java.lang.String[] strArray67 = commandLine61.getOptionValues(option66);
        java.util.Properties[] propertiesArray69 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray70 = commandLine61.getParsedOptionValues(' ', propertiesArray69);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray71 = commandLine1.getParsedOptionValues(option59, (java.util.Map<java.lang.Object, java.lang.Object>[]) propertiesArray70);
        java.lang.String[] strArray72 = commandLine1.getArgs();
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNull(constantDesc44);
        org.junit.Assert.assertNull(objArray46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNull(constableArray58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray67);
        org.junit.Assert.assertNotNull(propertiesArray69);
        org.junit.Assert.assertArrayEquals(propertiesArray69, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray70);
        org.junit.Assert.assertArrayEquals(propertiesArray70, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray71);
        org.junit.Assert.assertArrayEquals(objMapArray71, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] {});
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test617");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.CommandLine.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.CommandLine commandLine3 = builder0.build();
        java.lang.String[] strArray5 = commandLine3.getOptionValues("hi!");
        boolean boolean7 = commandLine3.hasOption('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(commandLine3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test618");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        org.apache.commons.cli.Option[] optionArray14 = commandLine1.getOptions();
        org.apache.commons.cli.CommandLine.Builder builder16 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine17 = builder16.get();
        org.apache.commons.cli.Option option18 = null;
        java.util.function.Supplier<java.lang.String> strSupplier19 = null;
        java.lang.String str20 = commandLine17.getOptionValue(option18, strSupplier19);
        org.apache.commons.cli.Option option21 = null;
        java.lang.constant.Constable[] constableArray28 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray29 = commandLine17.getParsedOptionValues(option21, constableArray28);
        org.apache.commons.cli.Option[] optionArray30 = commandLine17.getOptions();
        java.util.List<java.lang.String> strList31 = commandLine17.getArgList();
        boolean boolean33 = commandLine17.hasOption("");
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine36 = builder35.get();
        java.lang.constant.ConstantDesc constantDesc38 = null;
        java.lang.constant.ConstantDesc constantDesc39 = commandLine36.getParsedOptionValue('a', constantDesc38);
        java.lang.String str42 = commandLine36.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option43 = null;
        org.apache.commons.cli.CommandLine.Builder builder44 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer45 = null;
        org.apache.commons.cli.CommandLine.Builder builder46 = builder44.setDeprecatedHandler(optionConsumer45);
        org.apache.commons.cli.CommandLine commandLine47 = commandLine36.getParsedOptionValue(option43, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder44);
        org.apache.commons.cli.Option[] optionArray48 = commandLine36.getOptions();
        org.apache.commons.cli.CommandLine.Builder[] builderArray50 = new org.apache.commons.cli.CommandLine.Builder[] {};
        org.apache.commons.cli.CommandLine.Builder[] builderArray51 = commandLine36.getParsedOptionValues('a', builderArray50);
        org.apache.commons.cli.CommandLine.Builder[] builderArray52 = commandLine17.getParsedOptionValue(optionGroup34, builderArray50);
        org.apache.commons.cli.CommandLine.Builder[] builderArray53 = commandLine1.getParsedOptionValues('4', builderArray50);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(optionArray30);
        org.junit.Assert.assertArrayEquals(optionArray30, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(constantDesc39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(commandLine47);
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertArrayEquals(optionArray48, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(builderArray50);
        org.junit.Assert.assertArrayEquals(builderArray50, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(builderArray51);
        org.junit.Assert.assertArrayEquals(builderArray51, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(builderArray52);
        org.junit.Assert.assertArrayEquals(builderArray52, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(builderArray53);
        org.junit.Assert.assertArrayEquals(builderArray53, new org.apache.commons.cli.CommandLine.Builder[] {});
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test619");
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
        java.lang.String[] strArray13 = commandLine11.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder15 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine16 = builder15.get();
        java.lang.constant.ConstantDesc constantDesc18 = null;
        java.lang.constant.ConstantDesc constantDesc19 = commandLine16.getParsedOptionValue('a', constantDesc18);
        java.lang.Object[] objArray21 = commandLine16.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option22 = null;
        org.apache.commons.cli.CommandLine.Builder builder23 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer24 = null;
        org.apache.commons.cli.CommandLine.Builder builder25 = builder23.setDeprecatedHandler(optionConsumer24);
        org.apache.commons.cli.CommandLine commandLine26 = commandLine16.getParsedOptionValue(option22, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder23);
        org.apache.commons.cli.Option option27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder23.addOption(option27);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer29 = null;
        org.apache.commons.cli.CommandLine.Builder builder30 = builder23.setDeprecatedHandler(optionConsumer29);
        org.apache.commons.cli.CommandLine commandLine31 = commandLine11.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder23);
        java.lang.String str33 = commandLine11.getOptionValue('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test620");
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
        java.lang.constant.ConstantDesc constantDesc14 = commandLine12.getParsedOptionValue(' ');
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray16 = commandLine12.getParsedOptionValues(optionGroup15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNull(constantDesc14);
        org.junit.Assert.assertNull(commandLineSupplierArray16);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test621");
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
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.CommandLine commandLine19 = builder17.build();
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        java.lang.String[] strArray21 = commandLine19.getOptionValues(optionGroup20);
        java.lang.String[] strArray22 = commandLine19.getArgs();
        org.apache.commons.cli.Option option23 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray24 = commandLine19.getParsedOptionValues(option23);
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine27 = builder26.get();
        java.lang.String[] strArray29 = commandLine27.getOptionValues('a');
        java.lang.String str31 = commandLine27.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup32 = null;
        org.apache.commons.cli.CommandLine.Builder builder33 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine34 = builder33.get();
        org.apache.commons.cli.Option option35 = null;
        java.util.function.Supplier<java.lang.String> strSupplier36 = null;
        java.lang.String str37 = commandLine34.getOptionValue(option35, strSupplier36);
        java.lang.String[] strArray38 = commandLine34.getArgs();
        org.apache.commons.cli.Option option39 = null;
        java.lang.String[] strArray40 = commandLine34.getOptionValues(option39);
        java.util.Properties[] propertiesArray42 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray43 = commandLine34.getParsedOptionValues(' ', propertiesArray42);
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray44 = commandLine27.getParsedOptionValue(optionGroup32, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) propertiesArray43);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray45 = commandLine19.getParsedOptionValues(optionGroup25, (java.util.Map<java.lang.Object, java.lang.Object>[]) objMapArray44);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray46 = commandLine1.getParsedOptionValue(optionGroup16, objMapArray45);
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        java.lang.Class[] classArray52 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        java.lang.Class[][] classArray58 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray59 = (java.lang.Class<?>[][]) classArray58;
        wildcardClassArray59[0] = classArray49;
        wildcardClassArray59[1] = wildcardClassArray53;
        wildcardClassArray59[2] = classArray55;
        java.lang.Class<?>[][] wildcardClassArray66 = commandLine1.getParsedOptionValues("hi!", wildcardClassArray59);
        java.lang.Class<?> wildcardClass67 = wildcardClassArray66.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(propertiesArray42);
        org.junit.Assert.assertArrayEquals(propertiesArray42, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray43);
        org.junit.Assert.assertArrayEquals(propertiesArray43, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray44);
        org.junit.Assert.assertArrayEquals(objMapArray44, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray45);
        org.junit.Assert.assertArrayEquals(objMapArray45, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray46);
        org.junit.Assert.assertArrayEquals(objMapArray46, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertArrayEquals(classArray49, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertArrayEquals(wildcardClassArray50, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertArrayEquals(classArray52, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertArrayEquals(wildcardClassArray53, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertArrayEquals(classArray55, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertArrayEquals(wildcardClassArray56, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test622");
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
        java.lang.String[] strArray13 = commandLine2.getOptionValues("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray18 };
        java.lang.String[][] strArray20 = commandLine2.getParsedOptionValues("", strArray19);
        org.apache.commons.cli.Option option21 = null;
        org.apache.commons.cli.CommandLine.Builder builder22 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine23 = builder22.get();
        org.apache.commons.cli.Option option24 = null;
        java.util.function.Supplier<java.lang.String> strSupplier25 = null;
        java.lang.String str26 = commandLine23.getOptionValue(option24, strSupplier25);
        org.apache.commons.cli.Option option27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer29 = null;
        org.apache.commons.cli.CommandLine.Builder builder30 = builder28.setDeprecatedHandler(optionConsumer29);
        java.lang.Class<?> wildcardClass31 = builder30.getClass();
        java.lang.Class<?> wildcardClass32 = commandLine23.getParsedOptionValue(option27, wildcardClass31);
        java.lang.String[] strArray33 = commandLine23.getArgs();
        org.apache.commons.cli.Option option34 = null;
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer36 = null;
        org.apache.commons.cli.CommandLine.Builder builder37 = builder35.setDeprecatedHandler(optionConsumer36);
        org.apache.commons.cli.CommandLine commandLine38 = commandLine23.getParsedOptionValue(option34, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder37);
        java.util.function.Supplier<java.lang.String> strSupplier40 = null;
        java.lang.String str41 = commandLine38.getOptionValue(' ', strSupplier40);
        org.apache.commons.cli.Option[] optionArray42 = commandLine38.getOptions();
        org.apache.commons.cli.Option[] optionArray44 = new org.apache.commons.cli.Option[] {};
        org.apache.commons.cli.Option[][] optionArray45 = new org.apache.commons.cli.Option[][] { optionArray44 };
        org.apache.commons.cli.Option[][] optionArray46 = commandLine38.getParsedOptionValues("hi!", optionArray45);
        org.apache.commons.cli.Option[][] optionArray47 = commandLine2.getParsedOptionValues(option21, optionArray46);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
        org.junit.Assert.assertNull(wildcardClassOfField9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(optionArray42);
        org.junit.Assert.assertArrayEquals(optionArray42, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray44);
        org.junit.Assert.assertArrayEquals(optionArray44, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray45);
        org.junit.Assert.assertNotNull(optionArray46);
        org.junit.Assert.assertNotNull(optionArray47);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test623");
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
        org.apache.commons.cli.Option option32 = null;
        java.lang.String str34 = commandLine1.getOptionValue(option32, "");
        java.util.Iterator<org.apache.commons.cli.Option> optionItor36 = commandLine1.getParsedOptionValue('#');
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(optionItor36);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test624");
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
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine14.getOptions();
        org.apache.commons.cli.Option option18 = null;
        boolean boolean19 = commandLine14.hasOption(option18);
        java.lang.String str21 = commandLine14.getOptionValue('4');
        boolean boolean23 = commandLine14.hasOption('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test625");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.Object[] objArray6 = commandLine1.getParsedOptionValues(' ');
        java.lang.String str8 = commandLine1.getOptionValue("");
        org.apache.commons.cli.Option option9 = null;
        java.io.Serializable[] serializableArray10 = commandLine1.getParsedOptionValue(option9);
        org.apache.commons.cli.Option option11 = null;
        org.apache.commons.cli.CommandLine.Builder builder12 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine13 = builder12.get();
        org.apache.commons.cli.Option option14 = null;
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        java.lang.String str16 = commandLine13.getOptionValue(option14, strSupplier15);
        org.apache.commons.cli.Option option17 = null;
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray25 = commandLine13.getParsedOptionValues(option17, constableArray24);
        org.apache.commons.cli.OptionGroup optionGroup26 = null;
        java.lang.String str27 = commandLine13.getOptionValue(optionGroup26);
        org.apache.commons.cli.OptionGroup optionGroup28 = null;
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer30 = null;
        org.apache.commons.cli.CommandLine.Builder builder31 = builder29.setDeprecatedHandler(optionConsumer30);
        org.apache.commons.cli.CommandLine.Builder builder32 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine33 = builder32.get();
        org.apache.commons.cli.Option option34 = null;
        java.util.function.Supplier<java.lang.String> strSupplier35 = null;
        java.lang.String str36 = commandLine33.getOptionValue(option34, strSupplier35);
        org.apache.commons.cli.Option option37 = null;
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray45 = commandLine33.getParsedOptionValues(option37, constableArray44);
        java.lang.String[] strArray47 = commandLine33.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder49 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine50 = builder49.get();
        org.apache.commons.cli.CommandLine.Builder builder52 = builder49.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine53 = commandLine33.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder52);
        org.apache.commons.cli.CommandLine.Builder builder54 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine55 = builder54.get();
        org.apache.commons.cli.CommandLine.Builder builder57 = builder54.addArg("hi!");
        java.util.function.Supplier[] supplierArray59 = new java.util.function.Supplier[3];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray60 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray59;
        commandLineSupplierArray60[0] = builder29;
        commandLineSupplierArray60[1] = builder52;
        commandLineSupplierArray60[2] = builder57;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray67 = commandLine13.getParsedOptionValues(optionGroup28, commandLineSupplierArray60);
        java.lang.String[] strArray68 = commandLine13.getArgs();
        org.apache.commons.cli.Option option69 = null;
        org.apache.commons.cli.CommandLine.Builder builder70 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine71 = builder70.get();
        org.apache.commons.cli.Option option72 = null;
        java.util.function.Supplier<java.lang.String> strSupplier73 = null;
        java.lang.String str74 = commandLine71.getOptionValue(option72, strSupplier73);
        java.lang.String[] strArray75 = commandLine71.getArgs();
        org.apache.commons.cli.Option option76 = null;
        java.lang.String[] strArray77 = commandLine71.getOptionValues(option76);
        java.util.Properties[] propertiesArray79 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray80 = commandLine71.getParsedOptionValues(' ', propertiesArray79);
        java.util.Properties[] propertiesArray81 = commandLine13.getParsedOptionValues(option69, propertiesArray80);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray82 = commandLine1.getParsedOptionValue(option11, (java.util.Map<java.lang.Object, java.lang.Object>[]) propertiesArray81);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(serializableArray10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray45);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(supplierArray59);
        org.junit.Assert.assertNotNull(commandLineSupplierArray60);
        org.junit.Assert.assertNotNull(commandLineSupplierArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(commandLine71);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNotNull(propertiesArray79);
        org.junit.Assert.assertArrayEquals(propertiesArray79, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray80);
        org.junit.Assert.assertArrayEquals(propertiesArray80, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray81);
        org.junit.Assert.assertArrayEquals(propertiesArray81, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray82);
        org.junit.Assert.assertArrayEquals(objMapArray82, new java.util.Properties[] {});
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test626");
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
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        java.lang.constant.ConstantDesc constantDesc21 = null;
        java.lang.constant.ConstantDesc constantDesc22 = commandLine19.getParsedOptionValue('a', constantDesc21);
        java.lang.String str25 = commandLine19.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option26 = null;
        org.apache.commons.cli.CommandLine.Builder builder27 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer28 = null;
        org.apache.commons.cli.CommandLine.Builder builder29 = builder27.setDeprecatedHandler(optionConsumer28);
        org.apache.commons.cli.CommandLine commandLine30 = commandLine19.getParsedOptionValue(option26, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder27);
        org.apache.commons.cli.Option[] optionArray31 = commandLine19.getOptions();
        org.apache.commons.cli.CommandLine.Builder[] builderArray33 = new org.apache.commons.cli.CommandLine.Builder[] {};
        org.apache.commons.cli.CommandLine.Builder[] builderArray34 = commandLine19.getParsedOptionValues('a', builderArray33);
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray35 = commandLine1.getParsedOptionValues(optionGroup17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) builderArray33);
        org.apache.commons.cli.Option option36 = null;
        java.lang.String str37 = commandLine1.getOptionValue(option36);
        java.lang.String str39 = commandLine1.getOptionValue('#');
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(optionArray31);
        org.junit.Assert.assertArrayEquals(optionArray31, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(builderArray33);
        org.junit.Assert.assertArrayEquals(builderArray33, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(builderArray34);
        org.junit.Assert.assertArrayEquals(builderArray34, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray35);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray35, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test627");
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
        org.apache.commons.cli.CommandLine.Builder builder38 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine39 = builder38.get();
        java.lang.String[] strArray41 = commandLine39.getOptionValues('a');
        org.apache.commons.cli.Option option42 = null;
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray57 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray62 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray67 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray72 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray73 = new java.lang.constant.ConstantDesc[][] { constantDescArray47, constantDescArray52, constantDescArray57, constantDescArray62, constantDescArray67, constantDescArray72 };
        java.lang.constant.ConstantDesc[][] constantDescArray74 = commandLine39.getParsedOptionValues(option42, constantDescArray73);
        java.lang.Object[] objArray75 = commandLine36.getParsedOptionValues('#', (java.lang.Object[]) constantDescArray73);
        org.apache.commons.cli.OptionGroup optionGroup76 = null;
        java.lang.String str78 = commandLine36.getOptionValue(optionGroup76, "");
        org.apache.commons.cli.Option option79 = null;
        java.lang.String[] strArray80 = commandLine36.getOptionValues(option79);
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
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertNotNull(constantDescArray57);
        org.junit.Assert.assertNotNull(constantDescArray62);
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertNotNull(constantDescArray73);
        org.junit.Assert.assertNotNull(constantDescArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[[3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0]]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(strArray80);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test628");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        boolean boolean15 = commandLine1.hasOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        java.lang.String str18 = commandLine1.getOptionValue(optionGroup16, strSupplier17);
        java.lang.CharSequence charSequence21 = commandLine1.getParsedOptionValue('#', (java.lang.CharSequence) "hi!");
        org.apache.commons.cli.OptionGroup optionGroup22 = null;
        java.util.function.Supplier<java.lang.String> strSupplier23 = null;
        java.lang.String str24 = commandLine1.getOptionValue(optionGroup22, strSupplier23);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test629");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.CommandLine commandLine5 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine6 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.CommandLine commandLine9 = builder0.build();
        org.apache.commons.cli.CommandLine.Builder builder11 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine12 = builder11.get();
        org.apache.commons.cli.CommandLine.Builder builder14 = builder11.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine15 = builder14.build();
        org.apache.commons.cli.CommandLine commandLine16 = commandLine9.getParsedOptionValue('#', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder14);
        org.apache.commons.cli.Option option17 = null;
        int int18 = commandLine9.getOptionCount(option17);
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        java.lang.String[] strArray20 = commandLine9.getParsedOptionValues(optionGroup19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(commandLine5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test630");
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
        java.lang.String[] strArray38 = commandLine36.getOptionValues("hi!");
        org.apache.commons.cli.Option option39 = null;
        org.apache.commons.cli.Option[][] optionArray40 = null;
        org.apache.commons.cli.Option[][] optionArray41 = commandLine36.getParsedOptionValues(option39, optionArray40);
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
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNull(optionArray41);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test631");
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
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.lang.String[][] strArray12 = commandLine2.getParsedOptionValues(optionGroup11);
        org.apache.commons.cli.Option option13 = null;
        java.lang.String[] strArray14 = commandLine2.getOptionValues(option13);
        java.lang.String[] strArray16 = commandLine2.getOptionValues('4');
        org.apache.commons.cli.Option option17 = null;
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        org.apache.commons.cli.Option option20 = null;
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        java.lang.String str22 = commandLine19.getOptionValue(option20, strSupplier21);
        org.apache.commons.cli.Option option23 = null;
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray31 = commandLine19.getParsedOptionValues(option23, constableArray30);
        org.apache.commons.cli.Option option32 = null;
        java.lang.String[] strArray33 = commandLine19.getOptionValues(option32);
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        boolean boolean35 = commandLine19.hasOption(optionGroup34);
        org.apache.commons.cli.Option option36 = null;
        java.util.function.Supplier<java.lang.String> strSupplier37 = null;
        java.lang.String str38 = commandLine19.getOptionValue(option36, strSupplier37);
        org.apache.commons.cli.Option option39 = null;
        java.util.function.Supplier<java.lang.String> strSupplier40 = null;
        java.lang.String str41 = commandLine19.getOptionValue(option39, strSupplier40);
        org.apache.commons.cli.OptionGroup optionGroup42 = null;
        java.lang.String str43 = commandLine19.getOptionValue(optionGroup42);
        org.apache.commons.cli.OptionGroup optionGroup44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine46 = builder45.get();
        java.lang.constant.ConstantDesc constantDesc48 = null;
        java.lang.constant.ConstantDesc constantDesc49 = commandLine46.getParsedOptionValue('a', constantDesc48);
        java.lang.String str52 = commandLine46.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option53 = null;
        org.apache.commons.cli.CommandLine.Builder builder54 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine55 = builder54.get();
        org.apache.commons.cli.CommandLine commandLine56 = commandLine46.getParsedOptionValue(option53, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.CommandLine commandLine57 = commandLine19.getParsedOptionValue(optionGroup44, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        org.apache.commons.cli.CommandLine commandLine58 = commandLine2.getParsedOptionValue(option17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder54);
        java.util.List<java.lang.String> strList59 = commandLine58.getArgList();
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
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNull(constantDesc49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(commandLine57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNotNull(strList59);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test632");
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
        java.lang.String[] strArray13 = commandLine11.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder15 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine16 = builder15.get();
        java.lang.constant.ConstantDesc constantDesc18 = null;
        java.lang.constant.ConstantDesc constantDesc19 = commandLine16.getParsedOptionValue('a', constantDesc18);
        java.lang.Object[] objArray21 = commandLine16.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option22 = null;
        org.apache.commons.cli.CommandLine.Builder builder23 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer24 = null;
        org.apache.commons.cli.CommandLine.Builder builder25 = builder23.setDeprecatedHandler(optionConsumer24);
        org.apache.commons.cli.CommandLine commandLine26 = commandLine16.getParsedOptionValue(option22, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder23);
        org.apache.commons.cli.Option option27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder23.addOption(option27);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer29 = null;
        org.apache.commons.cli.CommandLine.Builder builder30 = builder23.setDeprecatedHandler(optionConsumer29);
        org.apache.commons.cli.CommandLine commandLine31 = commandLine11.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder23);
        boolean boolean33 = commandLine11.hasOption(' ');
        java.lang.String str36 = commandLine11.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(constantDesc19);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test633");
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
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        java.lang.String str19 = commandLine1.getOptionValue('#', strSupplier18);
        boolean boolean21 = commandLine1.hasOption('a');
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test634");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        java.lang.String str5 = commandLine1.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(optionGroup6);
        java.lang.String str9 = commandLine1.getOptionValue('4');
        org.apache.commons.cli.CommandLine.Builder builder11 = commandLine1.getParsedOptionValue('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(builder11);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test635");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.CommandLine commandLine11 = commandLine1.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder9);
        java.lang.String str14 = commandLine1.getOptionValue('#', "hi!");
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray16 = commandLine1.getParsedOptionValue('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(objMapArray16);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test636");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.Option option3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addOption(option3);
        org.apache.commons.cli.Option option5 = null;
        org.apache.commons.cli.CommandLine.Builder builder6 = builder0.addOption(option5);
        org.apache.commons.cli.CommandLine commandLine7 = builder0.build();
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.CommandLine.Builder builder12 = builder9.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine13 = builder12.build();
        org.apache.commons.cli.Option option14 = null;
        org.apache.commons.cli.CommandLine.Builder builder15 = builder12.addOption(option14);
        org.apache.commons.cli.CommandLine commandLine16 = commandLine7.getParsedOptionValue(option8, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder12);
        org.apache.commons.cli.Option[] optionArray17 = commandLine16.getOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(commandLine13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test637");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str6 = commandLine1.getOptionValue(optionGroup5);
        org.apache.commons.cli.OptionGroup optionGroup7 = null;
        org.apache.commons.cli.CommandLine.Builder builder8 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.CommandLine.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.CommandLine.Builder builder12 = builder10.addArg("hi!");
        org.apache.commons.cli.Option option13 = null;
        org.apache.commons.cli.CommandLine.Builder builder14 = builder12.addOption(option13);
        org.apache.commons.cli.CommandLine commandLine15 = builder12.get();
        org.apache.commons.cli.CommandLine commandLine16 = commandLine1.getParsedOptionValue(optionGroup7, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder12);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNotNull(commandLine16);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test638");
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
        java.util.Properties properties38 = commandLine36.getOptionProperties("");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray40 = commandLine36.getParsedOptionValues('#');
        java.util.function.Supplier<java.lang.String> strSupplier42 = null;
        java.lang.String str43 = commandLine36.getOptionValue('a', strSupplier42);
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
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(genericDeclarationArray40);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test639");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.String[] strArray7 = commandLine1.getOptionValues(option6);
        java.util.Properties[] propertiesArray9 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray10 = commandLine1.getParsedOptionValues(' ', propertiesArray9);
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.util.Properties[][] propertiesArray12 = null;
        java.util.Properties[][] propertiesArray13 = commandLine1.getParsedOptionValues(optionGroup11, propertiesArray12);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor14 = commandLine1.iterator();
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary16 = commandLine1.getParsedOptionValue('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(propertiesArray9);
        org.junit.Assert.assertArrayEquals(propertiesArray9, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray10);
        org.junit.Assert.assertArrayEquals(propertiesArray10, new java.util.Properties[] {});
        org.junit.Assert.assertNull(propertiesArray13);
        org.junit.Assert.assertNotNull(optionItor14);
        org.junit.Assert.assertNull(objDictionary16);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test640");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap3 = commandLine1.getParsedOptionValue(option2);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField5 = commandLine1.getParsedOptionValue("");
        org.apache.commons.cli.Option option6 = null;
        java.util.Iterator<org.apache.commons.cli.Option>[][] optionItorArray7 = commandLine1.getParsedOptionValues(option6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNull(wildcardClassOfField5);
        org.junit.Assert.assertNull(optionItorArray7);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test641");
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
        boolean boolean17 = commandLine1.hasOption("");
        org.apache.commons.cli.Option option18 = null;
        int int19 = commandLine1.getOptionCount(option18);
        org.apache.commons.cli.Option option20 = null;
        int int21 = commandLine1.getOptionCount(option20);
        java.lang.String[] strArray23 = commandLine1.getOptionValues("");
        int int25 = commandLine1.getOptionCount(' ');
        org.apache.commons.cli.CommandLine.Builder builder27 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine28 = builder27.get();
        org.apache.commons.cli.CommandLine commandLine29 = builder27.build();
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        java.lang.String str32 = commandLine29.getOptionValue("hi!", strSupplier31);
        org.apache.commons.cli.CommandLine.Builder builder34 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine35 = builder34.get();
        org.apache.commons.cli.Option option36 = null;
        java.util.function.Supplier<java.lang.String> strSupplier37 = null;
        java.lang.String str38 = commandLine35.getOptionValue(option36, strSupplier37);
        org.apache.commons.cli.Option option39 = null;
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray47 = commandLine35.getParsedOptionValues(option39, constableArray46);
        org.apache.commons.cli.OptionGroup optionGroup48 = null;
        java.lang.String str49 = commandLine35.getOptionValue(optionGroup48);
        java.lang.CharSequence charSequence52 = commandLine35.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj54 = commandLine35.getOptionObject("hi!");
        java.lang.String[] strArray55 = commandLine35.getArgs();
        java.lang.Class<?> wildcardClass56 = strArray55.getClass();
        org.apache.commons.cli.CommandLine.Builder builder57 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine58 = builder57.get();
        org.apache.commons.cli.Option option59 = null;
        java.util.function.Supplier<java.lang.String> strSupplier60 = null;
        java.lang.String str61 = commandLine58.getOptionValue(option59, strSupplier60);
        org.apache.commons.cli.Option option62 = null;
        org.apache.commons.cli.CommandLine.Builder builder63 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer64 = null;
        org.apache.commons.cli.CommandLine.Builder builder65 = builder63.setDeprecatedHandler(optionConsumer64);
        java.lang.Class<?> wildcardClass66 = builder65.getClass();
        java.lang.Class<?> wildcardClass67 = commandLine58.getParsedOptionValue(option62, wildcardClass66);
        java.lang.Class[] classArray69 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass56;
        wildcardClassArray70[1] = wildcardClass66;
        java.lang.Class[][] classArray76 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray77 = (java.lang.Class<?>[][]) classArray76;
        wildcardClassArray77[0] = wildcardClassArray70;
        java.lang.Class<?>[][] wildcardClassArray80 = commandLine29.getParsedOptionValues('#', wildcardClassArray77);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][] wildcardClassOfFieldArray81 = commandLine1.getParsedOptionValue("", (java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray77);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + charSequence52 + "' != '" + "" + "'", charSequence52, "");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] { java.lang.String[].class, org.apache.commons.cli.CommandLine.Builder.class });
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertArrayEquals(wildcardClassArray70, new java.lang.Class[] { java.lang.String[].class, org.apache.commons.cli.CommandLine.Builder.class });
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldArray81);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test642");
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
        org.apache.commons.cli.CommandLine.Builder builder15 = builder13.addArg("");
        org.apache.commons.cli.CommandLine.Builder builder17 = builder15.addArg("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test643");
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
        java.lang.reflect.AnnotatedElement annotatedElement27 = commandLine1.getParsedOptionValue("");
        org.apache.commons.cli.CommandLine.Builder[] builderArray29 = commandLine1.getParsedOptionValues('4');
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
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(builderArray29);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test644");
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
        java.lang.String[] strArray20 = commandLine1.getOptionValues('a');
        boolean boolean22 = commandLine1.hasOption("hi!");
        org.apache.commons.cli.CommandLine.Builder builder24 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine25 = builder24.get();
        org.apache.commons.cli.CommandLine commandLine26 = builder24.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder24.setDeprecatedHandler(optionConsumer27);
        org.apache.commons.cli.CommandLine commandLine29 = builder24.get();
        org.apache.commons.cli.CommandLine commandLine30 = builder24.get();
        org.apache.commons.cli.CommandLine commandLine31 = commandLine1.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder24);
        java.util.Properties properties33 = commandLine1.getOptionProperties("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test645");
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
        java.lang.String str30 = commandLine1.getOptionValue(option28, "hi!");
        java.lang.Object obj32 = commandLine1.getOptionObject("");
        java.lang.constant.ConstantDesc[] constantDescArray39 = new java.lang.constant.ConstantDesc[] { (-1L), "hi!", 10, (-1), (-1) };
        java.lang.constant.ConstantDesc[] constantDescArray45 = new java.lang.constant.ConstantDesc[] { (-1L), "hi!", 10, (-1), (-1) };
        java.lang.constant.ConstantDesc[] constantDescArray51 = new java.lang.constant.ConstantDesc[] { (-1L), "hi!", 10, (-1), (-1) };
        java.lang.constant.ConstantDesc[][] constantDescArray52 = new java.lang.constant.ConstantDesc[][] { constantDescArray39, constantDescArray45, constantDescArray51 };
        java.lang.constant.ConstantDesc[] constantDescArray58 = new java.lang.constant.ConstantDesc[] { (-1L), "hi!", 10, (-1), (-1) };
        java.lang.constant.ConstantDesc[] constantDescArray64 = new java.lang.constant.ConstantDesc[] { (-1L), "hi!", 10, (-1), (-1) };
        java.lang.constant.ConstantDesc[] constantDescArray70 = new java.lang.constant.ConstantDesc[] { (-1L), "hi!", 10, (-1), (-1) };
        java.lang.constant.ConstantDesc[][] constantDescArray71 = new java.lang.constant.ConstantDesc[][] { constantDescArray58, constantDescArray64, constantDescArray70 };
        java.lang.constant.ConstantDesc[][][] constantDescArray72 = new java.lang.constant.ConstantDesc[][][] { constantDescArray52, constantDescArray71 };
        java.lang.constant.ConstantDesc[][][] constantDescArray73 = commandLine1.getParsedOptionValues('a', constantDescArray72);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(constantDescArray39);
        org.junit.Assert.assertNotNull(constantDescArray45);
        org.junit.Assert.assertNotNull(constantDescArray51);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertNotNull(constantDescArray58);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertNotNull(constantDescArray70);
        org.junit.Assert.assertNotNull(constantDescArray71);
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertNotNull(constantDescArray73);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test646");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        java.lang.String str10 = commandLine1.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.CommandLine.Builder[] builderArray12 = commandLine1.getParsedOptionValues(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(builderArray12);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test647");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.Option option3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine5 = builder0.build();
        java.lang.String[] strArray7 = commandLine5.getOptionValues('a');
        org.apache.commons.cli.Option option8 = null;
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.Option option11 = null;
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        java.lang.String str13 = commandLine10.getOptionValue(option11, strSupplier12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray22 = commandLine10.getParsedOptionValues(option14, constableArray21);
        org.apache.commons.cli.Option option23 = null;
        java.lang.String[] strArray24 = commandLine10.getOptionValues(option23);
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine27 = builder26.get();
        org.apache.commons.cli.CommandLine commandLine28 = builder26.build();
        org.apache.commons.cli.OptionGroup optionGroup29 = null;
        java.lang.String[] strArray30 = commandLine28.getOptionValues(optionGroup29);
        java.lang.String[] strArray31 = commandLine28.getArgs();
        org.apache.commons.cli.Option option32 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray33 = commandLine28.getParsedOptionValues(option32);
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine36 = builder35.get();
        java.lang.String[] strArray38 = commandLine36.getOptionValues('a');
        java.lang.String str40 = commandLine36.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup41 = null;
        org.apache.commons.cli.CommandLine.Builder builder42 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine43 = builder42.get();
        org.apache.commons.cli.Option option44 = null;
        java.util.function.Supplier<java.lang.String> strSupplier45 = null;
        java.lang.String str46 = commandLine43.getOptionValue(option44, strSupplier45);
        java.lang.String[] strArray47 = commandLine43.getArgs();
        org.apache.commons.cli.Option option48 = null;
        java.lang.String[] strArray49 = commandLine43.getOptionValues(option48);
        java.util.Properties[] propertiesArray51 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray52 = commandLine43.getParsedOptionValues(' ', propertiesArray51);
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray53 = commandLine36.getParsedOptionValue(optionGroup41, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) propertiesArray52);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray54 = commandLine28.getParsedOptionValues(optionGroup34, (java.util.Map<java.lang.Object, java.lang.Object>[]) objMapArray53);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray55 = commandLine10.getParsedOptionValue(optionGroup25, objMapArray54);
        java.lang.Class[] classArray58 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        java.lang.Class[] classArray64 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        java.lang.Class[][] classArray67 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray68 = (java.lang.Class<?>[][]) classArray67;
        wildcardClassArray68[0] = classArray58;
        wildcardClassArray68[1] = wildcardClassArray62;
        wildcardClassArray68[2] = classArray64;
        java.lang.Class<?>[][] wildcardClassArray75 = commandLine10.getParsedOptionValues("hi!", wildcardClassArray68);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][] wildcardClassOfFieldArray76 = commandLine5.getParsedOptionValues(option8, (java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>[][]) wildcardClassArray68);
        java.lang.String str79 = commandLine5.getOptionValue("", "hi!");
        java.util.Iterator<org.apache.commons.cli.Option> optionItor80 = commandLine5.iterator();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(commandLine5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(propertiesArray51);
        org.junit.Assert.assertArrayEquals(propertiesArray51, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray52);
        org.junit.Assert.assertArrayEquals(propertiesArray52, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray53);
        org.junit.Assert.assertArrayEquals(objMapArray53, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray54);
        org.junit.Assert.assertArrayEquals(objMapArray54, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray55);
        org.junit.Assert.assertArrayEquals(objMapArray55, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertArrayEquals(classArray58, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertArrayEquals(wildcardClassArray59, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertArrayEquals(classArray61, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertArrayEquals(wildcardClassArray62, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertArrayEquals(classArray64, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertArrayEquals(wildcardClassArray65, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldArray76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(optionItor80);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test648");
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
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][] objMapArray29 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.OptionGroup optionGroup30 = null;
        java.lang.CharSequence charSequence32 = commandLine1.getParsedOptionValue(optionGroup30, (java.lang.CharSequence) "");
        org.apache.commons.cli.OptionGroup optionGroup33 = null;
        java.lang.String str35 = commandLine1.getOptionValue(optionGroup33, "");
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
        org.junit.Assert.assertNull(objMapArray29);
        org.junit.Assert.assertEquals("'" + charSequence32 + "' != '" + "" + "'", charSequence32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test649");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.String[] strArray10 = commandLine2.getOptionValues('#');
        org.apache.commons.cli.OptionGroup optionGroup11 = null;
        java.lang.CharSequence[] charSequenceArray12 = commandLine2.getParsedOptionValues(optionGroup11);
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        boolean boolean14 = commandLine2.hasOption(optionGroup13);
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        java.lang.Iterable<java.lang.String> strIterable16 = commandLine2.getParsedOptionValue(optionGroup15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(charSequenceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strIterable16);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test650");
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
        org.apache.commons.cli.Option option15 = null;
        java.lang.String str16 = commandLine11.getOptionValue(option15);
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap18 = commandLine11.getParsedOptionValue("hi!");
        org.apache.commons.cli.Option option19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine21 = builder20.get();
        org.apache.commons.cli.CommandLine commandLine22 = builder20.build();
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        java.lang.String str25 = commandLine22.getOptionValue("hi!", strSupplier24);
        org.apache.commons.cli.CommandLine.Builder builder27 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine28 = builder27.get();
        org.apache.commons.cli.Option option29 = null;
        java.util.function.Supplier<java.lang.String> strSupplier30 = null;
        java.lang.String str31 = commandLine28.getOptionValue(option29, strSupplier30);
        org.apache.commons.cli.Option option32 = null;
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray40 = commandLine28.getParsedOptionValues(option32, constableArray39);
        org.apache.commons.cli.OptionGroup optionGroup41 = null;
        java.lang.String str42 = commandLine28.getOptionValue(optionGroup41);
        java.lang.CharSequence charSequence45 = commandLine28.getParsedOptionValue('a', (java.lang.CharSequence) "");
        java.lang.Object obj47 = commandLine28.getOptionObject("hi!");
        java.lang.String[] strArray48 = commandLine28.getArgs();
        java.lang.Class<?> wildcardClass49 = strArray48.getClass();
        org.apache.commons.cli.CommandLine.Builder builder50 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine51 = builder50.get();
        org.apache.commons.cli.Option option52 = null;
        java.util.function.Supplier<java.lang.String> strSupplier53 = null;
        java.lang.String str54 = commandLine51.getOptionValue(option52, strSupplier53);
        org.apache.commons.cli.Option option55 = null;
        org.apache.commons.cli.CommandLine.Builder builder56 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer57 = null;
        org.apache.commons.cli.CommandLine.Builder builder58 = builder56.setDeprecatedHandler(optionConsumer57);
        java.lang.Class<?> wildcardClass59 = builder58.getClass();
        java.lang.Class<?> wildcardClass60 = commandLine51.getParsedOptionValue(option55, wildcardClass59);
        java.lang.Class[] classArray62 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        wildcardClassArray63[0] = wildcardClass49;
        wildcardClassArray63[1] = wildcardClass59;
        java.lang.Class[][] classArray69 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray70 = (java.lang.Class<?>[][]) classArray69;
        wildcardClassArray70[0] = wildcardClassArray63;
        java.lang.Class<?>[][] wildcardClassArray73 = commandLine22.getParsedOptionValues('#', wildcardClassArray70);
        java.lang.Class<?>[][] wildcardClassArray74 = commandLine11.getParsedOptionValues(option19, wildcardClassArray73);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(objMap18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(commandLine28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + charSequence45 + "' != '" + "" + "'", charSequence45, "");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertArrayEquals(classArray62, new java.lang.Class[] { java.lang.String[].class, org.apache.commons.cli.CommandLine.Builder.class });
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertArrayEquals(wildcardClassArray63, new java.lang.Class[] { java.lang.String[].class, org.apache.commons.cli.CommandLine.Builder.class });
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test651");
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
        org.apache.commons.cli.Option option16 = null;
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.Option option19 = null;
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        java.lang.String str21 = commandLine18.getOptionValue(option19, strSupplier20);
        org.apache.commons.cli.OptionGroup optionGroup22 = null;
        java.lang.String str24 = commandLine18.getOptionValue(optionGroup22, "");
        org.apache.commons.cli.Option option25 = null;
        java.lang.String[] strArray26 = commandLine18.getOptionValues(option25);
        org.apache.commons.cli.CommandLine.Builder builder28 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine29 = builder28.get();
        java.lang.constant.ConstantDesc constantDesc31 = null;
        java.lang.constant.ConstantDesc constantDesc32 = commandLine29.getParsedOptionValue('a', constantDesc31);
        java.lang.Object[] objArray34 = commandLine29.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option35 = null;
        org.apache.commons.cli.CommandLine.Builder builder36 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer37 = null;
        org.apache.commons.cli.CommandLine.Builder builder38 = builder36.setDeprecatedHandler(optionConsumer37);
        org.apache.commons.cli.CommandLine commandLine39 = commandLine29.getParsedOptionValue(option35, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.Option option40 = null;
        org.apache.commons.cli.CommandLine.Builder builder41 = builder36.addOption(option40);
        org.apache.commons.cli.CommandLine commandLine42 = commandLine18.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.CommandLine commandLine43 = commandLine1.getParsedOptionValue(option16, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder36);
        org.apache.commons.cli.Option option44 = null;
        java.lang.String str45 = commandLine43.getOptionValue(option44);
        org.apache.commons.cli.Option option46 = null;
        boolean boolean47 = commandLine43.hasOption(option46);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor48 = commandLine43.iterator();
        org.apache.commons.cli.CommandLine.Builder builder50 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer51 = null;
        org.apache.commons.cli.CommandLine.Builder builder52 = builder50.setDeprecatedHandler(optionConsumer51);
        org.apache.commons.cli.CommandLine.Builder builder54 = builder52.addArg("hi!");
        org.apache.commons.cli.CommandLine.Builder builder56 = builder52.addArg("");
        org.apache.commons.cli.CommandLine commandLine57 = commandLine43.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder56);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNull(constantDesc32);
        org.junit.Assert.assertNull(objArray34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(optionItor48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(commandLine57);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test652");
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
        org.apache.commons.cli.OptionGroup optionGroup19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine21 = builder20.get();
        java.lang.constant.ConstantDesc constantDesc23 = null;
        java.lang.constant.ConstantDesc constantDesc24 = commandLine21.getParsedOptionValue('a', constantDesc23);
        java.lang.String str27 = commandLine21.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option28 = null;
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.CommandLine commandLine31 = commandLine21.getParsedOptionValue(option28, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder29);
        java.lang.String[] strArray32 = commandLine31.getArgs();
        java.lang.CharSequence[] charSequenceArray33 = commandLine1.getParsedOptionValues(optionGroup19, (java.lang.CharSequence[]) strArray32);
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        java.util.Collection<java.lang.String>[][][] strCollectionArray35 = commandLine1.getParsedOptionValues(optionGroup34);
        org.apache.commons.cli.Option option36 = null;
        org.apache.commons.cli.CommandLine.Builder builder37 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine38 = builder37.get();
        org.apache.commons.cli.CommandLine commandLine39 = builder37.build();
        org.apache.commons.cli.OptionGroup optionGroup40 = null;
        java.lang.String[] strArray41 = commandLine39.getOptionValues(optionGroup40);
        java.lang.String[] strArray42 = commandLine39.getArgs();
        org.apache.commons.cli.Option option43 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray44 = commandLine39.getParsedOptionValues(option43);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField46 = commandLine39.getParsedOptionValue("");
        java.lang.String str48 = commandLine39.getOptionValue("hi!");
        java.lang.String[] strArray50 = commandLine39.getOptionValues("hi!");
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[][] strArray56 = new java.lang.String[][] { strArray55 };
        java.lang.String[][] strArray57 = commandLine39.getParsedOptionValues("", strArray56);
        java.lang.String[][] strArray58 = commandLine1.getParsedOptionValue(option36, strArray56);
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
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(constantDesc24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertArrayEquals(charSequenceArray33, new java.lang.String[] {});
        org.junit.Assert.assertNull(strCollectionArray35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray44);
        org.junit.Assert.assertNull(wildcardClassOfField46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test653");
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
        boolean boolean17 = commandLine1.hasOption("");
        org.apache.commons.cli.Option option18 = null;
        int int19 = commandLine1.getOptionCount(option18);
        org.apache.commons.cli.Option option20 = null;
        int int21 = commandLine1.getOptionCount(option20);
        java.util.List<java.lang.String> strList22 = commandLine1.getArgList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test654");
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
        int int29 = commandLine1.getOptionCount("hi!");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test655");
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
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String str16 = commandLine1.getOptionValue(optionGroup14, "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test656");
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
        java.lang.String[] strArray13 = commandLine11.getOptionValues(option12);
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        java.lang.String[] strArray15 = commandLine11.getOptionValues(optionGroup14);
        java.lang.invoke.TypeDescriptor typeDescriptor17 = commandLine11.getParsedOptionValue(' ');
        java.util.List[] listArray20 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String>[] strListArray21 = (java.util.List<java.lang.String>[]) listArray20;
        java.util.List[] listArray23 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String>[] strListArray24 = (java.util.List<java.lang.String>[]) listArray23;
        java.util.List[] listArray26 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String>[] strListArray27 = (java.util.List<java.lang.String>[]) listArray26;
        java.util.List[] listArray29 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String>[] strListArray30 = (java.util.List<java.lang.String>[]) listArray29;
        java.util.List[][] listArray32 = new java.util.List[4][];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String>[][] strListArray33 = (java.util.List<java.lang.String>[][]) listArray32;
        strListArray33[0] = strListArray21;
        strListArray33[1] = strListArray24;
        strListArray33[2] = strListArray27;
        strListArray33[3] = listArray29;
        java.util.List<java.lang.String>[][] strListArray42 = commandLine11.getParsedOptionValues('4', strListArray33);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(typeDescriptor17);
        org.junit.Assert.assertNotNull(listArray20);
        org.junit.Assert.assertArrayEquals(listArray20, new java.util.List[] {});
        org.junit.Assert.assertNotNull(strListArray21);
        org.junit.Assert.assertArrayEquals(strListArray21, new java.util.List[] {});
        org.junit.Assert.assertNotNull(listArray23);
        org.junit.Assert.assertArrayEquals(listArray23, new java.util.List[] {});
        org.junit.Assert.assertNotNull(strListArray24);
        org.junit.Assert.assertArrayEquals(strListArray24, new java.util.List[] {});
        org.junit.Assert.assertNotNull(listArray26);
        org.junit.Assert.assertArrayEquals(listArray26, new java.util.List[] {});
        org.junit.Assert.assertNotNull(strListArray27);
        org.junit.Assert.assertArrayEquals(strListArray27, new java.util.List[] {});
        org.junit.Assert.assertNotNull(listArray29);
        org.junit.Assert.assertArrayEquals(listArray29, new java.util.List[] {});
        org.junit.Assert.assertNotNull(strListArray30);
        org.junit.Assert.assertArrayEquals(strListArray30, new java.util.List[] {});
        org.junit.Assert.assertNotNull(listArray32);
        org.junit.Assert.assertNotNull(strListArray33);
        org.junit.Assert.assertNotNull(strListArray42);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test657");
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
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        org.apache.commons.cli.CommandLine commandLine20 = builder18.build();
        org.apache.commons.cli.Option option21 = null;
        org.apache.commons.cli.CommandLine.Builder builder22 = builder18.addOption(option21);
        org.apache.commons.cli.CommandLine commandLine23 = builder22.build();
        org.apache.commons.cli.CommandLine commandLine24 = commandLine1.getParsedOptionValue(optionGroup17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder22);
        boolean boolean26 = commandLine1.hasOption("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test658");
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
        org.apache.commons.cli.OptionGroup optionGroup27 = null;
        java.lang.String[] strArray28 = commandLine1.getOptionValues(optionGroup27);
        java.util.function.Supplier<java.lang.String> strSupplier30 = null;
        java.lang.String str31 = commandLine1.getOptionValue("hi!", strSupplier30);
        java.util.List<java.lang.String> strList32 = commandLine1.getArgList();
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
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test659");
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
        java.util.List<java.lang.String> strList14 = commandLine1.getArgList();
        java.lang.Class<?>[][][] wildcardClassArray16 = commandLine1.getParsedOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine1.getArgs();
        org.apache.commons.cli.Option option18 = null;
        boolean boolean19 = commandLine1.hasOption(option18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test660");
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
        boolean boolean29 = commandLine1.hasOption('4');
        org.apache.commons.cli.Option option30 = null;
        java.util.List<java.lang.String> strList31 = commandLine1.getParsedOptionValue(option30);
        java.util.function.Supplier<java.lang.String> strSupplier33 = null;
        java.lang.String str34 = commandLine1.getOptionValue("hi!", strSupplier33);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test661");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.Option option8 = null;
        boolean boolean9 = commandLine1.hasOption(option8);
        org.apache.commons.cli.OptionGroup optionGroup10 = null;
        java.util.Dictionary<java.lang.Object, java.lang.Object>[] objDictionaryArray11 = commandLine1.getParsedOptionValues(optionGroup10);
        org.apache.commons.cli.CommandLine.Builder builder13 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine14 = builder13.get();
        org.apache.commons.cli.CommandLine commandLine15 = builder13.get();
        org.apache.commons.cli.CommandLine commandLine16 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder13);
        org.apache.commons.cli.CommandLine commandLine17 = builder13.get();
        org.apache.commons.cli.Option option18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine20 = builder19.get();
        org.apache.commons.cli.CommandLine.Builder builder22 = builder19.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine23 = builder19.build();
        org.apache.commons.cli.CommandLine.Builder builder25 = builder19.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine26 = commandLine17.getParsedOptionValue(option18, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder25);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objDictionaryArray11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandLine26);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test662");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        org.apache.commons.cli.Option option8 = null;
        boolean boolean9 = commandLine1.hasOption(option8);
        org.apache.commons.cli.OptionGroup optionGroup10 = null;
        java.util.Dictionary<java.lang.Object, java.lang.Object>[] objDictionaryArray11 = commandLine1.getParsedOptionValues(optionGroup10);
        org.apache.commons.cli.CommandLine.Builder builder13 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine14 = builder13.get();
        org.apache.commons.cli.CommandLine commandLine15 = builder13.get();
        org.apache.commons.cli.CommandLine commandLine16 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder13);
        org.apache.commons.cli.CommandLine commandLine17 = builder13.get();
        org.apache.commons.cli.Option option18 = null;
        org.apache.commons.cli.CommandLine.Builder builder19 = builder13.addOption(option18);
        org.apache.commons.cli.CommandLine commandLine20 = builder13.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objDictionaryArray11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(commandLine20);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test663");
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
        org.apache.commons.cli.Option option14 = null;
        org.apache.commons.cli.CommandLine.Builder builder15 = builder8.addOption(option14);
        org.apache.commons.cli.CommandLine commandLine16 = builder8.get();
        org.apache.commons.cli.CommandLine.Builder builder18 = builder8.addArg("");
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer19 = null;
        org.apache.commons.cli.CommandLine.Builder builder20 = builder18.setDeprecatedHandler(optionConsumer19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test664");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.Object[] objArray6 = commandLine1.getParsedOptionValues(' ');
        java.lang.String str8 = commandLine1.getOptionValue("");
        int int10 = commandLine1.getOptionCount("");
        java.util.List<java.lang.String> strList11 = commandLine1.getArgList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test665");
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
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine14.getOptions();
        org.apache.commons.cli.Option option18 = null;
        boolean boolean19 = commandLine14.hasOption(option18);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor20 = commandLine14.iterator();
        java.lang.String str22 = commandLine14.getOptionValue("hi!");
        org.apache.commons.cli.Option option23 = null;
        java.lang.String[] strArray24 = commandLine14.getOptionValues(option23);
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        java.lang.String[] strArray26 = commandLine14.getOptionValues(optionGroup25);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionItor20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test666");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap3 = commandLine1.getParsedOptionValue(option2);
        org.apache.commons.cli.OptionGroup optionGroup4 = null;
        java.util.Hashtable[] hashtableArray6 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray7 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray8 = commandLine1.getParsedOptionValues(optionGroup4, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6);
        boolean boolean10 = commandLine1.hasOption('a');
        org.apache.commons.cli.Option option11 = null;
        int int12 = commandLine1.getOptionCount(option11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNotNull(hashtableArray6);
        org.junit.Assert.assertArrayEquals(hashtableArray6, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray7);
        org.junit.Assert.assertArrayEquals(objMapArray7, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray8);
        org.junit.Assert.assertArrayEquals(objMapArray8, new java.util.Hashtable[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test667");
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
        java.lang.String[] strArray13 = commandLine11.getOptionValues(option12);
        java.lang.String[] strArray15 = commandLine11.getOptionValues('a');
        int int17 = commandLine11.getOptionCount("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test668");
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
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        org.apache.commons.cli.CommandLine commandLine20 = builder18.build();
        org.apache.commons.cli.Option option21 = null;
        org.apache.commons.cli.CommandLine.Builder builder22 = builder18.addOption(option21);
        org.apache.commons.cli.CommandLine commandLine23 = builder22.build();
        org.apache.commons.cli.CommandLine commandLine24 = commandLine1.getParsedOptionValue('a', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder22);
        org.apache.commons.cli.Option option25 = null;
        int int26 = commandLine1.getOptionCount(option25);
        org.apache.commons.cli.Option option27 = null;
        java.lang.String str29 = commandLine1.getOptionValue(option27, "hi!");
        java.lang.Object obj31 = commandLine1.getOptionObject("");
        java.lang.Object obj33 = commandLine1.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(serializableArray16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test669");
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
        org.apache.commons.cli.Option option21 = null;
        int int22 = commandLine1.getOptionCount(option21);
        org.apache.commons.cli.Option option23 = null;
        java.util.Properties properties24 = commandLine1.getOptionProperties(option23);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test670");
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
        org.apache.commons.cli.OptionGroup optionGroup14 = null;
        org.apache.commons.cli.CommandLine.Builder builder15 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine16 = builder15.get();
        org.apache.commons.cli.Option option17 = null;
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        java.lang.String str19 = commandLine16.getOptionValue(option17, strSupplier18);
        org.apache.commons.cli.Option option20 = null;
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray28 = commandLine16.getParsedOptionValues(option20, constableArray27);
        org.apache.commons.cli.Option option29 = null;
        java.lang.String[] strArray30 = commandLine16.getOptionValues(option29);
        org.apache.commons.cli.OptionGroup optionGroup31 = null;
        boolean boolean32 = commandLine16.hasOption(optionGroup31);
        org.apache.commons.cli.Option option33 = null;
        java.util.function.Supplier<java.lang.String> strSupplier34 = null;
        java.lang.String str35 = commandLine16.getOptionValue(option33, strSupplier34);
        org.apache.commons.cli.Option option36 = null;
        java.util.function.Supplier<java.lang.String> strSupplier37 = null;
        java.lang.String str38 = commandLine16.getOptionValue(option36, strSupplier37);
        java.lang.String str41 = commandLine16.getOptionValue("hi!", "");
        org.apache.commons.cli.CommandLine.Builder builder43 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine44 = builder43.get();
        org.apache.commons.cli.Option option45 = null;
        java.util.function.Supplier<java.lang.String> strSupplier46 = null;
        java.lang.String str47 = commandLine44.getOptionValue(option45, strSupplier46);
        org.apache.commons.cli.Option option48 = null;
        java.lang.constant.Constable[] constableArray55 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray56 = commandLine44.getParsedOptionValues(option48, constableArray55);
        java.lang.String[] strArray58 = commandLine44.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder60 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine61 = builder60.get();
        org.apache.commons.cli.CommandLine.Builder builder63 = builder60.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine64 = commandLine44.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder63);
        org.apache.commons.cli.CommandLine.Builder builder66 = builder63.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine67 = commandLine16.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder63);
        org.apache.commons.cli.CommandLine commandLine68 = commandLine1.getParsedOptionValue(optionGroup14, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder63);
        java.lang.String str70 = commandLine1.getOptionValue("hi!");
        org.apache.commons.cli.Option option71 = null;
        java.util.Dictionary<java.lang.Object, java.lang.Object>[] objDictionaryArray72 = commandLine1.getParsedOptionValues(option71);
        org.apache.commons.cli.Option option73 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap74 = commandLine1.getParsedOptionValue(option73);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(constableArray55);
        org.junit.Assert.assertNotNull(constableArray56);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(commandLine68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(objDictionaryArray72);
        org.junit.Assert.assertNull(objMap74);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test671");
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
        org.apache.commons.cli.OptionGroup optionGroup53 = null;
        java.io.Serializable serializable54 = commandLine52.getParsedOptionValue(optionGroup53);
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
        org.junit.Assert.assertNull(serializable54);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test672");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        org.apache.commons.cli.OptionGroup optionGroup4 = null;
        java.util.function.Supplier<java.lang.String> strSupplier5 = null;
        java.lang.String str6 = commandLine1.getOptionValue(optionGroup4, strSupplier5);
        java.lang.String[] strArray8 = commandLine1.getOptionValues('#');
        org.apache.commons.cli.Option option9 = null;
        int int10 = commandLine1.getOptionCount(option9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test673");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        java.lang.String[] strArray5 = commandLine1.getArgs();
        org.apache.commons.cli.Option option6 = null;
        org.apache.commons.cli.Option[][] optionArray7 = commandLine1.getParsedOptionValue(option6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(optionArray7);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test674");
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
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine14.getOptions();
        org.apache.commons.cli.Option option18 = null;
        boolean boolean19 = commandLine14.hasOption(option18);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor20 = commandLine14.iterator();
        org.apache.commons.cli.OptionGroup optionGroup21 = null;
        org.apache.commons.cli.CommandLine.Builder builder22 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine23 = builder22.get();
        java.lang.String[] strArray25 = commandLine23.getOptionValues('a');
        java.lang.String str27 = commandLine23.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup28 = null;
        java.lang.String[] strArray29 = commandLine23.getOptionValues(optionGroup28);
        int int31 = commandLine23.getOptionCount("hi!");
        org.apache.commons.cli.OptionGroup optionGroup32 = null;
        boolean boolean33 = commandLine23.hasOption(optionGroup32);
        org.apache.commons.cli.CommandLine.Builder builder35 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine36 = builder35.get();
        java.lang.constant.ConstantDesc constantDesc38 = null;
        java.lang.constant.ConstantDesc constantDesc39 = commandLine36.getParsedOptionValue('a', constantDesc38);
        java.lang.Object[] objArray41 = commandLine36.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option42 = null;
        org.apache.commons.cli.CommandLine.Builder builder43 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer44 = null;
        org.apache.commons.cli.CommandLine.Builder builder45 = builder43.setDeprecatedHandler(optionConsumer44);
        org.apache.commons.cli.CommandLine commandLine46 = commandLine36.getParsedOptionValue(option42, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder43);
        org.apache.commons.cli.Option option47 = null;
        org.apache.commons.cli.CommandLine.Builder builder48 = builder43.addOption(option47);
        org.apache.commons.cli.CommandLine commandLine49 = commandLine23.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder43);
        org.apache.commons.cli.CommandLine.Builder builder51 = builder43.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine52 = commandLine14.getParsedOptionValue(optionGroup21, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder51);
        org.apache.commons.cli.OptionGroup optionGroup53 = null;
        java.lang.Cloneable[] cloneableArray54 = commandLine52.getParsedOptionValues(optionGroup53);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionItor20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(constantDesc39);
        org.junit.Assert.assertNull(objArray41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNull(cloneableArray54);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test675");
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
        org.apache.commons.cli.Option option23 = null;
        java.util.Properties properties24 = commandLine1.getOptionProperties(option23);
        org.apache.commons.cli.Option[][][] optionArray26 = commandLine1.getParsedOptionValues("");
        java.util.Dictionary<java.lang.Object, java.lang.Object>[][] objDictionaryArray28 = commandLine1.getParsedOptionValues('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(optionArray26);
        org.junit.Assert.assertNull(objDictionaryArray28);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test676");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.Option option5 = null;
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray13 = commandLine1.getParsedOptionValues(option5, constableArray12);
        boolean boolean15 = commandLine1.hasOption("hi!");
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        java.util.function.Supplier<java.lang.String> strSupplier17 = null;
        java.lang.String str18 = commandLine1.getOptionValue(optionGroup16, strSupplier17);
        org.apache.commons.cli.Option option19 = null;
        java.lang.String str20 = commandLine1.getOptionValue(option19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test677");
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
        java.lang.String str55 = commandLine1.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.CommandLine.Builder builder57 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine58 = builder57.get();
        org.apache.commons.cli.Option option59 = null;
        java.util.function.Supplier<java.lang.String> strSupplier60 = null;
        java.lang.String str61 = commandLine58.getOptionValue(option59, strSupplier60);
        org.apache.commons.cli.Option option62 = null;
        org.apache.commons.cli.CommandLine.Builder builder63 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer64 = null;
        org.apache.commons.cli.CommandLine.Builder builder65 = builder63.setDeprecatedHandler(optionConsumer64);
        java.lang.Class<?> wildcardClass66 = builder65.getClass();
        java.lang.Class<?> wildcardClass67 = commandLine58.getParsedOptionValue(option62, wildcardClass66);
        java.lang.String[] strArray69 = commandLine58.getOptionValues(' ');
        org.apache.commons.cli.OptionGroup optionGroup70 = null;
        org.apache.commons.cli.CommandLine.Builder builder71 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine72 = builder71.get();
        org.apache.commons.cli.Option option73 = null;
        java.util.function.Supplier<java.lang.String> strSupplier74 = null;
        java.lang.String str75 = commandLine72.getOptionValue(option73, strSupplier74);
        org.apache.commons.cli.OptionGroup optionGroup76 = null;
        java.lang.String str78 = commandLine72.getOptionValue(optionGroup76, "");
        org.apache.commons.cli.Option option79 = null;
        java.lang.String[] strArray80 = commandLine72.getOptionValues(option79);
        org.apache.commons.cli.CommandLine.Builder builder82 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine83 = builder82.get();
        java.lang.constant.ConstantDesc constantDesc85 = null;
        java.lang.constant.ConstantDesc constantDesc86 = commandLine83.getParsedOptionValue('a', constantDesc85);
        java.lang.Object[] objArray88 = commandLine83.getParsedOptionValues(' ');
        org.apache.commons.cli.Option option89 = null;
        org.apache.commons.cli.CommandLine.Builder builder90 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer91 = null;
        org.apache.commons.cli.CommandLine.Builder builder92 = builder90.setDeprecatedHandler(optionConsumer91);
        org.apache.commons.cli.CommandLine commandLine93 = commandLine83.getParsedOptionValue(option89, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder90);
        org.apache.commons.cli.Option option94 = null;
        org.apache.commons.cli.CommandLine.Builder builder95 = builder90.addOption(option94);
        org.apache.commons.cli.CommandLine commandLine96 = commandLine72.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder90);
        org.apache.commons.cli.CommandLine commandLine97 = commandLine58.getParsedOptionValue(optionGroup70, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder90);
        org.apache.commons.cli.CommandLine commandLine98 = commandLine1.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder90);
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(commandLine72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(strArray80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(commandLine83);
        org.junit.Assert.assertNull(constantDesc86);
        org.junit.Assert.assertNull(objArray88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(commandLine96);
        org.junit.Assert.assertNotNull(commandLine97);
        org.junit.Assert.assertNotNull(commandLine98);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test678");
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
        org.apache.commons.cli.Option option32 = null;
        java.util.function.Supplier<java.lang.String> strSupplier33 = null;
        java.lang.String str34 = commandLine1.getOptionValue(option32, strSupplier33);
        java.io.Serializable[] serializableArray36 = commandLine1.getParsedOptionValues("");
        java.lang.Cloneable[][][] cloneableArray38 = commandLine1.getParsedOptionValues('a');
        org.apache.commons.cli.CommandLine.Builder[] builderArray40 = commandLine1.getParsedOptionValue('a');
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(serializableArray36);
        org.junit.Assert.assertNull(cloneableArray38);
        org.junit.Assert.assertNull(builderArray40);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test679");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue("");
        int int11 = commandLine1.getOptionCount("");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray13 = commandLine1.getParsedOptionValues("");
        java.lang.String[] strArray15 = commandLine1.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine1.getOptions();
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        boolean boolean18 = commandLine1.hasOption(optionGroup17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(annotatedElementArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test680");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.CommandLine commandLine5 = builder0.get();
        java.util.function.Supplier<java.lang.String> strSupplier7 = null;
        java.lang.String str8 = commandLine5.getOptionValue('a', strSupplier7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(commandLine5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test681");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.Option option3 = null;
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addOption(option3);
        org.apache.commons.cli.CommandLine commandLine5 = builder0.build();
        java.lang.String[] strArray7 = commandLine5.getOptionValues('a');
        org.apache.commons.cli.CommandLine.Builder builder9 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine10 = builder9.get();
        org.apache.commons.cli.Option option11 = null;
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        java.lang.String str13 = commandLine10.getOptionValue(option11, strSupplier12);
        org.apache.commons.cli.Option option14 = null;
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray22 = commandLine10.getParsedOptionValues(option14, constableArray21);
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        java.lang.String str24 = commandLine10.getOptionValue(optionGroup23);
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder26.setDeprecatedHandler(optionConsumer27);
        org.apache.commons.cli.CommandLine.Builder builder29 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine30 = builder29.get();
        org.apache.commons.cli.Option option31 = null;
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.lang.String str33 = commandLine30.getOptionValue(option31, strSupplier32);
        org.apache.commons.cli.Option option34 = null;
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray42 = commandLine30.getParsedOptionValues(option34, constableArray41);
        java.lang.String[] strArray44 = commandLine30.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder46 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine47 = builder46.get();
        org.apache.commons.cli.CommandLine.Builder builder49 = builder46.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine50 = commandLine30.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder49);
        org.apache.commons.cli.CommandLine.Builder builder51 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine52 = builder51.get();
        org.apache.commons.cli.CommandLine.Builder builder54 = builder51.addArg("hi!");
        java.util.function.Supplier[] supplierArray56 = new java.util.function.Supplier[3];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray57 = (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) supplierArray56;
        commandLineSupplierArray57[0] = builder26;
        commandLineSupplierArray57[1] = builder49;
        commandLineSupplierArray57[2] = builder54;
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray64 = commandLine10.getParsedOptionValues(optionGroup25, commandLineSupplierArray57);
        java.lang.String[] strArray65 = commandLine10.getArgs();
        org.apache.commons.cli.Option option66 = null;
        org.apache.commons.cli.CommandLine.Builder builder67 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine68 = builder67.get();
        org.apache.commons.cli.Option option69 = null;
        java.util.function.Supplier<java.lang.String> strSupplier70 = null;
        java.lang.String str71 = commandLine68.getOptionValue(option69, strSupplier70);
        java.lang.String[] strArray72 = commandLine68.getArgs();
        org.apache.commons.cli.Option option73 = null;
        java.lang.String[] strArray74 = commandLine68.getOptionValues(option73);
        java.util.Properties[] propertiesArray76 = new java.util.Properties[] {};
        java.util.Properties[] propertiesArray77 = commandLine68.getParsedOptionValues(' ', propertiesArray76);
        java.util.Properties[] propertiesArray78 = commandLine10.getParsedOptionValues(option66, propertiesArray77);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray79 = commandLine5.getParsedOptionValue("", (java.util.Map<java.lang.Object, java.lang.Object>[]) propertiesArray77);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(commandLine5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(commandLine47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(supplierArray56);
        org.junit.Assert.assertNotNull(commandLineSupplierArray57);
        org.junit.Assert.assertNotNull(commandLineSupplierArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(commandLine68);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray74);
        org.junit.Assert.assertNotNull(propertiesArray76);
        org.junit.Assert.assertArrayEquals(propertiesArray76, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray77);
        org.junit.Assert.assertArrayEquals(propertiesArray77, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(propertiesArray78);
        org.junit.Assert.assertArrayEquals(propertiesArray78, new java.util.Properties[] {});
        org.junit.Assert.assertNotNull(objMapArray79);
        org.junit.Assert.assertArrayEquals(objMapArray79, new java.util.Properties[] {});
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test682");
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
        org.apache.commons.cli.Option option30 = null;
        java.io.Serializable[] serializableArray31 = commandLine1.getParsedOptionValues(option30);
        int int33 = commandLine1.getOptionCount("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier35 = null;
        java.lang.String str36 = commandLine1.getOptionValue("", strSupplier35);
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
        org.junit.Assert.assertNull(serializableArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test683");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.Class<?>[] wildcardClassArray10 = commandLine2.getParsedOptionValues(' ');
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        java.lang.String str13 = commandLine2.getOptionValue("hi!", strSupplier12);
        java.util.Properties properties15 = commandLine2.getOptionProperties("");
        java.lang.String str18 = commandLine2.getOptionValue('4', "");
        java.lang.String str20 = commandLine2.getOptionValue('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test684");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        org.apache.commons.cli.Option option6 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray7 = commandLine2.getParsedOptionValues(option6);
        java.util.List<java.lang.String> strList8 = commandLine2.getArgList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test685");
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
        org.apache.commons.cli.CommandLine.Builder builder18 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine19 = builder18.get();
        java.lang.constant.ConstantDesc constantDesc21 = null;
        java.lang.constant.ConstantDesc constantDesc22 = commandLine19.getParsedOptionValue('a', constantDesc21);
        java.lang.String str25 = commandLine19.getParsedOptionValue("hi!", "");
        org.apache.commons.cli.Option option26 = null;
        org.apache.commons.cli.CommandLine.Builder builder27 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer28 = null;
        org.apache.commons.cli.CommandLine.Builder builder29 = builder27.setDeprecatedHandler(optionConsumer28);
        org.apache.commons.cli.CommandLine commandLine30 = commandLine19.getParsedOptionValue(option26, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder27);
        org.apache.commons.cli.Option[] optionArray31 = commandLine19.getOptions();
        org.apache.commons.cli.CommandLine.Builder[] builderArray33 = new org.apache.commons.cli.CommandLine.Builder[] {};
        org.apache.commons.cli.CommandLine.Builder[] builderArray34 = commandLine19.getParsedOptionValues('a', builderArray33);
        java.util.function.Supplier<org.apache.commons.cli.CommandLine>[] commandLineSupplierArray35 = commandLine1.getParsedOptionValues(optionGroup17, (java.util.function.Supplier<org.apache.commons.cli.CommandLine>[]) builderArray33);
        org.apache.commons.cli.Option option36 = null;
        java.lang.String str37 = commandLine1.getOptionValue(option36);
        java.lang.String[] strArray39 = commandLine1.getOptionValues("hi!");
        java.lang.String str42 = commandLine1.getOptionValue("", "");
        org.apache.commons.cli.CommandLine.Builder builder44 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine45 = builder44.get();
        org.apache.commons.cli.CommandLine commandLine46 = builder44.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer47 = null;
        org.apache.commons.cli.CommandLine.Builder builder48 = builder44.setDeprecatedHandler(optionConsumer47);
        org.apache.commons.cli.CommandLine commandLine49 = commandLine1.getParsedOptionValue("", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder44);
        int int51 = commandLine1.getOptionCount("");
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(constantDesc22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(optionArray31);
        org.junit.Assert.assertArrayEquals(optionArray31, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(builderArray33);
        org.junit.Assert.assertArrayEquals(builderArray33, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(builderArray34);
        org.junit.Assert.assertArrayEquals(builderArray34, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNotNull(commandLineSupplierArray35);
        org.junit.Assert.assertArrayEquals(commandLineSupplierArray35, new org.apache.commons.cli.CommandLine.Builder[] {});
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test686");
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
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        boolean boolean26 = commandLine1.hasOption(optionGroup25);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test687");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String str3 = commandLine1.getOptionValue("");
        java.lang.String[] strArray5 = commandLine1.getOptionValues(' ');
        java.util.function.Supplier<java.lang.String> strSupplier7 = null;
        java.lang.String str8 = commandLine1.getOptionValue("hi!", strSupplier7);
        java.lang.String str10 = commandLine1.getOptionValue(' ');
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray12 = commandLine1.getParsedOptionValue("");
        org.apache.commons.cli.Option option13 = null;
        java.lang.reflect.Type type14 = commandLine1.getParsedOptionValue(option13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(typeDescriptorArray12);
        org.junit.Assert.assertNull(type14);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test688");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        java.lang.String str4 = commandLine1.getOptionValue(option2, strSupplier3);
        org.apache.commons.cli.OptionGroup optionGroup5 = null;
        java.lang.String str7 = commandLine1.getOptionValue(optionGroup5, "");
        java.util.List<java.lang.String> strList9 = commandLine1.getParsedOptionValue("");
        int int11 = commandLine1.getOptionCount("");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray13 = commandLine1.getParsedOptionValues("");
        java.lang.String[] strArray15 = commandLine1.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine1.getOptions();
        java.util.function.Supplier<java.lang.String> strSupplier18 = null;
        java.lang.String str19 = commandLine1.getOptionValue('a', strSupplier18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(annotatedElementArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test689");
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
        java.lang.String[] strArray16 = commandLine14.getOptionValues("hi!");
        java.lang.Object obj18 = commandLine14.getOptionObject('a');
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] {};
        java.lang.constant.Constable[][][] constableArray21 = new java.lang.constant.Constable[][][] { constableArray20 };
        java.lang.constant.Constable[][][] constableArray22 = commandLine14.getParsedOptionValues('a', constableArray21);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertArrayEquals(constableArray20, new java.lang.constant.Constable[][] {});
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray22);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test690");
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
        org.apache.commons.cli.CommandLine.Builder[] builderArray33 = commandLine1.getParsedOptionValues(' ');
        org.apache.commons.cli.OptionGroup optionGroup34 = null;
        boolean boolean35 = commandLine1.hasOption(optionGroup34);
        int int37 = commandLine1.getOptionCount("");
        java.lang.String[] strArray39 = commandLine1.getOptionValues('#');
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
        org.junit.Assert.assertNull(builderArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(strArray39);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test691");
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
        org.apache.commons.cli.OptionGroup optionGroup25 = null;
        org.apache.commons.cli.CommandLine.Builder builder26 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer27 = null;
        org.apache.commons.cli.CommandLine.Builder builder28 = builder26.setDeprecatedHandler(optionConsumer27);
        org.apache.commons.cli.CommandLine commandLine29 = builder26.build();
        org.apache.commons.cli.Option option30 = null;
        boolean boolean31 = commandLine29.hasOption(option30);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor32 = commandLine29.iterator();
        org.apache.commons.cli.CommandLine.Builder builder33 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine34 = builder33.get();
        org.apache.commons.cli.Option option35 = null;
        java.util.function.Supplier<java.lang.String> strSupplier36 = null;
        java.lang.String str37 = commandLine34.getOptionValue(option35, strSupplier36);
        org.apache.commons.cli.OptionGroup optionGroup38 = null;
        java.lang.String str40 = commandLine34.getOptionValue(optionGroup38, "");
        org.apache.commons.cli.OptionGroup optionGroup41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = commandLine34.getParsedOptionValue(optionGroup41);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor43 = commandLine34.iterator();
        java.util.Iterator[] iteratorArray45 = new java.util.Iterator[2];
        @SuppressWarnings("unchecked")
        java.util.Iterator<org.apache.commons.cli.Option>[] optionItorArray46 = (java.util.Iterator<org.apache.commons.cli.Option>[]) iteratorArray45;
        optionItorArray46[0] = optionItor32;
        optionItorArray46[1] = optionItor43;
        java.util.Iterator<org.apache.commons.cli.Option>[] optionItorArray51 = commandLine1.getParsedOptionValues(optionGroup25, optionItorArray46);
        java.util.function.Supplier<java.lang.String> strSupplier53 = null;
        java.lang.String str54 = commandLine1.getOptionValue('a', strSupplier53);
        org.apache.commons.cli.Option[][] optionArray56 = commandLine1.getParsedOptionValue('#');
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionItor32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(commandLine42);
        org.junit.Assert.assertNotNull(optionItor43);
        org.junit.Assert.assertNotNull(iteratorArray45);
        org.junit.Assert.assertNotNull(optionItorArray46);
        org.junit.Assert.assertNotNull(optionItorArray51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(optionArray56);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test692");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        java.util.Hashtable<java.lang.Object, java.lang.Object> objMap3 = commandLine1.getParsedOptionValue(option2);
        org.apache.commons.cli.OptionGroup optionGroup4 = null;
        java.util.Hashtable[] hashtableArray6 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray7 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray8 = commandLine1.getParsedOptionValues(optionGroup4, (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray6);
        boolean boolean10 = commandLine1.hasOption('a');
        boolean boolean12 = commandLine1.hasOption("");
        org.apache.commons.cli.Option option13 = null;
        java.lang.String[] strArray14 = commandLine1.getOptionValues(option13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNotNull(hashtableArray6);
        org.junit.Assert.assertArrayEquals(hashtableArray6, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray7);
        org.junit.Assert.assertArrayEquals(objMapArray7, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray8);
        org.junit.Assert.assertArrayEquals(objMapArray8, new java.util.Hashtable[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test693");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.CommandLine commandLine3 = builder0.get();
        org.apache.commons.cli.Option option4 = null;
        org.apache.commons.cli.CommandLine.Builder builder5 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine6 = builder5.get();
        org.apache.commons.cli.CommandLine commandLine7 = builder5.build();
        org.apache.commons.cli.OptionGroup optionGroup8 = null;
        java.lang.String[] strArray9 = commandLine7.getOptionValues(optionGroup8);
        java.lang.String[] strArray10 = commandLine7.getArgs();
        org.apache.commons.cli.Option option11 = null;
        java.lang.reflect.AnnotatedElement[] annotatedElementArray12 = commandLine7.getParsedOptionValues(option11);
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = commandLine7.getParsedOptionValue("");
        java.lang.String[] strArray15 = commandLine7.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder17 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine18 = builder17.get();
        org.apache.commons.cli.Option option19 = null;
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        java.lang.String str21 = commandLine18.getOptionValue(option19, strSupplier20);
        org.apache.commons.cli.Option option22 = null;
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { 10L, (short) 10, 1L, 'a', '4', (-1.0d) };
        java.lang.constant.Constable[] constableArray30 = commandLine18.getParsedOptionValues(option22, constableArray29);
        java.lang.String[] strArray32 = commandLine18.getOptionValues("");
        org.apache.commons.cli.CommandLine.Builder builder34 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine35 = builder34.get();
        org.apache.commons.cli.CommandLine.Builder builder37 = builder34.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine38 = commandLine18.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder37);
        org.apache.commons.cli.CommandLine.Builder builder40 = builder37.addArg("hi!");
        org.apache.commons.cli.CommandLine commandLine41 = commandLine7.getParsedOptionValue("hi!", (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder40);
        org.apache.commons.cli.CommandLine.Builder builder43 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine44 = builder43.get();
        java.lang.String[] strArray46 = commandLine44.getOptionValues('a');
        org.apache.commons.cli.Option option47 = null;
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray57 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray62 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray67 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray72 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[] constantDescArray77 = new java.lang.constant.ConstantDesc[] { 3, 10.0d, 0, 0.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray78 = new java.lang.constant.ConstantDesc[][] { constantDescArray52, constantDescArray57, constantDescArray62, constantDescArray67, constantDescArray72, constantDescArray77 };
        java.lang.constant.ConstantDesc[][] constantDescArray79 = commandLine44.getParsedOptionValues(option47, constantDescArray78);
        java.lang.Object[] objArray80 = commandLine41.getParsedOptionValues('#', (java.lang.Object[]) constantDescArray78);
        java.lang.Object[] objArray81 = commandLine3.getParsedOptionValue(option4, objArray80);
        int int83 = commandLine3.getOptionCount('#');
        java.util.function.Supplier<java.lang.String> strSupplier85 = null;
        java.lang.String str86 = commandLine3.getOptionValue("hi!", strSupplier85);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(commandLine3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(commandLine6);
        org.junit.Assert.assertNotNull(commandLine7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNull(annotatedElementArray12);
        org.junit.Assert.assertNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertNotNull(constantDescArray57);
        org.junit.Assert.assertNotNull(constantDescArray62);
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertNotNull(constantDescArray77);
        org.junit.Assert.assertNotNull(constantDescArray78);
        org.junit.Assert.assertNotNull(constantDescArray79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[[3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0]]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[[3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0], [3, 10.0, 0, 0.0]]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test694");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.String[] strArray3 = commandLine1.getOptionValues('a');
        org.apache.commons.cli.OptionGroup optionGroup4 = null;
        java.util.function.Supplier<java.lang.String> strSupplier5 = null;
        java.lang.String str6 = commandLine1.getOptionValue(optionGroup4, strSupplier5);
        java.lang.String[] strArray8 = commandLine1.getOptionValues('#');
        int int10 = commandLine1.getOptionCount('#');
        java.lang.String str12 = commandLine1.getOptionValue("");
        org.apache.commons.cli.OptionGroup optionGroup13 = null;
        java.lang.String str14 = commandLine1.getOptionValue(optionGroup13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test695");
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
        boolean boolean17 = commandLine1.hasOption("");
        org.apache.commons.cli.Option option18 = null;
        int int19 = commandLine1.getOptionCount(option18);
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        java.lang.String str22 = commandLine1.getOptionValue("hi!", strSupplier21);
        org.apache.commons.cli.Option option23 = null;
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        java.lang.String str25 = commandLine1.getOptionValue(option23, strSupplier24);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test696");
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
        org.apache.commons.cli.CommandLine commandLine26 = builder19.get();
        java.lang.Cloneable[] cloneableArray28 = commandLine26.getParsedOptionValues("");
        org.apache.commons.cli.Option option29 = null;
        java.util.function.Supplier<java.lang.String> strSupplier30 = null;
        java.lang.String str31 = commandLine26.getOptionValue(option29, strSupplier30);
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
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNull(cloneableArray28);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test697");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.OptionGroup optionGroup3 = null;
        java.lang.String[] strArray4 = commandLine2.getOptionValues(optionGroup3);
        java.lang.String[] strArray5 = commandLine2.getArgs();
        java.lang.Object obj8 = commandLine2.getParsedOptionValue(' ', (java.lang.Object) true);
        java.lang.Class<?>[] wildcardClassArray10 = commandLine2.getParsedOptionValues(' ');
        int int12 = commandLine2.getOptionCount("");
        java.util.Iterator<org.apache.commons.cli.Option> optionItor13 = commandLine2.iterator();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(optionItor13);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test698");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        java.lang.constant.ConstantDesc constantDesc3 = null;
        java.lang.constant.ConstantDesc constantDesc4 = commandLine1.getParsedOptionValue('a', constantDesc3);
        java.lang.String str7 = commandLine1.getParsedOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine1.getOptionObject("");
        java.lang.String[] strArray11 = commandLine1.getOptionValues('#');
        org.apache.commons.cli.OptionGroup optionGroup12 = null;
        java.lang.String str14 = commandLine1.getOptionValue(optionGroup12, "");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test699");
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
        java.lang.Object obj13 = commandLine1.getOptionObject(' ');
        java.lang.Object obj15 = commandLine1.getOptionObject("");
        org.apache.commons.cli.Option option16 = null;
        java.lang.String str17 = commandLine1.getOptionValue(option16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test700");
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
        org.apache.commons.cli.OptionGroup optionGroup15 = null;
        java.lang.String[] strArray16 = commandLine14.getOptionValues(optionGroup15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test701");
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
        java.lang.reflect.GenericDeclaration genericDeclaration25 = commandLine1.getParsedOptionValue('a');
        org.apache.commons.cli.Option[][] optionArray27 = commandLine1.getParsedOptionValues('a');
        org.apache.commons.cli.Option[] optionArray28 = commandLine1.getOptions();
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][][][] objMapArray30 = commandLine1.getParsedOptionValues("");
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
        org.junit.Assert.assertNull(genericDeclaration25);
        org.junit.Assert.assertNull(optionArray27);
        org.junit.Assert.assertNotNull(optionArray28);
        org.junit.Assert.assertArrayEquals(optionArray28, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(objMapArray30);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test702");
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
        java.util.Hashtable[] hashtableArray77 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray78 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray77;
        java.util.Hashtable[] hashtableArray80 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray81 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray80;
        java.util.Hashtable[] hashtableArray83 = new java.util.Hashtable[0];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[] objMapArray84 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[]) hashtableArray83;
        java.util.Hashtable[][] hashtableArray86 = new java.util.Hashtable[3][];
        @SuppressWarnings("unchecked")
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][] objMapArray87 = (java.util.Hashtable<java.lang.Object, java.lang.Object>[][]) hashtableArray86;
        objMapArray87[0] = hashtableArray77;
        objMapArray87[1] = objMapArray81;
        objMapArray87[2] = objMapArray84;
        java.util.Hashtable<java.lang.Object, java.lang.Object>[][] objMapArray94 = commandLine1.getParsedOptionValues(' ', objMapArray87);
        java.util.List<java.lang.String> strList95 = commandLine1.getArgList();
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
        org.junit.Assert.assertNotNull(hashtableArray77);
        org.junit.Assert.assertArrayEquals(hashtableArray77, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray78);
        org.junit.Assert.assertArrayEquals(objMapArray78, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(hashtableArray80);
        org.junit.Assert.assertArrayEquals(hashtableArray80, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray81);
        org.junit.Assert.assertArrayEquals(objMapArray81, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(hashtableArray83);
        org.junit.Assert.assertArrayEquals(hashtableArray83, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(objMapArray84);
        org.junit.Assert.assertArrayEquals(objMapArray84, new java.util.Hashtable[] {});
        org.junit.Assert.assertNotNull(hashtableArray86);
        org.junit.Assert.assertNotNull(objMapArray87);
        org.junit.Assert.assertNotNull(objMapArray94);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test703");
        org.apache.commons.cli.CommandLine.Builder builder0 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.get();
        org.apache.commons.cli.Option option2 = null;
        org.apache.commons.cli.CommandLine.Builder builder3 = builder0.addOption(option2);
        org.apache.commons.cli.CommandLine commandLine4 = builder3.get();
        org.apache.commons.cli.Option option5 = null;
        java.util.Properties properties6 = commandLine4.getOptionProperties(option5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(commandLine4);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test704");
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
        boolean boolean22 = commandLine1.hasOption("");
        org.apache.commons.cli.OptionGroup optionGroup23 = null;
        java.lang.reflect.Type type24 = commandLine1.getParsedOptionValue(optionGroup23);
        java.lang.String[] strArray25 = commandLine1.getArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(type24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test705");
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
        org.apache.commons.cli.CommandLine commandLine15 = builder8.build();
        org.apache.commons.cli.OptionGroup optionGroup16 = null;
        java.lang.String str18 = commandLine15.getOptionValue(optionGroup16, "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_010_Regression1.test706");
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
        java.lang.String str27 = commandLine1.getOptionValue('#');
        org.apache.commons.cli.OptionGroup optionGroup28 = null;
        boolean boolean29 = commandLine1.hasOption(optionGroup28);
        org.apache.commons.cli.CommandLine.Builder builder31 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine32 = builder31.get();
        java.lang.String[] strArray34 = commandLine32.getOptionValues('a');
        java.lang.String str36 = commandLine32.getOptionValue('a');
        org.apache.commons.cli.OptionGroup optionGroup37 = null;
        org.apache.commons.cli.CommandLine.Builder builder38 = org.apache.commons.cli.CommandLine.builder();
        org.apache.commons.cli.CommandLine commandLine39 = builder38.get();
        org.apache.commons.cli.Option option40 = null;
        java.util.function.Supplier<java.lang.String> strSupplier41 = null;
        java.lang.String str42 = commandLine39.getOptionValue(option40, strSupplier41);
        java.lang.String[] strArray43 = commandLine39.getArgs();
        java.lang.constant.Constable[] constableArray44 = commandLine32.getParsedOptionValues(optionGroup37, (java.lang.constant.Constable[]) strArray43);
        org.apache.commons.cli.Option option45 = null;
        boolean boolean46 = commandLine32.hasOption(option45);
        org.apache.commons.cli.CommandLine.Builder builder48 = org.apache.commons.cli.CommandLine.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer49 = null;
        org.apache.commons.cli.CommandLine.Builder builder50 = builder48.setDeprecatedHandler(optionConsumer49);
        org.apache.commons.cli.CommandLine commandLine51 = commandLine32.getParsedOptionValue(' ', (java.util.function.Supplier<org.apache.commons.cli.CommandLine>) builder50);
        org.apache.commons.cli.Option option52 = null;
        java.util.Iterator[][][] iteratorArray54 = new java.util.Iterator[0][][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<org.apache.commons.cli.Option>[][][] optionItorArray55 = (java.util.Iterator<org.apache.commons.cli.Option>[][][]) iteratorArray54;
        java.util.Iterator<org.apache.commons.cli.Option>[][][] optionItorArray56 = commandLine51.getParsedOptionValues(option52, optionItorArray55);
        java.util.Iterator<org.apache.commons.cli.Option>[][][] optionItorArray57 = commandLine1.getParsedOptionValue("hi!", optionItorArray55);
        org.apache.commons.cli.Option option58 = null;
        java.lang.String str60 = commandLine1.getOptionValue(option58, "");
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertArrayEquals(constableArray44, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(iteratorArray54);
        org.junit.Assert.assertArrayEquals(iteratorArray54, new java.util.Iterator[][][] {});
        org.junit.Assert.assertNotNull(optionItorArray55);
        org.junit.Assert.assertArrayEquals(optionItorArray55, new java.util.Iterator[][][] {});
        org.junit.Assert.assertNotNull(optionItorArray56);
        org.junit.Assert.assertArrayEquals(optionItorArray56, new java.util.Iterator[][][] {});
        org.junit.Assert.assertNotNull(optionItorArray57);
        org.junit.Assert.assertArrayEquals(optionItorArray57, new java.util.Iterator[][][] {});
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }
}

