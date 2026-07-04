import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_032_Regression4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2001");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.build();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser17.parse(options18, strArray21, properties22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2002");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.DefaultParser defaultParser12 = builder10.build();
        java.lang.Class<?> wildcardClass13 = defaultParser12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2003");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setDeprecatedHandler(optionConsumer13);
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2004");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.build();
        org.apache.commons.cli.DefaultParser defaultParser14 = builder10.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(defaultParser14);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2005");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser7.parse(options8, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2006");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2007");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser11.parse(options12, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2008");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2009");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder3.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2010");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder11.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder15.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer18 = null;
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder17.setDeprecatedHandler(optionConsumer18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2011");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder12.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser16.parse(options17, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2012");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser7.parse(options8, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2013");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser13.parse(options14, strArray21, properties22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2014");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2015");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder9.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options14, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2016");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass17 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2017");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder4.get();
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser13.parse(options14, properties15, nonOptionAction16, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2018");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.get();
        org.apache.commons.cli.DefaultParser defaultParser11 = builder9.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser11.parse(options12, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2019");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.build();
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder16.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser20 = builder19.build();
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.util.Properties properties27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine28 = defaultParser20.parse(options21, strArray26, properties27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(defaultParser20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2020");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer12 = null;
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setDeprecatedHandler(optionConsumer12);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2021");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder12.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer16 = null;
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder15.setDeprecatedHandler(optionConsumer16);
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder15.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2022");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.build();
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder16.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder21 = builder16.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder23 = builder21.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer24 = null;
        org.apache.commons.cli.DefaultParser.Builder builder25 = builder23.setDeprecatedHandler(optionConsumer24);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2023");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder12.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2024");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setDeprecatedHandler(optionConsumer10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2025");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder9.get();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser12.parse(options13, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2026");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser8 = builder6.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser11.parse(options12, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2027");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.get();
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder12.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer17 = null;
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder15.setDeprecatedHandler(optionConsumer17);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer19 = null;
        org.apache.commons.cli.DefaultParser.Builder builder20 = builder18.setDeprecatedHandler(optionConsumer19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2028");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser6.parse(options7, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2029");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser11.parse(options12, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2030");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder0.get();
        org.apache.commons.cli.Options options9 = null;
        java.util.Properties properties10 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction11 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser8.parse(options9, properties10, nonOptionAction11, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertTrue("'" + nonOptionAction11 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction11.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2031");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser8 = builder6.get();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser8.parse(options9, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2032");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2033");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2034");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.build();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser17.parse(options18, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2035");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.apache.commons.cli.DefaultParser defaultParser9 = builder7.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2036");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2037");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2038");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder13.get();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser14.parse(options15, strArray21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(defaultParser14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2039");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setDeprecatedHandler(optionConsumer13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2040");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser7.parse(options8, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2041");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder2.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser7.parse(options8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "", "", "", "" });
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2042");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder20 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser21 = builder20.build();
        org.apache.commons.cli.DefaultParser defaultParser22 = builder20.build();
        org.apache.commons.cli.DefaultParser.Builder builder24 = builder20.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder26 = builder20.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser27 = builder20.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(defaultParser21);
        org.junit.Assert.assertNotNull(defaultParser22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(defaultParser27);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2043");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser4.parse(options5, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2044");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setDeprecatedHandler(optionConsumer13);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder14.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder16.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser19 = builder16.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(defaultParser19);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2045");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setDeprecatedHandler(optionConsumer13);
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2046");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder0.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder7.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder7.setDeprecatedHandler(optionConsumer10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2047");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer16 = null;
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder13.setDeprecatedHandler(optionConsumer16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2048");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser13.parse(options14, properties15, nonOptionAction16, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "", "", "" });
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2049");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder13.get();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser14.parse(options15, strArray22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(defaultParser14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2050");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.DefaultParser defaultParser12 = builder10.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(defaultParser12);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2051");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder8.get();
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder8.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer16 = null;
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder15.setDeprecatedHandler(optionConsumer16);
        org.apache.commons.cli.DefaultParser defaultParser18 = builder15.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(defaultParser18);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2052");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2053");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder13.get();
        java.lang.Class<?> wildcardClass15 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(defaultParser14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2054");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser13.parse(options14, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2055");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser3.parse(options4, strArray9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2056");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2057");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder6.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder6.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2058");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder12.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2059");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2060");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder2.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder2.setDeprecatedHandler(optionConsumer13);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder14.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder16.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2061");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setDeprecatedHandler(optionConsumer10);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer12 = null;
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setDeprecatedHandler(optionConsumer12);
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2062");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder9.get();
        java.lang.Class<?> wildcardClass13 = defaultParser12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2063");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder0.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder0.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser10.parse(options11, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2064");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder6.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer20 = null;
        org.apache.commons.cli.DefaultParser.Builder builder21 = builder6.setDeprecatedHandler(optionConsumer20);
        org.apache.commons.cli.DefaultParser defaultParser22 = builder21.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer23 = null;
        org.apache.commons.cli.DefaultParser.Builder builder24 = builder21.setDeprecatedHandler(optionConsumer23);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(defaultParser22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2065");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder6.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.get();
        org.apache.commons.cli.Options options17 = null;
        java.util.Properties properties18 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction19 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser16.parse(options17, properties18, nonOptionAction19, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertTrue("'" + nonOptionAction19 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction19.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2066");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2067");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder8.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setDeprecatedHandler(optionConsumer13);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder12.build();
        org.apache.commons.cli.DefaultParser defaultParser16 = builder12.get();
        org.apache.commons.cli.DefaultParser defaultParser17 = builder12.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertNotNull(defaultParser17);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2068");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser10.parse(options11, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2069");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder5.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(defaultParser7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2070");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2071");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2072");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder14.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer17 = null;
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder14.setDeprecatedHandler(optionConsumer17);
        org.apache.commons.cli.DefaultParser defaultParser19 = builder18.build();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser19.parse(options20, strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(defaultParser19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2073");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser9.parse(options10, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2074");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder13.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(defaultParser14);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_032_Regression4.test2075");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder14.get();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser15.parse(options16, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }
}

